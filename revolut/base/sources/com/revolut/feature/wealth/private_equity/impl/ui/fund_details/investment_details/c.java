package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import egh.g;
import egh.h;
import egh.i;
import egh.l;
import egh.q;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f95825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ufl.b f95826b;

    public c(f wealthAccountHeaderUiMapper, ufl.b wealthHoldingsClauseFactory) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        this.f95825a = wealthAccountHeaderUiMapper;
        this.f95826b = wealthHoldingsClauseFactory;
    }

    public static n6 a() {
        return new n6(new TextLocalisedClause(R$string.wealth_private_equity_fund_details_action_invest, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, true, null, h.f125652a, 476);
    }

    public static n6 b(LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton) {
        return new n6(new TextLocalisedClause(R$string.wealth_private_equity_fund_details_action_redeem, null, null, 14), defaultFilledButton, null, null, true, null, i.f125653a, 476);
    }

    @Override // cli.n
    public final o c(j jVar) {
        a aVar;
        final g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f125650b;
        List list = null;
        if (data != null) {
            final int i = 1;
            aVar = (a) iii.c.f(data, new efb.i(10), new eed.a(9), new Function3(this) { // from class: egh.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.c f125662b;

                {
                    this.f125662b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0181  */
                @Override // kotlin.jvm.functions.Function3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
                    /*
                        Method dump skipped, instruction units count: 802
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: egh.p.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            });
        } else {
            aVar = null;
        }
        Data data2 = domainState.d;
        aw0.i iVar = data2 != null ? (aw0.i) iii.c.f(data2, new efb.i(8), new eed.a(7), new dob.a(this, 20)) : null;
        Data data3 = domainState.f125650b;
        if (data3 != null) {
            final int i2 = 0;
            list = (List) iii.c.f(data3, new efb.i(this, 9), new eed.a(8), new Function3(this) { // from class: egh.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.c f125662b;

                {
                    this.f125662b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0181  */
                @Override // kotlin.jvm.functions.Function3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
                    /*
                        Method dump skipped, instruction units count: 802
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: egh.p.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            });
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return new l(aVar, iVar, list);
    }
}
