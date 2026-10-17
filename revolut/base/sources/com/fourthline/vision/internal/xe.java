package com.fourthline.vision.internal;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class xe implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37111c;
    private final boolean d;
    private final String e;
    private final String f;

    public xe(@NotNull String documentSide, int i, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        this.f37109a = documentSide;
        this.f37110b = i;
        this.f37111c = z;
        this.d = z3;
        this.e = "document_scan_step_reset";
        this.f = "iglu:com.fourthline.sdk/document_scan_step_reset/jsonschema/1-0-0";
    }

    private final String component1() {
        return this.f37109a;
    }

    private final int component2() {
        return this.f37110b;
    }

    private final boolean component3() {
        return this.f37111c;
    }

    private final boolean component4() {
        return this.d;
    }

    public static /* synthetic */ xe copy$default(xe xeVar, String str, int i, boolean z, boolean z3, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = xeVar.f37109a;
        }
        if ((i2 & 2) != 0) {
            i = xeVar.f37110b;
        }
        if ((i2 & 4) != 0) {
            z = xeVar.f37111c;
        }
        if ((i2 & 8) != 0) {
            z3 = xeVar.d;
        }
        return xeVar.copy(str, i, z, z3);
    }

    @NotNull
    public final xe copy(@NotNull String documentSide, int i, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        return new xe(documentSide, i, z, z3);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj2;
        return Intrinsics.f(this.f37109a, xeVar.f37109a) && this.f37110b == xeVar.f37110b && this.f37111c == xeVar.f37111c && this.d == xeVar.d;
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        return zhm.r0.k(new Pair("step_index", Integer.valueOf(this.f37110b)), new Pair("document_side", this.f37109a), new Pair("tilted", Boolean.valueOf(this.f37111c)), new Pair("autodetect_available", Boolean.valueOf(this.d)));
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return this.e;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return this.f;
    }

    public int hashCode() {
        return (((((this.f37109a.hashCode() * 31) + Integer.hashCode(this.f37110b)) * 31) + Boolean.hashCode(this.f37111c)) * 31) + Boolean.hashCode(this.d);
    }

    @NotNull
    public String toString() {
        return "ScanStepReset(documentSide=" + this.f37109a + ", stepIndex=" + this.f37110b + ", tilted=" + this.f37111c + ", autodetectAvailable=" + this.d + ")";
    }
}
