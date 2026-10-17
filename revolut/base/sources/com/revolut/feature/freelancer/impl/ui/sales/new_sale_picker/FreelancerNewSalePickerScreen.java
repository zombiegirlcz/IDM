package com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker;

import aee.g;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b27.b;
import b27.d;
import b27.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.FreelancerNewSalePickerScreen;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.FreelancerNewSalePickerScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import us6.c0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/new_sale_picker/FreelancerNewSalePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lb27/i;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerNewSalePickerScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(FreelancerNewSalePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final FreelancerNewSalePickerScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final TextDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public FreelancerNewSalePickerScreen(FreelancerNewSalePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        this.P = new TextDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: b27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerNewSalePickerScreen f11909b;

            {
                this.f11909b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerNewSalePickerScreen freelancerNewSalePickerScreen = this.f11909b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerNewSalePickerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerNewSalePickerScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerNewSalePickerScreenContract$InputData freelancerNewSalePickerScreenContract$InputData = freelancerNewSalePickerScreen.K;
                        freelancerNewSalePickerScreenContract$InputData.getClass();
                        return new c0(qVar, freelancerNewSalePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerNewSalePickerScreen.T;
                        return (h) ((c0) freelancerNewSalePickerScreen.Q.getValue()).f282471b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerNewSalePickerScreen.T;
                        FreelancerNewSalePickerScreen freelancerNewSalePickerScreen2 = this.f11909b;
                        return tki.g.a(freelancerNewSalePickerScreen2, (h) freelancerNewSalePickerScreen2.R.getValue(), v.k(new RowLoadingDelegate(), freelancerNewSalePickerScreen2.N, freelancerNewSalePickerScreen2.O, freelancerNewSalePickerScreen2.P), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: b27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerNewSalePickerScreen f11909b;

            {
                this.f11909b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerNewSalePickerScreen freelancerNewSalePickerScreen = this.f11909b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerNewSalePickerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerNewSalePickerScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerNewSalePickerScreenContract$InputData freelancerNewSalePickerScreenContract$InputData = freelancerNewSalePickerScreen.K;
                        freelancerNewSalePickerScreenContract$InputData.getClass();
                        return new c0(qVar, freelancerNewSalePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerNewSalePickerScreen.T;
                        return (h) ((c0) freelancerNewSalePickerScreen.Q.getValue()).f282471b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerNewSalePickerScreen.T;
                        FreelancerNewSalePickerScreen freelancerNewSalePickerScreen2 = this.f11909b;
                        return tki.g.a(freelancerNewSalePickerScreen2, (h) freelancerNewSalePickerScreen2.R.getValue(), v.k(new RowLoadingDelegate(), freelancerNewSalePickerScreen2.N, freelancerNewSalePickerScreen2.O, freelancerNewSalePickerScreen2.P), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: b27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerNewSalePickerScreen f11909b;

            {
                this.f11909b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerNewSalePickerScreen freelancerNewSalePickerScreen = this.f11909b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerNewSalePickerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerNewSalePickerScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerNewSalePickerScreenContract$InputData freelancerNewSalePickerScreenContract$InputData = freelancerNewSalePickerScreen.K;
                        freelancerNewSalePickerScreenContract$InputData.getClass();
                        return new c0(qVar, freelancerNewSalePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerNewSalePickerScreen.T;
                        return (h) ((c0) freelancerNewSalePickerScreen.Q.getValue()).f282471b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerNewSalePickerScreen.T;
                        FreelancerNewSalePickerScreen freelancerNewSalePickerScreen2 = this.f11909b;
                        return tki.g.a(freelancerNewSalePickerScreen2, (h) freelancerNewSalePickerScreen2.R.getValue(), v.k(new RowLoadingDelegate(), freelancerNewSalePickerScreen2.N, freelancerNewSalePickerScreen2.O, freelancerNewSalePickerScreen2.P), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (b27.h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.freelancer_sale_type_picker_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sale_type_picker_subtitle, null, null, 14), null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, new an9.i(rd0.e.b(this.N.f53218h), 19), new g(2, (b27.h) this.R.getValue(), b27.h.class, "onSaleTypeClicked", "onSaleTypeClicked(Lcom/revolut/feature/freelancer/common/models/sale/FreelancerSaleType;)V", 4, 10), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53530c), new b27.e(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
