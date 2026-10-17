package rtl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f257324a;

    public i(xi0.b instrumentCurrency) {
        Intrinsics.checkNotNullParameter(instrumentCurrency, "instrumentCurrency");
        this.f257324a = instrumentCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f257324a, ((i) obj2).f257324a);
    }

    public final int hashCode() {
        return this.f257324a.hashCode();
    }
}
