package yx2;

import cli.j;
import e93.j0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f317540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f317541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f317542c;

    public b(dj0.d originalPrice, j0 loyaltyQuote, List taxes) {
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(loyaltyQuote, "loyaltyQuote");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f317540a = originalPrice;
        this.f317541b = loyaltyQuote;
        this.f317542c = taxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f317540a, bVar.f317540a) && Intrinsics.f(this.f317541b, bVar.f317541b) && Intrinsics.f(this.f317542c, bVar.f317542c);
    }

    public final int hashCode() {
        return this.f317542c.hashCode() + ((this.f317541b.hashCode() + (this.f317540a.hashCode() * 31)) * 31);
    }
}
