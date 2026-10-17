package com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.l;
import lu7.s;
import te0.w;
import xki.e;
import yna.j1;
import yu7.b;
import yu7.c;
import yu7.d;
import yu7.h;
import yu7.i;
import yu7.k;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/coverage_activation/InsuranceCoverageActivationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyu7/h;", "Ldli/a;", "Lyu7/i;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceCoverageActivationScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InsuranceCoverageActivationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InsuranceCoverageActivationScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final Object N;
    public final Object O;
    public final ao.h P;
    public final Object Q;
    public final Object R;

    public InsuranceCoverageActivationScreen(InsuranceCoverageActivationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new RowDelegate(null, null, 7);
        this.N = w.y0(new j1(28));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: yu7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceCoverageActivationScreen f316898b;

            {
                this.f316898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsuranceCoverageActivationScreen insuranceCoverageActivationScreen = this.f316898b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceCoverageActivationScreen.S;
                        InsuranceCoverageActivationScreen insuranceCoverageActivationScreen2 = this.f316898b;
                        return dli.f.a(insuranceCoverageActivationScreen2, (k) insuranceCoverageActivationScreen2.R.getValue(), v.k(insuranceCoverageActivationScreen2.M, new RowLoadingDelegate(), (LargeActionButtonDelegate) insuranceCoverageActivationScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceCoverageActivationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceCoverageActivationScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        InsuranceCoverageActivationScreenContract$InputData insuranceCoverageActivationScreenContract$InputData = insuranceCoverageActivationScreen.K;
                        insuranceCoverageActivationScreenContract$InputData.getClass();
                        return new lu7.l(sVar, insuranceCoverageActivationScreen, insuranceCoverageActivationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceCoverageActivationScreen.S;
                        return (k) ((lu7.l) insuranceCoverageActivationScreen.Q.getValue()).f.get();
                }
            }
        });
        this.P = vc.s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: yu7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceCoverageActivationScreen f316898b;

            {
                this.f316898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsuranceCoverageActivationScreen insuranceCoverageActivationScreen = this.f316898b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceCoverageActivationScreen.S;
                        InsuranceCoverageActivationScreen insuranceCoverageActivationScreen2 = this.f316898b;
                        return dli.f.a(insuranceCoverageActivationScreen2, (k) insuranceCoverageActivationScreen2.R.getValue(), v.k(insuranceCoverageActivationScreen2.M, new RowLoadingDelegate(), (LargeActionButtonDelegate) insuranceCoverageActivationScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceCoverageActivationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceCoverageActivationScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        InsuranceCoverageActivationScreenContract$InputData insuranceCoverageActivationScreenContract$InputData = insuranceCoverageActivationScreen.K;
                        insuranceCoverageActivationScreenContract$InputData.getClass();
                        return new lu7.l(sVar, insuranceCoverageActivationScreen, insuranceCoverageActivationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceCoverageActivationScreen.S;
                        return (k) ((lu7.l) insuranceCoverageActivationScreen.Q.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: yu7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceCoverageActivationScreen f316898b;

            {
                this.f316898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InsuranceCoverageActivationScreen insuranceCoverageActivationScreen = this.f316898b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceCoverageActivationScreen.S;
                        InsuranceCoverageActivationScreen insuranceCoverageActivationScreen2 = this.f316898b;
                        return dli.f.a(insuranceCoverageActivationScreen2, (k) insuranceCoverageActivationScreen2.R.getValue(), v.k(insuranceCoverageActivationScreen2.M, new RowLoadingDelegate(), (LargeActionButtonDelegate) insuranceCoverageActivationScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceCoverageActivationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceCoverageActivationScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        InsuranceCoverageActivationScreenContract$InputData insuranceCoverageActivationScreenContract$InputData = insuranceCoverageActivationScreen.K;
                        insuranceCoverageActivationScreenContract$InputData.getClass();
                        return new lu7.l(sVar, insuranceCoverageActivationScreen, insuranceCoverageActivationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceCoverageActivationScreen.S;
                        return (k) ((lu7.l) insuranceCoverageActivationScreen.Q.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f316902a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174564b.setText(uiState.f316903b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.N.getValue()).d.f121375b), null, new yu7.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
