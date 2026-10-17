package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.internal.devicedata.MotionFrame;
import com.fourthline.vision.MotionData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class e implements g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MotionDataCollector f36118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimestampProvider f36119c;
    private final h9 d;
    private long e;

    public e(boolean z, @NotNull MotionDataCollector motionDataCollector, @NotNull TimestampProvider timestampProvider, @NotNull h9 motionDataTrimmer) {
        Intrinsics.checkNotNullParameter(motionDataCollector, "motionDataCollector");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(motionDataTrimmer, "motionDataTrimmer");
        this.f36117a = z;
        this.f36118b = motionDataCollector;
        this.f36119c = timestampProvider;
        this.d = motionDataTrimmer;
        this.e = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionData stop$lambda$0(e eVar, List originalFrames) {
        Intrinsics.checkNotNullParameter(originalFrames, "originalFrames");
        Pair<Long, List<MotionFrame>> pairTrimMotionData = eVar.d.trimMotionData(originalFrames);
        return new MotionData(((Number) pairTrimMotionData.f186385a).longValue(), (List) pairTrimMotionData.f186386b);
    }

    @Override // com.fourthline.vision.internal.g9
    public Object cancel(@NotNull Continuation<? super Unit> continuation) {
        if (this.f36117a) {
            this.f36118b.stop();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.vision.internal.g9
    public void start() {
        if (this.f36117a) {
            this.e = this.f36119c.getCurrentTimestamp();
            this.f36118b.startDataCollection();
        }
    }

    @Override // com.fourthline.vision.internal.g9
    public Object stop(@NotNull Continuation<? super Try<MotionData>> continuation) {
        return this.f36117a ? TryKt.map(TryKt.success(this.f36118b.stop()), new eg(this, 2)) : Try.INSTANCE.just(null);
    }
}
