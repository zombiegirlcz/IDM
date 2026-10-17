package sx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 extends com.revolut.feature.card_design.impl.card_design.carousel.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.e f266299a;

    public j0(e93.e cardDesign) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        this.f266299a = cardDesign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f266299a, ((j0) obj2).f266299a);
    }

    public final int hashCode() {
        return this.f266299a.hashCode();
    }
}
