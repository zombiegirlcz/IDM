package nj9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vj9.a f216433a;

    public q(vj9.a promotion) {
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        this.f216433a = promotion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f216433a, ((q) obj2).f216433a);
    }

    public final int hashCode() {
        return this.f216433a.hashCode();
    }
}
