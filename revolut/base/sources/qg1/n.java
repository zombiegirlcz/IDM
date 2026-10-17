package qg1;

import cli.o;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw2.a f245637a;

    public n(lw2.a cardComponentItemMapper) {
        Intrinsics.checkNotNullParameter(cardComponentItemMapper, "cardComponentItemMapper");
        this.f245637a = cardComponentItemMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SharedRevolutCardWrapper sharedRevolutCardWrapper = domainState.f245633a;
        String str = ((RetailCardWrapper) sharedRevolutCardWrapper).f64443a.f104693a;
        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) domainState.f245635c.getContent();
        o5l.g gVar = domainState.d;
        int i = R$attr.uikit_dp16;
        return new m(u.c(eg1.a.a(this.f245637a, str, sharedRevolutCardWrapper, cardDetailsDesignConfig, gVar, i, i, ((RetailCardWrapper) domainState.f245633a).f64443a)));
    }
}
