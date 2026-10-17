package ks0;

import androidx.lifecycle.LifecycleOwner;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ContextualSegmentedBarDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistControllerContract$InputData;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_api.models.OrderQuoteExtraData;
import com.revolut.retail.feature.payments.payment_links.impl.data.TransferLinkService;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import efm.r;
import ghk.x;
import io.reactivex.rxjava3.disposables.Disposable;
import ix0.d2;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import nl.g0;
import o9k.v0;
import q50.o0;
import skm.a2;
import skm.c2;
import skm.e0;
import skm.p0;
import vkm.q;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements d2, o, kfm.b, l5i.h, igm.g, y50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f189085b;

    public n(x function) {
        this.f189084a = 13;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f189085b = function;
    }

    @Override // ix0.d2
    public void D(boolean z) {
        a5h.g gVar = (a5h.g) this.f189085b;
        if (!z) {
            a2 a2Var = (a2) gVar.f1406b;
            if (a2Var != null) {
                a2Var.f(null);
            }
            gVar.f1406b = null;
            return;
        }
        if (((CoroutineScope) gVar.e) == null) {
            c2 c2VarE = e0.e();
            p0 p0Var = p0.f264001a;
            gVar.e = e0.c(kotlin.coroutines.e.d(c2VarE, zkm.o.f323119a.e));
        }
        gVar.z0();
    }

    @Override // l5i.h
    public Clause a(l5i.g gVar) {
        return new TextLocalisedClause(R$string.wealth_robo_breakdown_subtitle, null, null, 14);
    }

    @Override // igm.g
    public void accept(Object obj2) {
        switch (this.f189084a) {
            case 15:
                Disposable it8 = (Disposable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                hx7.e.f(((g0) this.f189085b).f216908a);
                break;
            default:
                Disposable it9 = (Disposable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                hx7.e.f(((ol.l) this.f189085b).f226273a);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f189084a) {
            case 4:
                return ((lak.l) this.f189085b).invoke(obj2);
            case 6:
                return ((lak.l) this.f189085b).invoke(obj2);
            case 7:
                return ((lak.l) this.f189085b).invoke(obj2);
            case 9:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length == 5) {
                    return ((kfm.j) this.f189085b).d(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
                }
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            case 11:
                return ((ms2.j) this.f189085b).invoke(obj2);
            case 12:
                return ((ms2.j) this.f189085b).invoke(obj2);
            case 13:
                return ((x) this.f189085b).invoke(obj2);
            case 18:
                return ((o3l.m) this.f189085b).invoke(obj2);
            case 25:
                return ((pjg.k) this.f189085b).invoke(obj2);
            default:
                return ((pzc.g) this.f189085b).invoke(obj2);
        }
    }

    public Flow b(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ia7.n nVar = (ia7.n) ((ia7.e) this.f189085b);
        nVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.q(nim.a.v(nVar.i.b(Unit.f186387a, loadingStrategy), new i9g.e0(10)));
    }

    public Flow c(TripsMapBitmapConfig config, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ia7.n nVar = (ia7.n) ((ia7.e) this.f189085b);
        nVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.q(t1.E(nim.a.v(nVar.f159970j.b(Unit.f186387a, loadingStrategy), new i25.e(nVar, config, 13))));
    }

    public r d(kxc.c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        h30.q qVar = (h30.q) this.f189085b;
        Intrinsics.checkNotNullParameter(config, "config");
        return nim.a.w(((w4l.f) qVar.e).f(config, false), new kxc.g(qVar, 0));
    }

    public InvestOrdersParams e(ptl.b variant) {
        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = (InvestOrdersListFeatureContract$InputData) this.f189085b;
        Intrinsics.checkNotNullParameter(variant, "variant");
        int i = ptl.c.f239780a[variant.ordinal()];
        if (i == 1) {
            return investOrdersListFeatureContract$InputData.getF91757a().d(null);
        }
        if (i == 2) {
            return investOrdersListFeatureContract$InputData.getF91757a().d(Boolean.TRUE);
        }
        if (i == 3) {
            return investOrdersListFeatureContract$InputData.getF91757a().d(Boolean.FALSE);
        }
        throw new NoWhenBranchMatchedException();
    }

    public InvestOrdersParams f() {
        ptl.b bVar;
        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = (InvestOrdersListFeatureContract$InputData) this.f189085b;
        if (investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.PendingOrders) {
            bVar = ptl.b.ALL;
        } else {
            if (!(investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.RecurringOrders)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = ptl.b.INCLUDE_ONLY_RECURRING_BUYS;
        }
        return e(bVar);
    }

    @Override // y50.a
    public void h1(fx.d dVar, koi.c delegatesManager) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        koi.k kVarC = delegatesManager.c(ContextualSegmentedBarDelegate.class);
        if (kVarC == null) {
            kVarC = new ContextualSegmentedBarDelegate();
            delegatesManager.a(kVarC);
        }
        e0.C(dVar.f138715a, null, null, new q03.m(rd0.e.b(((ContextualSegmentedBarDelegate) kVarC).k), new o0(this), null, 14), 3);
    }

    @Override // d4i.i
    public List j(OrderQuote quote, d4i.h itemsConfig, OrderQuoteExtraData orderQuoteExtraData) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(itemsConfig, "itemsConfig");
        return ((n5i.f) this.f189085b).j(quote, itemsConfig, orderQuoteExtraData);
    }

    @Override // l5i.h
    public TextLocalisedClause n(OrderQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        return ((n5i.f) this.f189085b).n(quote);
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f189084a = i;
        this.f189085b = obj2;
    }

    public n(lak.l function) {
        this.f189084a = 4;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f189085b = function;
    }

    public n(lak.l function, byte b4) {
        this.f189084a = 6;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f189085b = function;
    }

    public n(lak.l function, char c2) {
        this.f189084a = 7;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f189085b = function;
    }

    public n(ms2.j function) {
        this.f189084a = 11;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f189085b = function;
    }

    public n(ms2.j function, byte b4) {
        this.f189084a = 12;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f189085b = function;
    }

    public n(o3l.m function) {
        this.f189084a = 18;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f189085b = function;
    }

    public n(pjg.k function) {
        this.f189084a = 25;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f189085b = function;
    }

    public n(pzc.g function) {
        this.f189084a = 26;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f189085b = function;
    }

    public n(InvestOrdersListFeatureContract$InputData inputData) {
        this.f189084a = 24;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f189085b = inputData;
    }

    @Override // kfm.b
    public void accept(Object obj2, Object obj3) {
        ((Map) obj2).put(((o) this.f189085b).apply(obj3), obj3);
    }

    public n(SlotChecklistControllerContract$InputData inputData) {
        this.f189084a = 5;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f189085b = inputData;
    }

    public n(TransferLinkService service) {
        this.f189084a = 8;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f189085b = service;
    }

    public n(q50.p0 model) {
        this.f189084a = 27;
        Intrinsics.checkNotNullParameter(model, "model");
        this.f189085b = model;
    }

    public n(n5i.f currencyExchangeBreakdownMapper) {
        this.f189084a = 14;
        Intrinsics.checkNotNullParameter(currencyExchangeBreakdownMapper, "currencyExchangeBreakdownMapper");
        this.f189085b = currencyExchangeBreakdownMapper;
    }

    public n(nd.k projectionsProvider, qoc.l maxYLabelProvider, usc.a paymentsCountProvider, qoc.k investmentHorizonProvider) {
        this.f189084a = 29;
        Intrinsics.checkNotNullParameter(projectionsProvider, "projectionsProvider");
        Intrinsics.checkNotNullParameter(maxYLabelProvider, "maxYLabelProvider");
        Intrinsics.checkNotNullParameter(paymentsCountProvider, "paymentsCountProvider");
        Intrinsics.checkNotNullParameter(investmentHorizonProvider, "investmentHorizonProvider");
        this.f189085b = paymentsCountProvider;
    }

    public n(h30.q instructionsRepository) {
        this.f189084a = 1;
        Intrinsics.checkNotNullParameter(instructionsRepository, "instructionsRepository");
        this.f189085b = instructionsRepository;
    }

    public n(LifecycleOwner lifecycleOwner) {
        this.f189084a = 16;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f189085b = lifecycleOwner;
    }

    public n(l61.a userCompanyInteractor) {
        this.f189084a = 28;
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f189085b = userCompanyInteractor;
    }

    public n(ia7.e repository) {
        this.f189084a = 3;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f189085b = repository;
    }

    public n(jkg.d paginationInteractor) {
        this.f189084a = 23;
        Intrinsics.checkNotNullParameter(paginationInteractor, "paginationInteractor");
        this.f189085b = paginationInteractor;
    }

    public n(zhd.b shopsBrandRecentSearchDao, l80.e dateProvider) {
        this.f189084a = 19;
        Intrinsics.checkNotNullParameter(shopsBrandRecentSearchDao, "shopsBrandRecentSearchDao");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f189085b = shopsBrandRecentSearchDao;
    }

    public n(v0 transferResultExtension) {
        this.f189084a = 17;
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        this.f189085b = transferResultExtension;
    }

    public n(f80.a uriHelper) {
        this.f189084a = 2;
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f189085b = uriHelper;
    }

    public n() {
        this.f189084a = 22;
        this.f189085b = new ConcurrentHashMap();
    }
}
