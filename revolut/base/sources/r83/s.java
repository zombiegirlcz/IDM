package r83;

import android.content.Context;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_screen.api.navigation.CardsListFeatureConfig;
import com.revolut.feature.cards_core.R$string;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d73.u f252348a;

    public s(d73.u cardsScreenInteractor) {
        Intrinsics.checkNotNullParameter(cardsScreenInteractor, "cardsScreenInteractor");
        this.f252348a = cardsScreenInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CardsListFeatureConfig;
    }

    @Override // uri.a
    public final void c(sri.m navigator, Context context, FeatureConfig featureConfig) {
        CardsListFeatureConfig config = (CardsListFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof CardsListFeatureConfig.CardsList)) {
            throw new NoWhenBranchMatchedException();
        }
        n63.g gVar = ((CardsListFeatureConfig.CardsList) config).f65363a;
        if (gVar != null) {
            if (r.f252347a[gVar.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.f252348a.f.f("TOAST_TO_DISPLAY_ON_CARDS_LIST", new mii.k("cancel_order_toast", new TextLocalisedClause(R$string.card_cancel_order_success_toast, null, null, 14), null, null, f1.ABOVE_ANCHOR_VIEW, 12));
        }
        navigator.c(jbb.a.a(ibb.c.f160140a, null, dy0.o.LEFT, null, 10));
    }
}
