package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f200994b;

    public o(dj0.d allocated, String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(allocated, "allocated");
        this.f200993a = categoryId;
        this.f200994b = allocated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f200993a, oVar.f200993a) && Intrinsics.f(this.f200994b, oVar.f200994b);
    }

    public final int hashCode() {
        return this.f200994b.hashCode() + (this.f200993a.hashCode() * 31);
    }
}
