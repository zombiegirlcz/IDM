package vaa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iaa.f f287216a;

    public v(iaa.f productArticle) {
        Intrinsics.checkNotNullParameter(productArticle, "productArticle");
        this.f287216a = productArticle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f287216a == ((v) obj2).f287216a;
    }

    public final int hashCode() {
        return this.f287216a.hashCode();
    }
}
