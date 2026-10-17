package com.revolut.feature.freelancer.impl.ui.acquiring_order.payment_selector;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.payment_selector.FreelancerAcquiringOrderPaymentSelectorScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.payment_selector.FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import su6.b;
import su6.c;
import su6.e;
import su6.f;
import su6.g;
import us6.q;
import vc.s;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/payment_selector/FreelancerAcquiringOrderPaymentSelectorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsu6/e;", "Ldli/a;", "Lsu6/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerAcquiringOrderPaymentSelectorScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FreelancerAcquiringOrderPaymentSelectorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Lazy O;
    public final Lazy P;
    public final Lazy Q;

    public FreelancerAcquiringOrderPaymentSelectorScreen(FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_list;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = j.b(new Function0(this) { // from class: su6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderPaymentSelectorScreen f265678b;

            {
                this.f265678b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerAcquiringOrderPaymentSelectorScreen freelancerAcquiringOrderPaymentSelectorScreen = this.f265678b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderPaymentSelectorScreen.R;
                        qji.b bVarU2 = freelancerAcquiringOrderPaymentSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.payment_selector.di.FreelancerAcquiringOrderPaymentSelectorScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData freelancerAcquiringOrderPaymentSelectorScreenContract$InputData = freelancerAcquiringOrderPaymentSelectorScreen.K;
                        freelancerAcquiringOrderPaymentSelectorScreenContract$InputData.getClass();
                        return new us6.j(qVar, hVar2, freelancerAcquiringOrderPaymentSelectorScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderPaymentSelectorScreen.R;
                        return (g) ((us6.j) freelancerAcquiringOrderPaymentSelectorScreen.O.getValue()).f282585b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderPaymentSelectorScreen.R;
                        FreelancerAcquiringOrderPaymentSelectorScreen freelancerAcquiringOrderPaymentSelectorScreen2 = this.f265678b;
                        return dli.f.a(freelancerAcquiringOrderPaymentSelectorScreen2, (g) freelancerAcquiringOrderPaymentSelectorScreen2.P.getValue(), u.c(freelancerAcquiringOrderPaymentSelectorScreen2.N), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = j.b(new Function0(this) { // from class: su6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderPaymentSelectorScreen f265678b;

            {
                this.f265678b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerAcquiringOrderPaymentSelectorScreen freelancerAcquiringOrderPaymentSelectorScreen = this.f265678b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderPaymentSelectorScreen.R;
                        qji.b bVarU2 = freelancerAcquiringOrderPaymentSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.payment_selector.di.FreelancerAcquiringOrderPaymentSelectorScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData freelancerAcquiringOrderPaymentSelectorScreenContract$InputData = freelancerAcquiringOrderPaymentSelectorScreen.K;
                        freelancerAcquiringOrderPaymentSelectorScreenContract$InputData.getClass();
                        return new us6.j(qVar, hVar2, freelancerAcquiringOrderPaymentSelectorScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderPaymentSelectorScreen.R;
                        return (g) ((us6.j) freelancerAcquiringOrderPaymentSelectorScreen.O.getValue()).f282585b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderPaymentSelectorScreen.R;
                        FreelancerAcquiringOrderPaymentSelectorScreen freelancerAcquiringOrderPaymentSelectorScreen2 = this.f265678b;
                        return dli.f.a(freelancerAcquiringOrderPaymentSelectorScreen2, (g) freelancerAcquiringOrderPaymentSelectorScreen2.P.getValue(), u.c(freelancerAcquiringOrderPaymentSelectorScreen2.N), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = j.b(new Function0(this) { // from class: su6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderPaymentSelectorScreen f265678b;

            {
                this.f265678b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerAcquiringOrderPaymentSelectorScreen freelancerAcquiringOrderPaymentSelectorScreen = this.f265678b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderPaymentSelectorScreen.R;
                        qji.b bVarU2 = freelancerAcquiringOrderPaymentSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.payment_selector.di.FreelancerAcquiringOrderPaymentSelectorScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData freelancerAcquiringOrderPaymentSelectorScreenContract$InputData = freelancerAcquiringOrderPaymentSelectorScreen.K;
                        freelancerAcquiringOrderPaymentSelectorScreenContract$InputData.getClass();
                        return new us6.j(qVar, hVar2, freelancerAcquiringOrderPaymentSelectorScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderPaymentSelectorScreen.R;
                        return (g) ((us6.j) freelancerAcquiringOrderPaymentSelectorScreen.O.getValue()).f282585b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderPaymentSelectorScreen.R;
                        FreelancerAcquiringOrderPaymentSelectorScreen freelancerAcquiringOrderPaymentSelectorScreen2 = this.f265678b;
                        return dli.f.a(freelancerAcquiringOrderPaymentSelectorScreen2, (g) freelancerAcquiringOrderPaymentSelectorScreen2.P.getValue(), u.c(freelancerAcquiringOrderPaymentSelectorScreen2.N), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.f) value).f174519b.setHeaderModel(new lw0.a(uiState.f265681a, null, null, null, false, 30));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (us6.j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
