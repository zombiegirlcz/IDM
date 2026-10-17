package cuj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0j.b0 f109037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0j.v f109038c;

    public h(String collectionId, d0j.b0 b0Var, d0j.v collectionItem) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(collectionItem, "collectionItem");
        this.f109036a = collectionId;
        this.f109037b = b0Var;
        this.f109038c = collectionItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f109036a, hVar.f109036a) && this.f109037b == hVar.f109037b && Intrinsics.f(this.f109038c, hVar.f109038c);
    }

    public final int hashCode() {
        int iHashCode = this.f109036a.hashCode() * 31;
        d0j.b0 b0Var = this.f109037b;
        return this.f109038c.hashCode() + ((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31);
    }
}
