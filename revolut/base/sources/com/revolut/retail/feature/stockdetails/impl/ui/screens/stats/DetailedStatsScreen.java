package com.revolut.retail.feature.stockdetails.impl.ui.screens.stats;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsScreen;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stats.DetailedStatsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stats.DetailedStatsScreenContract$Configuration;
import ipi.a;
import iwk.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lwk.a0;
import lwk.c0;
import lwk.e0;
import lwk.f;
import lwk.g;
import lwk.g0;
import lwk.i0;
import lwk.l;
import lwk.n;
import lwk.p;
import lwk.r;
import lwk.t;
import lwk.x;
import lwk.y;
import opi.b;
import pri.e;
import prk.o;
import te0.w;
import vc.s;
import xrk.h;
import yhm.j;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.v;
import zhm.y0;
import zrk.c;
import zvk.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/stats/DetailedStatsScreen;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "", "Liwk/m;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DetailedStatsScreen extends BaseLayoutBuilderFragment<Object, m> implements m {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f104043k0 = 0;
    public final ListSubheaderDelegate f0 = new ListSubheaderDelegate();
    public final CellDetailsDelegate g0 = new CellDetailsDelegate();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final TextDelegate f104044h0 = new TextDelegate();
    public final Object i0;
    public final Lazy j0;

    public DetailedStatsScreen() {
        final int i = 0;
        this.i0 = w.y0(new Function0(this) { // from class: iwk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailedStatsScreen f169188b;

            {
                this.f169188b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DetailedStatsScreen detailedStatsScreen = this.f169188b;
                switch (i2) {
                    case 0:
                        int i3 = DetailedStatsScreen.f104043k0;
                        return (opi.b) ((zrk.b) ((jwk.b) detailedStatsScreen.j0.getValue())).d.f324751n.get();
                    default:
                        int i5 = DetailedStatsScreen.f104043k0;
                        zrk.a aVar = (zrk.a) ((isk.a) jb3.l.q(detailedStatsScreen));
                        return new zrk.b(aVar.d, aVar.e, new jwk.a(), new o0h.b(), (DetailedStatsScreenContract$Configuration) detailedStatsScreen.A());
                }
            }
        });
        final int i2 = 1;
        this.j0 = j.b(new Function0(this) { // from class: iwk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailedStatsScreen f169188b;

            {
                this.f169188b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DetailedStatsScreen detailedStatsScreen = this.f169188b;
                switch (i22) {
                    case 0:
                        int i3 = DetailedStatsScreen.f104043k0;
                        return (opi.b) ((zrk.b) ((jwk.b) detailedStatsScreen.j0.getValue())).d.f324751n.get();
                    default:
                        int i5 = DetailedStatsScreen.f104043k0;
                        zrk.a aVar = (zrk.a) ((isk.a) jb3.l.q(detailedStatsScreen));
                        return new zrk.b(aVar.d, aVar.e, new jwk.a(), new o0h.b(), (DetailedStatsScreenContract$Configuration) detailedStatsScreen.A());
                }
            }
        });
    }

    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        return new a(new z4l.j(7, v.k(this.f0, this.g0, this.f104044h0), false), (RecyclerView.ItemAnimator) new hoi.j(null, 7), o.u(), 32.0f, true);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment, com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((b) this.i0.getValue()).Y("ETF_INFO_DIALOG_DELEGATE_KEY", f0.f322471a);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() throws IOException {
        zrk.b bVar = (zrk.b) ((jwk.b) this.j0.getValue());
        DetailedStatsScreenContract$Configuration config = bVar.f324753a;
        StatsScreen statsScreen = config.f104045a;
        c cVar = bVar.f324755c;
        e4m.e eVar = cVar.f324763m;
        p9h.a aVar = cVar.f324758c;
        h hVar = (h) eVar.get();
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(9);
        zrk.a aVar2 = bVar.d;
        srk.a aVar3 = aVar2.f324745c;
        builderBuilderWithExpectedSize.put(StatsScreen.FundData.class, sg8.j.A(aVar3));
        builderBuilderWithExpectedSize.put(StatsScreen.EeaFundData.class, sg8.j.z(aVar3));
        builderBuilderWithExpectedSize.put(StatsScreen.PerShareData.class, sg8.j.B(aVar3));
        builderBuilderWithExpectedSize.put(StatsScreen.PriceAndVolume.class, sg8.j.C(aVar3));
        builderBuilderWithExpectedSize.put(StatsScreen.EeaPriceAndVolume.class, sg8.j.y(aVar3));
        builderBuilderWithExpectedSize.put(StatsScreen.BondPriceAndVolume.class, sg8.j.l(aVar3));
        builderBuilderWithExpectedSize.put(StatsScreen.Ratios.class, sg8.j.D(aVar3));
        builderBuilderWithExpectedSize.put(StatsScreen.Yield.class, sg8.j.m(aVar3));
        Set setB = y0.b(StatsSection.Risk.f103776b);
        s.k(setB);
        builderBuilderWithExpectedSize.put(StatsScreen.Risk.class, setB);
        ImmutableMap sectionsPerScreen = builderBuilderWithExpectedSize.build();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sectionsPerScreen, "sectionsPerScreen");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = sectionsPerScreen.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (((Class) entry.getKey()).isInstance(statsScreen)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterable iterable = (Iterable) d0.c0(linkedHashMap.values());
        if (iterable == null) {
            throw new IllegalStateException(("Can't find sections for requested " + statsScreen + ". Available sections for screen: " + d0.k0(sectionsPerScreen.entrySet(), null, null, null, 0, null, 63)).toString());
        }
        Iterable sections = iterable;
        ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(20);
        builderBuilderWithExpectedSize2.put(StatsSection.DividendInformation.class, new lwk.b(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.Dividends.class, new lwk.e(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.ExpenseRatios.class, new lwk.j(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.ManagementEfectiveness.class, new l(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.ManagementFees.class, new n(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.MarketCapitalisation.class, new p(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.EeaMarketCapitalisation.class, new f(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.PerShareData.class, new r(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.Price.class, new lwk.v(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.EeaPrice.class, new g(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.ProfitabilityRatios.class, new x(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.Valuation.class, new c0(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.Volume.class, new e0(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.DividendsAndCharges.class, new lwk.c(new x3h.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.PriceRange.class, new t(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.Risk.class, new a0(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.YieldRange.class, new g0(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.Yield.class, new i0(bVar.a()));
        builderBuilderWithExpectedSize2.put(StatsSection.RiskRating.class, new y(new d(bVar.a())));
        builderBuilderWithExpectedSize2.put(StatsSection.EeaRiskRating.class, new lwk.h(new d(bVar.a())));
        ImmutableMap statsMappers = builderBuilderWithExpectedSize2.build();
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(statsMappers, "statsMappers");
        int iB = q0.b(zhm.w.t(sections, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap sectionToMappersMap = new LinkedHashMap(iB);
        for (Object obj2 : sections) {
            StatsSection statsSection = (StatsSection) obj2;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it9 = statsMappers.entrySet().iterator();
            while (it9.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it9.next();
                if (((Class) entry2.getKey()).isInstance(statsSection)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            iwk.g gVar = (iwk.g) d0.c0(linkedHashMap2.values());
            if (gVar == null) {
                throw new IllegalStateException(("Can't find mapper for " + statsSection + ". Available mappers for sections: " + d0.k0(statsMappers.entrySet(), null, null, null, 0, null, 63)).toString());
            }
            sectionToMappersMap.put(obj2, gVar);
        }
        iwk.a headerMapper = new iwk.a();
        h presentationModel = (h) cVar.f324763m.get();
        dtk.a customStatsMapper = new dtk.a(new d(bVar.a()));
        hsk.d router = (hsk.d) cVar.f324764n.get();
        opi.d expandableDialogView = (opi.d) aVar2.f324751n.get();
        jwk.c factory = jwk.c.f179021a;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(sectionToMappersMap, "sectionToMappersMap");
        String str = "headerMapper";
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        String str2 = "customStatsMapper";
        Intrinsics.checkNotNullParameter(customStatsMapper, "customStatsMapper");
        String str3 = "router";
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        ArrayList arrayList = new ArrayList(sectionToMappersMap.size());
        for (Map.Entry entry3 : sectionToMappersMap.entrySet()) {
            StatsSection section = (StatsSection) entry3.getKey();
            iwk.p pVar = pVar;
            iwk.g mapper = (iwk.g) entry3.getValue();
            Intrinsics.checkNotNullParameter(headerMapper, str);
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
            Intrinsics.checkNotNullParameter(customStatsMapper, str2);
            Intrinsics.checkNotNullParameter(router, str3);
            Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
            arrayList.add(new iwk.e(section, headerMapper, mapper, presentationModel, customStatsMapper, router, expandableDialogView));
            str2 = str2;
            str3 = str3;
            str = str;
            iwk.p pVar2 = pVar;
        }
        o0h.b bVar2 = bVar.f324754b;
        return new iwk.p(config, hVar, arrayList, nga.c.C(bVar2, aVar.a(), cVar.a(), nga.c.A(bVar2, aVar.a()), cVar.b()));
    }
}
