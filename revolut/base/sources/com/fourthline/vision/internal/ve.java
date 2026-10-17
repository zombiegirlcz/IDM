package com.fourthline.vision.internal;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ve implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37024c;
    private final boolean d;
    private final boolean e;
    private final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f37025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f37026h;

    public ve(@NotNull String documentSide, int i, boolean z, boolean z3, boolean z4, @NotNull List<String> autoDetectValidationErrors) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        Intrinsics.checkNotNullParameter(autoDetectValidationErrors, "autoDetectValidationErrors");
        this.f37022a = documentSide;
        this.f37023b = i;
        this.f37024c = z;
        this.d = z3;
        this.e = z4;
        this.f = autoDetectValidationErrors;
        this.f37025g = "document_scan_step_completed";
        this.f37026h = "iglu:com.fourthline.sdk/document_scan_step_completed/jsonschema/1-0-0";
    }

    private final String component1() {
        return this.f37022a;
    }

    private final int component2() {
        return this.f37023b;
    }

    private final boolean component3() {
        return this.f37024c;
    }

    private final boolean component4() {
        return this.d;
    }

    private final boolean component5() {
        return this.e;
    }

    private final List<String> component6() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ve copy$default(ve veVar, String str, int i, boolean z, boolean z3, boolean z4, List list, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = veVar.f37022a;
        }
        if ((i2 & 2) != 0) {
            i = veVar.f37023b;
        }
        if ((i2 & 4) != 0) {
            z = veVar.f37024c;
        }
        if ((i2 & 8) != 0) {
            z3 = veVar.d;
        }
        if ((i2 & 16) != 0) {
            z4 = veVar.e;
        }
        if ((i2 & 32) != 0) {
            list = veVar.f;
        }
        boolean z6 = z4;
        List list2 = list;
        return veVar.copy(str, i, z, z3, z6, list2);
    }

    @NotNull
    public final ve copy(@NotNull String documentSide, int i, boolean z, boolean z3, boolean z4, @NotNull List<String> autoDetectValidationErrors) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        Intrinsics.checkNotNullParameter(autoDetectValidationErrors, "autoDetectValidationErrors");
        return new ve(documentSide, i, z, z3, z4, autoDetectValidationErrors);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj2;
        return Intrinsics.f(this.f37022a, veVar.f37022a) && this.f37023b == veVar.f37023b && this.f37024c == veVar.f37024c && this.d == veVar.d && this.e == veVar.e && Intrinsics.f(this.f, veVar.f);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        return zhm.r0.k(new Pair("step_index", Integer.valueOf(this.f37023b)), new Pair("document_side", this.f37022a), new Pair("tilted", Boolean.valueOf(this.f37024c)), new Pair("autodetect_available", Boolean.valueOf(this.d)), new Pair("captured_mrz", Boolean.valueOf(this.e)), new Pair("validation_errors", this.f));
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return this.f37025g;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return this.f37026h;
    }

    public int hashCode() {
        return (((((((((this.f37022a.hashCode() * 31) + Integer.hashCode(this.f37023b)) * 31) + Boolean.hashCode(this.f37024c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + this.f.hashCode();
    }

    @NotNull
    public String toString() {
        return "ScanStepCompleted(documentSide=" + this.f37022a + ", stepIndex=" + this.f37023b + ", tilted=" + this.f37024c + ", autoDetectAvailable=" + this.d + ", autoDetectCapturedMrz=" + this.e + ", autoDetectValidationErrors=" + this.f + ")";
    }
}
