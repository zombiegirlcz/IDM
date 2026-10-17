package com.revolut.feature.retail.cfd.impl.screens.withdraw;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.retail.cfd.impl.R$id;
import com.revolut.feature.retail.cfd.impl.R$layout;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import eqd.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m2b.x;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tp8.l;
import u1.g;
import u4b.b;
import u4b.c;
import u4b.d;
import u4b.f;
import u4b.j;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/withdraw/CfdWithdrawScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lu4b/f;", "Ldli/a;", "Lu4b/g;", "Companion", "a", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdWithdrawScreen extends ViewController<f> implements dli.a {
    public final int K;
    public final Object L;
    public final Object M;
    public final TextDelegate N;
    public final FooterTextDelegate O;
    public final FullScreenStateDelegate P;
    public final e Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CfdWithdrawScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/cfd/impl/databinding/ScreenCfdWithdrawBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public CfdWithdrawScreen(CfdWithdrawScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_cfd_withdraw;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: u4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdWithdrawScreen f277288b;

            {
                this.f277288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfdWithdrawScreen cfdWithdrawScreen = this.f277288b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdWithdrawScreen.V;
                        qd0.b bVarN = ((x) cfdWithdrawScreen.T.getValue()).f201945c.f201932r.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CfdWithdrawScreen.V;
                        return new CenteredAmountDelegate(new l(cfdWithdrawScreen, 26));
                    case 2:
                        KProperty[] kPropertyArr3 = CfdWithdrawScreen.V;
                        CfdWithdrawScreen cfdWithdrawScreen2 = this.f277288b;
                        return dli.f.a(cfdWithdrawScreen2, cfdWithdrawScreen2.d(), v.k((CenteredAmountDelegate) cfdWithdrawScreen2.M.getValue(), cfdWithdrawScreen2.N, cfdWithdrawScreen2.O, cfdWithdrawScreen2.P, new FooterTextLoadingDelegate()), R$id.cfdWithdrawScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CfdWithdrawScreen.V;
                        return (j) ((x) cfdWithdrawScreen.T.getValue()).k.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: u4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdWithdrawScreen f277288b;

            {
                this.f277288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfdWithdrawScreen cfdWithdrawScreen = this.f277288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdWithdrawScreen.V;
                        qd0.b bVarN = ((x) cfdWithdrawScreen.T.getValue()).f201945c.f201932r.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CfdWithdrawScreen.V;
                        return new CenteredAmountDelegate(new l(cfdWithdrawScreen, 26));
                    case 2:
                        KProperty[] kPropertyArr3 = CfdWithdrawScreen.V;
                        CfdWithdrawScreen cfdWithdrawScreen2 = this.f277288b;
                        return dli.f.a(cfdWithdrawScreen2, cfdWithdrawScreen2.d(), v.k((CenteredAmountDelegate) cfdWithdrawScreen2.M.getValue(), cfdWithdrawScreen2.N, cfdWithdrawScreen2.O, cfdWithdrawScreen2.P, new FooterTextLoadingDelegate()), R$id.cfdWithdrawScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CfdWithdrawScreen.V;
                        return (j) ((x) cfdWithdrawScreen.T.getValue()).k.get();
                }
            }
        });
        this.N = new TextDelegate();
        this.O = new FooterTextDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new e(this, 1);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: u4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdWithdrawScreen f277288b;

            {
                this.f277288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CfdWithdrawScreen cfdWithdrawScreen = this.f277288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdWithdrawScreen.V;
                        qd0.b bVarN = ((x) cfdWithdrawScreen.T.getValue()).f201945c.f201932r.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CfdWithdrawScreen.V;
                        return new CenteredAmountDelegate(new l(cfdWithdrawScreen, 26));
                    case 2:
                        KProperty[] kPropertyArr3 = CfdWithdrawScreen.V;
                        CfdWithdrawScreen cfdWithdrawScreen2 = this.f277288b;
                        return dli.f.a(cfdWithdrawScreen2, cfdWithdrawScreen2.d(), v.k((CenteredAmountDelegate) cfdWithdrawScreen2.M.getValue(), cfdWithdrawScreen2.N, cfdWithdrawScreen2.O, cfdWithdrawScreen2.P, new FooterTextLoadingDelegate()), R$id.cfdWithdrawScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CfdWithdrawScreen.V;
                        return (j) ((x) cfdWithdrawScreen.T.getValue()).k.get();
                }
            }
        });
        this.S = s.t(this, b.f);
        this.T = w.y0(new g(this, inputData, 12));
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: u4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdWithdrawScreen f277288b;

            {
                this.f277288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CfdWithdrawScreen cfdWithdrawScreen = this.f277288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdWithdrawScreen.V;
                        qd0.b bVarN = ((x) cfdWithdrawScreen.T.getValue()).f201945c.f201932r.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CfdWithdrawScreen.V;
                        return new CenteredAmountDelegate(new l(cfdWithdrawScreen, 26));
                    case 2:
                        KProperty[] kPropertyArr3 = CfdWithdrawScreen.V;
                        CfdWithdrawScreen cfdWithdrawScreen2 = this.f277288b;
                        return dli.f.a(cfdWithdrawScreen2, cfdWithdrawScreen2.d(), v.k((CenteredAmountDelegate) cfdWithdrawScreen2.M.getValue(), cfdWithdrawScreen2.N, cfdWithdrawScreen2.O, cfdWithdrawScreen2.P, new FooterTextLoadingDelegate()), R$id.cfdWithdrawScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CfdWithdrawScreen.V;
                        return (j) ((x) cfdWithdrawScreen.T.getValue()).k.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        u4b.g uiState = (u4b.g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f170802c.setToolbarDescription(uiState.f277294a);
        d3().f170801b.setModel(uiState.f277296c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f170802c;
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_margin_withdraw_title, null, null, 14));
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f170802c.f59338a), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f170801b.f), null, new c(this, null, 1), 3);
        ?? r06 = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r06.getValue()).d.f121375b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r06.getValue()).f51967l.f121375b), null, new d(this, null, 1), 3);
        view.postDelayed(new t70.x(this, 15), 400L);
    }

    public final j2b.c d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j2b.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
