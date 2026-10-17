package com.revolut.feature.masav.impl.ui.form;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c69.d;
import c69.f;
import c69.l;
import c69.m;
import c69.t;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.masav.api.R$string;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w59.g;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc69/l;", "Ldli/a;", "Lc69/t;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MasavDirectDebitFormScreen extends ViewController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(MasavDirectDebitFormScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final MasavDirectDebitFormScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public MasavDirectDebitFormScreen(MasavDirectDebitFormScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, c69.c.f);
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: c69.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MasavDirectDebitFormScreen f21727b;

            {
                this.f21727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MasavDirectDebitFormScreen masavDirectDebitFormScreen = this.f21727b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MasavDirectDebitFormScreen.R;
                        w59.g gVar = (w59.g) masavDirectDebitFormScreen.P.getValue();
                        switch (gVar.f294750a) {
                            case 0:
                                return (m) gVar.d.get();
                            default:
                                return (m) gVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = MasavDirectDebitFormScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(masavDirectDebitFormScreen.m2()).a().get(w59.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (w59.g) ((d69.a) ((d69.b) aVar2.b()).b().mo3808a(masavDirectDebitFormScreen)).d0(masavDirectDebitFormScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", w59.d.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = MasavDirectDebitFormScreen.R;
                        MasavDirectDebitFormScreen masavDirectDebitFormScreen2 = this.f21727b;
                        return dli.f.a(masavDirectDebitFormScreen2, masavDirectDebitFormScreen2.R2(), zhm.u.c(masavDirectDebitFormScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: c69.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MasavDirectDebitFormScreen f21727b;

            {
                this.f21727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MasavDirectDebitFormScreen masavDirectDebitFormScreen = this.f21727b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MasavDirectDebitFormScreen.R;
                        w59.g gVar = (w59.g) masavDirectDebitFormScreen.P.getValue();
                        switch (gVar.f294750a) {
                            case 0:
                                return (m) gVar.d.get();
                            default:
                                return (m) gVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = MasavDirectDebitFormScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(masavDirectDebitFormScreen.m2()).a().get(w59.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (w59.g) ((d69.a) ((d69.b) aVar2.b()).b().mo3808a(masavDirectDebitFormScreen)).d0(masavDirectDebitFormScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", w59.d.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = MasavDirectDebitFormScreen.R;
                        MasavDirectDebitFormScreen masavDirectDebitFormScreen2 = this.f21727b;
                        return dli.f.a(masavDirectDebitFormScreen2, masavDirectDebitFormScreen2.R2(), zhm.u.c(masavDirectDebitFormScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: c69.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MasavDirectDebitFormScreen f21727b;

            {
                this.f21727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MasavDirectDebitFormScreen masavDirectDebitFormScreen = this.f21727b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MasavDirectDebitFormScreen.R;
                        w59.g gVar = (w59.g) masavDirectDebitFormScreen.P.getValue();
                        switch (gVar.f294750a) {
                            case 0:
                                return (m) gVar.d.get();
                            default:
                                return (m) gVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = MasavDirectDebitFormScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(masavDirectDebitFormScreen.m2()).a().get(w59.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (w59.g) ((d69.a) ((d69.b) aVar2.b()).b().mo3808a(masavDirectDebitFormScreen)).d0(masavDirectDebitFormScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", w59.d.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = MasavDirectDebitFormScreen.R;
                        MasavDirectDebitFormScreen masavDirectDebitFormScreen2 = this.f21727b;
                        return dli.f.a(masavDirectDebitFormScreen2, masavDirectDebitFormScreen2.R2(), zhm.u.c(masavDirectDebitFormScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.masav_direct_debits_add_direct_debit_title, null, null, 14), null);
        d3().f174564b.setText(new TextLocalisedClause(R$string.masav_direct_debits_add_direct_debit_confirm, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        u uVarD3 = d3();
        uVarD3.f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        uVarD3.f174564b.setLoadingButtonTag("BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 1), 3);
        InputTextDelegate inputTextDelegate = this.N;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new c69.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.i.f121375b), new c69.g(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.O.getValue();
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
