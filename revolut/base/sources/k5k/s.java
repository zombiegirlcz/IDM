package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nrf.d f181550a;

    public s(nrf.d transferQuoteBreakdownItem) {
        Intrinsics.checkNotNullParameter(transferQuoteBreakdownItem, "transferQuoteBreakdownItem");
        this.f181550a = transferQuoteBreakdownItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f181550a, ((s) obj2).f181550a);
    }

    public final int hashCode() {
        return this.f181550a.hashCode();
    }
}
