package tnb;

import aw0.l6;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.iris.impl.data.IrisPayService;
import com.revolut.feature.contacts.impl.data.network.UserService;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ux0.d1;
import zhm.a1;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 implements kfm.o, d1, q2h.k, o2h.a, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f272384b;

    public g0(m2j.g function) {
        this.f272383a = 27;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f272384b = function;
    }

    public static TextLocalisedClause d(uib.c umbrellaNameType) {
        Intrinsics.checkNotNullParameter(umbrellaNameType, "umbrellaNameType");
        return new TextLocalisedClause(oc.c.r(umbrellaNameType), null, null, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.revolut.core.ui_kit.models.TextLocalisedClause a(java.util.List r10, wi0.b r11) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tnb.g0.a(java.util.List, wi0.b):com.revolut.core.ui_kit.models.TextLocalisedClause");
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f272383a) {
            case 3:
                return ((t33.r) this.f272384b).invoke(obj2);
            case 13:
                return ((vx5.r) this.f272384b).invoke(obj2);
            case 18:
                return ((wrj.p) this.f272384b).invoke(obj2);
            case 25:
                return ((x94.q) this.f272384b).invoke(obj2);
            default:
                return ((xy7.n) this.f272384b).invoke(obj2);
        }
    }

    @Override // o2h.a
    public void b(bfl.g tradeSide, hdh.e actions) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(actions, "actions");
        ((gdh.a) this.f272384b).b3(tradeSide, actions, false);
    }

    @Override // q2h.k
    public RowDelegate c() {
        return (RowDelegate) this.f272384b;
    }

    public ufm.n e(Set phones) {
        Intrinsics.checkNotNullParameter(phones, "phones");
        if (phones.size() <= 1) {
            phones = a1.m(phones, "+444444444444");
        }
        return te0.w.i0(((UserService) this.f272384b).userExists(zhm.d0.k0(phones, ";", null, null, 0, null, 62)));
    }

    public boolean f(l6 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) this.f272384b;
        Intrinsics.checkNotNullParameter(product, "product");
        return accountsNavBarContentView.A.h(product);
    }

    public Object g(gim.c cVar) {
        return vkm.q.x(mo3.a.f(((vf5.d) this.f272384b).b(w4l.h.f294642c), new ud3.f0(14), new u3b.h(11), new ud3.f0(15)), cVar);
    }

    public akg.n h() {
        return nim.a.v(ybl.l.d((ybl.l) this.f272384b), new x8h.h(17));
    }

    public synchronized void i(Object obj2) {
        Iterator it8 = ((HashSet) this.f272384b).iterator();
        while (it8.hasNext()) {
            ((tc.a) it8.next()).a(obj2);
        }
    }

    @Override // kfm.p
    public /* synthetic */ boolean test(Object obj2) {
        return ((Boolean) ((m2j.g) this.f272384b).invoke(obj2)).booleanValue();
    }

    public g0(t33.r function) {
        this.f272383a = 3;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f272384b = function;
    }

    public g0(vx5.r function) {
        this.f272383a = 13;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f272384b = function;
    }

    public g0(wrj.p function) {
        this.f272383a = 18;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f272384b = function;
    }

    public g0(x94.q function) {
        this.f272383a = 25;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f272384b = function;
    }

    public g0(xy7.n function) {
        this.f272383a = 28;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f272384b = function;
    }

    public g0(int i) {
        this.f272383a = i;
        switch (i) {
            case 14:
                this.f272384b = new HashSet();
                break;
        }
    }

    public g0(usb.p hintMapper) {
        this.f272383a = 8;
        Intrinsics.checkNotNullParameter(hintMapper, "hintMapper");
        this.f272384b = hintMapper;
    }

    public g0(com.revolut.analytics.tracking.v3.d diagnosticEventTracker) {
        this.f272383a = 29;
        Intrinsics.checkNotNullParameter(diagnosticEventTracker, "diagnosticEventTracker");
        this.f272384b = diagnosticEventTracker;
    }

    public g0(o7.b repository) {
        this.f272383a = 6;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f272384b = repository;
    }

    public g0(a12.j apmAreaMapper) {
        this.f272383a = 22;
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        this.f272384b = apmAreaMapper;
    }

    public g0(c1i.g fxOrderRepository) {
        this.f272383a = 20;
        Intrinsics.checkNotNullParameter(fxOrderRepository, "fxOrderRepository");
        this.f272384b = fxOrderRepository;
    }

    public g0(svl.g tutorialScreenMapper) {
        this.f272383a = 2;
        Intrinsics.checkNotNullParameter(tutorialScreenMapper, "tutorialScreenMapper");
        this.f272384b = tutorialScreenMapper;
    }

    public g0(IrisPayService service) {
        this.f272383a = 5;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f272384b = service;
    }

    public g0(UserService userService) {
        this.f272383a = 16;
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.f272384b = userService;
    }

    public g0(gdh.a navigationExtension) {
        this.f272383a = 23;
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        this.f272384b = navigationExtension;
    }

    public g0(k1f.k repository) {
        this.f272383a = 4;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f272384b = repository;
    }

    public g0(je0.d objectMapper) {
        this.f272383a = 15;
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        this.f272384b = objectMapper;
    }

    public g0(vf5.d interactor) {
        this.f272383a = 7;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f272384b = interactor;
    }

    public g0(cve.c repository) {
        this.f272383a = 12;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f272384b = repository;
    }

    public g0(p5k.x transferBreakdownMapper) {
        this.f272383a = 17;
        Intrinsics.checkNotNullParameter(transferBreakdownMapper, "transferBreakdownMapper");
        this.f272384b = transferBreakdownMapper;
    }

    public g0(lfg.w travelMilesRecommendedFlightsRepository) {
        this.f272383a = 10;
        Intrinsics.checkNotNullParameter(travelMilesRecommendedFlightsRepository, "travelMilesRecommendedFlightsRepository");
        this.f272384b = travelMilesRecommendedFlightsRepository;
    }

    public g0(ybl.l tradingConfigInteractor) {
        this.f272383a = 21;
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f272384b = tradingConfigInteractor;
    }

    public g0(dha.c pricingPlanRepository) {
        this.f272383a = 24;
        Intrinsics.checkNotNullParameter(pricingPlanRepository, "pricingPlanRepository");
        this.f272384b = pricingPlanRepository;
    }

    public g0(dcd.b savingsInterestRateFormatter) {
        this.f272383a = 0;
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f272384b = savingsInterestRateFormatter;
    }

    public g0(ne0.d memoryCache) {
        this.f272383a = 26;
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f272384b = memoryCache;
    }

    public g0(hph.c collectionMapper) {
        this.f272383a = 1;
        Intrinsics.checkNotNullParameter(collectionMapper, "collectionMapper");
        this.f272384b = collectionMapper;
    }

    public g0(BondDetailsController bondDetailsController) {
        this.f272383a = 19;
        this.f272384b = bondDetailsController.g0;
    }

    public g0(AccountsNavBarContentView accountsNavBarContentView) {
        this.f272383a = 9;
        this.f272384b = accountsNavBarContentView;
    }
}
