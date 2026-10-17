package a83;

import com.google.android.gms.wallet.WalletConstants;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.credit.card.api.models.cancellation.RepaymentDeferral;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreenContract$AllowancePage;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f2077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f2078c;

    public /* synthetic */ p0(Data data, Data data2, int i) {
        this.f2076a = i;
        this.f2077b = data;
        this.f2078c = data2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        String selectedPagerItemId;
        Data data;
        List list;
        List listJ;
        int size;
        switch (this.f2076a) {
            case 0:
                return o.a((o) obj2, null, null, null, null, null, null, null, null, false, null, null, false, this.f2077b, this.f2078c, 16383);
            case 1:
                Data data2 = this.f2077b;
                Intrinsics.h(data2);
                return ah1.e.a((ah1.e) obj2, data2, null, this.f2078c, 14);
            case 2:
                aq4.e eVar = (aq4.e) obj2;
                dj0.d repaymentAmount = eVar.f8247a;
                RepaymentDeferral repaymentDeferral = eVar.f8249c;
                PayoffBreakdown payoffBreakdown = eVar.d;
                Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
                Data sourcePocketData = this.f2077b;
                Intrinsics.checkNotNullParameter(sourcePocketData, "sourcePocketData");
                Data countryCode = this.f2078c;
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                return new aq4.e(repaymentAmount, sourcePocketData, repaymentDeferral, payoffBreakdown, countryCode);
            case 3:
                axi.l update = (axi.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data3 = this.f2077b;
                if (data3 == null) {
                    data3 = update.f10955h;
                }
                Data data4 = data3;
                Data data5 = this.f2078c;
                if (data5 == null) {
                    data5 = update.i;
                }
                return axi.l.a(update, 0, null, null, null, null, false, data4, data5, null, null, null, 3711);
            case 4:
                String str = ((b73.e) obj2).f12871b;
                Data domainContent = this.f2077b;
                Intrinsics.checkNotNullParameter(domainContent, "domainContent");
                Data ownersFirstNamesContent = this.f2078c;
                Intrinsics.checkNotNullParameter(ownersFirstNamesContent, "ownersFirstNamesContent");
                return new b73.e(domainContent, ownersFirstNamesContent, str);
            case 5:
                b9d.e eVar2 = (b9d.e) obj2;
                String entityId = eVar2.f13715a;
                boolean z = eVar2.d;
                String str2 = eVar2.e;
                Intrinsics.checkNotNullParameter(entityId, "entityId");
                Data card = this.f2077b;
                Intrinsics.checkNotNullParameter(card, "card");
                Data actions = this.f2078c;
                Intrinsics.checkNotNullParameter(actions, "actions");
                return new b9d.e(entityId, card, actions, z, str2);
            case 6:
                Data data6 = this.f2078c;
                Intrinsics.h(data6);
                return bbg.j.a((bbg.j) obj2, this.f2077b, data6, null, null, null, null, null, null, null, null, 2044);
            case 7:
                Data kycData = this.f2078c;
                Intrinsics.h(kycData);
                ((bh8.f) obj2).getClass();
                Data migrationAssetData = this.f2077b;
                Intrinsics.checkNotNullParameter(migrationAssetData, "migrationAssetData");
                Intrinsics.checkNotNullParameter(kycData, "kycData");
                return new bh8.f(migrationAssetData, kycData);
            case 8:
                return cig.e.a((cig.e) obj2, this.f2077b, this.f2078c, null, 4);
            case 9:
                cui.l update2 = (cui.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data7 = this.f2077b;
                if (data7 == null) {
                    data7 = update2.f;
                }
                Data data8 = data7;
                Data data9 = this.f2078c;
                if (data9 == null) {
                    data9 = update2.f109010g;
                }
                return cui.l.a(update2, null, null, null, null, null, data8, data9, false, null, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE);
            case 10:
                return cvi.f.a((cvi.f) obj2, this.f2077b, this.f2078c, 0, 4);
            case 11:
                dc8.b bVar = (dc8.b) obj2;
                List pagerItems = (List) this.f2077b.getContent();
                if (pagerItems == null) {
                    pagerItems = bVar.f112814b;
                }
                Iterator it8 = pagerItems.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((JuniorAllowancePagerScreenContract$AllowancePage) next).f76837a, bVar.f112813a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                JuniorAllowancePagerScreenContract$AllowancePage juniorAllowancePagerScreenContract$AllowancePage = (JuniorAllowancePagerScreenContract$AllowancePage) next;
                if (juniorAllowancePagerScreenContract$AllowancePage == null || (selectedPagerItemId = juniorAllowancePagerScreenContract$AllowancePage.f76837a) == null) {
                    JuniorAllowancePagerScreenContract$AllowancePage juniorAllowancePagerScreenContract$AllowancePage2 = (JuniorAllowancePagerScreenContract$AllowancePage) zhm.d0.d0(pagerItems);
                    selectedPagerItemId = juniorAllowancePagerScreenContract$AllowancePage2 != null ? juniorAllowancePagerScreenContract$AllowancePage2.f76837a : bVar.f112813a;
                }
                bVar.getClass();
                Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                Data user = this.f2078c;
                Intrinsics.checkNotNullParameter(user, "user");
                return new dc8.b(user, selectedPagerItemId, pagerItems);
            case 12:
                return do8.i.a((do8.i) obj2, this.f2077b, this.f2078c, null, 4);
            case 13:
                ((e1d.d) obj2).getClass();
                Data supervisionConfig = this.f2077b;
                Intrinsics.checkNotNullParameter(supervisionConfig, "supervisionConfig");
                Data guardianInvitation = this.f2078c;
                Intrinsics.checkNotNullParameter(guardianInvitation, "guardianInvitation");
                return new e1d.d(supervisionConfig, guardianInvitation);
            case 14:
                Data data10 = this.f2077b;
                Intrinsics.h(data10);
                return ec8.g.a((ec8.g) obj2, null, data10, this.f2078c, null, 9);
            case 15:
                ((eq8.l) obj2).getClass();
                Data juniorProfileData = this.f2077b;
                Intrinsics.checkNotNullParameter(juniorProfileData, "juniorProfileData");
                Data tasksAndCoparentsData = this.f2078c;
                Intrinsics.checkNotNullParameter(tasksAndCoparentsData, "tasksAndCoparentsData");
                return new eq8.l(juniorProfileData, tasksAndCoparentsData);
            case 16:
                return ezk.a.a((ezk.a) obj2, this.f2077b, this.f2078c, null, 4);
            case 17:
                Address addressI = ((fa8.f) obj2).f133251b;
                Data juniorProfile = this.f2077b;
                if (addressI == null) {
                    com.revolut.feature.junior_profile.api.models.a aVar = (com.revolut.feature.junior_profile.api.models.a) juniorProfile.getContent();
                    addressI = aVar != null ? pw5.a.i(aVar) : null;
                }
                Data featureConfigs = this.f2078c;
                Intrinsics.h(featureConfigs);
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                Intrinsics.checkNotNullParameter(featureConfigs, "featureConfigs");
                return new fa8.f(juniorProfile, addressI, featureConfigs);
            case 18:
                return fvk.m.f((fvk.m) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f2077b, this.f2078c, null, null, null, 950271);
            case 19:
                ((g27.n) obj2).getClass();
                Data orderInitiationPageData = this.f2077b;
                Intrinsics.checkNotNullParameter(orderInitiationPageData, "orderInitiationPageData");
                Data orders = this.f2078c;
                Intrinsics.checkNotNullParameter(orders, "orders");
                return new g27.n(orderInitiationPageData, orders);
            case 20:
                g75.e update3 = (g75.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data loanDetails = this.f2078c;
                Intrinsics.h(loanDetails);
                update3.getClass();
                Data disclaimer = this.f2077b;
                Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                return new g75.e(disclaimer, loanDetails);
            case 21:
                hfg.y yVar = ((gig.g) obj2).f144191c;
                Data recommendedFlightsData = this.f2077b;
                if (yVar == null) {
                    try {
                        Object content = recommendedFlightsData.getContent();
                        data = new Data(content != null ? (hfg.y) zhm.d0.d0(((hfg.z) content).f151909h) : null, recommendedFlightsData.getError(), recommendedFlightsData.getLoading());
                    } catch (Throwable th10) {
                        data = new Data(null, th10, recommendedFlightsData.getLoading());
                    }
                    yVar = (hfg.y) data.getContent();
                    break;
                }
                Intrinsics.checkNotNullParameter(recommendedFlightsData, "recommendedFlightsData");
                Data milesProviderData = this.f2078c;
                Intrinsics.checkNotNullParameter(milesProviderData, "milesProviderData");
                return new gig.g(recommendedFlightsData, milesProviderData, yVar);
            case 22:
                return hui.k.a((hui.k) obj2, null, null, this.f2077b, null, this.f2078c, null, null, 107);
            case 23:
                return j0i.a.a((j0i.a) obj2, null, null, null, null, null, null, this.f2077b, this.f2078c, null, null, 831);
            case 24:
                ((j2f.e) obj2).getClass();
                Data agentDetails = this.f2077b;
                Intrinsics.checkNotNullParameter(agentDetails, "agentDetails");
                Data userVouchers = this.f2078c;
                Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
                return new j2f.e(agentDetails, userVouchers);
            case 25:
                Data rates = this.f2078c;
                Intrinsics.h(rates);
                ((kh5.a) obj2).getClass();
                Data lockedBalances = this.f2077b;
                Intrinsics.checkNotNullParameter(lockedBalances, "lockedBalances");
                Intrinsics.checkNotNullParameter(rates, "rates");
                return new kh5.a(lockedBalances, rates);
            case 26:
                return kui.e.a((kui.e) obj2, this.f2077b, this.f2078c, null, 4);
            case 27:
                l10.p pVar = (l10.p) obj2;
                Data data11 = this.f2078c;
                return l10.p.a(pVar, this.f2077b, (data11 == null || (list = (List) data11.getContent()) == null || (size = (listJ = nkm.y.J(nkm.y.k(nkm.y.x(nkm.y.t(nkm.y.t(zhm.d0.Q(list), new l0g.a(2)), new l0g.a(3)), new l0g.a(4))))).size()) == 0) ? null : size != 1 ? o5l.u.UNKNOWN : (o5l.u) zhm.d0.b0(listJ), null, 477);
            default:
                return m9d.z.a((m9d.z) obj2, null, null, null, null, null, this.f2077b, null, null, this.f2078c, null, null, false, false, null, null, null, false, 261855);
        }
    }

    public /* synthetic */ p0(Data data, l10.n nVar, Data data2) {
        this.f2076a = 27;
        this.f2077b = data;
        this.f2078c = data2;
    }
}
