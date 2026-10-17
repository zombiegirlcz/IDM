package com.onfido.android.sdk.capture.ui.proofOfAddress.host;

import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$RequestPermission;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.google.android.material.internal.ViewUtils;
import com.onfido.android.sdk.capture.DocumentFormat;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.permissions.PermissionResult;
import com.onfido.android.sdk.capture.common.permissions.PermissionsManagementFragment;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.core.config.FailureReason;
import com.onfido.android.sdk.capture.core.config.FlowFragment;
import com.onfido.android.sdk.capture.core.features.poa.PoAFlow;
import com.onfido.android.sdk.capture.databinding.OnfidoActivityCaptureBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoPoaFragmentHostBinding;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.FlowStepDirection;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionFragment;
import com.onfido.android.sdk.capture.internal.util.FragmentManagerExtKt;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.ui.proofOfAddress.PoaUtils;
import com.onfido.android.sdk.capture.ui.proofOfAddress.di.PoaComponent;
import com.onfido.android.sdk.capture.ui.proofOfAddress.documentDetails.PoaDocumentDetailsFragment;
import com.onfido.android.sdk.capture.ui.proofOfAddress.documentSelection.PoaDocumentSelectionFragment;
import com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionFragment;
import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel;
import com.onfido.android.sdk.capture.ui.proofOfAddress.verifyAddress.PoaVerifyAddressFragment;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.api.client.data.DocSide;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yhm.j;
import yhm.k;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 f2\u00020\u00012\u00020\u0002:\u0002fgB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020EH\u0002J\b\u0010G\u001a\u00020AH\u0002J\b\u0010H\u001a\u00020AH\u0002J\u0010\u0010I\u001a\u00020A2\u0006\u0010J\u001a\u00020KH\u0002J\u001a\u0010L\u001a\u00020A2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020AH\u0002J\b\u0010R\u001a\u00020AH\u0002J\b\u0010S\u001a\u00020AH\u0002J\b\u0010T\u001a\u00020AH\u0002J\u001a\u0010U\u001a\u00020A2\u0006\u0010>\u001a\u00020?2\b\b\u0002\u0010V\u001a\u00020EH\u0002J\b\u0010W\u001a\u00020AH\u0002J\b\u0010X\u001a\u00020AH\u0002J\b\u0010Y\u001a\u00020AH\u0002J\b\u0010Z\u001a\u00020AH\u0016J\b\u0010[\u001a\u00020AH\u0016J\b\u0010\\\u001a\u00020AH\u0016J\b\u0010]\u001a\u00020AH\u0016J\b\u0010^\u001a\u00020AH\u0016J\u0010\u0010_\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010`\u001a\u00020A2\u0006\u0010a\u001a\u00020bH\u0002J\u0010\u0010c\u001a\u00020A2\u0006\u0010d\u001a\u00020eH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\u001e\u0010'\u001a\u00020(8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010:0:0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010;\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010:0:0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006h"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment;", "Lcom/onfido/android/sdk/capture/core/config/FlowFragment;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaFlowController;", "()V", "imageUtils", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "getImageUtils$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "setImageUtils$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/utils/ImageUtils;)V", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "getOnfidoConfig$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/OnfidoConfig;", "setOnfidoConfig$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/OnfidoConfig;)V", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "getOnfidoRemoteConfig$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "setOnfidoRemoteConfig$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "permissionsResultsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "poaComponent", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/di/PoaComponent;", "getPoaComponent$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/di/PoaComponent;", "poaComponent$delegate", "Lkotlin/Lazy;", "poaHostViewModel", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel;", "getPoaHostViewModel", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel;", "poaHostViewModel$delegate", "poaUtils", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/PoaUtils;", "getPoaUtils$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/PoaUtils;", "setPoaUtils$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/proofOfAddress/PoaUtils;)V", "poaViewModelFactory", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel$Factory;", "getPoaViewModelFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel$Factory;", "setPoaViewModelFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel$Factory;)V", "runtimePermissionsManager", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "getRuntimePermissionsManager$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "setRuntimePermissionsManager$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;)V", "takePictureIntentResultObserver", "Landroid/content/Intent;", "uploadMediaIntentResultObserver", "getFragmentReplacementTransaction", "Landroidx/fragment/app/FragmentTransaction;", "fragment", "Landroidx/fragment/app/Fragment;", "handleBackNavigation", "", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoPoaFragmentHostBinding;", "isFirstPoaScreen", "", "isSubmissionScreen", "launchCaptureActivity", "launchDocumentCaptureFragment", "moveToDocumentSubmission", "fileUri", "Landroid/net/Uri;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openCaptureAfterPermissionsGranted", "openCaptureScreen", "openPoaUploadMediaPicker", "removeCaptureFragmentIfPresent", "setFragment", "shouldAddToBackStack", "setFragmentResultsListeners", "showInvalidFileDialog", "showPermissionsManagementFragment", "showPoaCountrySelectionScreen", "showPoaDocumentDetailsScreen", "showPoaDocumentSelectionScreen", "showPoaDocumentSubmissionScreen", "showPoaVerifyAddressScreen", "showSystemBars", "submitResult", "result", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult;", "takeActionOnCountriesDownload", "countriesResponse", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel$GetCountriesResponse;", "Companion", "PoaResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PoaHostFragment extends FlowFragment implements PoaFlowController {
    public ImageUtils imageUtils;

    @NotNull
    private final LifecycleAwareDialog lifecycleAwareDialog;
    public OnfidoConfig onfidoConfig;
    public OnfidoRemoteConfig onfidoRemoteConfig;

    @NotNull
    private final ActivityResultLauncher<String> permissionsResultsLauncher;

    /* JADX INFO: renamed from: poaComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy poaComponent;

    /* JADX INFO: renamed from: poaHostViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy poaHostViewModel;
    public PoaUtils poaUtils;
    public PoaHostViewModel.Factory poaViewModelFactory;
    public RuntimePermissionsManager runtimePermissionsManager;

    @NotNull
    private final ActivityResultLauncher<Intent> takePictureIntentResultObserver;

    @NotNull
    private final ActivityResultLauncher<Intent> uploadMediaIntentResultObserver;

    @NotNull
    private static final String KEY_POA_RESULT = "poa_result";

    @NotNull
    private static final String KEY_POA_REQUEST_KEY = "poa_request_key";

    @NotNull
    private static final String KEY_ARG_IS_IN_WORKFLOW = "key_is_in_workflow";

    @NotNull
    private static final String KEY_RESULT_POA_DOCUMENT_SUBMISSION = "poa_document_submission";

    @NotNull
    private static final String KEY_RESULT_POA_DOCUMENT_SELECTION = "poa_document_selection";

    @NotNull
    private static final String KEY_POA_RESULT_PERMISSIONS_MANAGEMENT = "poa_permissions_management";

    @NotNull
    private static final String KEY_RESULT_POA_DOCUMENT_DETAILS = "poa_document_details";

    @NotNull
    private static final String KEY_RESULT_POA_COUNTRY_SELECTION = "poa_country_selection";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$Companion;", "", "()V", "KEY_ARG_IS_IN_WORKFLOW", "", "KEY_POA_REQUEST_KEY", "KEY_POA_RESULT", "KEY_POA_RESULT_PERMISSIONS_MANAGEMENT", "KEY_RESULT_POA_COUNTRY_SELECTION", "KEY_RESULT_POA_DOCUMENT_DETAILS", "KEY_RESULT_POA_DOCUMENT_SELECTION", "KEY_RESULT_POA_DOCUMENT_SUBMISSION", "createInstance", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment;", "requestKey", "isInWorkflow", "", "getPoaResult", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult;", "bundle", "Landroid/os/Bundle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ PoaHostFragment createInstance$default(Companion companion, String str, boolean z, int i, Object obj2) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.createInstance(str, z);
        }

        @NotNull
        public final PoaHostFragment createInstance(@NotNull String requestKey, boolean isInWorkflow) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            PoaHostFragment poaHostFragment = new PoaHostFragment();
            poaHostFragment.setArguments(BundleKt.bundleOf(new Pair("poa_request_key", requestKey), new Pair("key_is_in_workflow", Boolean.valueOf(isInWorkflow))));
            return poaHostFragment;
        }

        @NotNull
        public final PoaResult getPoaResult(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Parcelable parcelable = bundle.getParcelable("poa_result");
            if (parcelable != null) {
                return (PoaResult) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult;", "Landroid/os/Parcelable;", "()V", "Canceled", "Exit", "OnDocumentSubmittedResult", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult$Canceled;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult$Exit;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult$OnDocumentSubmittedResult;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class PoaResult implements Parcelable {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult$Canceled;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Canceled extends PoaResult {

            @NotNull
            public static final Canceled INSTANCE = new Canceled();

            @NotNull
            public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Canceled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Canceled createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Canceled.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Canceled[] newArray(int i) {
                    return new Canceled[i];
                }
            }

            private Canceled() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult$Exit;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Exit extends PoaResult {

            @NotNull
            public static final Exit INSTANCE = new Exit();

            @NotNull
            public static final Parcelable.Creator<Exit> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Exit> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Exit createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Exit.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Exit[] newArray(int i) {
                    return new Exit[i];
                }
            }

            private Exit() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult$OnDocumentSubmittedResult;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostFragment$PoaResult;", "documentId", "", "type", "issuingCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocumentId", "()Ljava/lang/String;", "getIssuingCountry", "getType", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OnDocumentSubmittedResult extends PoaResult {

            @NotNull
            public static final Parcelable.Creator<OnDocumentSubmittedResult> CREATOR = new Creator();

            @NotNull
            private final String documentId;
            private final String issuingCountry;

            @NotNull
            private final String type;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OnDocumentSubmittedResult> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OnDocumentSubmittedResult createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OnDocumentSubmittedResult(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OnDocumentSubmittedResult[] newArray(int i) {
                    return new OnDocumentSubmittedResult[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDocumentSubmittedResult(@NotNull String documentId, @NotNull String type, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(type, "type");
                this.documentId = documentId;
                this.type = type;
                this.issuingCountry = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final String getDocumentId() {
                return this.documentId;
            }

            public final String getIssuingCountry() {
                return this.issuingCountry;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.documentId);
                parcel.writeString(this.type);
                parcel.writeString(this.issuingCountry);
            }
        }

        private PoaResult() {
        }

        public /* synthetic */ PoaResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment$setFragmentResultsListeners$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "requestKey", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21491 extends u implements Function2<String, Bundle, Unit> {
        public C21491() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((String) obj2, (Bundle) obj3);
            return Unit.f186387a;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void invoke(@NotNull String requestKey, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            switch (requestKey.hashCode()) {
                case -1027313531:
                    if (requestKey.equals("poa_document_selection")) {
                        PoaHostViewModel.setPoaData$default(PoaHostFragment.this.getPoaHostViewModel(), null, PoaDocumentSelectionFragment.INSTANCE.getDocumentType(bundle), null, null, 13, null);
                        PoaHostFragment.this.showPoaDocumentDetailsScreen();
                        return;
                    }
                    return;
                case 142689746:
                    if (requestKey.equals("KEY_REQUEST_DOCUMENT_CAPTURE")) {
                        DocumentCaptureScreen.DocumentCaptureResult documentCaptureResult = DocumentCaptureScreen.INSTANCE.toDocumentCaptureResult(bundle);
                        if (documentCaptureResult instanceof DocumentCaptureScreen.DocumentCaptureResult.Completed) {
                            throw new IllegalStateException(("We should not receive a Document capture result completed, for a POA: " + documentCaptureResult).toString());
                        }
                        if (!(documentCaptureResult instanceof DocumentCaptureScreen.DocumentCaptureResult.Error)) {
                            if (documentCaptureResult instanceof DocumentCaptureScreen.DocumentCaptureResult.POACompleted) {
                                PoaHostViewModel.setPoaData$default(PoaHostFragment.this.getPoaHostViewModel(), null, null, null, ((DocumentCaptureScreen.DocumentCaptureResult.POACompleted) documentCaptureResult).getFileAddress(), 7, null);
                                PoaHostFragment.this.showPoaDocumentSubmissionScreen();
                                return;
                            }
                            return;
                        }
                        PoaHostFragment.this.submitResult(PoaResult.Canceled.INSTANCE);
                        return;
                    }
                    return;
                case 299503462:
                    if (requestKey.equals("poa_country_selection")) {
                        PoaHostViewModel.setPoaData$default(PoaHostFragment.this.getPoaHostViewModel(), CountrySelectionFragment.INSTANCE.getResult(bundle).getCountryCode(), null, null, null, 14, null);
                        PoaHostFragment.this.showPoaDocumentSelectionScreen();
                        return;
                    }
                    return;
                case 1625350322:
                    if (!requestKey.equals("capture_missing_permissions")) {
                        return;
                    }
                    PoaHostFragment.this.submitResult(PoaResult.Canceled.INSTANCE);
                    return;
                case 1889164155:
                    if (requestKey.equals("poa_document_details")) {
                        if (!PoaDocumentDetailsFragment.INSTANCE.isTakePhotoButton(bundle)) {
                            PoaHostFragment.this.openPoaUploadMediaPicker();
                            return;
                        }
                        PoaHostFragment.this.openCaptureScreen();
                        return;
                    }
                    return;
                case 1895784827:
                    if (requestKey.equals("poa_permissions_management")) {
                        PoaHostFragment.this.getChildFragmentManager().popBackStack();
                        if (PermissionsManagementFragment.INSTANCE.getResult(bundle) instanceof PermissionResult.Granted) {
                            PoaHostFragment.this.permissionsResultsLauncher.launch("android.permission.CAMERA");
                            return;
                        }
                        return;
                    }
                    return;
                case 2091522931:
                    if (requestKey.equals("poa_document_submission")) {
                        PoaDocumentSubmissionFragment.PoaSubmissionResult result = PoaDocumentSubmissionFragment.INSTANCE.getResult(bundle);
                        if (!Intrinsics.f(result, PoaDocumentSubmissionFragment.PoaSubmissionResult.RepeatPhotoCapture.INSTANCE)) {
                            if (result instanceof PoaDocumentSubmissionFragment.PoaSubmissionResult.SuccessfulDocumentInfo) {
                                PoaDocumentSubmissionFragment.PoaSubmissionResult.SuccessfulDocumentInfo successfulDocumentInfo = (PoaDocumentSubmissionFragment.PoaSubmissionResult.SuccessfulDocumentInfo) result;
                                PoaHostFragment.this.submitResult(new PoaResult.OnDocumentSubmittedResult(successfulDocumentInfo.getDocumentId(), successfulDocumentInfo.getType(), successfulDocumentInfo.getIssuingCountry()));
                                return;
                            }
                            return;
                        }
                        PoaHostFragment.this.openCaptureScreen();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment$showInvalidFileDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21501 extends u implements Function1<DialogInterface, Unit> {
        public static final C21501 INSTANCE = new C21501();

        public C21501() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoaHostFragment() {
        super(R.layout.onfido_poa_fragment_host);
        this.lifecycleAwareDialog = new LifecycleAwareDialog((Fragment) this, (Function1) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        PoaHostFragment$poaHostViewModel$2 poaHostFragment$poaHostViewModel$2 = new PoaHostFragment$poaHostViewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new PoaHostFragment$special$$inlined$viewModels$default$2(new PoaHostFragment$special$$inlined$viewModels$default$1(this)));
        this.poaHostViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(PoaHostViewModel.class), new PoaHostFragment$special$$inlined$viewModels$default$3(lazyC), new PoaHostFragment$special$$inlined$viewModels$default$4(null, lazyC), poaHostFragment$poaHostViewModel$2);
        this.poaComponent = j.b(new PoaHostFragment$poaComponent$2(this));
        final int i = 0;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoaHostFragment f50090b;

            {
                this.f50090b = this;
            }

            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                switch (i) {
                    case 0:
                        PoaHostFragment.uploadMediaIntentResultObserver$lambda$1(this.f50090b, (ActivityResult) obj2);
                        break;
                    case 1:
                        PoaHostFragment.permissionsResultsLauncher$lambda$2(this.f50090b, (Boolean) obj2);
                        break;
                    default:
                        PoaHostFragment.takePictureIntentResultObserver$lambda$4(this.f50090b, (ActivityResult) obj2);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.uploadMediaIntentResultObserver = activityResultLauncherRegisterForActivityResult;
        final int i2 = 1;
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback(this) { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoaHostFragment f50090b;

            {
                this.f50090b = this;
            }

            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                switch (i2) {
                    case 0:
                        PoaHostFragment.uploadMediaIntentResultObserver$lambda$1(this.f50090b, (ActivityResult) obj2);
                        break;
                    case 1:
                        PoaHostFragment.permissionsResultsLauncher$lambda$2(this.f50090b, (Boolean) obj2);
                        break;
                    default:
                        PoaHostFragment.takePictureIntentResultObserver$lambda$4(this.f50090b, (ActivityResult) obj2);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.permissionsResultsLauncher = activityResultLauncherRegisterForActivityResult2;
        final int i3 = 2;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoaHostFragment f50090b;

            {
                this.f50090b = this;
            }

            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                switch (i3) {
                    case 0:
                        PoaHostFragment.uploadMediaIntentResultObserver$lambda$1(this.f50090b, (ActivityResult) obj2);
                        break;
                    case 1:
                        PoaHostFragment.permissionsResultsLauncher$lambda$2(this.f50090b, (Boolean) obj2);
                        break;
                    default:
                        PoaHostFragment.takePictureIntentResultObserver$lambda$4(this.f50090b, (ActivityResult) obj2);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.takePictureIntentResultObserver = activityResultLauncherRegisterForActivityResult3;
    }

    private final FragmentTransaction getFragmentReplacementTransaction(Fragment fragment) {
        String str = fragment instanceof DocumentCaptureFragment ? "DocumentCapture" : null;
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        FlowStepDirection flowStepDirection = FlowStepDirection.RIGHT_TO_LEFT;
        Integer slideInAnimation = flowStepDirection.getSlideInAnimation();
        Intrinsics.h(slideInAnimation);
        int iIntValue = slideInAnimation.intValue();
        Integer slideOutAnimation = flowStepDirection.getSlideOutAnimation();
        Intrinsics.h(slideOutAnimation);
        fragmentTransactionBeginTransaction.setCustomAnimations(iIntValue, slideOutAnimation.intValue(), android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        FragmentTransaction fragmentTransactionReplace = fragmentTransactionBeginTransaction.replace(R.id.poaFragmentContainerView, fragment, str);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "replace(...)");
        return fragmentTransactionReplace;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PoaHostViewModel getPoaHostViewModel() {
        return (PoaHostViewModel) this.poaHostViewModel.getValue();
    }

    private final void handleBackNavigation(final OnfidoPoaFragmentHostBinding binding) {
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment.handleBackNavigation.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                if (PoaHostFragment.this.isFirstPoaScreen()) {
                    PoaHostFragment.this.submitResult(PoaResult.Canceled.INSTANCE);
                } else {
                    PoaHostFragment.this.removeCaptureFragmentIfPresent();
                    PoaHostFragment.this.getChildFragmentManager().popBackStack();
                }
                if (PoaHostFragment.this.isSubmissionScreen()) {
                    PoaHostFragment.this.showSystemBars(binding);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFirstPoaScreen() {
        return getChildFragmentManager().findFragmentById(R.id.poaFragmentContainerView) instanceof PoaVerifyAddressFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSubmissionScreen() {
        return getChildFragmentManager().findFragmentById(R.id.poaFragmentContainerView) instanceof PoaDocumentSubmissionFragment;
    }

    private final void launchCaptureActivity() {
        CaptureActivity.Companion companion = CaptureActivity.INSTANCE;
        OnfidoConfig onfidoConfig$onfido_capture_sdk_core_release = getOnfidoConfig$onfido_capture_sdk_core_release();
        Context contextRequireContext = requireContext();
        DocumentType documentType = DocumentType.GENERIC;
        CountryCode poaCountryCode = getPoaHostViewModel().getPoaCountryCode();
        DocumentFormat documentFormat = DocumentFormat.CARD;
        NfcArguments nfcArguments = new NfcArguments(getOnfidoConfig$onfido_capture_sdk_core_release().getNfcOptions(), null);
        Intrinsics.h(contextRequireContext);
        this.takePictureIntentResultObserver.launch(CaptureActivity.Companion.createDocumentIntent$default(companion, contextRequireContext, onfidoConfig$onfido_capture_sdk_core_release, true, documentType, poaCountryCode, documentFormat, nfcArguments, true, null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null));
    }

    private final void launchDocumentCaptureFragment() {
        setFragment(DocumentCaptureFragment.INSTANCE.newInstance("KEY_REQUEST_DOCUMENT_CAPTURE", new CaptureStepDataBundle(CaptureType.DOCUMENT, DocumentType.GENERIC, getPoaHostViewModel().getPoaCountryCode(), DocumentFormat.CARD, DocSide.FRONT, null, null), true, true, new NfcArguments(getOnfidoConfig$onfido_capture_sdk_core_release().getNfcOptions(), null)), false);
    }

    private final void moveToDocumentSubmission(Uri fileUri) {
        PoaHostViewModel.setPoaData$default(getPoaHostViewModel(), null, null, fileUri, null, 11, null);
        showPoaDocumentSubmissionScreen();
    }

    private final void openCaptureAfterPermissionsGranted() {
        if (getOnfidoRemoteConfig$onfido_capture_sdk_core_release().isRefactoredCaptureEnabled()) {
            launchDocumentCaptureFragment();
        } else {
            launchCaptureActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCaptureScreen() {
        if (getRuntimePermissionsManager$onfido_capture_sdk_core_release().hasPermissionsForCaptureType(CaptureType.FACE)) {
            openCaptureAfterPermissionsGranted();
        } else {
            showPermissionsManagementFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPoaUploadMediaPicker() {
        ActivityResultLauncher<Intent> activityResultLauncher = this.uploadMediaIntentResultObserver;
        ImageUtils imageUtils$onfido_capture_sdk_core_release = getImageUtils$onfido_capture_sdk_core_release();
        String string = getString(R.string.onfido_poa_select_document_details_upload_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        activityResultLauncher.launch(imageUtils$onfido_capture_sdk_core_release.getUploadMediaPickerIntent$onfido_capture_sdk_core_release(string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void permissionsResultsLauncher$lambda$2(PoaHostFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getChildFragmentManager().popBackStack();
        Intrinsics.h(bool);
        if (bool.booleanValue()) {
            this$0.openCaptureScreen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeCaptureFragmentIfPresent() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("DocumentCapture");
        if (fragmentFindFragmentByTag != null) {
            getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitNow();
        }
    }

    private final void setFragment(Fragment fragment, boolean shouldAddToBackStack) {
        FragmentTransaction fragmentReplacementTransaction = getFragmentReplacementTransaction(fragment);
        if (shouldAddToBackStack) {
            fragmentReplacementTransaction.addToBackStack(null);
        }
        fragmentReplacementTransaction.commit();
        this.lifecycleAwareDialog.dismiss();
    }

    public static /* synthetic */ void setFragment$default(PoaHostFragment poaHostFragment, Fragment fragment, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        poaHostFragment.setFragment(fragment, z);
    }

    private final void setFragmentResultsListeners() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        FragmentManagerExtKt.setFragmentResultsListeners(childFragmentManager, viewLifecycleOwner, new String[]{"poa_country_selection", "poa_document_selection", "poa_document_details", "poa_document_submission", "poa_permissions_management", "KEY_REQUEST_DOCUMENT_CAPTURE", "capture_missing_permissions"}, new C21491());
    }

    private final void showInvalidFileDialog() {
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(R.string.onfido_poa_err_invalid_file_title), R.string.onfido_poa_err_invalid_file_message, R.string.onfido_poa_err_invalid_file_ok, (Integer) null, false, (Function1) null, (Function1) C21501.INSTANCE, 56, (Object) null);
    }

    private final void showPermissionsManagementFragment() {
        setFragment$default(this, PermissionsManagementFragment.INSTANCE.createInstance("poa_permissions_management", new CaptureStepDataBundle(CaptureType.FACE, null, null, null, null, null, null, 126, null)), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSystemBars(OnfidoPoaFragmentHostBinding binding) {
        OnfidoActivityCaptureBinding binding$onfido_capture_sdk_core_release;
        Toolbar toolbar;
        FragmentActivity activity = getActivity();
        CaptureActivity captureActivity = activity instanceof CaptureActivity ? (CaptureActivity) activity : null;
        if (captureActivity != null && (binding$onfido_capture_sdk_core_release = captureActivity.getBinding$onfido_capture_sdk_core_release()) != null && (toolbar = binding$onfido_capture_sdk_core_release.toolbar) != null) {
            ViewExtensionsKt.toVisible$default(toolbar, false, 1, null);
        }
        new WindowInsetsControllerCompat(requireActivity().getWindow(), binding.getRoot()).show(WindowInsetsCompat.Type.systemBars());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitResult(PoaResult result) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("poa_request_key") : null;
        if (string == null) {
            finishFlow(result instanceof PoaResult.OnDocumentSubmittedResult ? new PoAFlow.Result.Success(((PoaResult.OnDocumentSubmittedResult) result).getDocumentId()) : new PoAFlow.Result.Failed(FailureReason.Canceled.INSTANCE));
            return;
        }
        getParentFragmentManager().setFragmentResult(string, BundleKt.bundleOf(new Pair("poa_result", result)));
        Bundle arguments2 = getArguments();
        if (arguments2 != null ? arguments2.getBoolean("key_is_in_workflow") : false) {
            return;
        }
        getParentFragmentManager().popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void takeActionOnCountriesDownload(PoaHostViewModel.GetCountriesResponse countriesResponse) {
        List<CountryCode> poaCountries = countriesResponse.getPoaCountries();
        if (!poaCountries.isEmpty()) {
            ArrayList<CountryCode> arrayList = new ArrayList<>();
            arrayList.addAll(poaCountries);
            setFragment$default(this, CountrySelectionFragment.INSTANCE.createInstance("poa_country_selection", arrayList), false, 2, null);
        }
        String errorString = countriesResponse.getErrorString();
        if (errorString == null || errorString.length() <= 0) {
            return;
        }
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, (Integer) null, R.string.onfido_generic_error_network_detail, 0, (Integer) null, false, (Function1) null, (Function1) null, ISO781611.SMT_TAG, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void takePictureIntentResultObserver$lambda$4(PoaHostFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent data = activityResult.getData();
        if (data != null) {
            int resultCode = activityResult.getResultCode();
            if (resultCode == 0) {
                this$0.submitResult(PoaResult.Canceled.INSTANCE);
            } else if (resultCode == 448) {
                this$0.submitResult(PoaResult.Exit.INSTANCE);
            } else {
                PoaHostViewModel.setPoaData$default(this$0.getPoaHostViewModel(), null, null, null, data.getStringExtra("poa_captured_file_name"), 7, null);
                this$0.showPoaDocumentSubmissionScreen();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadMediaIntentResultObserver$lambda$1(PoaHostFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == 0) {
            this$0.lifecycleAwareDialog.dismiss();
            return;
        }
        Intent data = activityResult.getData();
        if (data != null) {
            Uri data2 = data.getData();
            Intrinsics.i(data2, "null cannot be cast to non-null type android.net.Uri");
            PoaUtils poaUtils$onfido_capture_sdk_core_release = this$0.getPoaUtils$onfido_capture_sdk_core_release();
            ContentResolver contentResolver = this$0.requireContext().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            if (poaUtils$onfido_capture_sdk_core_release.isValidSupportedFile(contentResolver, data2)) {
                this$0.moveToDocumentSubmission(data2);
            } else {
                this$0.showInvalidFileDialog();
            }
        }
    }

    @NotNull
    public final ImageUtils getImageUtils$onfido_capture_sdk_core_release() {
        ImageUtils imageUtils = this.imageUtils;
        if (imageUtils != null) {
            return imageUtils;
        }
        Intrinsics.r("imageUtils");
        throw null;
    }

    @NotNull
    public final OnfidoConfig getOnfidoConfig$onfido_capture_sdk_core_release() {
        OnfidoConfig onfidoConfig = this.onfidoConfig;
        if (onfidoConfig != null) {
            return onfidoConfig;
        }
        Intrinsics.r("onfidoConfig");
        throw null;
    }

    @NotNull
    public final OnfidoRemoteConfig getOnfidoRemoteConfig$onfido_capture_sdk_core_release() {
        OnfidoRemoteConfig onfidoRemoteConfig = this.onfidoRemoteConfig;
        if (onfidoRemoteConfig != null) {
            return onfidoRemoteConfig;
        }
        Intrinsics.r("onfidoRemoteConfig");
        throw null;
    }

    @NotNull
    public final PoaComponent getPoaComponent$onfido_capture_sdk_core_release() {
        return (PoaComponent) this.poaComponent.getValue();
    }

    @NotNull
    public final PoaUtils getPoaUtils$onfido_capture_sdk_core_release() {
        PoaUtils poaUtils = this.poaUtils;
        if (poaUtils != null) {
            return poaUtils;
        }
        Intrinsics.r("poaUtils");
        throw null;
    }

    @NotNull
    public final PoaHostViewModel.Factory getPoaViewModelFactory$onfido_capture_sdk_core_release() {
        PoaHostViewModel.Factory factory = this.poaViewModelFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.r("poaViewModelFactory");
        throw null;
    }

    @NotNull
    public final RuntimePermissionsManager getRuntimePermissionsManager$onfido_capture_sdk_core_release() {
        RuntimePermissionsManager runtimePermissionsManager = this.runtimePermissionsManager;
        if (runtimePermissionsManager != null) {
            return runtimePermissionsManager;
        }
        Intrinsics.r("runtimePermissionsManager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        getPoaComponent$onfido_capture_sdk_core_release().inject(this);
        super.onViewCreated(view, savedInstanceState);
        OnfidoPoaFragmentHostBinding onfidoPoaFragmentHostBindingBind = OnfidoPoaFragmentHostBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(onfidoPoaFragmentHostBindingBind, "bind(...)");
        showPoaVerifyAddressScreen();
        handleBackNavigation(onfidoPoaFragmentHostBindingBind);
        setFragmentResultsListeners();
        Disposable disposableSubscribe = getPoaHostViewModel().getGetCountriesResponse$onfido_capture_sdk_core_release().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment.onViewCreated.1
            @Override // igm.g
            public final void accept(@NotNull PoaHostViewModel.GetCountriesResponse p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                PoaHostFragment.this.takeActionOnCountriesDownload(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnDestroy(disposableSubscribe, viewLifecycleOwner);
    }

    public final void setImageUtils$onfido_capture_sdk_core_release(@NotNull ImageUtils imageUtils) {
        Intrinsics.checkNotNullParameter(imageUtils, "<set-?>");
        this.imageUtils = imageUtils;
    }

    public final void setOnfidoConfig$onfido_capture_sdk_core_release(@NotNull OnfidoConfig onfidoConfig) {
        Intrinsics.checkNotNullParameter(onfidoConfig, "<set-?>");
        this.onfidoConfig = onfidoConfig;
    }

    public final void setOnfidoRemoteConfig$onfido_capture_sdk_core_release(@NotNull OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "<set-?>");
        this.onfidoRemoteConfig = onfidoRemoteConfig;
    }

    public final void setPoaUtils$onfido_capture_sdk_core_release(@NotNull PoaUtils poaUtils) {
        Intrinsics.checkNotNullParameter(poaUtils, "<set-?>");
        this.poaUtils = poaUtils;
    }

    public final void setPoaViewModelFactory$onfido_capture_sdk_core_release(@NotNull PoaHostViewModel.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.poaViewModelFactory = factory;
    }

    public final void setRuntimePermissionsManager$onfido_capture_sdk_core_release(@NotNull RuntimePermissionsManager runtimePermissionsManager) {
        Intrinsics.checkNotNullParameter(runtimePermissionsManager, "<set-?>");
        this.runtimePermissionsManager = runtimePermissionsManager;
    }

    @Override // com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaFlowController
    public void showPoaCountrySelectionScreen() {
        getPoaHostViewModel().getPoaSupportedCountries();
    }

    @Override // com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaFlowController
    public void showPoaDocumentDetailsScreen() {
        setFragment$default(this, PoaDocumentDetailsFragment.INSTANCE.createInstance("poa_document_details", getPoaHostViewModel().getPoaCountryCode(), getPoaHostViewModel().getPoaDocumentType()), false, 2, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaFlowController
    public void showPoaDocumentSelectionScreen() {
        setFragment$default(this, PoaDocumentSelectionFragment.INSTANCE.createInstance("poa_document_selection", getPoaHostViewModel().getPoaCountryCode(), getPoaHostViewModel().getPoaSupportedDocuments()), false, 2, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaFlowController
    public void showPoaDocumentSubmissionScreen() {
        if (!isSubmissionScreen()) {
            setFragment$default(this, PoaDocumentSubmissionFragment.INSTANCE.createInstance("poa_document_submission", getPoaHostViewModel().isPoaTakePhoto(), getPoaHostViewModel().getPoaDocumentUri(), getPoaHostViewModel().getPoaDocumentFileName(), getPoaHostViewModel().getPoaCountryCode(), getPoaHostViewModel().getPoaDocumentType()), false, 2, null);
            return;
        }
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R.id.poaFragmentContainerView);
        Intrinsics.i(fragmentFindFragmentById, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionFragment");
        ((PoaDocumentSubmissionFragment) fragmentFindFragmentById).renderSmallImageAfterRetakePhoto$onfido_capture_sdk_core_release(getPoaHostViewModel().getPoaDocumentFileName());
    }

    @Override // com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaFlowController
    public void showPoaVerifyAddressScreen() {
        PoaVerifyAddressFragment.Companion companion = PoaVerifyAddressFragment.INSTANCE;
        String string = getString(R.string.onfido_poa_intro_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.onfido_poa_intro_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        setFragment$default(this, companion.createInstance(string, string2, v.k(getString(R.string.onfido_poa_intro_list_shows_address), getString(R.string.onfido_poa_intro_list_matches_signup), getString(R.string.onfido_poa_intro_list_most_recent))), false, 2, null);
    }
}
