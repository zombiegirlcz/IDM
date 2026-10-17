package vj9;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zh9.b1;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f289656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pair f289657b;

    public a(b1 promotion, Pair defaultFeeRate) {
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        Intrinsics.checkNotNullParameter(defaultFeeRate, "defaultFeeRate");
        this.f289656a = promotion;
        this.f289657b = defaultFeeRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f289656a, aVar.f289656a) && Intrinsics.f(this.f289657b, aVar.f289657b);
    }

    public final int hashCode() {
        return this.f289657b.hashCode() + (this.f289656a.hashCode() * 31);
    }
}
