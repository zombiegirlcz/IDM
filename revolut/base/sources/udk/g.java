package udk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279257a;

    public g(String productArticleId) {
        Intrinsics.checkNotNullParameter(productArticleId, "productArticleId");
        this.f279257a = productArticleId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f279257a, ((g) obj2).f279257a);
    }

    public final int hashCode() {
        return this.f279257a.hashCode();
    }
}
