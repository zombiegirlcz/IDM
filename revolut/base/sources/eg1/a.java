package eg1;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import com.revolut.shared.cards.model.SharedRevolutCard;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import h93.d;
import h93.f0;
import ha3.x;
import kotlin.jvm.internal.Intrinsics;
import o5l.g;

/* JADX INFO: loaded from: classes20.dex */
public interface a {
    static NewRevolutCardDelegate.Model a(lw2.a aVar, String listId, SharedRevolutCardWrapper cardWrapper, CardDetailsDesignConfig cardDetailsDesignConfig, g gVar, int i, int i2, SharedRevolutCard parcel) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        f0 f0Var = ((RetailCardWrapper) cardWrapper).f64444b;
        m93.a aVar2 = aVar.f200402a;
        String str = f0Var.f150110a;
        return m93.a.a(aVar2, listId, f0Var, cardDetailsDesignConfig, null, new d(str, ((x) aVar.f200403b).o(str)), gVar, false, true, i, i2, null, parcel, null, null, null, 8192);
    }
}
