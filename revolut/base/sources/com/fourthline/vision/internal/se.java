package com.fourthline.vision.internal;

import com.fourthline.core.internal.devicedata.MotionFrame;
import com.fourthline.vision.MotionData;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class se implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f36916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MotionData f36917c;
    private final String d;
    private final String e;

    public se(boolean z, @NotNull List<String> autoDetectValidationErrors, MotionData motionData) {
        Intrinsics.checkNotNullParameter(autoDetectValidationErrors, "autoDetectValidationErrors");
        this.f36915a = z;
        this.f36916b = autoDetectValidationErrors;
        this.f36917c = motionData;
        this.d = "document_scan_completed";
        this.e = "iglu:com.fourthline.sdk/document_scan_completed/jsonschema/1-0-0";
    }

    private final boolean component1() {
        return this.f36915a;
    }

    private final List<String> component2() {
        return this.f36916b;
    }

    private final MotionData component3() {
        return this.f36917c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ se copy$default(se seVar, boolean z, List list, MotionData motionData, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = seVar.f36915a;
        }
        if ((i & 2) != 0) {
            list = seVar.f36916b;
        }
        if ((i & 4) != 0) {
            motionData = seVar.f36917c;
        }
        return seVar.copy(z, list, motionData);
    }

    @NotNull
    public final se copy(boolean z, @NotNull List<String> autoDetectValidationErrors, MotionData motionData) {
        Intrinsics.checkNotNullParameter(autoDetectValidationErrors, "autoDetectValidationErrors");
        return new se(z, autoDetectValidationErrors, motionData);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof se)) {
            return false;
        }
        se seVar = (se) obj2;
        return this.f36915a == seVar.f36915a && Intrinsics.f(this.f36916b, seVar.f36916b) && Intrinsics.f(this.f36917c, seVar.f36917c);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        List<MotionFrame> motionFrames;
        Pair pair = new Pair("captured_mrz", Boolean.valueOf(this.f36915a));
        Pair pair2 = new Pair("validation_errors", this.f36916b);
        MotionData motionData = this.f36917c;
        return zhm.r0.k(pair, pair2, new Pair("motion_data", (motionData == null || (motionFrames = motionData.getMotionFrames()) == null) ? null : Integer.valueOf(motionFrames.size())));
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return this.d;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return this.e;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f36915a) * 31) + this.f36916b.hashCode()) * 31;
        MotionData motionData = this.f36917c;
        return iHashCode + (motionData == null ? 0 : motionData.hashCode());
    }

    @NotNull
    public String toString() {
        return "ScanCompleted(autoDetectCapturedMrz=" + this.f36915a + ", autoDetectValidationErrors=" + this.f36916b + ", motionData=" + this.f36917c + ")";
    }
}
