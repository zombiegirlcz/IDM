package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f200986c;

    public l(dj0.d allocated, String allocationId, String categoryId) {
        Intrinsics.checkNotNullParameter(allocationId, "allocationId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(allocated, "allocated");
        this.f200984a = allocationId;
        this.f200985b = categoryId;
        this.f200986c = allocated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f200984a, lVar.f200984a) && Intrinsics.f(this.f200985b, lVar.f200985b) && Intrinsics.f(this.f200986c, lVar.f200986c);
    }

    public final int hashCode() {
        return this.f200986c.hashCode() + p.a.c(this.f200984a.hashCode() * 31, 31, this.f200985b);
    }
}
