package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.portfolio_updates;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import iii.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n87.r;
import nd8.i;
import ngh.d;
import ngh.g;
import ngh.j;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements n {

    @NotNull
    public static final j Companion = new j();

    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_venture_capital_portfolio_updates_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_venture_capital_portfolio_updates_description, null, null, 14);
        Data data = domainState.f215165a;
        if (data == null || (list = (List) c.f(data, new i(22), new r(27), new ngh.i(this, 0))) == null) {
            list = f0.f322471a;
        }
        return new g(textLocalisedClause, textLocalisedClause2, list);
    }
}
