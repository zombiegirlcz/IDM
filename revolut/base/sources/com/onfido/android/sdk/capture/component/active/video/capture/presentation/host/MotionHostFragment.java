package com.onfido.android.sdk.capture.component.active.video.capture.presentation.host;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.permissions.PermissionsManagementFragment;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent;
import com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponentHolder;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.MotionUploadFragment;
import com.onfido.android.sdk.capture.core.config.FailureReason;
import com.onfido.android.sdk.capture.core.config.Flow;
import com.onfido.android.sdk.capture.core.config.FlowFragment;
import com.onfido.android.sdk.capture.core.features.motion.MotionFlow;
import com.onfido.android.sdk.capture.databinding.OnfidoAvcFragmentHostBinding;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.onfido.android.sdk.capture.internal.navigation.navigator.FragmentNavigationManager;
import com.onfido.android.sdk.capture.internal.util.FragmentManagerExtKt;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.NextActionListener;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import j6.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0002IJB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020+H\u0002J\b\u00100\u001a\u00020+H\u0002J\b\u00101\u001a\u00020+H\u0016J-\u00102\u001a\u00020+2\u0006\u00103\u001a\u0002042\u000e\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u000207062\u0006\u00108\u001a\u000209H\u0017¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020+H\u0016J\b\u0010<\u001a\u00020+H\u0016J\u001a\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010B\u001a\u00020+H\u0016J\b\u0010C\u001a\u00020+H\u0002J\b\u0010D\u001a\u00020+H\u0002J\b\u0010E\u001a\u00020+H\u0002J\u0010\u0010F\u001a\u00020+2\u0006\u0010G\u001a\u00020HH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\u00020 8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b'\u0010(¨\u0006K"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment;", "Lcom/onfido/android/sdk/capture/core/config/FlowFragment;", "Lcom/onfido/android/sdk/capture/utils/WorkflowToolbarUpdateListener;", "()V", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoAvcFragmentHostBinding;", "binding", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoAvcFragmentHostBinding;", "motionHostComponent", "Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponent;", "getMotionHostComponent$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponent;", "motionHostComponent$delegate", "Lkotlin/Lazy;", "motionHostViewModelFactory", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$Factory;", "getMotionHostViewModelFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$Factory;", "setMotionHostViewModelFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$Factory;)V", "motionOptions", "Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;", "getMotionOptions", "()Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;", "motionOptions$delegate", "navigationManager", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/FragmentNavigationManager;", "getNavigationManager", "()Lcom/onfido/android/sdk/capture/internal/navigation/navigator/FragmentNavigationManager;", "navigationManager$delegate", "runtimePermissionsManager", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "getRuntimePermissionsManager$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "setRuntimePermissionsManager$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;)V", "viewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "getViewModel", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "viewModel$delegate", "handleBackNavigation", "", "handleViewEvent", "event", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent;", "hideToolbar", "observeViewEvent", "onDestroyView", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onWorkflowToolbarUpdated", "registerFragmentLifecycleCallbacks", "setFragmentResultsListeners", "showToolbar", "submitResult", "avcHostResult", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult;", "AvcHostResult", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionHostFragment extends FlowFragment implements WorkflowToolbarUpdateListener {
    private static final int PERMISSIONS_REQUEST_CODE = 100;
    private OnfidoAvcFragmentHostBinding _binding;

    /* JADX INFO: renamed from: motionHostComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy motionHostComponent;
    public MotionHostViewModel.Factory motionHostViewModelFactory;

    /* JADX INFO: renamed from: motionOptions$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy motionOptions;

    /* JADX INFO: renamed from: navigationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationManager;
    public RuntimePermissionsManager runtimePermissionsManager;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @NotNull
    private static final String KEY_ARG_IS_IN_WORKFLOW = "key_is_in_workflow";

    @NotNull
    private static final String KEY_ARG_REQUEST = "key_request";

    @NotNull
    private static final String KEY_ARG_OPTIONS = "key_options";

    @NotNull
    private static final String KEY_AVC_HOST_RESULT = "key_host_result";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult;", "Landroid/os/Parcelable;", "()V", "Completed", "Error", "Exit", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult$Completed;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult$Error;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult$Exit;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AvcHostResult implements Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult$Completed;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult;", "uploadedArtifact", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "(Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;)V", "getUploadedArtifact", "()Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Completed extends AvcHostResult {

            @NotNull
            public static final Parcelable.Creator<Completed> CREATOR = new Creator();

            @NotNull
            private final UploadedArtifact uploadedArtifact;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Completed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Completed createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Completed((UploadedArtifact) parcel.readParcelable(Completed.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Completed[] newArray(int i) {
                    return new Completed[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Completed(@NotNull UploadedArtifact uploadedArtifact) {
                super(null);
                Intrinsics.checkNotNullParameter(uploadedArtifact, "uploadedArtifact");
                this.uploadedArtifact = uploadedArtifact;
            }

            public static /* synthetic */ Completed copy$default(Completed completed, UploadedArtifact uploadedArtifact, int i, Object obj2) {
                if ((i & 1) != 0) {
                    uploadedArtifact = completed.uploadedArtifact;
                }
                return completed.copy(uploadedArtifact);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final UploadedArtifact getUploadedArtifact() {
                return this.uploadedArtifact;
            }

            @NotNull
            public final Completed copy(@NotNull UploadedArtifact uploadedArtifact) {
                Intrinsics.checkNotNullParameter(uploadedArtifact, "uploadedArtifact");
                return new Completed(uploadedArtifact);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Completed) && Intrinsics.f(this.uploadedArtifact, ((Completed) other).uploadedArtifact);
            }

            @NotNull
            public final UploadedArtifact getUploadedArtifact() {
                return this.uploadedArtifact;
            }

            public int hashCode() {
                return this.uploadedArtifact.hashCode();
            }

            @NotNull
            public String toString() {
                return "Completed(uploadedArtifact=" + this.uploadedArtifact + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeParcelable(this.uploadedArtifact, flags);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult$Error;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends AvcHostResult {

            @NotNull
            public static final Parcelable.Creator<Error> CREATOR = new Creator();

            @NotNull
            private final String message;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Error> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Error createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Error(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Error[] newArray(int i) {
                    return new Error[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            public final Error copy(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.f(this.message, ((Error) other).message);
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @NotNull
            public String toString() {
                return a.u(new StringBuilder("Error(message="), this.message, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.message);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult$Exit;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Exit extends AvcHostResult {

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

        private AvcHostResult() {
        }

        public /* synthetic */ AvcHostResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$Companion;", "", "()V", "KEY_ARG_IS_IN_WORKFLOW", "", "KEY_ARG_OPTIONS", "KEY_ARG_REQUEST", "KEY_AVC_HOST_RESULT", "PERMISSIONS_REQUEST_CODE", "", "createInstance", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment;", "requestKey", "options", "Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;", "isInWorkflow", "", "getAvcHostResult", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostFragment$AvcHostResult;", "bundle", "Landroid/os/Bundle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ MotionHostFragment createInstance$default(Companion companion, String str, MotionCaptureVariantOptions motionCaptureVariantOptions, boolean z, int i, Object obj2) {
            if ((i & 2) != 0) {
                motionCaptureVariantOptions = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.createInstance(str, motionCaptureVariantOptions, z);
        }

        @NotNull
        public final MotionHostFragment createInstance(@NotNull String requestKey, MotionCaptureVariantOptions options, boolean isInWorkflow) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            if (options == null) {
                options = MotionCaptureVariantOptions.INSTANCE.getDEFAULT();
            }
            MotionHostFragment motionHostFragment = new MotionHostFragment();
            motionHostFragment.setArguments(BundleKt.bundleOf(new Pair("key_request", requestKey), new Pair("key_options", options), new Pair("key_is_in_workflow", Boolean.valueOf(isInWorkflow))));
            return motionHostFragment;
        }

        @NotNull
        public final AvcHostResult getAvcHostResult(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Parcelable parcelable = bundle.getParcelable("key_host_result");
            if (parcelable != null) {
                return (AvcHostResult) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment$setFragmentResultsListeners$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "requestKey", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20021 extends u implements Function2<String, Bundle, Unit> {
        public C20021() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((String) obj2, (Bundle) obj3);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull String requestKey, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (Intrinsics.f(requestKey, "request_key_permissions_screen")) {
                MotionHostFragment.this.getViewModel().onPermissionsScreenResult(PermissionsManagementFragment.INSTANCE.getResult(bundle));
            }
        }
    }

    public MotionHostFragment() {
        super(R.layout.onfido_avc_fragment_host);
        this.motionOptions = j.b(new MotionHostFragment$motionOptions$2(this));
        this.motionHostComponent = j.b(new MotionHostFragment$motionHostComponent$2(this));
        this.navigationManager = j.b(new MotionHostFragment$navigationManager$2(this));
        MotionHostFragment$viewModel$2 motionHostFragment$viewModel$2 = new MotionHostFragment$viewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new MotionHostFragment$special$$inlined$viewModels$default$2(new MotionHostFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(MotionHostViewModel.class), new MotionHostFragment$special$$inlined$viewModels$default$3(lazyC), new MotionHostFragment$special$$inlined$viewModels$default$4(null, lazyC), motionHostFragment$viewModel$2);
    }

    private final OnfidoAvcFragmentHostBinding getBinding() {
        OnfidoAvcFragmentHostBinding onfidoAvcFragmentHostBinding = this._binding;
        Intrinsics.h(onfidoAvcFragmentHostBinding);
        return onfidoAvcFragmentHostBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MotionCaptureVariantOptions getMotionOptions() {
        return (MotionCaptureVariantOptions) this.motionOptions.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentNavigationManager getNavigationManager() {
        return (FragmentNavigationManager) this.navigationManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MotionHostViewModel getViewModel() {
        return (MotionHostViewModel) this.viewModel.getValue();
    }

    private final void handleBackNavigation() {
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment.handleBackNavigation.1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                if (MotionHostFragment.this.getNavigationManager().getCurrentScreensSnapshot().size() > 1) {
                    MotionHostFragment.this.getViewModel().getNavigator().exitCurrentScreen();
                } else {
                    MotionHostFragment.this.submitResult(AvcHostResult.Exit.INSTANCE);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleViewEvent(MotionHostViewModel.ViewEvent event) {
        if (event instanceof MotionHostViewModel.ViewEvent.Loading) {
            RelativeLayout avcHostLoadingView = getBinding().avcHostLoadingView;
            Intrinsics.checkNotNullExpressionValue(avcHostLoadingView, "avcHostLoadingView");
            ViewExtensionsKt.toVisibleOrGone(avcHostLoadingView, ((MotionHostViewModel.ViewEvent.Loading) event).getShow());
        } else if (event instanceof MotionHostViewModel.ViewEvent.RequestPermission) {
            getRuntimePermissionsManager$onfido_capture_sdk_core_release().requestPermissionsFromFragment$onfido_capture_sdk_core_release(this, ((MotionHostViewModel.ViewEvent.RequestPermission) event).getPermissions(), 100);
        } else if (event instanceof MotionHostViewModel.ViewEvent.VideoUploaded) {
            submitResult(new AvcHostResult.Completed(((MotionHostViewModel.ViewEvent.VideoUploaded) event).getUploadedArtifact()));
        } else if (event instanceof MotionHostViewModel.ViewEvent.Error) {
            submitResult(new AvcHostResult.Error(((MotionHostViewModel.ViewEvent.Error) event).getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideToolbar() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) fragmentActivityRequireActivity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
    }

    private final void observeViewEvent() {
        Disposable disposableSubscribe = getViewModel().getViewEvent().subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment.observeViewEvent.1
            @Override // igm.g
            public final void accept(@NotNull MotionHostViewModel.ViewEvent p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                MotionHostFragment.this.handleViewEvent(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnStop(disposableSubscribe, viewLifecycleOwner);
    }

    private final void registerFragmentLifecycleCallbacks() {
        getChildFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment.registerFragmentLifecycleCallbacks.1
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentViewCreated(@NotNull FragmentManager fm3, @NotNull Fragment f, @NotNull View v, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(fm3, "fm");
                Intrinsics.checkNotNullParameter(f, "f");
                Intrinsics.checkNotNullParameter(v, "v");
                super.onFragmentViewCreated(fm3, f, v, savedInstanceState);
                if (f instanceof MotionUploadFragment) {
                    MotionHostFragment.this.hideToolbar();
                }
            }

            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentViewDestroyed(@NotNull FragmentManager fm3, @NotNull Fragment f) {
                Intrinsics.checkNotNullParameter(fm3, "fm");
                Intrinsics.checkNotNullParameter(f, "f");
                super.onFragmentViewDestroyed(fm3, f);
                if (!(f instanceof MotionCaptureFragment)) {
                    if (f instanceof MotionUploadFragment) {
                        MotionHostFragment.this.showToolbar();
                    }
                } else {
                    NextActionListener nextActionListener$onfido_capture_sdk_core_release = MotionHostFragment.this.getNextActionListener();
                    if (nextActionListener$onfido_capture_sdk_core_release != null) {
                        nextActionListener$onfido_capture_sdk_core_release.restoreToolbar();
                    }
                }
            }
        }, true);
    }

    private final void setFragmentResultsListeners() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        FragmentManagerExtKt.setFragmentResultsListeners(childFragmentManager, viewLifecycleOwner, new String[]{"request_key_permissions_screen"}, new C20021());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showToolbar() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) fragmentActivityRequireActivity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void submitResult(AvcHostResult avcHostResult) {
        Flow.Result failed;
        String string = requireArguments().getString("key_request");
        if (string != null) {
            getParentFragmentManager().setFragmentResult(string, BundleKt.bundleOf(new Pair("key_host_result", avcHostResult)));
            Bundle arguments = getArguments();
            if (arguments != null ? arguments.getBoolean("key_is_in_workflow") : false) {
                return;
            }
            getParentFragmentManager().popBackStack();
            return;
        }
        if (avcHostResult instanceof AvcHostResult.Completed) {
            failed = new MotionFlow.Result.Success(((AvcHostResult.Completed) avcHostResult).getUploadedArtifact().getId());
        } else if (avcHostResult instanceof AvcHostResult.Error) {
            failed = new MotionFlow.Result.Failed(new FailureReason.InternalException(((AvcHostResult.Error) avcHostResult).getMessage(), null, 2, 0 == true ? 1 : 0));
        } else {
            if (!Intrinsics.f(avcHostResult, AvcHostResult.Exit.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            failed = new MotionFlow.Result.Failed(FailureReason.Canceled.INSTANCE);
        }
        finishFlow(failed);
    }

    @NotNull
    public final MotionHostComponent getMotionHostComponent$onfido_capture_sdk_core_release() {
        return (MotionHostComponent) this.motionHostComponent.getValue();
    }

    @NotNull
    public final MotionHostViewModel.Factory getMotionHostViewModelFactory$onfido_capture_sdk_core_release() {
        MotionHostViewModel.Factory factory = this.motionHostViewModelFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.r("motionHostViewModelFactory");
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
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
        MotionHostComponentHolder.INSTANCE.getInstance().onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    @d
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100) {
            getViewModel().onPermissionsRequestResult(grantResults);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        observeViewEvent();
        getViewModel().getNavigationManagerHolder().setNavigationManager(getNavigationManager());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getViewModel().getNavigationManagerHolder().resetNavigationManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        getMotionHostComponent$onfido_capture_sdk_core_release().inject(this);
        super.onViewCreated(view, savedInstanceState);
        this._binding = OnfidoAvcFragmentHostBinding.bind(view);
        MotionHostViewModel viewModel = getViewModel();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        viewModel.initialize(ContextUtilsKt.isGooglePlayServiceAvailable(context));
        handleBackNavigation();
        setFragmentResultsListeners();
        registerFragmentLifecycleCallbacks();
    }

    @Override // com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener
    public void onWorkflowToolbarUpdated() {
        LifecycleOwner lifecycleOwnerFindFragmentById = getChildFragmentManager().findFragmentById(R.id.fragmentContainerView);
        WorkflowToolbarUpdateListener workflowToolbarUpdateListener = lifecycleOwnerFindFragmentById instanceof WorkflowToolbarUpdateListener ? (WorkflowToolbarUpdateListener) lifecycleOwnerFindFragmentById : null;
        if (workflowToolbarUpdateListener != null) {
            workflowToolbarUpdateListener.onWorkflowToolbarUpdated();
        }
    }

    public final void setMotionHostViewModelFactory$onfido_capture_sdk_core_release(@NotNull MotionHostViewModel.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.motionHostViewModelFactory = factory;
    }

    public final void setRuntimePermissionsManager$onfido_capture_sdk_core_release(@NotNull RuntimePermissionsManager runtimePermissionsManager) {
        Intrinsics.checkNotNullParameter(runtimePermissionsManager, "<set-?>");
        this.runtimePermissionsManager = runtimePermissionsManager;
    }
}
