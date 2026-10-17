package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f232642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f232643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f232644c;
    public final q0 d;
    public final String e;
    public final r0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f232645g;

    public h0(String id10, i0 state, long j2, q0 loanRepaymentType, String str, r0 amountBreakdown, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(loanRepaymentType, "loanRepaymentType");
        Intrinsics.checkNotNullParameter(amountBreakdown, "amountBreakdown");
        this.f232642a = id10;
        this.f232643b = state;
        this.f232644c = j2;
        this.d = loanRepaymentType;
        this.e = str;
        this.f = amountBreakdown;
        this.f232645g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f232642a, h0Var.f232642a) && this.f232643b == h0Var.f232643b && this.f232644c == h0Var.f232644c && this.d == h0Var.d && Intrinsics.f(this.e, h0Var.e) && Intrinsics.f(this.f, h0Var.f) && this.f232645g == h0Var.f232645g;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + a0.d.c((this.f232643b.hashCode() + (this.f232642a.hashCode() * 31)) * 31, 31, this.f232644c)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.f232645g) + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
