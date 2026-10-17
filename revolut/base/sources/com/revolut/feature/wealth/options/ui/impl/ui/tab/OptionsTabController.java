package com.revolut.feature.wealth.options.ui.impl.ui.tab;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.feature.wealth.options.ui.impl.R$id;
import com.revolut.feature.wealth.options.ui.impl.R$layout;
import com.revolut.feature.wealth.options.ui.impl.ui.tab.OptionsTabController;
import com.revolut.feature.wealth.options.ui.impl.ui.tab.OptionsTabControllerContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import e1.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import veh.b;
import veh.g;
import veh.k;
import xki.e;
import yp0.d;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/options/ui/impl/ui/tab/OptionsTabController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lveh/h;", "feature_wealth_options_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OptionsTabController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(OptionsTabController.class, "binding", "getBinding()Lcom/revolut/feature/wealth/options/ui/impl/databinding/FeatureWealthOptionsTabBinding;", 0))};
    public final OptionsTabControllerContract$Input K;
    public final FullScreenStateDelegate L;
    public final ListCellDelegate M;
    public final h N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final Object R;

    public OptionsTabController(OptionsTabControllerContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = new FullScreenStateDelegate();
        this.M = new ListCellDelegate();
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: veh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OptionsTabController f288319b;

            {
                this.f288319b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OptionsTabController optionsTabController = this.f288319b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OptionsTabController.S;
                        phm.a aVar = (phm.a) ue0.e.j(optionsTabController.m2()).a().get(reh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", reh.b.class, " is not found"));
                        }
                        reh.b bVar = ((reh.b) aVar2.b()).d;
                        OptionsTabControllerContract$Input optionsTabControllerContract$Input = optionsTabController.K;
                        optionsTabControllerContract$Input.getClass();
                        return new reh.a(bVar, optionsTabControllerContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = OptionsTabController.S;
                        return (k) ((reh.a) optionsTabController.O.getValue()).f253587b.get();
                    default:
                        KProperty[] kPropertyArr3 = OptionsTabController.S;
                        OptionsTabController optionsTabController2 = this.f288319b;
                        return dli.f.a(optionsTabController2, (k) optionsTabController2.P.getValue(), v.k(optionsTabController2.L, new RowLoadingDelegate(), optionsTabController2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: veh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OptionsTabController f288319b;

            {
                this.f288319b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OptionsTabController optionsTabController = this.f288319b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OptionsTabController.S;
                        phm.a aVar = (phm.a) ue0.e.j(optionsTabController.m2()).a().get(reh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", reh.b.class, " is not found"));
                        }
                        reh.b bVar = ((reh.b) aVar2.b()).d;
                        OptionsTabControllerContract$Input optionsTabControllerContract$Input = optionsTabController.K;
                        optionsTabControllerContract$Input.getClass();
                        return new reh.a(bVar, optionsTabControllerContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = OptionsTabController.S;
                        return (k) ((reh.a) optionsTabController.O.getValue()).f253587b.get();
                    default:
                        KProperty[] kPropertyArr3 = OptionsTabController.S;
                        OptionsTabController optionsTabController2 = this.f288319b;
                        return dli.f.a(optionsTabController2, (k) optionsTabController2.P.getValue(), v.k(optionsTabController2.L, new RowLoadingDelegate(), optionsTabController2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = R$layout.feature_wealth_options_tab;
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: veh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OptionsTabController f288319b;

            {
                this.f288319b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OptionsTabController optionsTabController = this.f288319b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OptionsTabController.S;
                        phm.a aVar = (phm.a) ue0.e.j(optionsTabController.m2()).a().get(reh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", reh.b.class, " is not found"));
                        }
                        reh.b bVar = ((reh.b) aVar2.b()).d;
                        OptionsTabControllerContract$Input optionsTabControllerContract$Input = optionsTabController.K;
                        optionsTabControllerContract$Input.getClass();
                        return new reh.a(bVar, optionsTabControllerContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = OptionsTabController.S;
                        return (k) ((reh.a) optionsTabController.O.getValue()).f253587b.get();
                    default:
                        KProperty[] kPropertyArr3 = OptionsTabController.S;
                        OptionsTabController optionsTabController2 = this.f288319b;
                        return dli.f.a(optionsTabController2, (k) optionsTabController2.P.getValue(), v.k(optionsTabController2.L, new RowLoadingDelegate(), optionsTabController2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        Integer num;
        veh.h uiState = (veh.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        g gVar = qVar instanceof g ? (g) qVar : null;
        a.z0(uiState);
        List<com.revolut.core.ui_kit.views.q> list = uiState.f288329b;
        boolean zIsEmpty = list.isEmpty();
        Tabs expirationDatesTabs = d3().f235380c;
        Intrinsics.checkNotNullExpressionValue(expirationDatesTabs, "expirationDatesTabs");
        expirationDatesTabs.setVisibility(!zIsEmpty ? 0 : 8);
        FixedTabs contractTypeTabs = d3().f235379b;
        Intrinsics.checkNotNullExpressionValue(contractTypeTabs, "contractTypeTabs");
        contractTypeTabs.setVisibility(zIsEmpty ? 8 : 0);
        if (!zIsEmpty) {
            d3().f235380c.setItems(list, uiState.f288330c);
            d3().f235379b.setItems(uiState.d, uiState.e);
        }
        if (gVar == null || !gVar.f288327a || (num = uiState.f) == null) {
            return;
        }
        y.d(((c) this.R.getValue()).h(), new i(num.intValue(), 1), d.CENTER, null, 12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (reh.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f235380c.f58882b), new veh.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f235379b.f), new veh.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new veh.d(this, null), 3);
    }

    public final peh.a d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (peh.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
