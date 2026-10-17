package com.fourthline.vision.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class qf implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36738b;

    public qf(@NotNull String stepType, String str) {
        Intrinsics.checkNotNullParameter(stepType, "stepType");
        this.f36737a = stepType;
        this.f36738b = str;
    }

    private final String component1() {
        return this.f36737a;
    }

    private final String component2() {
        return this.f36738b;
    }

    public static /* synthetic */ qf copy$default(qf qfVar, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = qfVar.f36737a;
        }
        if ((i & 2) != 0) {
            str2 = qfVar.f36738b;
        }
        return qfVar.copy(str, str2);
    }

    @NotNull
    public final qf copy(@NotNull String stepType, String str) {
        Intrinsics.checkNotNullParameter(stepType, "stepType");
        return new qf(stepType, str);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj2;
        return Intrinsics.f(this.f36737a, qfVar.f36737a) && Intrinsics.f(this.f36738b, qfVar.f36738b);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        aim.f builder = new aim.f();
        builder.put("step_type", this.f36737a);
        String str = this.f36738b;
        if (str != null) {
            builder.put("liveness_direction", str);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return "selfie_scan_step_started";
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_step_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        int iHashCode = this.f36737a.hashCode() * 31;
        String str = this.f36738b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ScanStepStarted(stepType=" + this.f36737a + ", livenessDirection=" + this.f36738b + ")";
    }
}
