package qxd;

import aw0.o9;
import cli.n;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.standingordertopup.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f250085a;

    public m(o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f250085a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        CurrencyClause currencyClause;
        bw0.m mVar;
        bw0.m mVar2;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f250073a;
        dj0.d dVar2 = domainState.f250074b;
        boolean z = domainState.d;
        String string = o.b(new u80.g(dVar, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
        CurrencyClause currencyClause2 = new CurrencyClause(dVar.f115083b, CurrencyClause.Format.DisplayName.f57755a, null, 4);
        bw0.h hVar = new bw0.h(this.f250085a.d(dVar.f115082a, dVar.f115083b.f306286a), string, z, f0.f322471a, Boolean.TRUE, false, false, false, false, null, 8132);
        if (dVar2 != null) {
            if (z) {
                currencyClause = currencyClause2;
                mVar2 = null;
            } else {
                currencyClause = currencyClause2;
                mVar2 = new bw0.m(new TextLocalisedClause(R$string.top_up_recurring_top_up_custom_amount_min_amount, u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12), bw0.l.ERROR, null, false, null, 20);
            }
            mVar = mVar2;
        } else {
            currencyClause = currencyClause2;
            mVar = null;
        }
        List listC = u.c(new AmountEditDelegate.Model("AMOUNT_EDIT_TEXT_ID", currencyClause, false, hVar, mVar, null, dVar.f115083b, null, 384));
        yp0.b.q(listC, 0, 0, 0, 0, 15);
        return new h(listC, domainState.f250075c);
    }
}
