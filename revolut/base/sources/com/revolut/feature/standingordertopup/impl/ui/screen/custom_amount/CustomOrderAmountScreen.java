package com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.CustomOrderAmountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import dli.a;
import jxd.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import qxd.c;
import qxd.g;
import qxd.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/standingordertopup/impl/ui/screen/custom_amount/CustomOrderAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqxd/g;", "Ldli/a;", "Lqxd/h;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomOrderAmountScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CustomOrderAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final AmountEditDelegate P;
    public final Object Q;

    public CustomOrderAmountScreen(CustomOrderAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, c.f);
        this.M = w.y0(new qvf.a(this, inputData, 6));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qxd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomOrderAmountScreen f250072b;

            {
                this.f250072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomOrderAmountScreen customOrderAmountScreen = this.f250072b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CustomOrderAmountScreen.R;
                        return (k) ((jxd.d) customOrderAmountScreen.M.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CustomOrderAmountScreen.R;
                        qd0.b bVarN = ((jxd.d) customOrderAmountScreen.M.getValue()).f179146b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = CustomOrderAmountScreen.R;
                        CustomOrderAmountScreen customOrderAmountScreen2 = this.f250072b;
                        return dli.f.a(customOrderAmountScreen2, (k) customOrderAmountScreen2.N.getValue(), u.c(customOrderAmountScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qxd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomOrderAmountScreen f250072b;

            {
                this.f250072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomOrderAmountScreen customOrderAmountScreen = this.f250072b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomOrderAmountScreen.R;
                        return (k) ((jxd.d) customOrderAmountScreen.M.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CustomOrderAmountScreen.R;
                        qd0.b bVarN = ((jxd.d) customOrderAmountScreen.M.getValue()).f179146b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = CustomOrderAmountScreen.R;
                        CustomOrderAmountScreen customOrderAmountScreen2 = this.f250072b;
                        return dli.f.a(customOrderAmountScreen2, (k) customOrderAmountScreen2.N.getValue(), u.c(customOrderAmountScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new AmountEditDelegate(new qm2.c(this, 19));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qxd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomOrderAmountScreen f250072b;

            {
                this.f250072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CustomOrderAmountScreen customOrderAmountScreen = this.f250072b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomOrderAmountScreen.R;
                        return (k) ((jxd.d) customOrderAmountScreen.M.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CustomOrderAmountScreen.R;
                        qd0.b bVarN = ((jxd.d) customOrderAmountScreen.M.getValue()).f179146b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = CustomOrderAmountScreen.R;
                        CustomOrderAmountScreen customOrderAmountScreen2 = this.f250072b;
                        return dli.f.a(customOrderAmountScreen2, (k) customOrderAmountScreen2.N.getValue(), u.c(customOrderAmountScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        qxd.h uiState = (qxd.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f250078b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (k) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_done, null, null, 14));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.standingordertopup.impl.R$string.top_up_recurring_top_up_custom_amount_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new qxd.d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new qxd.d(this, continuation, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
