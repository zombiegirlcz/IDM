package com.onfido.android.sdk.capture.ui.camera.liveness.capture;

import android.content.Context;
import android.os.StatFs;
import ch.qos.logback.core.util.a;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.StringExtensionsKt;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\tH\u0016J\u0010\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020-H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0018X\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessInteractor;", "", "context", "Landroid/content/Context;", "timeProvider", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "(Landroid/content/Context;Lcom/onfido/android/sdk/capture/utils/TimeProvider;)V", "livenessControlButtonSharedFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "", "getLivenessControlButtonSharedFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "livenessControlButtonSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "getLivenessControlButtonSubject", "()Lio/reactivex/rxjava3/subjects/PublishSubject;", "livenessDataDirectory", "Ljava/io/File;", "kotlin.jvm.PlatformType", "getLivenessDataDirectory", "()Ljava/io/File;", "livenessDataDirectory$delegate", "Lkotlin/Lazy;", "livenessPerformedChallenges", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "getLivenessPerformedChallenges", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "setLivenessPerformedChallenges", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;)V", "livenessStartTimestamp", "", "getLivenessStartTimestamp", "()J", "setLivenessStartTimestamp", "(J)V", "getAvailableStorageSpace", "getPreRecordingInstructionsReadingTimeMilisseconds", "hasEnoughAvailableStorageSpace", "", "initializeLivenessVideoTimestamp", "initializePerformedChallenges", "id", "", "pushPerformedChallenge", "livenessChallenge", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LivenessInteractor {

    @NotNull
    private final Context context;

    @NotNull
    private final SharedFlow livenessControlButtonSharedFlow;

    @NotNull
    private final PublishSubject livenessControlButtonSubject;

    /* JADX INFO: renamed from: livenessDataDirectory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy livenessDataDirectory;
    public LivenessPerformedChallenges livenessPerformedChallenges;
    private long livenessStartTimestamp;

    @NotNull
    private final TimeProvider timeProvider;

    public LivenessInteractor(@ApplicationContext @NotNull Context context, @NotNull TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.context = context;
        this.timeProvider = timeProvider;
        this.livenessDataDirectory = j.b(LivenessInteractor$livenessDataDirectory$2.INSTANCE);
        this.livenessControlButtonSubject = a.n("create(...)");
        this.livenessControlButtonSharedFlow = q.b(0, 7, null);
    }

    private File getLivenessDataDirectory() {
        return (File) this.livenessDataDirectory.getValue();
    }

    public long getAvailableStorageSpace() {
        StatFs statFs = new StatFs(getLivenessDataDirectory().getPath());
        if (ContextUtilsKt.apilevelAtLeast(18)) {
            return statFs.getAvailableBytes();
        }
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    @NotNull
    public SharedFlow getLivenessControlButtonSharedFlow() {
        return this.livenessControlButtonSharedFlow;
    }

    @NotNull
    public PublishSubject getLivenessControlButtonSubject() {
        return this.livenessControlButtonSubject;
    }

    @NotNull
    public LivenessPerformedChallenges getLivenessPerformedChallenges() {
        LivenessPerformedChallenges livenessPerformedChallenges = this.livenessPerformedChallenges;
        if (livenessPerformedChallenges != null) {
            return livenessPerformedChallenges;
        }
        Intrinsics.r("livenessPerformedChallenges");
        throw null;
    }

    public long getLivenessStartTimestamp() {
        return this.livenessStartTimestamp;
    }

    public long getPreRecordingInstructionsReadingTimeMilisseconds() {
        String string = this.context.getString(R.string.onfido_video_capture_body);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return StringExtensionsKt.readingTimeMilliseconds(string);
    }

    public boolean hasEnoughAvailableStorageSpace() {
        return getAvailableStorageSpace() < 5500000;
    }

    public void initializeLivenessVideoTimestamp() {
        setLivenessStartTimestamp(this.timeProvider.getCurrentTimestamp());
    }

    public void initializePerformedChallenges(@NotNull String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        setLivenessPerformedChallenges(new LivenessPerformedChallenges(id10, null, 2, null));
    }

    public void pushPerformedChallenge(@NotNull LivenessChallenge livenessChallenge) {
        Intrinsics.checkNotNullParameter(livenessChallenge, "livenessChallenge");
        getLivenessPerformedChallenges().getChallenges().add(new LivenessPerformedChallenge(livenessChallenge, this.timeProvider.getCurrentTimestamp() - getLivenessStartTimestamp()));
    }

    public void setLivenessPerformedChallenges(@NotNull LivenessPerformedChallenges livenessPerformedChallenges) {
        Intrinsics.checkNotNullParameter(livenessPerformedChallenges, "<set-?>");
        this.livenessPerformedChallenges = livenessPerformedChallenges;
    }

    public void setLivenessStartTimestamp(long j2) {
        this.livenessStartTimestamp = j2;
    }
}
