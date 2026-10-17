package h8b;

import ael.y;
import com.revolut.core.model.FileExtension;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkData;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.FamilyCreditCardSettingsScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.flow.RecommendedValuatorsFlowContract$Step;
import com.revolut.feature.crypto.onboarding.api.CryptoOnboardingApi$Toggles;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.external_accounts.api.model.MandateConstraints;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormFieldError;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormServerError;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.error.FormErrorsScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.authorisation_request.PixAuthorisationRequestContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$Step;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.api.faq.model.TransactionTroubleshooterFilter;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.TravelMilesFlightSearchResultsFlowContract$Step;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.PaymentLinkQrFlowContract$Step;
import com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$Step;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import d67.q;
import d67.r;
import d67.u;
import dej.t1;
import g2e.t;
import h93.j0;
import h93.l0;
import ha3.x;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import okhttp3.ResponseBody;
import retrofit2.Response;
import skm.p0;
import te0.w;
import v6l.b1;
import v6l.m0;
import v6l.p;
import v6l.s;
import vkm.j2;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f149971c;

    public /* synthetic */ b(t tVar, List list, hfj.a aVar) {
        this.f149969a = 16;
        this.f149970b = list;
        this.f149971c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        FileExtension fileExtension;
        int i = this.f149969a;
        int i2 = 29;
        int i3 = 4;
        int i5 = 2;
        int i6 = 3;
        ArrayList arrayList = null;
        Object obj3 = null;
        Object obj4 = this.f149971c;
        Object obj5 = this.f149970b;
        switch (i) {
            case 0:
                c cVar = (c) obj5;
                String ref2 = (String) obj4;
                Optional optionalGia = (Optional) obj2;
                Intrinsics.checkNotNullParameter(optionalGia, "optionalGia");
                if (!optionalGia.isPresent()) {
                    return zi0.c.i(BigDecimal.ZERO);
                }
                Object obj6 = optionalGia.get();
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                TradingAccount.Portfolio portfolioL = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) obj6);
                ybl.d dVar = cVar.f149973b;
                String portfolioId = portfolioL.f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(portfolioId, "toString(...)");
                ybl.c cVar2 = ybl.d.Companion;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(ref2, "ref");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(((y) dVar).c(new kel.j(ref2, portfolioId), loadingStrategy), new aed.a(16));
            case 1:
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.b bVar = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.b) obj5;
                j8k.b output = (j8k.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                String str = ((PaymentLinkQrFlowContract$Step.PermissionScreen) ((PaymentLinkQrFlowContract$Step) obj4)).f102217a;
                if (!Intrinsics.f(output, j8k.b.f172224a)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(bVar, bVar.f102221q, new PaymentLinkQrFlowContract$Step.QrCodeScreen(str), false, null, false, 12);
                return Unit.f186387a;
            case 2:
                com.revolut.feature.pix.impl.flow.authorisation_request.a aVar = (com.revolut.feature.pix.impl.flow.authorisation_request.a) obj5;
                yki.l lVar = (yki.l) obj4;
                o9a.o result = (o9a.o) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof o9a.n) {
                    oki.h.w2(lVar, PixAuthorisationRequestContract$Step.PaymentInfo.f80585a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else if (result instanceof o9a.l) {
                    aVar.C1(u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) obj, i6)))));
                } else if (result instanceof o9a.m) {
                    oki.h.D2(lVar);
                } else {
                    if (!(result instanceof o9a.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C1(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, ((o9a.k) result).f223158a, null, null, null, 30)));
                }
                return Unit.f186387a;
            case 3:
                ha3.j jVar = (ha3.j) obj5;
                s sVar = jVar.f150410a;
                String walletId = (String) obj4;
                String planId = (String) obj2;
                Intrinsics.checkNotNullParameter(planId, "planId");
                if (!((jte.d) jVar.f150412c).c(CardsCoreApi$Toggles.CardDesignApiFlagsMigration.f65556c)) {
                    Intrinsics.checkNotNullParameter(walletId, "walletId");
                    return sVar.f286500j.g(new v6l.n(walletId, Boolean.FALSE, false, null, planId, null, null, null, null, null, null, null), true);
                }
                j0 productType = j0.RETAIL;
                l0 subProductType = l0.DEBIT;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(subProductType, "subProductType");
                return sVar.f286499h.g(new p(walletId, productType, subProductType, null, planId, null, null, null, null, null, 1992), true);
            case 4:
                x xVar = (x) obj5;
                Set set = (Set) obj4;
                Map pocketsMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(pocketsMap, "pocketsMap");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : pocketsMap.entrySet()) {
                    if (set.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Collection collectionValues = linkedHashMap.values();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it8 = collectionValues.iterator();
                while (it8.hasNext()) {
                    linkedHashSet.add(((io3.d) it8.next()).f163146b);
                }
                return xVar.w(linkedHashSet, b93.d.RETAIL, false, b93.k.CREATED_DATE);
            case 5:
                b93.d cardScope = (b93.d) obj4;
                String walletId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId2, "it");
                b1 b1Var = (b1) ((x) obj5).f150432a;
                Intrinsics.checkNotNullParameter(walletId2, "walletId");
                Intrinsics.checkNotNullParameter(cardScope, "cardScope");
                p0 p0Var = p0.f264001a;
                return w.o0(elm.f.f127540b, new m0(b1Var, walletId2, cardScope, null, 1));
            case 6:
                com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) obj5;
                FamilyCreditCardSettingsScreenContract$ModalStep familyCreditCardSettingsScreenContract$ModalStep = (FamilyCreditCardSettingsScreenContract$ModalStep) obj4;
                e54.p outputData = (e54.p) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof e54.o) {
                    eVar.n2(new com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.b(eVar, familyCreditCardSettingsScreenContract$ModalStep, outputData, null), new whi.b(6));
                } else {
                    if (!(outputData instanceof e54.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str2 = ((e54.n) outputData).f122755a.f120542a;
                    if (Intrinsics.f(str2, "remove")) {
                        eVar.n2(new com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.c(eVar, familyCreditCardSettingsScreenContract$ModalStep, null), new whi.b(6));
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unsupported actionId: ", str2));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        Unit unit = Unit.f186387a;
                    }
                }
                return Unit.f186387a;
            case 7:
                List cardIds = (List) obj2;
                Intrinsics.checkNotNullParameter(cardIds, "cardIds");
                ((hde.i) obj5).f151420a.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.TransactionTroubleshooter((String) obj4, j7d.a.PAST, new TransactionTroubleshooterFilter.Cards(cardIds)), (SharedFaqDestination.PassthroughData) null, false, 14), false, (Integer) null, 0, 61)));
                return Boolean.TRUE;
            case 8:
                MonthlyDrawsFlowContract$Step monthlyDrawsFlowContract$Step = (MonthlyDrawsFlowContract$Step) obj5;
                com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d dVar2 = (com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d) obj4;
                yja.b result2 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                int i21 = hdk.g.f151473a[result2.ordinal()];
                if (i21 == 1) {
                    MonthlyDrawsFlowContract$Step.ProductArticle productArticle = (MonthlyDrawsFlowContract$Step.ProductArticle) monthlyDrawsFlowContract$Step;
                    if (productArticle.f102548b) {
                        dVar2.l2(new com.revolut.retail.feature.plan_rewards.impl.presentation.flow.a(dVar2, null), new b(dVar2, productArticle.f102547a, 10));
                    } else {
                        oki.h.t2(dVar2, dVar2.u, MonthlyDrawsFlowContract$Step.Hub.f102544a, false, null, false, 12);
                    }
                } else {
                    if (i21 != 2 && i21 != 3 && i21 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(dVar2.u);
                }
                return Unit.f186387a;
            case 9:
                com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d dVar3 = (com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d) obj5;
                String str3 = (String) obj4;
                u result3 = (u) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (Intrinsics.f(result3, q.f111462a)) {
                    dVar3.B2();
                } else {
                    int i22 = 26;
                    if (Intrinsics.f(result3, d67.s.f111464a)) {
                        dVar3.l2(new hdk.h(dVar3, obj, 1), new yi5.b(i22));
                    } else if (Intrinsics.f(result3, r.f111463a)) {
                        if (str3 != null) {
                            dVar3.l2(new h54.o(dVar3, str3, obj, 19), new yi5.b(i22));
                        }
                    } else if (!(result3 instanceof d67.p) && !Intrinsics.f(result3, d67.t.f111465a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            case 10:
                com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d dVar4 = (com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d) obj5;
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                oki.h.t2(dVar4, dVar4.u, new MonthlyDrawsFlowContract$Step.ProductArticle((ProductArticleParams) obj4, true), false, null, false, 12);
                return Boolean.TRUE;
            case 11:
                he1.f updateState = (he1.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Set setH1 = d0.h1(updateState.f151514b);
                if (((ExpandableCellDelegate.Model) obj5).e) {
                    setH1.remove(((CatalogueCategory) obj4).f60669a);
                } else {
                    setH1.add(((CatalogueCategory) obj4).f60669a);
                }
                Unit unit2 = Unit.f186387a;
                return he1.f.a(updateState, null, setH1, 3);
            case 12:
                wi0.b bVar2 = (wi0.b) obj5;
                hea.o update = (hea.o) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                dda.k kVar = ((hea.o) ((j2) ((com.revolut.feature.pockets.impl.details_v2.pocket_details.a) obj4).U.f22677a).getValue()).f151649g;
                return bVar2.equals(kVar != null ? kVar.f113181a : 0) ? hea.o.a(update, null, false, null, null, null, null, null, null, false, null, null, false, null, null, false, 32607) : hea.o.a(update, null, false, null, null, null, null, null, bVar2, false, null, null, false, null, null, false, 32607);
            case 13:
                hf6.i iVar = (hf6.i) obj5;
                String str4 = (String) obj4;
                List list = (List) ((Data) obj2).getContent();
                if (list != null) {
                    w4l.f fVar = iVar.f151763g;
                    Unit unit3 = Unit.f186387a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : list) {
                        if (!Intrinsics.f(((OpenBankingConsent.Default) obj7).f60382a, str4)) {
                            arrayList2.add(obj7);
                        }
                    }
                    fVar.j(unit3, arrayList2);
                }
                return Unit.f186387a;
            case 14:
                com.revolut.feature.retail.reverywhere.impl.onboarding.a aVar2 = (com.revolut.feature.retail.reverywhere.impl.onboarding.a) obj5;
                ReverywhereOnboardingFlowContract$Step.ProductArticle productArticle2 = (ReverywhereOnboardingFlowContract$Step.ProductArticle) obj4;
                yja.b outputData2 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                int i32 = hfb.e.f151790a[outputData2.ordinal()];
                int i33 = 1;
                if (i32 == 1) {
                    List list2 = productArticle2.f82907b;
                    if (list2.isEmpty()) {
                        aVar2.l2(new hfb.i(aVar2, obj, i33), new hfb.c(aVar2, 1));
                    } else {
                        aVar2.l2(new h54.o(aVar2, list2, obj, i2), new hfb.c(aVar2, 2));
                    }
                } else if (i32 == 2) {
                    oki.h.D2(aVar2.f82913s);
                } else {
                    if (i32 != 3 && i32 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.l2(new hfb.i(aVar2, obj, i33), new hfb.c(aVar2, 1));
                }
                return Unit.f186387a;
            case 15:
                com.revolut.feature.retail.reverywhere.impl.onboarding.a aVar3 = (com.revolut.feature.retail.reverywhere.impl.onboarding.a) obj4;
                yki.i iVar2 = aVar3.f82913s;
                hub.b result4 = (hub.b) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                ((Ref$BooleanRef) obj5).f186407a = true;
                if (result4.f155599b) {
                    oki.h.u2(aVar3, iVar2, ReverywhereOnboardingFlowContract$Step.Reverywhere.f82909a, TransitionAnimation.SLIDE_END_TO_START.f98395a, 4);
                } else {
                    oki.h.D2(iVar2);
                }
                return Unit.f186387a;
            case 16:
                hfj.a aVar4 = (hfj.a) obj4;
                List devices = (List) obj2;
                Intrinsics.checkNotNullParameter(devices, "devices");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj8 : (List) obj5) {
                    t1 t1Var = (t1) obj8;
                    Iterator it10 = devices.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next = it10.next();
                            if (Intrinsics.f(((UserDevice) next).f71914a, t1Var.e.f100442c)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    UserDevice userDevice = (UserDevice) next;
                    Object arrayList3 = linkedHashMap2.get(userDevice);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap2.put(userDevice, arrayList3);
                    }
                    ((List) arrayList3).add(obj8);
                }
                int i43 = hfj.b.f151920a[aVar4.ordinal()];
                Map mapB = linkedHashMap2;
                if (i43 != 1) {
                    if (i43 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it11 = devices.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            Object next2 = it11.next();
                            if (((UserDevice) next2).f71921m) {
                                obj3 = next2;
                            }
                        }
                    }
                    UserDevice userDevice2 = (UserDevice) obj3;
                    mapB = linkedHashMap2;
                    if (userDevice2 != null) {
                        Object obj9 = (List) linkedHashMap2.get(userDevice2);
                        if (obj9 == null) {
                            obj9 = f0.f322471a;
                        }
                        aim.f builder = new aim.f();
                        builder.put(userDevice2, obj9);
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            if (!Intrinsics.f((UserDevice) entry2.getKey(), userDevice2)) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        builder.putAll(linkedHashMap3);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        mapB = builder.b();
                    }
                }
                List<Map.Entry> listP0 = d0.P0(mapB.entrySet(), new hfj.c());
                int iB = q0.b(zhm.w.t(listP0, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB < 16 ? 16 : iB);
                for (Map.Entry entry3 : listP0) {
                    linkedHashMap4.put((UserDevice) entry3.getKey(), (List) entry3.getValue());
                }
                return linkedHashMap4;
            case 17:
                List list3 = (List) obj4;
                List tree = (List) obj2;
                Intrinsics.checkNotNullParameter(tree, "tree");
                ((hg0.o) obj5).getClass();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                ArrayDeque arrayDeque = new ArrayDeque();
                Iterator it12 = tree.iterator();
                while (it12.hasNext()) {
                    arrayDeque.addLast((PigeonNode) it12.next());
                }
                while (!arrayDeque.isEmpty()) {
                    PigeonNode pigeonNode = (PigeonNode) arrayDeque.removeLast();
                    linkedHashMap5.put(pigeonNode.f51434a, pigeonNode);
                    Iterator it13 = pigeonNode.f51438h.iterator();
                    while (it13.hasNext()) {
                        arrayDeque.addLast((PigeonNode) it13.next());
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it14 = list3.iterator();
                while (it14.hasNext()) {
                    PigeonNode pigeonNode2 = (PigeonNode) linkedHashMap5.get((String) it14.next());
                    if (pigeonNode2 != null) {
                        arrayList4.add(pigeonNode2);
                    }
                }
                return arrayList4;
            case 18:
                hg9.m mVar = (hg9.m) obj5;
                hg9.g update2 = (hg9.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                ArrayList<FormFieldError> arrayList5 = ((FormServerError) obj4).f78691c;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                for (FormFieldError formFieldError : arrayList5) {
                    String str5 = formFieldError.f78687b;
                    hg9.b bVar3 = mVar.f152128r;
                    List path = formFieldError.f78688c;
                    FormErrorsScreenContract$InputData formErrorsScreenContract$InputData = mVar.f152127q;
                    ArrayList fields = formErrorsScreenContract$InputData.f78707a;
                    List userInputs = formErrorsScreenContract$InputData.f78708b.f78711b;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(path, "path");
                    Intrinsics.checkNotNullParameter(fields, "fields");
                    Intrinsics.checkNotNullParameter(userInputs, "userInputs");
                    arrayList6.add(new hg9.h(str5, d0.k0(bVar3.a(path, fields, userInputs), " > ", null, null, 0, null, 62), formFieldError.f78686a));
                }
                return hg9.g.a(update2, zi0.c.P(arrayList6, false, null, 3));
            case 19:
                com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.a aVar5 = (com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.a) obj5;
                yki.l lVar2 = (yki.l) obj4;
                nhg.u outputData3 = (nhg.u) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (!(outputData3 instanceof nhg.t)) {
                    throw new NoWhenBranchMatchedException();
                }
                nhg.t tVar = (nhg.t) outputData3;
                oki.h.t2(aVar5, lVar2, new TravelMilesFlightSearchResultsFlowContract$Step.FlightDetails(tVar.f215484a, tVar.f215485b, tVar.d, tVar.f215486c), true, null, false, 12);
                return Unit.f186387a;
            case 20:
                qe6.b bVar4 = (qe6.b) obj5;
                bh6.e eVar2 = (bh6.e) obj4;
                MandateConstraints mandateConstraints = bVar4.f245086a.f72226c;
                return new hh6.i(bVar4, mandateConstraints.f72227a, mandateConstraints.f72228b, false, eVar2);
            case 21:
                ogd.e eVar3 = (ogd.e) obj5;
                com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h hVar = (com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) obj4;
                hhd.h update3 = (hhd.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                LinkedHashMap linkedHashMapZ = r0.z(update3.f152394c);
                Iterable iterable = (Set) linkedHashMapZ.get(eVar3.f225109a.d);
                if (iterable == null) {
                    iterable = h0.f322473a;
                }
                Set setH12 = d0.h1(iterable);
                setH12.add(eVar3);
                linkedHashMapZ.put(eVar3.f225109a.d, setH12);
                List list4 = update3.d;
                if (list4 != null) {
                    arrayList = new ArrayList();
                    for (Object obj10 : list4) {
                        if (Intrinsics.f((String) obj10, ((WatchlistAddAssetFlowContract$LaunchMode.SingleSelection) hVar.o.f86940b).f86943a)) {
                            arrayList.add(obj10);
                        }
                    }
                }
                return hhd.h.a(update3, null, null, linkedHashMapZ, arrayList, null, 19);
            case 22:
                hi2.e update4 = (hi2.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return hi2.e.a(update4, (CreateRequestLinkData) ((hi2.k) obj5).invoke(((hi2.n) obj4).I2()), null, 0, 6);
            case 23:
                SavingsAccountDetails savingsAccount = (SavingsAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
                xi0.a aVar6 = xi0.b.Companion;
                String currency = savingsAccount.f86460a.getCurrency();
                aVar6.getClass();
                return hi6.b.c(savingsAccount, (LinkedHashSet) obj5, (n9l.a) ((Map) obj4).get(xi0.a.a(currency)));
            case 24:
                com.revolut.feature.credit.application.plugins.impl.ui.valuators.flow.a aVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.valuators.flow.a) obj5;
                yki.l lVar3 = (yki.l) obj4;
                ij4.h result5 = (ij4.h) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(aVar7, lVar3, new RecommendedValuatorsFlowContract$Step.Details(result5.f161703a), true, null, false, 12);
                return Unit.f186387a;
            case 25:
                jf0.c cVar3 = (jf0.c) obj5;
                hje.i iVar3 = (hje.i) obj4;
                Boolean deeplinkHandled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(deeplinkHandled, "deeplinkHandled");
                if (deeplinkHandled.booleanValue()) {
                    return efm.d0.m(Boolean.TRUE);
                }
                if (!Intrinsics.f(cVar3.d.get("destination"), "volatilityAlerts")) {
                    ufm.c cVar4 = new ufm.c(new h4d.d(iVar3, i3), i5);
                    Intrinsics.checkNotNullExpressionValue(cVar4, "fromCallable(...)");
                    return new ufm.i(cVar4, new hje.e(new hhd.n(10), i3), 1);
                }
                if (!((jte.d) iVar3.f152744c).c(CryptoOnboardingApi$Toggles.CryptoMarketNotificationSettings.f70883c)) {
                    return efm.d0.m(Boolean.TRUE);
                }
                efm.d0 d0VarFirstOrError = m70.a.g(iVar3.d.b(), null, null, 3).firstOrError();
                hje.e eVar4 = new hje.e(new hg4.a(iVar3, 9), i6);
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, eVar4, 0);
            case 26:
                hk0.a aVar8 = (hk0.a) obj5;
                String str6 = (String) obj4;
                Response response = (Response) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                Object objBody = response.body();
                if (objBody == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                InputStream inputStreamByteStream = ((ResponseBody) objBody).byteStream();
                ulm.u0 u0VarHeaders = response.headers();
                Intrinsics.checkNotNullExpressionValue(u0VarHeaders, "headers(...)");
                String strA = u0VarHeaders.a("content-type");
                if (Intrinsics.f(strA, "application/pdf")) {
                    fileExtension = FileExtension.Pdf.f51406b;
                } else {
                    if (!Intrinsics.f(strA, "text/csv")) {
                        throw new IllegalStateException("Not supported content type");
                    }
                    fileExtension = FileExtension.Csv.f51401b;
                }
                ufm.c cVar5 = new ufm.c(new a80.b((Object) inputStreamByteStream, (Object) aVar8, str6, (Serializable) fileExtension.getF51399a(), 3), i5);
                Intrinsics.checkNotNullExpressionValue(cVar5, "fromCallable(...)");
                return cVar5;
            case 27:
                return hk9.j.a((hk9.j) obj2, null, null, ((hk9.q) obj5).f152888s.e((dj0.d) obj4), false, 23);
            case 28:
                hlf.c cVar6 = (hlf.c) obj5;
                fof.f fVar2 = (fof.f) obj4;
                dii.g result6 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (Intrinsics.f(result6, dii.f.f115069a)) {
                    cVar6.V2(new hg0.n(cVar6, fVar2, obj, 12), new yi5.b(i2));
                }
                return Unit.f186387a;
            default:
                ((hlm.c) obj5).unlock(((hlm.b) obj4).f153480b);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(hi6.g gVar, LinkedHashSet linkedHashSet, Map map) {
        this.f149969a = 23;
        this.f149970b = linkedHashSet;
        this.f149971c = map;
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f149969a = i;
        this.f149970b = obj2;
        this.f149971c = obj3;
    }

    public /* synthetic */ b(String str, hde.i iVar) {
        this.f149969a = 7;
        this.f149971c = str;
        this.f149970b = iVar;
    }
}
