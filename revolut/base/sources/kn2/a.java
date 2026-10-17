package kn2;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn2.a f185974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn2.a f185975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn2.a f185976c;
    public final mn2.a d;
    public final mn2.a e;
    public final mn2.a f;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f185974a == aVar.f185974a && this.f185975b == aVar.f185975b && this.f185976c == aVar.f185976c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        mn2.a aVar = this.f185974a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        mn2.a aVar2 = this.f185975b;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        mn2.a aVar3 = this.f185976c;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        mn2.a aVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        mn2.a aVar5 = this.e;
        int iHashCode5 = (iHashCode4 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        mn2.a aVar6 = this.f;
        return iHashCode5 + (aVar6 != null ? aVar6.hashCode() : 0);
    }

    public /* synthetic */ a(int i) {
        this(null, null, null, null, null, null);
    }

    public a(mn2.a aVar, mn2.a aVar2, mn2.a aVar3, mn2.a aVar4, mn2.a aVar5, mn2.a aVar6) {
        this.f185974a = aVar;
        this.f185975b = aVar2;
        this.f185976c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }
}
