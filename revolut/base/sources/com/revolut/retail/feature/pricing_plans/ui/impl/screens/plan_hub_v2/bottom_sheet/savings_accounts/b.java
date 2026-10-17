package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import gla.k;
import gmk.f;
import gmk.i;
import gmk.l;
import iob.c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f103549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f103550b;

    public b(c savingsAccountMapper) {
        Intrinsics.checkNotNullParameter(savingsAccountMapper, "savingsAccountMapper");
        this.f103549a = savingsAccountMapper;
        this.f103550b = w.y0(new k(11));
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        SavingsProduct savingsProduct;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f144879b, new gk7.a(this, 27), new gcc.c(this, 25), new fyg.b(this, domainState, 18));
        List list2 = (List) domainState.f144879b.getContent();
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) d0.d0(list2);
        SavingsProductData savingsProductData = savingsAccountDetails != null ? savingsAccountDetails.f86462c : null;
        String str = (savingsProductData == null || (savingsProduct = savingsProductData.f86683a) == null) ? null : savingsProduct.f86627q;
        if (str == null) {
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i2 = l.f144886a[domainState.f144878a.ordinal()];
        if (i2 == 1) {
            i = R$string.plan_hub_sheet_savings_accounts_savings_button_open_account;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.plan_hub_sheet_savings_accounts_mmf_button_open_account;
        }
        return new i(textClause, new TextLocalisedClause(i, null, null, 14), list);
    }
}
