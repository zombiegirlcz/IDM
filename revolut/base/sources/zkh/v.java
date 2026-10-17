package zkh;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements z87.e {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f323037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f323038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.i f323039c;
    public final b4f.b d;
    public final ihm.b e;
    public o5d.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o97.r f323040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f323041h;

    public v(h delegate, f01.c uiKitResources, ybl.i productGroupAvailabilityInteractor, b4f.b temporaryInstrumentRefProvider) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(temporaryInstrumentRefProvider, "temporaryInstrumentRefProvider");
        this.f323037a = delegate;
        this.f323038b = uiKitResources;
        this.f323039c = productGroupAvailabilityInteractor;
        this.d = temporaryInstrumentRefProvider;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.e = bVarE;
        this.f323040g = o97.r.TRADING_HOLDINGS;
        this.f323041h = yhm.j.b(new zj9.a(5));
    }

    public static List m(List list, boolean z) {
        o97.d0 f0Var;
        if (list.size() > 3) {
            f0Var = new o97.g0(new TextLocalisedClause(R$string.wealth_search_category_portfolio_name, null, null, 14), new TextLocalisedClause(z ? com.revolut.feature.globalsearch.api.R$string.search_block_header_show_less : com.revolut.feature.globalsearch.api.R$string.search_block_header_show_more, null, null, 14), "HOLDINGS_HEADER", new o97.y(o97.r.TRADING_HOLDINGS, null, null, 62));
        } else {
            f0Var = new o97.f0(new TextLocalisedClause(R$string.wealth_search_category_portfolio_name, null, null, 14), "HOLDINGS_HEADER");
        }
        if (!z) {
            list = zhm.d0.V0(list, 3);
        }
        List list2 = list;
        yp0.b.k(list2, 0, 0, 0, 0, 31);
        return zhm.v.k(f0Var, new o97.e0(list2));
    }

    @Override // z87.e
    public final o97.m a() {
        return (o97.m) this.f323041h.getValue();
    }

    @Override // z87.e
    public final efm.r e(String searchQuery, GlobalSearchContext context, efm.r remoteObservable) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        efm.r rVarG = m70.a.g(rd0.e.c(((ael.h0) this.f323039c).b(cfl.p.BONDS), kotlin.coroutines.g.f186406a), null, new zk1.p(6), 1);
        zhm.f0 f0Var = zhm.f0.f322471a;
        efm.r rVarSwitchMap = ue0.e.E(rVarG, new ybl.h(f0Var, f0Var)).switchMap(new zii.e(new yrk.e(searchQuery, 18, this, remoteObservable), 14));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // z87.f
    public final void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : extensions) {
            if (obj2 instanceof o5d.a) {
                arrayList.add(obj2);
            }
        }
        this.f = (o5d.a) zhm.d0.M0(arrayList);
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f323040g;
    }

    @Override // z87.f
    public final Object l(String str, o97.y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        Object obj3 = yVar.e;
        boolean zF = Intrinsics.f(str, "HOLDINGS_HEADER");
        o97.e eVar = o97.e.f223096a;
        if (zF) {
            this.e.onNext(Boolean.valueOf(!pd.b.j((Boolean) r9.f())));
            return eVar;
        }
        if (obj3 instanceof vh) {
            o5d.a aVar = this.f;
            if (aVar != null) {
                aVar.b3((vh) obj3);
                return eVar;
            }
        } else if (Intrinsics.f(yVar.f223137c, "details") && (obj2 instanceof e)) {
            return new o97.d(new AssetDetailsDestination(((e) obj2).f322990a.e, null, false, null, null, null, 62));
        }
        return eVar;
    }
}
