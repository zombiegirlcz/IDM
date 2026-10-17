package com.revolut.feature.credit.impl.ui.entry_points;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsController;
import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ft.d;
import g35.c;
import g35.f;
import g35.l;
import jii.m;
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
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/entry_points/CreditEntryPointsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lg35/l;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditEntryPointsController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditEntryPointsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CreditEntryPointsControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final ProductSelectionDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public CreditEntryPointsController(CreditEntryPointsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: g35.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditEntryPointsController f140192b;

            {
                this.f140192b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditEntryPointsController creditEntryPointsController = this.f140192b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditEntryPointsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(creditEntryPointsController.m2()).a().get(lp3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lp3.a.class, " is not found"));
                        }
                        t15.d dVar = ((t15.d) ((t15.a) aVar2.b())).A;
                        CreditEntryPointsControllerContract$InputData creditEntryPointsControllerContract$InputData = creditEntryPointsController.K;
                        creditEntryPointsControllerContract$InputData.getClass();
                        return new t15.e(dVar, creditEntryPointsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditEntryPointsController.S;
                        return (f) ((t15.e) creditEntryPointsController.M.getValue()).f267176c.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditEntryPointsController.S;
                        int i3 = R$id.recyclerView;
                        CreditEntryPointsController creditEntryPointsController2 = this.f140192b;
                        return dli.f.a(creditEntryPointsController2, (f) creditEntryPointsController2.N.getValue(), v.k(creditEntryPointsController2.P, creditEntryPointsController2.Q, new ProductSelectionLoadingDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: g35.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditEntryPointsController f140192b;

            {
                this.f140192b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditEntryPointsController creditEntryPointsController = this.f140192b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditEntryPointsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(creditEntryPointsController.m2()).a().get(lp3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lp3.a.class, " is not found"));
                        }
                        t15.d dVar = ((t15.d) ((t15.a) aVar2.b())).A;
                        CreditEntryPointsControllerContract$InputData creditEntryPointsControllerContract$InputData = creditEntryPointsController.K;
                        creditEntryPointsControllerContract$InputData.getClass();
                        return new t15.e(dVar, creditEntryPointsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditEntryPointsController.S;
                        return (f) ((t15.e) creditEntryPointsController.M.getValue()).f267176c.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditEntryPointsController.S;
                        int i3 = R$id.recyclerView;
                        CreditEntryPointsController creditEntryPointsController2 = this.f140192b;
                        return dli.f.a(creditEntryPointsController2, (f) creditEntryPointsController2.N.getValue(), v.k(creditEntryPointsController2.P, creditEntryPointsController2.Q, new ProductSelectionLoadingDelegate()), i3, null, null, null, 56);
                }
            }
        });
        this.O = s.t(this, c.f);
        this.P = new ProductSelectionDelegate();
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: g35.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditEntryPointsController f140192b;

            {
                this.f140192b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditEntryPointsController creditEntryPointsController = this.f140192b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditEntryPointsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(creditEntryPointsController.m2()).a().get(lp3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lp3.a.class, " is not found"));
                        }
                        t15.d dVar = ((t15.d) ((t15.a) aVar2.b())).A;
                        CreditEntryPointsControllerContract$InputData creditEntryPointsControllerContract$InputData = creditEntryPointsController.K;
                        creditEntryPointsControllerContract$InputData.getClass();
                        return new t15.e(dVar, creditEntryPointsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditEntryPointsController.S;
                        return (f) ((t15.e) creditEntryPointsController.M.getValue()).f267176c.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditEntryPointsController.S;
                        int i32 = R$id.recyclerView;
                        CreditEntryPointsController creditEntryPointsController2 = this.f140192b;
                        return dli.f.a(creditEntryPointsController2, (f) creditEntryPointsController2.N.getValue(), v.k(creditEntryPointsController2.P, creditEntryPointsController2.Q, new ProductSelectionLoadingDelegate()), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f140198a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t15.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, null, 20), 3);
        ViewController.P2(this, rd0.e.b(this.P.p()), new g35.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new g35.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
