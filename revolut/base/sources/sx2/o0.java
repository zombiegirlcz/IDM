package sx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 extends com.revolut.feature.card_design.impl.card_design.carousel.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266321a;

    public o0(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f266321a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o0) && Intrinsics.f(this.f266321a, ((o0) obj2).f266321a);
    }

    public final int hashCode() {
        return this.f266321a.hashCode();
    }
}
