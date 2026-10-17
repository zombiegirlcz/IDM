package t73;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s0 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268534a;

    public s0(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f268534a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f268534a, ((s0) obj2).f268534a);
    }

    public final int hashCode() {
        return this.f268534a.hashCode();
    }
}
