package fxc;

import com.revolut.domain.models.externalcards.AutoTopUpType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static a a(t61.g card, wi0.b country, boolean z) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(country, "country");
        if (card.f268141h) {
            return a.EXPIRED;
        }
        if (!card.o) {
            wi0.b.Companion.getClass();
            if (Intrinsics.f(country, wi0.b.f297770q3)) {
                return a.UNVERIFIED;
            }
        }
        return (z || card.f268147q != AutoTopUpType.UNAVAILABLE) ? a.AVAILABLE : a.UNAVAILABLE;
    }
}
