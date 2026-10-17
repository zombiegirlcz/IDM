package dmb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.kg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.R$string;
import dce.l0;
import ip0.qd0;
import ip0.vd0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f115898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tmb.b f115899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yik.h f115900c;

    public p(dcd.b savingsInterestRateFormatter, tmb.b productSelectionSubtitleMapper, tmb.a productSelectionDisclosureMapper, yik.h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(productSelectionSubtitleMapper, "productSelectionSubtitleMapper");
        Intrinsics.checkNotNullParameter(productSelectionDisclosureMapper, "productSelectionDisclosureMapper");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f115898a = savingsInterestRateFormatter;
        this.f115899b = productSelectionSubtitleMapper;
        this.f115900c = pricingPlanStringMapper;
    }

    public static j a(p pVar, boolean z, hha.d dVar, int i) {
        TextLocalisedClause textLocalisedClause;
        dj0.d dVarN;
        boolean z3 = (i & 1) != 0 ? false : z;
        hha.d dVar2 = (i & 2) != 0 ? null : dVar;
        boolean z4 = (i & 4) != 0;
        boolean z6 = z3 && dVar2 != null;
        if (z6) {
            int i2 = R$string.mmf_choose_a_currency_upsell_cta_button_title;
            Clause clauseA = fgk.b.a(pVar.f115900c, dVar2);
            Period periodA = pi3.b.a(hha.i.MONTHLY);
            if (periodA == null || (dVarN = cp5.c.n(dVar2, periodA)) == null) {
                dj0.d.Companion.getClass();
                dVarN = dj0.d.e;
            }
            textLocalisedClause = v04.b.Q(new TextLocalisedClause(i2, v.k(clauseA, new MoneyClause(dVarN, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), com.revolut.feature.retail.savings.api.R$string.savings_onboarding_product_upsell_discover);
        } else {
            if (z6) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_onboarding_product_upsell_continue, null, null, 14);
        }
        return new j(textLocalisedClause, z4, LargeActionButton.ButtonStyle.f58725a);
    }

    public final SelectableDelegate.Model b(hha.d dVar, SavingsProductData savingsProductData, boolean z, String str) {
        Clause textLocalisedClause = z ? new TextLocalisedClause(R$string.mmf_choose_a_currency_tab_title_your_plan, null, null, 14) : fgk.b.a(this.f115900c, dVar);
        Clause clauseG = this.f115898a.g(savingsProductData, true, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), false);
        String str2 = dVar.f152287a;
        return new SelectableDelegate.Model(str2, new RowDelegate.Model(str2, null, textLocalisedClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(clauseG, null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882), Intrinsics.f(dVar.f152287a, str) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, null, kg.SMALL, false, 32232);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f115880a, new l0(this, 28), new dgj.h(this, 10), new dbg.b(this, 4));
    }
}
