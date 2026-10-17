package com.revolut.feature.external_accounts.impl.mandate.limit_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitInputScreen;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitInputScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import fgj.g;
import fh6.e;
import fh6.f;
import fh6.i;
import fh6.j;
import fh6.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.v1;
import xf6.y1;
import xi0.b;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/limit_input/MandateLimitInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfh6/i;", "Ldli/a;", "Lfh6/j;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MandateLimitInputScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(MandateLimitInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final MandateLimitInputScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final b R;
    public final CenteredAmountDelegate S;

    public MandateLimitInputScreen(MandateLimitInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, e.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: fh6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MandateLimitInputScreen f135155b;

            {
                this.f135155b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MandateLimitInputScreen mandateLimitInputScreen = this.f135155b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MandateLimitInputScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(mandateLimitInputScreen.m2()).a().get(je6.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        MandateLimitInputScreenContract$InputData mandateLimitInputScreenContract$InputData = mandateLimitInputScreen.K;
                        mandateLimitInputScreenContract$InputData.getClass();
                        return new v1(y1Var, mandateLimitInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MandateLimitInputScreen.T;
                        return (k) ((v1) mandateLimitInputScreen.N.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = MandateLimitInputScreen.T;
                        MandateLimitInputScreen mandateLimitInputScreen2 = this.f135155b;
                        return dli.f.a(mandateLimitInputScreen2, (k) mandateLimitInputScreen2.O.getValue(), u.c(mandateLimitInputScreen2.S), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = MandateLimitInputScreen.T;
                        qd0.b bVarN = ((v1) mandateLimitInputScreen.N.getValue()).f305119b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: fh6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MandateLimitInputScreen f135155b;

            {
                this.f135155b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MandateLimitInputScreen mandateLimitInputScreen = this.f135155b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MandateLimitInputScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(mandateLimitInputScreen.m2()).a().get(je6.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        MandateLimitInputScreenContract$InputData mandateLimitInputScreenContract$InputData = mandateLimitInputScreen.K;
                        mandateLimitInputScreenContract$InputData.getClass();
                        return new v1(y1Var, mandateLimitInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MandateLimitInputScreen.T;
                        return (k) ((v1) mandateLimitInputScreen.N.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = MandateLimitInputScreen.T;
                        MandateLimitInputScreen mandateLimitInputScreen2 = this.f135155b;
                        return dli.f.a(mandateLimitInputScreen2, (k) mandateLimitInputScreen2.O.getValue(), u.c(mandateLimitInputScreen2.S), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = MandateLimitInputScreen.T;
                        qd0.b bVarN = ((v1) mandateLimitInputScreen.N.getValue()).f305119b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: fh6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MandateLimitInputScreen f135155b;

            {
                this.f135155b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MandateLimitInputScreen mandateLimitInputScreen = this.f135155b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MandateLimitInputScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(mandateLimitInputScreen.m2()).a().get(je6.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        MandateLimitInputScreenContract$InputData mandateLimitInputScreenContract$InputData = mandateLimitInputScreen.K;
                        mandateLimitInputScreenContract$InputData.getClass();
                        return new v1(y1Var, mandateLimitInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MandateLimitInputScreen.T;
                        return (k) ((v1) mandateLimitInputScreen.N.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = MandateLimitInputScreen.T;
                        MandateLimitInputScreen mandateLimitInputScreen2 = this.f135155b;
                        return dli.f.a(mandateLimitInputScreen2, (k) mandateLimitInputScreen2.O.getValue(), u.c(mandateLimitInputScreen2.S), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = MandateLimitInputScreen.T;
                        qd0.b bVarN = ((v1) mandateLimitInputScreen.N.getValue()).f305119b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: fh6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MandateLimitInputScreen f135155b;

            {
                this.f135155b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                MandateLimitInputScreen mandateLimitInputScreen = this.f135155b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MandateLimitInputScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(mandateLimitInputScreen.m2()).a().get(je6.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        MandateLimitInputScreenContract$InputData mandateLimitInputScreenContract$InputData = mandateLimitInputScreen.K;
                        mandateLimitInputScreenContract$InputData.getClass();
                        return new v1(y1Var, mandateLimitInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MandateLimitInputScreen.T;
                        return (k) ((v1) mandateLimitInputScreen.N.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = MandateLimitInputScreen.T;
                        MandateLimitInputScreen mandateLimitInputScreen2 = this.f135155b;
                        return dli.f.a(mandateLimitInputScreen2, (k) mandateLimitInputScreen2.O.getValue(), u.c(mandateLimitInputScreen2.S), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = MandateLimitInputScreen.T;
                        qd0.b bVarN = ((v1) mandateLimitInputScreen.N.getValue()).f305119b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        this.R = inputData.f72458a.getF72455a().f115083b;
        this.S = new CenteredAmountDelegate(new g(this, i5));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        jii.s sVarD3 = d3();
        sVarD3.f174557b.setEnabled(uiState.f135162c);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = sVarD3.e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        screenRecyclerNavbarFooterNextbuttonToolbar.setTitle(uiState.f135161b, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jii.s sVarD3 = d3();
        sVarD3.e.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        sVarD3.f174557b.setText(new TextLocalisedClause(R$string.open_banking_mandate_limits_update_limit, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jii.s sVarD3 = d3();
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(sVarD3.e.f59410q), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(sVarD3.f174557b.o), null, new f(this, continuation, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
