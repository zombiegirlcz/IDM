package ltk;

import com.revolut.retail.feature.stockdetails.api.navigation.StartNavigation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartNavigation.OrderFlow f199962b;

    public b(String ref2, StartNavigation.OrderFlow orderFlow) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f199961a = ref2;
        this.f199962b = orderFlow;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f199961a, bVar.f199961a) && Intrinsics.f(this.f199962b, bVar.f199962b);
    }

    public final int hashCode() {
        int iHashCode = this.f199961a.hashCode() * 31;
        StartNavigation.OrderFlow orderFlow = this.f199962b;
        return iHashCode + (orderFlow == null ? 0 : orderFlow.hashCode());
    }
}
