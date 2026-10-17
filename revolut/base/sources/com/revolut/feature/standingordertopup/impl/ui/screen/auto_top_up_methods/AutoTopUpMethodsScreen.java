package com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.standingordertopup.impl.R$string;
import com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.AutoTopUpMethodsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ocb.d;
import ot1.p;
import oxd.b;
import oxd.f;
import oxd.j;
import oxd.k;
import oxd.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/standingordertopup/impl/ui/screen/auto_top_up_methods/AutoTopUpMethodsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loxd/j;", "Ldli/a;", "Loxd/l;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoTopUpMethodsScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AutoTopUpMethodsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final Object P;

    public AutoTopUpMethodsScreen(AutoTopUpMethodsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = w.y0(new p(this, inputData, 8));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: oxd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoTopUpMethodsScreen f230770b;

            {
                this.f230770b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AutoTopUpMethodsScreen.Q;
                        return (k) ((jxd.b) this.f230770b.M.getValue()).f179141c.get();
                    default:
                        KProperty[] kPropertyArr2 = AutoTopUpMethodsScreen.Q;
                        AutoTopUpMethodsScreen autoTopUpMethodsScreen = this.f230770b;
                        return dli.f.a(autoTopUpMethodsScreen, (k) autoTopUpMethodsScreen.N.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), autoTopUpMethodsScreen.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: oxd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoTopUpMethodsScreen f230770b;

            {
                this.f230770b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AutoTopUpMethodsScreen.Q;
                        return (k) ((jxd.b) this.f230770b.M.getValue()).f179141c.get();
                    default:
                        KProperty[] kPropertyArr2 = AutoTopUpMethodsScreen.Q;
                        AutoTopUpMethodsScreen autoTopUpMethodsScreen = this.f230770b;
                        return dli.f.a(autoTopUpMethodsScreen, (k) autoTopUpMethodsScreen.N.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), autoTopUpMethodsScreen.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((l) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jxd.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.top_up_recurring_top_up_select_method_title, null, null, 14);
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new d(this, null, 29), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, new o9a.e(rd0.e.b(rowDelegate.f53218h), 27), new oxd.d(this, null), 3);
        ViewController.P2(this, new o9a.e(rd0.e.b(rowDelegate.k), 28), new f(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
