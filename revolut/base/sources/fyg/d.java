package fyg;

import kotlin.jvm.internal.Intrinsics;
import wxg.m;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f138989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f138990b;

    public d(m asset, dj0.d amount) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f138989a = asset;
        this.f138990b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f138989a, dVar.f138989a) && Intrinsics.f(this.f138990b, dVar.f138990b);
    }

    @Override // fyg.e
    public final dj0.d f() {
        return this.f138990b;
    }

    public final int hashCode() {
        return this.f138990b.hashCode() + (this.f138989a.hashCode() * 31);
    }
}
