package com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.AddSplitItemController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cq9.b;
import cq9.d;
import cq9.g;
import cq9.k;
import cq9.l;
import jii.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/add/AddSplitItemController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcq9/k;", "Ltki/c;", "Lcq9/l;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddSplitItemController extends ViewController<k> implements c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AddSplitItemController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarActionFooterBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final h N;
    public final Object O;
    public final CenteredAmountDelegate P;
    public final InputTextDelegate Q;
    public final Object R;

    public AddSplitItemController(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_basic_navbar_action_footer;
        this.L = w.y0(new cf6.a(this, inputData, 20));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: cq9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddSplitItemController f108045b;

            {
                this.f108045b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddSplitItemController addSplitItemController = this.f108045b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddSplitItemController.S;
                        return (h) ((gp9.c) addSplitItemController.L.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddSplitItemController.S;
                        qd0.b bVarN = ((gp9.c) addSplitItemController.L.getValue()).f145352b.f145357g.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = AddSplitItemController.S;
                        AddSplitItemController addSplitItemController2 = this.f108045b;
                        return tki.g.a(addSplitItemController2, addSplitItemController2.R2(), v.k(addSplitItemController2.P, addSplitItemController2.Q), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: cq9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddSplitItemController f108045b;

            {
                this.f108045b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddSplitItemController addSplitItemController = this.f108045b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddSplitItemController.S;
                        return (h) ((gp9.c) addSplitItemController.L.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddSplitItemController.S;
                        qd0.b bVarN = ((gp9.c) addSplitItemController.L.getValue()).f145352b.f145357g.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = AddSplitItemController.S;
                        AddSplitItemController addSplitItemController2 = this.f108045b;
                        return tki.g.a(addSplitItemController2, addSplitItemController2.R2(), v.k(addSplitItemController2.P, addSplitItemController2.Q), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new CenteredAmountDelegate(new a8a.a(inputData, this, 14));
        this.Q = new InputTextDelegate(null);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: cq9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddSplitItemController f108045b;

            {
                this.f108045b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddSplitItemController addSplitItemController = this.f108045b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddSplitItemController.S;
                        return (h) ((gp9.c) addSplitItemController.L.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddSplitItemController.S;
                        qd0.b bVarN = ((gp9.c) addSplitItemController.L.getValue()).f145352b.f145357g.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = AddSplitItemController.S;
                        AddSplitItemController addSplitItemController2 = this.f108045b;
                        return tki.g.a(addSplitItemController2, addSplitItemController2.R2(), v.k(addSplitItemController2.P, addSplitItemController2.Q), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174528c.setTitle(uiState.f108056c);
        d3().f174528c.setMenuItems(uiState.f108055b);
        d3().f174527b.setModel(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (gp9.c) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f174528c;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        basicNavBar.setTitleCentered(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174528c.f59211b), new cq9.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174528c.f59210a.f57403b), new d(this, continuation, 0), 3);
        InputTextDelegate inputTextDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new cq9.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174527b.f), new cq9.c(this, null, 1), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.P;
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.d.f121375b), new d(this, continuation, 1), 3);
        ViewController.P2(this, h30.l.y(centeredAmountDelegate.f51967l.f121375b, inputTextDelegate.f.f121375b, "merge(...)"), new d(this, continuation, 2), 3);
    }

    public final i d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cq9.h R2() {
        return (cq9.h) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}
