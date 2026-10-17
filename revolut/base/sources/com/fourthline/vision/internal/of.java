package com.fourthline.vision.internal;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class of implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f36639c;

    public of(@NotNull String stepType, String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(stepType, "stepType");
        this.f36637a = stepType;
        this.f36638b = str;
        this.f36639c = map;
    }

    private final String component1() {
        return this.f36637a;
    }

    private final String component2() {
        return this.f36638b;
    }

    private final Map<String, Object> component3() {
        return this.f36639c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ of copy$default(of ofVar, String str, String str2, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = ofVar.f36637a;
        }
        if ((i & 2) != 0) {
            str2 = ofVar.f36638b;
        }
        if ((i & 4) != 0) {
            map = ofVar.f36639c;
        }
        return ofVar.copy(str, str2, map);
    }

    @NotNull
    public final of copy(@NotNull String stepType, String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(stepType, "stepType");
        return new of(stepType, str, map);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof of)) {
            return false;
        }
        of ofVar = (of) obj2;
        return Intrinsics.f(this.f36637a, ofVar.f36637a) && Intrinsics.f(this.f36638b, ofVar.f36638b) && Intrinsics.f(this.f36639c, ofVar.f36639c);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        aim.f builder = new aim.f();
        builder.put("step_type", this.f36637a);
        String str = this.f36638b;
        if (str != null) {
            builder.put("liveness_direction", str);
        }
        Map map = this.f36639c;
        if (map != null) {
            builder.putAll(map);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return "selfie_scan_step_completed";
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_step_completed/jsonschema/1-0-0";
    }

    public int hashCode() {
        int iHashCode = this.f36637a.hashCode() * 31;
        String str = this.f36638b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f36639c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ScanStepCompleted(stepType=" + this.f36637a + ", livenessDirection=" + this.f36638b + ", metaData=" + this.f36639c + ")";
    }

    public /* synthetic */ of(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : map);
    }
}
