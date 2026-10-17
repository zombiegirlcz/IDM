package fh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135139a;

    public k(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f135139a = categoryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f135139a, ((k) obj2).f135139a);
    }

    public final int hashCode() {
        return this.f135139a.hashCode();
    }
}
