package ii4;

import au0.u0;
import aw0.o9;
import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.delegates.ChatTravelPreviewDelegate;
import com.revolut.core.ui_kit.delegates.ComponentDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.m1;
import com.revolut.core.ui_kit.delegates.s3;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionTimeframeFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.mosttraded.InstrumentsMostTradedCollectionKeyFilterValue;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.documents_redesigned.YearlyStatementsRequest;
import com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubModal;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanBottomSheetDeeplinkNavigation;
import e7l.g;
import gig.i;
import ip0.cc;
import ip0.gu;
import ip0.i1;
import ip0.p10;
import ip0.r3;
import ip0.s7;
import ip0.t10;
import ip0.wb;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lp.q1;
import mx0.y4;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f161512b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f161511a = i;
        this.f161512b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        List list;
        fo3.c cVar;
        int i = this.f161511a;
        ?? A = 0;
        Object obj2 = this.f161512b;
        switch (i) {
            case 0:
                com.revolut.feature.credit.application.plugins.impl.ui.spinner.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.spinner.a) obj2;
                n0 outputData = (n0) it8;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof m0) {
                    int i2 = 26;
                    aVar.l2(new i44.a(aVar, ((m0) outputData).f161539a, A, i2), new yi5.b(i2));
                } else {
                    if (!(outputData instanceof l0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l0 l0Var = (l0) outputData;
                    aVar.R2(l0Var.f161535b, l0Var.f161534a);
                }
                return Unit.f186387a;
            case 1:
                SpinnerConfiguration.Content.SpinnerContent spinnerContent = (SpinnerConfiguration.Content.SpinnerContent) obj2;
                ((k0) it8).getClass();
                Intrinsics.checkNotNullParameter(spinnerContent, "spinnerContent");
                return new k0(spinnerContent);
            case 2:
                List assetsTypeFilterValues = (List) it8;
                Intrinsics.checkNotNullParameter(assetsTypeFilterValues, "assetsTypeFilterValues");
                ph7.a aVar2 = new ph7.a(ph7.b.ASSETS_TYPE, assetsTypeFilterValues);
                ph7.b bVar = ph7.b.COLLECTION_KEY_FILTER;
                if (!Intrinsics.f((InstrumentsTrendCollectionId) obj2, InstrumentsTrendCollectionId.MostTraded.f74902a)) {
                    throw new IllegalStateException("Unexpected collection id");
                }
                ph7.a aVar3 = new ph7.a(bVar, InstrumentsMostTradedCollectionKeyFilterValue.a());
                ph7.b bVar2 = ph7.b.TIMEFRAME;
                InstrumentsTrendCollectionTimeframeFilterValue[] elements = {InstrumentsTrendCollectionTimeframeFilterValue.ONE_DAY, InstrumentsTrendCollectionTimeframeFilterValue.ONE_WEEK, InstrumentsTrendCollectionTimeframeFilterValue.ONE_MONTH, InstrumentsTrendCollectionTimeframeFilterValue.ONE_YEAR};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return zhm.v.k(aVar2, aVar3, new ph7.a(bVar2, kotlin.collections.d.L(elements)));
            case 3:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                String str = ((iig.i) obj2).f161616a.d;
                return str != null ? new gig.j(zhm.u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), null, null, null))) : i.a.f144194a;
            case 4:
                ij4.g update = (ij4.g) it8;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ij4.g.a(update, ((iy3.b) obj2).f, false, 5);
            case 5:
                ij4.j jVar = (ij4.j) obj2;
                Throwable it9 = (Throwable) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                jVar.H2(jVar.f161707p, new ab4.q(it9, 20));
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it9, h0Var);
                return Boolean.TRUE;
            case 6:
                zh9.a aVar4 = (zh9.a) it8;
                vi9.e0 e0Var = ((ij9.i) obj2).o;
                Intrinsics.h(aVar4);
                return e0Var.c(null, aVar4);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType = ((ijj.t) obj2).f161825a.f101107b;
                Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
                if (Intrinsics.f(cancellationType, EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Cancellation.f100697a)) {
                    List listC = zhm.u.c(new t10("ID_PHONE_NUMBER_TERMS_ITEM", p10.f165755a));
                    yp0.b.k(listC, R$attr.uikit_dp48, 0, 0, 0, 30);
                    list = listC;
                } else {
                    if (!Intrinsics.f(cancellationType, EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Withdrawal.f100698a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list = zhm.f0.f322471a;
                }
                List list2 = list;
                List listC2 = zhm.u.c(new gu("ID_CANCELLED_ALLOWANCES_SUBHEADER_ITEM", 0, 0, 30));
                int i3 = R$attr.uikit_dp24;
                int i5 = R$attr.uikit_dp0;
                yp0.b.o(i3, i5, i5, i5, listC2);
                List list3 = listC2;
                ArrayList arrayList = new ArrayList(3);
                for (int i6 = 0; i6 < 3; i6++) {
                    arrayList.add(new s7(a0.d.n("PREFIX_ID_ALLOWANCE_ITEM_", i6), 0, 0, 0, 0, false, null, 94));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return zhm.d0.E0(zhm.d0.E0(arrayList, list3), list2);
            case 8:
                ik3.c cVar2 = (ik3.c) obj2;
                mm0.o session = (mm0.o) it8;
                Intrinsics.checkNotNullParameter(session, "session");
                return session instanceof mm0.n ? mo3.a.n(((ik3.g) cVar2.f161878a).a(g.b.f123407a, false)).ignoreElements() : pfm.m.f235744a;
            case 9:
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return (fmg.p) ((img.d) obj2).f162447c.get("ADOPTION_JOURNEY_KEY");
            case 10:
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return (fmg.n0) ((img.g) obj2).d.get("USER_CHECKLIST_KEY");
            case 11:
                return imh.d.a((imh.d) it8, (vmh.g) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070);
            case 12:
                return imh.d.a((imh.d) it8, null, null, (lmh.e) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131067);
            case 13:
                return imh.d.a((imh.d) it8, null, null, null, (mmh.c) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063);
            case 14:
                PlanHubModal modal = (PlanHubModal) it8;
                Intrinsics.checkNotNullParameter(modal, "modal");
                ajk.c cVar3 = ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a) obj2).f;
                String url2 = modal.f102650b;
                Intrinsics.checkNotNullParameter(url2, "url");
                ajk.d dVar = cVar3.f5588a;
                Intrinsics.checkNotNullParameter(url2, "url");
                jf0.c cVarD = ((s06.c) dVar.f5589a).d(url2);
                PlanBottomSheetDeeplinkNavigation planBottomSheetDeeplinkNavigationA = cVarD == null ? null : dVar.a(cVarD);
                igk.d dVar2 = planBottomSheetDeeplinkNavigationA instanceof igk.d ? (igk.d) planBottomSheetDeeplinkNavigationA : null;
                PricingPlanBottomSheetDescriptor pricingPlanBottomSheetDescriptor = dVar2 != null ? dVar2.f161241a : null;
                PricingPlanBottomSheetDescriptor.BottomSheet bottomSheet = pricingPlanBottomSheetDescriptor instanceof PricingPlanBottomSheetDescriptor.BottomSheet ? (PricingPlanBottomSheetDescriptor.BottomSheet) pricingPlanBottomSheetDescriptor : null;
                if (bottomSheet != null) {
                    return new Pair(modal.f102649a, bottomSheet);
                }
                return null;
            case 15:
                um.a data = (um.a) it8;
                Intrinsics.checkNotNullParameter(data, "data");
                return ((um.b) obj2).a(data);
            case 16:
                fna.c config = (fna.c) it8;
                Intrinsics.checkNotNullParameter(config, "config");
                fna.i iVar = ((ina.n) obj2).f162734l;
                aim.e eVarB = zhm.u.b();
                RowDelegate.Model[] elements2 = {fna.i.c(iVar, "ID_CARD_CONFIRMATION", R$string.documents_item_card_confirmation, null, null, null, 60), fna.i.c(iVar, "ID_SUBJECT_ACCESS_REQUEST", R$string.documents_item_subject_access_request, null, null, null, 60)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL = kotlin.collections.d.L(elements2);
                if (config.f136567j) {
                    eVarB.addAll(yp0.b.g(listL, fna.i.a(R$string.documents_type_confirmations, "CONFIRMATIONS"), null, 0, 0, 126));
                    eVarB.addAll(yp0.b.i(fna.i.c(iVar, "ID_CONTRACT_SUMMARY", R$string.documents_item_electronic_banking_summary, null, null, null, 60), fna.i.a(R$string.documents_type_contract_summary, "CONTRACT_SUMMARY"), null, 0, 0, 126));
                } else {
                    yp0.b.k(listL, 0, 0, 0, 0, 31);
                    eVarB.addAll(listL);
                }
                return zhm.u.a(eVarB);
            case 17:
                ina.q qVar = (ina.q) obj2;
                List incomeTaxYears = (List) it8;
                Intrinsics.checkNotNullParameter(incomeTaxYears, "incomeTaxYears");
                if (incomeTaxYears.isEmpty()) {
                    fna.i iVar2 = qVar.f162742m;
                    TextLocalisedClause title = new TextLocalisedClause(R$string.statements_group_income_tax_statement_empty_state_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.statements_group_income_tax_statement_empty_state_subtitle, null, null, 14);
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter("NO_INCOME_TAX_YEAR_ID", "listId");
                    Intrinsics.checkNotNullParameter(title, "title");
                    List listC3 = zhm.u.c(new FullScreenStateDelegate.Model("NO_INCOME_TAX_YEAR_ID", title, textLocalisedClause, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_binoculars, null, null, 6)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736));
                    yp0.b.k(listC3, 0, 0, 0, 0, 31);
                    return listC3;
                }
                fna.i iVar3 = qVar.f162742m;
                List list4 = incomeTaxYears;
                Intrinsics.checkNotNullParameter(list4, "<this>");
                List listP0 = zhm.d0.P0(list4, cim.b.h());
                ArrayList arrayList2 = new ArrayList(zhm.w.t(listP0, 10));
                Iterator it10 = listP0.iterator();
                while (it10.hasNext()) {
                    int iIntValue = ((Number) it10.next()).intValue();
                    arrayList2.add(fna.i.d(iVar3, a0.d.n("INCOME_TAX_YEAR_ID_", iIntValue), new TextClause(String.valueOf(iIntValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new YearlyStatementsRequest(null, iIntValue), null, 52));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            case 18:
                ina.x xVar = (ina.x) obj2;
                List pockets = (List) it8;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                if (!pockets.isEmpty()) {
                    fna.i iVar4 = xVar.o;
                    aim.e eVarB2 = zhm.u.b();
                    zhm.a0.x(yp0.b.i(fna.i.c(iVar4, "ID_PRO_STATEMENTS", R$string.documents_item_account_statement, null, null, null, 60), fna.i.a(R$string.documents_type_statements, "ID_STATEMENTS_HEADER"), null, 0, 0, 126), eVarB2);
                    zhm.a0.x(yp0.b.i(fna.i.c(iVar4, "ID_PRO_ACCOUNT_CONFIRMATION", R$string.documents_item_account_confirmation, null, null, null, 60), fna.i.a(R$string.documents_type_confirmations, "ID_CONFIRMATIONS_HEADER"), null, 0, 0, 126), eVarB2);
                    A = zhm.u.a(eVarB2);
                }
                return A == 0 ? zhm.f0.f322471a : A;
            case 19:
                ina.e0 e0Var2 = (ina.e0) obj2;
                Pair pair = (Pair) it8;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                fna.a aVar5 = (fna.a) pair.f186385a;
                Pair pair2 = (Pair) zhm.d0.d0((List) pair.f186386b);
                if (pair2 == null || (cVar = (fo3.c) pair2.f186385a) == null) {
                    return zhm.f0.f322471a;
                }
                String id10 = cVar.f136801a;
                Intrinsics.checkNotNullParameter(id10, "id");
                fna.i iVar5 = e0Var2.f162716t;
                RowDelegate.Model modelC = fna.i.c(iVar5, "ID_TEEN_ACCOUNT_STATEMENT", R$string.documents_item_account_statement, null, new WalletId(id10), null, 52);
                if (!aVar5.f136561h) {
                    modelC = null;
                }
                RowDelegate.Model modelC2 = fna.i.c(iVar5, "ID_TEEN_STATEMENT_OF_FEES", R$string.documents_item_statement_of_fees, null, new WalletId(id10), null, 52);
                if (!aVar5.f136559c) {
                    modelC2 = null;
                }
                RowDelegate.Model[] elements3 = {modelC, modelC2};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                return zhm.d0.E0(fna.i.e(zhm.v.l(aVar5.f136560g ? fna.i.c(iVar5, "ID_TEEN_ACCOUNT_CONFIRMATION", R$string.documents_item_account_confirmation, null, new WalletId(id10), null, 52) : null), fna.i.a(R$string.documents_type_confirmations, "TEEN_CONFIRMATIONS_HEADER")), fna.i.e(kotlin.collections.d.L(elements3), fna.i.a(R$string.documents_type_statements, "TEEN_STATEMENTS_HEADER")));
            case 20:
                iog.f update2 = (iog.f) it8;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return iog.f.a(PersonalDetails.a(update2.f163318a, null, null, null, null, ((hog.c) obj2).f154286a, null, 95));
            case 21:
                iog.f update3 = (iog.f) it8;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return iog.f.a(PersonalDetails.a(update3.f163318a, (gog.b) obj2, null, null, null, null, null, ISO781611.SMT_TAG));
            case 22:
                q1 appDeclaration = (q1) it8;
                Intrinsics.checkNotNullParameter(appDeclaration, "appDeclaration");
                com.revolut.analytics.tracking.v3.d dVarF = appDeclaration.A5().f();
                return new jri.b(new i1d.b(appDeclaration, dVarF, 28), new a2.a(appDeclaration, 15, (lm.c) obj2, dVarF));
            case 23:
                Boolean focused = (Boolean) it8;
                Intrinsics.checkNotNullParameter(focused, "focused");
                return new com.revolut.core.ui_kit.delegates.x((AmountInputActionsDelegate.Model) obj2, focused.booleanValue());
            case 24:
                ts0.p0 it11 = (ts0.p0) it8;
                Intrinsics.checkNotNullParameter(it11, "it");
                int iG0 = zhm.d0.g0(it11.f273898a, ((i1) obj2).i.getItems());
                if (iG0 < 0) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar = od0.i.Companion;
                Integer numValueOf = Integer.valueOf(iG0);
                hVar.getClass();
                return od0.h.a(numValueOf);
            case 25:
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair((r3) obj2, it8);
            case 26:
                ActionsView.Item item = (ActionsView.Item) it8;
                Intrinsics.checkNotNullParameter(item, "item");
                return new m1((BigTileDelegate.Model) obj2, item);
            case 27:
                CellDetailsSingleButtonDelegate.Model model = (CellDetailsSingleButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return model;
            case 28:
                SmallActionButtonDelegate.Model it12 = (SmallActionButtonDelegate.Model) it8;
                int i21 = ChatTravelPreviewDelegate.f52077l;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new s3((ChatTravelPreviewDelegate.Model) obj2, it12);
            default:
                cc ccVar = (cc) obj2;
                y4 it13 = (y4) it8;
                ComponentDelegate.Companion aVar6 = ComponentDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new wb(it13, ccVar.f163710b, ccVar.f163709a);
        }
    }
}
