package prl;

import k4l.q0;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements ne0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bfl.g f239346c;
    public final q0 d;
    public final Boolean e;
    public final String f;

    public p(String portfolioId, String instrument, bfl.g side, q0 q0Var, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f239344a = portfolioId;
        this.f239345b = instrument;
        this.f239346c = side;
        this.d = q0Var;
        this.e = bool;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f239344a, pVar.f239344a) && Intrinsics.f(this.f239345b, pVar.f239345b) && this.f239346c == pVar.f239346c && this.d == pVar.d && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    @Override // ne0.a
    public final String getKey() {
        return toString();
    }

    public final int hashCode() {
        int iB = y.b(this.f239346c, p.a.c(this.f239344a.hashCode() * 31, 31, this.f239345b), 31);
        q0 q0Var = this.d;
        int iHashCode = (iB + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
