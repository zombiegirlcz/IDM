package hdg;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.travel.hotels.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        String str;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        i iVar = domainState.f151429a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_price_breakdown_taxes_and_fees, null, null, 14);
        int i = R$string.hotels_price_breakdown_info_taxes_and_fees;
        int i2 = R$string.hotels_checkout_terms_title;
        fgi.b bVar = (fgi.b) iVar.f224257a;
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.hotels_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), f0.f322471a, new lw0.a(textLocalisedClause, new TextLocalisedClause(i, u.c(new TextLocalisedClause(i2, null, (bVar == null || (str = bVar.f135078g) == null) ? null : new Click(28, (Integer) null, (Object) str, "PROVIDER_TERMS_AND_CONDITIONS_ID", false), 10)), null, 12), null, null, false, 28));
    }
}
