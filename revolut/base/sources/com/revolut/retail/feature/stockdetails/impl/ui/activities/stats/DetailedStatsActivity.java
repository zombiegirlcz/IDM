package com.revolut.retail.feature.stockdetails.impl.ui.activities.stats;

import a7j.g;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import bq.i;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.stockdetails.impl.R$id;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsScreen;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.stats.DetailedStatsActivity;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.stats.DetailedStatsContract$Configuration;
import dvk.n;
import f01.c;
import hsk.b;
import hsk.d;
import hsk.e;
import hsk.h;
import ihm.f;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import r10.t;
import sg8.j;
import sri.o;
import te0.w;
import vc.s;
import zhm.f0;
import zhm.y0;
import zrk.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/activities/stats/DetailedStatsActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lhsk/h;", "Lhsk/e;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DetailedStatsActivity extends BaseDelegatesActivity implements e {
    public static final /* synthetic */ KProperty[] B0;
    public a u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f103809v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f103810w0;
    public final Object z0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final j90.a f103806r0 = u1.w(this, R$id.detailedStats_viewPager);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final j90.a f103807s0 = u1.w(this, com.revolut.retail.common.ui.R$id.navBarWithToolbar);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final j90.a f103808t0 = u1.w(this, R$id.tabs);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Object f103811x0 = f0.f322471a;
    public final f y0 = v0.a.d("create(...)");
    public final b A0 = new b(this);

    static {
        h0 h0Var = new h0(DetailedStatsActivity.class, "detailedStats_viewPager", "getDetailedStats_viewPager()Landroidx/viewpager/widget/ViewPager;", 0);
        p0 p0Var = o0.f186429a;
        B0 = new KProperty[]{p0Var.j(h0Var), p.a.y(DetailedStatsActivity.class, "navBarWithToolbar", "getNavBarWithToolbar()Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar;", 0, p0Var), p.a.y(DetailedStatsActivity.class, "tabs", "getTabs()Lcom/revolut/core/ui_kit/views/Tabs;", 0, p0Var)};
    }

    public DetailedStatsActivity() {
        final int i = 0;
        this.f103809v0 = w.y0(new Function0(this) { // from class: hsk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailedStatsActivity f155070b;

            {
                this.f155070b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DetailedStatsActivity detailedStatsActivity = this.f155070b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DetailedStatsActivity.B0;
                        return (DetailedStatsContract$Configuration) detailedStatsActivity.G0();
                    case 1:
                        KProperty[] kPropertyArr2 = DetailedStatsActivity.B0;
                        return ((DetailedStatsContract$Configuration) detailedStatsActivity.f103809v0.getValue()).f103812a;
                    default:
                        KProperty[] kPropertyArr3 = DetailedStatsActivity.B0;
                        FragmentManager supportFragmentManager = detailedStatsActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        return new vqi.c(detailedStatsActivity, supportFragmentManager, o.c(detailedStatsActivity, null, null, 14).a());
                }
            }
        });
        final int i2 = 1;
        this.f103810w0 = w.y0(new Function0(this) { // from class: hsk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailedStatsActivity f155070b;

            {
                this.f155070b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DetailedStatsActivity detailedStatsActivity = this.f155070b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DetailedStatsActivity.B0;
                        return (DetailedStatsContract$Configuration) detailedStatsActivity.G0();
                    case 1:
                        KProperty[] kPropertyArr2 = DetailedStatsActivity.B0;
                        return ((DetailedStatsContract$Configuration) detailedStatsActivity.f103809v0.getValue()).f103812a;
                    default:
                        KProperty[] kPropertyArr3 = DetailedStatsActivity.B0;
                        FragmentManager supportFragmentManager = detailedStatsActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        return new vqi.c(detailedStatsActivity, supportFragmentManager, o.c(detailedStatsActivity, null, null, 14).a());
                }
            }
        });
        final int i3 = 2;
        this.z0 = w.y0(new Function0(this) { // from class: hsk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailedStatsActivity f155070b;

            {
                this.f155070b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DetailedStatsActivity detailedStatsActivity = this.f155070b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DetailedStatsActivity.B0;
                        return (DetailedStatsContract$Configuration) detailedStatsActivity.G0();
                    case 1:
                        KProperty[] kPropertyArr2 = DetailedStatsActivity.B0;
                        return ((DetailedStatsContract$Configuration) detailedStatsActivity.f103809v0.getValue()).f103812a;
                    default:
                        KProperty[] kPropertyArr3 = DetailedStatsActivity.B0;
                        FragmentManager supportFragmentManager = detailedStatsActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        return new vqi.c(detailedStatsActivity, supportFragmentManager, o.c(detailedStatsActivity, null, null, 14).a());
                }
            }
        });
    }

    @Override // nri.b
    public final pri.e F0() {
        a aVar = this.u0;
        if (aVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        DetailedStatsContract$Configuration detailedStatsContract$Configuration = aVar.f324744b;
        c cVarO = i.o(aVar.f324743a);
        srk.a aVar2 = aVar.f324745c;
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(9);
        builderBuilderWithExpectedSize.put(StatsScreen.FundData.class, j.A(aVar2));
        builderBuilderWithExpectedSize.put(StatsScreen.EeaFundData.class, j.z(aVar2));
        builderBuilderWithExpectedSize.put(StatsScreen.PerShareData.class, j.B(aVar2));
        builderBuilderWithExpectedSize.put(StatsScreen.PriceAndVolume.class, j.C(aVar2));
        builderBuilderWithExpectedSize.put(StatsScreen.EeaPriceAndVolume.class, j.y(aVar2));
        builderBuilderWithExpectedSize.put(StatsScreen.BondPriceAndVolume.class, j.l(aVar2));
        builderBuilderWithExpectedSize.put(StatsScreen.Ratios.class, j.D(aVar2));
        builderBuilderWithExpectedSize.put(StatsScreen.Yield.class, j.m(aVar2));
        Set setB = y0.b(StatsSection.Risk.f103776b);
        s.k(setB);
        builderBuilderWithExpectedSize.put(StatsScreen.Risk.class, setB);
        ImmutableMap screenToSections = builderBuilderWithExpectedSize.build();
        rrk.e statsExtractors = new rrk.e();
        Intrinsics.checkNotNullParameter(screenToSections, "screenToSections");
        Intrinsics.checkNotNullParameter(statsExtractors, "statsExtractors");
        t tVar = new t(cVarO, new com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.b(new g(screenToSections, statsExtractors)));
        zrk.c cVar = aVar.d;
        return new h(detailedStatsContract$Configuration, tVar, (d) cVar.f324764n.get(), new qy5.a(new n()), (xpi.g) aVar.f324752p.get(), (xrk.h) cVar.f324763m.get());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF85901s0() {
        return (String) this.f103810w0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.u0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    public final ViewPager Z0() {
        return (ViewPager) this.f103806r0.getValue(this, B0[0]);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        zrk.c cVar = ((zrk.c) com.bumptech.glide.c.l(this).b(null, getF85901s0())).f324760h;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        DetailedStatsContract$Configuration detailedStatsContract$Configuration = (DetailedStatsContract$Configuration) this.f103809v0.getValue();
        detailedStatsContract$Configuration.getClass();
        this.u0 = new a(cVar, new srk.a(), dVarG, detailedStatsContract$Configuration);
        super.onCreate(bundle);
        setContentView(R$layout.activity_detailed_stats);
        ViewPager viewPagerZ0 = Z0();
        viewPagerZ0.setAdapter((vqi.c) this.z0.getValue());
        viewPagerZ0.setOffscreenPageLimit(3);
        ((NavBarWithToolbar) this.f103807s0.getValue(this, B0[1])).setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        Z0().addOnPageChangeListener(this.A0);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        Z0().removeOnPageChangeListener(this.A0);
        super.onStop();
    }
}
