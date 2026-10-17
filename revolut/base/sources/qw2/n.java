package qw2;

import cli.o;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import h93.f0;
import ha3.x;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m93.a f249759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f249760b;

    public n(m93.a cardComponentItemMapper, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(cardComponentItemMapper, "cardComponentItemMapper");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f249759a = cardComponentItemMapper;
        this.f249760b = revolutCardsInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f0 f0Var = domainState.f249752a;
        String str = f0Var.f150110a;
        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) domainState.f249754c.getContent();
        o5l.g gVar = domainState.d;
        String str2 = domainState.f249752a.f150110a;
        h93.d dVar = new h93.d(str2, ((x) this.f249760b).o(str2));
        int i = R$attr.uikit_dp16;
        return new m(u.c(m93.a.a(this.f249759a, str, f0Var, cardDetailsDesignConfig, null, dVar, gVar, false, true, i, i, null, domainState.f249752a, null, null, null, 28672)));
    }
}
