package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f222020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222022c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f222023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f222024h;
    public final int i;

    public /* synthetic */ c0(int i, boolean z, String str, String str2, boolean z3, boolean z4, String str3, boolean z6, String str4, int i2) {
        if (511 != (i & 511)) {
            qlm.j1.f(a0.f222006a.getDescriptor(), i, 511);
            throw null;
        }
        this.f222020a = z;
        this.f222021b = str;
        this.f222022c = str2;
        this.d = z3;
        this.e = z4;
        this.f = str3;
        this.f222023g = z6;
        this.f222024h = str4;
        this.i = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f222020a == c0Var.f222020a && Intrinsics.f(this.f222021b, c0Var.f222021b) && Intrinsics.f(this.f222022c, c0Var.f222022c) && this.d == c0Var.d && this.e == c0Var.e && Intrinsics.f(this.f, c0Var.f) && this.f222023g == c0Var.f222023g && Intrinsics.f(this.f222024h, c0Var.f222024h) && this.i == c0Var.i;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(Boolean.hashCode(this.f222020a) * 31, 31, this.f222021b), 31, this.f222022c), 31, this.d), 31, this.e), 31, this.f), 31, this.f222023g);
        String str = this.f222024h;
        return Integer.hashCode(this.i) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public c0(boolean z, String autoPay, String statementType, boolean z3, boolean z4, String repaymentManagement, boolean z6, String str, int i) {
        Intrinsics.checkNotNullParameter(autoPay, "autoPay");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        Intrinsics.checkNotNullParameter(repaymentManagement, "repaymentManagement");
        this.f222020a = z;
        this.f222021b = autoPay;
        this.f222022c = statementType;
        this.d = z3;
        this.e = z4;
        this.f = repaymentManagement;
        this.f222023g = z6;
        this.f222024h = str;
        this.i = i;
    }
}
