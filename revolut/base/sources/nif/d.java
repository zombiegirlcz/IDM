package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f215741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f215742c;

    public d(String str, e eVar, e eVar2) {
        this.f215740a = str;
        this.f215741b = eVar;
        this.f215742c = eVar2;
    }

    public final e a() {
        return this.f215742c;
    }

    public final e b() {
        return this.f215741b;
    }

    public final String c() {
        return this.f215740a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f215740a, dVar.f215740a) && Intrinsics.f(this.f215741b, dVar.f215741b) && Intrinsics.f(this.f215742c, dVar.f215742c);
    }

    public final int hashCode() {
        String str = this.f215740a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        e eVar = this.f215741b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.f215742c;
        return iHashCode2 + (eVar2 != null ? eVar2.hashCode() : 0);
    }
}
