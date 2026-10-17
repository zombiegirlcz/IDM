package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f215722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215723c;
    public final d d;

    public c(String legId, Long l2, String str, d dVar) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f215721a = legId;
        this.f215722b = l2;
        this.f215723c = str;
        this.d = dVar;
    }

    public final Long a() {
        return this.f215722b;
    }

    public final String b() {
        return this.f215723c;
    }

    public final String c() {
        return this.f215721a;
    }

    public final d d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f215721a, cVar.f215721a) && Intrinsics.f(this.f215722b, cVar.f215722b) && Intrinsics.f(this.f215723c, cVar.f215723c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f215721a.hashCode() * 31;
        Long l2 = this.f215722b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f215723c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.d;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }
}
