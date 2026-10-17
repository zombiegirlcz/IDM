package com.fourthline.vision.internal;

import com.fourthline.core.internal.devicedata.MotionFrame;
import com.fourthline.vision.MotionData;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kf implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MotionData f36457a;

    public kf(MotionData motionData) {
        this.f36457a = motionData;
    }

    public static /* synthetic */ kf copy$default(kf kfVar, MotionData motionData, int i, Object obj2) {
        if ((i & 1) != 0) {
            motionData = kfVar.f36457a;
        }
        return kfVar.copy(motionData);
    }

    public final MotionData component1() {
        return this.f36457a;
    }

    @NotNull
    public final kf copy(MotionData motionData) {
        return new kf(motionData);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof kf) && Intrinsics.f(this.f36457a, ((kf) obj2).f36457a);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        List<MotionFrame> motionFrames;
        MotionData motionData = this.f36457a;
        return zhm.q0.c(new Pair("motion_data", (motionData == null || (motionFrames = motionData.getMotionFrames()) == null) ? null : Integer.valueOf(motionFrames.size())));
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return "selfie_scan_completed";
    }

    public final MotionData getMotionData() {
        return this.f36457a;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_completed/jsonschema/1-0-0";
    }

    public int hashCode() {
        MotionData motionData = this.f36457a;
        if (motionData == null) {
            return 0;
        }
        return motionData.hashCode();
    }

    @NotNull
    public String toString() {
        return "ScanCompleted(motionData=" + this.f36457a + ")";
    }
}
