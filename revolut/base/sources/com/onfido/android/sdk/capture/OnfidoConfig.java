package com.onfido.android.sdk.capture;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import ch.qos.logback.core.util.a;
import cl.c;
import cl.h;
import com.onfido.android.sdk.FlowConfig;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventListener;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventResultReceiver;
import com.onfido.android.sdk.capture.config.MediaCallback;
import com.onfido.android.sdk.capture.config.MediaCallbackResultReceiver;
import com.onfido.android.sdk.capture.document.GenericDocument;
import com.onfido.android.sdk.capture.errors.DuplicatedFaceCaptureVariantException;
import com.onfido.android.sdk.capture.errors.DuplicatedFlowStepException;
import com.onfido.android.sdk.capture.errors.EnterpriseFeatureNotEnabledException;
import com.onfido.android.sdk.capture.errors.EnterpriseFeatureWithoutSDKTokenException;
import com.onfido.android.sdk.capture.errors.EnterpriseFeaturesConflictingException;
import com.onfido.android.sdk.capture.errors.EnterpriseFeaturesInvalidLogoCobrandingException;
import com.onfido.android.sdk.capture.errors.InvalidDocumentTypeException;
import com.onfido.android.sdk.capture.errors.MissingTokenException;
import com.onfido.android.sdk.capture.errors.MultipleTokenException;
import com.onfido.android.sdk.capture.flow.FlowValidation;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.token.TokenExpirationHandler;
import com.onfido.android.sdk.capture.token.TokenExpirationHandlerService;
import com.onfido.android.sdk.capture.ui.options.BaseOptions;
import com.onfido.android.sdk.capture.ui.options.CaptureScreenOptions;
import com.onfido.android.sdk.capture.ui.options.CaptureScreenStep;
import com.onfido.android.sdk.capture.ui.options.FlowAction;
import com.onfido.android.sdk.capture.ui.options.FlowStep;
import com.onfido.android.sdk.capture.utils.checker.Validator;
import com.onfido.api.client.exception.EnterpriseFeaturesNotAuthorizedException;
import com.onfido.api.client.token.Token;
import com.onfido.api.client.token.sdk.TokenEnterpriseFeatures;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 K2\u00020\u0001:\u0002JKBÓ\u0001\b\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010#J\t\u0010C\u001a\u00020!HÖ\u0001J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0016J\u0019\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020!HÖ\u0001R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0016\u0010\r\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\"\u001a\u0004\u0018\u00010!X\u0096\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0092\u0004¢\u0006\u0004\n\u0002\u00102R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0018\u0010 \u001a\u0004\u0018\u00010!X\u0096\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b4\u0010*R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u0010\u0012\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010B¨\u0006L"}, d2 = {"Lcom/onfido/android/sdk/capture/OnfidoConfig;", "Landroid/os/Parcelable;", "flowSteps", "", "Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "token", "Lcom/onfido/api/client/token/Token;", "locale", "Ljava/util/Locale;", "tokenExpirationHandlerEnabled", "", "mediaCallback", "Landroid/os/ResultReceiver;", "biometricTokenCallback", "onfidoAnalyticsEventListener", "exitWhenSentToBackground", "apiCertificatePinningPKHashes", "", "manualLivenessCapture", "workflowConfig", "Lcom/onfido/android/sdk/FlowConfig;", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions;", "documentTypes", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "genericDocuments", "Lcom/onfido/android/sdk/capture/document/GenericDocument;", "enterpriseFeatures", "Lcom/onfido/android/sdk/capture/EnterpriseFeatures;", "theme", "Lcom/onfido/android/sdk/capture/OnfidoTheme;", "lightThemeResId", "", "darkThemeResId", "([Lcom/onfido/android/sdk/capture/ui/options/FlowStep;Lcom/onfido/api/client/token/Token;Ljava/util/Locale;ZLandroid/os/ResultReceiver;Landroid/os/ResultReceiver;Landroid/os/ResultReceiver;Z[Ljava/lang/String;ZLcom/onfido/android/sdk/FlowConfig;Lcom/onfido/android/sdk/capture/model/NFCOptions;Ljava/util/List;Ljava/util/List;Lcom/onfido/android/sdk/capture/EnterpriseFeatures;Lcom/onfido/android/sdk/capture/OnfidoTheme;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getApiCertificatePinningPKHashes", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getBiometricTokenCallback", "()Landroid/os/ResultReceiver;", "getDarkThemeResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDocumentTypes", "()Ljava/util/List;", "getEnterpriseFeatures", "()Lcom/onfido/android/sdk/capture/EnterpriseFeatures;", "getExitWhenSentToBackground", "()Z", "[Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "getGenericDocuments", "getLightThemeResId", "getLocale", "()Ljava/util/Locale;", "getManualLivenessCapture", "getMediaCallback", "getNfcOptions", "()Lcom/onfido/android/sdk/capture/model/NFCOptions;", "getOnfidoAnalyticsEventListener", "getTheme", "()Lcom/onfido/android/sdk/capture/OnfidoTheme;", "getToken", "()Lcom/onfido/api/client/token/Token;", "getTokenExpirationHandlerEnabled", "getWorkflowConfig", "()Lcom/onfido/android/sdk/FlowConfig;", "describeContents", "getFlowSteps", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class OnfidoConfig implements Parcelable {
    private final String[] apiCertificatePinningPKHashes;
    private final ResultReceiver biometricTokenCallback;
    private final Integer darkThemeResId;

    @NotNull
    private final List<DocumentType> documentTypes;
    private final EnterpriseFeatures enterpriseFeatures;
    private final boolean exitWhenSentToBackground;
    private final FlowStep[] flowSteps;

    @NotNull
    private final List<GenericDocument> genericDocuments;
    private final Integer lightThemeResId;
    private final Locale locale;
    private final boolean manualLivenessCapture;
    private final ResultReceiver mediaCallback;

    @NotNull
    private final NFCOptions nfcOptions;
    private final ResultReceiver onfidoAnalyticsEventListener;

    @NotNull
    private final OnfidoTheme theme;

    @NotNull
    private final Token token;
    private final boolean tokenExpirationHandlerEnabled;
    private final FlowConfig workflowConfig;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<OnfidoConfig> CREATOR = new Creator();

    @NotNull
    private static final List<DocumentType> ALLOWED_DOCUMENT_TYPES = v.k(DocumentType.PASSPORT, DocumentType.RESIDENCE_PERMIT, DocumentType.NATIONAL_IDENTITY_CARD, DocumentType.DRIVING_LICENCE);

    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010%\u001a\u00020&J\u0006\u0010\u000e\u001a\u00020\u0000J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u001dH\u0002J\u001b\u0010*\u001a\u00020\u000f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H\u0002¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020(H\u0002J\u001b\u0010.\u001a\u00020(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H\u0002¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020(H\u0002J\b\u00101\u001a\u00020(H\u0002J\u0014\u00102\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u000205J\u001b\u00106\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u00107J\u0019\u00108\u001a\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006¢\u0006\u0002\u00109J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010;\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\fJ\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000fJ\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020?J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u001aJ\u001c\u0010B\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00072\n\b\u0002\u0010C\u001a\u0004\u0018\u00010DH\u0007J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010F\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$H\u0007J\f\u0010G\u001a\u00020\u000f*\u00020\u001dH\u0002R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/onfido/android/sdk/capture/OnfidoConfig$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "apiCertificatePinningPKHashes", "", "", "[Ljava/lang/String;", "biometricTokenCallback", "Landroid/os/ResultReceiver;", "documentTypes", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "exitWhenSentToBackground", "", "flowStepsWithOptions", "Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "[Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "genericDocuments", "Lcom/onfido/android/sdk/capture/document/GenericDocument;", "locale", "Ljava/util/Locale;", "manualLivenessCapture", "mediaCallback", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions;", "onfidoAnalyticsEventListener", "requestedEnterpriseFeatures", "Lcom/onfido/android/sdk/capture/EnterpriseFeatures;", "theme", "Lcom/onfido/android/sdk/capture/OnfidoTheme;", "token", "Lcom/onfido/api/client/token/Token;", "tokenExpirationHandlerEnabled", "workflowConfig", "Lcom/onfido/android/sdk/FlowConfig;", "build", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "validateConfigEnterpriseFeatures", "", "requestedFeatures", "validateDocumentType", "steps", "([Lcom/onfido/android/sdk/capture/ui/options/FlowStep;)Z", "validateDocumentTypes", "validateFlowSteps", "([Lcom/onfido/android/sdk/capture/ui/options/FlowStep;)V", "validateGenericDocuments", "validateParams", "withAllowedDocumentTypes", "withAnalyticsEventListener", "eventListener", "Lcom/onfido/android/sdk/capture/analytics/OnfidoAnalyticsEventListener;", "withCertificatePinning", "([Ljava/lang/String;)Lcom/onfido/android/sdk/capture/OnfidoConfig$Builder;", "withCustomFlow", "([Lcom/onfido/android/sdk/capture/ui/options/FlowStep;)Lcom/onfido/android/sdk/capture/OnfidoConfig$Builder;", "withEnterpriseFeatures", "withGenericDocuments", "withLocale", "withManualLivenessCapture", "withMediaCallback", "Lcom/onfido/android/sdk/capture/config/MediaCallback;", "withNFC", "option", "withSDKToken", "tokenExpirationHandler", "Lcom/onfido/android/sdk/capture/token/TokenExpirationHandler;", "withTheme", "withWorkflowConfig", "isCobrandingLogoModeEnabled", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private String[] apiCertificatePinningPKHashes;
        private ResultReceiver biometricTokenCallback;

        @NotNull
        private final Context context;

        @NotNull
        private List<? extends DocumentType> documentTypes;
        private boolean exitWhenSentToBackground;
        private FlowStep[] flowStepsWithOptions;

        @NotNull
        private List<GenericDocument> genericDocuments;
        private Locale locale;
        private boolean manualLivenessCapture;
        private ResultReceiver mediaCallback;
        private NFCOptions nfcOptions;
        private ResultReceiver onfidoAnalyticsEventListener;
        private EnterpriseFeatures requestedEnterpriseFeatures;

        @NotNull
        private OnfidoTheme theme;
        private Token token;
        private boolean tokenExpirationHandlerEnabled;
        private FlowConfig workflowConfig;

        public Builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            f0 f0Var = f0.f322471a;
            this.documentTypes = f0Var;
            this.genericDocuments = f0Var;
            this.theme = OnfidoTheme.AUTOMATIC;
        }

        private final boolean isCobrandingLogoModeEnabled(EnterpriseFeatures enterpriseFeatures) {
            return (enterpriseFeatures.getCobrandingLogoLightMode() == null && enterpriseFeatures.getCobrandingLogoDarkMode() == null) ? false : true;
        }

        private final void validateConfigEnterpriseFeatures(EnterpriseFeatures requestedFeatures) {
            String cobrandingText;
            if (requestedFeatures == null && this.mediaCallback == null) {
                return;
            }
            Validator validator = Validator.INSTANCE;
            Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$validateConfigEnterpriseFeatures$1(this), new EnterpriseFeatureWithoutSDKTokenException())}, false, 2, null);
            Token token = this.token;
            if (token == null) {
                Intrinsics.r("token");
                throw null;
            }
            try {
                JSONObject jSONObject = new JSONObject(s.e(((c) token).f50152a));
                if (!jSONObject.has("enterprise_features")) {
                    throw new EnterpriseFeaturesNotAuthorizedException();
                }
                h hVar = TokenEnterpriseFeatures.Companion;
                String string = jSONObject.getJSONObject("enterprise_features").toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                hVar.getClass();
                TokenEnterpriseFeatures tokenEnterpriseFeaturesA = h.a(string);
                if (this.mediaCallback != null) {
                    Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$validateConfigEnterpriseFeatures$2(tokenEnterpriseFeaturesA), new EnterpriseFeatureNotEnabledException("useCustomizedApiRequests"))}, false, 2, null);
                }
                if (requestedFeatures == null) {
                    return;
                }
                if (isCobrandingLogoModeEnabled(requestedFeatures) && (cobrandingText = requestedFeatures.getCobrandingText()) != null && cobrandingText.length() != 0) {
                    throw new EnterpriseFeaturesConflictingException("logoCobrand", "cobrand");
                }
                if (requestedFeatures.getHideOnfidoLogo()) {
                    Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$validateConfigEnterpriseFeatures$3(tokenEnterpriseFeaturesA), new EnterpriseFeatureNotEnabledException("hideOnfidoLogo"))}, false, 2, null);
                }
                if (requestedFeatures.getDisableMobileSdkAnalytics()) {
                    Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$validateConfigEnterpriseFeatures$4(tokenEnterpriseFeaturesA), new EnterpriseFeatureNotEnabledException("disableMobileSdkAnalytics"))}, false, 2, null);
                }
                String cobrandingText2 = requestedFeatures.getCobrandingText();
                if (cobrandingText2 != null && cobrandingText2.length() != 0) {
                    Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$validateConfigEnterpriseFeatures$5(tokenEnterpriseFeaturesA), new EnterpriseFeatureNotEnabledException("cobrand"))}, false, 2, null);
                }
                if (isCobrandingLogoModeEnabled(requestedFeatures)) {
                    if (requestedFeatures.getCobrandingLogoLightMode() == null || requestedFeatures.getCobrandingLogoDarkMode() == null) {
                        throw new EnterpriseFeaturesInvalidLogoCobrandingException();
                    }
                    Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$validateConfigEnterpriseFeatures$6(tokenEnterpriseFeaturesA), new EnterpriseFeatureNotEnabledException("logoCobrand"))}, false, 2, null);
                }
            } catch (JSONException unused) {
                throw new EnterpriseFeaturesNotAuthorizedException();
            }
        }

        private final boolean validateDocumentType(FlowStep[] steps) {
            for (FlowStep flowStep : steps) {
                if (flowStep.getAction() == FlowAction.CAPTURE_DOCUMENT && (flowStep instanceof CaptureScreenStep)) {
                    BaseOptions options = flowStep.getOptions();
                    CaptureScreenOptions captureScreenOptions = options instanceof CaptureScreenOptions ? (CaptureScreenOptions) options : null;
                    if ((captureScreenOptions != null ? captureScreenOptions.getDocumentType() : null) == DocumentType.UNKNOWN) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final void validateDocumentTypes() {
            if (this.documentTypes.isEmpty()) {
                return;
            }
            List<? extends DocumentType> list = this.documentTypes;
            List list2 = OnfidoConfig.ALLOWED_DOCUMENT_TYPES;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                if (!list2.contains((DocumentType) it8.next())) {
                    throw new IllegalArgumentException(("Document Types list should be non-empty subset of " + OnfidoConfig.ALLOWED_DOCUMENT_TYPES).toString());
                }
            }
        }

        private final void validateFlowSteps(FlowStep[] steps) {
            ArrayList arrayList = new ArrayList(steps.length);
            for (FlowStep flowStep : steps) {
                arrayList.add(flowStep.getAction());
            }
            boolean z = !FlowValidation.INSTANCE.containsDifferentFaceCaptureVariants(arrayList);
            boolean z3 = d0.U(arrayList).size() == steps.length;
            boolean zValidateDocumentType = validateDocumentType(steps);
            Validator validator = Validator.INSTANCE;
            Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$validateFlowSteps$1(z3), new DuplicatedFlowStepException())}, false, 2, null);
            Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$validateFlowSteps$2(z), new DuplicatedFaceCaptureVariantException())}, false, 2, null);
            Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$validateFlowSteps$3(zValidateDocumentType), new InvalidDocumentTypeException())}, false, 2, null);
        }

        private final void validateGenericDocuments() {
            if (this.genericDocuments.isEmpty()) {
                return;
            }
            List<GenericDocument> list = this.genericDocuments;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                if (((GenericDocument) it8.next()).getDocumentTitle().length() <= 0) {
                    throw new IllegalArgumentException("The Generic documents list must not contain documents with empty titles");
                }
            }
        }

        private final void validateParams() {
            Validator validator = Validator.INSTANCE;
            Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$validateParams$1(this), new MissingTokenException())}, false, 2, null);
            validateDocumentTypes();
            validateGenericDocuments();
        }

        public static /* synthetic */ Builder withSDKToken$default(Builder builder, String str, TokenExpirationHandler tokenExpirationHandler, int i, Object obj2) {
            if ((i & 2) != 0) {
                tokenExpirationHandler = null;
            }
            return builder.withSDKToken(str, tokenExpirationHandler);
        }

        @NotNull
        public final OnfidoConfig build() {
            validateParams();
            validateConfigEnterpriseFeatures(this.requestedEnterpriseFeatures);
            FlowStep[] flowStepArr = this.flowStepsWithOptions;
            Token token = this.token;
            if (token == null) {
                Intrinsics.r("token");
                throw null;
            }
            Locale locale = this.locale;
            boolean z = this.tokenExpirationHandlerEnabled;
            boolean z3 = this.exitWhenSentToBackground;
            String[] strArr = this.apiCertificatePinningPKHashes;
            boolean z4 = this.manualLivenessCapture;
            FlowConfig flowConfig = this.workflowConfig;
            List<? extends DocumentType> list = this.documentTypes;
            List<GenericDocument> list2 = this.genericDocuments;
            ResultReceiver resultReceiver = this.mediaCallback;
            ResultReceiver resultReceiver2 = this.biometricTokenCallback;
            ResultReceiver resultReceiver3 = this.onfidoAnalyticsEventListener;
            NFCOptions nFCOptions = this.nfcOptions;
            if (nFCOptions == null) {
                nFCOptions = NFCOptions.Enabled.Optional.INSTANCE;
            }
            return new OnfidoConfig(flowStepArr, token, locale, z, resultReceiver, resultReceiver2, resultReceiver3, z3, strArr, z4, flowConfig, nFCOptions, list, list2, this.requestedEnterpriseFeatures, this.theme, null, null, 196608, null);
        }

        @NotNull
        public final Builder exitWhenSentToBackground() {
            this.exitWhenSentToBackground = true;
            return this;
        }

        @NotNull
        public final Builder withAllowedDocumentTypes(@NotNull List<? extends DocumentType> documentTypes) {
            Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
            this.documentTypes = documentTypes;
            return this;
        }

        @NotNull
        public final Builder withAnalyticsEventListener(@NotNull OnfidoAnalyticsEventListener eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.onfidoAnalyticsEventListener = new OnfidoAnalyticsEventResultReceiver(eventListener);
            return this;
        }

        @NotNull
        public final Builder withCertificatePinning(String[] apiCertificatePinningPKHashes) {
            this.apiCertificatePinningPKHashes = apiCertificatePinningPKHashes;
            return this;
        }

        @NotNull
        public final Builder withCustomFlow(@NotNull FlowStep[] steps) {
            Intrinsics.checkNotNullParameter(steps, "steps");
            validateFlowSteps(steps);
            this.flowStepsWithOptions = steps;
            return this;
        }

        @NotNull
        public final Builder withEnterpriseFeatures(@NotNull EnterpriseFeatures requestedEnterpriseFeatures) {
            Intrinsics.checkNotNullParameter(requestedEnterpriseFeatures, "requestedEnterpriseFeatures");
            this.requestedEnterpriseFeatures = requestedEnterpriseFeatures;
            return this;
        }

        @NotNull
        public final Builder withGenericDocuments(@NotNull List<GenericDocument> genericDocuments) {
            Intrinsics.checkNotNullParameter(genericDocuments, "genericDocuments");
            this.genericDocuments = d0.U(genericDocuments);
            return this;
        }

        @NotNull
        public final Builder withLocale(@NotNull Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.locale = locale;
            return this;
        }

        @NotNull
        public final Builder withManualLivenessCapture(boolean manualLivenessCapture) {
            this.manualLivenessCapture = manualLivenessCapture;
            return this;
        }

        @NotNull
        public final Builder withMediaCallback(@NotNull MediaCallback mediaCallback) {
            Intrinsics.checkNotNullParameter(mediaCallback, "mediaCallback");
            this.mediaCallback = new MediaCallbackResultReceiver(mediaCallback);
            return this;
        }

        @NotNull
        public final Builder withNFC(@NotNull NFCOptions option) {
            Intrinsics.checkNotNullParameter(option, "option");
            this.nfcOptions = option;
            return this;
        }

        @NotNull
        public final Builder withSDKToken(@NotNull String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return withSDKToken$default(this, token, null, 2, null);
        }

        @NotNull
        public final Builder withTheme(@NotNull OnfidoTheme theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.theme = theme;
            return this;
        }

        @InternalOnfidoApi
        @NotNull
        public final Builder withWorkflowConfig(@NotNull FlowConfig workflowConfig) {
            Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
            this.workflowConfig = workflowConfig;
            this.biometricTokenCallback = workflowConfig.getBiometricTokenCallback();
            this.mediaCallback = workflowConfig.getMediaCallback();
            this.onfidoAnalyticsEventListener = workflowConfig.getOnfidoAnalyticsEventListener();
            this.tokenExpirationHandlerEnabled = workflowConfig.getTokenExpirationHandlerEnabled();
            return this;
        }

        @NotNull
        public final Builder withSDKToken(@NotNull String token, TokenExpirationHandler tokenExpirationHandler) {
            Intrinsics.checkNotNullParameter(token, "token");
            Validator validator = Validator.INSTANCE;
            Validator.validate$default(validator, this, new Pair[]{validator.orThrow(new OnfidoConfig$Builder$withSDKToken$1(this), new MultipleTokenException())}, false, 2, null);
            this.token = new c(token, this.context.getPackageName());
            TokenExpirationHandlerService.INSTANCE.setTokenExpirationHandler(tokenExpirationHandler);
            this.tokenExpirationHandlerEnabled = tokenExpirationHandler != null;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/OnfidoConfig$Companion;", "", "()V", "ALLOWED_DOCUMENT_TYPES", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "builder", "Lcom/onfido/android/sdk/capture/OnfidoConfig$Builder;", "context", "Landroid/content/Context;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Builder(context);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnfidoConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnfidoConfig createFromParcel(@NotNull Parcel parcel) {
            FlowStep[] flowStepArr;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iC = 0;
            if (parcel.readInt() == 0) {
                flowStepArr = null;
            } else {
                int i = parcel.readInt();
                FlowStep[] flowStepArr2 = new FlowStep[i];
                for (int i2 = 0; i2 != i; i2++) {
                    flowStepArr2[i2] = parcel.readSerializable();
                }
                flowStepArr = flowStepArr2;
            }
            Token token = (Token) parcel.readSerializable();
            Locale locale = (Locale) parcel.readSerializable();
            boolean z = parcel.readInt() != 0;
            ResultReceiver resultReceiver = (ResultReceiver) parcel.readParcelable(OnfidoConfig.class.getClassLoader());
            ResultReceiver resultReceiver2 = (ResultReceiver) parcel.readParcelable(OnfidoConfig.class.getClassLoader());
            ResultReceiver resultReceiver3 = (ResultReceiver) parcel.readParcelable(OnfidoConfig.class.getClassLoader());
            boolean z3 = parcel.readInt() != 0;
            String[] strArrCreateStringArray = parcel.createStringArray();
            boolean z4 = parcel.readInt() != 0;
            FlowConfig flowConfig = (FlowConfig) parcel.readParcelable(OnfidoConfig.class.getClassLoader());
            NFCOptions nFCOptions = (NFCOptions) parcel.readParcelable(OnfidoConfig.class.getClassLoader());
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                arrayList.add(DocumentType.valueOf(parcel.readString()));
            }
            int i6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i6);
            while (iC != i6) {
                iC = a.c(parcel, arrayList2, iC, 1);
            }
            return new OnfidoConfig(flowStepArr, token, locale, z, resultReceiver, resultReceiver2, resultReceiver3, z3, strArrCreateStringArray, z4, flowConfig, nFCOptions, arrayList, arrayList2, parcel.readInt() == 0 ? null : EnterpriseFeatures.CREATOR.createFromParcel(parcel), OnfidoTheme.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnfidoConfig[] newArray(int i) {
            return new OnfidoConfig[i];
        }
    }

    public /* synthetic */ OnfidoConfig(FlowStep[] flowStepArr, Token token, Locale locale, boolean z, ResultReceiver resultReceiver, ResultReceiver resultReceiver2, ResultReceiver resultReceiver3, boolean z3, String[] strArr, boolean z4, FlowConfig flowConfig, NFCOptions nFCOptions, List list, List list2, EnterpriseFeatures enterpriseFeatures, OnfidoTheme onfidoTheme, Integer num, Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
        this(flowStepArr, token, locale, z, resultReceiver, resultReceiver2, resultReceiver3, z3, strArr, z4, flowConfig, nFCOptions, list, list2, enterpriseFeatures, onfidoTheme, num, num2);
    }

    @NotNull
    public static final Builder builder(@NotNull Context context) {
        return INSTANCE.builder(context);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String[] getApiCertificatePinningPKHashes() {
        return this.apiCertificatePinningPKHashes;
    }

    public ResultReceiver getBiometricTokenCallback() {
        return this.biometricTokenCallback;
    }

    public Integer getDarkThemeResId() {
        return this.darkThemeResId;
    }

    @NotNull
    public List<DocumentType> getDocumentTypes() {
        return this.documentTypes;
    }

    public EnterpriseFeatures getEnterpriseFeatures() {
        return this.enterpriseFeatures;
    }

    public boolean getExitWhenSentToBackground() {
        return this.exitWhenSentToBackground;
    }

    @NotNull
    public List<FlowStep> getFlowSteps() {
        List<FlowStep> listV0;
        FlowStep[] flowStepArr = this.flowSteps;
        return (flowStepArr == null || (listV0 = d.v0(flowStepArr)) == null) ? FlowStep.INSTANCE.getDefaultFlow() : listV0;
    }

    @NotNull
    public List<GenericDocument> getGenericDocuments() {
        return this.genericDocuments;
    }

    public Integer getLightThemeResId() {
        return this.lightThemeResId;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public boolean getManualLivenessCapture() {
        return this.manualLivenessCapture;
    }

    public ResultReceiver getMediaCallback() {
        return this.mediaCallback;
    }

    @NotNull
    public NFCOptions getNfcOptions() {
        return this.nfcOptions;
    }

    public ResultReceiver getOnfidoAnalyticsEventListener() {
        return this.onfidoAnalyticsEventListener;
    }

    @NotNull
    public OnfidoTheme getTheme() {
        return this.theme;
    }

    @NotNull
    public Token getToken() {
        return this.token;
    }

    public boolean getTokenExpirationHandlerEnabled() {
        return this.tokenExpirationHandlerEnabled;
    }

    public FlowConfig getWorkflowConfig() {
        return this.workflowConfig;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        FlowStep[] flowStepArr = this.flowSteps;
        if (flowStepArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int length = flowStepArr.length;
            parcel.writeInt(length);
            for (int i = 0; i != length; i++) {
                parcel.writeSerializable(flowStepArr[i]);
            }
        }
        parcel.writeSerializable(this.token);
        parcel.writeSerializable(this.locale);
        parcel.writeInt(this.tokenExpirationHandlerEnabled ? 1 : 0);
        parcel.writeParcelable(this.mediaCallback, flags);
        parcel.writeParcelable(this.biometricTokenCallback, flags);
        parcel.writeParcelable(this.onfidoAnalyticsEventListener, flags);
        parcel.writeInt(this.exitWhenSentToBackground ? 1 : 0);
        parcel.writeStringArray(this.apiCertificatePinningPKHashes);
        parcel.writeInt(this.manualLivenessCapture ? 1 : 0);
        parcel.writeParcelable(this.workflowConfig, flags);
        parcel.writeParcelable(this.nfcOptions, flags);
        Iterator itV = p.a.v(this.documentTypes, parcel);
        while (itV.hasNext()) {
            parcel.writeString(((DocumentType) itV.next()).name());
        }
        Iterator itV2 = p.a.v(this.genericDocuments, parcel);
        while (itV2.hasNext()) {
            parcel.writeSerializable((Serializable) itV2.next());
        }
        EnterpriseFeatures enterpriseFeatures = this.enterpriseFeatures;
        if (enterpriseFeatures == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            enterpriseFeatures.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.theme.name());
        Integer num = this.lightThemeResId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            p.a.B(parcel, 1, num);
        }
        Integer num2 = this.darkThemeResId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            p.a.B(parcel, 1, num2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OnfidoConfig(FlowStep[] flowStepArr, Token token, Locale locale, boolean z, ResultReceiver resultReceiver, ResultReceiver resultReceiver2, ResultReceiver resultReceiver3, boolean z3, String[] strArr, boolean z4, FlowConfig flowConfig, NFCOptions nFCOptions, List<? extends DocumentType> list, List<GenericDocument> list2, EnterpriseFeatures enterpriseFeatures, OnfidoTheme onfidoTheme, Integer num, Integer num2) {
        this.flowSteps = flowStepArr;
        this.token = token;
        this.locale = locale;
        this.tokenExpirationHandlerEnabled = z;
        this.mediaCallback = resultReceiver;
        this.biometricTokenCallback = resultReceiver2;
        this.onfidoAnalyticsEventListener = resultReceiver3;
        this.exitWhenSentToBackground = z3;
        this.apiCertificatePinningPKHashes = strArr;
        this.manualLivenessCapture = z4;
        this.workflowConfig = flowConfig;
        this.nfcOptions = nFCOptions;
        this.documentTypes = list;
        this.genericDocuments = list2;
        this.enterpriseFeatures = enterpriseFeatures;
        this.theme = onfidoTheme;
        this.lightThemeResId = num;
        this.darkThemeResId = num2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public OnfidoConfig(com.onfido.android.sdk.capture.ui.options.FlowStep[] r22, com.onfido.api.client.token.Token r23, java.util.Locale r24, boolean r25, android.os.ResultReceiver r26, android.os.ResultReceiver r27, android.os.ResultReceiver r28, boolean r29, java.lang.String[] r30, boolean r31, com.onfido.android.sdk.FlowConfig r32, com.onfido.android.sdk.capture.model.NFCOptions r33, java.util.List r34, java.util.List r35, com.onfido.android.sdk.capture.EnterpriseFeatures r36, com.onfido.android.sdk.capture.OnfidoTheme r37, java.lang.Integer r38, java.lang.Integer r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r21 = this;
            r0 = r40
            r1 = r0 & 8
            if (r1 == 0) goto L9
            r1 = 0
            r6 = r1
            goto Lb
        L9:
            r6 = r25
        Lb:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L13
            com.onfido.android.sdk.capture.model.NFCOptions$Enabled$Optional r1 = com.onfido.android.sdk.capture.model.NFCOptions.Enabled.Optional.INSTANCE
            r14 = r1
            goto L15
        L13:
            r14 = r33
        L15:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L1d
            zhm.f0 r1 = zhm.f0.f322471a
            r15 = r1
            goto L1f
        L1d:
            r15 = r34
        L1f:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L28
            zhm.f0 r1 = zhm.f0.f322471a
            r16 = r1
            goto L2a
        L28:
            r16 = r35
        L2a:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r2 = 0
            if (r1 == 0) goto L32
            r17 = r2
            goto L34
        L32:
            r17 = r36
        L34:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L3f
            com.onfido.android.sdk.capture.OnfidoTheme r1 = com.onfido.android.sdk.capture.OnfidoTheme.AUTOMATIC
            r18 = r1
            goto L41
        L3f:
            r18 = r37
        L41:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L49
            r19 = r2
            goto L4b
        L49:
            r19 = r38
        L4b:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L69
            r20 = r2
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r2 = r21
            goto L81
        L69:
            r20 = r39
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
        L81:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.OnfidoConfig.<init>(com.onfido.android.sdk.capture.ui.options.FlowStep[], com.onfido.api.client.token.Token, java.util.Locale, boolean, android.os.ResultReceiver, android.os.ResultReceiver, android.os.ResultReceiver, boolean, java.lang.String[], boolean, com.onfido.android.sdk.FlowConfig, com.onfido.android.sdk.capture.model.NFCOptions, java.util.List, java.util.List, com.onfido.android.sdk.capture.EnterpriseFeatures, com.onfido.android.sdk.capture.OnfidoTheme, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
