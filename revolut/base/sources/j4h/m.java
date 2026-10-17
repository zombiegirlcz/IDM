package j4h;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import cn3.b;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionInfoPopup;
import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionIntroConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsControllerContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.IllionBankStatementFlowContract$Step;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.DeFiRecoveryPhraseFlowContract$Step;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.RevolutFeedFlowContract$Step;
import com.revolut.feature.payments_migration.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr.PixQrCodeFlowContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfo;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlowContract$PagerItem;
import com.revolut.feature.subscriptions.impl.block_card_subscription.BlockCardSubscriptionFlowContract$Step;
import com.revolut.feature.subscriptions.impl.block_card_subscription.accept_conditions.AcceptConditionsScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen.WhatWillHappenScreen;
import com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen.WhatWillHappenScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.contact_selection.ContactSelectionWorkflowContract$Step;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskAssessmentScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.MilestoneRewardsFlowContract$Step;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import d67.s;
import d67.t;
import d67.u;
import e93.f0;
import e93.g0;
import imk.p0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jck.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.a0;
import org.joda.time.DateTime;
import p9e.d;
import rp0.y;
import te0.w;
import til.q;
import til.r;
import zh9.u0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f171395c;

    public /* synthetic */ m(p pVar, e eVar) {
        this.f171393a = 1;
        this.f171395c = pVar;
        this.f171394b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v23 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        IllionInfoPopup illionInfoPopup;
        int i = this.f171393a;
        Class cls = Long.TYPE;
        int i2 = 5;
        int i3 = 2;
        int i5 = 27;
        int i6 = 0;
        int i21 = 1;
        Object obj3 = null;
        str = null;
        str = null;
        String str = null;
        Object obj4 = this.f171395c;
        Object obj5 = this.f171394b;
        switch (i) {
            case 0:
                e eVar = (e) obj5;
                a0 instrumentWithTicker = (a0) obj4;
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String widgetId = eVar.f171382a;
                List chartPeriods = eVar.d;
                eel.c selectedPeriod = eVar.e;
                gw0.i chatPosition = p.f171398a;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                Intrinsics.checkNotNullParameter(instrumentWithTicker, "instrumentWithTicker");
                Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
                Intrinsics.checkNotNullParameter(chatPosition, "chatPosition");
                eel.i iVar = eel.i.PRICE;
                InstrumentTicker instrumentTicker = instrumentWithTicker.f214561b;
                return a.a(widgetId, l4h.h.c(null, TrendViewDelegate.a.C0428a.f53562a, selectedPeriod, iVar, instrumentTicker, l4h.h.e(instrumentTicker), instrumentWithTicker.f214560a, false), instrumentWithTicker.f214560a, false, l4h.i.c(null, selectedPeriod, chartPeriods.indexOf(selectedPeriod), oi0.d.x(null), true, instrumentWithTicker.f214560a), selectedPeriod, chartPeriods, chatPosition);
            case 1:
                e eVar2 = (e) obj5;
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((p) obj4).b(eVar2.e, eVar2.f171382a, eVar2.d);
            case 2:
                j53.l update = (j53.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j53.i.a((j53.i) obj5, (String) obj4, false, false, null, 26);
            case 3:
                j53.k kVar = (j53.k) obj5;
                j53.l update2 = (j53.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                String str2 = kVar.f171470a;
                Data imagesData = kVar.f171471b;
                Data images = kVar.f171472c;
                Intrinsics.checkNotNullParameter(imagesData, "imagesData");
                Intrinsics.checkNotNullParameter(images, "images");
                return new j53.k(imagesData, images, str2, (String) obj4);
            case 4:
                g0 g0Var = (g0) obj5;
                List list2 = (List) obj4;
                String str3 = g0Var.f123865a;
                Data data = new Data(g0Var, null, false, 6, null);
                Data data2 = new Data(list2, null, false, 6, null);
                f0 f0Var = (f0) d0.d0(list2);
                return new j53.k(data, data2, str3, f0Var != null ? f0Var.f123860a : 0);
            case 5:
                return new j53.k(new Data((g0) obj4, null, false, 6, null), new Data(null, null, true, 3, null), (String) obj5, null);
            case 6:
                com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c) obj5;
                DropOutConfig.ConfirmationContent confirmationContent = (DropOutConfig.ConfirmationContent) obj4;
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.e) {
                    cVar.T2(new j54.l(cVar, confirmationContent, null), new yi5.b(i5));
                } else if (output instanceof dii.f) {
                    cVar.T2(new j54.n(cVar, confirmationContent, null), new yi5.b(i5));
                } else {
                    int i22 = jli.h.f175850a;
                    Unit unit = Unit.f186387a;
                }
                return Unit.f186387a;
            case 7:
                j60.c cVar2 = (j60.c) obj5;
                y yVar = (y) obj4;
                if (((rp0.a0) obj2).f256040a) {
                    cVar2.A(yVar);
                } else {
                    cVar2.x(yVar);
                }
                return Unit.f186387a;
            case 8:
                com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.a aVar = (com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.a) obj5;
                yki.b bVar = (yki.b) obj4;
                dii.g output2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (Intrinsics.f(output2, dii.e.f115068a)) {
                    oki.h.t2(aVar, bVar, DeFiRecoveryPhraseFlowContract$Step.Phrase.f71868a, true, null, false, 12);
                } else {
                    oki.h.D2(bVar);
                }
                return Unit.f186387a;
            case 9:
                return j68.e.a((j68.e) obj2, null, (JuniorPlanConfiguration) obj5, (do3.n) obj4, 3);
            case 10:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return d0.E0(l6a.a.c(R$string.payments_migration_move_payment_instructions_first_step_account_details_description, R$attr.uikit_dp24, ((j6a.g) obj4).f171703g), ((j6a.n) obj5).f171714b.c());
            case 11:
                j6b.j jVar = (j6b.j) obj5;
                Data planHubInfoData = (Data) obj4;
                j6b.c cVar3 = (j6b.c) obj2;
                List listK = jVar.f171731q;
                CobrandedCardsPlanHubInfo cobrandedCardsPlanHubInfo = (CobrandedCardsPlanHubInfo) planHubInfoData.getContent();
                if (cobrandedCardsPlanHubInfo != null && cobrandedCardsPlanHubInfo.e.f82410b != null) {
                    listK = v.k(CobrandedCardsPlanHubFlowContract$PagerItem.OVERVIEW, CobrandedCardsPlanHubFlowContract$PagerItem.REWARDS, CobrandedCardsPlanHubFlowContract$PagerItem.TRANSACTIONS);
                }
                List pagerItems = listK;
                boolean z = (cVar3.d || planHubInfoData.getLoading() || planHubInfoData.getContent() == null) ? false : true;
                String str4 = jVar.o.f82525a;
                if (str4 != null && z && pagerItems.contains(CobrandedCardsPlanHubFlowContract$PagerItem.REWARDS)) {
                    str = str4;
                }
                String selectedPagerItemId = str != null ? CobrandedCardsPlanHubFlowContract$PagerItem.REWARDS.getF94249a() : cVar3.f171719b;
                boolean z3 = cVar3.d || z;
                if (str == null) {
                    str = cVar3.e;
                }
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
                Intrinsics.checkNotNullParameter(planHubInfoData, "planHubInfoData");
                return new j6b.c(pagerItems, selectedPagerItemId, planHubInfoData, z3, str);
            case 12:
                j6k.a aVar2 = (j6k.a) obj5;
                String requestId = (String) obj4;
                List moneyRequests = (List) obj2;
                Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
                Iterator it11 = moneyRequests.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next = it11.next();
                        if (Intrinsics.f(((MoneyRequest) next).f60314a, requestId)) {
                            obj3 = next;
                        }
                    }
                }
                MoneyRequest moneyRequest = (MoneyRequest) obj3;
                if (moneyRequest != null && !com.revolut.domain.models.moneyrequest.b.e(moneyRequest)) {
                    return pfm.m.f235744a;
                }
                efm.b bVarRemindRequest = aVar2.f171794a.remindRequest(requestId);
                j6k.o oVar = aVar2.f171795b;
                DateTime date = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(date, "now(...)");
                oVar.getClass();
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                Intrinsics.checkNotNullParameter(date, "date");
                pfm.n nVar = new pfm.n(new a9j.k(oVar, 12, requestId, date), i21);
                efm.k kVarFirstElement = oVar.d(false).firstElement();
                Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
                efm.k kVarW = oVar.e().w();
                Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
                efm.k kVarW2 = oVar.c().w();
                Intrinsics.checkNotNullExpressionValue(kVarW2, "toMaybe(...)");
                pfm.a aVar3 = new pfm.a(new rfm.e(w.E0(kVarFirstElement, kVarW, kVarW2), nVar, i6), new j4e.c(23, new j2c.o(date, i2, oVar, requestId)), 3);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                pfm.a aVarE = bVarRemindRequest.e(w.g0(aVar3));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return w.g0(aVarE);
            case 13:
                j6k.o oVar2 = (j6k.o) obj5;
                j6k.j jVar2 = (j6k.j) obj4;
                List pendingRequests = (List) obj2;
                Intrinsics.checkNotNullParameter(pendingRequests, "pendingRequests");
                List<z8l.i> list3 = pendingRequests;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                for (z8l.i iVar2 : list3) {
                    String id10 = iVar2.getCreator().getId();
                    z8l.g requester = iVar2.getRequester();
                    MoneyRequestDirection moneyRequestDirectionB = j6k.o.b(id10, requester != null ? requester.getId() : null, jVar2.f171811a, jVar2.f171812b);
                    Long l2 = (Long) oVar2.f171820g.T2(iVar2.getId(), cls);
                    arrayList.add(m6k.a.a(iVar2, l2 != null ? new DateTime(l2.longValue()) : null, moneyRequestDirectionB));
                }
                return d0.P0(arrayList, new j6k.n());
            case 14:
                j6k.o oVar3 = (j6k.o) obj5;
                j6k.k kVar2 = (j6k.k) obj4;
                z8l.i request = (z8l.i) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                String id11 = request.getCreator().getId();
                z8l.g requester2 = request.getRequester();
                MoneyRequestDirection moneyRequestDirectionB2 = j6k.o.b(id11, requester2 != null ? requester2.getId() : null, kVar2.f171813a, kVar2.f171815c);
                Long l3 = (Long) oVar3.f171820g.T2(request.getId(), cls);
                return m6k.a.a(request, l3 != null ? new DateTime(l3.longValue()) : null, moneyRequestDirectionB2);
            case 15:
                Function0 function0 = (Function0) obj5;
                j72.b bVar2 = (j72.b) obj4;
                r result = (r) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, q.f271586a) || Intrinsics.f(result, til.n.f271581a)) {
                    function0.invoke();
                } else {
                    if (!(result instanceof til.o) && !(result instanceof til.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.A2(u0.c(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)));
                }
                return Unit.f186387a;
            case 16:
                aii.q it12 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                oki.h.t2((com.revolut.feature.notification_centre.impl.ui.revolut_feed.a) obj5, (yki.l) obj4, RevolutFeedFlowContract$Step.Profile.f78138a, true, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                return Unit.f186387a;
            case 17:
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a aVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) obj5;
                DebtDetailsControllerContract$ModalStep debtDetailsControllerContract$ModalStep = (DebtDetailsControllerContract$ModalStep) obj4;
                cy4.b output3 = (cy4.b) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar4.H2(aVar4.f67509t, new j87.m(aVar4.I2(((DebtDetailsControllerContract$ModalStep.DropdownPicker) debtDetailsControllerContract$ModalStep).f67504a, output3.f110041a), i3));
                return Unit.f186387a;
            case 18:
                j96.a update3 = (j96.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                u80.p pVar = u80.p.f278066a;
                xi0.b.Companion.getClass();
                xi0.b bVar3 = xi0.b.i;
                return j96.a.a(update3, null, new DepositAmount.FixedAmount(new dj0.d(u80.p.a((String) obj5, bVar3.f306286a, ((j96.l) obj4).f172304p, null), bVar3)), null, 5);
            case 19:
                com.revolut.feature.subscriptions.impl.block_card_subscription.a aVar5 = (com.revolut.feature.subscriptions.impl.block_card_subscription.a) obj5;
                WhatWillHappenScreen whatWillHappenScreen = (WhatWillHappenScreen) obj4;
                p9e.d output4 = (p9e.d) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (!(output4 instanceof d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar5.E2(new BlockCardSubscriptionFlowContract$Step.AcceptConditions(new AcceptConditionsScreenContract$InputData(((WhatWillHappenScreenContract$InputData) whatWillHappenScreen.G).f89170a)), true, null, false);
                return Unit.f186387a;
            case 20:
                ja6.b bVar4 = (ja6.b) obj5;
                String str5 = (String) obj4;
                bVar4.getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM charity_campaigns WHERE charityId = ?");
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str5);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "charityId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cardDesignCode");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cardDesignUrl");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minDonationsToUnlock");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        ia6.c cVar4 = bVar4.f172445c;
                        if (text7 != null) {
                            list = (List) cVar4.f159952a.d(text7, new TypeToken<List<? extends jo3.b>>() { // from class: com.revolut.feature.donations.impl.database.converter.MoneyListTypeConverter$jsonToMoney$1$1
                            }.getType());
                        } else {
                            cVar4.getClass();
                            list = null;
                        }
                        arrayList2.add(new la6.f(text, text2, text3, text4, text5, list, text6));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 21:
                ((ja6.f) obj5).f172455b.insert((SQLiteConnection) obj2, (la6.h) obj4);
                return null;
            case 22:
                com.revolut.feature_retail_user_declarations.contact_selection.b bVar5 = (com.revolut.feature_retail_user_declarations.contact_selection.b) obj5;
                ContactSelectionWorkflowContract$Step contactSelectionWorkflowContract$Step = (ContactSelectionWorkflowContract$Step) obj4;
                cn3.b output5 = (cn3.b) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                if (output5 instanceof b.a) {
                    bVar5.C2(jai.c.f172482a);
                } else {
                    if (output5 instanceof cn3.d) {
                        throw new IllegalArgumentException("SelectedGroup is not supported in workflow");
                    }
                    if (!(output5 instanceof cn3.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ivh.c.c3(bVar5.f97534q, "ContactSelectionWrapperFlow", new com.revolut.feature_retail_user_declarations.contact_selection.a(bVar5, contactSelectionWorkflowContract$Step, output5, null), null, null, 28);
                }
                return Unit.f186387a;
            case 23:
                com.revolut.feature.pix.impl.flow.qr.a aVar6 = (com.revolut.feature.pix.impl.flow.qr.a) obj5;
                yki.l lVar = (yki.l) obj4;
                g12.q result2 = (g12.q) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                Intrinsics.checkNotNullParameter(result2, "<this>");
                g12.p pVar2 = result2 instanceof g12.p ? (g12.p) result2 : null;
                g12.m mVar = pVar2 != null ? pVar2.f139527a : null;
                tca.c cVar5 = mVar instanceof tca.c ? (tca.c) mVar : null;
                if (cVar5 instanceof tca.a) {
                    tca.a aVar7 = (tca.a) cVar5;
                    oki.h.t2(aVar6, lVar, new PixQrCodeFlowContract$Step.QrTransaction(aVar7.f269766a, aVar7.f269767b), false, null, false, 12);
                } else if (cVar5 instanceof tca.b) {
                    oki.h.t2(aVar6, lVar, new PixQrCodeFlowContract$Step.Transfer(((tca.b) cVar5).f269768a), false, null, false, 12);
                } else {
                    aVar6.B2();
                }
                return Unit.f186387a;
            case 24:
                com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b bVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b) obj5;
                IllionIntroConfig illionIntroConfig = (IllionIntroConfig) obj4;
                u output6 = (u) obj2;
                Intrinsics.checkNotNullParameter(output6, "output");
                if (output6 instanceof s) {
                    int i32 = jc4.e.f172705a[illionIntroConfig.f66459a.d.ordinal()];
                    if (i32 == 1) {
                        bVar6.Q2(illionIntroConfig.f66460b);
                    } else {
                        if (i32 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar6.l2(new jc4.g(bVar6, str, i21), new jc4.c(bVar6, 1));
                    }
                } else if (output6 instanceof t) {
                    zu3.a aVar8 = illionIntroConfig.f66459a.f;
                    if (aVar8 != null) {
                        int i33 = jc4.e.f172705a[aVar8.ordinal()];
                        if (i33 == 1) {
                            bVar6.Q2(illionIntroConfig.f66460b);
                        } else {
                            if (i33 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar6.l2(new jc4.g(bVar6, str, i21), new jc4.c(bVar6, 1));
                        }
                    }
                } else if (output6 instanceof d67.q) {
                    c84.t.J2(bVar6, false, null, null, 7);
                } else if ((output6 instanceof d67.r) && (illionInfoPopup = illionIntroConfig.f66459a.f66464g) != null) {
                    oki.h.w2(bVar6.f67795r, new IllionBankStatementFlowContract$Step.Modal.LearnMore(illionInfoPopup), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 25:
                com.revolut.feature_retail_user_declarations.risk_assessment.screen.c cVar6 = (com.revolut.feature_retail_user_declarations.risk_assessment.screen.c) obj5;
                RiskAssessmentScreenContract$ModalStep riskAssessmentScreenContract$ModalStep = (RiskAssessmentScreenContract$ModalStep) obj4;
                eii.k result3 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (Intrinsics.f(result3, eii.g.f126653a)) {
                    cVar6.I2(((RiskAssessmentScreenContract$ModalStep.ConfirmDialog) riskAssessmentScreenContract$ModalStep).f97732a);
                }
                return Unit.f186387a;
            case 26:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                return ((ppk.f) ((mp.p) obj5).d).d(v1.c.w((xi0.b) obj4, baseCurrency), n9l.b.SEC_3);
            case 27:
                List contacts = (List) obj2;
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                LocalDate localDateE = ((l80.f) ((l80.e) ((r10.t) obj5).f250858b)).e();
                return nkm.y.x(nkm.y.F(nkm.y.n(nkm.y.z(d0.Q(contacts), new a15.l(13, localDateE)), new j87.m((jcj.n) obj4, 20)), new h0()), new a15.l(14, localDateE));
            case 28:
                com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c cVar7 = (com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c) obj5;
                String str6 = (String) obj4;
                u result4 = (u) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (Intrinsics.f(result4, d67.q.f111462a)) {
                    cVar7.B2();
                } else {
                    int i43 = 26;
                    if (Intrinsics.f(result4, s.f111464a)) {
                        cVar7.l2(new p0(cVar7, str, 25), new yi5.b(i43));
                    } else if (Intrinsics.f(result4, d67.r.f111463a)) {
                        cVar7.l2(new iz1.p(cVar7, str6, str, i5), new yi5.b(i43));
                    } else if (!(result4 instanceof d67.p) && !Intrinsics.f(result4, t.f111465a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            default:
                com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c cVar8 = (com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c) obj5;
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                oki.h.t2(cVar8, cVar8.f102566r, new MilestoneRewardsFlowContract$Step.ProductArticle((ProductArticleParams) obj4), false, null, false, 12);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ m(p pVar, e eVar, a0 a0Var) {
        this.f171393a = 0;
        this.f171394b = eVar;
        this.f171395c = a0Var;
    }

    public /* synthetic */ m(Object obj2, Object obj3, int i) {
        this.f171393a = i;
        this.f171394b = obj2;
        this.f171395c = obj3;
    }
}
