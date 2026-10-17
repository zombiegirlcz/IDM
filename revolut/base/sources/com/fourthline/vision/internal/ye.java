package com.fourthline.vision.internal;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ye implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37164c;
    private final boolean d;
    private final String e;
    private final String f;

    public ye(@NotNull String documentSide, int i, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        this.f37162a = documentSide;
        this.f37163b = i;
        this.f37164c = z;
        this.d = z3;
        this.e = "document_scan_step_started";
        this.f = "iglu:com.fourthline.sdk/document_scan_step_started/jsonschema/1-0-0";
    }

    private final String component1() {
        return this.f37162a;
    }

    private final int component2() {
        return this.f37163b;
    }

    private final boolean component3() {
        return this.f37164c;
    }

    private final boolean component4() {
        return this.d;
    }

    public static /* synthetic */ ye copy$default(ye yeVar, String str, int i, boolean z, boolean z3, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = yeVar.f37162a;
        }
        if ((i2 & 2) != 0) {
            i = yeVar.f37163b;
        }
        if ((i2 & 4) != 0) {
            z = yeVar.f37164c;
        }
        if ((i2 & 8) != 0) {
            z3 = yeVar.d;
        }
        return yeVar.copy(str, i, z, z3);
    }

    @NotNull
    public final ye copy(@NotNull String documentSide, int i, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        return new ye(documentSide, i, z, z3);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ye)) {
            return false;
        }
        ye yeVar = (ye) obj2;
        return Intrinsics.f(this.f37162a, yeVar.f37162a) && this.f37163b == yeVar.f37163b && this.f37164c == yeVar.f37164c && this.d == yeVar.d;
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        return zhm.r0.k(new Pair("step_index", Integer.valueOf(this.f37163b)), new Pair("document_side", this.f37162a), new Pair("tilted", Boolean.valueOf(this.f37164c)), new Pair("autodetect_available", Boolean.valueOf(this.d)));
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
        return (((((this.f37162a.hashCode() * 31) + Integer.hashCode(this.f37163b)) * 31) + Boolean.hashCode(this.f37164c)) * 31) + Boolean.hashCode(this.d);
    }

    @NotNull
    public String toString() {
        return "ScanStepStarted(documentSide=" + this.f37162a + ", stepIndex=" + this.f37163b + ", tilted=" + this.f37164c + ", autodetectAvailable=" + this.d + ")";
    }
}
