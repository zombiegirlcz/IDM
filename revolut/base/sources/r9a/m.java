package r9a;

import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f252557a;

    public m(o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f252557a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "<this>");
        dj0.d dVar = domainState.f252545b;
        dj0.d dVar2 = domainState.f252546c;
        long j2 = dVar.f115082a;
        boolean z = j2 > 0 && j2 >= dVar2.f115082a;
        dj0.d dVar3 = domainState.f252544a;
        dj0.d.Companion.getClass();
        List listL = v.l(!Intrinsics.f(dVar3, dj0.d.e) ? new TextNavBarMenuItem("REMOVE_MENU_ITEM_LIST_ID", new TextLocalisedClause(R$string.pix_authorisation_request_transaction_limit_cta_button_remove, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, null, 12) : null);
        Intrinsics.checkNotNullParameter(domainState, "<this>");
        long j3 = dVar.f115082a;
        return new h(u.c(new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, new bw0.h(this.f252557a.e(dVar), o.b(new u80.g(domainState.f252545b, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), true, null, Boolean.TRUE, false, false, false, false, null, 6100), null, (j3 <= 0 || j3 >= dVar2.f115082a) ? null : new bw0.m(new TextLocalisedClause(R$string.pix_authorisation_request_transaction_limit_minimum_amount, u.c(new MoneyClause(domainState.f252546c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.ERROR, null, false, null, 28), null, null, false, false, null, null, 2026)), z, listL);
    }
}
