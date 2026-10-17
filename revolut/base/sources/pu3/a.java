package pu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f239807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f239809c;
    public final Long d;
    public final c e;

    public a(d debtType, String creditProvider, Long l2, Long l3, c cVar) {
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(creditProvider, "creditProvider");
        this.f239807a = debtType;
        this.f239808b = creditProvider;
        this.f239809c = l2;
        this.d = l3;
        this.e = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f239807a == aVar.f239807a && Intrinsics.f(this.f239808b, aVar.f239808b) && Intrinsics.f(this.f239809c, aVar.f239809c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f239807a.hashCode() * 31, 31, this.f239808b);
        Long l2 = this.f239809c;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        c cVar = this.e;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
