package syl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements o31.c, koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f266706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f266707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f266708c;
    public p31.c d;

    public h(CharSequence positive, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter("", "listId");
        Intrinsics.checkNotNullParameter(positive, "positive");
        this.f266706a = positive;
        this.f266707b = charSequence;
        this.f266708c = null;
        this.d = null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51822a() {
        return "";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f266706a, hVar.f266706a) && Intrinsics.f(this.f266707b, hVar.f266707b) && Intrinsics.f(this.f266708c, hVar.f266708c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f266706a.hashCode() * 31;
        CharSequence charSequence = this.f266707b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        p31.c cVar = this.f266708c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        return (iHashCode3 + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51826h() {
        return this.f266708c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getI() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return null;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51827j() {
        return null;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f266708c = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }
}
