package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import g9g.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import uag.d;
import uag.p;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/home/TravelHotelsHomeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/home/a;", "Lali/g;", "Luag/p;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/home/TravelHotelsHomeFlowContract$PagerItem;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsHomeFlow extends ViewController<a> implements g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelHotelsHomeFlow.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenHotelsHomeBinding;", 0))};
    public final TravelHotelsHomeFlowContract$InputData K;
    public final boolean L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelHotelsHomeFlow(TravelHotelsHomeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = s.t(this, uag.b.f);
        this.N = R$layout.screen_hotels_home;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: uag.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeFlow f278635b;

            {
                this.f278635b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsHomeFlow travelHotelsHomeFlow = this.f278635b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsHomeFlow.R;
                        return mif.a.a(travelHotelsHomeFlow, 0, R$id.hotelsHomeScreen_viewPager, travelHotelsHomeFlow.d(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsHomeFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelHotelsHomeFlow.m2()).a().get(g9g.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g9g.d.class, " is not found"));
                        }
                        g9g.d dVar = ((g9g.d) aVar2.b()).L;
                        TravelHotelsHomeFlowContract$InputData travelHotelsHomeFlowContract$InputData = travelHotelsHomeFlow.K;
                        travelHotelsHomeFlowContract$InputData.getClass();
                        return new g9g.v(dVar, travelHotelsHomeFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsHomeFlow.R;
                        return (d) ((g9g.v) travelHotelsHomeFlow.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: uag.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeFlow f278635b;

            {
                this.f278635b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsHomeFlow travelHotelsHomeFlow = this.f278635b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsHomeFlow.R;
                        return mif.a.a(travelHotelsHomeFlow, 0, R$id.hotelsHomeScreen_viewPager, travelHotelsHomeFlow.d(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsHomeFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelHotelsHomeFlow.m2()).a().get(g9g.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g9g.d.class, " is not found"));
                        }
                        g9g.d dVar = ((g9g.d) aVar2.b()).L;
                        TravelHotelsHomeFlowContract$InputData travelHotelsHomeFlowContract$InputData = travelHotelsHomeFlow.K;
                        travelHotelsHomeFlowContract$InputData.getClass();
                        return new g9g.v(dVar, travelHotelsHomeFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsHomeFlow.R;
                        return (d) ((g9g.v) travelHotelsHomeFlow.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: uag.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeFlow f278635b;

            {
                this.f278635b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsHomeFlow travelHotelsHomeFlow = this.f278635b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsHomeFlow.R;
                        return mif.a.a(travelHotelsHomeFlow, 0, R$id.hotelsHomeScreen_viewPager, travelHotelsHomeFlow.d(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsHomeFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelHotelsHomeFlow.m2()).a().get(g9g.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g9g.d.class, " is not found"));
                        }
                        g9g.d dVar = ((g9g.d) aVar2.b()).L;
                        TravelHotelsHomeFlowContract$InputData travelHotelsHomeFlowContract$InputData = travelHotelsHomeFlow.K;
                        travelHotelsHomeFlowContract$InputData.getClass();
                        return new g9g.v(dVar, travelHotelsHomeFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsHomeFlow.R;
                        return (d) ((g9g.v) travelHotelsHomeFlow.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f22380b.setItems(uiState.f278651c.f278640a);
        d3().f22380b.b(uiState.f278649a);
        d3().f22381c.setMenuItems(uiState.f278650b);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        TravelHotelsHomeFlowContract$PagerItem pagerItem2 = (TravelHotelsHomeFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        ((c) d()).I2(pagerItem2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (v) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f22381c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.hotels_stays_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.hotels_stays_header_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f22381c;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new u07.b(this, null, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.o.f57403b), null, new uag.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f22380b.f58581q), new uag.c(this, null, 1), 3);
    }

    public final c9g.a d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c9g.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
