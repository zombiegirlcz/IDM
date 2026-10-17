package hk9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vj9.a f152898a;

    public y(vj9.a promotion) {
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        this.f152898a = promotion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f152898a, ((y) obj2).f152898a);
    }

    public final int hashCode() {
        return this.f152898a.hashCode();
    }
}
