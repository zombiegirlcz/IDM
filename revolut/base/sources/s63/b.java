package s63;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f260106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f260107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardDetailsDesignConfig f260108c;
    public final AnimationRequest d;

    public b(f0 previousCard, f0 newCard, CardDetailsDesignConfig cardDetailsDesignConfig) {
        AnimationRequest animationRequest = new AnimationRequest(false);
        Intrinsics.checkNotNullParameter(previousCard, "previousCard");
        Intrinsics.checkNotNullParameter(newCard, "newCard");
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        this.f260106a = previousCard;
        this.f260107b = newCard;
        this.f260108c = cardDetailsDesignConfig;
        this.d = animationRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f260106a, bVar.f260106a) && Intrinsics.f(this.f260107b, bVar.f260107b) && Intrinsics.f(this.f260108c, bVar.f260108c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f260107b.hashCode() + (this.f260106a.hashCode() * 31)) * 31;
        CardDetailsDesignConfig cardDetailsDesignConfig = this.f260108c;
        return this.d.hashCode() + ((iHashCode + (cardDetailsDesignConfig == null ? 0 : cardDetailsDesignConfig.hashCode())) * 31);
    }
}
