package com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FcaDisclaimerDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.feature.card_order_new.impl.R$id;
import com.revolut.feature.card_order_new.impl.R$layout;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import k23.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l23.c;
import mx0.c7;
import mzb.e;
import n23.b;
import n23.d;
import n23.h;
import n23.i;
import n23.k;
import te0.w;
import vc.s;
import x13.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/tab/OrderNewCardTabController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ln23/h;", "Ldli/a;", "Ln23/i;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderNewCardTabController extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(OrderNewCardTabController.class, "binding", "getBinding()Lcom/revolut/feature/card_order_new/impl/databinding/ScreenOrderNewCardTabBinding;", 0))};
    public final f K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final ao.h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public OrderNewCardTabController(OrderNewCardTabControllerContract$InputData inputData, f sharedDataSource) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedDataSource, "sharedDataSource");
        this.K = sharedDataSource;
        this.L = R$layout.screen_order_new_card_tab;
        this.M = w.y0(new e(this, inputData, 8));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: n23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderNewCardTabController f211431b;

            {
                this.f211431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OrderNewCardTabController orderNewCardTabController = this.f211431b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderNewCardTabController.V;
                        return (k) ((a0) ((l23.c) orderNewCardTabController.M.getValue())).K.get();
                    case 1:
                        KProperty[] kPropertyArr2 = OrderNewCardTabController.V;
                        return (j60.a) ((a0) ((l23.c) orderNewCardTabController.M.getValue())).f302110g.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderNewCardTabController.V;
                        OrderNewCardTabController orderNewCardTabController2 = this.f211431b;
                        return dli.f.a(orderNewCardTabController2, orderNewCardTabController2.R2(), v.k((TextDelegate) orderNewCardTabController2.Q.getValue(), (RowDelegate) orderNewCardTabController2.R.getValue(), (FcaDisclaimerDelegate) orderNewCardTabController2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: n23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderNewCardTabController f211431b;

            {
                this.f211431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OrderNewCardTabController orderNewCardTabController = this.f211431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderNewCardTabController.V;
                        return (k) ((a0) ((l23.c) orderNewCardTabController.M.getValue())).K.get();
                    case 1:
                        KProperty[] kPropertyArr2 = OrderNewCardTabController.V;
                        return (j60.a) ((a0) ((l23.c) orderNewCardTabController.M.getValue())).f302110g.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderNewCardTabController.V;
                        OrderNewCardTabController orderNewCardTabController2 = this.f211431b;
                        return dli.f.a(orderNewCardTabController2, orderNewCardTabController2.R2(), v.k((TextDelegate) orderNewCardTabController2.Q.getValue(), (RowDelegate) orderNewCardTabController2.R.getValue(), (FcaDisclaimerDelegate) orderNewCardTabController2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = w.y0(new n08.b(11));
        this.R = w.y0(new n08.b(12));
        this.S = w.y0(new n08.b(13));
        this.T = w.y0(new n08.b(14));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: n23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderNewCardTabController f211431b;

            {
                this.f211431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OrderNewCardTabController orderNewCardTabController = this.f211431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderNewCardTabController.V;
                        return (k) ((a0) ((l23.c) orderNewCardTabController.M.getValue())).K.get();
                    case 1:
                        KProperty[] kPropertyArr2 = OrderNewCardTabController.V;
                        return (j60.a) ((a0) ((l23.c) orderNewCardTabController.M.getValue())).f302110g.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderNewCardTabController.V;
                        OrderNewCardTabController orderNewCardTabController2 = this.f211431b;
                        return dli.f.a(orderNewCardTabController2, orderNewCardTabController2.R2(), v.k((TextDelegate) orderNewCardTabController2.Q.getValue(), (RowDelegate) orderNewCardTabController2.R.getValue(), (FcaDisclaimerDelegate) orderNewCardTabController2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Clause clause = uiState.f211437b;
        FooterTextView orderNewCardTabFooterText = d3().f211235b;
        Intrinsics.checkNotNullExpressionValue(orderNewCardTabFooterText, "orderNewCardTabFooterText");
        orderNewCardTabFooterText.setVisibility(clause != null ? 0 : 8);
        if (clause != null) {
            d3().f211235b.setContent(new c7(clause, false, null, 6));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f211236c.setOverScrollMode(2);
        ((j60.a) this.O.getValue()).d(u.c((RowDelegate) this.T.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.Q.getValue()).f53530c), null, new n23.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.R.getValue()).f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.T.getValue()).f53218h), null, new n23.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FcaDisclaimerDelegate) this.S.getValue()).f52310c.f121375b), null, new n23.f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f211235b.f58608l), null, new n23.f(this, null, 1), 3);
    }

    public final n13.e d3() {
        ViewBinding value = this.P.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n13.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
