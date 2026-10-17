package com.revolut.feature.pix.impl.flow.automatico.screens.past_authorisations;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.automatico.screens.past_authorisations.PixAutomaticoPastAuthorisationsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.d0;
import p8a.u;
import p8a.v;
import pki.b;
import te0.w;
import vc.s;
import w5b.b6;
import w65.c;
import w9a.d;
import w9a.f;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/automatico/screens/past_authorisations/PixAutomaticoPastAuthorisationsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lw9a/d;", "Ldli/a;", "Lw9a/f;", "Lno/d1;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAutomaticoPastAuthorisationsScreen extends ViewController<d> implements dli.a, d1 {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PixAutomaticoPastAuthorisationsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final int K = R$layout.screen_recycler_navbar;
    public final Object O = w.y0(new b6(29));
    public final h P = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public PixAutomaticoPastAuthorisationsScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: w9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAutomaticoPastAuthorisationsScreen f295698b;

            {
                this.f295698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixAutomaticoPastAuthorisationsScreen pixAutomaticoPastAuthorisationsScreen = this.f295698b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixAutomaticoPastAuthorisationsScreen.Q;
                        return (e) ((v) pixAutomaticoPastAuthorisationsScreen.N.getValue()).f234102b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAutomaticoPastAuthorisationsScreen.Q;
                        PixAutomaticoPastAuthorisationsScreen pixAutomaticoPastAuthorisationsScreen2 = this.f295698b;
                        return dli.f.a(pixAutomaticoPastAuthorisationsScreen2, (e) pixAutomaticoPastAuthorisationsScreen2.L.getValue(), zhm.v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) pixAutomaticoPastAuthorisationsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixAutomaticoPastAuthorisationsScreen.Q;
                        qji.b bVarU2 = pixAutomaticoPastAuthorisationsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.automatico.screens.past_authorisations.di.PixAutomaticoPastAuthorisationsScreenInjector");
                        d0 d0Var = ((u) bVarU2).f234094b;
                        v vVar = new v();
                        vVar.f234101a = e4m.b.b(new p8a.m(d0Var, vVar, 1, 3));
                        vVar.f234102b = e4m.b.b(new p8a.m(d0Var, vVar, 0, 3));
                        return vVar;
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: w9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAutomaticoPastAuthorisationsScreen f295698b;

            {
                this.f295698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixAutomaticoPastAuthorisationsScreen pixAutomaticoPastAuthorisationsScreen = this.f295698b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAutomaticoPastAuthorisationsScreen.Q;
                        return (e) ((v) pixAutomaticoPastAuthorisationsScreen.N.getValue()).f234102b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAutomaticoPastAuthorisationsScreen.Q;
                        PixAutomaticoPastAuthorisationsScreen pixAutomaticoPastAuthorisationsScreen2 = this.f295698b;
                        return dli.f.a(pixAutomaticoPastAuthorisationsScreen2, (e) pixAutomaticoPastAuthorisationsScreen2.L.getValue(), zhm.v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) pixAutomaticoPastAuthorisationsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixAutomaticoPastAuthorisationsScreen.Q;
                        qji.b bVarU2 = pixAutomaticoPastAuthorisationsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.automatico.screens.past_authorisations.di.PixAutomaticoPastAuthorisationsScreenInjector");
                        d0 d0Var = ((u) bVarU2).f234094b;
                        v vVar = new v();
                        vVar.f234101a = e4m.b.b(new p8a.m(d0Var, vVar, 1, 3));
                        vVar.f234102b = e4m.b.b(new p8a.m(d0Var, vVar, 0, 3));
                        return vVar;
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: w9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAutomaticoPastAuthorisationsScreen f295698b;

            {
                this.f295698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixAutomaticoPastAuthorisationsScreen pixAutomaticoPastAuthorisationsScreen = this.f295698b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAutomaticoPastAuthorisationsScreen.Q;
                        return (e) ((v) pixAutomaticoPastAuthorisationsScreen.N.getValue()).f234102b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAutomaticoPastAuthorisationsScreen.Q;
                        PixAutomaticoPastAuthorisationsScreen pixAutomaticoPastAuthorisationsScreen2 = this.f295698b;
                        return dli.f.a(pixAutomaticoPastAuthorisationsScreen2, (e) pixAutomaticoPastAuthorisationsScreen2.L.getValue(), zhm.v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) pixAutomaticoPastAuthorisationsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixAutomaticoPastAuthorisationsScreen.Q;
                        qji.b bVarU2 = pixAutomaticoPastAuthorisationsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.automatico.screens.past_authorisations.di.PixAutomaticoPastAuthorisationsScreenInjector");
                        d0 d0Var = ((u) bVarU2).f234094b;
                        v vVar = new v();
                        vVar.f234101a = e4m.b.b(new p8a.m(d0Var, vVar, 1, 3));
                        vVar.f234102b = e4m.b.b(new p8a.m(d0Var, vVar, 0, 3));
                        return vVar;
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (w9a.e) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pix_automatico_past_authorisations_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new c(this, null, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new w9a.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
