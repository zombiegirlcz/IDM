package com.revolut.retail.feature.esim.impl.ui.screens.help;

import afj.h1;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.help.EsimHelpScreen;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xhj.c;
import xhj.d;
import xhj.f;
import xhj.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/help/EsimHelpScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxhj/h;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimHelpScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(EsimHelpScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final f K;
    public final int L;
    public final boolean M;
    public final h N;
    public final FooterTextDelegate O;
    public final FullScreenStateDelegate P;
    public final RowDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public EsimHelpScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = true;
        this.N = s.t(this, xhj.b.f);
        this.O = new FooterTextDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new RowDelegate(null, null, 7);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: xhj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimHelpScreen f306257b;

            {
                this.f306257b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimHelpScreen esimHelpScreen = this.f306257b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimHelpScreen.U;
                        qji.b bVarU2 = esimHelpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.help.di.EsimHelpScreenInjector");
                        afj.l lVar = (afj.l) bVarU2;
                        afj.b bVar = lVar.f4322b;
                        afj.l lVar2 = lVar.f4323c;
                        f fVar = esimHelpScreen.K;
                        fVar.getClass();
                        return new h1(bVar, lVar2, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimHelpScreen.U;
                        EsimHelpScreen esimHelpScreen2 = this.f306257b;
                        return dli.f.a(esimHelpScreen2, (g) esimHelpScreen2.T.getValue(), v.k(esimHelpScreen2.O, esimHelpScreen2.P, esimHelpScreen2.Q), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EsimHelpScreen.U;
                        return (g) ((h1) esimHelpScreen.R.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: xhj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimHelpScreen f306257b;

            {
                this.f306257b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimHelpScreen esimHelpScreen = this.f306257b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimHelpScreen.U;
                        qji.b bVarU2 = esimHelpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.help.di.EsimHelpScreenInjector");
                        afj.l lVar = (afj.l) bVarU2;
                        afj.b bVar = lVar.f4322b;
                        afj.l lVar2 = lVar.f4323c;
                        f fVar = esimHelpScreen.K;
                        fVar.getClass();
                        return new h1(bVar, lVar2, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimHelpScreen.U;
                        EsimHelpScreen esimHelpScreen2 = this.f306257b;
                        return dli.f.a(esimHelpScreen2, (g) esimHelpScreen2.T.getValue(), v.k(esimHelpScreen2.O, esimHelpScreen2.P, esimHelpScreen2.Q), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EsimHelpScreen.U;
                        return (g) ((h1) esimHelpScreen.R.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: xhj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimHelpScreen f306257b;

            {
                this.f306257b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimHelpScreen esimHelpScreen = this.f306257b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimHelpScreen.U;
                        qji.b bVarU2 = esimHelpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.help.di.EsimHelpScreenInjector");
                        afj.l lVar = (afj.l) bVarU2;
                        afj.b bVar = lVar.f4322b;
                        afj.l lVar2 = lVar.f4323c;
                        f fVar = esimHelpScreen.K;
                        fVar.getClass();
                        return new h1(bVar, lVar2, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimHelpScreen.U;
                        EsimHelpScreen esimHelpScreen2 = this.f306257b;
                        return dli.f.a(esimHelpScreen2, (g) esimHelpScreen2.T.getValue(), v.k(esimHelpScreen2.O, esimHelpScreen2.P, esimHelpScreen2.Q), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EsimHelpScreen.U;
                        return (g) ((h1) esimHelpScreen.R.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((xhj.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h1) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_help_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new x0f.g(this, continuation, 16), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.e.f121375b), new x64.b(this, continuation, 24), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }

    public EsimHelpScreen() {
        this(new f(null));
    }
}
