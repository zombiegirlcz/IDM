package t73;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r0 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f268527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268528b;

    public r0(h93.f0 card, String str) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f268527a = card;
        this.f268528b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f268527a, r0Var.f268527a) && Intrinsics.f(this.f268528b, r0Var.f268528b);
    }

    public final int hashCode() {
        int iHashCode = this.f268527a.hashCode() * 31;
        String str = this.f268528b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
