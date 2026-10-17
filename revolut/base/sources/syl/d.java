package syl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements o31.c, koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f266699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f266700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f266701c;

    public d(CharSequence message, q31.d dVar, q31.d dVar2) {
        Intrinsics.checkNotNullParameter("", "listId");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f266699a = message;
        this.f266700b = dVar;
        this.f266701c = dVar2;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53337a() {
        return "";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f266699a.equals(dVar.f266699a) && Intrinsics.f(this.f266700b, dVar.f266700b) && Intrinsics.f(this.f266701c, dVar.f266701c);
    }

    public final int hashCode() {
        int iHashCode = this.f266699a.hashCode() * 31;
        p31.c cVar = this.f266700b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f266701c;
        return (iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53344m() {
        return this.f266700b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53345n() {
        return this.f266701c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53346p() {
        return null;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return null;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f266700b = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f266701c = cVar;
    }
}
