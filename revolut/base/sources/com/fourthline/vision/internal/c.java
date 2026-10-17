package com.fourthline.vision.internal;

import com.fourthline.core.internal.devicedata.MotionFrame;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class c implements h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k8 f36031a;

    public c(@NotNull k8 mediaDurationIntervalDataSource) {
        Intrinsics.checkNotNullParameter(mediaDurationIntervalDataSource, "mediaDurationIntervalDataSource");
        this.f36031a = mediaDurationIntervalDataSource;
    }

    @Override // com.fourthline.vision.internal.h9
    @NotNull
    public Pair<Long, List<MotionFrame>> trimMotionData(@NotNull List<MotionFrame> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Pair<Long, Long> pair = this.f36031a.get();
            Long lValueOf = Long.valueOf(((Number) pair.f186385a).longValue() + this.f36031a.getRecordingStartTimestamp());
            Pair pair2 = new Pair(lValueOf, Long.valueOf(((Number) pair.f186386b).longValue() + this.f36031a.getRecordingStartTimestamp()));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : data) {
                long jLongValue = ((Number) pair2.f186385a).longValue();
                long jLongValue2 = ((Number) pair2.f186386b).longValue();
                long timestamp = ((MotionFrame) obj2).getTimestamp();
                if (jLongValue <= timestamp && timestamp <= jLongValue2) {
                    arrayList.add(obj2);
                }
            }
            return new Pair<>(lValueOf, arrayList);
        } catch (Throwable unused) {
            MotionFrame motionFrame = (MotionFrame) zhm.d0.d0(data);
            return new Pair<>(Long.valueOf(motionFrame != null ? motionFrame.getTimestamp() : 0L), data);
        }
    }
}
