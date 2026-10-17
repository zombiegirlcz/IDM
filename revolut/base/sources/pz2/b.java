package pz2;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_management.impl.cardlimit.domain.CardLimitSetData;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements cli.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f240867a;

    public b(o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f240867a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CardLimitSetData cardLimitSetData = domainState.f240873a;
        String strE = this.f240867a.e(cardLimitSetData.f64823b);
        dj0.d dVar = cardLimitSetData.f64823b;
        return new i(u.c(new CenteredAmountDelegate.Model("SET_LIMIT_AMOUNT_LIST_ID", null, new bw0.h(strE, o.b(new u80.g(new dj0.d(0L, dVar.f115083b), u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, true, null, Boolean.TRUE, false, false, null, null, null, null, 32724), null, new bw0.m(new TextLocalisedClause(R.string.card_limit_month_spent, u.c(new MoneyClause(cardLimitSetData.f64824c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.INFO, null, false, null, 28), null, null, true, false, dVar.f115083b, null, 1386)), domainState.f240874b);
    }
}
