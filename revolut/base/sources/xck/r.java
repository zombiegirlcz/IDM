package xck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304181a;

    public r(String productArticleId) {
        Intrinsics.checkNotNullParameter(productArticleId, "productArticleId");
        this.f304181a = productArticleId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f304181a, ((r) obj2).f304181a);
    }

    public final int hashCode() {
        return this.f304181a.hashCode();
    }
}
