package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t9 {

    @NotNull
    public static final s9 Companion = new s9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f153318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3 f153319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f153320c;
    public final i1 d;
    public final x4 e;
    public final String f;

    public /* synthetic */ t9(int i, p2 p2Var, n3 n3Var, r1 r1Var, i1 i1Var, x4 x4Var, String str) {
        if (63 != (i & 63)) {
            qlm.j1.f(r9.f153292a.getDescriptor(), i, 63);
            throw null;
        }
        this.f153318a = p2Var;
        this.f153319b = n3Var;
        this.f153320c = r1Var;
        this.d = i1Var;
        this.e = x4Var;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj2;
        return Intrinsics.f(this.f153318a, t9Var.f153318a) && Intrinsics.f(this.f153319b, t9Var.f153319b) && Intrinsics.f(this.f153320c, t9Var.f153320c) && Intrinsics.f(this.d, t9Var.d) && Intrinsics.f(this.e, t9Var.e) && Intrinsics.f(this.f, t9Var.f);
    }

    public final int hashCode() {
        p2 p2Var = this.f153318a;
        int iHashCode = (p2Var == null ? 0 : p2Var.hashCode()) * 31;
        n3 n3Var = this.f153319b;
        int iHashCode2 = (iHashCode + (n3Var == null ? 0 : n3Var.hashCode())) * 31;
        r1 r1Var = this.f153320c;
        int iHashCode3 = (iHashCode2 + (r1Var == null ? 0 : r1Var.hashCode())) * 31;
        i1 i1Var = this.d;
        int iHashCode4 = (iHashCode3 + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        x4 x4Var = this.e;
        int iHashCode5 = (iHashCode4 + (x4Var == null ? 0 : x4Var.hashCode())) * 31;
        String str = this.f;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public t9(p2 p2Var, n3 n3Var, r1 r1Var, i1 i1Var, x4 x4Var, String str) {
        this.f153318a = p2Var;
        this.f153319b = n3Var;
        this.f153320c = r1Var;
        this.d = i1Var;
        this.e = x4Var;
        this.f = str;
    }
}
