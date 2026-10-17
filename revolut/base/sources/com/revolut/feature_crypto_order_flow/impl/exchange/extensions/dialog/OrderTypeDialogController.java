package com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.OrderTypeDialogContract$Input;
import com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.OrderTypeDialogController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import xyh.d;
import xyh.f;
import xyh.i;
import xyh.j;
import xyh.k;
import xyh.l;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/extensions/dialog/OrderTypeDialogController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxyh/d;", "Ldli/a;", "Lxyh/f;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderTypeDialogController extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(OrderTypeDialogController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final OrderTypeDialogContract$Input K;
    public final int L;
    public final h M;
    public final AccountCellItemDelegate N;
    public final CellDetailsSwitcherDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public OrderTypeDialogController(OrderTypeDialogContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, i.f);
        this.N = new AccountCellItemDelegate();
        this.O = new CellDetailsSwitcherDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: xyh.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderTypeDialogController f309732b;

            {
                this.f309732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OrderTypeDialogController orderTypeDialogController = this.f309732b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderTypeDialogController.S;
                        return (e) ((tyh.h) orderTypeDialogController.Q.getValue()).f275642b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = OrderTypeDialogController.S;
                        qji.b bVarU2 = orderTypeDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.di.OrderTypeDialogInjector");
                        tyh.c cVar = (tyh.c) bVarU2;
                        tyh.b bVar = cVar.f275604b;
                        tyh.c cVar2 = cVar.f275605c;
                        OrderTypeDialogContract$Input orderTypeDialogContract$Input = orderTypeDialogController.K;
                        orderTypeDialogContract$Input.getClass();
                        return new tyh.h(bVar, cVar2, orderTypeDialogContract$Input);
                    default:
                        KProperty[] kPropertyArr3 = OrderTypeDialogController.S;
                        OrderTypeDialogController orderTypeDialogController2 = this.f309732b;
                        return dli.f.a(orderTypeDialogController2, (e) orderTypeDialogController2.P.getValue(), v.k(orderTypeDialogController2.N, orderTypeDialogController2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: xyh.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderTypeDialogController f309732b;

            {
                this.f309732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OrderTypeDialogController orderTypeDialogController = this.f309732b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderTypeDialogController.S;
                        return (e) ((tyh.h) orderTypeDialogController.Q.getValue()).f275642b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = OrderTypeDialogController.S;
                        qji.b bVarU2 = orderTypeDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.di.OrderTypeDialogInjector");
                        tyh.c cVar = (tyh.c) bVarU2;
                        tyh.b bVar = cVar.f275604b;
                        tyh.c cVar2 = cVar.f275605c;
                        OrderTypeDialogContract$Input orderTypeDialogContract$Input = orderTypeDialogController.K;
                        orderTypeDialogContract$Input.getClass();
                        return new tyh.h(bVar, cVar2, orderTypeDialogContract$Input);
                    default:
                        KProperty[] kPropertyArr3 = OrderTypeDialogController.S;
                        OrderTypeDialogController orderTypeDialogController2 = this.f309732b;
                        return dli.f.a(orderTypeDialogController2, (e) orderTypeDialogController2.P.getValue(), v.k(orderTypeDialogController2.N, orderTypeDialogController2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: xyh.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderTypeDialogController f309732b;

            {
                this.f309732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OrderTypeDialogController orderTypeDialogController = this.f309732b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderTypeDialogController.S;
                        return (e) ((tyh.h) orderTypeDialogController.Q.getValue()).f275642b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = OrderTypeDialogController.S;
                        qji.b bVarU2 = orderTypeDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.di.OrderTypeDialogInjector");
                        tyh.c cVar = (tyh.c) bVarU2;
                        tyh.b bVar = cVar.f275604b;
                        tyh.c cVar2 = cVar.f275605c;
                        OrderTypeDialogContract$Input orderTypeDialogContract$Input = orderTypeDialogController.K;
                        orderTypeDialogContract$Input.getClass();
                        return new tyh.h(bVar, cVar2, orderTypeDialogContract$Input);
                    default:
                        KProperty[] kPropertyArr3 = OrderTypeDialogController.S;
                        OrderTypeDialogController orderTypeDialogController2 = this.f309732b;
                        return dli.f.a(orderTypeDialogController2, (e) orderTypeDialogController2.P.getValue(), v.k(orderTypeDialogController2.N, orderTypeDialogController2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (tyh.h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (xyh.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        CellDetailsSwitcherDelegate cellDetailsSwitcherDelegate = this.O;
        ViewController.P2(this, rd0.e.b(cellDetailsSwitcherDelegate.d), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(cellDetailsSwitcherDelegate.f51912c), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51551c.f53218h), new l(this, null), 3);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.cryptobuysell_order_type_select_title, null, null, 14), null, null, null, false, 30));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
