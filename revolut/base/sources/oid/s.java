package oid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f225672b;

    public s(String categoryId, int i) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f225671a = categoryId;
        this.f225672b = i;
    }

    public final String a() {
        return "ShopsCategoryTilesParams(categoryId=" + this.f225671a + ", limit=12, offset=" + this.f225672b + ")";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f225671a, sVar.f225671a) && this.f225672b == sVar.f225672b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f225672b) + j6.a.b(12, this.f225671a.hashCode() * 31, 31);
    }
}
