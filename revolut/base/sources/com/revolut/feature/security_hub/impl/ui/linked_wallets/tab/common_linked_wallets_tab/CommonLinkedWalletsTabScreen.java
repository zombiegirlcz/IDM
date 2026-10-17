package com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.common_linked_wallets_tab;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.common_linked_wallets_tab.CommonLinkedWalletsTabScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
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
import vtc.c;
import xjl.g;
import xki.e;
import xo8.a0;
import xuc.b;
import xuc.i;
import xuc.j;
import xuc.k;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/linked_wallets/tab/common_linked_wallets_tab/CommonLinkedWalletsTabScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxuc/i;", "Ldli/a;", "Lxuc/j;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommonLinkedWalletsTabScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CommonLinkedWalletsTabScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final RowDelegate L;
    public final FullScreenStateDelegate M;
    public final Object N;
    public final int O;
    public final Object P;
    public final Object Q;

    public CommonLinkedWalletsTabScreen(CommonLinkedWalletsTabScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new RowDelegate(null, null, 7);
        this.M = new FullScreenStateDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommonLinkedWalletsTabScreen f309009b;

            {
                this.f309009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CommonLinkedWalletsTabScreen.R;
                        CommonLinkedWalletsTabScreen commonLinkedWalletsTabScreen = this.f309009b;
                        return dli.f.a(commonLinkedWalletsTabScreen, (k) commonLinkedWalletsTabScreen.Q.getValue(), v.k(commonLinkedWalletsTabScreen.L, commonLinkedWalletsTabScreen.M, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CommonLinkedWalletsTabScreen.R;
                        return (k) ((vtc.c) this.f309009b.P.getValue()).d.get();
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar;
        this.P = w.y0(new xfj.a(this, inputData, 20));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: xuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommonLinkedWalletsTabScreen f309009b;

            {
                this.f309009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CommonLinkedWalletsTabScreen.R;
                        CommonLinkedWalletsTabScreen commonLinkedWalletsTabScreen = this.f309009b;
                        return dli.f.a(commonLinkedWalletsTabScreen, (k) commonLinkedWalletsTabScreen.Q.getValue(), v.k(commonLinkedWalletsTabScreen.L, commonLinkedWalletsTabScreen.M, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CommonLinkedWalletsTabScreen.R;
                        return (k) ((vtc.c) this.f309009b.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new p(new a0(rd0.e.b(this.L.f53218h), 10), 22), new g(this, (Continuation) null, 28), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new xuc.e(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
