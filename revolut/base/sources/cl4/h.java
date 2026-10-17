package cl4;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24941c;
    public final d d;
    public final boolean e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f24942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f24943h;
    public final List i;

    public h(boolean z, boolean z3, boolean z4, d cashbackDetails, boolean z6, dj0.d creditLimit, boolean z11, o oVar, List cardOrderingEntryPointItems) {
        Intrinsics.checkNotNullParameter(cashbackDetails, "cashbackDetails");
        Intrinsics.checkNotNullParameter(creditLimit, "creditLimit");
        Intrinsics.checkNotNullParameter(cardOrderingEntryPointItems, "cardOrderingEntryPointItems");
        this.f24939a = z;
        this.f24940b = z3;
        this.f24941c = z4;
        this.d = cashbackDetails;
        this.e = z6;
        this.f = creditLimit;
        this.f24942g = z11;
        this.f24943h = oVar;
        this.i = cardOrderingEntryPointItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f24939a == hVar.f24939a && this.f24940b == hVar.f24940b && this.f24941c == hVar.f24941c && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && Intrinsics.f(this.f, hVar.f) && this.f24942g == hVar.f24942g && Intrinsics.f(this.f24943h, hVar.f24943h) && Intrinsics.f(this.i, hVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(v7.c(j6.a.c((this.d.hashCode() + j6.a.c(j6.a.c(Boolean.hashCode(this.f24939a) * 31, 31, this.f24940b), 31, this.f24941c)) * 31, 31, this.e), 31, this.f), 31, this.f24942g);
        o oVar = this.f24943h;
        return this.i.hashCode() + ((iC + (oVar == null ? 0 : oVar.hashCode())) * 31);
    }
}
