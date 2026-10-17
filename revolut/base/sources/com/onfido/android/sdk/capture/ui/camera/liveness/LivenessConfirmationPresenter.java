package com.onfido.android.sdk.capture.ui.camera.liveness;

import a0.d;
import android.os.ResultReceiver;
import androidx.core.os.BundleKt;
import ch.qos.logback.core.CoreConstants;
import cim.b;
import com.onfido.android.sdk.capture.audio.VolumeManager;
import com.onfido.android.sdk.capture.common.cryptography.PayloadHelper;
import com.onfido.android.sdk.capture.common.di.qualifier.MediaCallbackResultReceiver;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.CaptureStatus;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifactKt;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.MovementLivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.ReciteLivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.video_view.LivenessReviewChallenge;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.ResultReceiverExtensionsKt;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.api.client.data.LiveVideoChallenges;
import com.onfido.api.client.data.LiveVideoLanguage;
import com.onfido.api.client.data.LiveVideoUpload;
import com.onfido.api.client.data.PayloadIntegrity;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.api.client.exception.RequestEntityTooLargeException;
import com.onfido.api.client.exception.TokenExpiredException;
import ehe.n;
import igm.g;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lim.m;
import org.jetbrains.annotations.NotNull;
import vim.f;
import yhm.j;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 Y2\u00020\u0001:\u0003YZ[B[\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0012J\b\u00101\u001a\u00020'H\u0012J\u0016\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00105\u001a\u000206H\u0012J\u0010\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020)H\u0016J\u0010\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020;H\u0012J\u0010\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020>H\u0012J\b\u0010?\u001a\u00020'H\u0016J\u0010\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020\u001eH\u0016J\u001b\u0010B\u001a\u00020'2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0016¢\u0006\u0002\u0010FJ\u0018\u0010G\u001a\u00020H2\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u000200H\u0012J\u0010\u0010I\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010J\u001a\u00020'H\u0016J\b\u0010K\u001a\u00020'H\u0016J\u0010\u0010L\u001a\u00020'2\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020'H\u0016J\b\u0010P\u001a\u00020'H\u0016J\b\u0010Q\u001a\u00020'H\u0016J\b\u0010R\u001a\u00020'H\u0016J\u0018\u0010S\u001a\u00020'2\u0006\u00105\u001a\u0002062\u0006\u0010T\u001a\u00020,H\u0016J\u001e\u0010U\u001a\b\u0012\u0004\u0012\u00020;0V2\u0006\u0010W\u001a\u00020H2\u0006\u0010X\u001a\u00020.H\u0012R\u001b\u0010\u0017\u001a\u00020\u00188RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\u001eX\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0092\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020\u00188RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b \u0010\u001aR\u000e\u0010\"\u001a\u00020#X\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0092.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationPresenter;", "", "onfidoAPI", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "sdkUploadMetadataHelper", "Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;", "payloadHelper", "Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;", "livenessCaptureSettings", "Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "volumeManager", "Lcom/onfido/android/sdk/capture/audio/VolumeManager;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "livenessTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessTracker;", "timeProvider", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "waitingScreenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "mediaCallback", "Landroid/os/ResultReceiver;", "(Lcom/onfido/android/sdk/capture/network/OnfidoApiService;Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;Lcom/onfido/android/sdk/capture/audio/VolumeManager;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessTracker;Lcom/onfido/android/sdk/capture/utils/TimeProvider;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;Landroid/os/ResultReceiver;)V", "compositeSubscription", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getCompositeSubscription", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeSubscription$delegate", "Lkotlin/Lazy;", "currentVideoTimestamp", "", "uploadVideoCompositeSubscription", "getUploadVideoCompositeSubscription", "uploadVideoCompositeSubscription$delegate", "videoUploadStartTime", "", "view", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationPresenter$View;", "attachView", "", "showRecordedVideo", "", "deleteVideoFile", "videoPath", "", "getPayloadIntegrity", "Lcom/onfido/api/client/data/PayloadIntegrity;", "videoFile", "Ljava/io/File;", "hideLoading", "mapChallenges", "", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge;", "performedChallenges", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "onStart", "isPortrait", "onUploadCompleted", "videoUpload", "Lcom/onfido/api/client/data/LiveVideoUpload;", "onUploadError", "throwable", "", "onVideoFinished", "onVideoPaused", "timestamp", "onVideoStarted", "challenges", "", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/video_view/LivenessReviewChallenge;", "([Lcom/onfido/android/sdk/capture/ui/camera/liveness/video_view/LivenessReviewChallenge;)V", "prepareRequestParams", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationPresenter$LiveVideoUploadRequestParams;", "stop", "trackFaceVideoConfirmationRetakeButtonClicked", "trackFaceVideoConfirmationUploadButtonClicked", "trackFaceVideoConfirmationUploadStatus", "captureStatus", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/CaptureStatus;", "trackUploadCompleted", "trackUploadStarted", "trackVideoError", "turnVolumeOn", "uploadVideo", "filePath", "videoUploadRequest", "Lio/reactivex/rxjava3/core/Observable;", "params", "payloadIntegrity", "Companion", "LiveVideoUploadRequestParams", "View", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LivenessConfirmationPresenter {
    private static final long VOLUME_CHECK_PERIOD_MS = 1000;

    /* JADX INFO: renamed from: compositeSubscription$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy compositeSubscription;
    private int currentVideoTimestamp;

    @NotNull
    private final SdkConfiguration.LivenessCapture livenessCaptureSettings;

    @NotNull
    private final LivenessTracker livenessTracker;
    private final ResultReceiver mediaCallback;

    @NotNull
    private final OnfidoApiService onfidoAPI;

    @NotNull
    private final PayloadHelper payloadHelper;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final SdkUploadMetadataHelper sdkUploadMetadataHelper;

    @NotNull
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: uploadVideoCompositeSubscription$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy uploadVideoCompositeSubscription;
    private long videoUploadStartTime;
    private View view;

    @NotNull
    private final VolumeManager volumeManager;

    @NotNull
    private final WaitingScreenTracker waitingScreenTracker;

    @NotNull
    public static final String SDK_LANGUAGE_SOURCE = "sdk";

    @NotNull
    public static final String MP4_MIME = "video/mp4";

    @NotNull
    private static final String MP4_EXTENSION = "mp4";

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u0006)"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationPresenter$LiveVideoUploadRequestParams;", "", "videoFileName", "", "videoFileBytes", "", "challengesId", "challenges", "", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge;", "endChallengeTimestamp", "", "sdkLanguages", "Lcom/onfido/api/client/data/LiveVideoLanguage;", "videoFileType", "(Ljava/lang/String;[BLjava/lang/String;Ljava/util/List;JLjava/util/List;Ljava/lang/String;)V", "getChallenges", "()Ljava/util/List;", "getChallengesId", "()Ljava/lang/String;", "getEndChallengeTimestamp", "()J", "getSdkLanguages", "getVideoFileBytes", "()[B", "getVideoFileName", "getVideoFileType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LiveVideoUploadRequestParams {

        @NotNull
        private final List<LiveVideoChallenges.LiveVideoChallenge> challenges;

        @NotNull
        private final String challengesId;
        private final long endChallengeTimestamp;

        @NotNull
        private final List<LiveVideoLanguage> sdkLanguages;

        @NotNull
        private final byte[] videoFileBytes;

        @NotNull
        private final String videoFileName;

        @NotNull
        private final String videoFileType;

        /* JADX WARN: Multi-variable type inference failed */
        public LiveVideoUploadRequestParams(@NotNull String videoFileName, @NotNull byte[] videoFileBytes, @NotNull String challengesId, @NotNull List<? extends LiveVideoChallenges.LiveVideoChallenge> challenges, long j2, @NotNull List<LiveVideoLanguage> sdkLanguages, @NotNull String videoFileType) {
            Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
            Intrinsics.checkNotNullParameter(videoFileBytes, "videoFileBytes");
            Intrinsics.checkNotNullParameter(challengesId, "challengesId");
            Intrinsics.checkNotNullParameter(challenges, "challenges");
            Intrinsics.checkNotNullParameter(sdkLanguages, "sdkLanguages");
            Intrinsics.checkNotNullParameter(videoFileType, "videoFileType");
            this.videoFileName = videoFileName;
            this.videoFileBytes = videoFileBytes;
            this.challengesId = challengesId;
            this.challenges = challenges;
            this.endChallengeTimestamp = j2;
            this.sdkLanguages = sdkLanguages;
            this.videoFileType = videoFileType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveVideoUploadRequestParams copy$default(LiveVideoUploadRequestParams liveVideoUploadRequestParams, String str, byte[] bArr, String str2, List list, long j2, List list2, String str3, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = liveVideoUploadRequestParams.videoFileName;
            }
            if ((i & 2) != 0) {
                bArr = liveVideoUploadRequestParams.videoFileBytes;
            }
            if ((i & 4) != 0) {
                str2 = liveVideoUploadRequestParams.challengesId;
            }
            if ((i & 8) != 0) {
                list = liveVideoUploadRequestParams.challenges;
            }
            if ((i & 16) != 0) {
                j2 = liveVideoUploadRequestParams.endChallengeTimestamp;
            }
            if ((i & 32) != 0) {
                list2 = liveVideoUploadRequestParams.sdkLanguages;
            }
            if ((i & 64) != 0) {
                str3 = liveVideoUploadRequestParams.videoFileType;
            }
            long j3 = j2;
            String str4 = str2;
            List list3 = list;
            return liveVideoUploadRequestParams.copy(str, bArr, str4, list3, j3, list2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVideoFileName() {
            return this.videoFileName;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final byte[] getVideoFileBytes() {
            return this.videoFileBytes;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getChallengesId() {
            return this.challengesId;
        }

        @NotNull
        public final List<LiveVideoChallenges.LiveVideoChallenge> component4() {
            return this.challenges;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getEndChallengeTimestamp() {
            return this.endChallengeTimestamp;
        }

        @NotNull
        public final List<LiveVideoLanguage> component6() {
            return this.sdkLanguages;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getVideoFileType() {
            return this.videoFileType;
        }

        @NotNull
        public final LiveVideoUploadRequestParams copy(@NotNull String videoFileName, @NotNull byte[] videoFileBytes, @NotNull String challengesId, @NotNull List<? extends LiveVideoChallenges.LiveVideoChallenge> challenges, long endChallengeTimestamp, @NotNull List<LiveVideoLanguage> sdkLanguages, @NotNull String videoFileType) {
            Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
            Intrinsics.checkNotNullParameter(videoFileBytes, "videoFileBytes");
            Intrinsics.checkNotNullParameter(challengesId, "challengesId");
            Intrinsics.checkNotNullParameter(challenges, "challenges");
            Intrinsics.checkNotNullParameter(sdkLanguages, "sdkLanguages");
            Intrinsics.checkNotNullParameter(videoFileType, "videoFileType");
            return new LiveVideoUploadRequestParams(videoFileName, videoFileBytes, challengesId, challenges, endChallengeTimestamp, sdkLanguages, videoFileType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LiveVideoUploadRequestParams)) {
                return false;
            }
            LiveVideoUploadRequestParams liveVideoUploadRequestParams = (LiveVideoUploadRequestParams) other;
            return Intrinsics.f(this.videoFileName, liveVideoUploadRequestParams.videoFileName) && Arrays.equals(this.videoFileBytes, liveVideoUploadRequestParams.videoFileBytes) && Intrinsics.f(this.challengesId, liveVideoUploadRequestParams.challengesId) && Intrinsics.f(this.challenges, liveVideoUploadRequestParams.challenges) && this.endChallengeTimestamp == liveVideoUploadRequestParams.endChallengeTimestamp && Intrinsics.f(this.sdkLanguages, liveVideoUploadRequestParams.sdkLanguages) && Intrinsics.f(this.videoFileType, liveVideoUploadRequestParams.videoFileType);
        }

        @NotNull
        public final List<LiveVideoChallenges.LiveVideoChallenge> getChallenges() {
            return this.challenges;
        }

        @NotNull
        public final String getChallengesId() {
            return this.challengesId;
        }

        public final long getEndChallengeTimestamp() {
            return this.endChallengeTimestamp;
        }

        @NotNull
        public final List<LiveVideoLanguage> getSdkLanguages() {
            return this.sdkLanguages;
        }

        @NotNull
        public final byte[] getVideoFileBytes() {
            return this.videoFileBytes;
        }

        @NotNull
        public final String getVideoFileName() {
            return this.videoFileName;
        }

        @NotNull
        public final String getVideoFileType() {
            return this.videoFileType;
        }

        public int hashCode() {
            return this.videoFileType.hashCode() + p.a.d(d.c(p.a.d(p.a.c(n.b(this.videoFileName.hashCode() * 31, 31, this.videoFileBytes), 31, this.challengesId), 31, this.challenges), 31, this.endChallengeTimestamp), 31, this.sdkLanguages);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("LiveVideoUploadRequestParams(videoFileName=");
            sb6.append(this.videoFileName);
            sb6.append(", videoFileBytes=");
            sb6.append(Arrays.toString(this.videoFileBytes));
            sb6.append(", challengesId=");
            sb6.append(this.challengesId);
            sb6.append(", challenges=");
            sb6.append(this.challenges);
            sb6.append(", endChallengeTimestamp=");
            sb6.append(this.endChallengeTimestamp);
            sb6.append(", sdkLanguages=");
            sb6.append(this.sdkLanguages);
            sb6.append(", videoFileType=");
            return j6.a.u(sb6, this.videoFileType, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public /* synthetic */ LiveVideoUploadRequestParams(String str, byte[] bArr, String str2, List list, long j2, List list2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bArr, str2, list, j2, list2, (i & 64) != 0 ? "video/mp4" : str3);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0003H&¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationPresenter$View;", "", "onInvalidCertificate", "", "message", "", "onMediaPlayerError", "onNextChallenge", "challenge", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "onNoVolumeDetected", "onTokenExpired", "onVideoNotFound", "onVideoTooLarge", "onVideoUploadError", "onVideoUploaded", "liveVideoUpload", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "onVolumeDetected", "setLoading", "enabled", "", "showNoVideoConfirmationView", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface View {
        void onInvalidCertificate(@NotNull String message);

        void onMediaPlayerError();

        void onNextChallenge(@NotNull LivenessChallenge challenge);

        void onNoVolumeDetected();

        void onTokenExpired();

        void onVideoNotFound();

        void onVideoTooLarge();

        void onVideoUploadError();

        void onVideoUploaded(@NotNull UploadedArtifact liveVideoUpload);

        void onVolumeDetected();

        void setLoading(boolean enabled);

        void showNoVideoConfirmationView();
    }

    public LivenessConfirmationPresenter(@NotNull OnfidoApiService onfidoAPI, @NotNull SdkUploadMetadataHelper sdkUploadMetadataHelper, @NotNull PayloadHelper payloadHelper, @NotNull SdkConfiguration.LivenessCapture livenessCaptureSettings, @NotNull VolumeManager volumeManager, @NotNull SchedulersProvider schedulersProvider, @NotNull LivenessTracker livenessTracker, @NotNull TimeProvider timeProvider, @NotNull WaitingScreenTracker waitingScreenTracker, @MediaCallbackResultReceiver ResultReceiver resultReceiver) {
        Intrinsics.checkNotNullParameter(onfidoAPI, "onfidoAPI");
        Intrinsics.checkNotNullParameter(sdkUploadMetadataHelper, "sdkUploadMetadataHelper");
        Intrinsics.checkNotNullParameter(payloadHelper, "payloadHelper");
        Intrinsics.checkNotNullParameter(livenessCaptureSettings, "livenessCaptureSettings");
        Intrinsics.checkNotNullParameter(volumeManager, "volumeManager");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(livenessTracker, "livenessTracker");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(waitingScreenTracker, "waitingScreenTracker");
        this.onfidoAPI = onfidoAPI;
        this.sdkUploadMetadataHelper = sdkUploadMetadataHelper;
        this.payloadHelper = payloadHelper;
        this.livenessCaptureSettings = livenessCaptureSettings;
        this.volumeManager = volumeManager;
        this.schedulersProvider = schedulersProvider;
        this.livenessTracker = livenessTracker;
        this.timeProvider = timeProvider;
        this.waitingScreenTracker = waitingScreenTracker;
        this.mediaCallback = resultReceiver;
        this.compositeSubscription = j.b(LivenessConfirmationPresenter$compositeSubscription$2.INSTANCE);
        this.uploadVideoCompositeSubscription = j.b(LivenessConfirmationPresenter$uploadVideoCompositeSubscription$2.INSTANCE);
    }

    public static /* synthetic */ void attachView$default(LivenessConfirmationPresenter livenessConfirmationPresenter, View view, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachView");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        livenessConfirmationPresenter.attachView(view, z);
    }

    private CompositeDisposable getCompositeSubscription() {
        return (CompositeDisposable) this.compositeSubscription.getValue();
    }

    private PayloadIntegrity getPayloadIntegrity(File videoFile) {
        boolean zIsPayloadSigningEnabled = this.livenessCaptureSettings.isPayloadSigningEnabled();
        return this.payloadHelper.getSignedPayload(videoFile, this.sdkUploadMetadataHelper.create(), zIsPayloadSigningEnabled);
    }

    private CompositeDisposable getUploadVideoCompositeSubscription() {
        return (CompositeDisposable) this.uploadVideoCompositeSubscription.getValue();
    }

    private void hideLoading() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.setLoading(false);
        this.waitingScreenTracker.trackWaitingScreenCompletion(new LoadingFragment.Companion.DialogMode.Uploading("UPLOADING_VIDEO").toTaskType(), "UPLOADING_VIDEO");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<LiveVideoChallenges.LiveVideoChallenge> mapChallenges(LivenessPerformedChallenges performedChallenges) {
        Object movementQuery;
        List<LivenessPerformedChallenge> challenges = performedChallenges.getChallenges();
        ArrayList arrayList = new ArrayList(w.t(challenges, 10));
        for (LivenessPerformedChallenge livenessPerformedChallenge : challenges) {
            LivenessChallenge livenessChallenge = livenessPerformedChallenge.getLivenessChallenge();
            int i = 2;
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (livenessChallenge instanceof ReciteLivenessChallenge) {
                movementQuery = new LiveVideoChallenges.LiveVideoChallenge.ReciteQuery(kotlin.collections.d.t0(((ReciteLivenessChallenge) livenessPerformedChallenge.getLivenessChallenge()).getQuery()), str, i, objArr3 == true ? 1 : 0);
            } else {
                if (!(livenessChallenge instanceof MovementLivenessChallenge)) {
                    throw new NoWhenBranchMatchedException();
                }
                movementQuery = new LiveVideoChallenges.LiveVideoChallenge.MovementQuery(((MovementLivenessChallenge) livenessPerformedChallenge.getLivenessChallenge()).getQuery().getId(), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
            }
            arrayList.add(movementQuery);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUploadCompleted(LiveVideoUpload videoUpload) {
        trackUploadCompleted();
        hideLoading();
        View view = this.view;
        if (view != null) {
            view.onVideoUploaded(UploadedArtifactKt.toUploadedArtifact(videoUpload));
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUploadError(Throwable throwable) {
        Timber.INSTANCE.e(throwable, "Error uploading liveness video - ".concat(getClass().getName()), new Object[0]);
        hideLoading();
        if (throwable instanceof SSLPeerUnverifiedException) {
            View view = this.view;
            if (view == null) {
                Intrinsics.r("view");
                throw null;
            }
            String localizedMessage = ((SSLPeerUnverifiedException) throwable).getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "SSLPeerUnverified error";
            }
            view.onInvalidCertificate(localizedMessage);
            return;
        }
        if (throwable instanceof TokenExpiredException) {
            View view2 = this.view;
            if (view2 != null) {
                view2.onTokenExpired();
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (throwable instanceof RequestEntityTooLargeException) {
            View view3 = this.view;
            if (view3 != null) {
                view3.onVideoTooLarge();
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        View view4 = this.view;
        if (view4 != null) {
            view4.onVideoUploadError();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVideoStarted$lambda$6(LivenessConfirmationPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zIsVolumeOn = this$0.volumeManager.isVolumeOn();
        View view = this$0.view;
        if (zIsVolumeOn) {
            if (view != null) {
                view.onVolumeDetected();
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (view != null) {
            view.onNoVolumeDetected();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private LiveVideoUploadRequestParams prepareRequestParams(LivenessPerformedChallenges performedChallenges, File videoFile) throws IOException {
        String name = videoFile.getName();
        byte[] bArrD = m.d(videoFile);
        String id10 = performedChallenges.getId();
        List<LiveVideoChallenges.LiveVideoChallenge> listMapChallenges = mapChallenges(performedChallenges);
        long endChallengeTimestamp = performedChallenges.getChallenges().get(v.j(listMapChallenges) - 1).getEndChallengeTimestamp();
        List listC = u.c(new LiveVideoLanguage("sdk", Locale.getDefault().getLanguage()));
        Intrinsics.h(name);
        return new LiveVideoUploadRequestParams(name, bArrD, id10, listMapChallenges, endChallengeTimestamp, listC, null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadVideo$lambda$0(File videoFile) {
        Intrinsics.checkNotNullParameter(videoFile, "$videoFile");
        videoFile.delete();
    }

    private Observable videoUploadRequest(LiveVideoUploadRequestParams params, PayloadIntegrity payloadIntegrity) {
        return this.onfidoAPI.uploadLiveVideo$onfido_capture_sdk_core_release(new OnfidoApiService.VideoUploadParams(params.getVideoFileName(), params.getVideoFileType(), params.getVideoFileBytes(), params.getChallengesId(), params.getChallenges(), Long.valueOf(params.getEndChallengeTimestamp()), params.getSdkLanguages()), payloadIntegrity);
    }

    public void attachView(@NotNull View view, boolean showRecordedVideo) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        if (showRecordedVideo) {
            return;
        }
        view.showNoVideoConfirmationView();
    }

    public void deleteVideoFile(String videoPath) {
        if (videoPath == null) {
            return;
        }
        try {
            File file = new File(videoPath);
            if (file.exists()) {
                file.delete();
            }
        } catch (SecurityException e) {
            Timber.INSTANCE.e(getClass().getName(), "Can't delete video", e);
        }
    }

    public void onStart(boolean isPortrait) {
        LivenessTracker.trackFaceCapture$onfido_capture_sdk_core_release$default(this.livenessTracker, true, isPortrait, CaptureType.VIDEO, null, 0, 0, 56, null);
    }

    public void onVideoFinished() {
        this.currentVideoTimestamp = 0;
        getCompositeSubscription().d();
    }

    public void onVideoPaused(int timestamp) {
        this.currentVideoTimestamp = timestamp;
        getCompositeSubscription().d();
    }

    public void onVideoStarted(@NotNull LivenessReviewChallenge[] challenges) {
        Object next;
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        final List listN0 = kotlin.collections.d.n0(new Comparator() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter$onVideoStarted$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return b.b(Long.valueOf(((LivenessReviewChallenge) t2).getEndTimestamp()), Long.valueOf(((LivenessReviewChallenge) t3).getEndTimestamp()));
            }
        }, challenges);
        f it8 = new IntRange(0, v.j(listN0) - 1, 1).iterator();
        while (it8.f289625c) {
            final int iNextInt = it8.nextInt();
            if (((LivenessReviewChallenge) listN0.get(iNextInt)).getEndTimestamp() > this.currentVideoTimestamp) {
                CompositeDisposable compositeSubscription = getCompositeSubscription();
                Disposable disposableSubscribe = Observable.timer(((LivenessReviewChallenge) listN0.get(iNextInt)).getEndTimestamp() - ((long) this.currentVideoTimestamp), TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).map(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter$onVideoStarted$1$1
                    @NotNull
                    public final Integer apply(long j2) {
                        return Integer.valueOf(iNextInt);
                    }

                    @Override // igm.o
                    public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                        return apply(((Number) obj2).longValue());
                    }
                }).observeOn(this.schedulersProvider.getUi()).subscribeOn(this.schedulersProvider.getIo()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter$onVideoStarted$1$2
                    public final void accept(int i) {
                        LivenessConfirmationPresenter.View view = this.this$0.view;
                        if (view != null) {
                            view.onNextChallenge(listN0.get(iNextInt + 1).getLivenessChallenge());
                        } else {
                            Intrinsics.r("view");
                            throw null;
                        }
                    }

                    @Override // igm.g
                    public /* bridge */ /* synthetic */ void accept(Object obj2) {
                        accept(((Number) obj2).intValue());
                    }
                }, new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter$onVideoStarted$1$3
                    @Override // igm.g
                    public final void accept(@NotNull Throwable it9) {
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Timber.INSTANCE.e(this.this$0.getClass().getName(), a10.b.u(new StringBuilder("Error setting up the timer: "), it9));
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                RxExtensionsKt.plusAssign(compositeSubscription, disposableSubscribe);
            }
        }
        Iterator it9 = listN0.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            } else {
                next = it9.next();
                if (((LivenessReviewChallenge) next).getEndTimestamp() > this.currentVideoTimestamp) {
                    break;
                }
            }
        }
        LivenessReviewChallenge livenessReviewChallenge = (LivenessReviewChallenge) next;
        if (livenessReviewChallenge != null) {
            View view = this.view;
            if (view == null) {
                Intrinsics.r("view");
                throw null;
            }
            view.onNextChallenge(livenessReviewChallenge.getLivenessChallenge());
        }
        CompositeDisposable compositeSubscription2 = getCompositeSubscription();
        Disposable disposableSubscribe2 = Observable.interval(0L, 1000L, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).map(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.onVideoStarted.4
            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return apply(((Number) obj2).longValue());
            }

            @NotNull
            public final Pair<Boolean, Long> apply(long j2) {
                return new Pair<>(Boolean.valueOf(LivenessConfirmationPresenter.this.volumeManager.isVolumeOn()), Long.valueOf(j2));
            }
        }).distinctUntilChanged(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.onVideoStarted.5
            @Override // igm.o
            @NotNull
            public final Boolean apply(@NotNull Pair<Boolean, Long> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                Boolean bool = (Boolean) pair.f186385a;
                bool.getClass();
                return bool;
            }
        }).doOnDispose(new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(this, 9)).subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.onVideoStarted.7
            @Override // igm.g
            public final void accept(@NotNull Pair<Boolean, Long> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                ((Number) pair.f186386b).longValue();
                if (zBooleanValue) {
                    View view2 = LivenessConfirmationPresenter.this.view;
                    if (view2 != null) {
                        view2.onVolumeDetected();
                        return;
                    } else {
                        Intrinsics.r("view");
                        throw null;
                    }
                }
                View view3 = LivenessConfirmationPresenter.this.view;
                if (view3 != null) {
                    view3.onNoVolumeDetected();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.onVideoStarted.8
            @Override // igm.g
            public final void accept(@NotNull Throwable it10) {
                Intrinsics.checkNotNullParameter(it10, "it");
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription2, disposableSubscribe2);
    }

    public void stop(int currentVideoTimestamp) {
        getCompositeSubscription().d();
        getUploadVideoCompositeSubscription().d();
        this.currentVideoTimestamp = currentVideoTimestamp;
    }

    public void trackFaceVideoConfirmationRetakeButtonClicked() {
        this.livenessTracker.trackFaceVideoConfirmationRetakeButtonClicked$onfido_capture_sdk_core_release();
    }

    public void trackFaceVideoConfirmationUploadButtonClicked() {
        this.livenessTracker.trackFaceVideoConfirmationUploadButtonClicked$onfido_capture_sdk_core_release();
    }

    public void trackFaceVideoConfirmationUploadStatus(@NotNull CaptureStatus captureStatus) {
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        this.livenessTracker.trackFaceVideoConfirmationUploadStatus$onfido_capture_sdk_core_release(captureStatus, this.timeProvider.getCurrentTimestamp() - this.videoUploadStartTime);
    }

    public void trackUploadCompleted() {
        this.livenessTracker.trackUploadCompleted$onfido_capture_sdk_core_release(this.timeProvider.getCurrentTimestamp() - this.videoUploadStartTime);
    }

    public void trackUploadStarted() {
        this.videoUploadStartTime = this.timeProvider.getCurrentTimestamp();
        this.livenessTracker.trackUploadStarted$onfido_capture_sdk_core_release();
    }

    public void trackVideoError() {
        this.livenessTracker.trackFaceConfirmationVideoError$onfido_capture_sdk_core_release();
    }

    public void turnVolumeOn() {
        this.volumeManager.turnVolumeOn();
        View view = this.view;
        if (view != null) {
            view.onVolumeDetected();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public void uploadVideo(@NotNull LivenessPerformedChallenges performedChallenges, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(performedChallenges, "performedChallenges");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        trackUploadStarted();
        File file = new File(filePath);
        if (!file.exists()) {
            View view = this.view;
            if (view != null) {
                view.onVideoNotFound();
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        view2.setLoading(true);
        Observable observableVideoUploadRequest = videoUploadRequest(prepareRequestParams(performedChallenges, file), getPayloadIntegrity(file));
        ResultReceiver resultReceiver = this.mediaCallback;
        if (resultReceiver != null) {
            ResultReceiverExtensionsKt.sendMedia(resultReceiver, m.d(file), this.schedulersProvider.getIo(), BundleKt.bundleOf(new Pair("isDocument", CaptureType.VIDEO), new Pair("file_type", "mp4"), new Pair("file_name", file.getName())));
        }
        CompositeDisposable uploadVideoCompositeSubscription = getUploadVideoCompositeSubscription();
        Disposable disposableSubscribe = observableVideoUploadRequest.subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi()).doFinally(new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(file, 10)).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.uploadVideo.2
            @Override // igm.g
            public final void accept(@NotNull LiveVideoUpload videoUpload) {
                Intrinsics.checkNotNullParameter(videoUpload, "videoUpload");
                LivenessConfirmationPresenter.this.onUploadCompleted(videoUpload);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter.uploadVideo.3
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                LivenessConfirmationPresenter.this.onUploadError(throwable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(uploadVideoCompositeSubscription, disposableSubscribe);
    }
}
