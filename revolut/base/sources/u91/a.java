package u91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f278339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f278340b;

    public a(j incentiveBanner, dj0.d incomeThreshold) {
        Intrinsics.checkNotNullParameter(incentiveBanner, "incentiveBanner");
        Intrinsics.checkNotNullParameter(incomeThreshold, "incomeThreshold");
        this.f278339a = incentiveBanner;
        this.f278340b = incomeThreshold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f278339a, aVar.f278339a) && Intrinsics.f(this.f278340b, aVar.f278340b);
    }

    public final int hashCode() {
        return this.f278340b.hashCode() + (this.f278339a.hashCode() * 31);
    }
}
