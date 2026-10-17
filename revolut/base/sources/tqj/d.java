package tqj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f273613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f273614c;
    public final zpj.a d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f273615g;

    public d(String walletId, long j2, Long l2, zpj.a cycle, String currencyCode, long j3, List categories) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f273612a = walletId;
        this.f273613b = j2;
        this.f273614c = l2;
        this.d = cycle;
        this.e = currencyCode;
        this.f = j3;
        this.f273615g = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f273612a, dVar.f273612a) && this.f273613b == dVar.f273613b && Intrinsics.f(this.f273614c, dVar.f273614c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && Intrinsics.f(this.f273615g, dVar.f273615g);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f273612a.hashCode() * 31, 31, this.f273613b);
        Long l2 = this.f273614c;
        return this.f273615g.hashCode() + a0.d.c(p.a.c((this.d.hashCode() + ((iC + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
    }
}
