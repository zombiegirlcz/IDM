package y63;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f311146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f311147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f311148c;
    public final q63.a d;
    public final q63.j e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q63.i f311149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f311150h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f311151j;
    public final boolean k;

    public w(boolean z, boolean z3, boolean z4, q63.a aVar, q63.j jVar, boolean z6, q63.i iVar, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f311146a = z;
        this.f311147b = z3;
        this.f311148c = z4;
        this.d = aVar;
        this.e = jVar;
        this.f = z6;
        this.f311149g = iVar;
        this.f311150h = z11;
        this.i = z12;
        this.f311151j = z29;
        this.k = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f311146a == wVar.f311146a && this.f311147b == wVar.f311147b && this.f311148c == wVar.f311148c && this.d == wVar.d && Intrinsics.f(this.e, wVar.e) && this.f == wVar.f && Intrinsics.f(this.f311149g, wVar.f311149g) && this.f311150h == wVar.f311150h && this.i == wVar.i && this.f311151j == wVar.f311151j && this.k == wVar.k;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.f311146a) * 31, 31, this.f311147b), 31, this.f311148c);
        q63.a aVar = this.d;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        q63.j jVar = this.e;
        int iC2 = j6.a.c((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.f);
        q63.i iVar = this.f311149g;
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c((iC2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31, this.f311150h), 31, this.i), 31, this.f311151j);
    }
}
