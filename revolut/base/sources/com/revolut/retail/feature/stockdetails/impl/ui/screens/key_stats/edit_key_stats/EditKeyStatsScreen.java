package com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreenContract$Input;
import com.revolut.retail.wealth.resources.R$string;
import efm.r;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.g0;
import prk.m;
import prk.n0;
import te0.w;
import tki.c;
import tw0.n;
import vc.s;
import xki.e;
import yvk.b;
import yvk.d;
import yvk.g;
import yvk.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/edit_key_stats/EditKeyStatsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lyvk/j;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditKeyStatsScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EditKeyStatsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EditKeyStatsScreenContract$Input K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final ItemTouchHelper P;
    public final DraggableDelegate Q;
    public final SmallActionButtonDelegate R;
    public final Object S;

    public EditKeyStatsScreen(EditKeyStatsScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditKeyStatsScreen f317215b;

            {
                this.f317215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditKeyStatsScreen editKeyStatsScreen = this.f317215b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditKeyStatsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(editKeyStatsScreen.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        EditKeyStatsScreenContract$Input editKeyStatsScreenContract$Input = editKeyStatsScreen.K;
                        editKeyStatsScreenContract$Input.getClass();
                        return new prk.m(g0Var, editKeyStatsScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = EditKeyStatsScreen.T;
                        return (g) ((prk.m) editKeyStatsScreen.L.getValue()).f239235c.get();
                    default:
                        KProperty[] kPropertyArr3 = EditKeyStatsScreen.T;
                        EditKeyStatsScreen editKeyStatsScreen2 = this.f317215b;
                        return tki.g.a(editKeyStatsScreen2, editKeyStatsScreen2.R2(), v.k(editKeyStatsScreen2.Q, editKeyStatsScreen2.R, new FullScreenStateDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: yvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditKeyStatsScreen f317215b;

            {
                this.f317215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditKeyStatsScreen editKeyStatsScreen = this.f317215b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditKeyStatsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(editKeyStatsScreen.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        EditKeyStatsScreenContract$Input editKeyStatsScreenContract$Input = editKeyStatsScreen.K;
                        editKeyStatsScreenContract$Input.getClass();
                        return new prk.m(g0Var, editKeyStatsScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = EditKeyStatsScreen.T;
                        return (g) ((prk.m) editKeyStatsScreen.L.getValue()).f239235c.get();
                    default:
                        KProperty[] kPropertyArr3 = EditKeyStatsScreen.T;
                        EditKeyStatsScreen editKeyStatsScreen2 = this.f317215b;
                        return tki.g.a(editKeyStatsScreen2, editKeyStatsScreen2.R2(), v.k(editKeyStatsScreen2.Q, editKeyStatsScreen2.R, new FullScreenStateDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        this.O = s.t(this, b.f);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new n(new yvk.c(this)));
        this.P = itemTouchHelper;
        this.Q = new DraggableDelegate(new RowDelegate(null, null, 7), itemTouchHelper);
        this.R = new SmallActionButtonDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: yvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditKeyStatsScreen f317215b;

            {
                this.f317215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EditKeyStatsScreen editKeyStatsScreen = this.f317215b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditKeyStatsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(editKeyStatsScreen.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        EditKeyStatsScreenContract$Input editKeyStatsScreenContract$Input = editKeyStatsScreen.K;
                        editKeyStatsScreenContract$Input.getClass();
                        return new prk.m(g0Var, editKeyStatsScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = EditKeyStatsScreen.T;
                        return (g) ((prk.m) editKeyStatsScreen.L.getValue()).f239235c.get();
                    default:
                        KProperty[] kPropertyArr3 = EditKeyStatsScreen.T;
                        EditKeyStatsScreen editKeyStatsScreen2 = this.f317215b;
                        return tki.g.a(editKeyStatsScreen2, editKeyStatsScreen2.R2(), v.k(editKeyStatsScreen2.Q, editKeyStatsScreen2.R, new FullScreenStateDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_details_customize_key_stats_edit_title, null, null, 14), null);
        d3().f174564b.setText(new TextLocalisedClause(R$string.wealth_details_customize_key_stats_edit_apply_button_label, null, null, 14));
        this.P.attachToRecyclerView(d3().d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        r rVarFilter = this.R.f53336c.f121375b.filter(new yua.h(new yv8.j(1), 6));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(rVarFilter), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.Q.e, new yv8.j(2))), new yk6.m(this, continuation, 21), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new yvk.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new yvk.e(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
