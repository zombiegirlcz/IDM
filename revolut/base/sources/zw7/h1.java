package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325793c;
    public final String d;
    public final l e;
    public final dj0.d f;

    public h1(String id10, String monthlyPayment, String excess, String coPayment, l lVar, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(monthlyPayment, "monthlyPayment");
        Intrinsics.checkNotNullParameter(excess, "excess");
        Intrinsics.checkNotNullParameter(coPayment, "coPayment");
        this.f325791a = id10;
        this.f325792b = monthlyPayment;
        this.f325793c = excess;
        this.d = coPayment;
        this.e = lVar;
        this.f = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f325791a, h1Var.f325791a) && Intrinsics.f(this.f325792b, h1Var.f325792b) && Intrinsics.f(this.f325793c, h1Var.f325793c) && Intrinsics.f(this.d, h1Var.d) && Intrinsics.f(this.e, h1Var.e) && Intrinsics.f(this.f, h1Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f325791a.hashCode() * 31, 31, this.f325792b), 31, this.f325793c), 31, this.d);
        l lVar = this.e;
        int iHashCode = (iC + (lVar == null ? 0 : lVar.hashCode())) * 31;
        dj0.d dVar = this.f;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
