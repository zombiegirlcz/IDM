package com.onfido.api.client.data;

import ch.qos.logback.classic.Level;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j6.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.j1;
import qlm.t0;
import qlm.v1;
import yhm.d;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 I2\u00020\u0001:\fGHIJKLMNOPQRBy\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016Be\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0017J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003Ji\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020\u0013HÖ\u0001J&\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EHÁ\u0001¢\u0006\u0002\bFR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010'R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010-R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u0019\u001a\u0004\b/\u00100¨\u0006S"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration;", "", "seen1", "", "validations", "Lcom/onfido/api/client/data/SdkConfiguration$Validations;", "documentCapture", "Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;", "experimentalFeatures", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures;", "livenessCapture", "Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "selfieCapture", "Lcom/onfido/api/client/data/SdkConfiguration$SelfieCapture;", "motionCapture", "Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture;", "sdkFeatures", "Lcom/onfido/api/client/data/SdkConfiguration$SdkFeatures;", "source", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/api/client/data/SdkConfiguration$Validations;Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures;Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;Lcom/onfido/api/client/data/SdkConfiguration$SelfieCapture;Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture;Lcom/onfido/api/client/data/SdkConfiguration$SdkFeatures;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/SdkConfiguration$Validations;Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures;Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;Lcom/onfido/api/client/data/SdkConfiguration$SelfieCapture;Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture;Lcom/onfido/api/client/data/SdkConfiguration$SdkFeatures;Ljava/lang/String;)V", "getDocumentCapture$annotations", "()V", "getDocumentCapture", "()Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;", "getExperimentalFeatures$annotations", "getExperimentalFeatures", "()Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures;", "getLivenessCapture$annotations", "getLivenessCapture", "()Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "getMotionCapture$annotations", "getMotionCapture", "()Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture;", "getSdkFeatures$annotations", "getSdkFeatures", "()Lcom/onfido/api/client/data/SdkConfiguration$SdkFeatures;", "getSelfieCapture$annotations", "getSelfieCapture", "()Lcom/onfido/api/client/data/SdkConfiguration$SelfieCapture;", "getSource$annotations", "getSource", "()Ljava/lang/String;", "getValidations$annotations", "getValidations", "()Lcom/onfido/api/client/data/SdkConfiguration$Validations;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "CameraXConfiguration", "Companion", "DocumentCapture", "ExperimentalFeatures", "LivenessCapture", "LoggerConfiguration", "MotionCapture", "NfcConfiguration", "SdkFeatures", "SelfieCapture", "Validations", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class SdkConfiguration {
    private final DocumentCapture documentCapture;
    private final ExperimentalFeatures experimentalFeatures;
    private final LivenessCapture livenessCapture;
    private final MotionCapture motionCapture;
    private final SdkFeatures sdkFeatures;
    private final SelfieCapture selfieCapture;
    private final String source;
    private final Validations validations;

    @NotNull
    public static final String FIELD_IS_PAYLOAD_SIGNING_ENABLED = "sign_upload";

    @NotNull
    public static final String FIELD_LIVENESS_CAPTURE = "face_video_capture";

    @NotNull
    public static final String FIELD_ENABLE_WEB_MODULE_BASED_POA = "enable_web_module_based_poa";

    @NotNull
    public static final String FIELD_MOTION_CAPTURE = "motion_capture";

    @NotNull
    public static final String FIELD_LOGGER_CONFIGURATION = "logger";

    @NotNull
    public static final String FIELD_REFACTORED_CAPTURE = "android_refactored_capture";

    @NotNull
    public static final String FIELD_ENABLE_IN_HOUSE_ANALYTICS = "enable_in_house_analytics";

    @NotNull
    public static final String FIELD_MOTION_VIDEO_SETTINGS = "video_settings";

    @NotNull
    public static final String FIELD_ENABLE_PERFORMANCE_ANALYTICS = "enable_performance_analytics";

    @NotNull
    public static final String FIELD_ENABLE_REQUIRE_APPLICANT_CONSENTS = "enable_require_applicant_consents";

    @NotNull
    public static final String FIELD_SELFIE_CAPTURE = "face_selfie_capture";

    @NotNull
    public static final String FIELD_ENABLE_DOCUMENT_SUPPORT_RULES = "enable_document_support_rules";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267Bi\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001J&\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204HÁ\u0001¢\u0006\u0002\b5R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\n\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0013¨\u00068"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;", "", "seen1", "", "shouldInterruptVideoRecoverableError", "", "shouldInterruptImageRecoverableError", "shouldRemovePreviewVideoRecording", "shouldUseResolutionStrategy", "shouldRetryViewPortFailure", "isViewPortRequired", "isFallbackEnabled", "isVideoAspectRatioFallbackEnabled", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZZZZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZZZZZZZ)V", "isFallbackEnabled$annotations", "()V", "()Z", "isVideoAspectRatioFallbackEnabled$annotations", "isViewPortRequired$annotations", "getShouldInterruptImageRecoverableError$annotations", "getShouldInterruptImageRecoverableError", "getShouldInterruptVideoRecoverableError$annotations", "getShouldInterruptVideoRecoverableError", "getShouldRemovePreviewVideoRecording$annotations", "getShouldRemovePreviewVideoRecording", "getShouldRetryViewPortFailure$annotations", "getShouldRetryViewPortFailure", "getShouldUseResolutionStrategy$annotations", "getShouldUseResolutionStrategy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class CameraXConfiguration {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final boolean isFallbackEnabled;
        private final boolean isVideoAspectRatioFallbackEnabled;
        private final boolean isViewPortRequired;
        private final boolean shouldInterruptImageRecoverableError;
        private final boolean shouldInterruptVideoRecoverableError;
        private final boolean shouldRemovePreviewVideoRecording;
        private final boolean shouldRetryViewPortFailure;
        private final boolean shouldUseResolutionStrategy;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SdkConfiguration$CameraXConfiguration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CameraXConfiguration() {
            this(false, false, false, false, false, false, false, false, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ CameraXConfiguration copy$default(CameraXConfiguration cameraXConfiguration, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = cameraXConfiguration.shouldInterruptVideoRecoverableError;
            }
            if ((i & 2) != 0) {
                z3 = cameraXConfiguration.shouldInterruptImageRecoverableError;
            }
            if ((i & 4) != 0) {
                z4 = cameraXConfiguration.shouldRemovePreviewVideoRecording;
            }
            if ((i & 8) != 0) {
                z6 = cameraXConfiguration.shouldUseResolutionStrategy;
            }
            if ((i & 16) != 0) {
                z11 = cameraXConfiguration.shouldRetryViewPortFailure;
            }
            if ((i & 32) != 0) {
                z12 = cameraXConfiguration.isViewPortRequired;
            }
            if ((i & 64) != 0) {
                z29 = cameraXConfiguration.isFallbackEnabled;
            }
            if ((i & 128) != 0) {
                z31 = cameraXConfiguration.isVideoAspectRatioFallbackEnabled;
            }
            boolean z41 = z29;
            boolean z49 = z31;
            boolean z54 = z11;
            boolean z74 = z12;
            return cameraXConfiguration.copy(z, z3, z4, z6, z54, z74, z41, z49);
        }

        public static /* synthetic */ void getShouldInterruptImageRecoverableError$annotations() {
        }

        public static /* synthetic */ void getShouldInterruptVideoRecoverableError$annotations() {
        }

        public static /* synthetic */ void getShouldRemovePreviewVideoRecording$annotations() {
        }

        public static /* synthetic */ void getShouldRetryViewPortFailure$annotations() {
        }

        public static /* synthetic */ void getShouldUseResolutionStrategy$annotations() {
        }

        public static /* synthetic */ void isFallbackEnabled$annotations() {
        }

        public static /* synthetic */ void isVideoAspectRatioFallbackEnabled$annotations() {
        }

        public static /* synthetic */ void isViewPortRequired$annotations() {
        }

        public static final /* synthetic */ void write$Self$onfido_api_client(CameraXConfiguration self, CompositeEncoder output, SerialDescriptor serialDesc) {
            if (output.d(serialDesc) || !self.shouldInterruptVideoRecoverableError) {
                output.encodeBooleanElement(serialDesc, 0, self.shouldInterruptVideoRecoverableError);
            }
            if (output.d(serialDesc) || !self.shouldInterruptImageRecoverableError) {
                output.encodeBooleanElement(serialDesc, 1, self.shouldInterruptImageRecoverableError);
            }
            if (output.d(serialDesc) || !self.shouldRemovePreviewVideoRecording) {
                output.encodeBooleanElement(serialDesc, 2, self.shouldRemovePreviewVideoRecording);
            }
            if (output.d(serialDesc) || !self.shouldUseResolutionStrategy) {
                output.encodeBooleanElement(serialDesc, 3, self.shouldUseResolutionStrategy);
            }
            if (output.d(serialDesc) || self.shouldRetryViewPortFailure) {
                output.encodeBooleanElement(serialDesc, 4, self.shouldRetryViewPortFailure);
            }
            if (output.d(serialDesc) || self.isViewPortRequired) {
                output.encodeBooleanElement(serialDesc, 5, self.isViewPortRequired);
            }
            if (output.d(serialDesc) || !self.isFallbackEnabled) {
                output.encodeBooleanElement(serialDesc, 6, self.isFallbackEnabled);
            }
            if (!output.d(serialDesc) && self.isVideoAspectRatioFallbackEnabled) {
                return;
            }
            output.encodeBooleanElement(serialDesc, 7, self.isVideoAspectRatioFallbackEnabled);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShouldInterruptVideoRecoverableError() {
            return this.shouldInterruptVideoRecoverableError;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShouldInterruptImageRecoverableError() {
            return this.shouldInterruptImageRecoverableError;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShouldRemovePreviewVideoRecording() {
            return this.shouldRemovePreviewVideoRecording;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShouldUseResolutionStrategy() {
            return this.shouldUseResolutionStrategy;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getShouldRetryViewPortFailure() {
            return this.shouldRetryViewPortFailure;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsViewPortRequired() {
            return this.isViewPortRequired;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsFallbackEnabled() {
            return this.isFallbackEnabled;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsVideoAspectRatioFallbackEnabled() {
            return this.isVideoAspectRatioFallbackEnabled;
        }

        @NotNull
        public final CameraXConfiguration copy(boolean shouldInterruptVideoRecoverableError, boolean shouldInterruptImageRecoverableError, boolean shouldRemovePreviewVideoRecording, boolean shouldUseResolutionStrategy, boolean shouldRetryViewPortFailure, boolean isViewPortRequired, boolean isFallbackEnabled, boolean isVideoAspectRatioFallbackEnabled) {
            return new CameraXConfiguration(shouldInterruptVideoRecoverableError, shouldInterruptImageRecoverableError, shouldRemovePreviewVideoRecording, shouldUseResolutionStrategy, shouldRetryViewPortFailure, isViewPortRequired, isFallbackEnabled, isVideoAspectRatioFallbackEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraXConfiguration)) {
                return false;
            }
            CameraXConfiguration cameraXConfiguration = (CameraXConfiguration) other;
            return this.shouldInterruptVideoRecoverableError == cameraXConfiguration.shouldInterruptVideoRecoverableError && this.shouldInterruptImageRecoverableError == cameraXConfiguration.shouldInterruptImageRecoverableError && this.shouldRemovePreviewVideoRecording == cameraXConfiguration.shouldRemovePreviewVideoRecording && this.shouldUseResolutionStrategy == cameraXConfiguration.shouldUseResolutionStrategy && this.shouldRetryViewPortFailure == cameraXConfiguration.shouldRetryViewPortFailure && this.isViewPortRequired == cameraXConfiguration.isViewPortRequired && this.isFallbackEnabled == cameraXConfiguration.isFallbackEnabled && this.isVideoAspectRatioFallbackEnabled == cameraXConfiguration.isVideoAspectRatioFallbackEnabled;
        }

        public final boolean getShouldInterruptImageRecoverableError() {
            return this.shouldInterruptImageRecoverableError;
        }

        public final boolean getShouldInterruptVideoRecoverableError() {
            return this.shouldInterruptVideoRecoverableError;
        }

        public final boolean getShouldRemovePreviewVideoRecording() {
            return this.shouldRemovePreviewVideoRecording;
        }

        public final boolean getShouldRetryViewPortFailure() {
            return this.shouldRetryViewPortFailure;
        }

        public final boolean getShouldUseResolutionStrategy() {
            return this.shouldUseResolutionStrategy;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVideoAspectRatioFallbackEnabled) + a.c(a.c(a.c(a.c(a.c(a.c(Boolean.hashCode(this.shouldInterruptVideoRecoverableError) * 31, 31, this.shouldInterruptImageRecoverableError), 31, this.shouldRemovePreviewVideoRecording), 31, this.shouldUseResolutionStrategy), 31, this.shouldRetryViewPortFailure), 31, this.isViewPortRequired), 31, this.isFallbackEnabled);
        }

        public final boolean isFallbackEnabled() {
            return this.isFallbackEnabled;
        }

        public final boolean isVideoAspectRatioFallbackEnabled() {
            return this.isVideoAspectRatioFallbackEnabled;
        }

        public final boolean isViewPortRequired() {
            return this.isViewPortRequired;
        }

        @NotNull
        public String toString() {
            boolean z = this.shouldInterruptVideoRecoverableError;
            boolean z3 = this.shouldInterruptImageRecoverableError;
            boolean z4 = this.shouldRemovePreviewVideoRecording;
            boolean z6 = this.shouldUseResolutionStrategy;
            boolean z11 = this.shouldRetryViewPortFailure;
            boolean z12 = this.isViewPortRequired;
            boolean z29 = this.isFallbackEnabled;
            boolean z31 = this.isVideoAspectRatioFallbackEnabled;
            StringBuilder sb6 = new StringBuilder("CameraXConfiguration(shouldInterruptVideoRecoverableError=");
            sb6.append(z);
            sb6.append(", shouldInterruptImageRecoverableError=");
            sb6.append(z3);
            sb6.append(", shouldRemovePreviewVideoRecording=");
            t61.a.y(sb6, z4, ", shouldUseResolutionStrategy=", z6, ", shouldRetryViewPortFailure=");
            t61.a.y(sb6, z11, ", isViewPortRequired=", z12, ", isFallbackEnabled=");
            sb6.append(z29);
            sb6.append(", isVideoAspectRatioFallbackEnabled=");
            sb6.append(z31);
            sb6.append(")");
            return sb6.toString();
        }

        @d
        public /* synthetic */ CameraXConfiguration(int i, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.shouldInterruptVideoRecoverableError = true;
            } else {
                this.shouldInterruptVideoRecoverableError = z;
            }
            if ((i & 2) == 0) {
                this.shouldInterruptImageRecoverableError = true;
            } else {
                this.shouldInterruptImageRecoverableError = z3;
            }
            if ((i & 4) == 0) {
                this.shouldRemovePreviewVideoRecording = true;
            } else {
                this.shouldRemovePreviewVideoRecording = z4;
            }
            if ((i & 8) == 0) {
                this.shouldUseResolutionStrategy = true;
            } else {
                this.shouldUseResolutionStrategy = z6;
            }
            if ((i & 16) == 0) {
                this.shouldRetryViewPortFailure = false;
            } else {
                this.shouldRetryViewPortFailure = z11;
            }
            if ((i & 32) == 0) {
                this.isViewPortRequired = false;
            } else {
                this.isViewPortRequired = z12;
            }
            if ((i & 64) == 0) {
                this.isFallbackEnabled = true;
            } else {
                this.isFallbackEnabled = z29;
            }
            if ((i & 128) == 0) {
                this.isVideoAspectRatioFallbackEnabled = true;
            } else {
                this.isVideoAspectRatioFallbackEnabled = z31;
            }
        }

        public CameraXConfiguration(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
            this.shouldInterruptVideoRecoverableError = z;
            this.shouldInterruptImageRecoverableError = z3;
            this.shouldRemovePreviewVideoRecording = z4;
            this.shouldUseResolutionStrategy = z6;
            this.shouldRetryViewPortFailure = z11;
            this.isViewPortRequired = z12;
            this.isFallbackEnabled = z29;
            this.isVideoAspectRatioFallbackEnabled = z31;
        }

        public /* synthetic */ CameraXConfiguration(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z3, (i & 4) != 0 ? true : z4, (i & 8) != 0 ? true : z6, (i & 16) != 0 ? false : z11, (i & 32) != 0 ? false : z12, (i & 64) != 0 ? true : z29, (i & 128) != 0 ? true : z31);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$Companion;", "", "()V", "FIELD_ENABLE_DOCUMENT_SUPPORT_RULES", "", "FIELD_ENABLE_IN_HOUSE_ANALYTICS", "FIELD_ENABLE_PERFORMANCE_ANALYTICS", "FIELD_ENABLE_REQUIRE_APPLICANT_CONSENTS", "FIELD_ENABLE_WEB_MODULE_BASED_POA", "FIELD_IS_PAYLOAD_SIGNING_ENABLED", "FIELD_LIVENESS_CAPTURE", "FIELD_LOGGER_CONFIGURATION", "FIELD_MOTION_CAPTURE", "FIELD_MOTION_VIDEO_SETTINGS", "FIELD_REFACTORED_CAPTURE", "FIELD_SELFIE_CAPTURE", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SdkConfiguration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0003\\]^B½\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aB¥\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u001bJ\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\t\u0010B\u001a\u00020\u000bHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0017HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u000bHÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u000bHÆ\u0003J©\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001J\u0013\u0010O\u001a\u00020\u000b2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\t\u0010R\u001a\u00020SHÖ\u0001J&\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZHÁ\u0001¢\u0006\u0002\b[R\u001c\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010%R\u001c\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001d\u001a\u0004\b\u0013\u0010'R\u001c\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001d\u001a\u0004\b\u000e\u0010'R\u001c\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001d\u001a\u0004\b\u0012\u0010'R\u001c\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001d\u001a\u0004\b\u0011\u0010'R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010%R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010/R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010%R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\"R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010%R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001d\u001a\u0004\b7\u0010\"R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u001d\u001a\u0004\b9\u0010%R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001d\u001a\u0004\b;\u0010'R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\u001d\u001a\u0004\b=\u0010\"¨\u0006_"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;", "", "seen1", "", "torchTurnOnTimeMs", "", "videoLengthMs", "videoTimeoutMs", "videoBitrate", "videoQuality", "videoRequired", "", "barcodeDetectionTimeoutMs", "maxTotalRetries", "isMrzDetectionEnabled", "nfc", "Lcom/onfido/api/client/data/SdkConfiguration$NfcConfiguration;", "isPinEnabled", "isPassportCardEnabled", "isCameraXViewPortEnabled", "imageCompressionQuality", "targetResolutionWidth", "addressPageCapture", "Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture$AddressPageCapture;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJJJIIZJIZLcom/onfido/api/client/data/SdkConfiguration$NfcConfiguration;ZZZIILcom/onfido/api/client/data/SdkConfiguration$DocumentCapture$AddressPageCapture;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JJJIIZJIZLcom/onfido/api/client/data/SdkConfiguration$NfcConfiguration;ZZZIILcom/onfido/api/client/data/SdkConfiguration$DocumentCapture$AddressPageCapture;)V", "getAddressPageCapture$annotations", "()V", "getAddressPageCapture", "()Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture$AddressPageCapture;", "getBarcodeDetectionTimeoutMs$annotations", "getBarcodeDetectionTimeoutMs", "()J", "getImageCompressionQuality$annotations", "getImageCompressionQuality", "()I", "isCameraXViewPortEnabled$annotations", "()Z", "isMrzDetectionEnabled$annotations", "isPassportCardEnabled$annotations", "isPinEnabled$annotations", "getMaxTotalRetries$annotations", "getMaxTotalRetries", "getNfc$annotations", "getNfc", "()Lcom/onfido/api/client/data/SdkConfiguration$NfcConfiguration;", "getTargetResolutionWidth$annotations", "getTargetResolutionWidth", "getTorchTurnOnTimeMs$annotations", "getTorchTurnOnTimeMs", "getVideoBitrate$annotations", "getVideoBitrate", "getVideoLengthMs$annotations", "getVideoLengthMs", "getVideoQuality$annotations", "getVideoQuality", "getVideoRequired$annotations", "getVideoRequired", "getVideoTimeoutMs$annotations", "getVideoTimeoutMs", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "AddressPageCapture", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class DocumentCapture {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final DocumentCapture DEFAULT = new DocumentCapture(0L, 0L, 0L, 0, 0, false, 0L, 0, false, (NfcConfiguration) null, false, false, false, 0, 0, (AddressPageCapture) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
        private static final long DEFAULT_BARCODE_DETECTION_TIMEOUT_IN_MS = 5000;
        private static final long DEFAULT_DOCUMENT_RECORDING_DURATION_IN_MS = 1500;
        private static final long DEFAULT_DOCUMENT_RECORDING_TIMEOUT_IN_MS = 10000;
        private static final int DEFAULT_DOCUMENT_VIDEO_BITRATE = 3000000;
        private static final int DEFAULT_DOCUMENT_VIDEO_QUALITY = 1080;
        private static final int DEFAULT_IMAGE_COMPRESSION_QUALITY = 100;
        private static final int DEFAULT_MAX_RETRY = 2;
        private static final int DOC_CAPTURE_TARGET_RESOLUTION_WIDTH = 1920;

        @NotNull
        private final AddressPageCapture addressPageCapture;
        private final long barcodeDetectionTimeoutMs;
        private final int imageCompressionQuality;
        private final boolean isCameraXViewPortEnabled;
        private final boolean isMrzDetectionEnabled;
        private final boolean isPassportCardEnabled;
        private final boolean isPinEnabled;
        private final int maxTotalRetries;

        @NotNull
        private final NfcConfiguration nfc;
        private final int targetResolutionWidth;
        private final long torchTurnOnTimeMs;
        private final int videoBitrate;
        private final long videoLengthMs;
        private final int videoQuality;
        private final boolean videoRequired;
        private final long videoTimeoutMs;

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BG\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÁ\u0001¢\u0006\u0002\b&R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture$AddressPageCapture;", "", "seen1", "", "enableAddressPageCaptureForClassicFlow", "", "addressPageEnabledCountries", "", "", "addressPageEnabledWorkflowIds", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/util/List;Ljava/util/List;)V", "getAddressPageEnabledCountries$annotations", "()V", "getAddressPageEnabledCountries", "()Ljava/util/List;", "getAddressPageEnabledWorkflowIds$annotations", "getAddressPageEnabledWorkflowIds", "getEnableAddressPageCaptureForClassicFlow$annotations", "getEnableAddressPageCaptureForClassicFlow", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @g
        public static final /* data */ class AddressPageCapture {

            @NotNull
            private static final KSerializer[] $childSerializers;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final List<String> addressPageEnabledCountries;

            @NotNull
            private final List<String> addressPageEnabledWorkflowIds;
            private final boolean enableAddressPageCaptureForClassicFlow;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture$AddressPageCapture$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture$AddressPageCapture;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer serializer() {
                    return SdkConfiguration$DocumentCapture$AddressPageCapture$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            static {
                v1 v1Var = v1.f247718a;
                $childSerializers = new KSerializer[]{null, new e(v1Var), new e(v1Var)};
            }

            public AddressPageCapture() {
                this(false, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AddressPageCapture copy$default(AddressPageCapture addressPageCapture, boolean z, List list, List list2, int i, Object obj2) {
                if ((i & 1) != 0) {
                    z = addressPageCapture.enableAddressPageCaptureForClassicFlow;
                }
                if ((i & 2) != 0) {
                    list = addressPageCapture.addressPageEnabledCountries;
                }
                if ((i & 4) != 0) {
                    list2 = addressPageCapture.addressPageEnabledWorkflowIds;
                }
                return addressPageCapture.copy(z, list, list2);
            }

            public static /* synthetic */ void getAddressPageEnabledCountries$annotations() {
            }

            public static /* synthetic */ void getAddressPageEnabledWorkflowIds$annotations() {
            }

            public static /* synthetic */ void getEnableAddressPageCaptureForClassicFlow$annotations() {
            }

            public static final void write$Self$onfido_api_client(AddressPageCapture self, CompositeEncoder output, SerialDescriptor serialDesc) {
                KSerializer[] kSerializerArr = $childSerializers;
                if (output.d(serialDesc) || self.enableAddressPageCaptureForClassicFlow) {
                    output.encodeBooleanElement(serialDesc, 0, self.enableAddressPageCaptureForClassicFlow);
                }
                if (output.d(serialDesc) || !Intrinsics.f(self.addressPageEnabledCountries, f0.f322471a)) {
                    output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.addressPageEnabledCountries);
                }
                if (!output.d(serialDesc) && Intrinsics.f(self.addressPageEnabledWorkflowIds, f0.f322471a)) {
                    return;
                }
                output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.addressPageEnabledWorkflowIds);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getEnableAddressPageCaptureForClassicFlow() {
                return this.enableAddressPageCaptureForClassicFlow;
            }

            @NotNull
            public final List<String> component2() {
                return this.addressPageEnabledCountries;
            }

            @NotNull
            public final List<String> component3() {
                return this.addressPageEnabledWorkflowIds;
            }

            @NotNull
            public final AddressPageCapture copy(boolean enableAddressPageCaptureForClassicFlow, @NotNull List<String> addressPageEnabledCountries, @NotNull List<String> addressPageEnabledWorkflowIds) {
                Intrinsics.checkNotNullParameter(addressPageEnabledCountries, "addressPageEnabledCountries");
                Intrinsics.checkNotNullParameter(addressPageEnabledWorkflowIds, "addressPageEnabledWorkflowIds");
                return new AddressPageCapture(enableAddressPageCaptureForClassicFlow, addressPageEnabledCountries, addressPageEnabledWorkflowIds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddressPageCapture)) {
                    return false;
                }
                AddressPageCapture addressPageCapture = (AddressPageCapture) other;
                return this.enableAddressPageCaptureForClassicFlow == addressPageCapture.enableAddressPageCaptureForClassicFlow && Intrinsics.f(this.addressPageEnabledCountries, addressPageCapture.addressPageEnabledCountries) && Intrinsics.f(this.addressPageEnabledWorkflowIds, addressPageCapture.addressPageEnabledWorkflowIds);
            }

            @NotNull
            public final List<String> getAddressPageEnabledCountries() {
                return this.addressPageEnabledCountries;
            }

            @NotNull
            public final List<String> getAddressPageEnabledWorkflowIds() {
                return this.addressPageEnabledWorkflowIds;
            }

            public final boolean getEnableAddressPageCaptureForClassicFlow() {
                return this.enableAddressPageCaptureForClassicFlow;
            }

            public int hashCode() {
                return this.addressPageEnabledWorkflowIds.hashCode() + p.a.d(Boolean.hashCode(this.enableAddressPageCaptureForClassicFlow) * 31, 31, this.addressPageEnabledCountries);
            }

            @NotNull
            public String toString() {
                boolean z = this.enableAddressPageCaptureForClassicFlow;
                List<String> list = this.addressPageEnabledCountries;
                List<String> list2 = this.addressPageEnabledWorkflowIds;
                StringBuilder sb6 = new StringBuilder("AddressPageCapture(enableAddressPageCaptureForClassicFlow=");
                sb6.append(z);
                sb6.append(", addressPageEnabledCountries=");
                sb6.append(list);
                sb6.append(", addressPageEnabledWorkflowIds=");
                return t61.a.q(")", list2, sb6);
            }

            public AddressPageCapture(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? f0.f322471a : list, (i & 4) != 0 ? f0.f322471a : list2);
            }

            @d
            public AddressPageCapture(int i, boolean z, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
                this.enableAddressPageCaptureForClassicFlow = (i & 1) == 0 ? false : z;
                if ((i & 2) == 0) {
                    this.addressPageEnabledCountries = f0.f322471a;
                } else {
                    this.addressPageEnabledCountries = list;
                }
                if ((i & 4) == 0) {
                    this.addressPageEnabledWorkflowIds = f0.f322471a;
                } else {
                    this.addressPageEnabledWorkflowIds = list2;
                }
            }

            public AddressPageCapture(boolean z, @NotNull List<String> addressPageEnabledCountries, @NotNull List<String> addressPageEnabledWorkflowIds) {
                Intrinsics.checkNotNullParameter(addressPageEnabledCountries, "addressPageEnabledCountries");
                Intrinsics.checkNotNullParameter(addressPageEnabledWorkflowIds, "addressPageEnabledWorkflowIds");
                this.enableAddressPageCaptureForClassicFlow = z;
                this.addressPageEnabledCountries = addressPageEnabledCountries;
                this.addressPageEnabledWorkflowIds = addressPageEnabledWorkflowIds;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012HÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture$Companion;", "", "()V", "DEFAULT", "Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;", "getDEFAULT", "()Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;", "DEFAULT_BARCODE_DETECTION_TIMEOUT_IN_MS", "", "DEFAULT_DOCUMENT_RECORDING_DURATION_IN_MS", "DEFAULT_DOCUMENT_RECORDING_TIMEOUT_IN_MS", "DEFAULT_DOCUMENT_VIDEO_BITRATE", "", "DEFAULT_DOCUMENT_VIDEO_QUALITY", "DEFAULT_IMAGE_COMPRESSION_QUALITY", "DEFAULT_MAX_RETRY", "DOC_CAPTURE_TARGET_RESOLUTION_WIDTH", "serializer", "Lkotlinx/serialization/KSerializer;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final DocumentCapture getDEFAULT() {
                return DocumentCapture.DEFAULT;
            }

            @NotNull
            public final KSerializer serializer() {
                return SdkConfiguration$DocumentCapture$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public DocumentCapture() {
            this(0L, 0L, 0L, 0, 0, false, 0L, 0, false, (NfcConfiguration) null, false, false, false, 0, 0, (AddressPageCapture) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ DocumentCapture copy$default(DocumentCapture documentCapture, long j2, long j3, long j5, int i, int i2, boolean z, long j16, int i3, boolean z3, NfcConfiguration nfcConfiguration, boolean z4, boolean z6, boolean z11, int i5, int i6, AddressPageCapture addressPageCapture, int i21, Object obj2) {
            long j22 = (i21 & 1) != 0 ? documentCapture.torchTurnOnTimeMs : j2;
            return documentCapture.copy(j22, (i21 & 2) != 0 ? documentCapture.videoLengthMs : j3, (i21 & 4) != 0 ? documentCapture.videoTimeoutMs : j5, (i21 & 8) != 0 ? documentCapture.videoBitrate : i, (i21 & 16) != 0 ? documentCapture.videoQuality : i2, (i21 & 32) != 0 ? documentCapture.videoRequired : z, (i21 & 64) != 0 ? documentCapture.barcodeDetectionTimeoutMs : j16, (i21 & 128) != 0 ? documentCapture.maxTotalRetries : i3, (i21 & 256) != 0 ? documentCapture.isMrzDetectionEnabled : z3, (i21 & 512) != 0 ? documentCapture.nfc : nfcConfiguration, (i21 & 1024) != 0 ? documentCapture.isPinEnabled : z4, (i21 & 2048) != 0 ? documentCapture.isPassportCardEnabled : z6, (i21 & 4096) != 0 ? documentCapture.isCameraXViewPortEnabled : z11, (i21 & 8192) != 0 ? documentCapture.imageCompressionQuality : i5, (i21 & 16384) != 0 ? documentCapture.targetResolutionWidth : i6, (i21 & 32768) != 0 ? documentCapture.addressPageCapture : addressPageCapture);
        }

        public static /* synthetic */ void getAddressPageCapture$annotations() {
        }

        public static /* synthetic */ void getBarcodeDetectionTimeoutMs$annotations() {
        }

        public static /* synthetic */ void getImageCompressionQuality$annotations() {
        }

        public static /* synthetic */ void getMaxTotalRetries$annotations() {
        }

        public static /* synthetic */ void getNfc$annotations() {
        }

        public static /* synthetic */ void getTargetResolutionWidth$annotations() {
        }

        public static /* synthetic */ void getTorchTurnOnTimeMs$annotations() {
        }

        public static /* synthetic */ void getVideoBitrate$annotations() {
        }

        public static /* synthetic */ void getVideoLengthMs$annotations() {
        }

        public static /* synthetic */ void getVideoQuality$annotations() {
        }

        public static /* synthetic */ void getVideoRequired$annotations() {
        }

        public static /* synthetic */ void getVideoTimeoutMs$annotations() {
        }

        public static /* synthetic */ void isCameraXViewPortEnabled$annotations() {
        }

        public static /* synthetic */ void isMrzDetectionEnabled$annotations() {
        }

        public static /* synthetic */ void isPassportCardEnabled$annotations() {
        }

        public static /* synthetic */ void isPinEnabled$annotations() {
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void write$Self$onfido_api_client(com.onfido.api.client.data.SdkConfiguration.DocumentCapture r9, kotlinx.serialization.encoding.CompositeEncoder r10, kotlinx.serialization.descriptors.SerialDescriptor r11) {
            /*
                Method dump skipped, instruction units count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.api.client.data.SdkConfiguration.DocumentCapture.write$Self$onfido_api_client(com.onfido.api.client.data.SdkConfiguration$DocumentCapture, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTorchTurnOnTimeMs() {
            return this.torchTurnOnTimeMs;
        }

        @NotNull
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final NfcConfiguration getNfc() {
            return this.nfc;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final boolean getIsPinEnabled() {
            return this.isPinEnabled;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final boolean getIsPassportCardEnabled() {
            return this.isPassportCardEnabled;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final boolean getIsCameraXViewPortEnabled() {
            return this.isCameraXViewPortEnabled;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final int getImageCompressionQuality() {
            return this.imageCompressionQuality;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final int getTargetResolutionWidth() {
            return this.targetResolutionWidth;
        }

        @NotNull
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final AddressPageCapture getAddressPageCapture() {
            return this.addressPageCapture;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getVideoLengthMs() {
            return this.videoLengthMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getVideoTimeoutMs() {
            return this.videoTimeoutMs;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getVideoBitrate() {
            return this.videoBitrate;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getVideoQuality() {
            return this.videoQuality;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getVideoRequired() {
            return this.videoRequired;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final long getBarcodeDetectionTimeoutMs() {
            return this.barcodeDetectionTimeoutMs;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getMaxTotalRetries() {
            return this.maxTotalRetries;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsMrzDetectionEnabled() {
            return this.isMrzDetectionEnabled;
        }

        @NotNull
        public final DocumentCapture copy(long torchTurnOnTimeMs, long videoLengthMs, long videoTimeoutMs, int videoBitrate, int videoQuality, boolean videoRequired, long barcodeDetectionTimeoutMs, int maxTotalRetries, boolean isMrzDetectionEnabled, @NotNull NfcConfiguration nfc2, boolean isPinEnabled, boolean isPassportCardEnabled, boolean isCameraXViewPortEnabled, int imageCompressionQuality, int targetResolutionWidth, @NotNull AddressPageCapture addressPageCapture) {
            Intrinsics.checkNotNullParameter(nfc2, "nfc");
            Intrinsics.checkNotNullParameter(addressPageCapture, "addressPageCapture");
            return new DocumentCapture(torchTurnOnTimeMs, videoLengthMs, videoTimeoutMs, videoBitrate, videoQuality, videoRequired, barcodeDetectionTimeoutMs, maxTotalRetries, isMrzDetectionEnabled, nfc2, isPinEnabled, isPassportCardEnabled, isCameraXViewPortEnabled, imageCompressionQuality, targetResolutionWidth, addressPageCapture);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentCapture)) {
                return false;
            }
            DocumentCapture documentCapture = (DocumentCapture) other;
            return this.torchTurnOnTimeMs == documentCapture.torchTurnOnTimeMs && this.videoLengthMs == documentCapture.videoLengthMs && this.videoTimeoutMs == documentCapture.videoTimeoutMs && this.videoBitrate == documentCapture.videoBitrate && this.videoQuality == documentCapture.videoQuality && this.videoRequired == documentCapture.videoRequired && this.barcodeDetectionTimeoutMs == documentCapture.barcodeDetectionTimeoutMs && this.maxTotalRetries == documentCapture.maxTotalRetries && this.isMrzDetectionEnabled == documentCapture.isMrzDetectionEnabled && Intrinsics.f(this.nfc, documentCapture.nfc) && this.isPinEnabled == documentCapture.isPinEnabled && this.isPassportCardEnabled == documentCapture.isPassportCardEnabled && this.isCameraXViewPortEnabled == documentCapture.isCameraXViewPortEnabled && this.imageCompressionQuality == documentCapture.imageCompressionQuality && this.targetResolutionWidth == documentCapture.targetResolutionWidth && Intrinsics.f(this.addressPageCapture, documentCapture.addressPageCapture);
        }

        @NotNull
        public final AddressPageCapture getAddressPageCapture() {
            return this.addressPageCapture;
        }

        public final long getBarcodeDetectionTimeoutMs() {
            return this.barcodeDetectionTimeoutMs;
        }

        public final int getImageCompressionQuality() {
            return this.imageCompressionQuality;
        }

        public final int getMaxTotalRetries() {
            return this.maxTotalRetries;
        }

        @NotNull
        public final NfcConfiguration getNfc() {
            return this.nfc;
        }

        public final int getTargetResolutionWidth() {
            return this.targetResolutionWidth;
        }

        public final long getTorchTurnOnTimeMs() {
            return this.torchTurnOnTimeMs;
        }

        public final int getVideoBitrate() {
            return this.videoBitrate;
        }

        public final long getVideoLengthMs() {
            return this.videoLengthMs;
        }

        public final int getVideoQuality() {
            return this.videoQuality;
        }

        public final boolean getVideoRequired() {
            return this.videoRequired;
        }

        public final long getVideoTimeoutMs() {
            return this.videoTimeoutMs;
        }

        public int hashCode() {
            return this.addressPageCapture.hashCode() + a.b(this.targetResolutionWidth, a.b(this.imageCompressionQuality, a.c(a.c(a.c((this.nfc.hashCode() + a.c(a.b(this.maxTotalRetries, a0.d.c(a.c(a.b(this.videoQuality, a.b(this.videoBitrate, a0.d.c(a0.d.c(Long.hashCode(this.torchTurnOnTimeMs) * 31, 31, this.videoLengthMs), 31, this.videoTimeoutMs), 31), 31), 31, this.videoRequired), 31, this.barcodeDetectionTimeoutMs), 31), 31, this.isMrzDetectionEnabled)) * 31, 31, this.isPinEnabled), 31, this.isPassportCardEnabled), 31, this.isCameraXViewPortEnabled), 31), 31);
        }

        public final boolean isCameraXViewPortEnabled() {
            return this.isCameraXViewPortEnabled;
        }

        public final boolean isMrzDetectionEnabled() {
            return this.isMrzDetectionEnabled;
        }

        public final boolean isPassportCardEnabled() {
            return this.isPassportCardEnabled;
        }

        public final boolean isPinEnabled() {
            return this.isPinEnabled;
        }

        @NotNull
        public String toString() {
            long j2 = this.torchTurnOnTimeMs;
            long j3 = this.videoLengthMs;
            long j5 = this.videoTimeoutMs;
            int i = this.videoBitrate;
            int i2 = this.videoQuality;
            boolean z = this.videoRequired;
            long j16 = this.barcodeDetectionTimeoutMs;
            int i3 = this.maxTotalRetries;
            boolean z3 = this.isMrzDetectionEnabled;
            NfcConfiguration nfcConfiguration = this.nfc;
            boolean z4 = this.isPinEnabled;
            boolean z6 = this.isPassportCardEnabled;
            boolean z11 = this.isCameraXViewPortEnabled;
            int i5 = this.imageCompressionQuality;
            int i6 = this.targetResolutionWidth;
            AddressPageCapture addressPageCapture = this.addressPageCapture;
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "DocumentCapture(torchTurnOnTimeMs=", ", videoLengthMs=");
            sbV.append(j3);
            sbV.append(", videoTimeoutMs=");
            sbV.append(j5);
            sbV.append(", videoBitrate=");
            t61.a.x(sbV, i, ", videoQuality=", i2, ", videoRequired=");
            sbV.append(z);
            sbV.append(", barcodeDetectionTimeoutMs=");
            sbV.append(j16);
            sbV.append(", maxTotalRetries=");
            sbV.append(i3);
            sbV.append(", isMrzDetectionEnabled=");
            sbV.append(z3);
            sbV.append(", nfc=");
            sbV.append(nfcConfiguration);
            sbV.append(", isPinEnabled=");
            sbV.append(z4);
            sbV.append(", isPassportCardEnabled=");
            sbV.append(z6);
            sbV.append(", isCameraXViewPortEnabled=");
            sbV.append(z11);
            sbV.append(", imageCompressionQuality=");
            sbV.append(i5);
            sbV.append(", targetResolutionWidth=");
            sbV.append(i6);
            sbV.append(", addressPageCapture=");
            sbV.append(addressPageCapture);
            sbV.append(")");
            return sbV.toString();
        }

        @d
        public /* synthetic */ DocumentCapture(int i, long j2, long j3, long j5, int i2, int i3, boolean z, long j16, int i5, boolean z3, NfcConfiguration nfcConfiguration, boolean z4, boolean z6, boolean z11, int i6, int i21, AddressPageCapture addressPageCapture, SerializationConstructorMarker serializationConstructorMarker) {
            this.torchTurnOnTimeMs = (i & 1) == 0 ? -1L : j2;
            if ((i & 2) == 0) {
                this.videoLengthMs = 1500L;
            } else {
                this.videoLengthMs = j3;
            }
            if ((i & 4) == 0) {
                this.videoTimeoutMs = 10000L;
            } else {
                this.videoTimeoutMs = j5;
            }
            if ((i & 8) == 0) {
                this.videoBitrate = DEFAULT_DOCUMENT_VIDEO_BITRATE;
            } else {
                this.videoBitrate = i2;
            }
            if ((i & 16) == 0) {
                this.videoQuality = DEFAULT_DOCUMENT_VIDEO_QUALITY;
            } else {
                this.videoQuality = i3;
            }
            if ((i & 32) == 0) {
                this.videoRequired = true;
            } else {
                this.videoRequired = z;
            }
            this.barcodeDetectionTimeoutMs = (i & 64) == 0 ? 5000L : j16;
            this.maxTotalRetries = (i & 128) == 0 ? 2 : i5;
            if ((i & 256) == 0) {
                this.isMrzDetectionEnabled = true;
            } else {
                this.isMrzDetectionEnabled = z3;
            }
            if ((i & 512) == 0) {
                this.nfc = new NfcConfiguration(0, (String) null, 0, (String) null, 15, (DefaultConstructorMarker) null);
            } else {
                this.nfc = nfcConfiguration;
            }
            if ((i & 1024) == 0) {
                this.isPinEnabled = false;
            } else {
                this.isPinEnabled = z4;
            }
            if ((i & 2048) == 0) {
                this.isPassportCardEnabled = false;
            } else {
                this.isPassportCardEnabled = z6;
            }
            if ((i & 4096) == 0) {
                this.isCameraXViewPortEnabled = true;
            } else {
                this.isCameraXViewPortEnabled = z11;
            }
            this.imageCompressionQuality = (i & 8192) == 0 ? 100 : i6;
            this.targetResolutionWidth = (i & 16384) == 0 ? DOC_CAPTURE_TARGET_RESOLUTION_WIDTH : i21;
            if ((i & 32768) == 0) {
                this.addressPageCapture = new AddressPageCapture(false, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
            } else {
                this.addressPageCapture = addressPageCapture;
            }
        }

        public DocumentCapture(long j2, long j3, long j5, int i, int i2, boolean z, long j16, int i3, boolean z3, @NotNull NfcConfiguration nfc2, boolean z4, boolean z6, boolean z11, int i5, int i6, @NotNull AddressPageCapture addressPageCapture) {
            Intrinsics.checkNotNullParameter(nfc2, "nfc");
            Intrinsics.checkNotNullParameter(addressPageCapture, "addressPageCapture");
            this.torchTurnOnTimeMs = j2;
            this.videoLengthMs = j3;
            this.videoTimeoutMs = j5;
            this.videoBitrate = i;
            this.videoQuality = i2;
            this.videoRequired = z;
            this.barcodeDetectionTimeoutMs = j16;
            this.maxTotalRetries = i3;
            this.isMrzDetectionEnabled = z3;
            this.nfc = nfc2;
            this.isPinEnabled = z4;
            this.isPassportCardEnabled = z6;
            this.isCameraXViewPortEnabled = z11;
            this.imageCompressionQuality = i5;
            this.targetResolutionWidth = i6;
            this.addressPageCapture = addressPageCapture;
        }

        public /* synthetic */ DocumentCapture(long j2, long j3, long j5, int i, int i2, boolean z, long j16, int i3, boolean z3, NfcConfiguration nfcConfiguration, boolean z4, boolean z6, boolean z11, int i5, int i6, AddressPageCapture addressPageCapture, int i21, DefaultConstructorMarker defaultConstructorMarker) {
            this((i21 & 1) != 0 ? -1L : j2, (i21 & 2) != 0 ? 1500L : j3, (i21 & 4) != 0 ? 10000L : j5, (i21 & 8) != 0 ? DEFAULT_DOCUMENT_VIDEO_BITRATE : i, (i21 & 16) != 0 ? DEFAULT_DOCUMENT_VIDEO_QUALITY : i2, (i21 & 32) != 0 ? true : z, (i21 & 64) != 0 ? 5000L : j16, (i21 & 128) != 0 ? 2 : i3, (i21 & 256) != 0 ? true : z3, (i21 & 512) != 0 ? new NfcConfiguration(0, (String) null, 0, (String) null, 15, (DefaultConstructorMarker) null) : nfcConfiguration, (i21 & 1024) != 0 ? false : z4, (i21 & 2048) == 0 ? z6 : false, (i21 & 4096) != 0 ? true : z11, (i21 & 8192) != 0 ? 100 : i5, (i21 & 16384) != 0 ? DOC_CAPTURE_TARGET_RESOLUTION_WIDTH : i6, (i21 & 32768) != 0 ? new AddressPageCapture(false, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : addressPageCapture);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u0004\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0012¨\u0006+"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "", "seen1", "", "isPayloadSigningEnabled", "", "videoQuality", "maxVideoLengthMs", "videoBitrate", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZIII)V", "isPayloadSigningEnabled$annotations", "()V", "()Z", "getMaxVideoLengthMs$annotations", "getMaxVideoLengthMs", "()I", "getVideoBitrate$annotations", "getVideoBitrate", "getVideoQuality$annotations", "getVideoQuality", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class LivenessCapture {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final LivenessCapture DEFAULT = new LivenessCapture(true, 0, 0, 0, 14, (DefaultConstructorMarker) null);
        private static final int DEFAULT_MAX_RECORDING_DURATION_IN_MS = 30000;
        private static final int DEFAULT_VIDEO_BITRATE = 3000000;
        private static final int DEFAULT_VIDEO_QUALITY = 1080;
        private final boolean isPayloadSigningEnabled;
        private final int maxVideoLengthMs;
        private final int videoBitrate;
        private final int videoQuality;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fHÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture$Companion;", "", "()V", "DEFAULT", "Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "getDEFAULT", "()Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "DEFAULT_MAX_RECORDING_DURATION_IN_MS", "", "DEFAULT_VIDEO_BITRATE", "DEFAULT_VIDEO_QUALITY", "serializer", "Lkotlinx/serialization/KSerializer;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final LivenessCapture getDEFAULT() {
                return LivenessCapture.DEFAULT;
            }

            @NotNull
            public final KSerializer serializer() {
                return SdkConfiguration$LivenessCapture$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @d
        public /* synthetic */ LivenessCapture(int i, boolean z, int i2, int i3, int i5, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                j1.f(SdkConfiguration$LivenessCapture$$serializer.INSTANCE.getDescriptor(), i, 1);
                throw null;
            }
            this.isPayloadSigningEnabled = z;
            if ((i & 2) == 0) {
                this.videoQuality = DEFAULT_VIDEO_QUALITY;
            } else {
                this.videoQuality = i2;
            }
            if ((i & 4) == 0) {
                this.maxVideoLengthMs = 30000;
            } else {
                this.maxVideoLengthMs = i3;
            }
            if ((i & 8) == 0) {
                this.videoBitrate = DEFAULT_VIDEO_BITRATE;
            } else {
                this.videoBitrate = i5;
            }
        }

        public static /* synthetic */ LivenessCapture copy$default(LivenessCapture livenessCapture, boolean z, int i, int i2, int i3, int i5, Object obj2) {
            if ((i5 & 1) != 0) {
                z = livenessCapture.isPayloadSigningEnabled;
            }
            if ((i5 & 2) != 0) {
                i = livenessCapture.videoQuality;
            }
            if ((i5 & 4) != 0) {
                i2 = livenessCapture.maxVideoLengthMs;
            }
            if ((i5 & 8) != 0) {
                i3 = livenessCapture.videoBitrate;
            }
            return livenessCapture.copy(z, i, i2, i3);
        }

        public static /* synthetic */ void getMaxVideoLengthMs$annotations() {
        }

        public static /* synthetic */ void getVideoBitrate$annotations() {
        }

        public static /* synthetic */ void getVideoQuality$annotations() {
        }

        public static /* synthetic */ void isPayloadSigningEnabled$annotations() {
        }

        public static final /* synthetic */ void write$Self$onfido_api_client(LivenessCapture self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeBooleanElement(serialDesc, 0, self.isPayloadSigningEnabled);
            if (output.d(serialDesc) || self.videoQuality != DEFAULT_VIDEO_QUALITY) {
                output.encodeIntElement(serialDesc, 1, self.videoQuality);
            }
            if (output.d(serialDesc) || self.maxVideoLengthMs != 30000) {
                output.encodeIntElement(serialDesc, 2, self.maxVideoLengthMs);
            }
            if (!output.d(serialDesc) && self.videoBitrate == DEFAULT_VIDEO_BITRATE) {
                return;
            }
            output.encodeIntElement(serialDesc, 3, self.videoBitrate);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsPayloadSigningEnabled() {
            return this.isPayloadSigningEnabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getVideoQuality() {
            return this.videoQuality;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMaxVideoLengthMs() {
            return this.maxVideoLengthMs;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getVideoBitrate() {
            return this.videoBitrate;
        }

        @NotNull
        public final LivenessCapture copy(boolean isPayloadSigningEnabled, int videoQuality, int maxVideoLengthMs, int videoBitrate) {
            return new LivenessCapture(isPayloadSigningEnabled, videoQuality, maxVideoLengthMs, videoBitrate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LivenessCapture)) {
                return false;
            }
            LivenessCapture livenessCapture = (LivenessCapture) other;
            return this.isPayloadSigningEnabled == livenessCapture.isPayloadSigningEnabled && this.videoQuality == livenessCapture.videoQuality && this.maxVideoLengthMs == livenessCapture.maxVideoLengthMs && this.videoBitrate == livenessCapture.videoBitrate;
        }

        public final int getMaxVideoLengthMs() {
            return this.maxVideoLengthMs;
        }

        public final int getVideoBitrate() {
            return this.videoBitrate;
        }

        public final int getVideoQuality() {
            return this.videoQuality;
        }

        public int hashCode() {
            return Integer.hashCode(this.videoBitrate) + a.b(this.maxVideoLengthMs, a.b(this.videoQuality, Boolean.hashCode(this.isPayloadSigningEnabled) * 31, 31), 31);
        }

        public final boolean isPayloadSigningEnabled() {
            return this.isPayloadSigningEnabled;
        }

        @NotNull
        public String toString() {
            return "LivenessCapture(isPayloadSigningEnabled=" + this.isPayloadSigningEnabled + ", videoQuality=" + this.videoQuality + ", maxVideoLengthMs=" + this.maxVideoLengthMs + ", videoBitrate=" + this.videoBitrate + ")";
        }

        public LivenessCapture(boolean z, int i, int i2, int i3) {
            this.isPayloadSigningEnabled = z;
            this.videoQuality = i;
            this.maxVideoLengthMs = i2;
            this.videoBitrate = i3;
        }

        public /* synthetic */ LivenessCapture(boolean z, int i, int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i5 & 2) != 0 ? DEFAULT_VIDEO_QUALITY : i, (i5 & 4) != 0 ? 30000 : i2, (i5 & 8) != 0 ? DEFAULT_VIDEO_BITRATE : i3);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'BG\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÁ\u0001¢\u0006\u0002\b%R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0004\u0010\u0010R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0013¨\u0006("}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$LoggerConfiguration;", "", "seen1", "", "isEnabled", "", "labels", "", "", "levels", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/util/List;Ljava/util/List;)V", "isEnabled$annotations", "()V", "()Z", "getLabels$annotations", "getLabels", "()Ljava/util/List;", "getLevels$annotations", "getLevels", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class LoggerConfiguration {

        @NotNull
        private static final KSerializer[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final boolean isEnabled;

        @NotNull
        private final List<String> labels;

        @NotNull
        private final List<String> levels;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$LoggerConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$LoggerConfiguration;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SdkConfiguration$LoggerConfiguration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            v1 v1Var = v1.f247718a;
            $childSerializers = new KSerializer[]{null, new e(v1Var), new e(v1Var)};
        }

        public LoggerConfiguration() {
            this(false, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoggerConfiguration copy$default(LoggerConfiguration loggerConfiguration, boolean z, List list, List list2, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = loggerConfiguration.isEnabled;
            }
            if ((i & 2) != 0) {
                list = loggerConfiguration.labels;
            }
            if ((i & 4) != 0) {
                list2 = loggerConfiguration.levels;
            }
            return loggerConfiguration.copy(z, list, list2);
        }

        public static /* synthetic */ void getLabels$annotations() {
        }

        public static /* synthetic */ void getLevels$annotations() {
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }

        public static final void write$Self$onfido_api_client(LoggerConfiguration self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer[] kSerializerArr = $childSerializers;
            if (output.d(serialDesc) || !self.isEnabled) {
                output.encodeBooleanElement(serialDesc, 0, self.isEnabled);
            }
            if (output.d(serialDesc) || !Intrinsics.f(self.labels, f0.f322471a)) {
                output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.labels);
            }
            if (!output.d(serialDesc) && Intrinsics.f(self.levels, u.c("error"))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.levels);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public final List<String> component2() {
            return this.labels;
        }

        @NotNull
        public final List<String> component3() {
            return this.levels;
        }

        @NotNull
        public final LoggerConfiguration copy(boolean isEnabled, @NotNull List<String> labels, @NotNull List<String> levels) {
            Intrinsics.checkNotNullParameter(labels, "labels");
            Intrinsics.checkNotNullParameter(levels, "levels");
            return new LoggerConfiguration(isEnabled, labels, levels);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoggerConfiguration)) {
                return false;
            }
            LoggerConfiguration loggerConfiguration = (LoggerConfiguration) other;
            return this.isEnabled == loggerConfiguration.isEnabled && Intrinsics.f(this.labels, loggerConfiguration.labels) && Intrinsics.f(this.levels, loggerConfiguration.levels);
        }

        @NotNull
        public final List<String> getLabels() {
            return this.labels;
        }

        @NotNull
        public final List<String> getLevels() {
            return this.levels;
        }

        public int hashCode() {
            return this.levels.hashCode() + p.a.d(Boolean.hashCode(this.isEnabled) * 31, 31, this.labels);
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            boolean z = this.isEnabled;
            List<String> list = this.labels;
            List<String> list2 = this.levels;
            StringBuilder sb6 = new StringBuilder("LoggerConfiguration(isEnabled=");
            sb6.append(z);
            sb6.append(", labels=");
            sb6.append(list);
            sb6.append(", levels=");
            return t61.a.q(")", list2, sb6);
        }

        public LoggerConfiguration(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? f0.f322471a : list, (i & 4) != 0 ? u.c("error") : list2);
        }

        @d
        public LoggerConfiguration(int i, boolean z, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            this.isEnabled = (i & 1) == 0 ? true : z;
            if ((i & 2) == 0) {
                this.labels = f0.f322471a;
            } else {
                this.labels = list;
            }
            if ((i & 4) == 0) {
                this.levels = u.c("error");
            } else {
                this.levels = list2;
            }
        }

        public LoggerConfiguration(boolean z, @NotNull List<String> labels, @NotNull List<String> levels) {
            Intrinsics.checkNotNullParameter(labels, "labels");
            Intrinsics.checkNotNullParameter(levels, "levels");
            this.isEnabled = z;
            this.labels = labels;
            this.levels = levels;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001e\u001f B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture;", "", "seen1", "", "videoSettings", "Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;)V", "getVideoSettings$annotations", "()V", "getVideoSettings", "()Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "MotionVideoSettings", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class MotionCapture {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final MotionCapture DEFAULT = new MotionCapture(new MotionVideoSettings(true));

        @NotNull
        private final MotionVideoSettings videoSettings;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$Companion;", "", "()V", "DEFAULT", "Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture;", "getDEFAULT", "()Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture;", "serializer", "Lkotlinx/serialization/KSerializer;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final MotionCapture getDEFAULT() {
                return MotionCapture.DEFAULT;
            }

            @NotNull
            public final KSerializer serializer() {
                return SdkConfiguration$MotionCapture$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;", "", "seen1", "", "exposureLock", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getExposureLock$annotations", "()V", "getExposureLock", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @g
        public static final /* data */ class MotionVideoSettings {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final boolean exposureLock;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer serializer() {
                    return SdkConfiguration$MotionCapture$MotionVideoSettings$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public MotionVideoSettings() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ MotionVideoSettings copy$default(MotionVideoSettings motionVideoSettings, boolean z, int i, Object obj2) {
                if ((i & 1) != 0) {
                    z = motionVideoSettings.exposureLock;
                }
                return motionVideoSettings.copy(z);
            }

            public static /* synthetic */ void getExposureLock$annotations() {
            }

            public static final /* synthetic */ void write$Self$onfido_api_client(MotionVideoSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
                if (!output.d(serialDesc) && self.exposureLock) {
                    return;
                }
                output.encodeBooleanElement(serialDesc, 0, self.exposureLock);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getExposureLock() {
                return this.exposureLock;
            }

            @NotNull
            public final MotionVideoSettings copy(boolean exposureLock) {
                return new MotionVideoSettings(exposureLock);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MotionVideoSettings) && this.exposureLock == ((MotionVideoSettings) other).exposureLock;
            }

            public final boolean getExposureLock() {
                return this.exposureLock;
            }

            public int hashCode() {
                return Boolean.hashCode(this.exposureLock);
            }

            @NotNull
            public String toString() {
                return "MotionVideoSettings(exposureLock=" + this.exposureLock + ")";
            }

            @d
            public /* synthetic */ MotionVideoSettings(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.exposureLock = true;
                } else {
                    this.exposureLock = z;
                }
            }

            public MotionVideoSettings(boolean z) {
                this.exposureLock = z;
            }

            public /* synthetic */ MotionVideoSettings(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }

        @d
        public /* synthetic */ MotionCapture(int i, MotionVideoSettings motionVideoSettings, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 == (i & 1)) {
                this.videoSettings = motionVideoSettings;
            } else {
                j1.f(SdkConfiguration$MotionCapture$$serializer.INSTANCE.getDescriptor(), i, 1);
                throw null;
            }
        }

        public static /* synthetic */ MotionCapture copy$default(MotionCapture motionCapture, MotionVideoSettings motionVideoSettings, int i, Object obj2) {
            if ((i & 1) != 0) {
                motionVideoSettings = motionCapture.videoSettings;
            }
            return motionCapture.copy(motionVideoSettings);
        }

        public static /* synthetic */ void getVideoSettings$annotations() {
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MotionVideoSettings getVideoSettings() {
            return this.videoSettings;
        }

        @NotNull
        public final MotionCapture copy(@NotNull MotionVideoSettings videoSettings) {
            Intrinsics.checkNotNullParameter(videoSettings, "videoSettings");
            return new MotionCapture(videoSettings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MotionCapture) && Intrinsics.f(this.videoSettings, ((MotionCapture) other).videoSettings);
        }

        @NotNull
        public final MotionVideoSettings getVideoSettings() {
            return this.videoSettings;
        }

        public int hashCode() {
            return this.videoSettings.hashCode();
        }

        @NotNull
        public String toString() {
            return "MotionCapture(videoSettings=" + this.videoSettings + ")";
        }

        public MotionCapture(@NotNull MotionVideoSettings videoSettings) {
            Intrinsics.checkNotNullParameter(videoSettings, "videoSettings");
            this.videoSettings = videoSettings;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+BE\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010¨\u0006,"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$NfcConfiguration;", "", "seen1", "", "nfcScanTagTimeoutMs", "animationVersion", "", "maxRetries", "pinRecoveryUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;ILjava/lang/String;)V", "getAnimationVersion$annotations", "()V", "getAnimationVersion", "()Ljava/lang/String;", "getMaxRetries$annotations", "getMaxRetries", "()I", "getNfcScanTagTimeoutMs$annotations", "getNfcScanTagTimeoutMs", "getPinRecoveryUrl$annotations", "getPinRecoveryUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class NfcConfiguration {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String animationVersion;
        private final int maxRetries;
        private final int nfcScanTagTimeoutMs;
        private final String pinRecoveryUrl;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$NfcConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$NfcConfiguration;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SdkConfiguration$NfcConfiguration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public NfcConfiguration() {
            this(0, (String) null, 0, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ NfcConfiguration copy$default(NfcConfiguration nfcConfiguration, int i, String str, int i2, String str2, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                i = nfcConfiguration.nfcScanTagTimeoutMs;
            }
            if ((i3 & 2) != 0) {
                str = nfcConfiguration.animationVersion;
            }
            if ((i3 & 4) != 0) {
                i2 = nfcConfiguration.maxRetries;
            }
            if ((i3 & 8) != 0) {
                str2 = nfcConfiguration.pinRecoveryUrl;
            }
            return nfcConfiguration.copy(i, str, i2, str2);
        }

        public static /* synthetic */ void getAnimationVersion$annotations() {
        }

        public static /* synthetic */ void getMaxRetries$annotations() {
        }

        public static /* synthetic */ void getNfcScanTagTimeoutMs$annotations() {
        }

        public static /* synthetic */ void getPinRecoveryUrl$annotations() {
        }

        public static final /* synthetic */ void write$Self$onfido_api_client(NfcConfiguration self, CompositeEncoder output, SerialDescriptor serialDesc) {
            if (output.d(serialDesc) || self.nfcScanTagTimeoutMs != 5000) {
                output.encodeIntElement(serialDesc, 0, self.nfcScanTagTimeoutMs);
            }
            if (output.d(serialDesc) || !Intrinsics.f(self.animationVersion, "v4")) {
                output.encodeStringElement(serialDesc, 1, self.animationVersion);
            }
            if (output.d(serialDesc) || self.maxRetries != 3) {
                output.encodeIntElement(serialDesc, 2, self.maxRetries);
            }
            if (!output.d(serialDesc) && self.pinRecoveryUrl == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, v1.f247718a, self.pinRecoveryUrl);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getNfcScanTagTimeoutMs() {
            return this.nfcScanTagTimeoutMs;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAnimationVersion() {
            return this.animationVersion;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMaxRetries() {
            return this.maxRetries;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPinRecoveryUrl() {
            return this.pinRecoveryUrl;
        }

        @NotNull
        public final NfcConfiguration copy(int nfcScanTagTimeoutMs, @NotNull String animationVersion, int maxRetries, String pinRecoveryUrl) {
            Intrinsics.checkNotNullParameter(animationVersion, "animationVersion");
            return new NfcConfiguration(nfcScanTagTimeoutMs, animationVersion, maxRetries, pinRecoveryUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcConfiguration)) {
                return false;
            }
            NfcConfiguration nfcConfiguration = (NfcConfiguration) other;
            return this.nfcScanTagTimeoutMs == nfcConfiguration.nfcScanTagTimeoutMs && Intrinsics.f(this.animationVersion, nfcConfiguration.animationVersion) && this.maxRetries == nfcConfiguration.maxRetries && Intrinsics.f(this.pinRecoveryUrl, nfcConfiguration.pinRecoveryUrl);
        }

        @NotNull
        public final String getAnimationVersion() {
            return this.animationVersion;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getNfcScanTagTimeoutMs() {
            return this.nfcScanTagTimeoutMs;
        }

        public final String getPinRecoveryUrl() {
            return this.pinRecoveryUrl;
        }

        public int hashCode() {
            int iB = a.b(this.maxRetries, p.a.c(Integer.hashCode(this.nfcScanTagTimeoutMs) * 31, 31, this.animationVersion), 31);
            String str = this.pinRecoveryUrl;
            return iB + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "NfcConfiguration(nfcScanTagTimeoutMs=" + this.nfcScanTagTimeoutMs + ", animationVersion=" + this.animationVersion + ", maxRetries=" + this.maxRetries + ", pinRecoveryUrl=" + this.pinRecoveryUrl + ")";
        }

        @d
        public /* synthetic */ NfcConfiguration(int i, int i2, String str, int i3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.nfcScanTagTimeoutMs = (i & 1) == 0 ? Level.TRACE_INT : i2;
            if ((i & 2) == 0) {
                this.animationVersion = "v4";
            } else {
                this.animationVersion = str;
            }
            if ((i & 4) == 0) {
                this.maxRetries = 3;
            } else {
                this.maxRetries = i3;
            }
            if ((i & 8) == 0) {
                this.pinRecoveryUrl = null;
            } else {
                this.pinRecoveryUrl = str2;
            }
        }

        public NfcConfiguration(int i, @NotNull String animationVersion, int i2, String str) {
            Intrinsics.checkNotNullParameter(animationVersion, "animationVersion");
            this.nfcScanTagTimeoutMs = i;
            this.animationVersion = animationVersion;
            this.maxRetries = i2;
            this.pinRecoveryUrl = str;
        }

        public /* synthetic */ NfcConfiguration(int i, String str, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? Level.TRACE_INT : i, (i3 & 2) != 0 ? "v4" : str, (i3 & 4) != 0 ? 3 : i2, (i3 & 8) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$SelfieCapture;", "", "seen1", "", "isPayloadSigningEnabled", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "isPayloadSigningEnabled$annotations", "()V", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class SelfieCapture {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final SelfieCapture DEFAULT = new SelfieCapture(true);
        private final boolean isPayloadSigningEnabled;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$SelfieCapture$Companion;", "", "()V", "DEFAULT", "Lcom/onfido/api/client/data/SdkConfiguration$SelfieCapture;", "getDEFAULT", "()Lcom/onfido/api/client/data/SdkConfiguration$SelfieCapture;", "serializer", "Lkotlinx/serialization/KSerializer;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final SelfieCapture getDEFAULT() {
                return SelfieCapture.DEFAULT;
            }

            @NotNull
            public final KSerializer serializer() {
                return SdkConfiguration$SelfieCapture$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public SelfieCapture() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ SelfieCapture copy$default(SelfieCapture selfieCapture, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = selfieCapture.isPayloadSigningEnabled;
            }
            return selfieCapture.copy(z);
        }

        public static /* synthetic */ void isPayloadSigningEnabled$annotations() {
        }

        public static final /* synthetic */ void write$Self$onfido_api_client(SelfieCapture self, CompositeEncoder output, SerialDescriptor serialDesc) {
            if (!output.d(serialDesc) && self.isPayloadSigningEnabled) {
                return;
            }
            output.encodeBooleanElement(serialDesc, 0, self.isPayloadSigningEnabled);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsPayloadSigningEnabled() {
            return this.isPayloadSigningEnabled;
        }

        @NotNull
        public final SelfieCapture copy(boolean isPayloadSigningEnabled) {
            return new SelfieCapture(isPayloadSigningEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelfieCapture) && this.isPayloadSigningEnabled == ((SelfieCapture) other).isPayloadSigningEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isPayloadSigningEnabled);
        }

        public final boolean isPayloadSigningEnabled() {
            return this.isPayloadSigningEnabled;
        }

        @NotNull
        public String toString() {
            return "SelfieCapture(isPayloadSigningEnabled=" + this.isPayloadSigningEnabled + ")";
        }

        @d
        public /* synthetic */ SelfieCapture(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.isPayloadSigningEnabled = true;
            } else {
                this.isPayloadSigningEnabled = z;
            }
        }

        public SelfieCapture(boolean z) {
            this.isPayloadSigningEnabled = z;
        }

        public /* synthetic */ SelfieCapture(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001e\u001f B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$Validations;", "", "seen1", "", "onDevice", "Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice;)V", "getOnDevice$annotations", "()V", "getOnDevice", "()Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "OnDevice", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class Validations {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final OnDevice onDevice;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$Validations$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$Validations;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SdkConfiguration$Validations$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001e\u001f B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice;", "", "seen1", "", "blur", "Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice$ValidationType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice$ValidationType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice$ValidationType;)V", "getBlur$annotations", "()V", "getBlur", "()Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice$ValidationType;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "ValidationType", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @g
        public static final /* data */ class OnDevice {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final ValidationType blur;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer serializer() {
                    return SdkConfiguration$Validations$OnDevice$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @d
            public /* synthetic */ OnDevice(int i, ValidationType validationType, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 == (i & 1)) {
                    this.blur = validationType;
                } else {
                    j1.f(SdkConfiguration$Validations$OnDevice$$serializer.INSTANCE.getDescriptor(), i, 1);
                    throw null;
                }
            }

            public static /* synthetic */ OnDevice copy$default(OnDevice onDevice, ValidationType validationType, int i, Object obj2) {
                if ((i & 1) != 0) {
                    validationType = onDevice.blur;
                }
                return onDevice.copy(validationType);
            }

            public static /* synthetic */ void getBlur$annotations() {
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ValidationType getBlur() {
                return this.blur;
            }

            @NotNull
            public final OnDevice copy(ValidationType blur) {
                return new OnDevice(blur);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnDevice) && Intrinsics.f(this.blur, ((OnDevice) other).blur);
            }

            public final ValidationType getBlur() {
                return this.blur;
            }

            public int hashCode() {
                ValidationType validationType = this.blur;
                if (validationType == null) {
                    return 0;
                }
                return validationType.hashCode();
            }

            @NotNull
            public String toString() {
                return "OnDevice(blur=" + this.blur + ")";
            }

            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice$ValidationType;", "", "seen1", "", "maxTotalRetries", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(I)V", "getMaxTotalRetries$annotations", "()V", "getMaxTotalRetries", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @g
            public static final /* data */ class ValidationType {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion(null);
                private final int maxTotalRetries;

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice$ValidationType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$Validations$OnDevice$ValidationType;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    @NotNull
                    public final KSerializer serializer() {
                        return SdkConfiguration$Validations$OnDevice$ValidationType$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public ValidationType(int i) {
                    this.maxTotalRetries = i;
                }

                public static /* synthetic */ ValidationType copy$default(ValidationType validationType, int i, int i2, Object obj2) {
                    if ((i2 & 1) != 0) {
                        i = validationType.maxTotalRetries;
                    }
                    return validationType.copy(i);
                }

                public static /* synthetic */ void getMaxTotalRetries$annotations() {
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final int getMaxTotalRetries() {
                    return this.maxTotalRetries;
                }

                @NotNull
                public final ValidationType copy(int maxTotalRetries) {
                    return new ValidationType(maxTotalRetries);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ValidationType) && this.maxTotalRetries == ((ValidationType) other).maxTotalRetries;
                }

                public final int getMaxTotalRetries() {
                    return this.maxTotalRetries;
                }

                public int hashCode() {
                    return Integer.hashCode(this.maxTotalRetries);
                }

                @NotNull
                public String toString() {
                    return a.l(this.maxTotalRetries, "ValidationType(maxTotalRetries=", ")");
                }

                @d
                public /* synthetic */ ValidationType(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
                    if (1 == (i & 1)) {
                        this.maxTotalRetries = i2;
                    } else {
                        j1.f(SdkConfiguration$Validations$OnDevice$ValidationType$$serializer.INSTANCE.getDescriptor(), i, 1);
                        throw null;
                    }
                }
            }

            public OnDevice(ValidationType validationType) {
                this.blur = validationType;
            }
        }

        @d
        public /* synthetic */ Validations(int i, OnDevice onDevice, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 == (i & 1)) {
                this.onDevice = onDevice;
            } else {
                j1.f(SdkConfiguration$Validations$$serializer.INSTANCE.getDescriptor(), i, 1);
                throw null;
            }
        }

        public static /* synthetic */ Validations copy$default(Validations validations, OnDevice onDevice, int i, Object obj2) {
            if ((i & 1) != 0) {
                onDevice = validations.onDevice;
            }
            return validations.copy(onDevice);
        }

        public static /* synthetic */ void getOnDevice$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OnDevice getOnDevice() {
            return this.onDevice;
        }

        @NotNull
        public final Validations copy(OnDevice onDevice) {
            return new Validations(onDevice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Validations) && Intrinsics.f(this.onDevice, ((Validations) other).onDevice);
        }

        public final OnDevice getOnDevice() {
            return this.onDevice;
        }

        public int hashCode() {
            OnDevice onDevice = this.onDevice;
            if (onDevice == null) {
                return 0;
            }
            return onDevice.hashCode();
        }

        @NotNull
        public String toString() {
            return "Validations(onDevice=" + this.onDevice + ")";
        }

        public Validations(OnDevice onDevice) {
            this.onDevice = onDevice;
        }
    }

    public SdkConfiguration() {
        this((Validations) null, (DocumentCapture) null, (ExperimentalFeatures) null, (LivenessCapture) null, (SelfieCapture) null, (MotionCapture) null, (SdkFeatures) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SdkConfiguration copy$default(SdkConfiguration sdkConfiguration, Validations validations, DocumentCapture documentCapture, ExperimentalFeatures experimentalFeatures, LivenessCapture livenessCapture, SelfieCapture selfieCapture, MotionCapture motionCapture, SdkFeatures sdkFeatures, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            validations = sdkConfiguration.validations;
        }
        if ((i & 2) != 0) {
            documentCapture = sdkConfiguration.documentCapture;
        }
        if ((i & 4) != 0) {
            experimentalFeatures = sdkConfiguration.experimentalFeatures;
        }
        if ((i & 8) != 0) {
            livenessCapture = sdkConfiguration.livenessCapture;
        }
        if ((i & 16) != 0) {
            selfieCapture = sdkConfiguration.selfieCapture;
        }
        if ((i & 32) != 0) {
            motionCapture = sdkConfiguration.motionCapture;
        }
        if ((i & 64) != 0) {
            sdkFeatures = sdkConfiguration.sdkFeatures;
        }
        if ((i & 128) != 0) {
            str = sdkConfiguration.source;
        }
        SdkFeatures sdkFeatures2 = sdkFeatures;
        String str2 = str;
        SelfieCapture selfieCapture2 = selfieCapture;
        MotionCapture motionCapture2 = motionCapture;
        return sdkConfiguration.copy(validations, documentCapture, experimentalFeatures, livenessCapture, selfieCapture2, motionCapture2, sdkFeatures2, str2);
    }

    public static /* synthetic */ void getDocumentCapture$annotations() {
    }

    public static /* synthetic */ void getExperimentalFeatures$annotations() {
    }

    public static /* synthetic */ void getLivenessCapture$annotations() {
    }

    public static /* synthetic */ void getMotionCapture$annotations() {
    }

    public static /* synthetic */ void getSdkFeatures$annotations() {
    }

    public static /* synthetic */ void getSelfieCapture$annotations() {
    }

    public static /* synthetic */ void getSource$annotations() {
    }

    public static /* synthetic */ void getValidations$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(SdkConfiguration self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.d(serialDesc) || self.validations != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SdkConfiguration$Validations$$serializer.INSTANCE, self.validations);
        }
        if (output.d(serialDesc) || self.documentCapture != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SdkConfiguration$DocumentCapture$$serializer.INSTANCE, self.documentCapture);
        }
        if (output.d(serialDesc) || self.experimentalFeatures != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SdkConfiguration$ExperimentalFeatures$$serializer.INSTANCE, self.experimentalFeatures);
        }
        if (output.d(serialDesc) || self.livenessCapture != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SdkConfiguration$LivenessCapture$$serializer.INSTANCE, self.livenessCapture);
        }
        if (output.d(serialDesc) || self.selfieCapture != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SdkConfiguration$SelfieCapture$$serializer.INSTANCE, self.selfieCapture);
        }
        if (output.d(serialDesc) || self.motionCapture != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, SdkConfiguration$MotionCapture$$serializer.INSTANCE, self.motionCapture);
        }
        if (output.d(serialDesc) || self.sdkFeatures != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, SdkConfiguration$SdkFeatures$$serializer.INSTANCE, self.sdkFeatures);
        }
        if (!output.d(serialDesc) && self.source == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, v1.f247718a, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Validations getValidations() {
        return this.validations;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DocumentCapture getDocumentCapture() {
        return this.documentCapture;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExperimentalFeatures getExperimentalFeatures() {
        return this.experimentalFeatures;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LivenessCapture getLivenessCapture() {
        return this.livenessCapture;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SelfieCapture getSelfieCapture() {
        return this.selfieCapture;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MotionCapture getMotionCapture() {
        return this.motionCapture;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SdkFeatures getSdkFeatures() {
        return this.sdkFeatures;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final SdkConfiguration copy(Validations validations, DocumentCapture documentCapture, ExperimentalFeatures experimentalFeatures, LivenessCapture livenessCapture, SelfieCapture selfieCapture, MotionCapture motionCapture, SdkFeatures sdkFeatures, String source) {
        return new SdkConfiguration(validations, documentCapture, experimentalFeatures, livenessCapture, selfieCapture, motionCapture, sdkFeatures, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkConfiguration)) {
            return false;
        }
        SdkConfiguration sdkConfiguration = (SdkConfiguration) other;
        return Intrinsics.f(this.validations, sdkConfiguration.validations) && Intrinsics.f(this.documentCapture, sdkConfiguration.documentCapture) && Intrinsics.f(this.experimentalFeatures, sdkConfiguration.experimentalFeatures) && Intrinsics.f(this.livenessCapture, sdkConfiguration.livenessCapture) && Intrinsics.f(this.selfieCapture, sdkConfiguration.selfieCapture) && Intrinsics.f(this.motionCapture, sdkConfiguration.motionCapture) && Intrinsics.f(this.sdkFeatures, sdkConfiguration.sdkFeatures) && Intrinsics.f(this.source, sdkConfiguration.source);
    }

    public final DocumentCapture getDocumentCapture() {
        return this.documentCapture;
    }

    public final ExperimentalFeatures getExperimentalFeatures() {
        return this.experimentalFeatures;
    }

    public final LivenessCapture getLivenessCapture() {
        return this.livenessCapture;
    }

    public final MotionCapture getMotionCapture() {
        return this.motionCapture;
    }

    public final SdkFeatures getSdkFeatures() {
        return this.sdkFeatures;
    }

    public final SelfieCapture getSelfieCapture() {
        return this.selfieCapture;
    }

    public final String getSource() {
        return this.source;
    }

    public final Validations getValidations() {
        return this.validations;
    }

    public int hashCode() {
        Validations validations = this.validations;
        int iHashCode = (validations == null ? 0 : validations.hashCode()) * 31;
        DocumentCapture documentCapture = this.documentCapture;
        int iHashCode2 = (iHashCode + (documentCapture == null ? 0 : documentCapture.hashCode())) * 31;
        ExperimentalFeatures experimentalFeatures = this.experimentalFeatures;
        int iHashCode3 = (iHashCode2 + (experimentalFeatures == null ? 0 : experimentalFeatures.hashCode())) * 31;
        LivenessCapture livenessCapture = this.livenessCapture;
        int iHashCode4 = (iHashCode3 + (livenessCapture == null ? 0 : livenessCapture.hashCode())) * 31;
        SelfieCapture selfieCapture = this.selfieCapture;
        int iHashCode5 = (iHashCode4 + (selfieCapture == null ? 0 : selfieCapture.hashCode())) * 31;
        MotionCapture motionCapture = this.motionCapture;
        int iHashCode6 = (iHashCode5 + (motionCapture == null ? 0 : motionCapture.hashCode())) * 31;
        SdkFeatures sdkFeatures = this.sdkFeatures;
        int iHashCode7 = (iHashCode6 + (sdkFeatures == null ? 0 : sdkFeatures.hashCode())) * 31;
        String str = this.source;
        return iHashCode7 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SdkConfiguration(validations=" + this.validations + ", documentCapture=" + this.documentCapture + ", experimentalFeatures=" + this.experimentalFeatures + ", livenessCapture=" + this.livenessCapture + ", selfieCapture=" + this.selfieCapture + ", motionCapture=" + this.motionCapture + ", sdkFeatures=" + this.sdkFeatures + ", source=" + this.source + ")";
    }

    @d
    public /* synthetic */ SdkConfiguration(int i, Validations validations, DocumentCapture documentCapture, ExperimentalFeatures experimentalFeatures, LivenessCapture livenessCapture, SelfieCapture selfieCapture, MotionCapture motionCapture, SdkFeatures sdkFeatures, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.validations = null;
        } else {
            this.validations = validations;
        }
        if ((i & 2) == 0) {
            this.documentCapture = null;
        } else {
            this.documentCapture = documentCapture;
        }
        if ((i & 4) == 0) {
            this.experimentalFeatures = null;
        } else {
            this.experimentalFeatures = experimentalFeatures;
        }
        if ((i & 8) == 0) {
            this.livenessCapture = null;
        } else {
            this.livenessCapture = livenessCapture;
        }
        if ((i & 16) == 0) {
            this.selfieCapture = null;
        } else {
            this.selfieCapture = selfieCapture;
        }
        if ((i & 32) == 0) {
            this.motionCapture = null;
        } else {
            this.motionCapture = motionCapture;
        }
        if ((i & 64) == 0) {
            this.sdkFeatures = null;
        } else {
            this.sdkFeatures = sdkFeatures;
        }
        if ((i & 128) == 0) {
            this.source = null;
        } else {
            this.source = str;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223Ba\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J&\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÁ\u0001¢\u0006\u0002\b1R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0007\u0010\u0014R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\n\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0004\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u000b\u0010\u0014R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$SdkFeatures;", "", "seen1", "", "isInhouseAnalyticsEnabled", "", "isPerformanceAnalyticsEnabled", "isApplicantConsentRequired", "loggerConfiguration", "Lcom/onfido/api/client/data/SdkConfiguration$LoggerConfiguration;", "isDocumentSupportRulesEnabled", "isRefactoredCaptureEnabled", "enableWebModuleBasedPoa", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZLcom/onfido/api/client/data/SdkConfiguration$LoggerConfiguration;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZZLcom/onfido/api/client/data/SdkConfiguration$LoggerConfiguration;ZZZ)V", "getEnableWebModuleBasedPoa$annotations", "()V", "getEnableWebModuleBasedPoa", "()Z", "isApplicantConsentRequired$annotations", "isDocumentSupportRulesEnabled$annotations", "isInhouseAnalyticsEnabled$annotations", "isPerformanceAnalyticsEnabled$annotations", "isRefactoredCaptureEnabled$annotations", "getLoggerConfiguration$annotations", "getLoggerConfiguration", "()Lcom/onfido/api/client/data/SdkConfiguration$LoggerConfiguration;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class SdkFeatures {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final boolean enableWebModuleBasedPoa;
        private final boolean isApplicantConsentRequired;
        private final boolean isDocumentSupportRulesEnabled;
        private final boolean isInhouseAnalyticsEnabled;
        private final boolean isPerformanceAnalyticsEnabled;
        private final boolean isRefactoredCaptureEnabled;

        @NotNull
        private final LoggerConfiguration loggerConfiguration;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$SdkFeatures$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$SdkFeatures;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SdkConfiguration$SdkFeatures$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @d
        public /* synthetic */ SdkFeatures(int i, boolean z, boolean z3, boolean z4, LoggerConfiguration loggerConfiguration, boolean z6, boolean z11, boolean z12, SerializationConstructorMarker serializationConstructorMarker) {
            if (5 != (i & 5)) {
                j1.f(SdkConfiguration$SdkFeatures$$serializer.INSTANCE.getDescriptor(), i, 5);
                throw null;
            }
            this.isInhouseAnalyticsEnabled = z;
            if ((i & 2) == 0) {
                this.isPerformanceAnalyticsEnabled = false;
            } else {
                this.isPerformanceAnalyticsEnabled = z3;
            }
            this.isApplicantConsentRequired = z4;
            if ((i & 8) == 0) {
                this.loggerConfiguration = new LoggerConfiguration(false, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
            } else {
                this.loggerConfiguration = loggerConfiguration;
            }
            if ((i & 16) == 0) {
                this.isDocumentSupportRulesEnabled = false;
            } else {
                this.isDocumentSupportRulesEnabled = z6;
            }
            if ((i & 32) == 0) {
                this.isRefactoredCaptureEnabled = false;
            } else {
                this.isRefactoredCaptureEnabled = z11;
            }
            if ((i & 64) == 0) {
                this.enableWebModuleBasedPoa = false;
            } else {
                this.enableWebModuleBasedPoa = z12;
            }
        }

        public static /* synthetic */ SdkFeatures copy$default(SdkFeatures sdkFeatures, boolean z, boolean z3, boolean z4, LoggerConfiguration loggerConfiguration, boolean z6, boolean z11, boolean z12, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = sdkFeatures.isInhouseAnalyticsEnabled;
            }
            if ((i & 2) != 0) {
                z3 = sdkFeatures.isPerformanceAnalyticsEnabled;
            }
            if ((i & 4) != 0) {
                z4 = sdkFeatures.isApplicantConsentRequired;
            }
            if ((i & 8) != 0) {
                loggerConfiguration = sdkFeatures.loggerConfiguration;
            }
            if ((i & 16) != 0) {
                z6 = sdkFeatures.isDocumentSupportRulesEnabled;
            }
            if ((i & 32) != 0) {
                z11 = sdkFeatures.isRefactoredCaptureEnabled;
            }
            if ((i & 64) != 0) {
                z12 = sdkFeatures.enableWebModuleBasedPoa;
            }
            boolean z29 = z11;
            boolean z31 = z12;
            boolean z41 = z6;
            boolean z49 = z4;
            return sdkFeatures.copy(z, z3, z49, loggerConfiguration, z41, z29, z31);
        }

        public static /* synthetic */ void getEnableWebModuleBasedPoa$annotations() {
        }

        public static /* synthetic */ void getLoggerConfiguration$annotations() {
        }

        public static /* synthetic */ void isApplicantConsentRequired$annotations() {
        }

        public static /* synthetic */ void isDocumentSupportRulesEnabled$annotations() {
        }

        public static /* synthetic */ void isInhouseAnalyticsEnabled$annotations() {
        }

        public static /* synthetic */ void isPerformanceAnalyticsEnabled$annotations() {
        }

        public static /* synthetic */ void isRefactoredCaptureEnabled$annotations() {
        }

        public static final /* synthetic */ void write$Self$onfido_api_client(SdkFeatures self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeBooleanElement(serialDesc, 0, self.isInhouseAnalyticsEnabled);
            if (output.d(serialDesc) || self.isPerformanceAnalyticsEnabled) {
                output.encodeBooleanElement(serialDesc, 1, self.isPerformanceAnalyticsEnabled);
            }
            output.encodeBooleanElement(serialDesc, 2, self.isApplicantConsentRequired);
            if (output.d(serialDesc) || !Intrinsics.f(self.loggerConfiguration, new LoggerConfiguration(false, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 3, SdkConfiguration$LoggerConfiguration$$serializer.INSTANCE, self.loggerConfiguration);
            }
            if (output.d(serialDesc) || self.isDocumentSupportRulesEnabled) {
                output.encodeBooleanElement(serialDesc, 4, self.isDocumentSupportRulesEnabled);
            }
            if (output.d(serialDesc) || self.isRefactoredCaptureEnabled) {
                output.encodeBooleanElement(serialDesc, 5, self.isRefactoredCaptureEnabled);
            }
            if (output.d(serialDesc) || self.enableWebModuleBasedPoa) {
                output.encodeBooleanElement(serialDesc, 6, self.enableWebModuleBasedPoa);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsInhouseAnalyticsEnabled() {
            return this.isInhouseAnalyticsEnabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsPerformanceAnalyticsEnabled() {
            return this.isPerformanceAnalyticsEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsApplicantConsentRequired() {
            return this.isApplicantConsentRequired;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final LoggerConfiguration getLoggerConfiguration() {
            return this.loggerConfiguration;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsDocumentSupportRulesEnabled() {
            return this.isDocumentSupportRulesEnabled;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsRefactoredCaptureEnabled() {
            return this.isRefactoredCaptureEnabled;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getEnableWebModuleBasedPoa() {
            return this.enableWebModuleBasedPoa;
        }

        @NotNull
        public final SdkFeatures copy(boolean isInhouseAnalyticsEnabled, boolean isPerformanceAnalyticsEnabled, boolean isApplicantConsentRequired, @NotNull LoggerConfiguration loggerConfiguration, boolean isDocumentSupportRulesEnabled, boolean isRefactoredCaptureEnabled, boolean enableWebModuleBasedPoa) {
            Intrinsics.checkNotNullParameter(loggerConfiguration, "loggerConfiguration");
            return new SdkFeatures(isInhouseAnalyticsEnabled, isPerformanceAnalyticsEnabled, isApplicantConsentRequired, loggerConfiguration, isDocumentSupportRulesEnabled, isRefactoredCaptureEnabled, enableWebModuleBasedPoa);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkFeatures)) {
                return false;
            }
            SdkFeatures sdkFeatures = (SdkFeatures) other;
            return this.isInhouseAnalyticsEnabled == sdkFeatures.isInhouseAnalyticsEnabled && this.isPerformanceAnalyticsEnabled == sdkFeatures.isPerformanceAnalyticsEnabled && this.isApplicantConsentRequired == sdkFeatures.isApplicantConsentRequired && Intrinsics.f(this.loggerConfiguration, sdkFeatures.loggerConfiguration) && this.isDocumentSupportRulesEnabled == sdkFeatures.isDocumentSupportRulesEnabled && this.isRefactoredCaptureEnabled == sdkFeatures.isRefactoredCaptureEnabled && this.enableWebModuleBasedPoa == sdkFeatures.enableWebModuleBasedPoa;
        }

        public final boolean getEnableWebModuleBasedPoa() {
            return this.enableWebModuleBasedPoa;
        }

        @NotNull
        public final LoggerConfiguration getLoggerConfiguration() {
            return this.loggerConfiguration;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enableWebModuleBasedPoa) + a.c(a.c((this.loggerConfiguration.hashCode() + a.c(a.c(Boolean.hashCode(this.isInhouseAnalyticsEnabled) * 31, 31, this.isPerformanceAnalyticsEnabled), 31, this.isApplicantConsentRequired)) * 31, 31, this.isDocumentSupportRulesEnabled), 31, this.isRefactoredCaptureEnabled);
        }

        public final boolean isApplicantConsentRequired() {
            return this.isApplicantConsentRequired;
        }

        public final boolean isDocumentSupportRulesEnabled() {
            return this.isDocumentSupportRulesEnabled;
        }

        public final boolean isInhouseAnalyticsEnabled() {
            return this.isInhouseAnalyticsEnabled;
        }

        public final boolean isPerformanceAnalyticsEnabled() {
            return this.isPerformanceAnalyticsEnabled;
        }

        public final boolean isRefactoredCaptureEnabled() {
            return this.isRefactoredCaptureEnabled;
        }

        @NotNull
        public String toString() {
            boolean z = this.isInhouseAnalyticsEnabled;
            boolean z3 = this.isPerformanceAnalyticsEnabled;
            boolean z4 = this.isApplicantConsentRequired;
            LoggerConfiguration loggerConfiguration = this.loggerConfiguration;
            boolean z6 = this.isDocumentSupportRulesEnabled;
            boolean z11 = this.isRefactoredCaptureEnabled;
            boolean z12 = this.enableWebModuleBasedPoa;
            StringBuilder sb6 = new StringBuilder("SdkFeatures(isInhouseAnalyticsEnabled=");
            sb6.append(z);
            sb6.append(", isPerformanceAnalyticsEnabled=");
            sb6.append(z3);
            sb6.append(", isApplicantConsentRequired=");
            sb6.append(z4);
            sb6.append(", loggerConfiguration=");
            sb6.append(loggerConfiguration);
            sb6.append(", isDocumentSupportRulesEnabled=");
            t61.a.y(sb6, z6, ", isRefactoredCaptureEnabled=", z11, ", enableWebModuleBasedPoa=");
            return com.google.android.gms.internal.mlkit_vision_face.a.t(sb6, z12, ")");
        }

        public SdkFeatures(boolean z, boolean z3, boolean z4, @NotNull LoggerConfiguration loggerConfiguration, boolean z6, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(loggerConfiguration, "loggerConfiguration");
            this.isInhouseAnalyticsEnabled = z;
            this.isPerformanceAnalyticsEnabled = z3;
            this.isApplicantConsentRequired = z4;
            this.loggerConfiguration = loggerConfiguration;
            this.isDocumentSupportRulesEnabled = z6;
            this.isRefactoredCaptureEnabled = z11;
            this.enableWebModuleBasedPoa = z12;
        }

        public /* synthetic */ SdkFeatures(boolean z, boolean z3, boolean z4, LoggerConfiguration loggerConfiguration, boolean z6, boolean z11, boolean z12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? false : z3, z4, (i & 8) != 0 ? new LoggerConfiguration(false, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : loggerConfiguration, (i & 16) != 0 ? false : z6, (i & 32) != 0 ? false : z11, (i & 64) != 0 ? false : z12);
        }
    }

    public SdkConfiguration(Validations validations, DocumentCapture documentCapture, ExperimentalFeatures experimentalFeatures, LivenessCapture livenessCapture, SelfieCapture selfieCapture, MotionCapture motionCapture, SdkFeatures sdkFeatures, String str) {
        this.validations = validations;
        this.documentCapture = documentCapture;
        this.experimentalFeatures = experimentalFeatures;
        this.livenessCapture = livenessCapture;
        this.selfieCapture = selfieCapture;
        this.motionCapture = motionCapture;
        this.sdkFeatures = sdkFeatures;
        this.source = str;
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 n2\u00020\u0001:\u0005mnopqB\u0091\u0002\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0002\u0010#Bó\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010$J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0017HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u001cHÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020 HÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003Jù\u0001\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020 HÆ\u0001J\u0013\u0010`\u001a\u00020\u00052\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\u0003HÖ\u0001J\t\u0010c\u001a\u00020dHÖ\u0001J&\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00002\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020kHÁ\u0001¢\u0006\u0002\blR\u001c\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010&\u001a\u0004\b*\u0010+R\u001c\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010&\u001a\u0004\b\u0015\u0010-R\u001c\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010&\u001a\u0004\b\r\u0010-R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010&\u001a\u0004\b\f\u0010-R\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010&\u001a\u0004\b\u000f\u0010-R\u001c\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010&\u001a\u0004\b\u0012\u0010-R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010&\u001a\u0004\b\u000b\u0010-R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010&\u001a\u0004\b\u0004\u0010-R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010&\u001a\u0004\b\u0006\u0010-R\u001c\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010&\u001a\u0004\b\u0018\u0010-R\u001c\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010&\u001a\u0004\b\u0010\u0010-R\u001c\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010&\u001a\u0004\b\u0013\u0010-R\u001c\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010&\u001a\u0004\b\u0014\u0010-R\u001c\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010&\u001a\u0004\b\u0011\u0010-R\u001c\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010&\u001a\u0004\b\u001d\u0010-R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010&\u001a\u0004\b\n\u0010-R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010&\u001a\u0004\b\t\u0010-R\u001c\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010&\u001a\u0004\b\u001e\u0010-R\u001c\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010&\u001a\u0004\b\u000e\u0010-R\u001c\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010&\u001a\u0004\b\u001a\u0010-R\u001c\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010&\u001a\u0004\b\u0019\u0010-R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010&\u001a\u0004\bB\u0010CR\u001c\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010&\u001a\u0004\bE\u0010F¨\u0006r"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures;", "", "seen1", "", "isEnableIqs", "", "isEnableMultiFrameFeature", "motionExperiment", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$MotionExperiment;", "isMotionTensorFlowLiteEnabled", "isMotionCameraXEnabled", "isEnableCameraX", "isCameraxStreamSharingEnabled", "isCameraXHighQualityModeEnabled", "isResolutionImprovementsEnabled", "isCutoffImprovementsEnabled", "isFocusImprovementsEnabled", "isIncreasedCompressionQualityEnabled", "isDocumentCropDisabled", "isFourByThreeEnabled", "isGenericMrzValidatorEnabled", "isAutoFlashModeEnabled", "waitingScreens", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens;", "isEnvironmentIntegrityCheckEnabled", "isStudioUserFlowExitEnabled", "isStudioUserFlowBackButtonEnabled", "cameraXConfiguration", "Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;", "isMediaCallbackCroppingDisabled", "isOnDeviceMRZExtractionEnabled", "documentDetectionExperiment", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZLcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$MotionExperiment;ZZZZZZZZZZZZZLcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens;ZZZLcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;ZZLcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZLcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$MotionExperiment;ZZZZZZZZZZZZZLcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens;ZZZLcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;ZZLcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment;)V", "getCameraXConfiguration$annotations", "()V", "getCameraXConfiguration", "()Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;", "getDocumentDetectionExperiment$annotations", "getDocumentDetectionExperiment", "()Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment;", "isAutoFlashModeEnabled$annotations", "()Z", "isCameraXHighQualityModeEnabled$annotations", "isCameraxStreamSharingEnabled$annotations", "isCutoffImprovementsEnabled$annotations", "isDocumentCropDisabled$annotations", "isEnableCameraX$annotations", "isEnableIqs$annotations", "isEnableMultiFrameFeature$annotations", "isEnvironmentIntegrityCheckEnabled$annotations", "isFocusImprovementsEnabled$annotations", "isFourByThreeEnabled$annotations", "isGenericMrzValidatorEnabled$annotations", "isIncreasedCompressionQualityEnabled$annotations", "isMediaCallbackCroppingDisabled$annotations", "isMotionCameraXEnabled$annotations", "isMotionTensorFlowLiteEnabled$annotations", "isOnDeviceMRZExtractionEnabled$annotations", "isResolutionImprovementsEnabled$annotations", "isStudioUserFlowBackButtonEnabled$annotations", "isStudioUserFlowExitEnabled$annotations", "getMotionExperiment$annotations", "getMotionExperiment", "()Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$MotionExperiment;", "getWaitingScreens$annotations", "getWaitingScreens", "()Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "DocumentDetectionExperiment", "MotionExperiment", "WaitingScreens", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class ExperimentalFeatures {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final CameraXConfiguration cameraXConfiguration;

        @NotNull
        private final DocumentDetectionExperiment documentDetectionExperiment;
        private final boolean isAutoFlashModeEnabled;
        private final boolean isCameraXHighQualityModeEnabled;
        private final boolean isCameraxStreamSharingEnabled;
        private final boolean isCutoffImprovementsEnabled;
        private final boolean isDocumentCropDisabled;
        private final boolean isEnableCameraX;
        private final boolean isEnableIqs;
        private final boolean isEnableMultiFrameFeature;
        private final boolean isEnvironmentIntegrityCheckEnabled;
        private final boolean isFocusImprovementsEnabled;
        private final boolean isFourByThreeEnabled;
        private final boolean isGenericMrzValidatorEnabled;
        private final boolean isIncreasedCompressionQualityEnabled;
        private final boolean isMediaCallbackCroppingDisabled;
        private final boolean isMotionCameraXEnabled;
        private final boolean isMotionTensorFlowLiteEnabled;
        private final boolean isOnDeviceMRZExtractionEnabled;
        private final boolean isResolutionImprovementsEnabled;
        private final boolean isStudioUserFlowBackButtonEnabled;
        private final boolean isStudioUserFlowExitEnabled;

        @NotNull
        private final MotionExperiment motionExperiment;

        @NotNull
        private final WaitingScreens waitingScreens;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SdkConfiguration$ExperimentalFeatures$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment;", "", "seen1", "", "enabled", "", "shouldFallback", "holdDurationInMs", "threshold", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZIFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZIF)V", "getEnabled$annotations", "()V", "getEnabled", "()Z", "getHoldDurationInMs$annotations", "getHoldDurationInMs", "()I", "getShouldFallback$annotations", "getShouldFallback", "getThreshold$annotations", "getThreshold", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @g
        public static final /* data */ class DocumentDetectionExperiment {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final boolean enabled;
            private final int holdDurationInMs;
            private final boolean shouldFallback;
            private final float threshold;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer serializer() {
                    return SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public DocumentDetectionExperiment() {
                this(false, false, 0, BitmapDescriptorFactory.HUE_RED, 15, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ DocumentDetectionExperiment copy$default(DocumentDetectionExperiment documentDetectionExperiment, boolean z, boolean z3, int i, float f, int i2, Object obj2) {
                if ((i2 & 1) != 0) {
                    z = documentDetectionExperiment.enabled;
                }
                if ((i2 & 2) != 0) {
                    z3 = documentDetectionExperiment.shouldFallback;
                }
                if ((i2 & 4) != 0) {
                    i = documentDetectionExperiment.holdDurationInMs;
                }
                if ((i2 & 8) != 0) {
                    f = documentDetectionExperiment.threshold;
                }
                return documentDetectionExperiment.copy(z, z3, i, f);
            }

            public static /* synthetic */ void getEnabled$annotations() {
            }

            public static /* synthetic */ void getHoldDurationInMs$annotations() {
            }

            public static /* synthetic */ void getShouldFallback$annotations() {
            }

            public static /* synthetic */ void getThreshold$annotations() {
            }

            public static final /* synthetic */ void write$Self$onfido_api_client(DocumentDetectionExperiment self, CompositeEncoder output, SerialDescriptor serialDesc) {
                if (output.d(serialDesc) || self.enabled) {
                    output.encodeBooleanElement(serialDesc, 0, self.enabled);
                }
                if (output.d(serialDesc) || self.shouldFallback) {
                    output.encodeBooleanElement(serialDesc, 1, self.shouldFallback);
                }
                if (output.d(serialDesc) || self.holdDurationInMs != 1000) {
                    output.encodeIntElement(serialDesc, 2, self.holdDurationInMs);
                }
                if (!output.d(serialDesc) && Float.compare(self.threshold, 0.6f) == 0) {
                    return;
                }
                output.encodeFloatElement(serialDesc, 3, self.threshold);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getShouldFallback() {
                return this.shouldFallback;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final int getHoldDurationInMs() {
                return this.holdDurationInMs;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final float getThreshold() {
                return this.threshold;
            }

            @NotNull
            public final DocumentDetectionExperiment copy(boolean enabled, boolean shouldFallback, int holdDurationInMs, float threshold) {
                return new DocumentDetectionExperiment(enabled, shouldFallback, holdDurationInMs, threshold);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DocumentDetectionExperiment)) {
                    return false;
                }
                DocumentDetectionExperiment documentDetectionExperiment = (DocumentDetectionExperiment) other;
                return this.enabled == documentDetectionExperiment.enabled && this.shouldFallback == documentDetectionExperiment.shouldFallback && this.holdDurationInMs == documentDetectionExperiment.holdDurationInMs && Float.compare(this.threshold, documentDetectionExperiment.threshold) == 0;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final int getHoldDurationInMs() {
                return this.holdDurationInMs;
            }

            public final boolean getShouldFallback() {
                return this.shouldFallback;
            }

            public final float getThreshold() {
                return this.threshold;
            }

            public int hashCode() {
                return Float.hashCode(this.threshold) + a.b(this.holdDurationInMs, a.c(Boolean.hashCode(this.enabled) * 31, 31, this.shouldFallback), 31);
            }

            @NotNull
            public String toString() {
                return "DocumentDetectionExperiment(enabled=" + this.enabled + ", shouldFallback=" + this.shouldFallback + ", holdDurationInMs=" + this.holdDurationInMs + ", threshold=" + this.threshold + ")";
            }

            @d
            public /* synthetic */ DocumentDetectionExperiment(int i, boolean z, boolean z3, int i2, float f, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.enabled = false;
                } else {
                    this.enabled = z;
                }
                if ((i & 2) == 0) {
                    this.shouldFallback = false;
                } else {
                    this.shouldFallback = z3;
                }
                if ((i & 4) == 0) {
                    this.holdDurationInMs = 1000;
                } else {
                    this.holdDurationInMs = i2;
                }
                if ((i & 8) == 0) {
                    this.threshold = 0.6f;
                } else {
                    this.threshold = f;
                }
            }

            public DocumentDetectionExperiment(boolean z, boolean z3, int i, float f) {
                this.enabled = z;
                this.shouldFallback = z3;
                this.holdDurationInMs = i;
                this.threshold = f;
            }

            public /* synthetic */ DocumentDetectionExperiment(boolean z, boolean z3, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z3, (i2 & 4) != 0 ? 1000 : i, (i2 & 8) != 0 ? 0.6f : f);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B/\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u0004\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$MotionExperiment;", "", "seen1", "", "isEnabled", "", "reason", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/lang/String;)V", "isEnabled$annotations", "()V", "()Z", "getReason$annotations", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @g
        public static final /* data */ class MotionExperiment {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private static final MotionExperiment DISABLED = new MotionExperiment(false, "feature_flag_disabled");

            @NotNull
            private static final MotionExperiment ENABLED = new MotionExperiment(true, "feature_flag_enabled");
            private final boolean isEnabled;

            @NotNull
            private final String reason;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$MotionExperiment$Companion;", "", "()V", "DISABLED", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$MotionExperiment;", "getDISABLED", "()Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$MotionExperiment;", "ENABLED", "getENABLED", "serializer", "Lkotlinx/serialization/KSerializer;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final MotionExperiment getDISABLED() {
                    return MotionExperiment.DISABLED;
                }

                @NotNull
                public final MotionExperiment getENABLED() {
                    return MotionExperiment.ENABLED;
                }

                @NotNull
                public final KSerializer serializer() {
                    return SdkConfiguration$ExperimentalFeatures$MotionExperiment$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @d
            public /* synthetic */ MotionExperiment(int i, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    j1.f(SdkConfiguration$ExperimentalFeatures$MotionExperiment$$serializer.INSTANCE.getDescriptor(), i, 3);
                    throw null;
                }
                this.isEnabled = z;
                this.reason = str;
            }

            public static /* synthetic */ MotionExperiment copy$default(MotionExperiment motionExperiment, boolean z, String str, int i, Object obj2) {
                if ((i & 1) != 0) {
                    z = motionExperiment.isEnabled;
                }
                if ((i & 2) != 0) {
                    str = motionExperiment.reason;
                }
                return motionExperiment.copy(z, str);
            }

            public static /* synthetic */ void getReason$annotations() {
            }

            public static /* synthetic */ void isEnabled$annotations() {
            }

            public static final /* synthetic */ void write$Self$onfido_api_client(MotionExperiment self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.encodeBooleanElement(serialDesc, 0, self.isEnabled);
                output.encodeStringElement(serialDesc, 1, self.reason);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getReason() {
                return this.reason;
            }

            @NotNull
            public final MotionExperiment copy(boolean isEnabled, @NotNull String reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                return new MotionExperiment(isEnabled, reason);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MotionExperiment)) {
                    return false;
                }
                MotionExperiment motionExperiment = (MotionExperiment) other;
                return this.isEnabled == motionExperiment.isEnabled && Intrinsics.f(this.reason, motionExperiment.reason);
            }

            @NotNull
            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode() + (Boolean.hashCode(this.isEnabled) * 31);
            }

            public final boolean isEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                return "MotionExperiment(isEnabled=" + this.isEnabled + ", reason=" + this.reason + ")";
            }

            public MotionExperiment(boolean z, @NotNull String reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.isEnabled = z;
                this.reason = reason;
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0004$%&'B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens;", "", "seen1", "", "studioTaskSubmission", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$StudioTaskSubmission;", "mediaUploadSubmission", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$MediaUploadSubmission;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$StudioTaskSubmission;Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$MediaUploadSubmission;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$StudioTaskSubmission;Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$MediaUploadSubmission;)V", "getMediaUploadSubmission$annotations", "()V", "getMediaUploadSubmission", "()Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$MediaUploadSubmission;", "getStudioTaskSubmission$annotations", "getStudioTaskSubmission", "()Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$StudioTaskSubmission;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "MediaUploadSubmission", "StudioTaskSubmission", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @g
        public static final /* data */ class WaitingScreens {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private static final WaitingScreens DEFAULT = new WaitingScreens(new StudioTaskSubmission((List) null, 1, (DefaultConstructorMarker) null), new MediaUploadSubmission((List) null, 1, (DefaultConstructorMarker) null));

            @NotNull
            private final MediaUploadSubmission mediaUploadSubmission;

            @NotNull
            private final StudioTaskSubmission studioTaskSubmission;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$Companion;", "", "()V", "DEFAULT", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens;", "getDEFAULT", "()Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens;", "serializer", "Lkotlinx/serialization/KSerializer;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final WaitingScreens getDEFAULT() {
                    return WaitingScreens.DEFAULT;
                }

                @NotNull
                public final KSerializer serializer() {
                    return SdkConfiguration$ExperimentalFeatures$WaitingScreens$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$MediaUploadSubmission;", "", "seen1", "", "waitingTimes", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getWaitingTimes$annotations", "()V", "getWaitingTimes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @g
            public static final /* data */ class MediaUploadSubmission {

                @NotNull
                private final List<Long> waitingTimes;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion(null);

                @NotNull
                private static final KSerializer[] $childSerializers = {new e(t0.f247706a)};

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$MediaUploadSubmission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$MediaUploadSubmission;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    @NotNull
                    public final KSerializer serializer() {
                        return SdkConfiguration$ExperimentalFeatures$WaitingScreens$MediaUploadSubmission$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public MediaUploadSubmission() {
                    this((List) null, 1, (DefaultConstructorMarker) null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ MediaUploadSubmission copy$default(MediaUploadSubmission mediaUploadSubmission, List list, int i, Object obj2) {
                    if ((i & 1) != 0) {
                        list = mediaUploadSubmission.waitingTimes;
                    }
                    return mediaUploadSubmission.copy(list);
                }

                public static /* synthetic */ void getWaitingTimes$annotations() {
                }

                public static final void write$Self$onfido_api_client(MediaUploadSubmission self, CompositeEncoder output, SerialDescriptor serialDesc) {
                    KSerializer[] kSerializerArr = $childSerializers;
                    if (!output.d(serialDesc) && Intrinsics.f(self.waitingTimes, f0.f322471a)) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.waitingTimes);
                }

                @NotNull
                public final List<Long> component1() {
                    return this.waitingTimes;
                }

                @NotNull
                public final MediaUploadSubmission copy(@NotNull List<Long> waitingTimes) {
                    Intrinsics.checkNotNullParameter(waitingTimes, "waitingTimes");
                    return new MediaUploadSubmission(waitingTimes);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof MediaUploadSubmission) && Intrinsics.f(this.waitingTimes, ((MediaUploadSubmission) other).waitingTimes);
                }

                @NotNull
                public final List<Long> getWaitingTimes() {
                    return this.waitingTimes;
                }

                public int hashCode() {
                    return this.waitingTimes.hashCode();
                }

                @NotNull
                public String toString() {
                    return "MediaUploadSubmission(waitingTimes=" + this.waitingTimes + ")";
                }

                public MediaUploadSubmission(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? f0.f322471a : list);
                }

                @d
                public MediaUploadSubmission(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.waitingTimes = f0.f322471a;
                    } else {
                        this.waitingTimes = list;
                    }
                }

                public MediaUploadSubmission(@NotNull List<Long> waitingTimes) {
                    Intrinsics.checkNotNullParameter(waitingTimes, "waitingTimes");
                    this.waitingTimes = waitingTimes;
                }
            }

            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$StudioTaskSubmission;", "", "seen1", "", "waitingTimes", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getWaitingTimes$annotations", "()V", "getWaitingTimes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @g
            public static final /* data */ class StudioTaskSubmission {

                @NotNull
                private final List<Long> waitingTimes;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion(null);

                @NotNull
                private static final KSerializer[] $childSerializers = {new e(t0.f247706a)};

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$StudioTaskSubmission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$WaitingScreens$StudioTaskSubmission;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    @NotNull
                    public final KSerializer serializer() {
                        return SdkConfiguration$ExperimentalFeatures$WaitingScreens$StudioTaskSubmission$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public StudioTaskSubmission() {
                    this((List) null, 1, (DefaultConstructorMarker) null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ StudioTaskSubmission copy$default(StudioTaskSubmission studioTaskSubmission, List list, int i, Object obj2) {
                    if ((i & 1) != 0) {
                        list = studioTaskSubmission.waitingTimes;
                    }
                    return studioTaskSubmission.copy(list);
                }

                public static /* synthetic */ void getWaitingTimes$annotations() {
                }

                public static final void write$Self$onfido_api_client(StudioTaskSubmission self, CompositeEncoder output, SerialDescriptor serialDesc) {
                    KSerializer[] kSerializerArr = $childSerializers;
                    if (!output.d(serialDesc) && Intrinsics.f(self.waitingTimes, f0.f322471a)) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.waitingTimes);
                }

                @NotNull
                public final List<Long> component1() {
                    return this.waitingTimes;
                }

                @NotNull
                public final StudioTaskSubmission copy(@NotNull List<Long> waitingTimes) {
                    Intrinsics.checkNotNullParameter(waitingTimes, "waitingTimes");
                    return new StudioTaskSubmission(waitingTimes);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof StudioTaskSubmission) && Intrinsics.f(this.waitingTimes, ((StudioTaskSubmission) other).waitingTimes);
                }

                @NotNull
                public final List<Long> getWaitingTimes() {
                    return this.waitingTimes;
                }

                public int hashCode() {
                    return this.waitingTimes.hashCode();
                }

                @NotNull
                public String toString() {
                    return "StudioTaskSubmission(waitingTimes=" + this.waitingTimes + ")";
                }

                public StudioTaskSubmission(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? f0.f322471a : list);
                }

                @d
                public StudioTaskSubmission(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.waitingTimes = f0.f322471a;
                    } else {
                        this.waitingTimes = list;
                    }
                }

                public StudioTaskSubmission(@NotNull List<Long> waitingTimes) {
                    Intrinsics.checkNotNullParameter(waitingTimes, "waitingTimes");
                    this.waitingTimes = waitingTimes;
                }
            }

            @d
            public /* synthetic */ WaitingScreens(int i, StudioTaskSubmission studioTaskSubmission, MediaUploadSubmission mediaUploadSubmission, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    j1.f(SdkConfiguration$ExperimentalFeatures$WaitingScreens$$serializer.INSTANCE.getDescriptor(), i, 3);
                    throw null;
                }
                this.studioTaskSubmission = studioTaskSubmission;
                this.mediaUploadSubmission = mediaUploadSubmission;
            }

            public static /* synthetic */ WaitingScreens copy$default(WaitingScreens waitingScreens, StudioTaskSubmission studioTaskSubmission, MediaUploadSubmission mediaUploadSubmission, int i, Object obj2) {
                if ((i & 1) != 0) {
                    studioTaskSubmission = waitingScreens.studioTaskSubmission;
                }
                if ((i & 2) != 0) {
                    mediaUploadSubmission = waitingScreens.mediaUploadSubmission;
                }
                return waitingScreens.copy(studioTaskSubmission, mediaUploadSubmission);
            }

            public static /* synthetic */ void getMediaUploadSubmission$annotations() {
            }

            public static /* synthetic */ void getStudioTaskSubmission$annotations() {
            }

            public static final /* synthetic */ void write$Self$onfido_api_client(WaitingScreens self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.encodeSerializableElement(serialDesc, 0, SdkConfiguration$ExperimentalFeatures$WaitingScreens$StudioTaskSubmission$$serializer.INSTANCE, self.studioTaskSubmission);
                output.encodeSerializableElement(serialDesc, 1, SdkConfiguration$ExperimentalFeatures$WaitingScreens$MediaUploadSubmission$$serializer.INSTANCE, self.mediaUploadSubmission);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final StudioTaskSubmission getStudioTaskSubmission() {
                return this.studioTaskSubmission;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final MediaUploadSubmission getMediaUploadSubmission() {
                return this.mediaUploadSubmission;
            }

            @NotNull
            public final WaitingScreens copy(@NotNull StudioTaskSubmission studioTaskSubmission, @NotNull MediaUploadSubmission mediaUploadSubmission) {
                Intrinsics.checkNotNullParameter(studioTaskSubmission, "studioTaskSubmission");
                Intrinsics.checkNotNullParameter(mediaUploadSubmission, "mediaUploadSubmission");
                return new WaitingScreens(studioTaskSubmission, mediaUploadSubmission);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WaitingScreens)) {
                    return false;
                }
                WaitingScreens waitingScreens = (WaitingScreens) other;
                return Intrinsics.f(this.studioTaskSubmission, waitingScreens.studioTaskSubmission) && Intrinsics.f(this.mediaUploadSubmission, waitingScreens.mediaUploadSubmission);
            }

            @NotNull
            public final MediaUploadSubmission getMediaUploadSubmission() {
                return this.mediaUploadSubmission;
            }

            @NotNull
            public final StudioTaskSubmission getStudioTaskSubmission() {
                return this.studioTaskSubmission;
            }

            public int hashCode() {
                return this.mediaUploadSubmission.hashCode() + (this.studioTaskSubmission.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "WaitingScreens(studioTaskSubmission=" + this.studioTaskSubmission + ", mediaUploadSubmission=" + this.mediaUploadSubmission + ")";
            }

            public WaitingScreens(@NotNull StudioTaskSubmission studioTaskSubmission, @NotNull MediaUploadSubmission mediaUploadSubmission) {
                Intrinsics.checkNotNullParameter(studioTaskSubmission, "studioTaskSubmission");
                Intrinsics.checkNotNullParameter(mediaUploadSubmission, "mediaUploadSubmission");
                this.studioTaskSubmission = studioTaskSubmission;
                this.mediaUploadSubmission = mediaUploadSubmission;
            }
        }

        @d
        public /* synthetic */ ExperimentalFeatures(int i, boolean z, boolean z3, MotionExperiment motionExperiment, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74, boolean z83, boolean z89, boolean z96, WaitingScreens waitingScreens, boolean z100, boolean z101, boolean z102, CameraXConfiguration cameraXConfiguration, boolean z103, boolean z104, DocumentDetectionExperiment documentDetectionExperiment, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                j1.f(SdkConfiguration$ExperimentalFeatures$$serializer.INSTANCE.getDescriptor(), i, 1);
                throw null;
            }
            this.isEnableIqs = z;
            if ((i & 2) == 0) {
                this.isEnableMultiFrameFeature = true;
            } else {
                this.isEnableMultiFrameFeature = z3;
            }
            this.motionExperiment = (i & 4) == 0 ? MotionExperiment.INSTANCE.getDISABLED() : motionExperiment;
            if ((i & 8) == 0) {
                this.isMotionTensorFlowLiteEnabled = true;
            } else {
                this.isMotionTensorFlowLiteEnabled = z4;
            }
            if ((i & 16) == 0) {
                this.isMotionCameraXEnabled = false;
            } else {
                this.isMotionCameraXEnabled = z6;
            }
            if ((i & 32) == 0) {
                this.isEnableCameraX = true;
            } else {
                this.isEnableCameraX = z11;
            }
            if ((i & 64) == 0) {
                this.isCameraxStreamSharingEnabled = true;
            } else {
                this.isCameraxStreamSharingEnabled = z12;
            }
            if ((i & 128) == 0) {
                this.isCameraXHighQualityModeEnabled = true;
            } else {
                this.isCameraXHighQualityModeEnabled = z29;
            }
            if ((i & 256) == 0) {
                this.isResolutionImprovementsEnabled = false;
            } else {
                this.isResolutionImprovementsEnabled = z31;
            }
            if ((i & 512) == 0) {
                this.isCutoffImprovementsEnabled = false;
            } else {
                this.isCutoffImprovementsEnabled = z41;
            }
            if ((i & 1024) == 0) {
                this.isFocusImprovementsEnabled = false;
            } else {
                this.isFocusImprovementsEnabled = z49;
            }
            if ((i & 2048) == 0) {
                this.isIncreasedCompressionQualityEnabled = false;
            } else {
                this.isIncreasedCompressionQualityEnabled = z54;
            }
            if ((i & 4096) == 0) {
                this.isDocumentCropDisabled = false;
            } else {
                this.isDocumentCropDisabled = z74;
            }
            if ((i & 8192) == 0) {
                this.isFourByThreeEnabled = true;
            } else {
                this.isFourByThreeEnabled = z83;
            }
            if ((i & 16384) == 0) {
                this.isGenericMrzValidatorEnabled = false;
            } else {
                this.isGenericMrzValidatorEnabled = z89;
            }
            if ((32768 & i) == 0) {
                this.isAutoFlashModeEnabled = false;
            } else {
                this.isAutoFlashModeEnabled = z96;
            }
            this.waitingScreens = (65536 & i) == 0 ? WaitingScreens.INSTANCE.getDEFAULT() : waitingScreens;
            if ((131072 & i) == 0) {
                this.isEnvironmentIntegrityCheckEnabled = false;
            } else {
                this.isEnvironmentIntegrityCheckEnabled = z100;
            }
            if ((262144 & i) == 0) {
                this.isStudioUserFlowExitEnabled = false;
            } else {
                this.isStudioUserFlowExitEnabled = z101;
            }
            if ((524288 & i) == 0) {
                this.isStudioUserFlowBackButtonEnabled = false;
            } else {
                this.isStudioUserFlowBackButtonEnabled = z102;
            }
            this.cameraXConfiguration = (1048576 & i) == 0 ? new CameraXConfiguration(false, false, false, false, false, false, false, false, 255, (DefaultConstructorMarker) null) : cameraXConfiguration;
            if ((2097152 & i) == 0) {
                this.isMediaCallbackCroppingDisabled = false;
            } else {
                this.isMediaCallbackCroppingDisabled = z103;
            }
            if ((4194304 & i) == 0) {
                this.isOnDeviceMRZExtractionEnabled = true;
            } else {
                this.isOnDeviceMRZExtractionEnabled = z104;
            }
            this.documentDetectionExperiment = (i & 8388608) == 0 ? new DocumentDetectionExperiment(false, false, 0, BitmapDescriptorFactory.HUE_RED, 15, (DefaultConstructorMarker) null) : documentDetectionExperiment;
        }

        public static /* synthetic */ ExperimentalFeatures copy$default(ExperimentalFeatures experimentalFeatures, boolean z, boolean z3, MotionExperiment motionExperiment, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74, boolean z83, boolean z89, boolean z96, WaitingScreens waitingScreens, boolean z100, boolean z101, boolean z102, CameraXConfiguration cameraXConfiguration, boolean z103, boolean z104, DocumentDetectionExperiment documentDetectionExperiment, int i, Object obj2) {
            DocumentDetectionExperiment documentDetectionExperiment2;
            boolean z105;
            boolean z106 = (i & 1) != 0 ? experimentalFeatures.isEnableIqs : z;
            boolean z107 = (i & 2) != 0 ? experimentalFeatures.isEnableMultiFrameFeature : z3;
            MotionExperiment motionExperiment2 = (i & 4) != 0 ? experimentalFeatures.motionExperiment : motionExperiment;
            boolean z108 = (i & 8) != 0 ? experimentalFeatures.isMotionTensorFlowLiteEnabled : z4;
            boolean z109 = (i & 16) != 0 ? experimentalFeatures.isMotionCameraXEnabled : z6;
            boolean z110 = (i & 32) != 0 ? experimentalFeatures.isEnableCameraX : z11;
            boolean z111 = (i & 64) != 0 ? experimentalFeatures.isCameraxStreamSharingEnabled : z12;
            boolean z112 = (i & 128) != 0 ? experimentalFeatures.isCameraXHighQualityModeEnabled : z29;
            boolean z113 = (i & 256) != 0 ? experimentalFeatures.isResolutionImprovementsEnabled : z31;
            boolean z114 = (i & 512) != 0 ? experimentalFeatures.isCutoffImprovementsEnabled : z41;
            boolean z115 = (i & 1024) != 0 ? experimentalFeatures.isFocusImprovementsEnabled : z49;
            boolean z116 = (i & 2048) != 0 ? experimentalFeatures.isIncreasedCompressionQualityEnabled : z54;
            boolean z117 = (i & 4096) != 0 ? experimentalFeatures.isDocumentCropDisabled : z74;
            boolean z118 = (i & 8192) != 0 ? experimentalFeatures.isFourByThreeEnabled : z83;
            boolean z119 = z106;
            boolean z120 = (i & 16384) != 0 ? experimentalFeatures.isGenericMrzValidatorEnabled : z89;
            boolean z121 = (i & 32768) != 0 ? experimentalFeatures.isAutoFlashModeEnabled : z96;
            WaitingScreens waitingScreens2 = (i & 65536) != 0 ? experimentalFeatures.waitingScreens : waitingScreens;
            boolean z122 = (i & 131072) != 0 ? experimentalFeatures.isEnvironmentIntegrityCheckEnabled : z100;
            boolean z123 = (i & 262144) != 0 ? experimentalFeatures.isStudioUserFlowExitEnabled : z101;
            boolean z124 = (i & 524288) != 0 ? experimentalFeatures.isStudioUserFlowBackButtonEnabled : z102;
            CameraXConfiguration cameraXConfiguration2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? experimentalFeatures.cameraXConfiguration : cameraXConfiguration;
            boolean z125 = (i & PKIFailureInfo.badSenderNonce) != 0 ? experimentalFeatures.isMediaCallbackCroppingDisabled : z103;
            boolean z126 = (i & 4194304) != 0 ? experimentalFeatures.isOnDeviceMRZExtractionEnabled : z104;
            if ((i & 8388608) != 0) {
                z105 = z126;
                documentDetectionExperiment2 = experimentalFeatures.documentDetectionExperiment;
            } else {
                documentDetectionExperiment2 = documentDetectionExperiment;
                z105 = z126;
            }
            return experimentalFeatures.copy(z119, z107, motionExperiment2, z108, z109, z110, z111, z112, z113, z114, z115, z116, z117, z118, z120, z121, waitingScreens2, z122, z123, z124, cameraXConfiguration2, z125, z105, documentDetectionExperiment2);
        }

        public static /* synthetic */ void getCameraXConfiguration$annotations() {
        }

        public static /* synthetic */ void getDocumentDetectionExperiment$annotations() {
        }

        public static /* synthetic */ void getMotionExperiment$annotations() {
        }

        public static /* synthetic */ void getWaitingScreens$annotations() {
        }

        public static /* synthetic */ void isAutoFlashModeEnabled$annotations() {
        }

        public static /* synthetic */ void isCameraXHighQualityModeEnabled$annotations() {
        }

        public static /* synthetic */ void isCameraxStreamSharingEnabled$annotations() {
        }

        public static /* synthetic */ void isCutoffImprovementsEnabled$annotations() {
        }

        public static /* synthetic */ void isDocumentCropDisabled$annotations() {
        }

        public static /* synthetic */ void isEnableCameraX$annotations() {
        }

        public static /* synthetic */ void isEnableIqs$annotations() {
        }

        public static /* synthetic */ void isEnableMultiFrameFeature$annotations() {
        }

        public static /* synthetic */ void isEnvironmentIntegrityCheckEnabled$annotations() {
        }

        public static /* synthetic */ void isFocusImprovementsEnabled$annotations() {
        }

        public static /* synthetic */ void isFourByThreeEnabled$annotations() {
        }

        public static /* synthetic */ void isGenericMrzValidatorEnabled$annotations() {
        }

        public static /* synthetic */ void isIncreasedCompressionQualityEnabled$annotations() {
        }

        public static /* synthetic */ void isMediaCallbackCroppingDisabled$annotations() {
        }

        public static /* synthetic */ void isMotionCameraXEnabled$annotations() {
        }

        public static /* synthetic */ void isMotionTensorFlowLiteEnabled$annotations() {
        }

        public static /* synthetic */ void isOnDeviceMRZExtractionEnabled$annotations() {
        }

        public static /* synthetic */ void isResolutionImprovementsEnabled$annotations() {
        }

        public static /* synthetic */ void isStudioUserFlowBackButtonEnabled$annotations() {
        }

        public static /* synthetic */ void isStudioUserFlowExitEnabled$annotations() {
        }

        /* JADX WARN: Removed duplicated region for block: B:121:0x018c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void write$Self$onfido_api_client(com.onfido.api.client.data.SdkConfiguration.ExperimentalFeatures r13, kotlinx.serialization.encoding.CompositeEncoder r14, kotlinx.serialization.descriptors.SerialDescriptor r15) {
            /*
                Method dump skipped, instruction units count: 478
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.api.client.data.SdkConfiguration.ExperimentalFeatures.write$Self$onfido_api_client(com.onfido.api.client.data.SdkConfiguration$ExperimentalFeatures, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsEnableIqs() {
            return this.isEnableIqs;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final boolean getIsCutoffImprovementsEnabled() {
            return this.isCutoffImprovementsEnabled;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final boolean getIsFocusImprovementsEnabled() {
            return this.isFocusImprovementsEnabled;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final boolean getIsIncreasedCompressionQualityEnabled() {
            return this.isIncreasedCompressionQualityEnabled;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final boolean getIsDocumentCropDisabled() {
            return this.isDocumentCropDisabled;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final boolean getIsFourByThreeEnabled() {
            return this.isFourByThreeEnabled;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final boolean getIsGenericMrzValidatorEnabled() {
            return this.isGenericMrzValidatorEnabled;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final boolean getIsAutoFlashModeEnabled() {
            return this.isAutoFlashModeEnabled;
        }

        @NotNull
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final WaitingScreens getWaitingScreens() {
            return this.waitingScreens;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final boolean getIsEnvironmentIntegrityCheckEnabled() {
            return this.isEnvironmentIntegrityCheckEnabled;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final boolean getIsStudioUserFlowExitEnabled() {
            return this.isStudioUserFlowExitEnabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsEnableMultiFrameFeature() {
            return this.isEnableMultiFrameFeature;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final boolean getIsStudioUserFlowBackButtonEnabled() {
            return this.isStudioUserFlowBackButtonEnabled;
        }

        @NotNull
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final CameraXConfiguration getCameraXConfiguration() {
            return this.cameraXConfiguration;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final boolean getIsMediaCallbackCroppingDisabled() {
            return this.isMediaCallbackCroppingDisabled;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        public final boolean getIsOnDeviceMRZExtractionEnabled() {
            return this.isOnDeviceMRZExtractionEnabled;
        }

        @NotNull
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final DocumentDetectionExperiment getDocumentDetectionExperiment() {
            return this.documentDetectionExperiment;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MotionExperiment getMotionExperiment() {
            return this.motionExperiment;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsMotionTensorFlowLiteEnabled() {
            return this.isMotionTensorFlowLiteEnabled;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsMotionCameraXEnabled() {
            return this.isMotionCameraXEnabled;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsEnableCameraX() {
            return this.isEnableCameraX;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsCameraxStreamSharingEnabled() {
            return this.isCameraxStreamSharingEnabled;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsCameraXHighQualityModeEnabled() {
            return this.isCameraXHighQualityModeEnabled;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsResolutionImprovementsEnabled() {
            return this.isResolutionImprovementsEnabled;
        }

        @NotNull
        public final ExperimentalFeatures copy(boolean isEnableIqs, boolean isEnableMultiFrameFeature, @NotNull MotionExperiment motionExperiment, boolean isMotionTensorFlowLiteEnabled, boolean isMotionCameraXEnabled, boolean isEnableCameraX, boolean isCameraxStreamSharingEnabled, boolean isCameraXHighQualityModeEnabled, boolean isResolutionImprovementsEnabled, boolean isCutoffImprovementsEnabled, boolean isFocusImprovementsEnabled, boolean isIncreasedCompressionQualityEnabled, boolean isDocumentCropDisabled, boolean isFourByThreeEnabled, boolean isGenericMrzValidatorEnabled, boolean isAutoFlashModeEnabled, @NotNull WaitingScreens waitingScreens, boolean isEnvironmentIntegrityCheckEnabled, boolean isStudioUserFlowExitEnabled, boolean isStudioUserFlowBackButtonEnabled, @NotNull CameraXConfiguration cameraXConfiguration, boolean isMediaCallbackCroppingDisabled, boolean isOnDeviceMRZExtractionEnabled, @NotNull DocumentDetectionExperiment documentDetectionExperiment) {
            Intrinsics.checkNotNullParameter(motionExperiment, "motionExperiment");
            Intrinsics.checkNotNullParameter(waitingScreens, "waitingScreens");
            Intrinsics.checkNotNullParameter(cameraXConfiguration, "cameraXConfiguration");
            Intrinsics.checkNotNullParameter(documentDetectionExperiment, "documentDetectionExperiment");
            return new ExperimentalFeatures(isEnableIqs, isEnableMultiFrameFeature, motionExperiment, isMotionTensorFlowLiteEnabled, isMotionCameraXEnabled, isEnableCameraX, isCameraxStreamSharingEnabled, isCameraXHighQualityModeEnabled, isResolutionImprovementsEnabled, isCutoffImprovementsEnabled, isFocusImprovementsEnabled, isIncreasedCompressionQualityEnabled, isDocumentCropDisabled, isFourByThreeEnabled, isGenericMrzValidatorEnabled, isAutoFlashModeEnabled, waitingScreens, isEnvironmentIntegrityCheckEnabled, isStudioUserFlowExitEnabled, isStudioUserFlowBackButtonEnabled, cameraXConfiguration, isMediaCallbackCroppingDisabled, isOnDeviceMRZExtractionEnabled, documentDetectionExperiment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExperimentalFeatures)) {
                return false;
            }
            ExperimentalFeatures experimentalFeatures = (ExperimentalFeatures) other;
            return this.isEnableIqs == experimentalFeatures.isEnableIqs && this.isEnableMultiFrameFeature == experimentalFeatures.isEnableMultiFrameFeature && Intrinsics.f(this.motionExperiment, experimentalFeatures.motionExperiment) && this.isMotionTensorFlowLiteEnabled == experimentalFeatures.isMotionTensorFlowLiteEnabled && this.isMotionCameraXEnabled == experimentalFeatures.isMotionCameraXEnabled && this.isEnableCameraX == experimentalFeatures.isEnableCameraX && this.isCameraxStreamSharingEnabled == experimentalFeatures.isCameraxStreamSharingEnabled && this.isCameraXHighQualityModeEnabled == experimentalFeatures.isCameraXHighQualityModeEnabled && this.isResolutionImprovementsEnabled == experimentalFeatures.isResolutionImprovementsEnabled && this.isCutoffImprovementsEnabled == experimentalFeatures.isCutoffImprovementsEnabled && this.isFocusImprovementsEnabled == experimentalFeatures.isFocusImprovementsEnabled && this.isIncreasedCompressionQualityEnabled == experimentalFeatures.isIncreasedCompressionQualityEnabled && this.isDocumentCropDisabled == experimentalFeatures.isDocumentCropDisabled && this.isFourByThreeEnabled == experimentalFeatures.isFourByThreeEnabled && this.isGenericMrzValidatorEnabled == experimentalFeatures.isGenericMrzValidatorEnabled && this.isAutoFlashModeEnabled == experimentalFeatures.isAutoFlashModeEnabled && Intrinsics.f(this.waitingScreens, experimentalFeatures.waitingScreens) && this.isEnvironmentIntegrityCheckEnabled == experimentalFeatures.isEnvironmentIntegrityCheckEnabled && this.isStudioUserFlowExitEnabled == experimentalFeatures.isStudioUserFlowExitEnabled && this.isStudioUserFlowBackButtonEnabled == experimentalFeatures.isStudioUserFlowBackButtonEnabled && Intrinsics.f(this.cameraXConfiguration, experimentalFeatures.cameraXConfiguration) && this.isMediaCallbackCroppingDisabled == experimentalFeatures.isMediaCallbackCroppingDisabled && this.isOnDeviceMRZExtractionEnabled == experimentalFeatures.isOnDeviceMRZExtractionEnabled && Intrinsics.f(this.documentDetectionExperiment, experimentalFeatures.documentDetectionExperiment);
        }

        @NotNull
        public final CameraXConfiguration getCameraXConfiguration() {
            return this.cameraXConfiguration;
        }

        @NotNull
        public final DocumentDetectionExperiment getDocumentDetectionExperiment() {
            return this.documentDetectionExperiment;
        }

        @NotNull
        public final MotionExperiment getMotionExperiment() {
            return this.motionExperiment;
        }

        @NotNull
        public final WaitingScreens getWaitingScreens() {
            return this.waitingScreens;
        }

        public int hashCode() {
            return this.documentDetectionExperiment.hashCode() + a.c(a.c((this.cameraXConfiguration.hashCode() + a.c(a.c(a.c((this.waitingScreens.hashCode() + a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c((this.motionExperiment.hashCode() + a.c(Boolean.hashCode(this.isEnableIqs) * 31, 31, this.isEnableMultiFrameFeature)) * 31, 31, this.isMotionTensorFlowLiteEnabled), 31, this.isMotionCameraXEnabled), 31, this.isEnableCameraX), 31, this.isCameraxStreamSharingEnabled), 31, this.isCameraXHighQualityModeEnabled), 31, this.isResolutionImprovementsEnabled), 31, this.isCutoffImprovementsEnabled), 31, this.isFocusImprovementsEnabled), 31, this.isIncreasedCompressionQualityEnabled), 31, this.isDocumentCropDisabled), 31, this.isFourByThreeEnabled), 31, this.isGenericMrzValidatorEnabled), 31, this.isAutoFlashModeEnabled)) * 31, 31, this.isEnvironmentIntegrityCheckEnabled), 31, this.isStudioUserFlowExitEnabled), 31, this.isStudioUserFlowBackButtonEnabled)) * 31, 31, this.isMediaCallbackCroppingDisabled), 31, this.isOnDeviceMRZExtractionEnabled);
        }

        public final boolean isAutoFlashModeEnabled() {
            return this.isAutoFlashModeEnabled;
        }

        public final boolean isCameraXHighQualityModeEnabled() {
            return this.isCameraXHighQualityModeEnabled;
        }

        public final boolean isCameraxStreamSharingEnabled() {
            return this.isCameraxStreamSharingEnabled;
        }

        public final boolean isCutoffImprovementsEnabled() {
            return this.isCutoffImprovementsEnabled;
        }

        public final boolean isDocumentCropDisabled() {
            return this.isDocumentCropDisabled;
        }

        public final boolean isEnableCameraX() {
            return this.isEnableCameraX;
        }

        public final boolean isEnableIqs() {
            return this.isEnableIqs;
        }

        public final boolean isEnableMultiFrameFeature() {
            return this.isEnableMultiFrameFeature;
        }

        public final boolean isEnvironmentIntegrityCheckEnabled() {
            return this.isEnvironmentIntegrityCheckEnabled;
        }

        public final boolean isFocusImprovementsEnabled() {
            return this.isFocusImprovementsEnabled;
        }

        public final boolean isFourByThreeEnabled() {
            return this.isFourByThreeEnabled;
        }

        public final boolean isGenericMrzValidatorEnabled() {
            return this.isGenericMrzValidatorEnabled;
        }

        public final boolean isIncreasedCompressionQualityEnabled() {
            return this.isIncreasedCompressionQualityEnabled;
        }

        public final boolean isMediaCallbackCroppingDisabled() {
            return this.isMediaCallbackCroppingDisabled;
        }

        public final boolean isMotionCameraXEnabled() {
            return this.isMotionCameraXEnabled;
        }

        public final boolean isMotionTensorFlowLiteEnabled() {
            return this.isMotionTensorFlowLiteEnabled;
        }

        public final boolean isOnDeviceMRZExtractionEnabled() {
            return this.isOnDeviceMRZExtractionEnabled;
        }

        public final boolean isResolutionImprovementsEnabled() {
            return this.isResolutionImprovementsEnabled;
        }

        public final boolean isStudioUserFlowBackButtonEnabled() {
            return this.isStudioUserFlowBackButtonEnabled;
        }

        public final boolean isStudioUserFlowExitEnabled() {
            return this.isStudioUserFlowExitEnabled;
        }

        @NotNull
        public String toString() {
            boolean z = this.isEnableIqs;
            boolean z3 = this.isEnableMultiFrameFeature;
            MotionExperiment motionExperiment = this.motionExperiment;
            boolean z4 = this.isMotionTensorFlowLiteEnabled;
            boolean z6 = this.isMotionCameraXEnabled;
            boolean z11 = this.isEnableCameraX;
            boolean z12 = this.isCameraxStreamSharingEnabled;
            boolean z29 = this.isCameraXHighQualityModeEnabled;
            boolean z31 = this.isResolutionImprovementsEnabled;
            boolean z41 = this.isCutoffImprovementsEnabled;
            boolean z49 = this.isFocusImprovementsEnabled;
            boolean z54 = this.isIncreasedCompressionQualityEnabled;
            boolean z74 = this.isDocumentCropDisabled;
            boolean z83 = this.isFourByThreeEnabled;
            boolean z89 = this.isGenericMrzValidatorEnabled;
            boolean z96 = this.isAutoFlashModeEnabled;
            WaitingScreens waitingScreens = this.waitingScreens;
            boolean z100 = this.isEnvironmentIntegrityCheckEnabled;
            boolean z101 = this.isStudioUserFlowExitEnabled;
            boolean z102 = this.isStudioUserFlowBackButtonEnabled;
            CameraXConfiguration cameraXConfiguration = this.cameraXConfiguration;
            boolean z103 = this.isMediaCallbackCroppingDisabled;
            boolean z104 = this.isOnDeviceMRZExtractionEnabled;
            DocumentDetectionExperiment documentDetectionExperiment = this.documentDetectionExperiment;
            StringBuilder sb6 = new StringBuilder("ExperimentalFeatures(isEnableIqs=");
            sb6.append(z);
            sb6.append(", isEnableMultiFrameFeature=");
            sb6.append(z3);
            sb6.append(", motionExperiment=");
            sb6.append(motionExperiment);
            sb6.append(", isMotionTensorFlowLiteEnabled=");
            sb6.append(z4);
            sb6.append(", isMotionCameraXEnabled=");
            t61.a.y(sb6, z6, ", isEnableCameraX=", z11, ", isCameraxStreamSharingEnabled=");
            t61.a.y(sb6, z12, ", isCameraXHighQualityModeEnabled=", z29, ", isResolutionImprovementsEnabled=");
            t61.a.y(sb6, z31, ", isCutoffImprovementsEnabled=", z41, ", isFocusImprovementsEnabled=");
            t61.a.y(sb6, z49, ", isIncreasedCompressionQualityEnabled=", z54, ", isDocumentCropDisabled=");
            t61.a.y(sb6, z74, ", isFourByThreeEnabled=", z83, ", isGenericMrzValidatorEnabled=");
            t61.a.y(sb6, z89, ", isAutoFlashModeEnabled=", z96, ", waitingScreens=");
            sb6.append(waitingScreens);
            sb6.append(", isEnvironmentIntegrityCheckEnabled=");
            sb6.append(z100);
            sb6.append(", isStudioUserFlowExitEnabled=");
            t61.a.y(sb6, z101, ", isStudioUserFlowBackButtonEnabled=", z102, ", cameraXConfiguration=");
            sb6.append(cameraXConfiguration);
            sb6.append(", isMediaCallbackCroppingDisabled=");
            sb6.append(z103);
            sb6.append(", isOnDeviceMRZExtractionEnabled=");
            sb6.append(z104);
            sb6.append(", documentDetectionExperiment=");
            sb6.append(documentDetectionExperiment);
            sb6.append(")");
            return sb6.toString();
        }

        public ExperimentalFeatures(boolean z, boolean z3, @NotNull MotionExperiment motionExperiment, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74, boolean z83, boolean z89, boolean z96, @NotNull WaitingScreens waitingScreens, boolean z100, boolean z101, boolean z102, @NotNull CameraXConfiguration cameraXConfiguration, boolean z103, boolean z104, @NotNull DocumentDetectionExperiment documentDetectionExperiment) {
            Intrinsics.checkNotNullParameter(motionExperiment, "motionExperiment");
            Intrinsics.checkNotNullParameter(waitingScreens, "waitingScreens");
            Intrinsics.checkNotNullParameter(cameraXConfiguration, "cameraXConfiguration");
            Intrinsics.checkNotNullParameter(documentDetectionExperiment, "documentDetectionExperiment");
            this.isEnableIqs = z;
            this.isEnableMultiFrameFeature = z3;
            this.motionExperiment = motionExperiment;
            this.isMotionTensorFlowLiteEnabled = z4;
            this.isMotionCameraXEnabled = z6;
            this.isEnableCameraX = z11;
            this.isCameraxStreamSharingEnabled = z12;
            this.isCameraXHighQualityModeEnabled = z29;
            this.isResolutionImprovementsEnabled = z31;
            this.isCutoffImprovementsEnabled = z41;
            this.isFocusImprovementsEnabled = z49;
            this.isIncreasedCompressionQualityEnabled = z54;
            this.isDocumentCropDisabled = z74;
            this.isFourByThreeEnabled = z83;
            this.isGenericMrzValidatorEnabled = z89;
            this.isAutoFlashModeEnabled = z96;
            this.waitingScreens = waitingScreens;
            this.isEnvironmentIntegrityCheckEnabled = z100;
            this.isStudioUserFlowExitEnabled = z101;
            this.isStudioUserFlowBackButtonEnabled = z102;
            this.cameraXConfiguration = cameraXConfiguration;
            this.isMediaCallbackCroppingDisabled = z103;
            this.isOnDeviceMRZExtractionEnabled = z104;
            this.documentDetectionExperiment = documentDetectionExperiment;
        }

        public /* synthetic */ ExperimentalFeatures(boolean z, boolean z3, MotionExperiment motionExperiment, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74, boolean z83, boolean z89, boolean z96, WaitingScreens waitingScreens, boolean z100, boolean z101, boolean z102, CameraXConfiguration cameraXConfiguration, boolean z103, boolean z104, DocumentDetectionExperiment documentDetectionExperiment, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? true : z3, (i & 4) != 0 ? MotionExperiment.INSTANCE.getDISABLED() : motionExperiment, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? false : z6, (i & 32) != 0 ? true : z11, (i & 64) != 0 ? true : z12, (i & 128) != 0 ? true : z29, (i & 256) != 0 ? false : z31, (i & 512) != 0 ? false : z41, (i & 1024) != 0 ? false : z49, (i & 2048) != 0 ? false : z54, (i & 4096) != 0 ? false : z74, (i & 8192) != 0 ? true : z83, (i & 16384) != 0 ? false : z89, (i & 32768) != 0 ? false : z96, (i & 65536) != 0 ? WaitingScreens.INSTANCE.getDEFAULT() : waitingScreens, (i & 131072) != 0 ? false : z100, (i & 262144) != 0 ? false : z101, (i & 524288) != 0 ? false : z102, (i & PKIFailureInfo.badCertTemplate) != 0 ? new CameraXConfiguration(false, false, false, false, false, false, false, false, 255, (DefaultConstructorMarker) null) : cameraXConfiguration, (i & PKIFailureInfo.badSenderNonce) == 0 ? z103 : false, (i & 4194304) != 0 ? true : z104, (i & 8388608) != 0 ? new DocumentDetectionExperiment(false, false, 0, BitmapDescriptorFactory.HUE_RED, 15, (DefaultConstructorMarker) null) : documentDetectionExperiment);
        }
    }

    public /* synthetic */ SdkConfiguration(Validations validations, DocumentCapture documentCapture, ExperimentalFeatures experimentalFeatures, LivenessCapture livenessCapture, SelfieCapture selfieCapture, MotionCapture motionCapture, SdkFeatures sdkFeatures, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : validations, (i & 2) != 0 ? null : documentCapture, (i & 4) != 0 ? null : experimentalFeatures, (i & 8) != 0 ? null : livenessCapture, (i & 16) != 0 ? null : selfieCapture, (i & 32) != 0 ? null : motionCapture, (i & 64) != 0 ? null : sdkFeatures, (i & 128) != 0 ? null : str);
    }
}
