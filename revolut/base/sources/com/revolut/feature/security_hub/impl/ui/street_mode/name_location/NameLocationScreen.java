package com.revolut.feature.security_hub.impl.ui.street_mode.name_location;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rvc.b;
import rvc.c;
import rvc.d;
import rvc.i;
import rvc.j;
import rvc.n;
import te0.w;
import vc.s;
import vtc.r;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/name_location/NameLocationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrvc/i;", "Ldli/a;", "Lrvc/j;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NameLocationScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(NameLocationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final InputTextDelegate M;
    public final SuggestionsBarDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public NameLocationScreen(NameLocationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, b.f);
        this.M = new InputTextDelegate(null);
        this.N = new SuggestionsBarDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: rvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NameLocationScreen f257742b;

            {
                this.f257742b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = NameLocationScreen.R;
                        NameLocationScreen nameLocationScreen = this.f257742b;
                        return dli.f.a(nameLocationScreen, nameLocationScreen.R2(), v.k(nameLocationScreen.M, nameLocationScreen.N), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = NameLocationScreen.R;
                        return (n) ((r) this.f257742b.P.getValue()).f292049c.get();
                }
            }
        });
        this.P = w.y0(new rgf.b(this, inputData, 27));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NameLocationScreen f257742b;

            {
                this.f257742b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NameLocationScreen.R;
                        NameLocationScreen nameLocationScreen = this.f257742b;
                        return dli.f.a(nameLocationScreen, nameLocationScreen.R2(), v.k(nameLocationScreen.M, nameLocationScreen.N), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = NameLocationScreen.R;
                        return (n) ((r) this.f257742b.P.getValue()).f292049c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f257748b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_street_mode_name_location_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_street_mode_name_location_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.security_hub_street_mode_name_location_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.p().d), new rvc.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
