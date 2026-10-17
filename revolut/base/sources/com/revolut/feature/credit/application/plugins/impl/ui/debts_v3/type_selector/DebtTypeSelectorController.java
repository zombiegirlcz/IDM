package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.type_selector;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.type_selector.DebtTypeSelectorController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.type_selector.DebtTypeSelectorControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.u4;
import dw3.w1;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p94.b;
import p94.c;
import p94.e;
import p94.f;
import p94.g;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v3/type_selector/DebtTypeSelectorController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lp94/e;", "Ldli/a;", "Lp94/f;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DebtTypeSelectorController extends PluginScreenController<e> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DebtTypeSelectorController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final DebtTypeSelectorControllerContract$InputData L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public DebtTypeSelectorController(DebtTypeSelectorControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_bottomsheet;
        this.N = s.t(this, b.f);
        this.O = w.y0(new p0l.a(23));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: p94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtTypeSelectorController f234270b;

            {
                this.f234270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DebtTypeSelectorController debtTypeSelectorController = this.f234270b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DebtTypeSelectorController.S;
                        qji.b bVarU2 = debtTypeSelectorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.type_selector.di.DebtTypeSelectorControllerInjector");
                        u4 u4Var = (u4) bVarU2;
                        c1 c1Var = u4Var.f119906c;
                        u4 u4Var2 = u4Var.d;
                        DebtTypeSelectorControllerContract$InputData debtTypeSelectorControllerContract$InputData = debtTypeSelectorController.L;
                        debtTypeSelectorControllerContract$InputData.getClass();
                        return new w1(c1Var, u4Var2, debtTypeSelectorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DebtTypeSelectorController.S;
                        return (g) ((w1) debtTypeSelectorController.P.getValue()).f120052b.get();
                    default:
                        KProperty[] kPropertyArr3 = DebtTypeSelectorController.S;
                        DebtTypeSelectorController debtTypeSelectorController2 = this.f234270b;
                        return dli.f.a(debtTypeSelectorController2, (g) debtTypeSelectorController2.Q.getValue(), u.c((RowDelegate) debtTypeSelectorController2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: p94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtTypeSelectorController f234270b;

            {
                this.f234270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DebtTypeSelectorController debtTypeSelectorController = this.f234270b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DebtTypeSelectorController.S;
                        qji.b bVarU2 = debtTypeSelectorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.type_selector.di.DebtTypeSelectorControllerInjector");
                        u4 u4Var = (u4) bVarU2;
                        c1 c1Var = u4Var.f119906c;
                        u4 u4Var2 = u4Var.d;
                        DebtTypeSelectorControllerContract$InputData debtTypeSelectorControllerContract$InputData = debtTypeSelectorController.L;
                        debtTypeSelectorControllerContract$InputData.getClass();
                        return new w1(c1Var, u4Var2, debtTypeSelectorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DebtTypeSelectorController.S;
                        return (g) ((w1) debtTypeSelectorController.P.getValue()).f120052b.get();
                    default:
                        KProperty[] kPropertyArr3 = DebtTypeSelectorController.S;
                        DebtTypeSelectorController debtTypeSelectorController2 = this.f234270b;
                        return dli.f.a(debtTypeSelectorController2, (g) debtTypeSelectorController2.Q.getValue(), u.c((RowDelegate) debtTypeSelectorController2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: p94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtTypeSelectorController f234270b;

            {
                this.f234270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DebtTypeSelectorController debtTypeSelectorController = this.f234270b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DebtTypeSelectorController.S;
                        qji.b bVarU2 = debtTypeSelectorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.type_selector.di.DebtTypeSelectorControllerInjector");
                        u4 u4Var = (u4) bVarU2;
                        c1 c1Var = u4Var.f119906c;
                        u4 u4Var2 = u4Var.d;
                        DebtTypeSelectorControllerContract$InputData debtTypeSelectorControllerContract$InputData = debtTypeSelectorController.L;
                        debtTypeSelectorControllerContract$InputData.getClass();
                        return new w1(c1Var, u4Var2, debtTypeSelectorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DebtTypeSelectorController.S;
                        return (g) ((w1) debtTypeSelectorController.P.getValue()).f120052b.get();
                    default:
                        KProperty[] kPropertyArr3 = DebtTypeSelectorController.S;
                        DebtTypeSelectorController debtTypeSelectorController2 = this.f234270b;
                        return dli.f.a(debtTypeSelectorController2, (g) debtTypeSelectorController2.Q.getValue(), u.c((RowDelegate) debtTypeSelectorController2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f234273a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (w1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
