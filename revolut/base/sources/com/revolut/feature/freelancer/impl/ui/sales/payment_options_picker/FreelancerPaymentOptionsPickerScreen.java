package com.revolut.feature.freelancer.impl.ui.sales.payment_options_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.payment_options_picker.FreelancerPaymentOptionsPickerScreen;
import com.revolut.feature.freelancer.impl.ui.sales.payment_options_picker.FreelancerPaymentOptionsPickerScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.n;
import k27.b;
import k27.c;
import k27.e;
import k27.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.e0;
import us6.q;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/payment_options_picker/FreelancerPaymentOptionsPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lk27/e;", "Ldli/a;", "Lk27/g;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerPaymentOptionsPickerScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FreelancerPaymentOptionsPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final FreelancerPaymentOptionsPickerScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public FreelancerPaymentOptionsPickerScreen(FreelancerPaymentOptionsPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: k27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPaymentOptionsPickerScreen f180397b;

            {
                this.f180397b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerPaymentOptionsPickerScreen freelancerPaymentOptionsPickerScreen = this.f180397b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPaymentOptionsPickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerPaymentOptionsPickerScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerPaymentOptionsPickerScreenContract$InputData freelancerPaymentOptionsPickerScreenContract$InputData = freelancerPaymentOptionsPickerScreen.K;
                        freelancerPaymentOptionsPickerScreenContract$InputData.getClass();
                        return new e0(qVar, freelancerPaymentOptionsPickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerPaymentOptionsPickerScreen.R;
                        return (h) ((e0) freelancerPaymentOptionsPickerScreen.O.getValue()).f282502b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerPaymentOptionsPickerScreen.R;
                        FreelancerPaymentOptionsPickerScreen freelancerPaymentOptionsPickerScreen2 = this.f180397b;
                        return dli.f.a(freelancerPaymentOptionsPickerScreen2, (h) freelancerPaymentOptionsPickerScreen2.P.getValue(), u.c(freelancerPaymentOptionsPickerScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: k27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPaymentOptionsPickerScreen f180397b;

            {
                this.f180397b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerPaymentOptionsPickerScreen freelancerPaymentOptionsPickerScreen = this.f180397b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPaymentOptionsPickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerPaymentOptionsPickerScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerPaymentOptionsPickerScreenContract$InputData freelancerPaymentOptionsPickerScreenContract$InputData = freelancerPaymentOptionsPickerScreen.K;
                        freelancerPaymentOptionsPickerScreenContract$InputData.getClass();
                        return new e0(qVar, freelancerPaymentOptionsPickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerPaymentOptionsPickerScreen.R;
                        return (h) ((e0) freelancerPaymentOptionsPickerScreen.O.getValue()).f282502b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerPaymentOptionsPickerScreen.R;
                        FreelancerPaymentOptionsPickerScreen freelancerPaymentOptionsPickerScreen2 = this.f180397b;
                        return dli.f.a(freelancerPaymentOptionsPickerScreen2, (h) freelancerPaymentOptionsPickerScreen2.P.getValue(), u.c(freelancerPaymentOptionsPickerScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: k27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPaymentOptionsPickerScreen f180397b;

            {
                this.f180397b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerPaymentOptionsPickerScreen freelancerPaymentOptionsPickerScreen = this.f180397b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPaymentOptionsPickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerPaymentOptionsPickerScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerPaymentOptionsPickerScreenContract$InputData freelancerPaymentOptionsPickerScreenContract$InputData = freelancerPaymentOptionsPickerScreen.K;
                        freelancerPaymentOptionsPickerScreenContract$InputData.getClass();
                        return new e0(qVar, freelancerPaymentOptionsPickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerPaymentOptionsPickerScreen.R;
                        return (h) ((e0) freelancerPaymentOptionsPickerScreen.O.getValue()).f282502b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerPaymentOptionsPickerScreen.R;
                        FreelancerPaymentOptionsPickerScreen freelancerPaymentOptionsPickerScreen2 = this.f180397b;
                        return dli.f.a(freelancerPaymentOptionsPickerScreen2, (h) freelancerPaymentOptionsPickerScreen2.P.getValue(), u.c(freelancerPaymentOptionsPickerScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f180400a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k27.h) this.P.getValue();
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
