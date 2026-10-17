package j3i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f171202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f171203b;

    public l(Float f, Float f4) {
        this.f171202a = f;
        this.f171203b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f171202a, lVar.f171202a) && Intrinsics.f(this.f171203b, lVar.f171203b);
    }

    public final int hashCode() {
        Float f = this.f171202a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f4 = this.f171203b;
        return iHashCode + (f4 != null ? f4.hashCode() : 0);
    }
}
