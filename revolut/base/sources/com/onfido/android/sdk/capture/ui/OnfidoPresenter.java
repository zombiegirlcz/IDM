package com.onfido.android.sdk.capture.ui;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.ExitCode;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.common.permissions.PermissionResult;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.document.DocumentPages;
import com.onfido.android.sdk.capture.errors.OnfidoException;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.FlowStepDirection;
import com.onfido.android.sdk.capture.flow.FlowValidation;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.onfido.android.sdk.capture.internal.navigation.NavigationManager;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.internal.navigation.navigator.NavigationManagerHolder;
import com.onfido.android.sdk.capture.internal.navigation.screens.DocumentSelectionScreen;
import com.onfido.android.sdk.capture.internal.navigation.screens.EmptyScreen;
import com.onfido.android.sdk.capture.internal.navigation.screens.WelcomeScreen;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.nfc.ShouldLaunchNfcFlowUseCase;
import com.onfido.android.sdk.capture.internal.nfc.data.NfcPassportExtraction;
import com.onfido.android.sdk.capture.internal.performance.domain.PerformanceAnalyticsScreen;
import com.onfido.android.sdk.capture.internal.performance.trackers.ScreenLoadTracker;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.util.logging.RemoteLoggerTree;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.model.NFCOptionsKt;
import com.onfido.android.sdk.capture.ui.OnfidoPresenterInitializer;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.exception.CameraException;
import com.onfido.android.sdk.capture.ui.camera.exception.InvalidCertificateException;
import com.onfido.android.sdk.capture.ui.camera.exception.TokenExpiredException;
import com.onfido.android.sdk.capture.ui.camera.face.FaceCaptureVariant;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationOptions;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import com.onfido.android.sdk.capture.ui.documentintro.AddressPageIntroScreen;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostFragment;
import com.onfido.android.sdk.capture.ui.nfc.NfcDataRepository;
import com.onfido.android.sdk.capture.ui.nfc.NfcHostFragment;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.ui.options.BaseOptions;
import com.onfido.android.sdk.capture.ui.options.CaptureScreenOptions;
import com.onfido.android.sdk.capture.ui.options.FlowAction;
import com.onfido.android.sdk.capture.ui.options.FlowStep;
import com.onfido.android.sdk.capture.ui.options.MessageScreenOptions;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.android.sdk.capture.ui.options.PhotoCaptureVariantOptions;
import com.onfido.android.sdk.capture.ui.options.VideoCaptureVariantOptions;
import com.onfido.android.sdk.capture.ui.options.WelcomeScreenOptions;
import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment;
import com.onfido.android.sdk.capture.ui.userconsent.UserConsentFragment;
import com.onfido.android.sdk.capture.upload.Captures;
import com.onfido.android.sdk.capture.upload.Document;
import com.onfido.android.sdk.capture.upload.DocumentSide;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.upload.Face;
import com.onfido.android.sdk.capture.upload.ProofOfAddress;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.DeviceUtils;
import com.onfido.android.sdk.capture.utils.ListExtensionsKt;
import com.onfido.android.sdk.capture.utils.OnfidoConfigExtensionsKt;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.capture.utils.Visibility;
import com.onfido.api.client.data.DocSide;
import com.onfido.api.client.data.DocumentMediaUploadResponse;
import com.onfido.hosted.web.module.model.ClassicModuleInfo;
import com.onfido.hosted.web.module.model.HostedWebModuleCancelled;
import com.onfido.hosted.web.module.model.HostedWebModuleExit;
import com.onfido.hosted.web.module.model.HostedWebModuleFailed;
import com.onfido.hosted.web.module.model.HostedWebModuleModuleInfo;
import com.onfido.hosted.web.module.model.HostedWebModuleResult;
import com.onfido.hosted.web.module.model.HostedWebModuleSuccess;
import com.onfido.hosted.web.module.model.ProofOfAddressCaptureSDKOutput;
import igm.g;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import kotlinx.serialization.SerializationException;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import rlm.o;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000ì\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0010\u0018\u00002\u00020\u0001:\u0006\u0092\u0002\u0093\u0002\u0094\u0002B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0001\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\b\u0010V\u001a\u00020WH\u0012J\r\u0010X\u001a\u00020WH\u0010¢\u0006\u0002\bYJ(\u0010Z\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u0001022\b\u0010[\u001a\u0004\u0018\u00010\\2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010]\u001a\u00020W2\b\u0010^\u001a\u0004\u0018\u00010_H\u0016J\u0012\u0010`\u001a\u0004\u0018\u00010.2\u0006\u0010a\u001a\u00020*H\u0012J\u0010\u0010b\u001a\u00020J2\u0006\u0010c\u001a\u00020dH\u0012J\b\u0010e\u001a\u00020fH\u0012J!\u0010g\u001a\u00020W2\b\b\u0002\u0010h\u001a\u00020$2\b\b\u0002\u0010i\u001a\u00020$H\u0010¢\u0006\u0002\bjJ\u0010\u0010k\u001a\u00020W2\u0006\u0010l\u001a\u00020$H\u0012J\u0010\u0010m\u001a\u00020W2\u0006\u0010l\u001a\u00020$H\u0012J\u001c\u0010n\u001a\u00020W2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020W0pH\u0012J\b\u0010r\u001a\u00020$H\u0012J\b\u0010s\u001a\u00020$H\u0012J\b\u0010t\u001a\u00020$H\u0012J\u0012\u0010u\u001a\u00020W2\b\u00101\u001a\u0004\u0018\u000102H\u0012J \u0010v\u001a\u00020W2\u0006\u0010w\u001a\u00020.2\u0006\u0010x\u001a\u00020y2\u0006\u0010-\u001a\u00020.H\u0012J\"\u0010z\u001a\u00020W2\b\u0010{\u001a\u0004\u0018\u00010|2\u0006\u0010x\u001a\u00020y2\u0006\u0010-\u001a\u00020.H\u0012J\u0018\u0010}\u001a\u00020W2\u0006\u0010~\u001a\u00020\u007f2\u0006\u0010x\u001a\u00020yH\u0012J\u0013\u0010\u0080\u0001\u001a\u00020$2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0012J\t\u0010\u0083\u0001\u001a\u00020WH\u0016J\t\u0010\u0084\u0001\u001a\u00020WH\u0016J\u0019\u0010\u0085\u0001\u001a\u00020W2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0010¢\u0006\u0003\b\u0088\u0001J\u000f\u0010\u0089\u0001\u001a\u00020WH\u0010¢\u0006\u0003\b\u008a\u0001J\u0018\u0010\u008b\u0001\u001a\u00020W2\r\u0010\u008c\u0001\u001a\b0\u008d\u0001j\u0003`\u008e\u0001H\u0012J\u0018\u0010\u008f\u0001\u001a\u00020W2\u0007\u0010\u0090\u0001\u001a\u00020JH\u0010¢\u0006\u0003\b\u0091\u0001J\u001d\u0010\u0092\u0001\u001a\u00020W2\b\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0016J\u000f\u0010\u0097\u0001\u001a\u00020WH\u0010¢\u0006\u0003\b\u0098\u0001J\u0013\u0010\u0099\u0001\u001a\u00020W2\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0016J#\u0010\u009c\u0001\u001a\u00020W2\b\u0010\u0081\u0001\u001a\u00030\u009d\u00012\b\u0010A\u001a\u0004\u0018\u00010BH\u0010¢\u0006\u0003\b\u009e\u0001J6\u0010\u009f\u0001\u001a\u00020W2\u0007\u0010 \u0001\u001a\u0002022\u0006\u0010'\u001a\u00020(2\n\u0010¡\u0001\u001a\u0005\u0018\u00010¢\u00012\b\u0010[\u001a\u0004\u0018\u00010\\H\u0010¢\u0006\u0003\b£\u0001J\u0013\u0010¤\u0001\u001a\u00020W2\b\u00101\u001a\u0004\u0018\u000102H\u0012J\u0013\u0010¥\u0001\u001a\u00020W2\b\u0010¦\u0001\u001a\u00030¢\u0001H\u0016J\u0013\u0010§\u0001\u001a\u00020W2\b\u0010\u009a\u0001\u001a\u00030¨\u0001H\u0016J\t\u0010©\u0001\u001a\u00020WH\u0012J\u000f\u0010ª\u0001\u001a\u00020WH\u0010¢\u0006\u0003\b«\u0001J\u000f\u0010¬\u0001\u001a\u00020WH\u0010¢\u0006\u0003\b\u00ad\u0001J\u0013\u0010®\u0001\u001a\u00020W2\b\u0010\u009a\u0001\u001a\u00030¯\u0001H\u0016J\u0019\u0010°\u0001\u001a\u00020W2\b\u0010\u009a\u0001\u001a\u00030±\u0001H\u0010¢\u0006\u0003\b²\u0001J\u0019\u0010³\u0001\u001a\u00020W2\b\u0010´\u0001\u001a\u00030µ\u0001H\u0010¢\u0006\u0003\b¶\u0001J3\u0010·\u0001\u001a\u00020W2\f\b\u0002\u0010¸\u0001\u001a\u0005\u0018\u00010¹\u00012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\b\u0010º\u0001\u001a\u00030¹\u0001H\u0010¢\u0006\u0003\b»\u0001J\u0019\u0010¼\u0001\u001a\u00020W2\b\u0010½\u0001\u001a\u00030¾\u0001H\u0010¢\u0006\u0003\b¿\u0001J\u001d\u0010À\u0001\u001a\u00020W2\b\u0010Á\u0001\u001a\u00030Â\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0012J\u0019\u0010Ã\u0001\u001a\u00020W2\b\u0010Ä\u0001\u001a\u00030Å\u0001H\u0010¢\u0006\u0003\bÆ\u0001J\t\u0010Ç\u0001\u001a\u00020WH\u0012J\t\u0010È\u0001\u001a\u00020WH\u0012J\u0012\u0010É\u0001\u001a\u00020W2\u0007\u0010Ê\u0001\u001a\u00020JH\u0012J\u0019\u0010Ë\u0001\u001a\u00020W2\b\u0010Ì\u0001\u001a\u00030Í\u0001H\u0010¢\u0006\u0003\bÎ\u0001J\u0019\u0010Ï\u0001\u001a\u00020W2\b\u0010\u009a\u0001\u001a\u00030Ð\u0001H\u0010¢\u0006\u0003\bÑ\u0001J\u0013\u0010Ò\u0001\u001a\u00020W2\b\u0010Ó\u0001\u001a\u00030Ô\u0001H\u0016J\u0019\u0010Õ\u0001\u001a\u00020W2\b\u0010Ö\u0001\u001a\u00030×\u0001H\u0010¢\u0006\u0003\bØ\u0001J\u0013\u0010Ù\u0001\u001a\u00020W2\b\u0010´\u0001\u001a\u00030µ\u0001H\u0012J\u0019\u0010Ú\u0001\u001a\u00020W2\b\u0010Û\u0001\u001a\u00030Ü\u0001H\u0010¢\u0006\u0003\bÝ\u0001J\t\u0010Þ\u0001\u001a\u00020WH\u0016J\u0019\u0010ß\u0001\u001a\u00020W2\b\u0010\u009a\u0001\u001a\u00030à\u0001H\u0010¢\u0006\u0003\bá\u0001J$\u0010â\u0001\u001a\u00020W2\u0007\u0010ã\u0001\u001a\u00020$2\u0007\u0010ä\u0001\u001a\u00020J2\u0007\u0010å\u0001\u001a\u00020fH\u0012J\"\u0010æ\u0001\u001a\u00020W2\r\u0010ç\u0001\u001a\b\u0012\u0004\u0012\u00020.062\b\u0010c\u001a\u0004\u0018\u00010|H\u0012J&\u0010è\u0001\u001a\b\u0012\u0004\u0012\u00020.062\u0006\u0010l\u001a\u00020$2\r\u00105\u001a\t\u0012\u0004\u0012\u00020.0é\u0001H\u0012J\"\u0010ê\u0001\u001a\u00020W2\r\u0010ç\u0001\u001a\b\u0012\u0004\u0012\u00020.062\b\u0010c\u001a\u0004\u0018\u00010|H\u0012J\"\u0010ë\u0001\u001a\u00020W2\r\u0010ç\u0001\u001a\b\u0012\u0004\u0012\u00020.062\b\u0010{\u001a\u0004\u0018\u00010|H\u0012J\u000f\u0010ì\u0001\u001a\u00020WH\u0010¢\u0006\u0003\bí\u0001J\u0010\u0010î\u0001\u001a\t\u0012\u0004\u0012\u00020.0é\u0001H\u0012J\u000f\u0010ï\u0001\u001a\u00020WH\u0010¢\u0006\u0003\bð\u0001J\t\u0010ñ\u0001\u001a\u00020WH\u0012J\u0011\u0010ò\u0001\u001a\u00020W2\u0006\u0010a\u001a\u00020*H\u0012J\u0012\u0010ó\u0001\u001a\u00020W2\u0007\u0010ô\u0001\u001a\u000204H\u0012J\u001d\u0010õ\u0001\u001a\u00020W2\b\u0010ö\u0001\u001a\u00030¢\u00012\b\u0010÷\u0001\u001a\u00030ø\u0001H\u0016J#\u0010ù\u0001\u001a\u00020W2\u0006\u0010T\u001a\u00020U2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010LH\u0010¢\u0006\u0003\bú\u0001J\t\u0010û\u0001\u001a\u00020$H\u0012J\u0013\u0010ü\u0001\u001a\u00020$2\b\u0010c\u001a\u0004\u0018\u00010|H\u0012J\u0013\u0010ý\u0001\u001a\u00020$2\b\u0010c\u001a\u0004\u0018\u00010|H\u0012J+\u0010þ\u0001\u001a\u00020W2\u0007\u0010ã\u0001\u001a\u00020$2\u0007\u0010ä\u0001\u001a\u00020J2\b\u0010ÿ\u0001\u001a\u00030¹\u0001H\u0010¢\u0006\u0003\b\u0080\u0002J#\u0010\u0081\u0002\u001a\u00020W2\b\u0010{\u001a\u0004\u0018\u00010|2\u0006\u0010x\u001a\u00020y2\u0006\u0010-\u001a\u00020.H\u0012J!\u0010\u0082\u0002\u001a\u00020W2\u0006\u0010c\u001a\u00020d2\u0006\u0010x\u001a\u00020y2\u0006\u0010-\u001a\u00020.H\u0012J\u0019\u0010\u0083\u0002\u001a\u00020W2\u0006\u0010x\u001a\u00020y2\u0006\u0010-\u001a\u00020.H\u0012J\t\u0010\u0084\u0002\u001a\u00020WH\u0012J\u0019\u0010\u0085\u0002\u001a\u00020W2\u0006\u0010x\u001a\u00020y2\u0006\u0010-\u001a\u00020.H\u0012J\u0019\u0010\u0086\u0002\u001a\u00020W2\u0006\u0010x\u001a\u00020y2\u0006\u0010-\u001a\u00020.H\u0012J\u0011\u0010\u0087\u0002\u001a\u00020W2\u0006\u0010x\u001a\u00020yH\u0012J\u001b\u0010\u0088\u0002\u001a\u00020W2\b\u0010{\u001a\u0004\u0018\u00010|2\u0006\u0010x\u001a\u00020yH\u0012J\u0019\u0010\u0089\u0002\u001a\u00020W2\u0006\u0010w\u001a\u00020.2\u0006\u0010x\u001a\u00020yH\u0012J\u001b\u0010\u008a\u0002\u001a\u00020W2\b\u0010{\u001a\u0004\u0018\u00010|2\u0006\u0010x\u001a\u00020yH\u0012J\u001a\u0010\u008b\u0002\u001a\u00020W2\u0007\u0010ä\u0001\u001a\u00020J2\u0006\u0010x\u001a\u00020yH\u0012J\u0019\u0010\u008c\u0002\u001a\u00020W2\u0006\u0010{\u001a\u00020|2\u0006\u0010x\u001a\u00020yH\u0012J\t\u0010\u008d\u0002\u001a\u00020WH\u0012J\t\u0010\u008e\u0002\u001a\u00020WH\u0012J\u0011\u0010\u008f\u0002\u001a\u00020W2\u0006\u0010i\u001a\u00020$H\u0012J\u000f\u0010\u0090\u0002\u001a\u00020$H\u0010¢\u0006\u0003\b\u0091\u0002R\u000e\u0010#\u001a\u00020$X\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0092\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0092\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020*8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u000e\u0010\u0018\u001a\u00020\u0019X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0092\u000e¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020.06X\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u000208X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020<X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u000e\u0010\u0010\u001a\u00020\u0011X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0092.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0092\u0004¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0092\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0092\u0004¢\u0006\u0002\n\u0000R$\u0010M\u001a\u00020L2\u0006\u0010K\u001a\u00020L8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u000e\u0010R\u001a\u00020SX\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX\u0092.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0095\u0002"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenter;", "Lcom/onfido/android/sdk/capture/ui/NfcDataServiceListener;", "flowTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;", "livenessTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessTracker;", "screenLoadTracker", "Lcom/onfido/android/sdk/capture/internal/performance/trackers/ScreenLoadTracker;", "nfcTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;", "runtimePermissionsManager", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "documentConfigurationManager", "Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;", "onfidoPresenterInitializer", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer;", "nfcDataRepository", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcDataRepository;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "remoteLoggerTree", "Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree;", "deviceUtils", "Lcom/onfido/android/sdk/capture/utils/DeviceUtils;", "waitingScreenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "nfcInteractor", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "shouldLaunchNfcFlowUseCase", "Lcom/onfido/android/sdk/capture/internal/nfc/ShouldLaunchNfcFlowUseCase;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessTracker;Lcom/onfido/android/sdk/capture/internal/performance/trackers/ScreenLoadTracker;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer;Lcom/onfido/android/sdk/capture/ui/nfc/NfcDataRepository;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree;Lcom/onfido/android/sdk/capture/utils/DeviceUtils;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;Lcom/onfido/android/sdk/capture/internal/nfc/ShouldLaunchNfcFlowUseCase;Lcom/onfido/android/sdk/capture/OnfidoConfig;)V", "awaitingPermissions", "", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "currentAction", "Lcom/onfido/android/sdk/capture/ui/options/FlowAction;", "getCurrentAction", "()Lcom/onfido/android/sdk/capture/ui/options/FlowAction;", "currentStep", "Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "getCurrentStep", "()Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "flowIndex", "", "flowSteps", "", "navigationManagerHolder", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "getNavigationManagerHolder", "()Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "navigator", "Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "getNavigator", "()Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "nfcDataService", "Lcom/onfido/android/sdk/capture/ui/NfcDataService;", "nfcProperties", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "getOnfidoConfig$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/OnfidoConfig;", "onfidoNavigation", "Lcom/onfido/android/sdk/capture/internal/navigation/OnfidoNavigation;", "orchestrationUserConsentVisibility", "Lcom/onfido/android/sdk/capture/utils/Visibility;", "pendingAddressPageCaptureBundle", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "value", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenter$State;", "state", "getState$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/OnfidoPresenter$State;", "setState$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/OnfidoPresenter$State;)V", "uploadResult", "Lcom/onfido/android/sdk/capture/upload/Captures;", "view", "Lcom/onfido/android/sdk/capture/ui/OnfidoView;", "addLoggerTree", "", "appendNfcFeature", "appendNfcFeature$onfido_capture_sdk_core_release", "backSideCaptureNeeded", "genericDocumentPages", "Lcom/onfido/android/sdk/capture/document/DocumentPages;", "cleanFiles", "directory", "Ljava/io/File;", "findFlowStep", "flowAction", "getCaptureBundle", "options", "Lcom/onfido/android/sdk/capture/ui/options/CaptureScreenOptions;", "getNfcArguments", "Lcom/onfido/android/sdk/capture/flow/NfcArguments;", "initFlow", "isRestoringState", "isSystemDarkModeEnabled", "initFlow$onfido_capture_sdk_core_release", "initFlowSteps", "shouldAskForConsent", "initOrchestrationFlow", "initializeSdk", "action", "Lkotlin/Function1;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Success;", "isDeviceNotSupported", "isOnlyOneDocAvailable", "isVideoAvailableOnConfirmationScreen", "launchFaceCapture", "moveTo", "step", "flowStepDirection", "Lcom/onfido/android/sdk/capture/flow/FlowStepDirection;", "moveToDocumentCaptureOrPermissions", "baseOptions", "Lcom/onfido/android/sdk/capture/ui/options/BaseOptions;", "navigateTo", ib.b.Screen, "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "needToCaptureBackOfDocument", "documentResult", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult$Completed;", "nextAction", "onAddressPageIntroContinue", "onAvcHostResult", "avcHostResult", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult;", "onAvcHostResult$onfido_capture_sdk_core_release", "onBackPressed", "onBackPressed$onfido_capture_sdk_core_release", "onCaptureException", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onCaptureWithoutPermissions", "captureData", "onCaptureWithoutPermissions$onfido_capture_sdk_core_release", "onDataUploaded", "documentMediaUpload", "Lcom/onfido/api/client/data/DocumentMediaUploadResponse;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "onDocumentCaptureBackPressed", "onDocumentCaptureBackPressed$onfido_capture_sdk_core_release", "onDocumentCaptureResult", "result", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult;", "onDocumentCaptured", "Lcom/onfido/android/sdk/capture/upload/DocumentSide;", "onDocumentCaptured$onfido_capture_sdk_core_release", "onDocumentTypeSelected", "docType", "genericDocumentTitle", "", "onDocumentTypeSelected$onfido_capture_sdk_core_release", "onFaceCapturePermissionGranted", "onFaceCaptured", "faceId", "onFaceSelfieCaptureResult", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureScreen$SelfieCaptureResult;", "onFaceVideoPermissionGranted", "onFlowCompleted", "onFlowCompleted$onfido_capture_sdk_core_release", "onFlowExited", "onFlowExited$onfido_capture_sdk_core_release", "onLivenessCaptureResult", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessCaptureScreen$LivenessCaptureResult;", "onLivenessConfirmationResultReceived", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult;", "onLivenessConfirmationResultReceived$onfido_capture_sdk_core_release", "onMotionCaptured", "videoResult", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "onMotionCaptured$onfido_capture_sdk_core_release", "onNavigationStarted", "origin", "Lcom/onfido/android/sdk/capture/internal/performance/domain/PerformanceAnalyticsScreen;", "destination", "onNavigationStarted$onfido_capture_sdk_core_release", "onNfcHostResult", "nfcHostResult", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult;", "onNfcHostResult$onfido_capture_sdk_core_release", "onNfcScanSucceeded", "nfcData", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "onPermissionResult", "permissionResult", "Lcom/onfido/android/sdk/capture/common/permissions/PermissionResult;", "onPermissionResult$onfido_capture_sdk_core_release", "onPermissionScreenBackPressedAfterDocSelection", "onPermissionScreenDismissed", "onPermissionsGranted", "captureDataBundle", "onPoaResult", "poaResult", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult;", "onPoaResult$onfido_capture_sdk_core_release", "onRestrictedDocumentSelectionResult", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult;", "onRestrictedDocumentSelectionResult$onfido_capture_sdk_core_release", "onUploadError", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "onUserConsentResult", "userConsentResult", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult;", "onUserConsentResult$onfido_capture_sdk_core_release", "onVideoCaptured", "onViewStarted", "navigationManager", "Lcom/onfido/android/sdk/capture/internal/navigation/NavigationManager;", "onViewStarted$onfido_capture_sdk_core_release", "onViewStopped", "onWebPoaResult", "Lcom/onfido/hosted/web/module/model/HostedWebModuleResult;", "onWebPoaResult$onfido_capture_sdk_core_release", "openNewDocumentCapture", "isFrontSide", "captureBundle", "nfcArguments", "prepareFaceSteps", "modifiedSteps", "prepareFlowSteps", "", "prepareLivenessSteps", "prepareMotionSteps", "previousAction", "previousAction$onfido_capture_sdk_core_release", "previousSteps", "removeLoggerTree", "removeLoggerTree$onfido_capture_sdk_core_release", "removeNfcStep", "removeStep", "setActionWithIndex", "newIndex", "setLivenessVideoOptions", "videoPath", "livenessPerformedChallenges", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "setup", "setup$onfido_capture_sdk_core_release", "shouldShowDocumentSelection", "shouldShowFaceCaptureIntro", "shouldShowLivenessIntroVideo", "showCaptureStep", "currentScreen", "showCaptureStep$onfido_capture_sdk_core_release", "showDocumentCapture", "showDocumentCaptureOrPermissionsScreen", "showDocumentTypeSelection", "showEmptyScreen", "showFaceSelfieCapture", "showFaceSelfieIntro", "showLivenessCapture", "showLivenessCaptureConfirmation", "showLivenessIntro", "showMessageScreen", "showPermissionsScreen", "showWelcomeScreen", "skipNfcScanStep", "startFlow", "trackFlowInitiatedEvents", "useLocalBackNavigation", "useLocalBackNavigation$onfido_capture_sdk_core_release", "Factory", "PresenterAssistedFactory", "State", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class OnfidoPresenter implements NfcDataServiceListener {
    private boolean awaitingPermissions;

    @NotNull
    private final CompositeDisposable compositeDisposable;
    private CountryCode countryCode;

    @NotNull
    private final DeviceUtils deviceUtils;

    @NotNull
    private final DocumentConfigurationManager documentConfigurationManager;
    private DocumentType documentType;
    private int flowIndex;

    @NotNull
    private List<FlowStep> flowSteps;

    @NotNull
    private final FlowTracker flowTracker;

    @NotNull
    private final LivenessTracker livenessTracker;

    @NotNull
    private final NavigationManagerHolder navigationManagerHolder;

    @NotNull
    private final Navigator navigator;

    @NotNull
    private final NfcDataRepository nfcDataRepository;
    private NfcDataService nfcDataService;

    @NotNull
    private final NfcInteractor nfcInteractor;
    private NfcProperties nfcProperties;

    @NotNull
    private final NfcTracker nfcTracker;

    @NotNull
    private final OnfidoConfig onfidoConfig;

    @NotNull
    private final OnfidoNavigation onfidoNavigation;

    @NotNull
    private final OnfidoPresenterInitializer onfidoPresenterInitializer;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;

    @NotNull
    private Visibility orchestrationUserConsentVisibility;
    private CaptureStepDataBundle pendingAddressPageCaptureBundle;

    @NotNull
    private final RemoteLoggerTree remoteLoggerTree;

    @NotNull
    private final RuntimePermissionsManager runtimePermissionsManager;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final ScreenLoadTracker screenLoadTracker;

    @NotNull
    private final ShouldLaunchNfcFlowUseCase shouldLaunchNfcFlowUseCase;

    @NotNull
    private Captures uploadResult;
    private OnfidoView view;

    @NotNull
    private final WaitingScreenTracker waitingScreenTracker;

    @InternalOnfidoApi
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenter$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenter;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        OnfidoPresenter create(@NotNull OnfidoConfig onfidoConfig);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bá\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenter$PresenterAssistedFactory;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenter$Factory;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PresenterAssistedFactory extends Factory {
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenter$State;", "Landroid/os/Parcelable;", "flowSteps", "", "Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "flowIndex", "", "captures", "Lcom/onfido/android/sdk/capture/upload/Captures;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "nfcProperties", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "(Ljava/util/List;ILcom/onfido/android/sdk/capture/upload/Captures;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;)V", "getCaptures", "()Lcom/onfido/android/sdk/capture/upload/Captures;", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "getFlowIndex", "()I", "getFlowSteps", "()Ljava/util/List;", "getNfcProperties", "()Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        @NotNull
        private final Captures captures;
        private final CountryCode countryCode;
        private final DocumentType documentType;
        private final int flowIndex;

        @NotNull
        private final List<FlowStep> flowSteps;
        private final NfcProperties nfcProperties;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final State createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new State(arrayList, parcel.readInt(), (Captures) parcel.readSerializable(), parcel.readInt() == 0 ? null : DocumentType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CountryCode.valueOf(parcel.readString()), parcel.readInt() != 0 ? NfcProperties.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(@NotNull List<? extends FlowStep> flowSteps, int i, @NotNull Captures captures, DocumentType documentType, CountryCode countryCode, NfcProperties nfcProperties) {
            Intrinsics.checkNotNullParameter(flowSteps, "flowSteps");
            Intrinsics.checkNotNullParameter(captures, "captures");
            this.flowSteps = flowSteps;
            this.flowIndex = i;
            this.captures = captures;
            this.documentType = documentType;
            this.countryCode = countryCode;
            this.nfcProperties = nfcProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, List list, int i, Captures captures, DocumentType documentType, CountryCode countryCode, NfcProperties nfcProperties, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                list = state.flowSteps;
            }
            if ((i2 & 2) != 0) {
                i = state.flowIndex;
            }
            if ((i2 & 4) != 0) {
                captures = state.captures;
            }
            if ((i2 & 8) != 0) {
                documentType = state.documentType;
            }
            if ((i2 & 16) != 0) {
                countryCode = state.countryCode;
            }
            if ((i2 & 32) != 0) {
                nfcProperties = state.nfcProperties;
            }
            CountryCode countryCode2 = countryCode;
            NfcProperties nfcProperties2 = nfcProperties;
            return state.copy(list, i, captures, documentType, countryCode2, nfcProperties2);
        }

        @NotNull
        public final List<FlowStep> component1() {
            return this.flowSteps;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getFlowIndex() {
            return this.flowIndex;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Captures getCaptures() {
            return this.captures;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final DocumentType getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final NfcProperties getNfcProperties() {
            return this.nfcProperties;
        }

        @NotNull
        public final State copy(@NotNull List<? extends FlowStep> flowSteps, int flowIndex, @NotNull Captures captures, DocumentType documentType, CountryCode countryCode, NfcProperties nfcProperties) {
            Intrinsics.checkNotNullParameter(flowSteps, "flowSteps");
            Intrinsics.checkNotNullParameter(captures, "captures");
            return new State(flowSteps, flowIndex, captures, documentType, countryCode, nfcProperties);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.f(this.flowSteps, state.flowSteps) && this.flowIndex == state.flowIndex && Intrinsics.f(this.captures, state.captures) && this.documentType == state.documentType && this.countryCode == state.countryCode && Intrinsics.f(this.nfcProperties, state.nfcProperties);
        }

        @NotNull
        public final Captures getCaptures() {
            return this.captures;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final DocumentType getDocumentType() {
            return this.documentType;
        }

        public final int getFlowIndex() {
            return this.flowIndex;
        }

        @NotNull
        public final List<FlowStep> getFlowSteps() {
            return this.flowSteps;
        }

        public final NfcProperties getNfcProperties() {
            return this.nfcProperties;
        }

        public int hashCode() {
            int iHashCode = (this.captures.hashCode() + j6.a.b(this.flowIndex, this.flowSteps.hashCode() * 31, 31)) * 31;
            DocumentType documentType = this.documentType;
            int iHashCode2 = (iHashCode + (documentType == null ? 0 : documentType.hashCode())) * 31;
            CountryCode countryCode = this.countryCode;
            int iHashCode3 = (iHashCode2 + (countryCode == null ? 0 : countryCode.hashCode())) * 31;
            NfcProperties nfcProperties = this.nfcProperties;
            return iHashCode3 + (nfcProperties != null ? nfcProperties.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "State(flowSteps=" + this.flowSteps + ", flowIndex=" + this.flowIndex + ", captures=" + this.captures + ", documentType=" + this.documentType + ", countryCode=" + this.countryCode + ", nfcProperties=" + this.nfcProperties + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            Iterator itV = p.a.v(this.flowSteps, parcel);
            while (itV.hasNext()) {
                parcel.writeSerializable((Serializable) itV.next());
            }
            parcel.writeInt(this.flowIndex);
            parcel.writeSerializable(this.captures);
            DocumentType documentType = this.documentType;
            if (documentType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(documentType.name());
            }
            CountryCode countryCode = this.countryCode;
            if (countryCode == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(countryCode.name());
            }
            NfcProperties nfcProperties = this.nfcProperties;
            if (nfcProperties == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                nfcProperties.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ State(List list, int i, Captures captures, DocumentType documentType, CountryCode countryCode, NfcProperties nfcProperties, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, i, captures, (i2 & 8) != 0 ? null : documentType, (i2 & 16) != 0 ? null : countryCode, (i2 & 32) != 0 ? null : nfcProperties);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FlowAction.values().length];
            try {
                iArr[FlowAction.ACTIVE_VIDEO_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowAction.CAPTURE_LIVENESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowAction.CAPTURE_FACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowAction.WELCOME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FlowAction.PROOF_OF_ADDRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FlowAction.CAPTURE_DOCUMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FlowAction.USER_CONSENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FlowAction.INTRO_FACE_CAPTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FlowAction.INTRO_LIVENESS_CAPTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FlowAction.CAPTURE_LIVENESS_CONFIRMATION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FlowAction.MESSAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FlowAction.NFC_HOST_FEATURE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FlowAction.FINAL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[FlowAction.DYNAMIC_CONTENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CaptureType.values().length];
            try {
                iArr2[CaptureType.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CaptureType.FACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CaptureType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OnfidoPresenter(@NotNull FlowTracker flowTracker, @NotNull LivenessTracker livenessTracker, @NotNull ScreenLoadTracker screenLoadTracker, @NotNull NfcTracker nfcTracker, @NotNull RuntimePermissionsManager runtimePermissionsManager, @NotNull DocumentConfigurationManager documentConfigurationManager, @NotNull OnfidoPresenterInitializer onfidoPresenterInitializer, @NotNull NfcDataRepository nfcDataRepository, @NotNull SchedulersProvider schedulersProvider, @NotNull OnfidoRemoteConfig onfidoRemoteConfig, @NotNull RemoteLoggerTree remoteLoggerTree, @NotNull DeviceUtils deviceUtils, @NotNull WaitingScreenTracker waitingScreenTracker, @NotNull NfcInteractor nfcInteractor, @NotNull ShouldLaunchNfcFlowUseCase shouldLaunchNfcFlowUseCase, @NotNull OnfidoConfig onfidoConfig) {
        Intrinsics.checkNotNullParameter(flowTracker, "flowTracker");
        Intrinsics.checkNotNullParameter(livenessTracker, "livenessTracker");
        Intrinsics.checkNotNullParameter(screenLoadTracker, "screenLoadTracker");
        Intrinsics.checkNotNullParameter(nfcTracker, "nfcTracker");
        Intrinsics.checkNotNullParameter(runtimePermissionsManager, "runtimePermissionsManager");
        Intrinsics.checkNotNullParameter(documentConfigurationManager, "documentConfigurationManager");
        Intrinsics.checkNotNullParameter(onfidoPresenterInitializer, "onfidoPresenterInitializer");
        Intrinsics.checkNotNullParameter(nfcDataRepository, "nfcDataRepository");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        Intrinsics.checkNotNullParameter(remoteLoggerTree, "remoteLoggerTree");
        Intrinsics.checkNotNullParameter(deviceUtils, "deviceUtils");
        Intrinsics.checkNotNullParameter(waitingScreenTracker, "waitingScreenTracker");
        Intrinsics.checkNotNullParameter(nfcInteractor, "nfcInteractor");
        Intrinsics.checkNotNullParameter(shouldLaunchNfcFlowUseCase, "shouldLaunchNfcFlowUseCase");
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        this.flowTracker = flowTracker;
        this.livenessTracker = livenessTracker;
        this.screenLoadTracker = screenLoadTracker;
        this.nfcTracker = nfcTracker;
        this.runtimePermissionsManager = runtimePermissionsManager;
        this.documentConfigurationManager = documentConfigurationManager;
        this.onfidoPresenterInitializer = onfidoPresenterInitializer;
        this.nfcDataRepository = nfcDataRepository;
        this.schedulersProvider = schedulersProvider;
        this.onfidoRemoteConfig = onfidoRemoteConfig;
        this.remoteLoggerTree = remoteLoggerTree;
        this.deviceUtils = deviceUtils;
        this.waitingScreenTracker = waitingScreenTracker;
        this.nfcInteractor = nfcInteractor;
        this.shouldLaunchNfcFlowUseCase = shouldLaunchNfcFlowUseCase;
        this.onfidoConfig = onfidoConfig;
        this.flowSteps = new ArrayList();
        this.compositeDisposable = new CompositeDisposable();
        this.orchestrationUserConsentVisibility = Visibility.GONE;
        this.uploadResult = new Captures(null, null, null, 7, null);
        OnfidoNavigation onfidoNavigation = new OnfidoNavigation(schedulersProvider);
        this.onfidoNavigation = onfidoNavigation;
        this.navigationManagerHolder = onfidoNavigation.getNavigationManagerHolder();
        this.navigator = onfidoNavigation.getNavigator();
    }

    private void addLoggerTree() {
        Timber.Companion forest = Timber.INSTANCE;
        if (forest.forest().contains(this.remoteLoggerTree)) {
            return;
        }
        forest.plant(this.remoteLoggerTree);
    }

    public static /* synthetic */ boolean backSideCaptureNeeded$default(OnfidoPresenter onfidoPresenter, DocumentType documentType, DocumentPages documentPages, CountryCode countryCode, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: backSideCaptureNeeded");
        }
        if ((i & 4) != 0) {
            countryCode = null;
        }
        return onfidoPresenter.backSideCaptureNeeded(documentType, documentPages, countryCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cleanFiles$lambda$20(File file, String str) {
        Intrinsics.h(str);
        return a0.H(str, "ONFIDO_VID_", false) || str.equals("ONFIDO_LIVENESS_INTRO.mp4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cleanFiles$lambda$24(File file, String str) {
        Intrinsics.h(str);
        return a0.H(str, "ONFIDO_MF_VID_", false);
    }

    private FlowStep findFlowStep(FlowAction flowAction) {
        Object next;
        Iterator<T> it8 = this.flowSteps.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((FlowStep) next).getAction() == flowAction) {
                break;
            }
        }
        return (FlowStep) next;
    }

    private CaptureStepDataBundle getCaptureBundle(CaptureScreenOptions options) {
        return new CaptureStepDataBundle(CaptureType.DOCUMENT, options.getDocumentType(), options.getCountry(), options.getDocumentFormat(), DocSide.FRONT, options.getGenericDocTitle(), options.getGenericDocPages());
    }

    private FlowAction getCurrentAction() {
        return getCurrentStep().getAction();
    }

    private FlowStep getCurrentStep() {
        return this.flowSteps.get(this.flowIndex);
    }

    private NfcArguments getNfcArguments() {
        DocumentSide front;
        NFCOptions nfcOptions = getOnfidoConfig().getNfcOptions();
        Document document = this.uploadResult.getDocument();
        return new NfcArguments(nfcOptions, (document == null || (front = document.getFront()) == null) ? null : new NfcArguments.CapturedNfcData(front.getId(), this.nfcProperties, front.getNfcSupported()));
    }

    public static /* synthetic */ void initFlow$onfido_capture_sdk_core_release$default(OnfidoPresenter onfidoPresenter, boolean z, boolean z3, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initFlow");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z3 = false;
        }
        onfidoPresenter.initFlow$onfido_capture_sdk_core_release(z, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initFlowSteps(boolean shouldAskForConsent) {
        List<FlowStep> listPrepareFlowSteps = prepareFlowSteps(shouldAskForConsent, getOnfidoConfig().getFlowSteps());
        for (FlowStep flowStep : listPrepareFlowSteps) {
            int i = WhenMappings.$EnumSwitchMapping$0[flowStep.getAction().ordinal()];
            if (i == 4) {
                flowStep.setOptions(new WelcomeScreenOptions(listPrepareFlowSteps));
            } else if (i == 6) {
                BaseOptions options = flowStep.getOptions();
                CaptureScreenOptions captureScreenOptions = options instanceof CaptureScreenOptions ? (CaptureScreenOptions) options : null;
                if (captureScreenOptions != null) {
                    this.documentType = captureScreenOptions.getDocumentType();
                }
            }
        }
        this.flowSteps = listPrepareFlowSteps;
        ArrayList arrayList = new ArrayList(w.t(listPrepareFlowSteps, 10));
        Iterator<T> it8 = listPrepareFlowSteps.iterator();
        while (it8.hasNext()) {
            arrayList.add(((FlowStep) it8.next()).getAction());
        }
        for (FlowAction flowAction : FlowAction.INSTANCE.getNonDuplicable()) {
            if (ListExtensionsKt.hasDuplicate(arrayList, flowAction)) {
                StringBuilder sb6 = new StringBuilder("Custom flow cannot have duplicates of:");
                String string = Arrays.toString(FlowAction.INSTANCE.getNonDuplicable());
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb6.append(string);
                throw new IllegalStateException(sb6.toString().toString());
            }
        }
        if (FlowValidation.INSTANCE.containsDifferentFaceCaptureVariants(arrayList)) {
            throw new IllegalStateException("Custom flow cannot contain more than one FaceCaptureVariant");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initOrchestrationFlow(boolean shouldAskForConsent) {
        if (!shouldAskForConsent) {
            OnfidoView onfidoView = this.view;
            if (onfidoView != null) {
                onfidoView.showWorkflowFragment(getOnfidoConfig().getWorkflowConfig());
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        this.orchestrationUserConsentVisibility = Visibility.VISIBLE;
        OnfidoView onfidoView2 = this.view;
        if (onfidoView2 != null) {
            onfidoView2.showUserConsentScreen(FlowStepDirection.NO_DIRECTION);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private void initializeSdk(final Function1<? super OnfidoPresenterInitializer.InitializerResult.Success, Unit> action) {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = this.onfidoPresenterInitializer.initialize$onfido_capture_sdk_core_release(OnfidoConfigExtensionsKt.hasPreselectedDocuments(getOnfidoConfig())).subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.OnfidoPresenter.initializeSdk.1
            @Override // igm.g
            public final void accept(@NotNull OnfidoPresenterInitializer.InitializerResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, OnfidoPresenterInitializer.InitializerResult.Loading.INSTANCE)) {
                    OnfidoView onfidoView = OnfidoPresenter.this.view;
                    if (onfidoView != null) {
                        onfidoView.showLoadingView();
                        return;
                    } else {
                        Intrinsics.r("view");
                        throw null;
                    }
                }
                if (result instanceof OnfidoPresenterInitializer.InitializerResult.Success) {
                    OnfidoView onfidoView2 = OnfidoPresenter.this.view;
                    if (onfidoView2 == null) {
                        Intrinsics.r("view");
                        throw null;
                    }
                    onfidoView2.hideLoadingView();
                    OnfidoView onfidoView3 = OnfidoPresenter.this.view;
                    if (onfidoView3 == null) {
                        Intrinsics.r("view");
                        throw null;
                    }
                    onfidoView3.enableToolbarBackNavigation();
                    action.invoke(result);
                    return;
                }
                if (result instanceof OnfidoPresenterInitializer.InitializerResult.Error.GenericError) {
                    Timber.INSTANCE.e(((OnfidoPresenterInitializer.InitializerResult.Error.GenericError) result).getCause(), "Error during initializing presenter", new Object[0]);
                    return;
                }
                if (result instanceof OnfidoPresenterInitializer.InitializerResult.Error.SSLHandshakeUnverified) {
                    OnfidoView onfidoView4 = OnfidoPresenter.this.view;
                    if (onfidoView4 != null) {
                        onfidoView4.onError(new InvalidCertificateException(((OnfidoPresenterInitializer.InitializerResult.Error.SSLHandshakeUnverified) result).getMessage()));
                        return;
                    } else {
                        Intrinsics.r("view");
                        throw null;
                    }
                }
                if (Intrinsics.f(result, OnfidoPresenterInitializer.InitializerResult.Error.TokenExpired.INSTANCE)) {
                    OnfidoView onfidoView5 = OnfidoPresenter.this.view;
                    if (onfidoView5 != null) {
                        onfidoView5.onError(TokenExpiredException.INSTANCE);
                    } else {
                        Intrinsics.r("view");
                        throw null;
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private boolean isDeviceNotSupported() {
        return NFCOptionsKt.isRequired(getOnfidoConfig().getNfcOptions()) && !this.nfcInteractor.isNfcSupported();
    }

    private boolean isOnlyOneDocAvailable() {
        Object next;
        Iterator<T> it8 = this.flowSteps.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((FlowStep) next).getAction() == FlowAction.CAPTURE_DOCUMENT) {
                break;
            }
        }
        FlowStep flowStep = (FlowStep) next;
        BaseOptions options = flowStep != null ? flowStep.getOptions() : null;
        return (options instanceof CaptureScreenOptions ? (CaptureScreenOptions) options : null) != null;
    }

    private boolean isVideoAvailableOnConfirmationScreen() {
        FlowStep flowStepFindFlowStep = findFlowStep(FlowAction.CAPTURE_LIVENESS_CONFIRMATION);
        BaseOptions options = flowStepFindFlowStep != null ? flowStepFindFlowStep.getOptions() : null;
        if (options instanceof VideoCaptureVariantOptions) {
            return ((VideoCaptureVariantOptions) options).getShowConfirmationVideo();
        }
        if (options instanceof LivenessConfirmationOptions) {
            return ((LivenessConfirmationOptions) options).getShowConfirmationVideo();
        }
        return true;
    }

    private void launchFaceCapture(DocumentType documentType) {
        if (this.onfidoRemoteConfig.isRefactoredCaptureEnabled()) {
            navigateTo(SelfieCaptureScreen.INSTANCE, FlowStepDirection.RIGHT_TO_LEFT);
            return;
        }
        showEmptyScreen();
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.showFaceCapture(documentType);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void moveTo(FlowStep step, FlowStepDirection flowStepDirection, FlowStep currentStep) {
        BaseOptions options = step.getOptions();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (WhenMappings.$EnumSwitchMapping$0[step.getAction().ordinal()]) {
            case 1:
                OnfidoView onfidoView = this.view;
                if (onfidoView != null) {
                    onfidoView.showMotionFlow(options instanceof MotionCaptureVariantOptions ? (MotionCaptureVariantOptions) options : null, flowStepDirection);
                    return;
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            case 2:
                showLivenessCapture(flowStepDirection);
                return;
            case 3:
                showFaceSelfieCapture(flowStepDirection, currentStep);
                return;
            case 4:
                WelcomeScreenOptions welcomeScreenOptions = new WelcomeScreenOptions(this.flowSteps);
                if (options == null) {
                    options = welcomeScreenOptions;
                }
                showWelcomeScreen(options, flowStepDirection);
                return;
            case 5:
                if (!this.onfidoRemoteConfig.getEnableWebModuleBasedPoa()) {
                    OnfidoView onfidoView2 = this.view;
                    if (onfidoView2 != null) {
                        onfidoView2.showProofOfAddressFlow(flowStepDirection);
                        return;
                    } else {
                        Intrinsics.r("view");
                        throw null;
                    }
                }
                OnfidoView onfidoView3 = this.view;
                if (onfidoView3 == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                onfidoView3.showProofOfAddressFlowWeb(new HostedWebModuleModuleInfo("{}", "{}", null, new ClassicModuleInfo("proofOfAddress", objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0), 4, null), flowStepDirection);
                return;
            case 6:
                showDocumentCapture(options, flowStepDirection, currentStep);
                return;
            case 7:
                OnfidoView onfidoView4 = this.view;
                if (onfidoView4 != null) {
                    onfidoView4.showUserConsentScreen(flowStepDirection);
                    return;
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            case 8:
                showFaceSelfieIntro(flowStepDirection, currentStep);
                return;
            case 9:
                showLivenessIntro(step, flowStepDirection);
                return;
            case 10:
                showLivenessCaptureConfirmation(options, flowStepDirection);
                return;
            case 11:
                showMessageScreen(options, flowStepDirection);
                return;
            case 12:
                OnfidoView onfidoView5 = this.view;
                if (onfidoView5 == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                DocumentType documentType = this.documentType;
                CountryCode countryCode = this.countryCode;
                NfcProperties nfcProperties = this.nfcProperties;
                if (nfcProperties == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                onfidoView5.showNfcHostFragment(documentType, countryCode, nfcProperties, flowStepDirection, isOnlyOneDocAvailable());
                return;
            case 13:
                OnfidoView onfidoView6 = this.view;
                if (onfidoView6 != null) {
                    onfidoView6.showFinalScreen(flowStepDirection);
                    return;
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            default:
                return;
        }
    }

    private void moveToDocumentCaptureOrPermissions(BaseOptions baseOptions, FlowStepDirection flowStepDirection, FlowStep currentStep) {
        CaptureScreenOptions captureScreenOptions = baseOptions instanceof CaptureScreenOptions ? (CaptureScreenOptions) baseOptions : null;
        if (captureScreenOptions != null) {
            showDocumentCaptureOrPermissionsScreen(captureScreenOptions, flowStepDirection, currentStep);
        } else {
            showDocumentTypeSelection(flowStepDirection, currentStep);
        }
    }

    private void navigateTo(Screen screen, FlowStepDirection flowStepDirection) {
        FlowStepDirection[] elements = {FlowStepDirection.RIGHT_TO_LEFT, FlowStepDirection.NO_DIRECTION};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (kotlin.collections.d.y0(elements).contains(flowStepDirection)) {
            getNavigator().navigateTo(screen);
        } else {
            getNavigator().backTo(screen);
        }
    }

    private boolean needToCaptureBackOfDocument(DocumentCaptureScreen.DocumentCaptureResult.Completed documentResult) {
        CaptureStepDataBundle documentData = documentResult.getDocumentData();
        return documentData.getDocSide() == DocSide.FRONT && backSideCaptureNeeded(documentData.getDocumentType(), documentData.getGenericDocPages(), documentData.getCountryCode());
    }

    private void onCaptureException(Exception exception) {
        if (exception instanceof CameraException) {
            onBackPressed$onfido_capture_sdk_core_release();
            return;
        }
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.onError(exception);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private void onFaceCapturePermissionGranted(DocumentType documentType) {
        onNavigationStarted$onfido_capture_sdk_core_release$default(this, PerformanceAnalyticsScreen.PERMISSION_MANAGEMENT, null, PerformanceAnalyticsScreen.FACE_SELFIE_CAPTURE, 2, null);
        launchFaceCapture(documentType);
    }

    private void onFaceVideoPermissionGranted() {
        onNavigationStarted$onfido_capture_sdk_core_release$default(this, PerformanceAnalyticsScreen.PERMISSION_MANAGEMENT, null, PerformanceAnalyticsScreen.FACE_VIDEO_CAPTURE, 2, null);
        if (this.onfidoRemoteConfig.isRefactoredCaptureEnabled()) {
            getNavigator().navigateTo(LivenessCaptureScreen.INSTANCE);
            return;
        }
        showEmptyScreen();
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.showLivenessCapture();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationStarted$onfido_capture_sdk_core_release$default(OnfidoPresenter onfidoPresenter, PerformanceAnalyticsScreen performanceAnalyticsScreen, FlowStep flowStep, PerformanceAnalyticsScreen performanceAnalyticsScreen2, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onNavigationStarted");
        }
        if ((i & 1) != 0) {
            performanceAnalyticsScreen = null;
        }
        if ((i & 2) != 0) {
            flowStep = null;
        }
        onfidoPresenter.onNavigationStarted$onfido_capture_sdk_core_release(performanceAnalyticsScreen, flowStep, performanceAnalyticsScreen2);
    }

    private void onNfcScanSucceeded(NfcPassportExtraction nfcData, NfcFlowType nfcFlowType) {
        NfcDataService nfcDataService = this.nfcDataService;
        if (nfcDataService == null) {
            Intrinsics.r("nfcDataService");
            throw null;
        }
        nfcDataService.uploadBinary(nfcData, this.documentType, nfcFlowType);
        this.nfcTracker.trackDataUploadStarted(nfcFlowType);
    }

    private void onPermissionScreenBackPressedAfterDocSelection() {
        if (this.flowIndex != 0 || shouldShowDocumentSelection()) {
            return;
        }
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.exitFlow(ExitCode.USER_LEFT_ACTIVITY);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private void onPermissionScreenDismissed() {
        boolean z = getCurrentAction() == FlowAction.CAPTURE_DOCUMENT && !shouldShowDocumentSelection();
        boolean z3 = getCurrentAction() == FlowAction.CAPTURE_FACE;
        boolean z4 = getCurrentAction() == FlowAction.CAPTURE_LIVENESS;
        if (z || z3 || z4) {
            previousAction$onfido_capture_sdk_core_release();
        }
    }

    private void onPermissionsGranted(CaptureStepDataBundle captureDataBundle) {
        if (this.awaitingPermissions) {
            this.awaitingPermissions = false;
            int i = WhenMappings.$EnumSwitchMapping$1[captureDataBundle.getCaptureType().ordinal()];
            if (i == 1) {
                showCaptureStep$onfido_capture_sdk_core_release(true, captureDataBundle, PerformanceAnalyticsScreen.PERMISSION_MANAGEMENT);
            } else if (i == 2) {
                onFaceCapturePermissionGranted(captureDataBundle.getDocumentType());
            } else {
                if (i != 3) {
                    return;
                }
                onFaceVideoPermissionGranted();
            }
        }
    }

    private void onVideoCaptured(UploadedArtifact videoResult) {
        this.uploadResult.setFace(new Face(videoResult.getId(), FaceCaptureVariant.VIDEO));
        nextAction();
    }

    private void openNewDocumentCapture(boolean isFrontSide, CaptureStepDataBundle captureBundle, NfcArguments nfcArguments) {
        DocumentCaptureScreen documentCaptureScreen = new DocumentCaptureScreen(captureBundle, isFrontSide, nfcArguments);
        if (isFrontSide) {
            getNavigator().navigateTo(documentCaptureScreen);
        } else {
            getNavigator().replace(documentCaptureScreen);
        }
    }

    private void prepareFaceSteps(List<FlowStep> modifiedSteps, BaseOptions options) {
        FlowStep flowStep;
        if (this.onfidoRemoteConfig.getMotionExperiment().isEnabled()) {
            flowStep = new FlowStep(FlowAction.ACTIVE_VIDEO_CAPTURE);
        } else {
            if (shouldShowFaceCaptureIntro(options)) {
                modifiedSteps.add(new FlowStep(FlowAction.INTRO_FACE_CAPTURE));
            }
            flowStep = new FlowStep(FlowAction.CAPTURE_FACE);
        }
        modifiedSteps.add(flowStep);
    }

    private List<FlowStep> prepareFlowSteps(boolean shouldAskForConsent, List<? extends FlowStep> flowSteps) {
        LinkedList linkedList = new LinkedList();
        boolean z = false;
        for (FlowStep flowStep : flowSteps) {
            FlowAction action = flowStep.getAction();
            BaseOptions options = flowStep.getOptions();
            int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i == 1) {
                prepareMotionSteps(linkedList, options);
            } else if (i == 2) {
                prepareLivenessSteps(linkedList, options);
            } else if (i == 3) {
                prepareFaceSteps(linkedList, options);
            } else if (i != 4) {
                if (i == 5) {
                    flowStep = new FlowStep(FlowAction.PROOF_OF_ADDRESS);
                }
                linkedList.add(flowStep);
            } else {
                linkedList.add(flowStep);
                if (shouldAskForConsent) {
                    linkedList.add(new FlowStep(FlowAction.USER_CONSENT));
                    z = true;
                }
            }
        }
        if (!z && shouldAskForConsent) {
            linkedList.addFirst(new FlowStep(FlowAction.USER_CONSENT));
        }
        return y.K(y.k(d0.Q(linkedList)));
    }

    private void prepareLivenessSteps(List<FlowStep> modifiedSteps, BaseOptions options) {
        if (this.onfidoRemoteConfig.getMotionExperiment().isEnabled()) {
            modifiedSteps.add(new FlowStep(FlowAction.ACTIVE_VIDEO_CAPTURE));
            return;
        }
        FlowStep flowStep = new FlowStep(FlowAction.INTRO_LIVENESS_CAPTURE);
        flowStep.setOptions(options);
        modifiedSteps.add(flowStep);
        modifiedSteps.add(new FlowStep(FlowAction.CAPTURE_LIVENESS));
        FlowStep flowStep2 = new FlowStep(FlowAction.CAPTURE_LIVENESS_CONFIRMATION);
        flowStep2.setOptions(options);
        modifiedSteps.add(flowStep2);
    }

    private void prepareMotionSteps(List<FlowStep> modifiedSteps, BaseOptions baseOptions) {
        FlowStep flowStep = new FlowStep(FlowAction.ACTIVE_VIDEO_CAPTURE);
        flowStep.setOptions(baseOptions);
        modifiedSteps.add(flowStep);
    }

    private List<FlowStep> previousSteps() {
        return this.flowSteps.subList(0, this.flowIndex);
    }

    private void removeNfcStep() {
        setState$onfido_capture_sdk_core_release(State.copy$default(getState$onfido_capture_sdk_core_release(), null, 0, null, null, null, null, 31, null));
        removeStep(FlowAction.NFC_HOST_FEATURE);
    }

    private void removeStep(FlowAction flowAction) {
        if (zhm.a0.E(this.flowSteps, new OnfidoPresenter$removeStep$isRemoved$1(flowAction))) {
            this.flowIndex = Math.max(0, this.flowIndex - 1);
        }
    }

    private void setActionWithIndex(int newIndex) {
        int i = this.flowIndex;
        FlowStepDirection flowStepDirection = i > newIndex ? FlowStepDirection.LEFT_TO_RIGHT : (i < newIndex || i == 0) ? FlowStepDirection.RIGHT_TO_LEFT : FlowStepDirection.NO_DIRECTION;
        FlowStep flowStep = this.flowSteps.get(i);
        this.flowIndex = newIndex;
        moveTo(this.flowSteps.get(newIndex), flowStepDirection, flowStep);
    }

    public static /* synthetic */ void setup$onfido_capture_sdk_core_release$default(OnfidoPresenter onfidoPresenter, OnfidoView onfidoView, State state, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setup");
        }
        if ((i & 2) != 0) {
            state = null;
        }
        onfidoPresenter.setup$onfido_capture_sdk_core_release(onfidoView, state);
    }

    private boolean shouldShowDocumentSelection() {
        return getCurrentStep().getOptions() == null;
    }

    private boolean shouldShowFaceCaptureIntro(BaseOptions options) {
        return options == null || !(options instanceof PhotoCaptureVariantOptions) || ((PhotoCaptureVariantOptions) options).getWithIntroScreen();
    }

    private boolean shouldShowLivenessIntroVideo(BaseOptions options) {
        return options == null || !(options instanceof VideoCaptureVariantOptions) || ((VideoCaptureVariantOptions) options).getShowIntroVideo();
    }

    private void showDocumentCapture(BaseOptions baseOptions, FlowStepDirection flowStepDirection, FlowStep currentStep) {
        if (!isDeviceNotSupported()) {
            moveToDocumentCaptureOrPermissions(baseOptions, flowStepDirection, currentStep);
            return;
        }
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.showDeviceNotSupportedFragment(flowStepDirection);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private void showDocumentCaptureOrPermissionsScreen(CaptureScreenOptions options, FlowStepDirection flowStepDirection, FlowStep currentStep) {
        CaptureStepDataBundle captureBundle = getCaptureBundle(options);
        if (this.runtimePermissionsManager.hasPermissionsForCaptureType(CaptureType.DOCUMENT)) {
            showCaptureStep$onfido_capture_sdk_core_release(true, captureBundle, PerformanceAnalyticsScreen.INSTANCE.fromFlowAction(currentStep.getAction()));
        } else {
            showPermissionsScreen(captureBundle, flowStepDirection);
        }
    }

    private void showDocumentTypeSelection(FlowStepDirection flowStepDirection, FlowStep currentStep) {
        onNavigationStarted$onfido_capture_sdk_core_release$default(this, null, currentStep, PerformanceAnalyticsScreen.DOCUMENT_TYPE_SELECTION, 1, null);
        navigateTo(new DocumentSelectionScreen(this.countryCode, null, NFCOptionsKt.isRequired(getOnfidoConfig().getNfcOptions()), false, 10, null), flowStepDirection);
    }

    private void showEmptyScreen() {
        getNavigator().navigateTo(EmptyScreen.INSTANCE);
    }

    private void showFaceSelfieCapture(FlowStepDirection flowStepDirection, FlowStep currentStep) {
        RuntimePermissionsManager runtimePermissionsManager = this.runtimePermissionsManager;
        CaptureType captureType = CaptureType.FACE;
        if (runtimePermissionsManager.hasPermissionsForCaptureType(captureType)) {
            onNavigationStarted$onfido_capture_sdk_core_release$default(this, null, currentStep, PerformanceAnalyticsScreen.FACE_SELFIE_CAPTURE, 1, null);
            launchFaceCapture(this.documentType);
            return;
        }
        showPermissionsScreen(new CaptureStepDataBundle(captureType, null, null, null, null, null, null, 126, null), flowStepDirection);
    }

    private void showFaceSelfieIntro(FlowStepDirection flowStepDirection, FlowStep currentStep) {
        onNavigationStarted$onfido_capture_sdk_core_release$default(this, null, currentStep, PerformanceAnalyticsScreen.FACE_SELFIE_INTRO, 1, null);
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.showCaptureFaceMessage(flowStepDirection);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private void showLivenessCapture(FlowStepDirection flowStepDirection) {
        RuntimePermissionsManager runtimePermissionsManager = this.runtimePermissionsManager;
        CaptureType captureType = CaptureType.VIDEO;
        if (!runtimePermissionsManager.hasPermissionsForCaptureType(captureType)) {
            showPermissionsScreen(new CaptureStepDataBundle(captureType, null, null, null, null, null, null, 126, null), flowStepDirection);
            return;
        }
        if (this.onfidoRemoteConfig.isRefactoredCaptureEnabled()) {
            getNavigator().navigateTo(LivenessCaptureScreen.INSTANCE);
            return;
        }
        showEmptyScreen();
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.showLivenessCapture();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private void showLivenessCaptureConfirmation(BaseOptions baseOptions, FlowStepDirection flowStepDirection) {
        LivenessConfirmationOptions livenessConfirmationOptions = baseOptions instanceof LivenessConfirmationOptions ? (LivenessConfirmationOptions) baseOptions : null;
        if (livenessConfirmationOptions == null) {
            return;
        }
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.showCaptureLivenessConfirmation(flowStepDirection, livenessConfirmationOptions.getVideoFilePath(), livenessConfirmationOptions.getLivenessPerformedChallenges(), livenessConfirmationOptions.getShowConfirmationVideo());
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private void showLivenessIntro(FlowStep step, FlowStepDirection flowStepDirection) {
        boolean zShouldShowLivenessIntroVideo = shouldShowLivenessIntroVideo(step.getOptions());
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.showLivenessIntro(zShouldShowLivenessIntroVideo, flowStepDirection);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private void showMessageScreen(BaseOptions baseOptions, FlowStepDirection flowStepDirection) {
        Intrinsics.i(baseOptions, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.options.MessageScreenOptions");
        MessageScreenOptions messageScreenOptions = (MessageScreenOptions) baseOptions;
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.showMessageScreen(messageScreenOptions.getTitle(), messageScreenOptions.getMessage(), flowStepDirection);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private void showPermissionsScreen(CaptureStepDataBundle captureBundle, FlowStepDirection flowStepDirection) {
        this.awaitingPermissions = true;
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.showPermissionsManagementFragment(captureBundle, flowStepDirection);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private void showWelcomeScreen(BaseOptions baseOptions, FlowStepDirection flowStepDirection) {
        onNavigationStarted$onfido_capture_sdk_core_release$default(this, PerformanceAnalyticsScreen.SPLASH, null, PerformanceAnalyticsScreen.WELCOME, 2, null);
        Intrinsics.i(baseOptions, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.options.WelcomeScreenOptions");
        navigateTo(new WelcomeScreen((WelcomeScreenOptions) baseOptions), flowStepDirection);
    }

    private void skipNfcScanStep() {
        Document document = this.uploadResult.getDocument();
        if (document != null) {
            document.setNfcMediaUUID(null);
        }
        nextAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startFlow() {
        if (this.flowSteps.isEmpty()) {
            return;
        }
        setActionWithIndex(this.flowIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackFlowInitiatedEvents(boolean isSystemDarkModeEnabled) {
        this.flowTracker.trackFlowStart$onfido_capture_sdk_core_release();
        FlowTracker flowTracker = this.flowTracker;
        Locale locale = getOnfidoConfig().getLocale();
        String languageTag = locale != null ? locale.toLanguageTag() : null;
        String languageTag2 = Locale.getDefault().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag2, "toLanguageTag(...)");
        flowTracker.trackLanguageConfig$onfido_capture_sdk_core_release(languageTag, languageTag2, this.deviceUtils.getDeviceLanguages$onfido_capture_sdk_core_release());
        this.flowTracker.trackUiThemeConfig$onfido_capture_sdk_core_release(getOnfidoConfig().getTheme(), isSystemDarkModeEnabled);
    }

    public void appendNfcFeature$onfido_capture_sdk_core_release() {
        boolean z;
        boolean zInvoke = this.shouldLaunchNfcFlowUseCase.invoke(this.nfcProperties);
        List<FlowStep> list = this.flowSteps;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                if (((FlowStep) it8.next()).getAction() == FlowAction.NFC_HOST_FEATURE) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (zInvoke && !z) {
            this.flowSteps.add(this.flowIndex + 1, new FlowStep(FlowAction.NFC_HOST_FEATURE));
        }
        if (NFCOptionsKt.isRequired(getOnfidoConfig().getNfcOptions()) && this.nfcProperties == null) {
            this.nfcProperties = new NfcProperties(false, "", new byte[0], null, false, false, 0, 0, null, 496, null);
        }
    }

    public boolean backSideCaptureNeeded(DocumentType documentType, DocumentPages genericDocumentPages, CountryCode countryCode) {
        return documentType != null && this.documentConfigurationManager.backSideCaptureNeeded(documentType, genericDocumentPages, countryCode);
    }

    public void cleanFiles(File directory) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        List<FlowStep> list = this.flowSteps;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((FlowStep) it8.next()).getAction());
        }
        if (!arrayList.isEmpty()) {
            Iterator it9 = arrayList.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                if (((FlowAction) it9.next()) == FlowAction.CAPTURE_LIVENESS) {
                    if (directory != null && (fileArrListFiles2 = directory.listFiles(new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.a(1))) != null) {
                        for (File file : fileArrListFiles2) {
                            file.delete();
                        }
                    }
                }
            }
        }
        List<FlowStep> list2 = this.flowSteps;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator<T> it10 = list2.iterator();
        while (it10.hasNext()) {
            arrayList2.add(((FlowStep) it10.next()).getAction());
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it11 = arrayList2.iterator();
        while (it11.hasNext()) {
            if (((FlowAction) it11.next()) == FlowAction.CAPTURE_DOCUMENT) {
                if (directory == null || (fileArrListFiles = directory.listFiles(new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.a(2))) == null) {
                    return;
                }
                for (File file2 : fileArrListFiles) {
                    file2.delete();
                }
                return;
            }
        }
    }

    @NotNull
    public NavigationManagerHolder getNavigationManagerHolder() {
        return this.navigationManagerHolder;
    }

    @NotNull
    public Navigator getNavigator() {
        return this.navigator;
    }

    @NotNull
    /* JADX INFO: renamed from: getOnfidoConfig$onfido_capture_sdk_core_release, reason: from getter */
    public OnfidoConfig getOnfidoConfig() {
        return this.onfidoConfig;
    }

    @NotNull
    public State getState$onfido_capture_sdk_core_release() {
        return new State(this.flowSteps, this.flowIndex, this.uploadResult, this.documentType, this.countryCode, this.nfcProperties);
    }

    public void initFlow$onfido_capture_sdk_core_release(boolean isRestoringState, boolean isSystemDarkModeEnabled) {
        initializeSdk(new OnfidoPresenter$initFlow$1(isRestoringState, this, isSystemDarkModeEnabled));
    }

    public void nextAction() {
        if (this.flowIndex < v.j(this.flowSteps)) {
            setActionWithIndex(this.flowIndex + 1);
            return;
        }
        onFlowCompleted$onfido_capture_sdk_core_release();
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.completeFlow();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public void onAddressPageIntroContinue() {
        CaptureStepDataBundle captureStepDataBundle = this.pendingAddressPageCaptureBundle;
        if (captureStepDataBundle == null) {
            return;
        }
        this.pendingAddressPageCaptureBundle = null;
        showCaptureStep$onfido_capture_sdk_core_release(false, captureStepDataBundle, PerformanceAnalyticsScreen.DOCUMENT_CAPTURE);
    }

    public void onAvcHostResult$onfido_capture_sdk_core_release(@NotNull MotionHostFragment.AvcHostResult avcHostResult) {
        Intrinsics.checkNotNullParameter(avcHostResult, "avcHostResult");
        if (Intrinsics.f(avcHostResult, MotionHostFragment.AvcHostResult.Exit.INSTANCE)) {
            onBackPressed$onfido_capture_sdk_core_release();
            return;
        }
        if (avcHostResult instanceof MotionHostFragment.AvcHostResult.Completed) {
            onMotionCaptured$onfido_capture_sdk_core_release(((MotionHostFragment.AvcHostResult.Completed) avcHostResult).getUploadedArtifact());
            return;
        }
        if (avcHostResult instanceof MotionHostFragment.AvcHostResult.Error) {
            OnfidoView onfidoView = this.view;
            if (onfidoView != null) {
                onfidoView.onError(new OnfidoException(((MotionHostFragment.AvcHostResult.Error) avcHostResult).getMessage()));
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
    }

    public void onBackPressed$onfido_capture_sdk_core_release() {
        if (getCurrentAction() == FlowAction.CAPTURE_DOCUMENT) {
            if (!isDeviceNotSupported()) {
                if (this.runtimePermissionsManager.hasPermissionsForCaptureType(CaptureType.DOCUMENT)) {
                    onDocumentCaptureBackPressed$onfido_capture_sdk_core_release();
                    return;
                } else {
                    onPermissionScreenBackPressedAfterDocSelection();
                    return;
                }
            }
        } else {
            if (this.flowIndex == 0 || previousSteps().contains(FlowStep.FINAL)) {
                OnfidoView onfidoView = this.view;
                if (onfidoView != null) {
                    onfidoView.exitFlow(ExitCode.USER_LEFT_ACTIVITY);
                    return;
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
            if (getCurrentAction() != FlowAction.NFC_HOST_FEATURE) {
                if (getCurrentAction() == FlowAction.INTRO_FACE_CAPTURE) {
                    this.livenessTracker.trackFaceSelfieIntroBackButtonClicked$onfido_capture_sdk_core_release();
                    previousAction$onfido_capture_sdk_core_release();
                    return;
                } else if (getCurrentAction() == FlowAction.INTRO_LIVENESS_CAPTURE) {
                    this.livenessTracker.trackFaceVideoIntroBackButtonClicked$onfido_capture_sdk_core_release();
                    previousAction$onfido_capture_sdk_core_release();
                    return;
                } else if (getCurrentAction() == FlowAction.CAPTURE_LIVENESS) {
                    if (this.runtimePermissionsManager.hasPermissionsForCaptureType(CaptureType.VIDEO)) {
                        this.livenessTracker.trackFaceVideoCaptureBackButtonClicked$onfido_capture_sdk_core_release();
                    }
                } else if (getCurrentAction() == FlowAction.CAPTURE_LIVENESS_CONFIRMATION) {
                    this.livenessTracker.trackFaceVideoConfirmationBackButtonClicked$onfido_capture_sdk_core_release();
                    previousAction$onfido_capture_sdk_core_release();
                    return;
                }
            }
        }
        previousAction$onfido_capture_sdk_core_release();
    }

    public void onCaptureWithoutPermissions$onfido_capture_sdk_core_release(@NotNull CaptureStepDataBundle captureData) {
        Intrinsics.checkNotNullParameter(captureData, "captureData");
        getNavigator().exitCurrentScreen();
        showPermissionsScreen(captureData, FlowStepDirection.RIGHT_TO_LEFT);
    }

    @Override // com.onfido.android.sdk.capture.ui.NfcDataServiceListener
    public void onDataUploaded(@NotNull DocumentMediaUploadResponse documentMediaUpload, @NotNull NfcFlowType nfcFlowType) {
        Intrinsics.checkNotNullParameter(documentMediaUpload, "documentMediaUpload");
        Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
        this.nfcTracker.trackDataUploadCompleted(nfcFlowType);
        Document document = this.uploadResult.getDocument();
        if (document != null) {
            document.setNfcMediaUUID(documentMediaUpload.mediaId());
        }
        OnfidoView onfidoView = this.view;
        if (onfidoView == null) {
            Intrinsics.r("view");
            throw null;
        }
        onfidoView.hideLoadingDialog();
        nextAction();
    }

    public void onDocumentCaptureBackPressed$onfido_capture_sdk_core_release() {
        if (shouldShowDocumentSelection()) {
            onNavigationStarted$onfido_capture_sdk_core_release$default(this, PerformanceAnalyticsScreen.DOCUMENT_CAPTURE, null, PerformanceAnalyticsScreen.DOCUMENT_TYPE_SELECTION, 2, null);
        }
        getNavigator().exitCurrentScreen();
        if (shouldShowDocumentSelection()) {
            return;
        }
        previousAction$onfido_capture_sdk_core_release();
    }

    public void onDocumentCaptureResult(@NotNull DocumentCaptureScreen.DocumentCaptureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof DocumentCaptureScreen.DocumentCaptureResult.Error) {
            onCaptureException(((DocumentCaptureScreen.DocumentCaptureResult.Error) result).getException());
            return;
        }
        if (!(result instanceof DocumentCaptureScreen.DocumentCaptureResult.Completed)) {
            if (result instanceof DocumentCaptureScreen.DocumentCaptureResult.POACompleted) {
                throw new IllegalStateException(("POA result is handled inside the POAHostFragment: " + result).toString());
            }
            return;
        }
        DocumentCaptureScreen.DocumentCaptureResult.Completed completed = (DocumentCaptureScreen.DocumentCaptureResult.Completed) result;
        String uploadId = completed.getUploadId();
        DocSide docSide = completed.getDocumentData().getDocSide();
        if (docSide == null) {
            docSide = DocSide.BACK;
        }
        DocumentType documentType = completed.getDocumentData().getDocumentType();
        Intrinsics.h(documentType);
        onDocumentCaptured$onfido_capture_sdk_core_release(new DocumentSide(uploadId, docSide, documentType, completed.isNfcSupported()), completed.getNfcProperties());
        if (!needToCaptureBackOfDocument(completed)) {
            appendNfcFeature$onfido_capture_sdk_core_release();
            nextAction();
            return;
        }
        CaptureStepDataBundle captureStepDataBundleCopy$default = CaptureStepDataBundle.copy$default(completed.getDocumentData(), null, null, null, null, DocSide.BACK, null, null, LDSFile.EF_DG15_TAG, null);
        DocumentConfigurationManager documentConfigurationManager = this.documentConfigurationManager;
        DocumentType documentType2 = completed.getDocumentData().getDocumentType();
        Intrinsics.h(documentType2);
        if (!documentConfigurationManager.isAddressPageCaptureEnabled(documentType2, completed.getDocumentData().getCountryCode())) {
            showCaptureStep$onfido_capture_sdk_core_release(false, captureStepDataBundleCopy$default, PerformanceAnalyticsScreen.DOCUMENT_CAPTURE);
        } else {
            this.pendingAddressPageCaptureBundle = captureStepDataBundleCopy$default;
            getNavigator().navigateTo(AddressPageIntroScreen.INSTANCE);
        }
    }

    public void onDocumentCaptured$onfido_capture_sdk_core_release(@NotNull DocumentSide documentResult, NfcProperties nfcProperties) {
        Intrinsics.checkNotNullParameter(documentResult, "documentResult");
        if (Intrinsics.f(documentResult.getSide().getId(), DocSide.FRONT.getId())) {
            Captures captures = this.uploadResult;
            Document document = new Document(null, null, null, null, null, 31, null);
            document.setType(documentResult.getType());
            document.setFront(documentResult);
            document.setBack(null);
            document.setNfcMediaUUID(null);
            captures.setDocument(document);
        } else {
            Document document2 = this.uploadResult.getDocument();
            if (document2 != null) {
                document2.setBack(documentResult);
            }
        }
        if (nfcProperties != null) {
            this.nfcProperties = nfcProperties;
        }
    }

    public void onDocumentTypeSelected$onfido_capture_sdk_core_release(@NotNull DocumentType docType, @NotNull CountryCode countryCode, String genericDocumentTitle, DocumentPages genericDocumentPages) {
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.documentType = docType;
        this.countryCode = countryCode;
        CaptureType captureType = CaptureType.DOCUMENT;
        CaptureStepDataBundle captureStepDataBundle = new CaptureStepDataBundle(captureType, docType, countryCode, null, DocSide.FRONT, genericDocumentTitle, genericDocumentPages, 8, null);
        removeNfcStep();
        if (this.runtimePermissionsManager.hasPermissionsForCaptureType(captureType)) {
            showCaptureStep$onfido_capture_sdk_core_release(true, captureStepDataBundle, PerformanceAnalyticsScreen.DOCUMENT_TYPE_SELECTION);
        } else {
            showPermissionsScreen(captureStepDataBundle, FlowStepDirection.RIGHT_TO_LEFT);
        }
    }

    public void onFaceCaptured(@NotNull String faceId) {
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        this.uploadResult.setFace(new Face(faceId, FaceCaptureVariant.PHOTO));
    }

    public void onFaceSelfieCaptureResult(@NotNull SelfieCaptureScreen.SelfieCaptureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof SelfieCaptureScreen.SelfieCaptureResult.Completed) {
            onFaceCaptured(((SelfieCaptureScreen.SelfieCaptureResult.Completed) result).getUploadId());
            nextAction();
        } else if (result instanceof SelfieCaptureScreen.SelfieCaptureResult.Error) {
            onCaptureException(((SelfieCaptureScreen.SelfieCaptureResult.Error) result).getException());
        } else if (Intrinsics.f(result, SelfieCaptureScreen.SelfieCaptureResult.Back.INSTANCE)) {
            previousAction$onfido_capture_sdk_core_release();
        }
    }

    public void onFlowCompleted$onfido_capture_sdk_core_release() {
        this.flowTracker.trackFlowCompletion();
    }

    public void onFlowExited$onfido_capture_sdk_core_release() {
        this.flowTracker.trackFlowCancellation();
    }

    public void onLivenessCaptureResult(@NotNull LivenessCaptureScreen.LivenessCaptureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof LivenessCaptureScreen.LivenessCaptureResult.Completed) {
            LivenessCaptureScreen.LivenessCaptureResult.Completed completed = (LivenessCaptureScreen.LivenessCaptureResult.Completed) result;
            setLivenessVideoOptions(completed.getVideoPath(), completed.getPerformedChallenges());
            nextAction();
        } else if (result instanceof LivenessCaptureScreen.LivenessCaptureResult.Error) {
            onCaptureException(((LivenessCaptureScreen.LivenessCaptureResult.Error) result).getException());
        } else if (Intrinsics.f(result, LivenessCaptureScreen.LivenessCaptureResult.Back.INSTANCE)) {
            previousAction$onfido_capture_sdk_core_release();
        }
    }

    public void onLivenessConfirmationResultReceived$onfido_capture_sdk_core_release(@NotNull LivenessConfirmationFragment.LivenessConfirmationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof LivenessConfirmationFragment.LivenessConfirmationResult.Exit) {
            previousAction$onfido_capture_sdk_core_release();
            return;
        }
        if (result instanceof LivenessConfirmationFragment.LivenessConfirmationResult.VideoUploadedSuccessfully) {
            onVideoCaptured(((LivenessConfirmationFragment.LivenessConfirmationResult.VideoUploadedSuccessfully) result).getUploadResult());
            return;
        }
        if (result instanceof LivenessConfirmationFragment.LivenessConfirmationResult.OnError.OnInvalidCertificate) {
            OnfidoView onfidoView = this.view;
            if (onfidoView != null) {
                onfidoView.onError(new InvalidCertificateException(((LivenessConfirmationFragment.LivenessConfirmationResult.OnError.OnInvalidCertificate) result).getMessage()));
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (Intrinsics.f(result, LivenessConfirmationFragment.LivenessConfirmationResult.OnError.OnTokenExpired.INSTANCE)) {
            OnfidoView onfidoView2 = this.view;
            if (onfidoView2 != null) {
                onfidoView2.onError(TokenExpiredException.INSTANCE);
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
    }

    public void onMotionCaptured$onfido_capture_sdk_core_release(@NotNull UploadedArtifact videoResult) {
        Intrinsics.checkNotNullParameter(videoResult, "videoResult");
        this.uploadResult.setFace(new Face(videoResult.getId(), FaceCaptureVariant.MOTION));
        nextAction();
    }

    public void onNavigationStarted$onfido_capture_sdk_core_release(PerformanceAnalyticsScreen origin, FlowStep currentStep, @NotNull PerformanceAnalyticsScreen destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (origin == null) {
            PerformanceAnalyticsScreen.Companion companion = PerformanceAnalyticsScreen.INSTANCE;
            Intrinsics.h(currentStep);
            origin = companion.fromFlowAction(currentStep.getAction());
        }
        ScreenLoadTracker.trackNavigationStarted$onfido_capture_sdk_core_release$default(this.screenLoadTracker, origin, destination, null, null, 12, null);
    }

    public void onNfcHostResult$onfido_capture_sdk_core_release(@NotNull NfcHostFragment.NfcHostResult nfcHostResult) {
        Intrinsics.checkNotNullParameter(nfcHostResult, "nfcHostResult");
        if (Intrinsics.f(nfcHostResult, NfcHostFragment.NfcHostResult.Exit.INSTANCE)) {
            this.uploadResult.setDocument(null);
            this.nfcProperties = null;
            onBackPressed$onfido_capture_sdk_core_release();
            zhm.a0.E(this.flowSteps, OnfidoPresenter$onNfcHostResult$1.INSTANCE);
            return;
        }
        if (Intrinsics.f(nfcHostResult, NfcHostFragment.NfcHostResult.ExitOnfidoFlow.INSTANCE)) {
            OnfidoView onfidoView = this.view;
            if (onfidoView != null) {
                onfidoView.exitFlow(ExitCode.REQUIRED_NFC_FLOW_NOT_COMPLETED);
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (Intrinsics.f(nfcHostResult, NfcHostFragment.NfcHostResult.NfcScanSkipped.INSTANCE)) {
            skipNfcScanStep();
            return;
        }
        if (nfcHostResult instanceof NfcHostFragment.NfcHostResult.NfcScanSuccess) {
            OnfidoView onfidoView2 = this.view;
            if (onfidoView2 == null) {
                Intrinsics.r("view");
                throw null;
            }
            onfidoView2.showLoadingDialog("UPLOAD_NFC_DATA");
            NfcHostFragment.NfcHostResult.NfcScanSuccess nfcScanSuccess = (NfcHostFragment.NfcHostResult.NfcScanSuccess) nfcHostResult;
            onNfcScanSucceeded(nfcScanSuccess.getNfcData(), nfcScanSuccess.getNfcFlowType());
        }
    }

    public void onPermissionResult$onfido_capture_sdk_core_release(@NotNull PermissionResult permissionResult) {
        Intrinsics.checkNotNullParameter(permissionResult, "permissionResult");
        if (permissionResult instanceof PermissionResult.Granted) {
            onPermissionsGranted(((PermissionResult.Granted) permissionResult).getCaptureStepDataBundle());
            return;
        }
        if (permissionResult instanceof PermissionResult.Canceled ? true : Intrinsics.f(permissionResult, PermissionResult.NavigateBack.INSTANCE)) {
            onPermissionScreenDismissed();
        }
    }

    public void onPoaResult$onfido_capture_sdk_core_release(@NotNull PoaHostFragment.PoaResult poaResult) {
        Intrinsics.checkNotNullParameter(poaResult, "poaResult");
        if (Intrinsics.f(poaResult, PoaHostFragment.PoaResult.Exit.INSTANCE)) {
            OnfidoView onfidoView = this.view;
            if (onfidoView != null) {
                onfidoView.exitFlow(ExitCode.USER_LEFT_ACTIVITY);
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (Intrinsics.f(poaResult, PoaHostFragment.PoaResult.Canceled.INSTANCE)) {
            onBackPressed$onfido_capture_sdk_core_release();
        } else {
            if (!(poaResult instanceof PoaHostFragment.PoaResult.OnDocumentSubmittedResult)) {
                throw new NoWhenBranchMatchedException();
            }
            PoaHostFragment.PoaResult.OnDocumentSubmittedResult onDocumentSubmittedResult = (PoaHostFragment.PoaResult.OnDocumentSubmittedResult) poaResult;
            this.uploadResult.setPoa(new ProofOfAddress(onDocumentSubmittedResult.getType(), new ProofOfAddress.ProofOfAddressDocumentSide(onDocumentSubmittedResult.getDocumentId(), null), null));
            nextAction();
        }
    }

    public void onRestrictedDocumentSelectionResult$onfido_capture_sdk_core_release(@NotNull DocumentSelectionHostFragment.DocumentSelectionResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof DocumentSelectionHostFragment.DocumentSelectionResult.Exit) {
            previousAction$onfido_capture_sdk_core_release();
        } else if (result instanceof DocumentSelectionHostFragment.DocumentSelectionResult.Completed) {
            DocumentSelectionHostFragment.DocumentSelectionResult.Completed completed = (DocumentSelectionHostFragment.DocumentSelectionResult.Completed) result;
            onDocumentTypeSelected$onfido_capture_sdk_core_release(completed.getDocumentType(), completed.getCountryCode(), completed.getGenericDocTitle(), completed.getGenericDocPages());
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.NfcDataServiceListener
    public void onUploadError(@NotNull ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        if (errorType instanceof ErrorType.TokenExpired) {
            OnfidoView onfidoView = this.view;
            if (onfidoView != null) {
                onfidoView.onError(TokenExpiredException.INSTANCE);
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (errorType instanceof ErrorType.InvalidCertificate) {
            OnfidoView onfidoView2 = this.view;
            if (onfidoView2 != null) {
                onfidoView2.onError(new InvalidCertificateException(((ErrorType.InvalidCertificate) errorType).getMessage()));
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        OnfidoView onfidoView3 = this.view;
        if (onfidoView3 != null) {
            onfidoView3.onError(new InvalidCertificateException(errorType.toString()));
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public void onUserConsentResult$onfido_capture_sdk_core_release(@NotNull UserConsentFragment.UserConsentResult userConsentResult) {
        Intrinsics.checkNotNullParameter(userConsentResult, "userConsentResult");
        if (userConsentResult instanceof UserConsentFragment.UserConsentResult.ConsentAccepted) {
            if (!OnfidoConfigExtensionsKt.inWorkflowMode(getOnfidoConfig())) {
                nextAction();
                removeStep(FlowAction.USER_CONSENT);
                return;
            }
            OnfidoView onfidoView = this.view;
            if (onfidoView == null) {
                Intrinsics.r("view");
                throw null;
            }
            onfidoView.showWorkflowFragment(getOnfidoConfig().getWorkflowConfig());
            this.orchestrationUserConsentVisibility = Visibility.GONE;
            return;
        }
        if (userConsentResult instanceof UserConsentFragment.UserConsentResult.ConsentRejected) {
            OnfidoView onfidoView2 = this.view;
            if (onfidoView2 == null) {
                Intrinsics.r("view");
                throw null;
            }
            onfidoView2.exitFlow(ExitCode.USER_CONSENT_DENIED);
            this.orchestrationUserConsentVisibility = Visibility.GONE;
            return;
        }
        if (Intrinsics.f(userConsentResult, UserConsentFragment.UserConsentResult.ConsentExit.INSTANCE)) {
            OnfidoView onfidoView3 = this.view;
            if (onfidoView3 != null) {
                onfidoView3.exitFlow(ExitCode.USER_LEFT_ACTIVITY);
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
    }

    public void onViewStarted$onfido_capture_sdk_core_release(@NotNull NavigationManager navigationManager) {
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        getNavigationManagerHolder().setNavigationManager(navigationManager);
    }

    public void onViewStopped() {
        this.compositeDisposable.d();
        NfcDataService nfcDataService = this.nfcDataService;
        if (nfcDataService == null) {
            Intrinsics.r("nfcDataService");
            throw null;
        }
        nfcDataService.stop();
        getNavigationManagerHolder().resetNavigationManager();
    }

    public void onWebPoaResult$onfido_capture_sdk_core_release(@NotNull HostedWebModuleResult result) {
        ProofOfAddressCaptureSDKOutput proofOfAddressCaptureSDKOutput;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof HostedWebModuleExit) {
            OnfidoView onfidoView = this.view;
            if (onfidoView != null) {
                onfidoView.exitFlow(ExitCode.USER_LEFT_ACTIVITY);
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (result instanceof HostedWebModuleFailed) {
            OnfidoView onfidoView2 = this.view;
            if (onfidoView2 != null) {
                onfidoView2.onError(new OnfidoException(((HostedWebModuleFailed) result).getBody()));
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (result instanceof HostedWebModuleCancelled) {
            onBackPressed$onfido_capture_sdk_core_release();
            return;
        }
        if (!(result instanceof HostedWebModuleSuccess)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            o oVar = com.onfido.api.client.e.f50133a;
            proofOfAddressCaptureSDKOutput = (ProofOfAddressCaptureSDKOutput) oVar.b(jh.d.v(oVar.f187949b, o0.b(ProofOfAddressCaptureSDKOutput.class)), ((HostedWebModuleSuccess) result).getBody());
        } catch (SerializationException unused) {
            proofOfAddressCaptureSDKOutput = null;
        }
        if (proofOfAddressCaptureSDKOutput == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.uploadResult.setPoa(new ProofOfAddress(proofOfAddressCaptureSDKOutput.getType(), new ProofOfAddress.ProofOfAddressDocumentSide(proofOfAddressCaptureSDKOutput.getSides().getFront().getId(), proofOfAddressCaptureSDKOutput.getSides().getFront().getType()), proofOfAddressCaptureSDKOutput.getSides().getBack() != null ? new ProofOfAddress.ProofOfAddressDocumentSide(proofOfAddressCaptureSDKOutput.getSides().getBack().getId(), proofOfAddressCaptureSDKOutput.getSides().getBack().getType()) : null));
        nextAction();
    }

    public void previousAction$onfido_capture_sdk_core_release() {
        int i = this.flowIndex;
        if (i > 0) {
            setActionWithIndex(i - 1);
            return;
        }
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.exitFlow(ExitCode.USER_LEFT_ACTIVITY);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public void removeLoggerTree$onfido_capture_sdk_core_release() {
        Timber.Companion forest = Timber.INSTANCE;
        if (forest.forest().contains(this.remoteLoggerTree)) {
            this.remoteLoggerTree.onUproot$onfido_capture_sdk_core_release();
            forest.uproot(this.remoteLoggerTree);
        }
    }

    public void setLivenessVideoOptions(@NotNull String videoPath, @NotNull LivenessPerformedChallenges livenessPerformedChallenges) {
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(livenessPerformedChallenges, "livenessPerformedChallenges");
        boolean zIsVideoAvailableOnConfirmationScreen = isVideoAvailableOnConfirmationScreen();
        FlowStep flowStepFindFlowStep = findFlowStep(FlowAction.CAPTURE_LIVENESS_CONFIRMATION);
        if (flowStepFindFlowStep == null) {
            return;
        }
        flowStepFindFlowStep.setOptions(new LivenessConfirmationOptions(videoPath, livenessPerformedChallenges, zIsVideoAvailableOnConfirmationScreen));
    }

    public void setState$onfido_capture_sdk_core_release(@NotNull State value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.flowSteps = d0.f1(value.getFlowSteps());
        this.flowIndex = value.getFlowIndex();
        this.uploadResult = value.getCaptures();
        this.documentType = value.getDocumentType();
        this.countryCode = value.getCountryCode();
        this.nfcProperties = value.getNfcProperties();
    }

    public void setup$onfido_capture_sdk_core_release(@NotNull OnfidoView view, State state) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.nfcDataService = new NfcDataService(this.nfcDataRepository, this, this.schedulersProvider.getIo(), this.schedulersProvider.getUi(), this.waitingScreenTracker);
        if (state != null) {
            setState$onfido_capture_sdk_core_release(state);
        }
        addLoggerTree();
    }

    public void showCaptureStep$onfido_capture_sdk_core_release(boolean isFrontSide, @NotNull CaptureStepDataBundle captureBundle, @NotNull PerformanceAnalyticsScreen currentScreen) {
        Intrinsics.checkNotNullParameter(captureBundle, "captureBundle");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        this.screenLoadTracker.trackNavigationStarted$onfido_capture_sdk_core_release(currentScreen, PerformanceAnalyticsScreen.DOCUMENT_CAPTURE, captureBundle.getDocumentType(), isFrontSide ? DocSide.FRONT : DocSide.BACK);
        NfcArguments nfcArguments = getNfcArguments();
        if (this.onfidoRemoteConfig.isRefactoredCaptureEnabled()) {
            openNewDocumentCapture(isFrontSide, captureBundle, nfcArguments);
            return;
        }
        if (isFrontSide) {
            showEmptyScreen();
        }
        OnfidoView onfidoView = this.view;
        if (onfidoView != null) {
            onfidoView.showDocumentCapture(isFrontSide, captureBundle, nfcArguments);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public boolean useLocalBackNavigation$onfido_capture_sdk_core_release() {
        if (OnfidoConfigExtensionsKt.inWorkflowMode(getOnfidoConfig())) {
            return this.orchestrationUserConsentVisibility == Visibility.GONE;
        }
        if (kotlin.collections.d.I(new FlowAction[]{FlowAction.ACTIVE_VIDEO_CAPTURE, FlowAction.NFC_HOST_FEATURE}, getCurrentAction())) {
            return true;
        }
        return getCurrentAction() == FlowAction.PROOF_OF_ADDRESS && !this.onfidoRemoteConfig.getEnableWebModuleBasedPoa();
    }
}
