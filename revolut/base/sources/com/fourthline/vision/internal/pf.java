package com.fourthline.vision.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pf implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36713b;

    public pf(@NotNull String stepType, boolean z) {
        Intrinsics.checkNotNullParameter(stepType, "stepType");
        this.f36712a = stepType;
        this.f36713b = z;
    }

    private final String component1() {
        return this.f36712a;
    }

    private final boolean component2() {
        return this.f36713b;
    }

    public static /* synthetic */ pf copy$default(pf pfVar, String str, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = pfVar.f36712a;
        }
        if ((i & 2) != 0) {
            z = pfVar.f36713b;
        }
        return pfVar.copy(str, z);
    }

    @NotNull
    public final pf copy(@NotNull String stepType, boolean z) {
        Intrinsics.checkNotNullParameter(stepType, "stepType");
        return new pf(stepType, z);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj2;
        return Intrinsics.f(this.f36712a, pfVar.f36712a) && this.f36713b == pfVar.f36713b;
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        aim.f builder = new aim.f();
        builder.put("step_type", this.f36712a);
        builder.put("hand_visible", Boolean.valueOf(this.f36713b));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return "selfie_scan_step_detection";
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_step_detection/jsonschema/1-0-0";
    }

    public int hashCode() {
        return (this.f36712a.hashCode() * 31) + Boolean.hashCode(this.f36713b);
    }

    @NotNull
    public String toString() {
        return "ScanStepDetectionUpdate(stepType=" + this.f36712a + ", handVisible=" + this.f36713b + ")";
    }
}
