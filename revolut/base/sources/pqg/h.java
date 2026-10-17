package pqg;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddMoneyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AddMoneyScreen addMoneyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addMoneyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarT2 = this.v.T2();
        bw0.m mVar = model.e;
        i0 i0Var = (i0) rVarT2;
        j60.a aVar2 = i0Var.D;
        m mVar2 = i0Var.B;
        ncd.c interestEstimation = ((o) i0Var.t2()).f238758p;
        if (interestEstimation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        SavingsProductData productData = ((o) i0Var.t2()).i;
        if (productData == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ((b) mVar2).getClass();
        Intrinsics.checkNotNullParameter(interestEstimation, "interestEstimation");
        Intrinsics.checkNotNullParameter(productData, "productData");
        dj0.d dVar = interestEstimation.f214173c;
        dj0.d dVar2 = interestEstimation.d;
        ProductGroup.BreakdownDisclaimer breakdownDisclaimer = productData.f86684b.d.f;
        rp0.t tVar = new rp0.t((breakdownDisclaimer == null || (str2 = breakdownDisclaimer.f86539a) == null) ? new TextLocalisedClause(R$string.savings_info_sheets_estimated_annual_interest_title, null, null, 14) : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (breakdownDisclaimer == null || (str = breakdownDisclaimer.f86540b) == null) ? new TextLocalisedClause(R$string.mmf_estimated_interest_sheet_subtitle_taxable, null, null, 14) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28);
        rp0.l lVar = rp0.l.WINDOW;
        aim.e eVarB = zhm.u.b();
        CellDetailsDelegate.Model[] elements = {new CellDetailsDelegate.Model("GROSS_INTEREST_ESTIMATION_LIST_ID", new TextLocalisedClause(R$string.savings_info_sheets_estimated_annual_interest_cells_gross_title, null, null, 14), new MoneyClause(interestEstimation.f214171a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), !dVar2.k() ? new CellDetailsDelegate.Model("TAX_ITEM_LIST_ID", new TextLocalisedClause(R$string.vaults_strongbox_explanation_withholding_tax_title, null, null, 14), new MoneyClause(dVar2.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520) : null, !dVar.k() ? new CellDetailsDelegate.Model("SERVICE_FEE_INTEREST_ITEM_LIST_ID", new TextLocalisedClause(com.revolut.feature.vaults.R$string.mmf_info_sheets_interest_rate_explanation_cells_service_fees, null, null, 14), new MoneyClause(dVar.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520) : null, new CellDetailsDelegate.Model("NET_INTEREST_ESTIMATION_LIST_ID", new TextLocalisedClause(R$string.savings_info_sheets_estimated_annual_interest_cells_net_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new MoneyClause(interestEstimation.f214172b, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, null, false, 0, null, null, j2.H6, null, 0, null, false, null, 0, 0, 0, 0, 1047528)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        eVarB.addAll(listL);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("INTEREST_ESTIMATION_DIALOG_CTA_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
        eVarB.add(model2);
        aVar2.x(new rp0.y(zhm.u.a(eVarB), tVar, lVar, null, null, null, 1016));
        return Unit.f186387a;
    }
}
