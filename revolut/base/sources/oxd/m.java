package oxd;

import android.content.Context;
import at.r;
import aw0.k7;
import aw0.o9;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.domain.models.moneyrequest.MoneyRequestState;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureWorkflowConfiguration;
import com.revolut.feature.payments_migration.api.navigation.PaymentsMigrationDestination;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.a;
import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import com.revolut.feature.shared.branding.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreen;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import com.revolut.feature.transfer.models.withholding_tax.WithholdingTaxTreatmentConfiguration;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.ui_kit_pdf.viewer.PdfRendererException;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import ffk.t;
import hha.u;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import om4.t3;
import org.joda.time.DateTime;
import ox5.t0;
import pzk.b;
import skm.p0;
import zh9.u0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f230778b;

    public /* synthetic */ m(r rVar, oyi.b bVar) {
        this.f230777a = 7;
        this.f230778b = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v186, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v33 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 d0VarM;
        f0d.d dVar;
        ArrayList arrayList;
        z3l.a aVar;
        Iterator it8;
        wv9.c cVar;
        CompositeClause compositeClauseM;
        TextLocalisedClause textLocalisedClauseJ;
        ActionWidgetDelegate.Model.a jVar;
        com.revolut.core.ui_kit.delegates.p pVar;
        com.revolut.core.ui_kit.delegates.k kVar;
        p6k.d dVar2;
        TextClause textClause;
        LayeredImage layeredImage;
        ?? r152;
        ActionWidgetDelegate.Model.b pVar2;
        int i = this.f230777a;
        int i2 = 22;
        int i3 = 0;
        int i5 = 1;
        Object obj3 = this.f230778b;
        switch (i) {
            case 0:
                o oVar = (o) obj3;
                com.revolut.domain.models.topup.methods.b methods = (com.revolut.domain.models.topup.methods.b) obj2;
                Intrinsics.checkNotNullParameter(methods, "methods");
                List list = methods.f60525a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (com.revolut.domain.models.topup.methods.a.a((TopupMethod.StoredMethod) obj4, oVar.o.f88199b)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 1:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr = CvvScreen.S;
                Intrinsics.checkNotNullParameter(context, "context");
                ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(context, 2, 8);
                screenGridLayoutManager.setSpanSizeLookup(new oxe.c((CvvScreen) obj3, screenGridLayoutManager));
                return screenGridLayoutManager;
            case 2:
                return (oxe.g) obj3;
            case 3:
                oy6.f update = (oy6.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return oy6.f.a(update, (oy6.i) obj3, null, 5);
            case 4:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return zhm.d0.P0(zhm.d0.E0((List) hVar.d, zhm.d0.E0((List) hVar.f288435c, zhm.d0.E0((List) hVar.f288434b, (List) hVar.f288433a))), new k2j.d((hd.r) obj3, 27));
            case 5:
                oyb.e eVar = (oyb.e) obj3;
                String userCountry = (String) obj2;
                Intrinsics.checkNotNullParameter(userCountry, "userCountry");
                if (((jte.d) eVar.f230932b).c(RevPointsApi$Toggles.RevPointsCashbackRemovalTerms.f83463c)) {
                    t tVar = eVar.f230931a;
                    u.Companion.getClass();
                    u feature = u.v;
                    Intrinsics.checkNotNullParameter(feature, "feature");
                    d0 d0VarE = tVar.e();
                    ffk.l lVar = new ffk.l(i5, new ffk.m(feature, i3));
                    d0VarE.getClass();
                    ufm.i iVar = new ufm.i(d0VarE, lVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    d0VarM = iVar;
                } else {
                    d0VarM = d0.m(Boolean.FALSE);
                }
                ufm.i iVar2 = new ufm.i(d0VarM, new oy9.b(new t0(i2), 17), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return new ufm.i(iVar2, new oy9.b(new t3(userCountry, 14), 16), 1);
            case 6:
                return oyi.b.a((oyi.b) obj2, new Data((svi.u) obj3, null, false, 6, null));
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                s7 s7Var = new s7("LIST_ID_CELL_DETAILS_ITEM_REFUND_AMOUNT", 0, 0, 0, 0, true, null, 94);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var);
                pb0 pb0VarA = nb0.a(pb0.Companion, "LIST_ID_ROW_ITEM_VALIDITY", true, 4);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0VarA);
                return new cii.b(qyi.b.a(((oyi.b) obj3).f231040b), zhm.u.a(eVarB), r.b());
            case 8:
                oyl.f fVar = (oyl.f) obj3;
                PdfRendererException it9 = (PdfRendererException) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar2 = rd0.c.ERROR;
                String message = it9.getMessage();
                rd0.d.a(cVar2, null, message != null ? message : "", it9, h0Var);
                Function1 function1 = fVar.f231061b;
                if (function1 != null) {
                    function1.invoke(it9);
                }
                return Unit.f186387a;
            case 9:
                gzc.c cVar3 = (gzc.c) obj3;
                od0.i question = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(question, "question");
                od0.h hVar2 = od0.i.Companion;
                f0d.d dVar3 = (f0d.d) question.g();
                if (dVar3 != null) {
                    gzc.r question2 = dVar3.f131084a;
                    f0d.e level = dVar3.f131086c;
                    Intrinsics.checkNotNullParameter(question2, "question");
                    Intrinsics.checkNotNullParameter(level, "level");
                    dVar = new f0d.d(question2, cVar3, level);
                } else {
                    dVar = null;
                }
                hVar2.getClass();
                return od0.h.a(dVar);
            case 10:
                com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.a aVar2 = (com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.a) obj3;
                pzk.b outputData = (pzk.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!Intrinsics.f(outputData, b.a.f241011a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.I2();
                return Unit.f186387a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((p09.e) obj3).f231487c;
            case 12:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (Map) ((p15.b) obj3).f231874b.get("credit_help_country_config_key");
            case 13:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (ou3.g) ((p24.r) obj3).f232060b.get("credit-application-dashboard-key");
            case 14:
                com.revolut.feature.store.impl.ui.root.b bVar = (com.revolut.feature.store.impl.ui.root.b) obj3;
                hub.b result = (hub.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.f155599b) {
                    oki.h.t2(bVar, bVar.f88733q, bVar.o.f88722a, false, null, false, 12);
                } else {
                    bVar.B2();
                }
                return Unit.f186387a;
            case 15:
                p40.i update2 = (p40.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return p40.i.a(update2, null, (p40.k) obj3, null, null, false, 479);
            case 16:
                Intrinsics.checkNotNullParameter((dii.g) obj2, "it");
                ((p48.k) obj3).t2();
                return Unit.f186387a;
            case 17:
                xi0.b transferCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(transferCurrency, "transferCurrency");
                return nim.a.v(((p4f.f) obj3).f232926b.p(transferCurrency), new ou5.a(3, transferCurrency));
            case 18:
                Stack it10 = (Stack) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new Pair((p4i.b) obj3, it10);
            case 19:
                kq2.f bankTransferExchangeRate = (kq2.f) obj2;
                Intrinsics.checkNotNullParameter(bankTransferExchangeRate, "it");
                c8i.n nVar = ((p4k.g) obj3).f;
                Intrinsics.checkNotNullParameter(bankTransferExchangeRate, "bankTransferExchangeRate");
                if (!((o8b.c) nVar.f22210a).g()) {
                    return bankTransferExchangeRate;
                }
                double d = bankTransferExchangeRate.f188305g;
                xi0.b bVar2 = bankTransferExchangeRate.f188303b.f115083b;
                dj0.d exchangeFee = pyd.c.K(bankTransferExchangeRate.f188304c, d, bVar2);
                dj0.d dVar4 = bankTransferExchangeRate.d;
                dj0.d dVarK = dVar4 != null ? pyd.c.K(dVar4, d, bVar2) : null;
                dj0.d dVar5 = bankTransferExchangeRate.e;
                dj0.d dVarK2 = dVar5 != null ? pyd.c.K(dVar5, d, bVar2) : null;
                dj0.d totalFee = pyd.c.K(bankTransferExchangeRate.f, d, bVar2);
                kq2.d dVar6 = bankTransferExchangeRate.i;
                kq2.d dVarA = dVar6 != null ? c8i.n.a(dVar6, d, bVar2) : null;
                kq2.d dVar7 = bankTransferExchangeRate.f188307j;
                kq2.d dVarA2 = dVar7 != null ? c8i.n.a(dVar7, d, bVar2) : null;
                kq2.d dVar8 = bankTransferExchangeRate.k;
                kq2.d dVarA3 = dVar8 != null ? c8i.n.a(dVar8, d, bVar2) : null;
                kq2.d dVar9 = bankTransferExchangeRate.f188308l;
                kq2.d dVarA4 = dVar9 != null ? c8i.n.a(dVar9, d, bVar2) : null;
                List list2 = bankTransferExchangeRate.f188309m;
                if (list2 != null) {
                    List<kq2.e> list3 = list2;
                    ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                    for (kq2.e eVar2 : list3) {
                        dj0.d fee2 = pyd.c.K(eVar2.f188301b, d, bVar2);
                        kq2.c chargeBearer = eVar2.f188300a;
                        Intrinsics.checkNotNullParameter(chargeBearer, "chargeBearer");
                        Intrinsics.checkNotNullParameter(fee2, "fee");
                        arrayList3.add(new kq2.e(chargeBearer, fee2));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                z3l.a aVar3 = bankTransferExchangeRate.v;
                if (aVar3 == null) {
                    z3l.a aVar4 = bankTransferExchangeRate.f188310n;
                    if (aVar4 != null) {
                        dj0.d total = pyd.c.K(aVar4.f319299b, d, bVar2);
                        List<z3l.b> list4 = aVar4.f319298a;
                        ArrayList taxesBreakdown = new ArrayList(w.t(list4, 10));
                        for (z3l.b bVar3 : list4) {
                            dj0.d value = pyd.c.K(bVar3.e, d, bVar2);
                            String str = bVar3.f319300a;
                            String str2 = bVar3.f319301b;
                            String str3 = bVar3.f319302c;
                            String str4 = bVar3.d;
                            Intrinsics.checkNotNullParameter(value, "value");
                            taxesBreakdown.add(new z3l.b(value, str, str2, str3, str4));
                        }
                        Intrinsics.checkNotNullParameter(taxesBreakdown, "taxesBreakdown");
                        Intrinsics.checkNotNullParameter(total, "total");
                        aVar = new z3l.a(taxesBreakdown, total);
                    } else {
                        aVar = null;
                    }
                } else {
                    aVar = aVar3;
                }
                dj0.d from = bankTransferExchangeRate.f188302a;
                dj0.d to6 = bankTransferExchangeRate.f188303b;
                double d5 = bankTransferExchangeRate.f188305g;
                long j2 = bankTransferExchangeRate.f188306h;
                CreditCardInterest creditCardInterest = bankTransferExchangeRate.o;
                boolean z = bankTransferExchangeRate.f188311p;
                nrf.e eVar3 = bankTransferExchangeRate.f188312q;
                TransferQuoteSplit transferQuoteSplit = bankTransferExchangeRate.f188313r;
                dj0.d dVar10 = bankTransferExchangeRate.f188314s;
                String str5 = bankTransferExchangeRate.f188315t;
                String str6 = bankTransferExchangeRate.u;
                z3l.a aVar5 = bankTransferExchangeRate.v;
                TransferAvailability transferAvailability = bankTransferExchangeRate.f188316w;
                WithholdingTaxTreatmentConfiguration withholdingTaxTreatmentConfiguration = bankTransferExchangeRate.f188317x;
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to6, "to");
                Intrinsics.checkNotNullParameter(exchangeFee, "exchangeFee");
                Intrinsics.checkNotNullParameter(totalFee, "totalFee");
                return new kq2.f(from, to6, exchangeFee, dVarK, dVarK2, totalFee, d5, j2, dVarA, dVarA2, dVarA3, dVarA4, arrayList, aVar, creditCardInterest, z, eVar3, transferQuoteSplit, dVar10, str5, str6, aVar5, transferAvailability, withholdingTaxTreatmentConfiguration);
            case 20:
                p54.m mVar = (p54.m) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                p54.c cVar4 = (p54.c) pair.f186385a;
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = (CreditApplicationPluginFlowContract$Configuration) pair.f186386b;
                int i6 = p54.l.f233012a[cVar4.ordinal()];
                if (i6 == 1) {
                    ufm.b bVarM = d0.m(new FinishCommand(100, null, null, 6));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ufm.i iVar3 = new ufm.i(te0.w.o0(p0.f264003c, new osk.m(mVar, creditApplicationPluginFlowContract$Configuration, null, 20)), new p30.b(i2, new p54.k(mVar, creditApplicationPluginFlowContract$Configuration, i3)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                return iVar3;
            case 21:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                xpi.g gVar = ((p54.o) obj3).E;
                if (zBooleanValue) {
                    ((xpi.c) gVar).e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
                } else {
                    ((xpi.c) gVar).e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
                }
                return Unit.f186387a;
            case 22:
                ((p68.e) obj2).getClass();
                return new p68.e((OnboardingTerms) obj3);
            case 23:
                com.revolut.feature.payments_migration.impl.ui.screen.search.b bVar4 = (com.revolut.feature.payments_migration.impl.ui.screen.search.b) obj3;
                m6a.a it11 = (m6a.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (!Intrinsics.f(it11, m6a.a.f203038a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar4.C1(u0.b(new FeatureCommand(new CardOrderNewFeatureConfig(null, null, u0.f(PaymentsMigrationDestination.f80204b), null, null, false, zn3.a.DEEPLINK, null, null, null, null, null, 16247))));
                return Unit.f186387a;
            case 24:
                p6b.b bVar5 = (p6b.b) obj3;
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.a result2 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.a) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, a.d.f82624a)) {
                    bVar5.C2(s5b.e.f260057a);
                } else if (Intrinsics.f(result2, a.e.f82625a)) {
                    bVar5.C2(s5b.f.f260058a);
                } else if (result2 instanceof a.C0525a) {
                    bVar5.C2(new s5b.d(((a.C0525a) result2).f82621a));
                } else if (result2 instanceof a.b) {
                    bVar5.C2(new s5b.g(((a.b) result2).f82622a));
                } else if (Intrinsics.f(result2, a.c.f82623a)) {
                    bVar5.C2(s5b.h.f260060a);
                } else if (Intrinsics.f(result2, a.f.f82626a)) {
                    bVar5.C1(CobrandedCardsFeatureConfig.PlanSwitchDestination.f82505a);
                    bVar5.B2();
                } else {
                    if (!(result2 instanceof w7b.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("ProceedDowngradeAction cannot be handled in CobrandedCardsTerminationFlowModel");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                }
                return Unit.f186387a;
            case 25:
                com.revolut.feature.shared.branding.impl.ui.a aVar6 = (com.revolut.feature.shared.branding.impl.ui.a) obj3;
                Intrinsics.checkNotNullParameter((s6d.k) obj2, "it");
                aVar6.X1(new mii.k("SUCCEED_DIALOG_ID", new TextLocalisedClause(R$string.merchant_profile_branding_publish_succeed, null, null, 14), null, null, null, 28));
                oki.h.D2(aVar6.f86071p);
                return Unit.f186387a;
            case 26:
                p6k.c cVar5 = (p6k.c) obj3;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list5 = (List) rVar.f314201a;
                od0.i iVar4 = (od0.i) rVar.f314202b;
                do3.n nVar2 = (do3.n) rVar.f314203c;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list5) {
                    MoneyRequest moneyRequest = (MoneyRequest) obj5;
                    if (moneyRequest.f60315b == MoneyRequestState.ACTIVE) {
                        AccountId.Joint joint = (AccountId.Joint) iVar4.g();
                        if (p6k.c.h(moneyRequest, joint != null ? joint.f51412a : null) || p6k.c.h(moneyRequest, nVar2.f116408a)) {
                            arrayList4.add(obj5);
                        }
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it12 = arrayList4.iterator();
                while (it12.hasNext()) {
                    MoneyRequest request = (MoneyRequest) it12.next();
                    p6k.e eVar4 = cVar5.f233347c;
                    Intrinsics.checkNotNullParameter(request, "request");
                    boolean zC = f6k.a.c(request);
                    DateTime dateTime = request.f60319j;
                    String str7 = request.f60314a;
                    String str8 = request.e;
                    MoneyRequestChannel moneyRequestChannel = request.f60316c;
                    MoneyRequestChannel.Wero wero = MoneyRequestChannel.Wero.f60336b;
                    if (zC) {
                        Intrinsics.checkNotNullParameter(request, "request");
                        if (Intrinsics.f(moneyRequestChannel, wero)) {
                            ApmWero apmWero = ApmWero.f61829c;
                            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_money_request_widget_title_request_via_apm, zhm.u.c(apmWero.e()), null, 12);
                            LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_link, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorBlue, 14.0f, Float.valueOf(28.0f), null, 32);
                            Image imageJ = apmWero.j();
                            Object timeClause = new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
                            if (str8 != null) {
                                layeredImage = layeredImageB;
                                r152 = 0;
                                timeClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(timeClause, new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                            } else {
                                layeredImage = layeredImageB;
                                r152 = 0;
                            }
                            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_money_request_widget_subtitle_link_or_qr, r152, r152, 14);
                            kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
                            Object[] elements = {timeClause, new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause2};
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
                            dj0.d dVar11 = request.d;
                            if (dVar11.f115082a == 0) {
                                pVar2 = ActionWidgetDelegate.Model.b.C0394b.f51606a;
                            } else {
                                MoneyClause moneyClause = new MoneyClause(dVar11, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), null, 8);
                                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                                pVar2 = new com.revolut.core.ui_kit.delegates.p(moneyClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                            }
                            dVar2 = new p6k.d(textLocalisedClause, compositeClause, layeredImage, imageJ, pVar2, new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.payment_link_request_action_share, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.money_request_details_cancel_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share_android, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 232));
                        } else {
                            dVar2 = null;
                        }
                        it8 = it12;
                    } else {
                        q6k.e eVar5 = eVar4.f233352b;
                        wv9.c cVar6 = eVar5.f242673a;
                        Intrinsics.checkNotNullParameter(request, "request");
                        q6k.f fVar2 = eVar5.f242674b;
                        Intrinsics.checkNotNullParameter(request, "request");
                        MoneyRequestState moneyRequestState = request.f60315b;
                        boolean z3 = moneyRequestChannel instanceof MoneyRequestChannel.Revolut;
                        it8 = it12;
                        MoneyRequestChannel.Upi upi2 = MoneyRequestChannel.Upi.f60335b;
                        if (z3) {
                            cVar = cVar6;
                            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.payments_money_request_pending_action_state_pending, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10);
                            TimeClause timeClause2 = new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
                            if (str8 != null) {
                                m70.a.a(kotlin.jvm.internal.t0.f186434a);
                                textClause = new TextClause(" · ".concat(str8), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            } else {
                                textClause = null;
                            }
                            kotlin.jvm.internal.t0 t0Var2 = kotlin.jvm.internal.t0.f186434a;
                            Object[] elements2 = {timeClause2, textClause, new TextClause(m70.a.o(t0Var2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause3};
                            Intrinsics.checkNotNullParameter(elements2, "elements");
                            List listL = kotlin.collections.d.L(elements2);
                            Intrinsics.checkNotNullParameter(t0Var2, "<this>");
                            compositeClauseM = yoj.b.m(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listL);
                        } else {
                            cVar = cVar6;
                            if (moneyRequestChannel instanceof MoneyRequestChannel.APM) {
                                MoneyRequestChannel.APM apm = (MoneyRequestChannel.APM) moneyRequestChannel;
                                wv9.c cVar7 = fVar2.f242675a;
                                kotlin.jvm.internal.t0 t0Var3 = kotlin.jvm.internal.t0.f186434a;
                                m70.a.c(t0Var3);
                                String strJ = ((v6k.c) cVar7).j("", moneyRequestState, request.f60322n);
                                if (apm.equals(MoneyRequestChannel.Aani.f60329b)) {
                                    textLocalisedClauseJ = ApmAani.f61807c.e();
                                } else if (apm.equals(MoneyRequestChannel.Bizum.f60331b)) {
                                    textLocalisedClauseJ = ApmBizum.f61808c.e();
                                } else if (apm.equals(MoneyRequestChannel.MBWay.f60332b)) {
                                    textLocalisedClauseJ = ApmMultibanco.f61815c.e();
                                } else if (apm.equals(MoneyRequestChannel.Qvik.f60333b)) {
                                    textLocalisedClauseJ = ApmQvik.f61823c.e();
                                } else if (apm.equals(upi2)) {
                                    textLocalisedClauseJ = ApmUpi.f61828c.e();
                                } else {
                                    if (!apm.equals(wero)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    textLocalisedClauseJ = ApmWero.f61829c.e();
                                }
                                compositeClauseM = yoj.b.m(new TextClause(m70.a.o(t0Var3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_via_placeholder_prefix, v.k(new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(q0.DATETIME), null, null, 12), textLocalisedClauseJ), null, 12), new TextClause(strJ, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)));
                            } else {
                                if (!(moneyRequestChannel instanceof MoneyRequestChannel.BankBeneficiary)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!((MoneyRequestChannel.BankBeneficiary) moneyRequestChannel).equals(MoneyRequestChannel.BankBeneficiary.Masav.f60330b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                compositeClauseM = yoj.b.m(new TextClause(m70.a.o(kotlin.jvm.internal.t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(q0.DATETIME), null, null, 12), new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.transactionUI_money_request_details_requested, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10)));
                            }
                        }
                        CompositeClause compositeClause2 = compositeClauseM;
                        v6k.c cVar8 = (v6k.c) cVar;
                        Image imageE = cVar8.e(request, wv9.b.CIRCULAR);
                        LayeredImage.Companion companion = LayeredImage.INSTANCE;
                        int i21 = R$drawable.uikit_icn_16_status_clock_arrows;
                        int i22 = R$attr.uikit_colorGroupedBackground;
                        LayeredImage layeredImageD = companion.d(i21, R$attr.uikit_colorOrange, i22, Integer.valueOf(i22), 2.0f, 2.0f, Float.valueOf(16.0f));
                        Clause clauseI = cVar8.i(request);
                        MoneyClause moneyClauseA = cVar8.a(request, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254));
                        m70.a.c(kotlin.jvm.internal.t0.f186434a);
                        com.revolut.core.ui_kit.delegates.p pVar3 = new com.revolut.core.ui_kit.delegates.p(moneyClauseA, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        if (Intrinsics.f(moneyRequestChannel, upi2)) {
                            kVar = new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(R.string.common_action_review, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.money_request_details_decline_action, null, null, 14), null, null, Constants.TAG_FC_SPEED_MODE);
                        } else if (f6k.a.d(request)) {
                            kVar = new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.payment_link_request_action_share, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.money_request_details_cancel_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share_android, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
                        } else if (f6k.a.b(request)) {
                            kVar = new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.money_request_details_send_action, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.money_request_details_decline_action, null, null, 14), null, null, Constants.TAG_FC_SPEED_MODE);
                        } else {
                            if (!f6k.a.e(request)) {
                                throw new IllegalStateException("moneyRequestId=" + str7 + ", state=" + moneyRequestState + " is not supported");
                            }
                            if (com.revolut.domain.models.moneyrequest.b.e(request)) {
                                kVar = new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.money_request_details_remind_action, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.money_request_details_cancel_action, null, null, 14), null, null, Constants.TAG_FC_SPEED_MODE);
                            } else {
                                jVar = new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.impl.R$string.money_request_details_cancel_action, null, null, 14), null, 14);
                                pVar = pVar3;
                                dVar2 = new p6k.d(clauseI, compositeClause2, imageE, layeredImageD, pVar, jVar);
                            }
                        }
                        pVar = pVar3;
                        jVar = kVar;
                        dVar2 = new p6k.d(clauseI, compositeClause2, imageE, layeredImageD, pVar, jVar);
                    }
                    ActionWidgetDelegate.Model model = dVar2 == null ? null : new ActionWidgetDelegate.Model(j6.a.q("MoneyRequestItem_", str7), dVar2.f233348a, dVar2.f233349b, new com.revolut.core.ui_kit.delegates.m(dVar2.f233350c, (NewBadgeContent.WithNumber) null, new RawImageBadge(dVar2.d), 10), dVar2.e, dVar2.f, null, request, null, true, 4416);
                    if (model != null) {
                        arrayList5.add(model);
                    }
                    it12 = it8;
                }
                return arrayList5;
            case 27:
                od0.i params = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (List) ((p99.c) obj3).f234286a.get(p99.c.a((ESignatureWorkflowConfiguration) params.f224257a));
            case 28:
                aii.u destination = (aii.u) obj2;
                Intrinsics.checkNotNullParameter(destination, "destination");
                ((com.revolut.feature.onboarding.impl.onboarding.country.flow.c) obj3).C1(destination);
                return Unit.f186387a;
            default:
                List list6 = (List) obj2;
                Intrinsics.h(list6);
                ((BaseLayoutBuilderFragment) ((pak.c) obj3)).setItems(list6);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ m(Object obj2, int i) {
        this.f230777a = i;
        this.f230778b = obj2;
    }
}
