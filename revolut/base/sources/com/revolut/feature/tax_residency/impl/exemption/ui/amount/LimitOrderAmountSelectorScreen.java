package com.revolut.feature.tax_residency.impl.exemption.ui.amount;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.tax_residency.impl.R$id;
import com.revolut.feature.tax_residency.impl.R$layout;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.exemption.ui.amount.LimitOrderAmountSelectorScreen;
import com.revolut.feature.tax_residency.impl.exemption.ui.amount.LimitOrderAmountSelectorScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tne.b;
import tne.c;
import tne.e;
import tne.g;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/exemption/ui/amount/LimitOrderAmountSelectorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ltne/e;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LimitOrderAmountSelectorScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(LimitOrderAmountSelectorScreen.class, "binding", "getBinding()Lcom/revolut/feature/tax_residency/impl/databinding/ScreenTaxExemptionAmountSelectorBinding;", 0))};
    public final LimitOrderAmountSelectorScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public LimitOrderAmountSelectorScreen(LimitOrderAmountSelectorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_tax_exemption_amount_selector;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: tne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LimitOrderAmountSelectorScreen f272428b;

            {
                this.f272428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen = this.f272428b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LimitOrderAmountSelectorScreen.S;
                        LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen2 = this.f272428b;
                        return dli.f.a(limitOrderAmountSelectorScreen2, (g) limitOrderAmountSelectorScreen2.R.getValue(), u.c((CenteredAmountDelegate) limitOrderAmountSelectorScreen2.P.getValue()), R$id.exemptionAmountSelector_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LimitOrderAmountSelectorScreen.S;
                        qd0.b bVarN = ((lne.a) limitOrderAmountSelectorScreen.Q.getValue()).f197213b.e.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = LimitOrderAmountSelectorScreen.S;
                        return new CenteredAmountDelegate(new ta8.a(limitOrderAmountSelectorScreen, 24));
                    case 3:
                        KProperty[] kPropertyArr4 = LimitOrderAmountSelectorScreen.S;
                        qji.b bVarU2 = limitOrderAmountSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.exemption.ui.amount.di.LimitOrderAmountSelectorScreenInjector");
                        lne.d dVar = (lne.d) bVarU2;
                        lne.c cVar = dVar.f197227b;
                        lne.d dVar2 = dVar.f197228c;
                        LimitOrderAmountSelectorScreenContract$InputData limitOrderAmountSelectorScreenContract$InputData = limitOrderAmountSelectorScreen.K;
                        limitOrderAmountSelectorScreenContract$InputData.getClass();
                        return new lne.a(cVar, dVar2, limitOrderAmountSelectorScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = LimitOrderAmountSelectorScreen.S;
                        return (g) ((lne.a) limitOrderAmountSelectorScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: tne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LimitOrderAmountSelectorScreen f272428b;

            {
                this.f272428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen = this.f272428b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LimitOrderAmountSelectorScreen.S;
                        LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen2 = this.f272428b;
                        return dli.f.a(limitOrderAmountSelectorScreen2, (g) limitOrderAmountSelectorScreen2.R.getValue(), u.c((CenteredAmountDelegate) limitOrderAmountSelectorScreen2.P.getValue()), R$id.exemptionAmountSelector_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LimitOrderAmountSelectorScreen.S;
                        qd0.b bVarN = ((lne.a) limitOrderAmountSelectorScreen.Q.getValue()).f197213b.e.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = LimitOrderAmountSelectorScreen.S;
                        return new CenteredAmountDelegate(new ta8.a(limitOrderAmountSelectorScreen, 24));
                    case 3:
                        KProperty[] kPropertyArr4 = LimitOrderAmountSelectorScreen.S;
                        qji.b bVarU2 = limitOrderAmountSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.exemption.ui.amount.di.LimitOrderAmountSelectorScreenInjector");
                        lne.d dVar = (lne.d) bVarU2;
                        lne.c cVar = dVar.f197227b;
                        lne.d dVar2 = dVar.f197228c;
                        LimitOrderAmountSelectorScreenContract$InputData limitOrderAmountSelectorScreenContract$InputData = limitOrderAmountSelectorScreen.K;
                        limitOrderAmountSelectorScreenContract$InputData.getClass();
                        return new lne.a(cVar, dVar2, limitOrderAmountSelectorScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = LimitOrderAmountSelectorScreen.S;
                        return (g) ((lne.a) limitOrderAmountSelectorScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: tne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LimitOrderAmountSelectorScreen f272428b;

            {
                this.f272428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen = this.f272428b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LimitOrderAmountSelectorScreen.S;
                        LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen2 = this.f272428b;
                        return dli.f.a(limitOrderAmountSelectorScreen2, (g) limitOrderAmountSelectorScreen2.R.getValue(), u.c((CenteredAmountDelegate) limitOrderAmountSelectorScreen2.P.getValue()), R$id.exemptionAmountSelector_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LimitOrderAmountSelectorScreen.S;
                        qd0.b bVarN = ((lne.a) limitOrderAmountSelectorScreen.Q.getValue()).f197213b.e.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = LimitOrderAmountSelectorScreen.S;
                        return new CenteredAmountDelegate(new ta8.a(limitOrderAmountSelectorScreen, 24));
                    case 3:
                        KProperty[] kPropertyArr4 = LimitOrderAmountSelectorScreen.S;
                        qji.b bVarU2 = limitOrderAmountSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.exemption.ui.amount.di.LimitOrderAmountSelectorScreenInjector");
                        lne.d dVar = (lne.d) bVarU2;
                        lne.c cVar = dVar.f197227b;
                        lne.d dVar2 = dVar.f197228c;
                        LimitOrderAmountSelectorScreenContract$InputData limitOrderAmountSelectorScreenContract$InputData = limitOrderAmountSelectorScreen.K;
                        limitOrderAmountSelectorScreenContract$InputData.getClass();
                        return new lne.a(cVar, dVar2, limitOrderAmountSelectorScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = LimitOrderAmountSelectorScreen.S;
                        return (g) ((lne.a) limitOrderAmountSelectorScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: tne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LimitOrderAmountSelectorScreen f272428b;

            {
                this.f272428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen = this.f272428b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LimitOrderAmountSelectorScreen.S;
                        LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen2 = this.f272428b;
                        return dli.f.a(limitOrderAmountSelectorScreen2, (g) limitOrderAmountSelectorScreen2.R.getValue(), u.c((CenteredAmountDelegate) limitOrderAmountSelectorScreen2.P.getValue()), R$id.exemptionAmountSelector_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LimitOrderAmountSelectorScreen.S;
                        qd0.b bVarN = ((lne.a) limitOrderAmountSelectorScreen.Q.getValue()).f197213b.e.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = LimitOrderAmountSelectorScreen.S;
                        return new CenteredAmountDelegate(new ta8.a(limitOrderAmountSelectorScreen, 24));
                    case 3:
                        KProperty[] kPropertyArr4 = LimitOrderAmountSelectorScreen.S;
                        qji.b bVarU2 = limitOrderAmountSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.exemption.ui.amount.di.LimitOrderAmountSelectorScreenInjector");
                        lne.d dVar = (lne.d) bVarU2;
                        lne.c cVar = dVar.f197227b;
                        lne.d dVar2 = dVar.f197228c;
                        LimitOrderAmountSelectorScreenContract$InputData limitOrderAmountSelectorScreenContract$InputData = limitOrderAmountSelectorScreen.K;
                        limitOrderAmountSelectorScreenContract$InputData.getClass();
                        return new lne.a(cVar, dVar2, limitOrderAmountSelectorScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = LimitOrderAmountSelectorScreen.S;
                        return (g) ((lne.a) limitOrderAmountSelectorScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: tne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LimitOrderAmountSelectorScreen f272428b;

            {
                this.f272428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen = this.f272428b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LimitOrderAmountSelectorScreen.S;
                        LimitOrderAmountSelectorScreen limitOrderAmountSelectorScreen2 = this.f272428b;
                        return dli.f.a(limitOrderAmountSelectorScreen2, (g) limitOrderAmountSelectorScreen2.R.getValue(), u.c((CenteredAmountDelegate) limitOrderAmountSelectorScreen2.P.getValue()), R$id.exemptionAmountSelector_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LimitOrderAmountSelectorScreen.S;
                        qd0.b bVarN = ((lne.a) limitOrderAmountSelectorScreen.Q.getValue()).f197213b.e.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = LimitOrderAmountSelectorScreen.S;
                        return new CenteredAmountDelegate(new ta8.a(limitOrderAmountSelectorScreen, 24));
                    case 3:
                        KProperty[] kPropertyArr4 = LimitOrderAmountSelectorScreen.S;
                        qji.b bVarU2 = limitOrderAmountSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.exemption.ui.amount.di.LimitOrderAmountSelectorScreenInjector");
                        lne.d dVar = (lne.d) bVarU2;
                        lne.c cVar = dVar.f197227b;
                        lne.d dVar2 = dVar.f197228c;
                        LimitOrderAmountSelectorScreenContract$InputData limitOrderAmountSelectorScreenContract$InputData = limitOrderAmountSelectorScreen.K;
                        limitOrderAmountSelectorScreenContract$InputData.getClass();
                        return new lne.a(cVar, dVar2, limitOrderAmountSelectorScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = LimitOrderAmountSelectorScreen.S;
                        return (g) ((lne.a) limitOrderAmountSelectorScreen.Q.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f144968c.setButtonEnabled(uiState.f272432b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (lne.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f144967b;
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.tax_exemption_limit_order_edit_title, null, null, 14));
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f144968c.setDescription(new TextLocalisedClause(R$string.tax_exemption_limit_order_edit_footer, u.c(new MoneyClause(this.K.f89997a.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12));
        d3().f144968c.setButtonText(new TextLocalisedClause(R$string.tax_exemption_limit_order_edit_submit, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f144967b.f59338a), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f144968c.f0()), null, new c(this, continuation, 1), 3);
    }

    public final gne.a d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gne.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
