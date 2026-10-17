package com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker.ScreenerFilterOptionsPickerScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker.ScreenerFilterOptionsPickerScreenContract$Input;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import dli.c;
import iqh.b;
import iqh.d;
import iqh.f;
import iqh.g;
import iqh.l;
import iqh.m;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/option_picker/ScreenerFilterOptionsPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liqh/l;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerFilterOptionsPickerScreen extends ViewController<l> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ScreenerFilterOptionsPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ScreenerFilterOptionsPickerScreenContract$Input K;
    public final int L;
    public final SelectableDelegate M;
    public final ListSubheaderDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public ScreenerFilterOptionsPickerScreen(ScreenerFilterOptionsPickerScreenContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.N = new ListSubheaderDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: iqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerFilterOptionsPickerScreen f167852b;

            {
                this.f167852b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen = this.f167852b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerFilterOptionsPickerScreen.S;
                        ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen2 = this.f167852b;
                        return dli.f.a(screenerFilterOptionsPickerScreen2, screenerFilterOptionsPickerScreen2.R2(), v.k(screenerFilterOptionsPickerScreen2.M, screenerFilterOptionsPickerScreen2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerFilterOptionsPickerScreen.S;
                        qji.b bVarU2 = screenerFilterOptionsPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker.di.ScreenerFilterOptionsPickerScreenInjector");
                        joh.j jVar = (joh.j) bVarU2;
                        joh.w wVar = jVar.f177011c;
                        joh.j jVar2 = jVar.d;
                        ScreenerFilterOptionsPickerScreenContract$Input screenerFilterOptionsPickerScreenContract$Input = screenerFilterOptionsPickerScreen.K;
                        screenerFilterOptionsPickerScreenContract$Input.getClass();
                        return new joh.o(wVar, jVar2, screenerFilterOptionsPickerScreenContract$Input);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerFilterOptionsPickerScreen.S;
                        return (h) ((joh.o) screenerFilterOptionsPickerScreen.Q.getValue()).f177036b.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: iqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerFilterOptionsPickerScreen f167852b;

            {
                this.f167852b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen = this.f167852b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerFilterOptionsPickerScreen.S;
                        ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen2 = this.f167852b;
                        return dli.f.a(screenerFilterOptionsPickerScreen2, screenerFilterOptionsPickerScreen2.R2(), v.k(screenerFilterOptionsPickerScreen2.M, screenerFilterOptionsPickerScreen2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerFilterOptionsPickerScreen.S;
                        qji.b bVarU2 = screenerFilterOptionsPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker.di.ScreenerFilterOptionsPickerScreenInjector");
                        joh.j jVar = (joh.j) bVarU2;
                        joh.w wVar = jVar.f177011c;
                        joh.j jVar2 = jVar.d;
                        ScreenerFilterOptionsPickerScreenContract$Input screenerFilterOptionsPickerScreenContract$Input = screenerFilterOptionsPickerScreen.K;
                        screenerFilterOptionsPickerScreenContract$Input.getClass();
                        return new joh.o(wVar, jVar2, screenerFilterOptionsPickerScreenContract$Input);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerFilterOptionsPickerScreen.S;
                        return (h) ((joh.o) screenerFilterOptionsPickerScreen.Q.getValue()).f177036b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: iqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerFilterOptionsPickerScreen f167852b;

            {
                this.f167852b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen = this.f167852b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerFilterOptionsPickerScreen.S;
                        ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen2 = this.f167852b;
                        return dli.f.a(screenerFilterOptionsPickerScreen2, screenerFilterOptionsPickerScreen2.R2(), v.k(screenerFilterOptionsPickerScreen2.M, screenerFilterOptionsPickerScreen2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerFilterOptionsPickerScreen.S;
                        qji.b bVarU2 = screenerFilterOptionsPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker.di.ScreenerFilterOptionsPickerScreenInjector");
                        joh.j jVar = (joh.j) bVarU2;
                        joh.w wVar = jVar.f177011c;
                        joh.j jVar2 = jVar.d;
                        ScreenerFilterOptionsPickerScreenContract$Input screenerFilterOptionsPickerScreenContract$Input = screenerFilterOptionsPickerScreen.K;
                        screenerFilterOptionsPickerScreenContract$Input.getClass();
                        return new joh.o(wVar, jVar2, screenerFilterOptionsPickerScreenContract$Input);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerFilterOptionsPickerScreen.S;
                        return (h) ((joh.o) screenerFilterOptionsPickerScreen.Q.getValue()).f177036b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((m) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (joh.o) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setTag("SCREENER_FILTER_OPTIONS_PICKER_SCREEN");
        d3().f174565c.setTag("SCREENER_FILTER_OPTIONS_PICKER_SCREEN");
        d3().f174564b.setTag("SCREENER_FILTER_OPTIONS_PICKER_SCREEN");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(this.K.f96263a.f96155b, null);
        d3().f174564b.setText(new TextLocalisedClause(R$string.screener_action_apply, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new f(this, null, 1), 3);
        ViewController.P2(this, new d(rd0.e.b(this.M.r()), 0), new g(this, null, 0), 3);
        ViewController.P2(this, new d(rd0.e.b(this.N.f), 1), new g(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final iqh.h d() {
        return (iqh.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
