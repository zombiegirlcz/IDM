package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import com.onfido.android.sdk.FlowConfig;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.common.cryptography.PayloadHelper;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.common.permissions.PermissionsManagementFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.di.qualifier.CustomerUserHash;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.nfc.NfcService;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionFragment;
import com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.util.logging.CrashHandlerWorker;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.android.sdk.capture.ui.BaseActivity;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment;
import com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessIntroFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayView;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment;
import com.onfido.android.sdk.capture.ui.camera.util.CameraPermissionsUtils;
import com.onfido.android.sdk.capture.ui.documentselection.di.RestrictedDocumentSelectionHostComponent;
import com.onfido.android.sdk.capture.ui.faceintro.FaceIntroFragment;
import com.onfido.android.sdk.capture.ui.finalscreen.FinalScreenFragment;
import com.onfido.android.sdk.capture.ui.nfc.NfcChipBlockedFragment;
import com.onfido.android.sdk.capture.ui.nfc.NfcChipBlockedOptionalFragment;
import com.onfido.android.sdk.capture.ui.nfc.NfcDeviceNotSupportedFragment;
import com.onfido.android.sdk.capture.ui.nfc.NfcDocumentNotSupportedFragment;
import com.onfido.android.sdk.capture.ui.nfc.NfcHostFragment;
import com.onfido.android.sdk.capture.ui.nfc.NfcScanFailFragment;
import com.onfido.android.sdk.capture.ui.nfc.permission.NfcPermissionFragment;
import com.onfido.android.sdk.capture.ui.nfc.scan.NfcPinEntryFragment;
import com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment;
import com.onfido.android.sdk.capture.ui.proofOfAddress.di.PoaComponent;
import com.onfido.android.sdk.capture.ui.userconsent.UserConsentFragment;
import com.onfido.android.sdk.capture.ui.welcome.WelcomeFragment;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import com.onfido.android.sdk.workflow.internal.workflow.tasks.documentupload.WorkflowSupportedDocumentsStore;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.api.client.token.sdk.ApplicantId;
import kotlin.Metadata;
import kotlinx.serialization.json.Json;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0018H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001fH ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020 H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020!H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\"H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020#H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020$H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020%H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020&H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020'H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020*H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020+H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020,H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020-H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020.H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020/H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000200H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000201H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000202H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000203H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000204H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000205H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000206H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000207H ¢\u0006\u0002\b\u0015J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u00108\u001a\u000209H ¢\u0006\u0002\b\u0015J\b\u0010:\u001a\u00020;H&J\b\u0010<\u001a\u00020=H&J\b\u0010>\u001a\u00020?H&J\b\u0010@\u001a\u00020AH&J\b\u0010B\u001a\u00020CH&J\b\u0010D\u001a\u00020EH&J\b\u0010F\u001a\u00020GH&J\b\u0010H\u001a\u00020IH&J\r\u0010J\u001a\u00020KH ¢\u0006\u0002\bLJ\b\u0010M\u001a\u00020NH&J\b\u0010O\u001a\u00020PH'J\b\u0010Q\u001a\u00020RH&J\r\u0010S\u001a\u00020TH ¢\u0006\u0002\bUJ\r\u0010V\u001a\u00020WH ¢\u0006\u0002\bXJ\r\u0010Y\u001a\u00020ZH ¢\u0006\u0002\b[J\r\u0010\\\u001a\u00020]H ¢\u0006\u0002\b^J\b\u0010_\u001a\u00020`H&J\b\u0010a\u001a\u00020bH&J\b\u0010c\u001a\u00020dH&¨\u0006e"}, d2 = {"Lcom/onfido/android/sdk/capture/common/di/SdkComponent;", "", "()V", "applicationContext", "Landroid/content/Context;", "dispatchersProvider", "Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "flowConfig", "Lcom/onfido/android/sdk/FlowConfig;", "flowTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;", "getJsonParser", "Lkotlinx/serialization/json/Json;", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "getRetrofit", "Lretrofit2/Retrofit;", "inject", "", "fragment", "Lcom/onfido/android/sdk/capture/common/permissions/PermissionsManagementFragment;", "inject$onfido_capture_sdk_core_release", "service", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcService;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionFragment;", "crashHandlerWorker", "Lcom/onfido/android/sdk/capture/internal/util/logging/CrashHandlerWorker;", "baseActivity", "Lcom/onfido/android/sdk/capture/ui/BaseActivity;", "activity", "Lcom/onfido/android/sdk/capture/ui/OnfidoActivity;", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureActivity;", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureFragment;", "Lcom/onfido/android/sdk/capture/ui/camera/face/FaceConfirmationFragment;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessIntroFragment;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessOverlayView;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessCaptureFragment;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView;", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureFragment;", "cameraPermissionsUtils", "Lcom/onfido/android/sdk/capture/ui/camera/util/CameraPermissionsUtils;", "Lcom/onfido/android/sdk/capture/ui/faceintro/FaceIntroFragment;", "Lcom/onfido/android/sdk/capture/ui/finalscreen/FinalScreenFragment;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcChipBlockedFragment;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcChipBlockedOptionalFragment;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcDeviceNotSupportedFragment;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcDocumentNotSupportedFragment;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcScanFailFragment;", "Lcom/onfido/android/sdk/capture/ui/nfc/permission/NfcPermissionFragment;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcPinEntryFragment;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanFragment;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment;", "Lcom/onfido/android/sdk/capture/ui/welcome/WelcomeFragment;", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment;", "view", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble;", "nativeDetector", "Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;", "onfidoAnalytics", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "onfidoApiService", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "onfidoFetcher", "Lcom/onfido/api/client/OnfidoFetcher;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "onfidoSupportedDocumentsRepository", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/OnfidoSupportedDocumentsRepository;", "onfidoTokenProvider", "Lcom/onfido/android/sdk/capture/internal/token/OnfidoTokenProvider;", "poaComponentFactory", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/di/PoaComponent$Factory;", "poaComponentFactory$onfido_capture_sdk_core_release", "provideApplicantId", "Lcom/onfido/api/client/token/sdk/ApplicantId;", "provideCustomerUserHash", "", "provideNfcInteractor", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "providePayloadHelper", "Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;", "providePayloadHelper$onfido_capture_sdk_core_release", "provideSdkUploadMetadataHelper", "Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;", "provideSdkUploadMetadataHelper$onfido_capture_sdk_core_release", "provideTimeProvider", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "provideTimeProvider$onfido_capture_sdk_core_release", "rdsHostComponentFactory", "Lcom/onfido/android/sdk/capture/ui/documentselection/di/RestrictedDocumentSelectionHostComponent$Factory;", "rdsHostComponentFactory$onfido_capture_sdk_core_release", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "waitingScreenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "workflowSupportedDocumentsStore", "Lcom/onfido/android/sdk/workflow/internal/workflow/tasks/documentupload/WorkflowSupportedDocumentsStore;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SdkComponent {
    @ApplicationContext
    @NotNull
    public abstract Context applicationContext();

    @NotNull
    public abstract DispatchersProvider dispatchersProvider();

    public abstract FlowConfig flowConfig();

    @NotNull
    public abstract FlowTracker flowTracker();

    @NotNull
    public abstract Json getJsonParser();

    @NotNull
    public abstract OkHttpClient getOkHttpClient();

    @NotNull
    public abstract Retrofit getRetrofit();

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull PermissionsManagementFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull NfcService service);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull CountrySelectionFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull CrashHandlerWorker crashHandlerWorker);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull BaseActivity baseActivity);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull OnfidoActivity activity);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull CaptureActivity activity);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull DocumentCaptureFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull FaceConfirmationFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull LivenessConfirmationFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull LivenessIntroFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull LivenessOverlayView fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull LivenessCaptureFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull LivenessChallengesLoadingView fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull SelfieCaptureFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull CameraPermissionsUtils cameraPermissionsUtils);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull FaceIntroFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull FinalScreenFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull NfcChipBlockedFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull NfcChipBlockedOptionalFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull NfcDeviceNotSupportedFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull NfcDocumentNotSupportedFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull NfcHostFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull NfcScanFailFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull NfcPermissionFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull NfcPinEntryFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull NfcScanFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull UserConsentFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull WelcomeFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull LoadingFragment fragment);

    public abstract void inject$onfido_capture_sdk_core_release(@NotNull OnfidoCaptureValidationBubble view);

    @NotNull
    public abstract NativeDetector nativeDetector();

    @NotNull
    public abstract OnfidoAnalytics onfidoAnalytics();

    @NotNull
    public abstract OnfidoApiService onfidoApiService();

    @NotNull
    public abstract OnfidoConfig onfidoConfig();

    @NotNull
    public abstract OnfidoFetcher onfidoFetcher();

    @NotNull
    public abstract OnfidoRemoteConfig onfidoRemoteConfig();

    @NotNull
    public abstract OnfidoSupportedDocumentsRepository onfidoSupportedDocumentsRepository();

    @NotNull
    public abstract OnfidoTokenProvider onfidoTokenProvider();

    @NotNull
    public abstract PoaComponent.Factory poaComponentFactory$onfido_capture_sdk_core_release();

    @NotNull
    public abstract ApplicantId provideApplicantId();

    @CustomerUserHash
    @NotNull
    public abstract String provideCustomerUserHash();

    @NotNull
    public abstract NfcInteractor provideNfcInteractor();

    @NotNull
    public abstract PayloadHelper providePayloadHelper$onfido_capture_sdk_core_release();

    @NotNull
    public abstract SdkUploadMetadataHelper provideSdkUploadMetadataHelper$onfido_capture_sdk_core_release();

    @NotNull
    public abstract TimeProvider provideTimeProvider$onfido_capture_sdk_core_release();

    @NotNull
    public abstract RestrictedDocumentSelectionHostComponent.Factory rdsHostComponentFactory$onfido_capture_sdk_core_release();

    @NotNull
    public abstract SchedulersProvider schedulersProvider();

    @NotNull
    public abstract WaitingScreenTracker waitingScreenTracker();

    @NotNull
    public abstract WorkflowSupportedDocumentsStore workflowSupportedDocumentsStore();
}
