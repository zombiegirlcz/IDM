package t63;

import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import h93.f0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f268173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardDetailsDesignConfig f268174b;

    public a(f0 card, CardDetailsDesignConfig cardDetailsDesignConfig) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f268173a = card;
        this.f268174b = cardDetailsDesignConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f268173a, aVar.f268173a) && Intrinsics.f(this.f268174b, aVar.f268174b);
    }

    public final int hashCode() {
        int iHashCode = this.f268173a.hashCode() * 31;
        CardDetailsDesignConfig cardDetailsDesignConfig = this.f268174b;
        return iHashCode + (cardDetailsDesignConfig == null ? 0 : cardDetailsDesignConfig.hashCode());
    }
}
