package o7b;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsAvailableRewards;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CobrandedCardsAvailableRewards cobrandedCardsAvailableRewards = (CobrandedCardsAvailableRewards) domainState.f222738a.getContent();
        return new g(cobrandedCardsAvailableRewards != null ? new TextLocalisedClause(R$string.cobrand_action_confirm_button_placeholder, u.c(cobrandedCardsAvailableRewards.f82291b), null, 12) : null, (List) iii.c.f(domainState.f222738a, new o3k.a(this, 13), new o4a.a(14), new nrd.i(this, domainState, 13)), cobrandedCardsAvailableRewards != null ? new lw0.a(new TextClause(cobrandedCardsAvailableRewards.f82290a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30) : null);
    }
}
