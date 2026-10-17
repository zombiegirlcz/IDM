package dsd;

import aw0.o9;
import bnh.e0;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileFeatureConfig;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillFeatureConfig;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardAddCardFeatureConfig;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceInputData;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.d0;
import ft3.d1;
import ft3.j1;
import ip0.jl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import o97.m;
import o97.o;
import o97.y;
import ox5.t0;
import rsd.k;
import skm.p0;
import tfm.n4;
import x5k.n;
import x5k.p;
import x5k.q;
import x5k.r;
import x5k.s;
import zh9.u0;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.w;
import zhm.y0;
import zsd.l;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f117299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f117300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f117301c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f117302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f117303h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f117304j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f117305l;

    public i(gsd.c cashTotalWealthGroupProvider, vsd.c linkedDebitCardTotalWealthGroupProvider, l savingsTotalWealthGroupProvider, k investTotalWealthGroupProvider, psd.j cryptoTotalWealthGroupProvider, gsd.c customAssetsTotalWealthGroupProvider, osd.e creditCardTotalWealthGroupProvider, vsd.c linkedCreditCardTotalWealthGroupProvider, gsd.c payLaterTotalWealthGroupProvider, xsd.i loanTotalWealthGroupProvider, xld.d netWorthEmptyStatesAvailabilityInteractor, xq3.j creditApplicationInteractor) {
        Intrinsics.checkNotNullParameter(cashTotalWealthGroupProvider, "cashTotalWealthGroupProvider");
        Intrinsics.checkNotNullParameter(linkedDebitCardTotalWealthGroupProvider, "linkedDebitCardTotalWealthGroupProvider");
        Intrinsics.checkNotNullParameter(savingsTotalWealthGroupProvider, "savingsTotalWealthGroupProvider");
        Intrinsics.checkNotNullParameter(investTotalWealthGroupProvider, "investTotalWealthGroupProvider");
        Intrinsics.checkNotNullParameter(cryptoTotalWealthGroupProvider, "cryptoTotalWealthGroupProvider");
        Intrinsics.checkNotNullParameter(customAssetsTotalWealthGroupProvider, "customAssetsTotalWealthGroupProvider");
        Intrinsics.checkNotNullParameter(creditCardTotalWealthGroupProvider, "creditCardTotalWealthGroupProvider");
        Intrinsics.checkNotNullParameter(linkedCreditCardTotalWealthGroupProvider, "linkedCreditCardTotalWealthGroupProvider");
        Intrinsics.checkNotNullParameter(payLaterTotalWealthGroupProvider, "payLaterTotalWealthGroupProvider");
        Intrinsics.checkNotNullParameter(loanTotalWealthGroupProvider, "loanTotalWealthGroupProvider");
        Intrinsics.checkNotNullParameter(netWorthEmptyStatesAvailabilityInteractor, "netWorthEmptyStatesAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        this.f117299a = cashTotalWealthGroupProvider;
        this.f117300b = linkedDebitCardTotalWealthGroupProvider;
        this.f117301c = savingsTotalWealthGroupProvider;
        this.d = investTotalWealthGroupProvider;
        this.e = cryptoTotalWealthGroupProvider;
        this.f = customAssetsTotalWealthGroupProvider;
        this.f117302g = creditCardTotalWealthGroupProvider;
        this.f117303h = linkedCreditCardTotalWealthGroupProvider;
        this.i = payLaterTotalWealthGroupProvider;
        this.f117304j = loanTotalWealthGroupProvider;
        this.k = netWorthEmptyStatesAvailabilityInteractor;
        this.f117305l = creditApplicationInteractor;
    }

    public static final int a(i iVar, amd.j jVar, Set set) {
        iVar.getClass();
        amd.b bVar = jVar.f6332a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = amd.c.f6309a[bVar.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            return 0;
        }
        List list = jVar.f6333b;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(((amd.d) it8.next()).f6314c, arrayList);
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        if (bVar == amd.b.LINKED_CREDIT_CARDS) {
            return set.size();
        }
        Set set2 = set;
        ArrayList arrayList2 = new ArrayList(w.t(set2, 10));
        Iterator it9 = set2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((d1) it9.next()).f137810a);
        }
        int i2 = g.f117297a[bVar.ordinal()];
        j1 j1Var = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : j1.BUY_NOW_PAY_LATER : j1.CREDIT_CARD : j1.FIXED_TERM_CREDIT;
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        return arrayList2.indexOf(j1Var);
    }

    public static List b(List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((o) next).f223122a == m.DEEPLINK) {
                break;
            }
        }
        o oVar = (o) next;
        List list2 = oVar != null ? oVar.f223123b : null;
        return list2 == null ? f0.f322471a : list2;
    }

    public d0 c(y searchPayload) {
        ufm.b bVarM;
        Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
        Object obj2 = searchPayload.f223136b;
        ly9.g gVar = obj2 instanceof ly9.g ? (ly9.g) obj2 : null;
        s action = gVar != null ? gVar.f200761a : null;
        if (action == null) {
            ufm.b bVarM2 = d0.m(o97.e.f223096a);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        a6k.d dVar = (a6k.d) ((a6k.a) this.d);
        Intrinsics.checkNotNullParameter(action, "action");
        if (action.equals(x5k.c.f)) {
            bVarM = d0.m(u0.f(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation(null, null, null, null, null, null, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.BENEFICIARY)), 63))));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        } else if (action.equals(x5k.d.f)) {
            bVarM = a6k.d.a(new PushToCardAddCardFeatureConfig(0));
        } else if (action.equals(p.f)) {
            bVarM = d0.m(((rae.c) dVar.d).h(AccountId.Personal.f51414a));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        } else if (action.equals(x5k.e.f)) {
            bVarM = ((zr9.a) dVar.f1707c).b();
        } else if (action instanceof x5k.f) {
            bVarM = a6k.d.a(new PaymentProfileFeatureConfig(ew9.a.USERNAME));
        } else if (action.equals(x5k.k.f)) {
            bVarM = a6k.d.a(new PaymentLinksFeatureConfig.CreatePaymentLink(hrf.f.INCOMING));
        } else if (action.equals(x5k.l.f)) {
            bVarM = a6k.d.a(new PaymentLinksFeatureConfig.CreatePaymentLink(hrf.f.OUTGOING));
        } else if (action instanceof x5k.o) {
            TransferFlowType.Default r62 = TransferFlowType.Default.f92257b;
            bVarM = a6k.d.a(new RemittanceBridgeFeatureConfig(new RemittanceInputData(null, 6)));
        } else if (action.equals(x5k.m.f)) {
            bVarM = a6k.d.a(new PaymentProfileFeatureConfig(ew9.a.QR_SCANNER));
        } else if (action.equals(n.f)) {
            bVarM = a6k.d.a(new PaymentProfileFeatureConfig(ew9.a.DETAILS));
        } else if (action instanceof q) {
            f01.c cVar = dVar.f1705a;
            String strO = a10.b.o(R.string.common_share, null, null, 14, cVar);
            int i = R$string.payments_quick_actions_share_link_text;
            x5k.b bVar = s.Companion;
            String username = ((q) action).f;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(username, "username");
            bVarM = d0.m(nd.o.i(strO, cVar.b(new TextLocalisedClause(i, u.c(new TextClause("revolut.me/" + username, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)).toString()));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        } else if (action.equals(r.f)) {
            bVarM = a6k.d.a(SplitBillFeatureConfig.ChooseBillsEmpty.f79823a);
        } else {
            if (!(action instanceof x5k.h)) {
                if (action.equals(x5k.j.f) || action.equals(x5k.i.f)) {
                    throw new IllegalStateException(a0.d.r(o0.f186429a.b(action.getClass()).m(), " is not supported because it should be handled outside"));
                }
                throw new NoWhenBranchMatchedException();
            }
            bVarM = d0.m(u0.f(new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(false, false, "searchQuickAction", null, 11)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        }
        if (!(action instanceof x5k.h)) {
            bVarM = te0.w.o0(p0.f264002b, new a6k.c(dVar, bVarM, null));
        }
        ufm.i iVar = new ufm.i(bVarM, new oy9.b(new t0(9), 1), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List d(imh.d r19, imh.j r20) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dsd.i.d(imh.d, imh.j):java.util.List");
    }

    public efm.r e(String searchQuery, efm.r remoteObservable, boolean z) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        Continuation continuation = null;
        n4 n4VarE = m70.a.g(remoteObservable, null, new ox5.d0(14), 1).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        efm.r rVarDistinctUntilChanged = n4VarE.map(new oy9.b(new t0(this), 2)).distinctUntilChanged();
        d0 d0VarFirstOrError = ((wt9.a) ((uo9.a) this.f117301c)).a().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        d0 d0VarFirstOrError2 = rd0.e.c(((cw9.d) ((fnc.s) this.e).f136657b).f109573b.A("PAYMENT_LINKS.p2p"), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
        d0 d0VarF = ((ang.f) this.f117300b).f(false);
        uq9.a aVar = (uq9.a) this.f;
        kotlinx.coroutines.d dVar = p0.f264003c;
        ufm.i iVar = new ufm.i(te0.w.K0(d0VarFirstOrError, d0VarFirstOrError2, d0VarF, te0.w.o0(dVar, new u83.f(aVar, continuation, 22)), te0.w.o0(dVar, new omg.e(this, continuation, 18))), new oy9.b(new oy9.a(this, 0), 0), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        efm.r rVarCombineLatest = efm.r.combineLatest(n4VarE, efm.r.combineLatest(rVarDistinctUntilChanged, iVar.x(), new oy9.b(new ox5.d0(15), 3)).switchMap(new oy9.b(new oy9.a(this, 1), 4)), new or2.e(new jl(this, searchQuery, z, 3), 28));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public i(f01.c uiKitResources, ang.f userInteractor, uo9.a paymentRulesInteractor, a6k.a paymentsQuickActionFactory, fnc.s paymentLinksStatusChecker, uq9.a groupBillsStatusChecker, cw9.d paymentsProductFeatureChecker, zq.a payWithPhotoFeatureChecker, wwa.b inviteCampaignHomeInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(paymentRulesInteractor, "paymentRulesInteractor");
        Intrinsics.checkNotNullParameter(paymentsQuickActionFactory, "paymentsQuickActionFactory");
        Intrinsics.checkNotNullParameter(paymentLinksStatusChecker, "paymentLinksStatusChecker");
        Intrinsics.checkNotNullParameter(groupBillsStatusChecker, "groupBillsStatusChecker");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(payWithPhotoFeatureChecker, "payWithPhotoFeatureChecker");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f117299a = uiKitResources;
        this.f117300b = userInteractor;
        this.f117301c = paymentRulesInteractor;
        this.d = paymentsQuickActionFactory;
        this.e = paymentLinksStatusChecker;
        this.f = groupBillsStatusChecker;
        this.f117302g = paymentsProductFeatureChecker;
        this.f117303h = payWithPhotoFeatureChecker;
        this.i = inviteCampaignHomeInteractor;
        this.f117304j = featureToggleInteractor;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.k = new zsc.h(new Pair(new oy9.d(uiKitResources, 0), zsc.p.MIDDLE_OF_THE_WORD));
        this.f117305l = new ConcurrentHashMap();
    }

    public i(gnh.m assetListWidgetMapper, imh.u widgetTitleMapper, imh.w widgetTypeMapper, imh.s widgetSeeAllVisibilityMapper, ogm.i collectionsWidgetMapper, lmh.o allAssetsScreenerWidgetMapper, b0 allAssetsWidgetMapper, omh.g allCommoditiesWidgetMapper, pmh.q allFundsWidgetMapper, aeh.e allMutualFundsWidgetMapper, inh.i earningsCallsWidgetMapper, qmh.a stocksByCountryWidgetMapper, anh.p recommendedBuysWidgetMapper, e0 strategiesWidgetMapper, wmh.g ipoSpotlightWidgetMapper, ymh.h privateBankBannerMapper) {
        Intrinsics.checkNotNullParameter(assetListWidgetMapper, "assetListWidgetMapper");
        Intrinsics.checkNotNullParameter(widgetTitleMapper, "widgetTitleMapper");
        Intrinsics.checkNotNullParameter(widgetTypeMapper, "widgetTypeMapper");
        Intrinsics.checkNotNullParameter(widgetSeeAllVisibilityMapper, "widgetSeeAllVisibilityMapper");
        Intrinsics.checkNotNullParameter(collectionsWidgetMapper, "collectionsWidgetMapper");
        Intrinsics.checkNotNullParameter(allAssetsScreenerWidgetMapper, "allAssetsScreenerWidgetMapper");
        Intrinsics.checkNotNullParameter(allAssetsWidgetMapper, "allAssetsWidgetMapper");
        Intrinsics.checkNotNullParameter(allCommoditiesWidgetMapper, "allCommoditiesWidgetMapper");
        Intrinsics.checkNotNullParameter(allFundsWidgetMapper, "allFundsWidgetMapper");
        Intrinsics.checkNotNullParameter(allMutualFundsWidgetMapper, "allMutualFundsWidgetMapper");
        Intrinsics.checkNotNullParameter(earningsCallsWidgetMapper, "earningsCallsWidgetMapper");
        Intrinsics.checkNotNullParameter(stocksByCountryWidgetMapper, "stocksByCountryWidgetMapper");
        Intrinsics.checkNotNullParameter(recommendedBuysWidgetMapper, "recommendedBuysWidgetMapper");
        Intrinsics.checkNotNullParameter(strategiesWidgetMapper, "strategiesWidgetMapper");
        Intrinsics.checkNotNullParameter(ipoSpotlightWidgetMapper, "ipoSpotlightWidgetMapper");
        Intrinsics.checkNotNullParameter(privateBankBannerMapper, "privateBankBannerMapper");
        this.f117299a = assetListWidgetMapper;
        this.f117300b = collectionsWidgetMapper;
        this.f117301c = allAssetsScreenerWidgetMapper;
        this.d = allAssetsWidgetMapper;
        this.e = allCommoditiesWidgetMapper;
        this.f = allFundsWidgetMapper;
        this.f117302g = allMutualFundsWidgetMapper;
        this.f117303h = earningsCallsWidgetMapper;
        this.i = stocksByCountryWidgetMapper;
        this.f117304j = recommendedBuysWidgetMapper;
        this.k = strategiesWidgetMapper;
        this.f117305l = ipoSpotlightWidgetMapper;
    }
}
