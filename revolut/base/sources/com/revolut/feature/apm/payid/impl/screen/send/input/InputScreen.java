package com.revolut.feature.apm.payid.impl.screen.send.input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.payid.api.R$string;
import com.revolut.feature.apm.payid.impl.screen.send.input.InputScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ea2.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import ya2.b;
import ya2.c;
import ya2.d;
import ya2.f;
import ya2.k;
import ya2.m;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/send/input/InputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lya2/k;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final f K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public InputScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new y7k.h(6));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ya2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputScreen f311906b;

            {
                this.f311906b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InputScreen inputScreen = this.f311906b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InputScreen.R;
                        return (m) ((ea2.g) inputScreen.P.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InputScreen.R;
                        qji.b bVarU2 = inputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.send.input.di.InputScreenInjector");
                        ea2.j jVar = (ea2.j) bVarU2;
                        ea2.h hVar = jVar.f124088b;
                        ea2.j jVar2 = jVar.f124089c;
                        f fVar = inputScreen.K;
                        fVar.getClass();
                        return new ea2.g(hVar, jVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = InputScreen.R;
                        InputScreen inputScreen2 = this.f311906b;
                        return dli.f.a(inputScreen2, (m) inputScreen2.O.getValue(), u.c((InputTextDelegate) inputScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ya2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputScreen f311906b;

            {
                this.f311906b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InputScreen inputScreen = this.f311906b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InputScreen.R;
                        return (m) ((ea2.g) inputScreen.P.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InputScreen.R;
                        qji.b bVarU2 = inputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.send.input.di.InputScreenInjector");
                        ea2.j jVar = (ea2.j) bVarU2;
                        ea2.h hVar = jVar.f124088b;
                        ea2.j jVar2 = jVar.f124089c;
                        f fVar = inputScreen.K;
                        fVar.getClass();
                        return new ea2.g(hVar, jVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = InputScreen.R;
                        InputScreen inputScreen2 = this.f311906b;
                        return dli.f.a(inputScreen2, (m) inputScreen2.O.getValue(), u.c((InputTextDelegate) inputScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ya2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputScreen f311906b;

            {
                this.f311906b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InputScreen inputScreen = this.f311906b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InputScreen.R;
                        return (m) ((ea2.g) inputScreen.P.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InputScreen.R;
                        qji.b bVarU2 = inputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.send.input.di.InputScreenInjector");
                        ea2.j jVar = (ea2.j) bVarU2;
                        ea2.h hVar = jVar.f124088b;
                        ea2.j jVar2 = jVar.f124089c;
                        f fVar = inputScreen.K;
                        fVar.getClass();
                        return new ea2.g(hVar, jVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = InputScreen.R;
                        InputScreen inputScreen2 = this.f311906b;
                        return dli.f.a(inputScreen2, (m) inputScreen2.O.getValue(), u.c((InputTextDelegate) inputScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f311915b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (m) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.add_contact_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.add_contact_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(true);
        largeActionButton.setText(new TextLocalisedClause(R$string.add_payid_button_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.N.getValue()).e.f121375b), null, new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
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
