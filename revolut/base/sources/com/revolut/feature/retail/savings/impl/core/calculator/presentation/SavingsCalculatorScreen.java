package com.revolut.feature.retail.savings.impl.core.calculator.presentation;

import aii.q;
import aj0.o;
import akl.e0;
import alb.b;
import alb.f;
import alb.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import blb.c;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreen;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/core/calculator/presentation/SavingsCalculatorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lalb/g;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsCalculatorScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SavingsCalculatorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final SavingsCalculatorScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;

    public SavingsCalculatorScreen(SavingsCalculatorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new o(25));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: alb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsCalculatorScreen f6171b;

            {
                this.f6171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsCalculatorScreen savingsCalculatorScreen = this.f6171b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsCalculatorScreen.R;
                        SavingsCalculatorScreen savingsCalculatorScreen2 = this.f6171b;
                        return dli.f.a(savingsCalculatorScreen2, (f) savingsCalculatorScreen2.Q.getValue(), v.k(new FullScreenStateDelegate(), new CounterTextDelegate(), (InputSliderDelegate) savingsCalculatorScreen2.L.getValue()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsCalculatorScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(savingsCalculatorScreen.m2()).a().get(tib.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tib.b.class, " is not found"));
                        }
                        blb.e eVar = ((blb.e) ((blb.h) aVar2.b())).f16508l;
                        SavingsCalculatorScreenContract$InputData savingsCalculatorScreenContract$InputData = savingsCalculatorScreen.K;
                        savingsCalculatorScreenContract$InputData.getClass();
                        return new blb.c(eVar, savingsCalculatorScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SavingsCalculatorScreen.R;
                        return (f) ((blb.c) savingsCalculatorScreen.P.getValue()).d.get();
                }
            }
        });
        this.N = R$layout.screen_bottom_sheet_base;
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: alb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsCalculatorScreen f6171b;

            {
                this.f6171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsCalculatorScreen savingsCalculatorScreen = this.f6171b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsCalculatorScreen.R;
                        SavingsCalculatorScreen savingsCalculatorScreen2 = this.f6171b;
                        return dli.f.a(savingsCalculatorScreen2, (f) savingsCalculatorScreen2.Q.getValue(), v.k(new FullScreenStateDelegate(), new CounterTextDelegate(), (InputSliderDelegate) savingsCalculatorScreen2.L.getValue()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsCalculatorScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(savingsCalculatorScreen.m2()).a().get(tib.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tib.b.class, " is not found"));
                        }
                        blb.e eVar = ((blb.e) ((blb.h) aVar2.b())).f16508l;
                        SavingsCalculatorScreenContract$InputData savingsCalculatorScreenContract$InputData = savingsCalculatorScreen.K;
                        savingsCalculatorScreenContract$InputData.getClass();
                        return new blb.c(eVar, savingsCalculatorScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SavingsCalculatorScreen.R;
                        return (f) ((blb.c) savingsCalculatorScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: alb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsCalculatorScreen f6171b;

            {
                this.f6171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsCalculatorScreen savingsCalculatorScreen = this.f6171b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsCalculatorScreen.R;
                        SavingsCalculatorScreen savingsCalculatorScreen2 = this.f6171b;
                        return dli.f.a(savingsCalculatorScreen2, (f) savingsCalculatorScreen2.Q.getValue(), v.k(new FullScreenStateDelegate(), new CounterTextDelegate(), (InputSliderDelegate) savingsCalculatorScreen2.L.getValue()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsCalculatorScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(savingsCalculatorScreen.m2()).a().get(tib.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tib.b.class, " is not found"));
                        }
                        blb.e eVar = ((blb.e) ((blb.h) aVar2.b())).f16508l;
                        SavingsCalculatorScreenContract$InputData savingsCalculatorScreenContract$InputData = savingsCalculatorScreen.K;
                        savingsCalculatorScreenContract$InputData.getClass();
                        return new blb.c(eVar, savingsCalculatorScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SavingsCalculatorScreen.R;
                        return (f) ((blb.c) savingsCalculatorScreen.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(!uiState.f6176a.isEmpty() ? 0 : 8);
        d3().f174513b.setModel(uiState.f6177b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174513b.f), new e0(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((InputSliderDelegate) this.L.getValue()).f52559c), new alb.c(this, null), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
