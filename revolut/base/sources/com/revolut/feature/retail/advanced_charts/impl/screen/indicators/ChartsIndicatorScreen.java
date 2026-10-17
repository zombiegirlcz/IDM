package com.revolut.feature.retail.advanced_charts.impl.screen.indicators;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b0a.j;
import b1b.c;
import b1b.d;
import b1b.g;
import b1b.k;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.advanced_charts.api.navigation.ChartsIndicatorScreenProvider$InputData;
import com.revolut.feature.retail.advanced_charts.impl.R$string;
import com.revolut.feature.retail.advanced_charts.impl.screen.indicators.ChartsIndicatorScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import h0b.i;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import t0b.o;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/screen/indicators/ChartsIndicatorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lh0b/i;", "Ldli/a;", "Lb1b/g;", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartsIndicatorScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ChartsIndicatorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ChartsIndicatorScreenProvider$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final RowDelegate O;
    public final SelectableDelegate P;
    public final Object Q;
    public final Object R;

    public ChartsIndicatorScreen(ChartsIndicatorScreenProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: b1b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartsIndicatorScreen f11762b;

            {
                this.f11762b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChartsIndicatorScreen chartsIndicatorScreen = this.f11762b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChartsIndicatorScreen.S;
                        return (k) ((o) chartsIndicatorScreen.R.getValue()).f266991c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ChartsIndicatorScreen.S;
                        koi.h hVar = new koi.h(null, false, true, 1);
                        ChartsIndicatorScreen chartsIndicatorScreen2 = this.f11762b;
                        return dli.f.a(chartsIndicatorScreen2, (k) chartsIndicatorScreen2.N.getValue(), v.k(chartsIndicatorScreen2.O, chartsIndicatorScreen2.P, new SearchButtonDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, hVar, null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ChartsIndicatorScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(chartsIndicatorScreen.m2()).a().get(t0b.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t0b.k.class, " is not found"));
                        }
                        t0b.k kVar = ((t0b.k) aVar2.b()).f;
                        ChartsIndicatorScreenProvider$InputData chartsIndicatorScreenProvider$InputData = chartsIndicatorScreen.K;
                        chartsIndicatorScreenProvider$InputData.getClass();
                        return new o(kVar, chartsIndicatorScreenProvider$InputData);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        this.P = new SelectableDelegate(rowDelegate);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: b1b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartsIndicatorScreen f11762b;

            {
                this.f11762b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChartsIndicatorScreen chartsIndicatorScreen = this.f11762b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChartsIndicatorScreen.S;
                        return (k) ((o) chartsIndicatorScreen.R.getValue()).f266991c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ChartsIndicatorScreen.S;
                        koi.h hVar = new koi.h(null, false, true, 1);
                        ChartsIndicatorScreen chartsIndicatorScreen2 = this.f11762b;
                        return dli.f.a(chartsIndicatorScreen2, (k) chartsIndicatorScreen2.N.getValue(), v.k(chartsIndicatorScreen2.O, chartsIndicatorScreen2.P, new SearchButtonDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, hVar, null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ChartsIndicatorScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(chartsIndicatorScreen.m2()).a().get(t0b.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t0b.k.class, " is not found"));
                        }
                        t0b.k kVar = ((t0b.k) aVar2.b()).f;
                        ChartsIndicatorScreenProvider$InputData chartsIndicatorScreenProvider$InputData = chartsIndicatorScreen.K;
                        chartsIndicatorScreenProvider$InputData.getClass();
                        return new o(kVar, chartsIndicatorScreenProvider$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: b1b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartsIndicatorScreen f11762b;

            {
                this.f11762b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChartsIndicatorScreen chartsIndicatorScreen = this.f11762b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChartsIndicatorScreen.S;
                        return (k) ((o) chartsIndicatorScreen.R.getValue()).f266991c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ChartsIndicatorScreen.S;
                        koi.h hVar = new koi.h(null, false, true, 1);
                        ChartsIndicatorScreen chartsIndicatorScreen2 = this.f11762b;
                        return dli.f.a(chartsIndicatorScreen2, (k) chartsIndicatorScreen2.N.getValue(), v.k(chartsIndicatorScreen2.O, chartsIndicatorScreen2.P, new SearchButtonDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, hVar, null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ChartsIndicatorScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(chartsIndicatorScreen.m2()).a().get(t0b.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t0b.k.class, " is not found"));
                        }
                        t0b.k kVar = ((t0b.k) aVar2.b()).f;
                        ChartsIndicatorScreenProvider$InputData chartsIndicatorScreenProvider$InputData = chartsIndicatorScreen.K;
                        chartsIndicatorScreenProvider$InputData.getClass();
                        return new o(kVar, chartsIndicatorScreenProvider$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (k) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.trading_advanced_chart_indicator_search_placeholder, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.trading_advanced_chart_add_indicators, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.trading_advanced_chart_indicator_apply, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.P.r(), new j(5))), null, new b1b.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), null, new b1b.e(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
