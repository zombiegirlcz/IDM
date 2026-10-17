package com.revolut.feature.junior_settings.impl.ui_kompot.account_closure_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_closure_confirmation.JuniorAccountClosureConfirmationController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.n;
import kn8.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mn8.o;
import te0.w;
import vc.s;
import xn8.b;
import xn8.c;
import xn8.e;
import xn8.f;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_closure_confirmation/JuniorAccountClosureConfirmationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkn8/d;", "Ldli/a;", "Lxn8/f;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorAccountClosureConfirmationController extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(JuniorAccountClosureConfirmationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final e K;
    public final int L;
    public final h M;
    public final TwinHorizontalButtonDelegate N;
    public final ListCellDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public JuniorAccountClosureConfirmationController(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = new TwinHorizontalButtonDelegate();
        this.O = new ListCellDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: xn8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountClosureConfirmationController f307336b;

            {
                this.f307336b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorAccountClosureConfirmationController juniorAccountClosureConfirmationController = this.f307336b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountClosureConfirmationController.S;
                        return (h) ((mn8.e) juniorAccountClosureConfirmationController.Q.getValue()).f207425b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountClosureConfirmationController.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAccountClosureConfirmationController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        e eVar = juniorAccountClosureConfirmationController.K;
                        eVar.getClass();
                        return new mn8.e(oVar, eVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountClosureConfirmationController.S;
                        JuniorAccountClosureConfirmationController juniorAccountClosureConfirmationController2 = this.f307336b;
                        return dli.f.a(juniorAccountClosureConfirmationController2, (h) juniorAccountClosureConfirmationController2.P.getValue(), v.k(juniorAccountClosureConfirmationController2.N, juniorAccountClosureConfirmationController2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: xn8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountClosureConfirmationController f307336b;

            {
                this.f307336b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorAccountClosureConfirmationController juniorAccountClosureConfirmationController = this.f307336b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountClosureConfirmationController.S;
                        return (h) ((mn8.e) juniorAccountClosureConfirmationController.Q.getValue()).f207425b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountClosureConfirmationController.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAccountClosureConfirmationController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        e eVar = juniorAccountClosureConfirmationController.K;
                        eVar.getClass();
                        return new mn8.e(oVar, eVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountClosureConfirmationController.S;
                        JuniorAccountClosureConfirmationController juniorAccountClosureConfirmationController2 = this.f307336b;
                        return dli.f.a(juniorAccountClosureConfirmationController2, (h) juniorAccountClosureConfirmationController2.P.getValue(), v.k(juniorAccountClosureConfirmationController2.N, juniorAccountClosureConfirmationController2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: xn8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountClosureConfirmationController f307336b;

            {
                this.f307336b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorAccountClosureConfirmationController juniorAccountClosureConfirmationController = this.f307336b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountClosureConfirmationController.S;
                        return (h) ((mn8.e) juniorAccountClosureConfirmationController.Q.getValue()).f207425b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountClosureConfirmationController.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAccountClosureConfirmationController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        e eVar = juniorAccountClosureConfirmationController.K;
                        eVar.getClass();
                        return new mn8.e(oVar, eVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountClosureConfirmationController.S;
                        JuniorAccountClosureConfirmationController juniorAccountClosureConfirmationController2 = this.f307336b;
                        return dli.f.a(juniorAccountClosureConfirmationController2, (h) juniorAccountClosureConfirmationController2.P.getValue(), v.k(juniorAccountClosureConfirmationController2.N, juniorAccountClosureConfirmationController2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f307341a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mn8.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (xn8.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.N;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new c(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
