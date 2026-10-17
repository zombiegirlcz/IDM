package sx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k0 extends com.revolut.feature.card_design.impl.card_design.carousel.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266301a;

    public k0(String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f266301a = country;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f266301a, ((k0) obj2).f266301a);
    }

    public final int hashCode() {
        return this.f266301a.hashCode();
    }
}
