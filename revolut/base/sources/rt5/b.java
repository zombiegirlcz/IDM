package rt5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f257188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f257189b;

    public b(xi0.b currency, ej0.b price) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f257188a = currency;
        this.f257189b = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f257188a, bVar.f257188a) && Intrinsics.f(this.f257189b, bVar.f257189b);
    }

    public final int hashCode() {
        return this.f257189b.hashCode() + (this.f257188a.hashCode() * 31);
    }
}
