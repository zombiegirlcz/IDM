package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker;

import afj.w2;
import afj.x2;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreenContract$InputData;
import dli.a;
import efm.r;
import iaf.d;
import ihd.c;
import il9.p;
import ilj.b;
import ilj.e;
import ilj.f;
import ilj.g;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/picker/EsimPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lilj/e;", "Ldli/a;", "Lilj/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimPickerScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final EsimPickerScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimPickerScreen(EsimPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = w.y0(new p(3));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ilj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPickerScreen f162244b;

            {
                this.f162244b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimPickerScreen esimPickerScreen = this.f162244b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimPickerScreen.R;
                        EsimPickerScreen esimPickerScreen2 = this.f162244b;
                        return dli.f.a(esimPickerScreen2, (g) esimPickerScreen2.Q.getValue(), v.k(new FullScreenStateDelegate(), (SingleChoiceDelegate) esimPickerScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimPickerScreen.R;
                        qji.b bVarU2 = esimPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.di.EsimPickerScreenInjector");
                        w2 w2Var = (w2) ((jlj.a) bVarU2).b().mo3808a(esimPickerScreen);
                        EsimPickerScreenContract$InputData esimPickerScreenContract$InputData = esimPickerScreen.K;
                        switch (w2Var.f4510a) {
                            case 0:
                                esimPickerScreenContract$InputData.getClass();
                                w2Var.d = esimPickerScreenContract$InputData;
                                break;
                            default:
                                esimPickerScreenContract$InputData.getClass();
                                w2Var.d = esimPickerScreenContract$InputData;
                                break;
                        }
                        return (x2) w2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimPickerScreen.R;
                        x2 x2Var = (x2) esimPickerScreen.P.getValue();
                        switch (x2Var.f4522a) {
                            case 0:
                                return (g) x2Var.d.get();
                            default:
                                return (g) x2Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ilj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPickerScreen f162244b;

            {
                this.f162244b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimPickerScreen esimPickerScreen = this.f162244b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimPickerScreen.R;
                        EsimPickerScreen esimPickerScreen2 = this.f162244b;
                        return dli.f.a(esimPickerScreen2, (g) esimPickerScreen2.Q.getValue(), v.k(new FullScreenStateDelegate(), (SingleChoiceDelegate) esimPickerScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimPickerScreen.R;
                        qji.b bVarU2 = esimPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.di.EsimPickerScreenInjector");
                        w2 w2Var = (w2) ((jlj.a) bVarU2).b().mo3808a(esimPickerScreen);
                        EsimPickerScreenContract$InputData esimPickerScreenContract$InputData = esimPickerScreen.K;
                        switch (w2Var.f4510a) {
                            case 0:
                                esimPickerScreenContract$InputData.getClass();
                                w2Var.d = esimPickerScreenContract$InputData;
                                break;
                            default:
                                esimPickerScreenContract$InputData.getClass();
                                w2Var.d = esimPickerScreenContract$InputData;
                                break;
                        }
                        return (x2) w2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimPickerScreen.R;
                        x2 x2Var = (x2) esimPickerScreen.P.getValue();
                        switch (x2Var.f4522a) {
                            case 0:
                                return (g) x2Var.d.get();
                            default:
                                return (g) x2Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ilj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPickerScreen f162244b;

            {
                this.f162244b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimPickerScreen esimPickerScreen = this.f162244b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimPickerScreen.R;
                        EsimPickerScreen esimPickerScreen2 = this.f162244b;
                        return dli.f.a(esimPickerScreen2, (g) esimPickerScreen2.Q.getValue(), v.k(new FullScreenStateDelegate(), (SingleChoiceDelegate) esimPickerScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimPickerScreen.R;
                        qji.b bVarU2 = esimPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.di.EsimPickerScreenInjector");
                        w2 w2Var = (w2) ((jlj.a) bVarU2).b().mo3808a(esimPickerScreen);
                        EsimPickerScreenContract$InputData esimPickerScreenContract$InputData = esimPickerScreen.K;
                        switch (w2Var.f4510a) {
                            case 0:
                                esimPickerScreenContract$InputData.getClass();
                                w2Var.d = esimPickerScreenContract$InputData;
                                break;
                            default:
                                esimPickerScreenContract$InputData.getClass();
                                w2Var.d = esimPickerScreenContract$InputData;
                                break;
                        }
                        return (x2) w2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimPickerScreen.R;
                        x2 x2Var = (x2) esimPickerScreen.P.getValue();
                        switch (x2Var.f4522a) {
                            case 0:
                                return (g) x2Var.d.get();
                            default:
                                return (g) x2Var.d.get();
                        }
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
    public final xki.e R1() {
        return (x2) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        EsimPickerScreenContract$InputData esimPickerScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(esimPickerScreenContract$InputData.f101326b.f101328a);
        EsimPickerScreenContract$NavBarConfig esimPickerScreenContract$NavBarConfig = esimPickerScreenContract$InputData.f101326b;
        navBarWithToolbar.setTitle(esimPickerScreenContract$NavBarConfig.f101328a, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHint(esimPickerScreenContract$NavBarConfig.f101329b);
        navBarWithToolbar.setSearchButtonActive(true);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new d(this, continuation, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), null, new ibg.g(this, continuation, 15), 3);
        r rVarFilter = ((SingleChoiceDelegate) this.N.getValue()).p().filter(new c(14, new ijj.p(23)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new ilj.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
