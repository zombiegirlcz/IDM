package blh;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x8h.v0;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements z87.d {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f16696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tzg.m f16697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nih.a f16698c;
    public final o97.r d;
    public final ihm.b e;
    public o5d.a f;

    public x(o7.d mapper, tzg.m wealthAccountsInteractor, nih.a wealthCommoditiesPerformanceInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthCommoditiesPerformanceInteractor, "wealthCommoditiesPerformanceInteractor");
        this.f16696a = mapper;
        this.f16697b = wealthAccountsInteractor;
        this.f16698c = wealthCommoditiesPerformanceInteractor;
        this.d = o97.r.WEALTH_COMMODITIES;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.e = bVarE;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r map = m70.a.g(rd0.e.c(((v0) this.f16697b).f(), kotlin.coroutines.g.f186406a), null, null, 3).map(new bjg.d(23, new ble.z(26)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarSwitchMap = ue0.e.H(map, zhm.h0.f322473a, new ble.z(27)).switchMap(new bjg.d(24, new beg.k(this, searchQuery, 23)));
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
        return this.d;
    }

    @Override // z87.f
    public final Object l(String str, o97.y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        Object obj3 = yVar.e;
        boolean z = obj3 instanceof vh;
        o97.e eVar = o97.e.f223096a;
        if (z) {
            o5d.a aVar = this.f;
            if (aVar != null) {
                aVar.b3((vh) obj3);
                return eVar;
            }
        } else {
            if (obj2 instanceof xi0.b) {
                return new o97.d(new CommodityAssetDetailsDestination((xi0.b) obj2, null));
            }
            if (obj2 instanceof clh.u) {
                this.e.onNext(Boolean.valueOf(!((clh.u) obj2).f25012b));
            }
        }
        return eVar;
    }
}
