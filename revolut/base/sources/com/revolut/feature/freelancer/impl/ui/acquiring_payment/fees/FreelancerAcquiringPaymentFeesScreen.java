package com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import us6.p1;
import us6.q1;
import vc.s;
import xki.e;
import xu6.b;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lxu6/h;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerAcquiringPaymentFeesScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FreelancerAcquiringPaymentFeesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final FreelancerAcquiringPaymentFeesScreenContract$InputData K;
    public final int L;
    public final h M;
    public final CellDetailsDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public FreelancerAcquiringPaymentFeesScreen(FreelancerAcquiringPaymentFeesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new CellDetailsDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentFeesScreen f308963b;

            {
                this.f308963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerAcquiringPaymentFeesScreen freelancerAcquiringPaymentFeesScreen = this.f308963b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentFeesScreen.R;
                        qji.b bVarU2 = freelancerAcquiringPaymentFeesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.di.FreelancerAcquiringPaymentFeesScreenInjector");
                        p1 p1Var = (p1) ((yu6.a) bVarU2).b().mo3808a(freelancerAcquiringPaymentFeesScreen);
                        FreelancerAcquiringPaymentFeesScreenContract$InputData freelancerAcquiringPaymentFeesScreenContract$InputData = freelancerAcquiringPaymentFeesScreen.K;
                        switch (p1Var.f282660a) {
                            case 0:
                                freelancerAcquiringPaymentFeesScreenContract$InputData.getClass();
                                p1Var.d = freelancerAcquiringPaymentFeesScreenContract$InputData;
                                break;
                            default:
                                freelancerAcquiringPaymentFeesScreenContract$InputData.getClass();
                                p1Var.d = freelancerAcquiringPaymentFeesScreenContract$InputData;
                                break;
                        }
                        return (q1) p1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentFeesScreen.R;
                        q1 q1Var = (q1) freelancerAcquiringPaymentFeesScreen.O.getValue();
                        switch (q1Var.f282723a) {
                            case 0:
                                return (e) q1Var.f282725c.get();
                            default:
                                return (e) q1Var.f282725c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentFeesScreen.R;
                        FreelancerAcquiringPaymentFeesScreen freelancerAcquiringPaymentFeesScreen2 = this.f308963b;
                        return tki.g.a(freelancerAcquiringPaymentFeesScreen2, (e) freelancerAcquiringPaymentFeesScreen2.P.getValue(), u.c(freelancerAcquiringPaymentFeesScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentFeesScreen f308963b;

            {
                this.f308963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerAcquiringPaymentFeesScreen freelancerAcquiringPaymentFeesScreen = this.f308963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentFeesScreen.R;
                        qji.b bVarU2 = freelancerAcquiringPaymentFeesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.di.FreelancerAcquiringPaymentFeesScreenInjector");
                        p1 p1Var = (p1) ((yu6.a) bVarU2).b().mo3808a(freelancerAcquiringPaymentFeesScreen);
                        FreelancerAcquiringPaymentFeesScreenContract$InputData freelancerAcquiringPaymentFeesScreenContract$InputData = freelancerAcquiringPaymentFeesScreen.K;
                        switch (p1Var.f282660a) {
                            case 0:
                                freelancerAcquiringPaymentFeesScreenContract$InputData.getClass();
                                p1Var.d = freelancerAcquiringPaymentFeesScreenContract$InputData;
                                break;
                            default:
                                freelancerAcquiringPaymentFeesScreenContract$InputData.getClass();
                                p1Var.d = freelancerAcquiringPaymentFeesScreenContract$InputData;
                                break;
                        }
                        return (q1) p1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentFeesScreen.R;
                        q1 q1Var = (q1) freelancerAcquiringPaymentFeesScreen.O.getValue();
                        switch (q1Var.f282723a) {
                            case 0:
                                return (e) q1Var.f282725c.get();
                            default:
                                return (e) q1Var.f282725c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentFeesScreen.R;
                        FreelancerAcquiringPaymentFeesScreen freelancerAcquiringPaymentFeesScreen2 = this.f308963b;
                        return tki.g.a(freelancerAcquiringPaymentFeesScreen2, (e) freelancerAcquiringPaymentFeesScreen2.P.getValue(), u.c(freelancerAcquiringPaymentFeesScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentFeesScreen f308963b;

            {
                this.f308963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerAcquiringPaymentFeesScreen freelancerAcquiringPaymentFeesScreen = this.f308963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentFeesScreen.R;
                        qji.b bVarU2 = freelancerAcquiringPaymentFeesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.di.FreelancerAcquiringPaymentFeesScreenInjector");
                        p1 p1Var = (p1) ((yu6.a) bVarU2).b().mo3808a(freelancerAcquiringPaymentFeesScreen);
                        FreelancerAcquiringPaymentFeesScreenContract$InputData freelancerAcquiringPaymentFeesScreenContract$InputData = freelancerAcquiringPaymentFeesScreen.K;
                        switch (p1Var.f282660a) {
                            case 0:
                                freelancerAcquiringPaymentFeesScreenContract$InputData.getClass();
                                p1Var.d = freelancerAcquiringPaymentFeesScreenContract$InputData;
                                break;
                            default:
                                freelancerAcquiringPaymentFeesScreenContract$InputData.getClass();
                                p1Var.d = freelancerAcquiringPaymentFeesScreenContract$InputData;
                                break;
                        }
                        return (q1) p1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentFeesScreen.R;
                        q1 q1Var = (q1) freelancerAcquiringPaymentFeesScreen.O.getValue();
                        switch (q1Var.f282723a) {
                            case 0:
                                return (e) q1Var.f282725c.get();
                            default:
                                return (e) q1Var.f282725c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentFeesScreen.R;
                        FreelancerAcquiringPaymentFeesScreen freelancerAcquiringPaymentFeesScreen2 = this.f308963b;
                        return tki.g.a(freelancerAcquiringPaymentFeesScreen2, (e) freelancerAcquiringPaymentFeesScreen2.P.getValue(), u.c(freelancerAcquiringPaymentFeesScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        xu6.h uiState = (xu6.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174546c.setHeaderModel(new lw0.a(uiState.f308967a.f308966a, null, null, null, false, 30));
        d3().f174545b.setText(uiState.f308969c.f308965a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (xu6.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new xni.h(this, null, 11), 3);
        ViewController.P2(this, rd0.e.b(this.N.f), new xu6.c(this, null), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
