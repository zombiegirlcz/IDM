package com.revolut.feature.giro.impl.ui.form;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b77.c;
import b77.d;
import b77.f;
import b77.i;
import b77.j;
import b77.k;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreen;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/form/DirectDebitFormScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lb77/i;", "Ldli/a;", "Lb77/k;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitFormScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DirectDebitFormScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final DirectDebitFormScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public DirectDebitFormScreen(DirectDebitFormScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b77.b.f);
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: b77.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitFormScreen f12921b;

            {
                this.f12921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DirectDebitFormScreen directDebitFormScreen = this.f12921b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitFormScreen.R;
                        DirectDebitFormScreen directDebitFormScreen2 = this.f12921b;
                        return dli.f.a(directDebitFormScreen2, directDebitFormScreen2.R2(), u.c(directDebitFormScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDebitFormScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(directDebitFormScreen.m2()).a().get(y67.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y67.d.class, " is not found"));
                        }
                        y67.d dVar = ((y67.d) aVar2.b()).f;
                        DirectDebitFormScreenContract$InputData directDebitFormScreenContract$InputData = directDebitFormScreen.K;
                        directDebitFormScreenContract$InputData.getClass();
                        return new y67.b(dVar, directDebitFormScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DirectDebitFormScreen.R;
                        return (j) ((y67.b) directDebitFormScreen.P.getValue()).f311212c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: b77.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitFormScreen f12921b;

            {
                this.f12921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DirectDebitFormScreen directDebitFormScreen = this.f12921b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitFormScreen.R;
                        DirectDebitFormScreen directDebitFormScreen2 = this.f12921b;
                        return dli.f.a(directDebitFormScreen2, directDebitFormScreen2.R2(), u.c(directDebitFormScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDebitFormScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(directDebitFormScreen.m2()).a().get(y67.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y67.d.class, " is not found"));
                        }
                        y67.d dVar = ((y67.d) aVar2.b()).f;
                        DirectDebitFormScreenContract$InputData directDebitFormScreenContract$InputData = directDebitFormScreen.K;
                        directDebitFormScreenContract$InputData.getClass();
                        return new y67.b(dVar, directDebitFormScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DirectDebitFormScreen.R;
                        return (j) ((y67.b) directDebitFormScreen.P.getValue()).f311212c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: b77.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitFormScreen f12921b;

            {
                this.f12921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DirectDebitFormScreen directDebitFormScreen = this.f12921b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitFormScreen.R;
                        DirectDebitFormScreen directDebitFormScreen2 = this.f12921b;
                        return dli.f.a(directDebitFormScreen2, directDebitFormScreen2.R2(), u.c(directDebitFormScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDebitFormScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(directDebitFormScreen.m2()).a().get(y67.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y67.d.class, " is not found"));
                        }
                        y67.d dVar = ((y67.d) aVar2.b()).f;
                        DirectDebitFormScreenContract$InputData directDebitFormScreenContract$InputData = directDebitFormScreen.K;
                        directDebitFormScreenContract$InputData.getClass();
                        return new y67.b(dVar, directDebitFormScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DirectDebitFormScreen.R;
                        return (j) ((y67.b) directDebitFormScreen.P.getValue()).f311212c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.d;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        NavBarWithToolbar navBarWithToolbar2 = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
        navBarWithToolbar2.setTitle(textLocalisedClause, null);
        d3().f174564b.setEnabled(uiState.f12927b);
        d3().f174564b.setText(uiState.f12928c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y67.b) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setLoadingButtonTag("BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), null, new b77.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.i.f121375b), null, new f(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
