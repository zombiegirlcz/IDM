package a2f;

import a2g.t;
import a5e.m;
import ab4.u;
import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import aw0.r2;
import aw0.y4;
import b4b.g0;
import b6i.s0;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.delegates.fh;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.hh;
import com.revolut.core.ui_kit.delegates.ih;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.kg;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.rf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.x4;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.feature.insurance_car.impl.R$plurals;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValue;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueBottomSheet;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueCta;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueRow;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueRowContent;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueSection;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanCardFees;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.mappers.CobrandedCardsCardFeesItemMapper;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandOption;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferenceOption;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferencesResponse;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance.ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutInstrument;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreenContract$AssetDraft;
import com.revolut.feature.transaction.recogniser.api.domain.models.RecogniserTransaction;
import com.revolut.feature_move_money.impl.amount.MoveMoneyAmountScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.revolut.sso.api.models.RevolutAccountSession;
import d9.e1;
import dx4.t0;
import ip0.ak0;
import ip0.ck0;
import ip0.ej;
import ip0.ji;
import ip0.jl0;
import ip0.l0;
import ip0.qd0;
import ip0.qe0;
import ip0.vd0;
import ip0.we0;
import ip0.yj0;
import ip0.yt;
import ip0.z;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jel.b0;
import jel.g2;
import jel.j0;
import jel.n0;
import jel.o0;
import jel.v2;
import jel.x1;
import k4l.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import m1c.r1;
import ms0.h4;
import ms0.j4;
import mx0.b6;
import mx0.c7;
import mx0.v5;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.cbeff.ISO781611;
import tof.a3;
import tx0.k0;
import whf.j;
import z0h.k1;
import z0h.m1;
import z0h.n1;
import z0h.p1;
import z0h.t1;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f830b;

    public /* synthetic */ q(int i, cli.j jVar, cli.n nVar) {
        this.f829a = i;
        this.f830b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025f A[PHI: r7
      0x025f: PHI (r7v6 ??) = (r7v5 ??), (r7v37 ??), (r7v43 ??) binds: [B:74:0x01ff, B:79:0x021a, B:99:0x025b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [a7g.x, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.revolut.core.ui_kit.internal.views.tag.TagViewData] */
    /* JADX WARN: Type inference failed for: r3v10, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v3, types: [aim.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.revolut.core.ui_kit.internal.views.tag.TagViewData] */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2f.q.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r25v6 */
    private final Object b(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        boolean z;
        Iterable iterableG;
        u uVar = (u) this.f830b;
        wu3.h content = (wu3.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        String str = content.f300060a;
        List list = content.e;
        TextLocalisedClause textLocalisedClauseA = u.a(str);
        TextClause textClause = new TextClause(content.f300061b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        wu3.c cVar = content.f300063g;
        if (cVar instanceof wu3.b) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_application_e_signature_documents_button, zhm.u.c(((wu3.b) cVar).f300054a), null, 12);
        } else {
            if (!(cVar instanceof wu3.a)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.credit_application_e_signature_documents_buttonText, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        List<t0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            for (t0 t0Var : list2) {
                if (t0Var.f120772c && !t0Var.d) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        ?? r152 = 0;
        int i = 12;
        n6 n6Var = new n6(textLocalisedClause2, defaultFilledButton, null, null, !z, null, null, 988);
        String str2 = content.f;
        aw0.e eVar = new aw0.e(false, str2 != null ? new TextLocalisedClause(R$string.credit_application_e_signature_documents_footer, zhm.u.c(str2), null, 12) : null, null, n6Var, null, null, 53);
        List<wu3.g> list3 = content.f300062c;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (wu3.g gVar : list3) {
            String str3 = gVar.f300057a;
            GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_document, r152, r152, 6);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_e_signature_documents_document_title, zhm.u.c(new TextClause(gVar.f300057a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), r152, i);
            String str4 = gVar.f300058b;
            arrayList.add(new RowDelegate.Model(str3, glyphImage, null, null, textLocalisedClause3, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r152, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, false, null, null, null, null, null, gVar, null, 0, 0, 0, 0, 1056962412));
            i = 12;
            r152 = 0;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        List list4 = content.d;
        if (list4 != null) {
            List<String> list5 = list4;
            ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
            for (String str5 : list5) {
                arrayList2.add(new ListCellDelegate.Model(j6.a.q("id_cell_", str5), new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), yt.TOP), null, new HtmlClause(0, 30, (Integer) null, (Object) null, str5), false, null, null, 0, 0, 0, 0, 4068));
            }
            iterableG = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("ID_SUB_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_application_e_signature_documents_notes_subtitle, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        } else {
            iterableG = f0.f322471a;
        }
        ArrayList arrayListE0 = d0.E0(iterableG, arrayList);
        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(mx4.r.a(uVar.f2890a, (t0) it8.next(), null, 0, 0, 14));
        }
        return new ab4.o(d0.E0(w.u(arrayList3), arrayListE0), textLocalisedClauseA, textClause, eVar);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        adf.b bVar = (adf.b) this.f830b;
        adf.c content = (adf.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.trading_asset_quotes.impl.R$string.trading_asset_quotes_total_exchange_fees_title, null, null, 14), null, null, null, false, 30);
        Clause clause = bVar.f3329c;
        List list = content.f3331b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        int i = 0;
        while (it8.hasNext()) {
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            adf.d dVar = (adf.d) next;
            String strN = a0.d.n("fee.breakdown.", i);
            int i3 = com.revolut.feature.trading_asset_quotes.impl.R$string.trading_asset_quotes_exchange_fees_breakdown_direction_format;
            OrderQuote orderQuote = dVar.f3332a;
            OrderQuote orderQuote2 = dVar.f3332a;
            xi0.b bVar2 = e1.l(orderQuote).f104718b.f104721c;
            CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
            int i5 = 0;
            arrayList.add(new CellDetailsActionDelegate.Model(strN, new TextLocalisedClause(i3, v.k(new CurrencyClause(bVar2, ticker, null, 4), new CurrencyClause(e1.u(orderQuote2).f104718b.f104721c, ticker, null, 4)), null, 12), i5, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(l4i.a.b(dVar.f3333b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, false, null, null, orderQuote2, 0, 0, 0, 0, 4192228));
            it8 = it8;
            i = i2;
        }
        CellDetailsDelegate.Model model = content.f3331b.size() > 1 ? new CellDetailsDelegate.Model("fee.breakdown.total", new TextLocalisedClause(com.revolut.feature.trading_asset_quotes.impl.R$string.trading_asset_quotes_exchange_fees_breakdown_total, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new MoneyClause(l4i.a.b(content.f3330a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(arrayList);
        if (model != null) {
            eVarB.add(model);
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        ej ejVar = clause != null ? new ej("disclosure", new c7(clause, false, null, 6)) : null;
        aim.e eVarB2 = zhm.u.b();
        eVarB2.addAll(eVarA);
        if (ejVar != null && !eVarB2.isEmpty()) {
            int iJ = v.j(eVarB2);
            qv0.n nVar = (qv0.n) eVarB2.get(v.j(eVarB2));
            yp0.b.c(nVar, R$attr.uikit_dp0);
            eVarB2.set(iJ, nVar);
            int i6 = R$attr.uikit_dp0;
            yp0.b.r(ejVar, i6, i6, 0, 0, 12);
            eVarB2.add(ejVar);
        }
        aim.e eVarA2 = zhm.u.a(eVarB2);
        yp0.b.b(R$attr.uikit_dp24, eVarA2);
        return new cii.b(null, eVarA2, aVar);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        o0 o0Var;
        Boolean bool;
        o0 o0Var2;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        agh.k kVar = (agh.k) this.f830b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        b0 b0Var = (b0) pair.f186385a;
        k4l.c cVar = ((e0) pair.f186386b).f180960m;
        RowDelegate.Model modelA = null;
        RowDelegate.Model modelA2 = (cVar == null || (bigDecimal4 = cVar.f180952c) == null) ? null : agh.k.a(kVar, "FUND_FEES_INFO_CUSTODY_FEE_CELL_ITEM", com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_performance_details_dialog_fees_row_custody_fee_title, com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_performance_details_dialog_fees_row_custody_fee_description, bigDecimal4, null, 16);
        n0 n0Var = b0Var.f;
        j0 j0Var = b0Var.f173415h;
        RowDelegate.Model modelA3 = (n0Var == null || (bigDecimal3 = n0Var.d) == null) ? null : agh.k.a(kVar, "FUND_FEES_INFO_MANAGEMENT_FEE_CELL_ITEM", com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_performance_details_dialog_fees_row_management_fee_title, com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_performance_details_dialog_fees_row_management_fee_description, bigDecimal3, null, 16);
        n0 n0Var2 = b0Var.f;
        RowDelegate.Model modelA4 = (n0Var2 == null || (bigDecimal2 = n0Var2.e) == null) ? null : agh.k.a(kVar, "FUND_FEES_INFO_PERFORMANCE_FEE_CELL_ITEM", com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_performance_details_dialog_fees_row_carried_interest_title, com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_performance_details_dialog_fees_row_carried_interest_description, bigDecimal2, null, 16);
        RowDelegate.Model modelA5 = (j0Var == null || (o0Var2 = j0Var.f173482a) == null || (bigDecimal = o0Var2.f173525a) == null) ? null : agh.k.a(kVar, "FUND_FEES_INFO_HURDLE_RATE_CELL_ITEM", com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_performance_details_dialog_fees_row_hurdle_rate_title, com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_performance_details_dialog_fees_row_hurdle_rate_description, bigDecimal, null, 16);
        if (j0Var != null && (o0Var = j0Var.f173482a) != null && (bool = o0Var.f173526b) != null) {
            modelA = agh.k.a(kVar, "FUND_FEES_INFO_HIGH_WATER_MARK_CELL_ITEM", com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_performance_details_dialog_fees_row_high_water_mark_title, com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_performance_details_dialog_fees_row_high_water_mark_description, null, Integer.valueOf(bool.booleanValue() ? com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_key_details_high_water_mark_positive : com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_key_details_high_water_mark_negative), 8);
        }
        RowDelegate.Model[] elements = {modelA2, modelA3, modelA4, modelA5, modelA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        aig.r rVar = (aig.r) this.f830b;
        List transactionsList = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionsList, "transactionsList");
        List list = transactionsList;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((pyb.s) rVar.f5275a).e(((r1) it8.next()).f201449a, new TimeClause.Format.Pretty(q0.DATETIME)));
        }
        return d0.E0(!transactionsList.isEmpty() ? zhm.u.c(new LargeActionButtonDelegate.Model("TRANSACTIONS_SEE_ALL_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), false, null, null, null, null, 1000)) : f0.f322471a, arrayList);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        alb.m mVar = (alb.m) this.f830b;
        alb.d content = (alb.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        CounterTextDelegate.Model.Companion aVar = CounterTextDelegate.Model.INSTANCE;
        x4 x4Var = new x4(new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_calculator_body_title, null, null, 14));
        CompositeClause compositeClause = new CompositeClause(v.k(new MoneyClause(content.d, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13), null, null, 12), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_calculator_body_yearly_frequency_suffix, null, null, 14)), null, null, null, 14);
        SavingsProduct.InterestRate interestRate = content.f6174c;
        List list = content.f6173b;
        Long l2 = (Long) d0.e0(content.f6172a, list);
        CounterTextDelegate.Model modelA = CounterTextDelegate.Model.Companion.a(aVar, "CALCULATOR_COUNTER_TEXT_DELEGATE_ID", x4Var, compositeClause, new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_calculator_body_explanation, v.k(new MoneyClause(new dj0.d(l2 != null ? l2.longValue() : 0L, content.d.f115083b), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), pbd.a.f(mVar.f6185a, (SavingsProduct.InterestRate.RateTier) d0.b0(interestRate.f86644a), interestRate)), null, 12), null, null, 0, 0, 4080);
        yp0.b.r(modelA, R$attr.uikit_dp24, R$attr.uikit_dp0, 0, 0, 12);
        int iJ = v.j(list);
        InputSliderDelegate.Model model = new InputSliderDelegate.Model("CALCULATOR_SLIDER_ID", iJ < 0 ? 0 : iJ, content.f6172a, null, false, null, R$attr.uikit_dp16, R$attr.uikit_dp8, 32656);
        int i = R$attr.uikit_dp0;
        yp0.b.r(model, i, i, 0, 0, 12);
        return new alb.g(v.k(modelA, model), alb.m.a(alb.l.f6184a[interestRate.f86645b.f86647a.ordinal()] == 1 ? new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_calculator_footer_disclaimer_no_tax, null, null, 14) : new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_calculator_footer_disclaimer, null, null, 14)));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        anh.p pVar = (anh.p) this.f830b;
        anh.h state = (anh.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.f(state, anh.e.f7785a)) {
            return f0.f322471a;
        }
        if (Intrinsics.f(state, anh.f.f7786a)) {
            return yp0.b.g(zhm.u.c(new FullScreenStateDelegate.Model("blocked-recommended-buys-list-id", null, null, new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_lock, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190)), new l6(12, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_recommended_buys_widget_locked_title, null, null, 14), null, h4.SEMIACCENT), null, false, anh.c.f7783a, null, null, 1766)), new ListSubheaderDelegate.Model("recommended-buys-header-list-id", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_recommended_buys_widget_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        if (!(state instanceof anh.g)) {
            throw new NoWhenBranchMatchedException();
        }
        List<enh.a> list = ((anh.g) state).f7787a;
        ArrayList arrayList = new ArrayList();
        for (enh.a aVar : list) {
            mi7.e eVar = pVar.f7795a;
            vel.f fVar = aVar.f127830a;
            Object obj5 = aVar.f127831b;
            RowDelegate.Model modelA = eVar.a(new qi7.h(fVar, obj5 instanceof qi7.g ? (qi7.g) obj5 : null), oh7.a.DEFAULT);
            if (modelA != null) {
                arrayList.add(modelA);
            }
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        boolean z = false;
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("recommended-buys-header-list-id", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_recommended_buys_widget_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_home_widget_subheader_action_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z, z, true, 3), false, false, (Object) anh.d.f7784a, (Parcelable) null, 0, 0, 0, 0, 64426), null, 0, 0, 126);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        anl.j jVar = (anl.j) this.f830b;
        List accountsWithUserInfo = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(accountsWithUserInfo, "accountsWithUserInfo");
        List list = accountsWithUserInfo;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(((tll.r) ((tll.p) jVar.f7820b)).f(i, (RevolutAccountSession) obj5));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        ap7.d dVar = (ap7.d) this.f830b;
        do3.n user = (do3.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        aim.e eVarB = zhm.u.b();
        List list = dVar.f8102a;
        boolean z = false;
        CircleBadgeModel circleBadgeModel = null;
        if (list.isEmpty()) {
            Integer numA = zl7.c.a(user);
            if ((numA != null ? numA.intValue() : 0) >= 40) {
                eVarB.add(new RowDelegate.Model("ADD_ITEM_NUDGE_ID", new RowDelegate.Model.MainImage.Image56(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d261", null, null, null, 30), circleBadgeModel, z, 14), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_additional_drivers_list_add_for_better_quote_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            }
        }
        List<AdditionalDriver> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (AdditionalDriver additionalDriver : list2) {
            LocalDate localDate = additionalDriver.d;
            AdditionalDriver.Relationship relationship = additionalDriver.e;
            Intrinsics.checkNotNullParameter(localDate, "<this>");
            int years = Period.between(localDate, LocalDate.now()).getYears();
            String str = additionalDriver.f75161a;
            if (str == null) {
                str = additionalDriver.f75162b + "_" + additionalDriver.f75163c + "_" + additionalDriver.d + "_" + relationship;
            }
            TextClause textClause = new TextClause(additionalDriver.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Object[] elements = {xl7.b.a(relationship), new TextLocalisedQuantityClause(R$plurals.car_insurance_additional_drivers_list_years_old, Integer.valueOf(years), zhm.u.c(Integer.valueOf(years)), (Style) null, 24)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, additionalDriver.a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), null, null, false, null, false, 62), textClause, null, 0, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, additionalDriver, null, 0, 0, 0, 0, 532676568));
        }
        a0.x(arrayList, eVarB);
        if (list.size() < 4) {
            eVarB.add(new RowDelegate.Model("ADD_ITEM_ID", xl7.n.k(R$drawable.uikit_icn_24_plus, false, null, 15), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_additional_drivers_list_add_driver, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        wpa.f fVarA;
        TextLocalisedClause textLocalisedClause3;
        String str;
        arf.d dVar = (arf.d) this.f830b;
        a3 transaction = (a3) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        hpf.a aVar = dVar.f8694b;
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_IMAGE", null, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D310", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31716);
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ID_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        int[] iArr = arf.g.f8698a;
        int i = iArr[aVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_section_item_guarantee_subtitle, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_section_item_guarantee_subtitle_card, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause4 = textLocalisedClause;
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_section_item_duration_subtitle, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_section_item_duration_subtitle_card, null, null, 14);
        }
        boolean z = false;
        int i3 = 6;
        RowDelegate.Model model3 = new RowDelegate.Model("ID_ITEM_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_16_warning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i3), new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_section_item_guarantee_title, null, null, 14), null, 0, textLocalisedClause4, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        int i5 = com.revolut.feature.transfer.core.R$string.transfer_recall_section_item_duration_title;
        Intrinsics.checkNotNullParameter(transaction, "<this>");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        tof.q qVar = transaction.f272597k0;
        if (qVar == null || (str = qVar.e) == null) {
            fVarA = null;
        } else {
            wpa.f.Companion.getClass();
            fVarA = wpa.b.a(str);
        }
        List listK = v.k(model3, new RowDelegate.Model("ID_ITEM_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i3), new TextLocalisedClause(i5, zhm.u.c(Integer.valueOf(Intrinsics.f(fVarA, wpa.e.f299211a) ? 13 : 40)), null, 12), null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        aim.e eVarB = zhm.u.b();
        eVarB.add(model);
        eVarB.add(model2);
        eVarB.addAll(listK);
        aim.e eVarA = zhm.u.a(eVarB);
        int i6 = iArr[dVar.f8694b.ordinal()];
        if (i6 == 1) {
            textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_header_description, null, null, 14);
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_header_description_card, null, null, 14);
        }
        return new arf.e(textLocalisedClause3, eVarA, true);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        aui.k kVar = (aui.k) this.f830b;
        bti.b airportsList = (bti.b) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(airportsList, "airportsList");
        return kVar.f9837b.b(airportsList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x002b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r42, java.lang.Object r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2f.q.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        az7.g gVar = (az7.g) this.f830b;
        zw7.c viewModel = (zw7.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(viewModel, "content");
        bz7.b bVar = gVar.o;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("ADDRESS_NOT_SUPPORTED_NEW_ADDRESS_ITEM", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_address_not_supported_sections_address_title, null, null, 14), null, new TextClause(o51.a.b(viewModel.f325758a, ((s80.b) bVar.f19934a).b()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new Pair(viewModel, zhm.u.c(model));
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        b0c.e eVar = (b0c.e) this.f830b;
        zzb.k preferences = (zzb.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        if (preferences instanceof zzb.i) {
            ArrayList brands = ((zzb.i) preferences).f326652a.f84015b;
            Intrinsics.checkNotNullParameter(brands, "brands");
            mx0.l lVar = mx0.l.FLEXBOX;
            ArrayList arrayList = new ArrayList(w.t(brands, 10));
            int i = 0;
            for (Object obj5 : brands) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                RevPointsPersonalisationBrandOption revPointsPersonalisationBrandOption = (RevPointsPersonalisationBrandOption) obj5;
                arrayList.add(new ActionsView.Item(a0.d.n("PREFERENCE_ITEM_ID_PREFIX", i), revPointsPersonalisationBrandOption.d ? mx0.d.ACCENT : mx0.d.SEMIACCENT, true, null, null, new TextClause(revPointsPersonalisationBrandOption.f84012b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new UrlImage(revPointsPersonalisationBrandOption.f84013c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, null, false, null, null, new zzb.l(revPointsPersonalisationBrandOption.f84011a), null, 23448));
                i = i2;
            }
            return zhm.u.c(new z("PREFERENCES_ITEM_ID", arrayList, null, lVar, 0, 0, 116));
        }
        if (!(preferences instanceof zzb.j)) {
            throw new NoWhenBranchMatchedException();
        }
        RevPointsPersonalisationPreferencesResponse revPointsPersonalisationPreferencesResponse = ((zzb.j) preferences).f326653a;
        ArrayList preferences2 = revPointsPersonalisationPreferencesResponse.f84020b;
        RevPointsTextWithLinks revPointsTextWithLinks = revPointsPersonalisationPreferencesResponse.f84021c;
        Intrinsics.checkNotNullParameter(preferences2, "preferences");
        ArrayList arrayList2 = new ArrayList(w.t(preferences2, 10));
        int i3 = 0;
        for (Object obj6 : preferences2) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            RevPointsPersonalisationPreferenceOption revPointsPersonalisationPreferenceOption = (RevPointsPersonalisationPreferenceOption) obj6;
            arrayList2.add(new b6(a0.d.n("PREFERENCE_ITEM_ID_PREFIX", i3), null, new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(revPointsPersonalisationPreferenceOption.f84018c, " ", revPointsPersonalisationPreferenceOption.f84017b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, revPointsPersonalisationPreferenceOption.d, new zzb.l(revPointsPersonalisationPreferenceOption.f84016a), 42));
            i3 = i5;
        }
        qv0.i[] elements = {new ji(0, 60, "PREFERENCES_ITEM_ID", arrayList2), revPointsTextWithLinks != null ? new ej("PREFERENCES_FOOTER_ITEM_ID", new c7(eVar.f11647a.a(revPointsTextWithLinks), false, null, 6)) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        String str;
        b28.a aVar = (b28.a) this.f830b;
        t1 content = (t1) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Object obj5 = content.f318564b == hel.b.GB ? k1.f318523a : m1.f318535a;
        PlainTextDelegate.Model[] elements = {(!aVar.f11922b || (str = content.f318563a.v) == null || kotlin.text.d0.W(str)) ? null : new PlainTextDelegate.Model("ADVANCED_INFO_REVOLUT_SUGGESTION", (UrlImage) null, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_revolut_suggestion_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_revolut_suggestion_description, zhm.u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_research_disclosure, null, new Click(28, (Integer) null, (Object) new n1(str), "ADVANCED_INFO_RESEARCH_DISCLOSURE", false), 10)), null, 12), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746), new PlainTextDelegate.Model("ADVANCED_INFO_EXTERNAL_ANALYST_SUGGESTION", (UrlImage) null, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_external_analyst_suggestion_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_external_analyst_suggestion_description, zhm.u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_trading_disclosure, null, new Click(28, (Integer) null, obj5, "ADVANCED_INFO_DISCLOSURES", false), 10)), null, 12), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746), new PlainTextDelegate.Model("ADVANCED_INFO_EXTERNAL_ANALYST_TARGET_PRICE", (UrlImage) null, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_external_analyst_target_price_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_external_analyst_target_price_description, zhm.u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_trading_disclosure, null, new Click(28, (Integer) null, obj5, "ADVANCED_INFO_DISCLOSURES", false), 10)), null, 12), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        b42.d dVar = (b42.d) this.f830b;
        whf.p content = (whf.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.f297646a.isEmpty()) {
            List listC = zhm.u.c(new TextDelegate.Model("ID_EMPTY_PLACEHOLDER", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_recipient_details_transactions_empty, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(d0.V0(((anf.w) dVar.f12157a).c(content, new whf.l(0), j.a.f297643a), 3));
        if (content.f297646a.size() >= 3) {
            eVarB.add(new LargeActionButtonDelegate.Model("LIST_ID_TRANSACTIONS_SEE_ALL", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_transactions_action_see_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), false, null, null, null, null, 1000));
        }
        return zhm.u.a(eVarB);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        b47.e eVar = (b47.e) this.f830b;
        b47.f taxProfileData = (b47.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(taxProfileData, "taxProfileData");
        od0.i iVar = taxProfileData.f12191a;
        Boolean bool = eVar.f12189b;
        if (!iVar.d() || bool == null) {
            return b47.j.a();
        }
        TextLocalisedClause textLocalisedClauseA = t07.b.a(((FreelancerTaxProfile) iVar.c()).f73475b, taxProfileData.f12192b);
        if (textLocalisedClauseA == null) {
            return b47.j.a();
        }
        LargeActionButtonDelegate.Model model = null;
        boolean z = false;
        RowDelegate.Model model2 = new RowDelegate.Model("LIST_ID_TAX_REMINDER_TOGGLE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bell, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), textLocalisedClauseA, null, 0, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_reminder_item_subtitle, null, null, 14), null, null, 0, new vf(bool.booleanValue(), true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("LIST_ID_TAX_REMINDER_CONTINUE", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_reminder_action_update, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model3, 0, 0, 0, 0, 15);
        if (eVar.f12190c) {
            LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("LIST_ID_TAX_REMINDER_SETTINGS", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_reminder_action_update_tax_dates, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model4, 0, 0, 0, 0, 15);
            model = model4;
        }
        Object[] elements = {model2, model3, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        List listA;
        g0 g0Var = (g0) this.f830b;
        e0 limits = (e0) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(limits, "limits");
        Float f = limits.f180959l;
        if (f != null) {
            listA = ((m3b.j) g0Var.f).a(new BigDecimal(String.valueOf(f.floatValue())));
        } else {
            listA = null;
        }
        return listA == null ? f0.f322471a : listA;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    private final Object t(Object obj2, Object obj3, Object obj4) {
        xi0.b bVar;
        MoveMoneyAmountScreen moveMoneyAmountScreen = (MoveMoneyAmountScreen) this.f830b;
        com.revolut.core.ui_kit.delegates.v model = (com.revolut.core.ui_kit.delegates.v) obj2;
        l0 fieldPosition = (l0) obj3;
        nx0.a field = (nx0.a) obj4;
        KProperty[] kPropertyArr = MoveMoneyAmountScreen.W;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fieldPosition, "fieldPosition");
        Intrinsics.checkNotNullParameter(field, "field");
        int i = s0.f12824a[fieldPosition.ordinal()];
        if (i == 1) {
            bVar = model.f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = model.f54839g;
        }
        xi0.b bVar2 = bVar;
        MaskedTextInputEditText editText = field.getEditText();
        qd0.b bVarN = ((u7i.f) moveMoneyAmountScreen.T.getValue()).f277786b.f277824c.n();
        vc.s.j(bVarN);
        return new zp0.d(editText, bVar2, new u80.d(((s80.b) bVarN).b()), null, new a61.a(fieldPosition, moveMoneyAmountScreen, 3), false, false, 0, false, null, 1928);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23, types: [aw0.e] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r17v6, types: [com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r35v10 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v9, types: [com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model$a] */
    /* JADX WARN: Type inference failed for: r4v41, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v29, types: [com.revolut.core.ui_kit.models.TextClause] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [com.revolut.core.ui_kit.models.TextClause] */
    /* JADX WARN: Type inference failed for: r7v37 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
        int i;
        TextClause textClause;
        CompositeClause compositeClause;
        Map map;
        InstrumentTicker instrumentTicker;
        int i2;
        ?? eVar;
        Object compositeClause2;
        ?? bVar;
        SplitColumnCellDelegate.Model.a fhVar;
        ?? arrayList;
        int i3 = this.f829a;
        int i5 = 30;
        int i6 = 12;
        int i21 = 0;
        Throwable th10 = null;
        boolean z = true;
        int i22 = 10;
        Object obj5 = this.f830b;
        switch (i3) {
            case 0:
                f fVar = (f) obj5;
                u2f.d agent = (u2f.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(agent, "agent");
                String str = fVar.f810b;
                e eVar2 = fVar.f811c;
                u2f.h hVar = agent.f276624m;
                int i32 = r.f831a[hVar.f276643j.ordinal()];
                if (i32 == 1) {
                    i = 2;
                } else {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 1;
                }
                List listC = zhm.u.c(new InputTextDelegate.Model("MEMBERSHIP_NUMBER_INPUT_ITEM_ID", null, new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.miles_account_registration_section_membership_title, null, null, 14), null, false, eVar2 != null ? new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.miles_account_registration_section_membership_footer, zhm.u.c(new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(eVar2.f807a, " ", eVar2.f808b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, null, null, null, null, null, false, null, null, false, false, i, 6, null, false, true, null, true, ehe.n.w(20), false, false, false, null, null, 0, -1684013190, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                if (hVar.f.length() > 0) {
                    textClause = null;
                    List listK = v.k(new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.miles_account_registration_sign_up_prompt_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.miles_account_registration_sign_up_prompt_link_placeholder, null, new Click(30, (Integer) null, (Object) null, "SIGN_UP_ITEM_ID", false), 10));
                    m70.a.t(kotlin.jvm.internal.t0.f186434a);
                    compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                } else {
                    textClause = null;
                    compositeClause = null;
                }
                boolean z3 = !kotlin.text.d0.W(str);
                String str2 = agent.f276619c;
                return new i(listC, compositeClause, new TextClause(hVar.f276640c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), hVar.e, z3, str2 != null ? new TextClause(str2, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : textClause);
            case 1:
                t tVar = (t) obj5;
                x3g.h reviews = (x3g.h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(reviews, "reviews");
                List list = reviews.d;
                int i33 = reviews.f302749b;
                if (list.isEmpty()) {
                    return f0.f322471a;
                }
                boolean z4 = list.size() < i33;
                Clause[] elements = {new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_details_reviews_header_title, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), w3g.f.a(reviews.f302750c), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("(", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedQuantityClause(com.revolut.feature.travel.experiences.api.R$plurals.experiences_common_reviews, Integer.valueOf(i33), zhm.u.c(new NumberClause(i33, (NumberClause.Format.Compact) null, (Custom) null, 6)), (Style) null, 24), new TextClause(")", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("RATING_REVIEW_TITLE_ITEM_ID", (Image) null, (Clause) new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), (ResourceImage) null, false, false, (Clause) (z4 ? new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_common_action_see_all, null, null, 14) : null), z4, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
                List listV0 = d0.V0(list, 3);
                ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
                Iterator it8 = listV0.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(tVar.d.a((x3g.c) it8.next(), null));
                }
                hg hgVar = new hg("RATING_REVIEW_ITEM_SCROLLER_ID", arrayList2, 1, new y4(new aw0.d0(343, 222)), null, new gg.c(0), true, false, null, null, 0, 0, 0, 0, 32656);
                int i43 = R$attr.uikit_dp0;
                yp0.b.r(hgVar, 0, 0, i43, i43, 3);
                return v.k(model, hgVar);
            case 2:
                a5e.e content = (a5e.e) obj2;
                ((Boolean) obj3).getClass();
                m.a aVar = a5e.m.Companion;
                Intrinsics.checkNotNullParameter(content, "content");
                Data data = ((a5e.f) obj5).f1367b;
                List list2 = content.f1365c;
                a5e.d dVar = content.d;
                if (list2.isEmpty() || dVar == null) {
                    return f0.f322471a;
                }
                aim.e eVarB = zhm.u.b();
                if (list2.size() > 1) {
                    List<a5e.d> list3 = list2;
                    ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                    for (a5e.d dVar2 : list3) {
                        String strName = dVar2.name();
                        int i59 = a5e.n.f1377a[dVar2.ordinal()];
                        if (i59 == 1) {
                            i2 = com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_instrument_details_overview_screen_thesis_widget_assets_segment;
                        } else {
                            if (i59 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_instrument_details_overview_screen_thesis_widget_key_drivers_segment;
                        }
                        arrayList3.add(new FixedTabs.Item(strName, new TextLocalisedClause(i2, null, null, 14), (AnalyticsContext) null, 12));
                    }
                    eVarB.add(new FixedTabsDelegate.Model("underlying_assets_tabs", arrayList3, dVar.name(), false, null, SyslogConstants.LOG_CLOCK));
                }
                int i66 = a5e.n.f1377a[dVar.ordinal()];
                if (i66 == 1) {
                    for (v2 v2Var : content.f1363a) {
                        String str3 = v2Var.f173579a;
                        String str4 = v2Var.f173579a;
                        String strQ = j6.a.q("asset_", str3);
                        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new InstrumentImage(str4, 30, null, null), null, null, false, null, false, 62);
                        TextClause textClause2 = new TextClause(v2Var.f173580b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str5 = v2Var.f173581c;
                        TextClause textClause3 = str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                        dj0.d dVar3 = (data == null || (map = (Map) data.getContent()) == null || (instrumentTicker = (InstrumentTicker) map.get(str4)) == null) ? null : instrumentTicker.e;
                        g2 g2Var = v2Var.d;
                        dj0.d dVar4 = g2Var != null ? g2Var.f173451a : null;
                        eVarB.add(new RowDelegate.Model(strQ, image40, textClause2, null, 0, textClause3, (dVar3 == null || dVar4 == null || !Intrinsics.f(dVar3.f115083b, dVar4.f115083b)) ? null : v1.c.f(v.k(xqi.a.c(jb3.l.t(new BigDecimal(dVar4.f115082a), new BigDecimal(dVar3.f115082a)), false, false, false, false, false, CertificateBody.profileType), new TextLocalisedClause(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_instrument_details_overview_screen_thesis_widget_average_target_price, null, null, 14)), null), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870808));
                    }
                } else {
                    if (i66 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i74 = 0;
                    for (Object obj6 : content.f1364b) {
                        int i92 = i74 + 1;
                        if (i74 < 0) {
                            v.s();
                            throw null;
                        }
                        x1 x1Var = (x1) obj6;
                        String strN = a0.d.n("key_driver_", i74);
                        boolean z6 = false;
                        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_gift, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z6, z6, 6);
                        TextClause textClause4 = new TextClause(x1Var.f173602a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str6 = x1Var.f173603b;
                        eVarB.add(new RowDelegate.Model(strN, image24, textClause4, null, 0, str6 != null ? new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
                        i74 = i92;
                    }
                }
                aim.e eVarA = zhm.u.a(eVarB);
                yp0.e0 e0Var = yp0.e0.OUTSIDE_BOX;
                int i96 = R$attr.uikit_dp8;
                int i99 = R$attr.uikit_dp16;
                return !eVarA.isEmpty() ? yp0.b.d(eVarA, a5e.m.f1376a, e0Var, i96, i96, i99, i99) : eVarA;
            case 3:
                CobrandedCardsPlanAdditionalValue planAdditionalValue = (CobrandedCardsPlanAdditionalValue) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(planAdditionalValue, "planAdditionalValue");
                TextClause textClause5 = new TextClause(planAdditionalValue.f82311a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                a7b.b bVar2 = (a7b.b) ((a3e.u) obj5).f1129b;
                Intrinsics.checkNotNullParameter(planAdditionalValue, "planAdditionalValue");
                aim.e eVarB2 = zhm.u.b();
                String str7 = planAdditionalValue.f82312b;
                if (str7 != null) {
                    eVarB2.add(new we0("list_id_additional_value_card_image", new qe0(-2, new UrlImage(str7, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286))));
                }
                Iterator it9 = planAdditionalValue.d.iterator();
                int i100 = 0;
                while (it9.hasNext()) {
                    Object next = it9.next();
                    int i101 = i100 + 1;
                    if (i100 < 0) {
                        Throwable th11 = th10;
                        v.s();
                        throw th11;
                    }
                    CobrandedCardsPlanAdditionalValueSection cobrandedCardsPlanAdditionalValueSection = (CobrandedCardsPlanAdditionalValueSection) next;
                    Throwable th12 = th10;
                    c7b.a aVar2 = bVar2.f1813a;
                    ArrayList arrayList4 = cobrandedCardsPlanAdditionalValueSection.f82329c;
                    ArrayList arrayList5 = new ArrayList(w.t(arrayList4, i22));
                    Iterator it10 = arrayList4.iterator();
                    int i102 = 0;
                    while (it10.hasNext()) {
                        Object next2 = it10.next();
                        int i103 = i102 + 1;
                        if (i102 < 0) {
                            v.s();
                            throw th12;
                        }
                        Iterator it11 = it10;
                        CobrandedCardsPlanAdditionalValueRow cobrandedCardsPlanAdditionalValueRow = (CobrandedCardsPlanAdditionalValueRow) next2;
                        Iterator it12 = it9;
                        String strG = a0.d.g(i100, i102, "list_id_additional_value_section_", "_row_");
                        TextClause textClause6 = new TextClause(cobrandedCardsPlanAdditionalValueRow.f82321a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        CobrandedCardsPlanAdditionalValueRowContent cobrandedCardsPlanAdditionalValueRowContent = cobrandedCardsPlanAdditionalValueRow.f82322b;
                        if (cobrandedCardsPlanAdditionalValueRowContent instanceof CobrandedCardsPlanAdditionalValueRowContent.Text) {
                            fhVar = new ih(new TextClause(((CobrandedCardsPlanAdditionalValueRowContent.Text) cobrandedCardsPlanAdditionalValueRowContent).f82326a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        } else if (cobrandedCardsPlanAdditionalValueRowContent instanceof CobrandedCardsPlanAdditionalValueRowContent.Icon) {
                            fhVar = new hh(aVar2.c(((CobrandedCardsPlanAdditionalValueRowContent.Icon) cobrandedCardsPlanAdditionalValueRowContent).f82323a));
                        } else {
                            if (!(cobrandedCardsPlanAdditionalValueRowContent instanceof CobrandedCardsPlanAdditionalValueRowContent.Link)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fhVar = new fh(new TextClause(((CobrandedCardsPlanAdditionalValueRowContent.Link) cobrandedCardsPlanAdditionalValueRowContent).f82324a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new ResourceImage(R$drawable.uikit_icn_24_link_external, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246));
                        }
                        arrayList5.add(new SplitColumnCellDelegate.Model(strG, textClause6, fhVar, null, false, false, null, false, false, cobrandedCardsPlanAdditionalValueRowContent instanceof CobrandedCardsPlanAdditionalValueRowContent.Link ? (CobrandedCardsPlanAdditionalValueRowContent.Link) cobrandedCardsPlanAdditionalValueRowContent : th12, 516088));
                        it10 = it11;
                        it9 = it12;
                        i102 = i103;
                    }
                    Iterator it13 = it9;
                    String strL = j6.a.l(i100, "list_id_additional_value_section_", "_subheader");
                    ResourceImage resourceImageC = aVar2.c(cobrandedCardsPlanAdditionalValueSection.f82327a);
                    TextClause textClause7 = new TextClause(cobrandedCardsPlanAdditionalValueSection.f82328b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    ?? resourceImage = cobrandedCardsPlanAdditionalValueSection.d != null ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : th12;
                    CobrandedCardsPlanAdditionalValueBottomSheet cobrandedCardsPlanAdditionalValueBottomSheet = cobrandedCardsPlanAdditionalValueSection.d;
                    if (cobrandedCardsPlanAdditionalValueBottomSheet != null) {
                        boolean z11 = false;
                        bVar = new ListSubheaderDelegate.Model.a.b(true, z11, z11, 6);
                    } else {
                        bVar = th12;
                    }
                    eVarB2.addAll(yp0.b.g(arrayList5, new ListSubheaderDelegate.Model(strL, (Image) resourceImageC, (Clause) textClause7, (Image) resourceImage, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) bVar, false, false, (Object) cobrandedCardsPlanAdditionalValueBottomSheet, (Parcelable) null, 0, 0, 0, 0, 64432), null, 0, 0, 126));
                    it9 = it13;
                    i100 = i101;
                    th10 = th12;
                    i22 = 10;
                }
                ?? r172 = th10;
                aim.e eVarA2 = zhm.u.a(eVarB2);
                Intrinsics.checkNotNullParameter(planAdditionalValue, "planAdditionalValue");
                CobrandedCardsPlanAdditionalValueCta cobrandedCardsPlanAdditionalValueCta = planAdditionalValue.f82313c;
                if (cobrandedCardsPlanAdditionalValueCta == null) {
                    eVar = r172;
                } else {
                    aim.e eVarB3 = zhm.u.b();
                    ParameterisedHyperText parameterisedHyperText = planAdditionalValue.e;
                    if (parameterisedHyperText != null) {
                        eVarB3.add(bVar2.f1814b.a(parameterisedHyperText));
                    }
                    Iterable<CobrandedCardsPlanCardFees> iterable = planAdditionalValue.f;
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    for (CobrandedCardsPlanCardFees cardFees : iterable) {
                        Intrinsics.checkNotNullParameter(cardFees, "cardFees");
                        String str8 = cardFees.f82330a;
                        String str9 = cardFees.f82331b;
                        if (kotlin.text.d0.J(str8, str9, false)) {
                            String strZ0 = kotlin.text.d0.z0(str8, str9, str8);
                            ?? r192 = strZ0.length() > 0 ? strZ0 : r172;
                            ?? textClause8 = r192 != 0 ? new TextClause((String) r192, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r172;
                            CobrandedCardsCardFeesItemMapper.CardFeesClickData cardFeesClickData = new CobrandedCardsCardFeesItemMapper.CardFeesClickData(cardFees.f82332c);
                            ?? r56 = textClause8;
                            TextClause textClause9 = new TextClause(str9, (Style) new Click(28, (Integer) null, (Object) cardFeesClickData, str9, false), (Integer) null, false, (o9) null, (List) null, 124);
                            String strV0 = kotlin.text.d0.v0(str8, str9, "");
                            ?? r193 = strV0.length() > 0 ? strV0 : r172;
                            TextClause[] elements2 = {r56, textClause9, r193 != 0 ? new TextClause((String) r193, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r172};
                            Intrinsics.checkNotNullParameter(elements2, "elements");
                            compositeClause2 = new CompositeClause(kotlin.collections.d.L(elements2), null, null, null, 14);
                        } else {
                            compositeClause2 = new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        }
                        eVarB3.add(compositeClause2);
                    }
                    aim.e eVarA3 = zhm.u.a(eVarB3);
                    n6 n6Var = new n6(new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_action_confirm_button_placeholder, zhm.u.c(cobrandedCardsPlanAdditionalValueCta.f82320a), r172, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020);
                    if (eVarA3.isEmpty()) {
                        eVarA3 = null;
                    }
                    eVar = new aw0.e(true, eVarA3 != null ? yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), eVarA3) : null, ox0.b0.BELOW_BUTTONS, n6Var, null, null, 48);
                }
                return new a7b.q(textClause5, eVarA2, eVar);
            case 4:
                return a(obj2, obj3, obj4);
            case 5:
                a92.a aVar3 = (a92.a) obj5;
                List content2 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                List list4 = content2;
                ArrayList arrayList6 = new ArrayList(w.t(list4, 10));
                Iterator it14 = list4.iterator();
                while (it14.hasNext()) {
                    arrayList6.add(c92.d.a((MultibancoWithdrawalCode) it14.next(), aVar3.f2297b));
                }
                yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
                aim.e eVarB4 = zhm.u.b();
                eVarB4.add(new z("ID_ACTIONS", zhm.u.c(new ActionsView.Item("ID_ACTION_GENERATE", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_list_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)), null, mx0.l.NON_SCROLLABLE, 0, 0, 116));
                eVarB4.addAll(arrayList6);
                return new a92.b(zhm.u.a(eVarB4));
            case 6:
                p1 p1Var = (p1) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(p1Var, "<destruct>");
                return ((aah.m) obj5).c(p1Var.f318546a, p1Var.f318547b);
            case 7:
                return b(obj2, obj3, obj4);
            case 8:
                List instruments = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                Map map2 = ((abf.i) obj5).f2953b;
                List<TransferOutInstrument> list5 = instruments;
                ArrayList arrayList7 = new ArrayList(w.t(list5, 10));
                for (TransferOutInstrument transferOutInstrument : list5) {
                    Intrinsics.checkNotNullParameter(transferOutInstrument, "<this>");
                    BigDecimal bigDecimal = transferOutInstrument.e;
                    String str10 = transferOutInstrument.f91514a;
                    int iIntValue = bigDecimal.intValue();
                    TransferOutAssetSelectionScreenContract$AssetDraft transferOutAssetSelectionScreenContract$AssetDraft = (TransferOutAssetSelectionScreenContract$AssetDraft) map2.get(str10);
                    if (transferOutAssetSelectionScreenContract$AssetDraft == null) {
                        transferOutAssetSelectionScreenContract$AssetDraft = new TransferOutAssetSelectionScreenContract$AssetDraft(Integer.valueOf(iIntValue), false);
                    }
                    boolean z12 = iIntValue > 0 ? z : false;
                    String strQ2 = j6.a.q("TRANSFER_OUT_ASSET_SELECTION_QUANTITY_", str10);
                    TextClause textClause10 = new TextClause(transferOutInstrument.f91515b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    int i104 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_asset_available;
                    String strValueOf = String.valueOf(iIntValue);
                    String upperCase = transferOutInstrument.f91516c.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i104, v.k(strValueOf, upperCase), null, i6);
                    arrayList7.add(new SelectableDelegate.Model(j6.a.q("TRANSFER_OUT_ASSET_SELECTION_ASSET_", str10), new RowDelegate.Model(strQ2, new RowDelegate.Model.MainImage.Image40(new InstrumentImage(str10, i5, null, null), null, null, false, null, false, 62), textClause10, null, 0, textLocalisedClause, null, null, 0, new rf(transferOutAssetSelectionScreenContract$AssetDraft.f91637a != null ? Long.valueOf(r3.intValue()) : null, null, null, false, z12, new TextClause("0", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 12), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), transferOutAssetSelectionScreenContract$AssetDraft.f91638b ? qd0.SELECTED : qd0.UNSELECTED, z12 ? SelectableDelegate.b.c.f53320a : new SelectableDelegate.b.a(false), vd0.CHECKBOX, false, null, new abf.h(str10), kg.SMALL, z12, 30944));
                    i5 = 30;
                    i6 = 12;
                    z = true;
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                return arrayList7;
            case 9:
                return c(obj2, obj3, obj4);
            case 10:
                af4.v vVar = (af4.v) obj5;
                zy3.b configuration = (zy3.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new af4.q(vVar.d.b(configuration.f326363b, new ax4.b(0)), vVar.f3884b.a(configuration.f326362a, R$string.credit_application_mortgage_valuation_v2_summary_title), vVar.f3885c.a(configuration.f326364c, true));
            case 11:
                aff.k kVar = (aff.k) obj5;
                gef.b content3 = (gef.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = content3.f143284c;
                if (arrayList9.isEmpty()) {
                    FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("MERCHANT_DETAILS_LOADED_NO_PRIOR_RECORDS", new TextLocalisedClause(com.revolut.feature.transaction.recogniser.impl.R$string.transaction_recogniser_merchant_history_screen_no_record_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.transaction.recogniser.impl.R$string.transaction_recogniser_merchant_history_screen_no_record_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    arrayList8.add(model2);
                } else {
                    ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                    Iterator it15 = arrayList9.iterator();
                    while (it15.hasNext()) {
                        arrayList10.add(((dff.b) kVar.f4042a).b((RecogniserTransaction) it15.next(), false));
                    }
                    yp0.b.k(arrayList10, 0, 0, 0, 0, 31);
                    arrayList8.addAll(arrayList10);
                }
                return arrayList8;
            case 12:
                return d(obj2, obj3, obj4);
            case 13:
                return e(obj2, obj3, obj4);
            case 14:
                bjh.a aVar4 = (bjh.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(aVar4, "<destruct>");
                return ((r10.d) ((ac4.g) obj5).f3031b).j0(aVar4.f15671a, aVar4.f15672b, aVar4.f15673c, new aik.d(i22));
            case 15:
                return g(obj2, obj3, obj4);
            case 16:
                return h(obj2, obj3, obj4);
            case 17:
                return i(obj2, obj3, obj4);
            case 18:
                return j(obj2, obj3, obj4);
            case 19:
                return k(obj2, obj3, obj4);
            case 20:
                return l(obj2, obj3, obj4);
            case 21:
                return m(obj2, obj3, obj4);
            case 22:
                return n(obj2, obj3, obj4);
            case 23:
                return o(obj2, obj3, obj4);
            case 24:
                return p(obj2, obj3, obj4);
            case 25:
                return q(obj2, obj3, obj4);
            case 26:
                return r(obj2, obj3, obj4);
            case 27:
                return s(obj2, obj3, obj4);
            case 28:
                return t(obj2, obj3, obj4);
            default:
                b7f.g gVar = (b7f.g) obj5;
                RiskMetrics content4 = (RiskMetrics) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("ManagedPortfolioPerformanceExtensionMapper_list_subheader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_performance_widget_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                List listC2 = zhm.u.c(new HeaderDelegate.Model("ManagedPortfolioPerformanceExtensionMapper_header", null, new r2(new PercentageClause(e1.Z(content4.f85037m), (PercentageClause.Format) null, (Style) null, 6), null), null, new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_template_details_performance_widget_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, null, null, k0.LARGE, null, 97240));
                ToDoItemDelegate.Companion aVar5 = ToDoItemDelegate.INSTANCE;
                List list6 = content4.f85043t;
                if (list6 != null) {
                    List list7 = list6;
                    arrayList = new ArrayList(w.t(list7, 10));
                    for (Object obj7 : list7) {
                        int i105 = i21 + 1;
                        if (i21 < 0) {
                            v.s();
                            throw null;
                        }
                        RiskMetrics.RiskOverviewItem riskOverviewItem = (RiskMetrics.RiskOverviewItem) obj7;
                        arrayList.add(new jl0(a0.d.n("ManagedPortfolioPerformanceExtensionMapper_", i21), new ResourceImage(gVar.f13037a.a(kotlin.text.d0.e0(riskOverviewItem.f85049a, "icn_")), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50_70), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(riskOverviewItem.f85050b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50_70), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)));
                        i21 = i105;
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                aVar5.getClass();
                ToDoItemDelegate.Companion.a(arrayList);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.managed_portfolios_template_details_performance_widget_action, null, null, 14);
                h4 h4Var = h4.SEMIACCENT;
                int i106 = R$attr.uikit_dp16;
                return yp0.b.g(d0.F0(new TextDelegate.Model("ManagedPortfolioPerformanceExtensionMapper_disclaimer_footer", new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_insights_performance_subtitle, null, null, 14), false, new ak0(yj0.CENTER_HORIZONTAL, null, 2), null, null, 0, 0, 0, 0, 2036), d0.F0(new SmallActionButtonDelegate.Model("ManagedPortfolioPerformanceExtensionContract_explore", h4Var, null, null, textLocalisedClause2, null, j4.f208300a, ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights.f91336a, null, 0, 0, i106, i106, 7512), d0.E0((Iterable) arrayList, listC2))), model3, null, 0, 0, 126);
        }
    }

    public /* synthetic */ q(Object obj2, int i) {
        this.f829a = i;
        this.f830b = obj2;
    }

    public /* synthetic */ q(Object obj2, Object obj3, int i) {
        this.f829a = i;
        this.f830b = obj3;
    }
}
