package zkh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x8h.v0;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements z87.d {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f323014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nih.a f323015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f323016c;
    public final Lazy d;
    public final Lazy e;
    public final o97.r f;

    public m(l mapper, tzg.m wealthAccountsInteractor, nih.a wealthCommoditiesPerformanceInteractor, f01.c uikitResources) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthCommoditiesPerformanceInteractor, "wealthCommoditiesPerformanceInteractor");
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        this.f323014a = wealthAccountsInteractor;
        this.f323015b = wealthCommoditiesPerformanceInteractor;
        this.f323016c = uikitResources;
        final int i = 0;
        this.d = yhm.j.b(new Function0(this) { // from class: zkh.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f323009b;

            {
                this.f323009b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.f323009b.f323016c.b(new TextLocalisedClause(R$string.search_block_commodities_name, null, null, 14)).toString();
                    default:
                        return this.f323009b.f323016c.b(new TextLocalisedClause(R$string.search_block_all_commodities_name, null, null, 14)).toString();
                }
            }
        });
        final int i2 = 1;
        this.e = yhm.j.b(new Function0(this) { // from class: zkh.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f323009b;

            {
                this.f323009b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.f323009b.f323016c.b(new TextLocalisedClause(R$string.search_block_commodities_name, null, null, 14)).toString();
                    default:
                        return this.f323009b.f323016c.b(new TextLocalisedClause(R$string.search_block_all_commodities_name, null, null, 14)).toString();
                }
            }
        });
        this.f = o97.r.WEALTH_COMMODITIES_ALL;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!zsc.p.WORD_PREFIX.a(searchQuery, zhm.v.k((String) this.d.getValue(), (String) this.e.getValue()))) {
            return zi0.c.j(zhm.f0.f322471a);
        }
        efm.r map = m70.a.g(rd0.e.c(((v0) this.f323014a).f(), kotlin.coroutines.g.f186406a), null, null, 3).map(new zii.e(new zke.f(11), 11));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarSwitchMap = ue0.e.H(map, zhm.h0.f322473a, new zke.f(12)).switchMap(new zii.e(new zhf.f(this, 13), 12));
        Intrinsics.h(rVarSwitchMap);
        return rVarSwitchMap;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f;
    }

    @Override // z87.f
    public final Object l(String str, o97.y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        return obj2 instanceof xi0.b ? new o97.d(new CommodityAssetDetailsDestination((xi0.b) obj2, null)) : o97.e.f223096a;
    }
}
