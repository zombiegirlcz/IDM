package sx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p0 extends com.revolut.feature.card_design.impl.card_design.carousel.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266323a;

    public p0(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f266323a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f266323a, ((p0) obj2).f266323a);
    }

    public final int hashCode() {
        return this.f266323a.hashCode();
    }
}
