package com.onfido.android.sdk.capture.ui.camera.liveness;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import ap0.f;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.audio.VolumeWarningView;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentLivenessConfirmationBinding;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.CaptureStatus;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.onfido.android.sdk.capture.ui.PageFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesDrawer;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.MovementLivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.MovementType;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.ReciteLivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.video_view.LivenessReviewChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.video_view.VideoPlayViewListener;
import com.onfido.android.sdk.capture.ui.camera.liveness.video_view.VideoPlayerView;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.utils.AccessibilityExtensionsKt;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.FragmentExtentionsKt;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import yhm.j;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002TUB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020\u001f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,H\u0002J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010+\u001a\u00020,H\u0002J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020%H\u0016J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\u001fH\u0016J\b\u00109\u001a\u00020%H\u0016J\u0010\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020)H\u0016J\b\u0010<\u001a\u00020%H\u0016J\b\u0010=\u001a\u00020%H\u0016J\b\u0010>\u001a\u00020%H\u0016J\b\u0010?\u001a\u00020%H\u0016J\b\u0010@\u001a\u00020%H\u0016J\b\u0010A\u001a\u00020%H\u0016J\b\u0010B\u001a\u00020%H\u0016J\b\u0010C\u001a\u00020%H\u0016J\b\u0010D\u001a\u00020%H\u0016J\b\u0010E\u001a\u00020%H\u0016J\b\u0010F\u001a\u00020%H\u0016J\u0010\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020IH\u0016J\u001a\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u0010L\u001a\u00020%H\u0016J\u0010\u0010M\u001a\u00020%2\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u00020%H\u0016J\u0010\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020SH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082.¢\u0006\u0004\n\u0002\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006V"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment;", "Lcom/onfido/android/sdk/capture/ui/PageFragment;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationPresenter$View;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/video_view/VideoPlayViewListener;", "()V", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentLivenessConfirmationBinding;", "binding", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentLivenessConfirmationBinding;", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "livenessChallengesDrawer", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesDrawer;", "livenessChallengesDrawerFactory", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesDrawer$Factory;", "getLivenessChallengesDrawerFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesDrawer$Factory;", "setLivenessChallengesDrawerFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesDrawer$Factory;)V", "livenessReviewChallenges", "", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/video_view/LivenessReviewChallenge;", "[Lcom/onfido/android/sdk/capture/ui/camera/liveness/video_view/LivenessReviewChallenge;", "presenter", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationPresenter;", "getPresenter$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationPresenter;", "setPresenter$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationPresenter;)V", "videoPath", "", "getVideoPath", "()Ljava/lang/String;", "videoPath$delegate", "Lkotlin/Lazy;", "deleteVideoAndExit", "", "getChallengesContentDescription", "livenessPerformedChallenges", "", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "getLivenessChallengesContentDescription", "livenessUploadChallenges", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "livenessChallenges", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onInvalidCertificate", "message", "onMediaPlayerError", "onNextChallenge", "challenge", "onNoVolumeDetected", "onStart", "onStop", "onTokenExpired", "onVideoError", "onVideoFinished", "onVideoNotFound", "onVideoPaused", "onVideoStarted", "onVideoTooLarge", "onVideoUploadError", "onVideoUploaded", "liveVideoUpload", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "onViewCreated", "view", "onVolumeDetected", "setLoading", "enabled", "", "showNoVideoConfirmationView", "submitResult", "result", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult;", "Companion", "LivenessConfirmationResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LivenessConfirmationFragment extends PageFragment implements LivenessConfirmationPresenter.View, VideoPlayViewListener {
    private static final float CHALLENGES_CONTAINER_DEFAULT_ALPHA = 0.85f;
    private static final float CHALLENGES_CONTAINER_TITLE_MAX_HEIGHT_PERCENTAGE = 0.5f;
    private static final int NUM_ACTION_BUTTONS = 2;
    private OnfidoFragmentLivenessConfirmationBinding _binding;
    private LivenessChallengesDrawer livenessChallengesDrawer;
    public LivenessChallengesDrawer.Factory livenessChallengesDrawerFactory;
    private LivenessReviewChallenge[] livenessReviewChallenges;
    public LivenessConfirmationPresenter presenter;

    @NotNull
    private static final String KEY_RESULT = "key_result";

    @NotNull
    private static final String VIDEO_PATH_PARAM = "VIDEO_PATH";

    @NotNull
    public static final String ONFIDO_LIVENESS_CHALLENGES_EXTRA = "onfido_liveness_challenges";

    @NotNull
    private static final String SHOW_CONFIRMATION_VIDEO = "SHOW_CONFIRMATION_VIDEO";

    @NotNull
    private static final String KEY_REQUEST = "key_request";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: videoPath$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy videoPath = j.b(new LivenessConfirmationFragment$videoPath$2(this));

    @NotNull
    private final LifecycleAwareDialog lifecycleAwareDialog = new LifecycleAwareDialog((Fragment) this, (Function1) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$Companion;", "", "()V", "CHALLENGES_CONTAINER_DEFAULT_ALPHA", "", "CHALLENGES_CONTAINER_TITLE_MAX_HEIGHT_PERCENTAGE", "KEY_REQUEST", "", "KEY_RESULT", "NUM_ACTION_BUTTONS", "", "ONFIDO_LIVENESS_CHALLENGES_EXTRA", "SHOW_CONFIRMATION_VIDEO", "VIDEO_PATH_PARAM", "createInstance", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment;", "requestKey", "videoPath", "showRecordedVideo", "", "livenessPerformedChallenges", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "getResult", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult;", "bundle", "Landroid/os/Bundle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ LivenessConfirmationFragment createInstance$default(Companion companion, String str, String str2, boolean z, LivenessPerformedChallenges livenessPerformedChallenges, int i, Object obj2) {
            if ((i & 4) != 0) {
                z = true;
            }
            return companion.createInstance(str, str2, z, livenessPerformedChallenges);
        }

        @NotNull
        public final LivenessConfirmationFragment createInstance(@NotNull String requestKey, @NotNull String videoPath, boolean showRecordedVideo, @NotNull LivenessPerformedChallenges livenessPerformedChallenges) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            Intrinsics.checkNotNullParameter(videoPath, "videoPath");
            Intrinsics.checkNotNullParameter(livenessPerformedChallenges, "livenessPerformedChallenges");
            LivenessConfirmationFragment livenessConfirmationFragment = new LivenessConfirmationFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key_request", requestKey);
            bundle.putString("VIDEO_PATH", videoPath);
            bundle.putBoolean("SHOW_CONFIRMATION_VIDEO", showRecordedVideo);
            bundle.putSerializable("onfido_liveness_challenges", livenessPerformedChallenges);
            livenessConfirmationFragment.setArguments(bundle);
            return livenessConfirmationFragment;
        }

        @InternalOnfidoApi
        @NotNull
        public final LivenessConfirmationResult getResult(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Parcelable parcelable = bundle.getParcelable("key_result");
            if (parcelable != null) {
                return (LivenessConfirmationResult) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult;", "Landroid/os/Parcelable;", "()V", "Exit", "OnError", "VideoUploadedSuccessfully", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$Exit;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$OnError;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$VideoUploadedSuccessfully;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InternalOnfidoApi
    public static abstract class LivenessConfirmationResult implements Parcelable {

        @InternalOnfidoApi
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$Exit;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Exit extends LivenessConfirmationResult {

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

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$OnError;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult;", "()V", "OnInvalidCertificate", "OnTokenExpired", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$OnError$OnInvalidCertificate;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$OnError$OnTokenExpired;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InternalOnfidoApi
        public static abstract class OnError extends LivenessConfirmationResult {

            @InternalOnfidoApi
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$OnError$OnInvalidCertificate;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$OnError;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class OnInvalidCertificate extends OnError {

                @NotNull
                public static final Parcelable.Creator<OnInvalidCertificate> CREATOR = new Creator();

                @NotNull
                private final String message;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<OnInvalidCertificate> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final OnInvalidCertificate createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new OnInvalidCertificate(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final OnInvalidCertificate[] newArray(int i) {
                        return new OnInvalidCertificate[i];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OnInvalidCertificate(@NotNull String message) {
                    super(null);
                    Intrinsics.checkNotNullParameter(message, "message");
                    this.message = message;
                }

                public static /* synthetic */ OnInvalidCertificate copy$default(OnInvalidCertificate onInvalidCertificate, String str, int i, Object obj2) {
                    if ((i & 1) != 0) {
                        str = onInvalidCertificate.message;
                    }
                    return onInvalidCertificate.copy(str);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getMessage() {
                    return this.message;
                }

                @NotNull
                public final OnInvalidCertificate copy(@NotNull String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    return new OnInvalidCertificate(message);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OnInvalidCertificate) && Intrinsics.f(this.message, ((OnInvalidCertificate) other).message);
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
                    return j6.a.u(new StringBuilder("OnInvalidCertificate(message="), this.message, CoreConstants.RIGHT_PARENTHESIS_CHAR);
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    parcel.writeString(this.message);
                }
            }

            @InternalOnfidoApi
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$OnError$OnTokenExpired;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$OnError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class OnTokenExpired extends OnError {

                @NotNull
                public static final OnTokenExpired INSTANCE = new OnTokenExpired();

                @NotNull
                public static final Parcelable.Creator<OnTokenExpired> CREATOR = new Creator();

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<OnTokenExpired> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final OnTokenExpired createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return OnTokenExpired.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final OnTokenExpired[] newArray(int i) {
                        return new OnTokenExpired[i];
                    }
                }

                private OnTokenExpired() {
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

            private OnError() {
                super(null);
            }

            public /* synthetic */ OnError(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @InternalOnfidoApi
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult$VideoUploadedSuccessfully;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationFragment$LivenessConfirmationResult;", "uploadResult", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "(Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;)V", "getUploadResult", "()Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class VideoUploadedSuccessfully extends LivenessConfirmationResult {

            @NotNull
            public static final Parcelable.Creator<VideoUploadedSuccessfully> CREATOR = new Creator();

            @NotNull
            private final UploadedArtifact uploadResult;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<VideoUploadedSuccessfully> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final VideoUploadedSuccessfully createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VideoUploadedSuccessfully((UploadedArtifact) parcel.readParcelable(VideoUploadedSuccessfully.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final VideoUploadedSuccessfully[] newArray(int i) {
                    return new VideoUploadedSuccessfully[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoUploadedSuccessfully(@NotNull UploadedArtifact uploadResult) {
                super(null);
                Intrinsics.checkNotNullParameter(uploadResult, "uploadResult");
                this.uploadResult = uploadResult;
            }

            public static /* synthetic */ VideoUploadedSuccessfully copy$default(VideoUploadedSuccessfully videoUploadedSuccessfully, UploadedArtifact uploadedArtifact, int i, Object obj2) {
                if ((i & 1) != 0) {
                    uploadedArtifact = videoUploadedSuccessfully.uploadResult;
                }
                return videoUploadedSuccessfully.copy(uploadedArtifact);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final UploadedArtifact getUploadResult() {
                return this.uploadResult;
            }

            @NotNull
            public final VideoUploadedSuccessfully copy(@NotNull UploadedArtifact uploadResult) {
                Intrinsics.checkNotNullParameter(uploadResult, "uploadResult");
                return new VideoUploadedSuccessfully(uploadResult);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VideoUploadedSuccessfully) && Intrinsics.f(this.uploadResult, ((VideoUploadedSuccessfully) other).uploadResult);
            }

            @NotNull
            public final UploadedArtifact getUploadResult() {
                return this.uploadResult;
            }

            public int hashCode() {
                return this.uploadResult.hashCode();
            }

            @NotNull
            public String toString() {
                return "VideoUploadedSuccessfully(uploadResult=" + this.uploadResult + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeParcelable(this.uploadResult, flags);
            }
        }

        private LivenessConfirmationResult() {
        }

        public /* synthetic */ LivenessConfirmationResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment$getChallengesContentDescription$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<LivenessChallenge, CharSequence> {

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment$getChallengesContentDescription$1$WhenMappings */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MovementType.values().length];
                try {
                    iArr[MovementType.TURN_LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MovementType.TURN_RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(@NotNull LivenessChallenge it8) {
            String string;
            int i;
            Intrinsics.checkNotNullParameter(it8, "it");
            if (it8 instanceof MovementLivenessChallenge) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[((MovementLivenessChallenge) it8).getQuery().ordinal()];
                if (i2 == 1) {
                    i = R.string.onfido_video_capture_header_challenge_turn_left_accessibility;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.onfido_video_capture_header_challenge_turn_right_accessibility;
                }
                LivenessConfirmationFragment livenessConfirmationFragment = LivenessConfirmationFragment.this;
                string = livenessConfirmationFragment.getString(R.string.onfido_video_capture_header_challenge_turn_instructions_accessibility, livenessConfirmationFragment.getString(i));
            } else {
                if (!(it8 instanceof ReciteLivenessChallenge)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = LivenessConfirmationFragment.this.getString(R.string.onfido_video_capture_header_challenge_digit_instructions_accessibility, d.c0(((ReciteLivenessChallenge) it8).getQuery(), "-", null, 62));
            }
            Intrinsics.h(string);
            return string;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment$onMediaPlayerError$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20911 extends u implements Function1<DialogInterface, Unit> {
        public C20911() {
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
            LivenessConfirmationFragment.this.deleteVideoAndExit();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment$onNoVolumeDetected$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20921 extends u implements Function0<Unit> {
        public C20921() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3726invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3726invoke() {
            VolumeWarningView volumeView = LivenessConfirmationFragment.this.getBinding().volumeView;
            Intrinsics.checkNotNullExpressionValue(volumeView, "volumeView");
            AccessibilityExtensionsKt.sendAccessibilityFocusEvent(volumeView);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment$onVideoNotFound$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20931 extends u implements Function1<DialogInterface, Unit> {
        public C20931() {
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
            LivenessConfirmationFragment.this.deleteVideoAndExit();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment$onVideoTooLarge$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20941 extends u implements Function1<DialogInterface, Unit> {
        public C20941() {
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
            LivenessConfirmationFragment.this.deleteVideoAndExit();
        }
    }

    @NotNull
    public static final LivenessConfirmationFragment createInstance(@NotNull String str, @NotNull String str2, boolean z, @NotNull LivenessPerformedChallenges livenessPerformedChallenges) {
        return INSTANCE.createInstance(str, str2, z, livenessPerformedChallenges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteVideoAndExit() {
        getPresenter$onfido_capture_sdk_core_release().deleteVideoFile(getVideoPath());
        submitResult(LivenessConfirmationResult.Exit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoFragmentLivenessConfirmationBinding getBinding() {
        OnfidoFragmentLivenessConfirmationBinding onfidoFragmentLivenessConfirmationBinding = this._binding;
        Intrinsics.h(onfidoFragmentLivenessConfirmationBinding);
        return onfidoFragmentLivenessConfirmationBinding;
    }

    private final String getChallengesContentDescription(List<? extends LivenessChallenge> livenessPerformedChallenges) {
        return d0.k0(livenessPerformedChallenges, ", " + getString(R.string.onfido_video_capture_header_extra_instructions_accessibility) + ", ", null, null, 0, new AnonymousClass1(), 30);
    }

    private final String getLivenessChallengesContentDescription(LivenessPerformedChallenges livenessUploadChallenges) {
        return getChallengesContentDescription(livenessChallenges(livenessUploadChallenges));
    }

    @InternalOnfidoApi
    @NotNull
    public static final LivenessConfirmationResult getResult(@NotNull Bundle bundle) {
        return INSTANCE.getResult(bundle);
    }

    private final String getVideoPath() {
        return (String) this.videoPath.getValue();
    }

    private final List<LivenessChallenge> livenessChallenges(LivenessPerformedChallenges livenessUploadChallenges) {
        List<LivenessPerformedChallenge> challenges = livenessUploadChallenges.getChallenges();
        ArrayList arrayList = new ArrayList(w.t(challenges, 10));
        Iterator<T> it8 = challenges.iterator();
        while (it8.hasNext()) {
            arrayList.add(((LivenessPerformedChallenge) it8.next()).getLivenessChallenge());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(LivenessConfirmationFragment this$0, LivenessPerformedChallenges livenessUploadChallenges, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(livenessUploadChallenges, "$livenessUploadChallenges");
        this$0.getPresenter$onfido_capture_sdk_core_release().trackFaceVideoConfirmationUploadButtonClicked();
        LivenessConfirmationPresenter presenter$onfido_capture_sdk_core_release = this$0.getPresenter$onfido_capture_sdk_core_release();
        String videoPath = this$0.getVideoPath();
        Intrinsics.checkNotNullExpressionValue(videoPath, "<get-videoPath>(...)");
        presenter$onfido_capture_sdk_core_release.uploadVideo(livenessUploadChallenges, videoPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$2(LivenessConfirmationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getPresenter$onfido_capture_sdk_core_release().trackFaceVideoConfirmationRetakeButtonClicked();
        this$0.submitResult(LivenessConfirmationResult.Exit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(LivenessConfirmationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getPresenter$onfido_capture_sdk_core_release().turnVolumeOn();
    }

    private final void submitResult(LivenessConfirmationResult result) {
        if (FragmentExtentionsKt.isAttached(this)) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            String string = requireArguments().getString("key_request");
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            parentFragmentManager.setFragmentResult(string, BundleKt.bundleOf(new Pair("key_result", result)));
        }
    }

    @NotNull
    public final LivenessChallengesDrawer.Factory getLivenessChallengesDrawerFactory$onfido_capture_sdk_core_release() {
        LivenessChallengesDrawer.Factory factory = this.livenessChallengesDrawerFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.r("livenessChallengesDrawerFactory");
        throw null;
    }

    @NotNull
    public final LivenessConfirmationPresenter getPresenter$onfido_capture_sdk_core_release() {
        LivenessConfirmationPresenter livenessConfirmationPresenter = this.presenter;
        if (livenessConfirmationPresenter != null) {
            return livenessConfirmationPresenter;
        }
        Intrinsics.r("presenter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = OnfidoFragmentLivenessConfirmationBinding.inflate(inflater, container, false);
        RelativeLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBinding().videoPlayerView.release();
        getBinding().videoPlayerView.setListener(null);
        this._binding = null;
        super.onDestroyView();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void onInvalidCertificate(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        submitResult(new LivenessConfirmationResult.OnError.OnInvalidCertificate(message));
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void onMediaPlayerError() {
        getPresenter$onfido_capture_sdk_core_release().trackVideoError();
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, (Integer) null, R.string.onfido_video_confirmation_error_media_player, R.string.onfido_video_confirmation_button_secondary, (Integer) null, false, (Function1) null, (Function1) new C20911(), 57, (Object) null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void onNextChallenge(@NotNull LivenessChallenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        if (!getBinding().videoPlayerView.isPlaying() || getContext() == null) {
            return;
        }
        LivenessChallengesDrawer livenessChallengesDrawer = this.livenessChallengesDrawer;
        if (livenessChallengesDrawer == null) {
            Intrinsics.r("livenessChallengesDrawer");
            throw null;
        }
        FrameLayout challengesContainer = getBinding().challengesContainer;
        Intrinsics.checkNotNullExpressionValue(challengesContainer, "challengesContainer");
        livenessChallengesDrawer.drawReview(challenge, challengesContainer, (int) (getBinding().videoContainer.getHeight() * 0.5f));
        FrameLayout challengesContainer2 = getBinding().challengesContainer;
        Intrinsics.checkNotNullExpressionValue(challengesContainer2, "challengesContainer");
        ViewExtensionsKt.animateToAlpha$default(challengesContainer2, CHALLENGES_CONTAINER_DEFAULT_ALPHA, 0L, 2, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void onNoVolumeDetected() {
        getBinding().volumeView.inflate(new C20921());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getPresenter$onfido_capture_sdk_core_release().onStart(ContextUtilsKt.getScreenOrientation(getContext()).isPortrait$onfido_capture_sdk_core_release());
        if (new File(getVideoPath()).exists()) {
            VideoPlayerView videoPlayerView = getBinding().videoPlayerView;
            try {
                getBinding().videoPlayerView.prepare();
                videoPlayerView.setListener(this);
                return;
            } catch (IllegalStateException unused) {
            }
        }
        onVideoNotFound();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        OnfidoFragmentLivenessConfirmationBinding binding = getBinding();
        getPresenter$onfido_capture_sdk_core_release().stop(binding.videoPlayerView.getCurrentTimestamp());
        getBinding().videoPlayerView.stop();
        binding.volumeView.stopAnimation();
        binding.challengesContainer.setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void onTokenExpired() {
        submitResult(LivenessConfirmationResult.OnError.OnTokenExpired.INSTANCE);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.video_view.VideoPlayViewListener
    public void onVideoError() {
        onMediaPlayerError();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.video_view.VideoPlayViewListener
    public void onVideoFinished() {
        getPresenter$onfido_capture_sdk_core_release().onVideoFinished();
        FrameLayout frameLayout = getBinding().challengesContainer;
        if (frameLayout != null) {
            ViewExtensionsKt.animateToAlpha$default(frameLayout, BitmapDescriptorFactory.HUE_RED, 0L, 2, null);
        }
        OnfidoButton firstAction = getBinding().firstAction;
        Intrinsics.checkNotNullExpressionValue(firstAction, "firstAction");
        AccessibilityExtensionsKt.sendAccessibilityFocusEvent(firstAction);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void onVideoNotFound() {
        LifecycleAwareDialog lifecycleAwareDialog = this.lifecycleAwareDialog;
        Integer numValueOf = Integer.valueOf(R.string.onfido_video_confirmation_error_no_video);
        int i = R.string.onfido_video_confirmation_button_secondary;
        LifecycleAwareDialog.show$default(lifecycleAwareDialog, numValueOf, i, i, (Integer) null, false, (Function1) null, (Function1) new C20931(), 56, (Object) null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.video_view.VideoPlayViewListener
    public void onVideoPaused() {
        getPresenter$onfido_capture_sdk_core_release().onVideoPaused(getBinding().videoPlayerView.getCurrentTimestamp());
        FrameLayout challengesContainer = getBinding().challengesContainer;
        Intrinsics.checkNotNullExpressionValue(challengesContainer, "challengesContainer");
        ViewExtensionsKt.animateToAlpha$default(challengesContainer, 0.5f, 0L, 2, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.video_view.VideoPlayViewListener
    public void onVideoStarted() {
        LivenessConfirmationPresenter presenter$onfido_capture_sdk_core_release = getPresenter$onfido_capture_sdk_core_release();
        LivenessReviewChallenge[] livenessReviewChallengeArr = this.livenessReviewChallenges;
        if (livenessReviewChallengeArr != null) {
            presenter$onfido_capture_sdk_core_release.onVideoStarted(livenessReviewChallengeArr);
        } else {
            Intrinsics.r("livenessReviewChallenges");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void onVideoTooLarge() {
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(R.string.onfido_video_alert_video_too_long_title), R.string.onfido_video_alert_video_too_long_detail, R.string.onfido_video_alert_video_too_long_button_primary, (Integer) null, false, (Function1) null, (Function1) new C20941(), 56, (Object) null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void onVideoUploadError() {
        getPresenter$onfido_capture_sdk_core_release().trackFaceVideoConfirmationUploadStatus(CaptureStatus.ERROR);
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(R.string.onfido_generic_error_network_title), R.string.onfido_generic_error_network_detail, 0, (Integer) null, true, (Function1) null, (Function1) null, LDSFile.EF_DG12_TAG, (Object) null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void onVideoUploaded(@NotNull UploadedArtifact liveVideoUpload) {
        Intrinsics.checkNotNullParameter(liveVideoUpload, "liveVideoUpload");
        getPresenter$onfido_capture_sdk_core_release().trackFaceVideoConfirmationUploadStatus(CaptureStatus.SUCCESS);
        submitResult(new LivenessConfirmationResult.VideoUploadedSuccessfully(liveVideoUpload));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        super.onViewCreated(view, savedInstanceState);
        LivenessChallengesDrawer.Factory livenessChallengesDrawerFactory$onfido_capture_sdk_core_release = getLivenessChallengesDrawerFactory$onfido_capture_sdk_core_release();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        this.livenessChallengesDrawer = livenessChallengesDrawerFactory$onfido_capture_sdk_core_release.create(contextRequireContext2);
        Bundle arguments = getArguments();
        getPresenter$onfido_capture_sdk_core_release().attachView(this, arguments != null ? arguments.getBoolean("SHOW_CONFIRMATION_VIDEO") : true);
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "requireArguments(...)");
        Serializable serializable = bundleRequireArguments.getSerializable("onfido_liveness_challenges");
        Intrinsics.i(serializable, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges");
        LivenessPerformedChallenges livenessPerformedChallenges = (LivenessPerformedChallenges) serializable;
        Intrinsics.checkNotNullExpressionValue(requireContext(), "requireContext(...)");
        int iScreenHeight = (int) ((ContextUtilsKt.screenHeight(r9) * 0.5f) / 2);
        VideoPlayerView videoPlayerView = getBinding().videoPlayerView;
        String videoPath = getVideoPath();
        Intrinsics.checkNotNullExpressionValue(videoPath, "<get-videoPath>(...)");
        videoPlayerView.setVideoPath(videoPath);
        OnfidoButton onfidoButton = getBinding().firstAction;
        onfidoButton.setOnClickListener(new f(this, livenessPerformedChallenges, 8));
        onfidoButton.setMaxHeight$onfido_capture_sdk_core_release(iScreenHeight);
        OnfidoButton onfidoButton2 = getBinding().secondAction;
        final int i = 0;
        onfidoButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LivenessConfirmationFragment f50015b;

            {
                this.f50015b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        LivenessConfirmationFragment.onViewCreated$lambda$3$lambda$2(this.f50015b, view2);
                        break;
                    default:
                        LivenessConfirmationFragment.onViewCreated$lambda$6(this.f50015b, view2);
                        break;
                }
            }
        });
        onfidoButton2.setMaxHeight$onfido_capture_sdk_core_release(iScreenHeight);
        List<LivenessPerformedChallenge> challenges = livenessPerformedChallenges.getChallenges();
        ArrayList arrayList = new ArrayList(w.t(challenges, 10));
        for (LivenessPerformedChallenge livenessPerformedChallenge : challenges) {
            arrayList.add(new LivenessReviewChallenge(livenessPerformedChallenge.getLivenessChallenge(), livenessPerformedChallenge.getEndChallengeTimestamp()));
        }
        this.livenessReviewChallenges = (LivenessReviewChallenge[]) arrayList.toArray(new LivenessReviewChallenge[0]);
        FrameLayout frameLayout = getBinding().challengesContainer;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(3);
        frameLayout.setLayoutTransition(layoutTransition);
        final int i2 = 1;
        getBinding().volumeView.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LivenessConfirmationFragment f50015b;

            {
                this.f50015b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        LivenessConfirmationFragment.onViewCreated$lambda$3$lambda$2(this.f50015b, view2);
                        break;
                    default:
                        LivenessConfirmationFragment.onViewCreated$lambda$6(this.f50015b, view2);
                        break;
                }
            }
        });
        FragmentActivity activity = getActivity();
        Intrinsics.i(activity, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.OnfidoActivity");
        ((OnfidoActivity) activity).getBinding$onfido_capture_sdk_core_release().toolbar.getRootView().setContentDescription(getLivenessChallengesContentDescription(livenessPerformedChallenges));
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void onVolumeDetected() {
        getBinding().volumeView.deflate();
    }

    public final void setLivenessChallengesDrawerFactory$onfido_capture_sdk_core_release(@NotNull LivenessChallengesDrawer.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.livenessChallengesDrawerFactory = factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void setLoading(boolean enabled) {
        LoadingFragment.Companion.DialogMode.Uploading uploading = new LoadingFragment.Companion.DialogMode.Uploading("UPLOADING_VIDEO");
        if (enabled) {
            showLoadingDialog$onfido_capture_sdk_core_release(uploading);
        } else {
            dismissLoadingDialog$onfido_capture_sdk_core_release();
        }
    }

    public final void setPresenter$onfido_capture_sdk_core_release(@NotNull LivenessConfirmationPresenter livenessConfirmationPresenter) {
        Intrinsics.checkNotNullParameter(livenessConfirmationPresenter, "<set-?>");
        this.presenter = livenessConfirmationPresenter;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.View
    public void showNoVideoConfirmationView() {
        FrameLayout videoConfirmationTextContainer = getBinding().videoConfirmationTextContainer;
        Intrinsics.checkNotNullExpressionValue(videoConfirmationTextContainer, "videoConfirmationTextContainer");
        ViewExtensionsKt.toVisible$default(videoConfirmationTextContainer, false, 1, null);
        ConstraintLayout videoContainer = getBinding().videoContainer;
        Intrinsics.checkNotNullExpressionValue(videoContainer, "videoContainer");
        ViewExtensionsKt.toGone$default(videoContainer, false, 1, null);
    }
}
