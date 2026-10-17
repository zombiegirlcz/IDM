package zkh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub;
import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements z87.d {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f323024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fsl.m f323025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f323026c;
    public final ugc.a d;
    public final o97.r e;
    public final ihm.b f;

    public p(gte.a featureToggleInteractor, fsl.m investOrdersWidgetProvider, htl.l commonContractNavigationProvider, n assetsSearchFilter, ugc.a mapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(commonContractNavigationProvider, "commonContractNavigationProvider");
        Intrinsics.checkNotNullParameter(assetsSearchFilter, "assetsSearchFilter");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f323024a = featureToggleInteractor;
        this.f323025b = investOrdersWidgetProvider;
        this.f323026c = assetsSearchFilter;
        this.d = mapper;
        this.e = o97.r.WEALTH_ASSETS_ORDERS;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f = bVarE;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = Boolean.FALSE;
        if (!((jte.d) this.f323024a).c(FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c)) {
            bool = null;
        }
        efm.r rVarCombineLatest = efm.r.combineLatest(rd0.e.c(((fsl.w) this.f323025b).a(new InvestOrdersParams.OrdersAll((k4l.d) null, bool, (String) null, 13)), kotlin.coroutines.g.f186406a), this.f, new zii.e(new zaf.d(this, searchQuery, 2), 13));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.e;
    }

    @Override // z87.f
    public final Object l(String str, o97.y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        boolean z = obj2 instanceof clh.u;
        o97.e eVar = o97.e.f223096a;
        if (!z) {
            return obj2 instanceof InvestOrderExtended ? new o97.d(htl.l.a((InvestOrderExtended) obj2)) : eVar;
        }
        this.f.onNext(Boolean.valueOf(((clh.u) obj2).f25012b));
        return eVar;
    }
}
