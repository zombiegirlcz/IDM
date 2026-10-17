package com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp.LinkedWalletsTabRevampScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import v0f.p;
import vc.s;
import xki.e;
import yuc.b;
import yuc.f;
import yuc.g;
import yuc.m;
import yuc.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/linked_wallets/tab/linked_wallets_tab_revamp/LinkedWalletsTabRevampScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyuc/m;", "Ldli/a;", "Lyuc/o;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkedWalletsTabRevampScreen extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(LinkedWalletsTabRevampScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final RowDelegate L;
    public final FullScreenStateDelegate M;
    public final Object N;
    public final int O;
    public final Object P;
    public final Object Q;

    public LinkedWalletsTabRevampScreen(LinkedWalletsTabRevampScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new RowDelegate(null, null, 7);
        this.M = new FullScreenStateDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: yuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletsTabRevampScreen f316973b;

            {
                this.f316973b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedWalletsTabRevampScreen.R;
                        LinkedWalletsTabRevampScreen linkedWalletsTabRevampScreen = this.f316973b;
                        return dli.f.a(linkedWalletsTabRevampScreen, linkedWalletsTabRevampScreen.d(), zhm.v.k(linkedWalletsTabRevampScreen.L, linkedWalletsTabRevampScreen.M, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = LinkedWalletsTabRevampScreen.R;
                        return (n) ((vtc.m) this.f316973b.P.getValue()).d.get();
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar;
        this.P = w.y0(new yff.b(this, inputData, 26));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: yuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletsTabRevampScreen f316973b;

            {
                this.f316973b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedWalletsTabRevampScreen.R;
                        LinkedWalletsTabRevampScreen linkedWalletsTabRevampScreen = this.f316973b;
                        return dli.f.a(linkedWalletsTabRevampScreen, linkedWalletsTabRevampScreen.d(), zhm.v.k(linkedWalletsTabRevampScreen.L, linkedWalletsTabRevampScreen.M, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = LinkedWalletsTabRevampScreen.R;
                        return (n) ((vtc.m) this.f316973b.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((yuc.o) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vtc.m) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.L;
        ViewController.P2(this, new p(new yph.b(rd0.e.b(rowDelegate.f53218h), 11), 27), new yk6.m(this, (Continuation) null, 16), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new yuc.h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
