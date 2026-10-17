package qg1;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen.CardSecurityPromptScreenContract$InputData;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends oki.h implements dli.b {
    public final CardSecurityPromptScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k7i.i f245628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f245629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mw2.g f245630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lw2.b f245631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mw2.f f245632t;
    public final y u;

    public k(cli.n stateMapper, CardSecurityPromptScreenContract$InputData inputData, k7i.i sharedCardsInteractor, b0 sharedCardsConfigInteractor, c90.c uiResources, mw2.g googlePayConfirmationNavigationProvider, lw2.b sharedCardNameMapper, mw2.f cardSecurityReplaceCardNavigationProvider) {
        o5l.g gVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedCardsInteractor, "sharedCardsInteractor");
        Intrinsics.checkNotNullParameter(sharedCardsConfigInteractor, "sharedCardsConfigInteractor");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(googlePayConfirmationNavigationProvider, "googlePayConfirmationNavigationProvider");
        Intrinsics.checkNotNullParameter(sharedCardNameMapper, "sharedCardNameMapper");
        Intrinsics.checkNotNullParameter(cardSecurityReplaceCardNavigationProvider, "cardSecurityReplaceCardNavigationProvider");
        this.o = inputData;
        this.f245628p = sharedCardsInteractor;
        this.f245629q = sharedCardsConfigInteractor;
        this.f245630r = googlePayConfirmationNavigationProvider;
        this.f245631s = sharedCardNameMapper;
        this.f245632t = cardSecurityReplaceCardNavigationProvider;
        SharedRevolutCardWrapper sharedRevolutCardWrapper = inputData.f60872a;
        boolean z = inputData.f60873b;
        Data data = new Data(null, null, true, 3, null);
        int i = e.f245622b[uiResources.a().ordinal()];
        if (i == 1) {
            gVar = o5l.g.MDPI;
        } else if (i == 2) {
            gVar = o5l.g.HDPI;
        } else if (i == 3) {
            gVar = o5l.g.XHDPI;
        } else if (i == 4) {
            gVar = o5l.g.XXHDPI;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = o5l.g.XXXHDPI;
        }
        this.u = mra.d.b(this, new l(sharedRevolutCardWrapper, z, data, gVar), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String cardCode = ((RetailCardWrapper) ((l) ((j2) this.u.f22677a).getValue()).f245633a).f64443a.f104695c;
        b0 b0Var = this.f245629q;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        yji.l.a1(this, rd0.e.b(((ha3.f) b0Var.f185144b).a(new b93.b(cardCode))), null, null, new qc3.c(this, null, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
