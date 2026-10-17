package com.revolut.retail.feature.balance.picker.impl.new_picker.dual;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import com.revolut.retail.feature.balance.picker.impl.R$id;
import com.revolut.retail.feature.balance.picker.impl.R$layout;
import com.revolut.retail.feature.balance.picker.impl.new_picker.dual.DualChooserScreen;
import g2j.p;
import h2j.b;
import h2j.c;
import h2j.d;
import h2j.f;
import h2j.g;
import h2j.j;
import h2j.k;
import h2j.l;
import ho.h0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l1j.e;
import te0.w;
import vc.s;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/new_picker/dual/DualChooserScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll1j/e;", "Ldli/a;", "Lh2j/l;", "Lho/h0;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DualChooserScreen extends ViewController<e> implements dli.a, h0 {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new kotlin.jvm.internal.h0(DualChooserScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/balance/picker/impl/databinding/ScreenDualChooserBinding;", 0))};
    public final int K;
    public final h L;
    public final AccountCellItemDelegate M;
    public final FullScreenStateDelegate N;
    public final ActionsDelegate O;
    public final ListSubheaderDelegate P;
    public final RowDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public DualChooserScreen(DualChooserContract$InputData inputData, i1j.a aVar) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_dual_chooser;
        this.L = s.t(this, b.f);
        this.M = new AccountCellItemDelegate();
        this.N = new FullScreenStateDelegate();
        this.O = new ActionsDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new RowDelegate(null, null, 7);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: h2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DualChooserScreen f148825b;

            {
                this.f148825b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar2;
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DualChooserScreen.U;
                        DualChooserScreen dualChooserScreen = this.f148825b;
                        k kVarR2 = dualChooserScreen.R2();
                        List listK = zhm.v.k(dualChooserScreen.P, dualChooserScreen.M, new RowLoadingDelegate(), dualChooserScreen.N, dualChooserScreen.O, dualChooserScreen.Q, new TextDelegate());
                        g2j.p pVar = (g2j.p) dualChooserScreen.S.getValue();
                        switch (pVar.f140126a) {
                            case 0:
                                aVar2 = (fd6.a) pVar.f.get();
                                break;
                            default:
                                aVar2 = (fd6.a) pVar.f.get();
                                break;
                        }
                        return dli.f.a(dualChooserScreen, kVarR2, d0.E0(aVar2.e, listK), R$id.dualChooser_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = DualChooserScreen.U;
                        g2j.p pVar2 = (g2j.p) this.f148825b.S.getValue();
                        switch (pVar2.f140126a) {
                            case 0:
                                return (k) pVar2.i.get();
                            default:
                                return (k) pVar2.i.get();
                        }
                }
            }
        });
        this.S = w.y0(new a2.a(this, 10, inputData, aVar));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: h2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DualChooserScreen f148825b;

            {
                this.f148825b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar2;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DualChooserScreen.U;
                        DualChooserScreen dualChooserScreen = this.f148825b;
                        k kVarR2 = dualChooserScreen.R2();
                        List listK = zhm.v.k(dualChooserScreen.P, dualChooserScreen.M, new RowLoadingDelegate(), dualChooserScreen.N, dualChooserScreen.O, dualChooserScreen.Q, new TextDelegate());
                        g2j.p pVar = (g2j.p) dualChooserScreen.S.getValue();
                        switch (pVar.f140126a) {
                            case 0:
                                aVar2 = (fd6.a) pVar.f.get();
                                break;
                            default:
                                aVar2 = (fd6.a) pVar.f.get();
                                break;
                        }
                        return dli.f.a(dualChooserScreen, kVarR2, d0.E0(aVar2.e, listK), R$id.dualChooser_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = DualChooserScreen.U;
                        g2j.p pVar2 = (g2j.p) this.f148825b.S.getValue();
                        switch (pVar2.f140126a) {
                            case 0:
                                return (k) pVar2.i.get();
                            default:
                                return (k) pVar2.i.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        TwinVerticalButton dualChooserTwinVerticalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(dualChooserTwinVerticalButton, "dualChooserTwinVerticalButton");
        j jVar = uiState.f148842b;
        if (jVar != null) {
            dualChooserTwinVerticalButton.setVisibility(0);
            dualChooserTwinVerticalButton.setMainButtonVisible(true);
            dualChooserTwinVerticalButton.setMainButtonEnabled(jVar.f148840c);
            dualChooserTwinVerticalButton.setSecondaryButtonVisible(false);
            dualChooserTwinVerticalButton.setGradientBackgroundEnabled(jVar.f148839b != null);
            TwinVerticalButton.setDescription$default(dualChooserTwinVerticalButton, jVar.f148839b, null, null, 6, null);
            dualChooserTwinVerticalButton.setMainButtonText(jVar.f148838a);
        } else {
            dualChooserTwinVerticalButton.setVisibility(8);
        }
        u1j.b bVar = uiState.f148843c;
        ArrayList arrayList = bVar != null ? bVar.f276413a : null;
        if (arrayList == null || arrayList.isEmpty()) {
            Tabs dualChooserTabs = d3().f302455c;
            Intrinsics.checkNotNullExpressionValue(dualChooserTabs, "dualChooserTabs");
            dualChooserTabs.setVisibility(8);
        } else {
            Tabs dualChooserTabs2 = d3().f302455c;
            Intrinsics.checkNotNullExpressionValue(dualChooserTabs2, "dualChooserTabs");
            dualChooserTabs2.setVisibility(0);
            d3().f302455c.setItems(arrayList, bVar.f276414b);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) R2()).C2(e.a.f191551a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f302454b;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().d.setCollapsible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f302454b.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51551c.f53218h), new h2j.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f51611c.f121375b), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o0()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f302455c.f58882b), new f(this, continuation, 1), 3);
    }

    public final x1j.c d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x1j.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.T.getValue();
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
