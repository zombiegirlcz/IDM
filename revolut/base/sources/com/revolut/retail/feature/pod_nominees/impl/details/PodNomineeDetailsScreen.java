package com.revolut.retail.feature.pod_nominees.impl.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pod_nominees.impl.details.PodNomineeDetailsScreen;
import com.revolut.retail.feature.pod_nominees.impl.details.PodNomineeDetailsScreenContract$InputData;
import com.revolut.retail.feature.pod_nominees.impl.details.a;
import iaf.d;
import iek.c;
import iek.f;
import iek.h;
import iek.i;
import iek.j;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/details/PodNomineeDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liek/h;", "Ldli/a;", "Liek/j;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PodNomineeDetailsScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PodNomineeDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PodNomineeDetailsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final ao.h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public PodNomineeDetailsScreen(PodNomineeDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new i83.b(25));
        this.M = w.y0(new i83.b(26));
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, iek.b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: iek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineeDetailsScreen f160752b;

            {
                this.f160752b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PodNomineeDetailsScreen podNomineeDetailsScreen = this.f160752b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineeDetailsScreen.S;
                        qji.b bVarU2 = podNomineeDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.details.di.PodNomineeDetailsScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineeDetailsScreenContract$InputData podNomineeDetailsScreenContract$InputData = podNomineeDetailsScreen.K;
                        podNomineeDetailsScreenContract$InputData.getClass();
                        return new kek.a(cVar, dVar2, podNomineeDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineeDetailsScreen.S;
                        return (i) ((kek.a) podNomineeDetailsScreen.P.getValue()).f183108c.get();
                    default:
                        KProperty[] kPropertyArr3 = PodNomineeDetailsScreen.S;
                        PodNomineeDetailsScreen podNomineeDetailsScreen2 = this.f160752b;
                        return dli.f.a(podNomineeDetailsScreen2, (i) podNomineeDetailsScreen2.Q.getValue(), v.k((ListSubheaderDelegate) podNomineeDetailsScreen2.M.getValue(), (RowDelegate) podNomineeDetailsScreen2.L.getValue(), new CellDetailsNoteDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: iek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineeDetailsScreen f160752b;

            {
                this.f160752b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PodNomineeDetailsScreen podNomineeDetailsScreen = this.f160752b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineeDetailsScreen.S;
                        qji.b bVarU2 = podNomineeDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.details.di.PodNomineeDetailsScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineeDetailsScreenContract$InputData podNomineeDetailsScreenContract$InputData = podNomineeDetailsScreen.K;
                        podNomineeDetailsScreenContract$InputData.getClass();
                        return new kek.a(cVar, dVar2, podNomineeDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineeDetailsScreen.S;
                        return (i) ((kek.a) podNomineeDetailsScreen.P.getValue()).f183108c.get();
                    default:
                        KProperty[] kPropertyArr3 = PodNomineeDetailsScreen.S;
                        PodNomineeDetailsScreen podNomineeDetailsScreen2 = this.f160752b;
                        return dli.f.a(podNomineeDetailsScreen2, (i) podNomineeDetailsScreen2.Q.getValue(), v.k((ListSubheaderDelegate) podNomineeDetailsScreen2.M.getValue(), (RowDelegate) podNomineeDetailsScreen2.L.getValue(), new CellDetailsNoteDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: iek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineeDetailsScreen f160752b;

            {
                this.f160752b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PodNomineeDetailsScreen podNomineeDetailsScreen = this.f160752b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineeDetailsScreen.S;
                        qji.b bVarU2 = podNomineeDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.details.di.PodNomineeDetailsScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineeDetailsScreenContract$InputData podNomineeDetailsScreenContract$InputData = podNomineeDetailsScreen.K;
                        podNomineeDetailsScreenContract$InputData.getClass();
                        return new kek.a(cVar, dVar2, podNomineeDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineeDetailsScreen.S;
                        return (i) ((kek.a) podNomineeDetailsScreen.P.getValue()).f183108c.get();
                    default:
                        KProperty[] kPropertyArr3 = PodNomineeDetailsScreen.S;
                        PodNomineeDetailsScreen podNomineeDetailsScreen2 = this.f160752b;
                        return dli.f.a(podNomineeDetailsScreen2, (i) podNomineeDetailsScreen2.Q.getValue(), v.k((ListSubheaderDelegate) podNomineeDetailsScreen2.M.getValue(), (RowDelegate) podNomineeDetailsScreen2.L.getValue(), new CellDetailsNoteDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        a aVar = uiState.f160758a;
        if (aVar instanceof f) {
            navBarWithToolbar.H0(false);
            navBarWithToolbar.l0();
            f fVar = (f) aVar;
            TextClause textClause = fVar.f160754a;
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setEndIconImage(fVar.f160755b);
            return;
        }
        if (aVar.equals(a.C0628a.f102587a)) {
            navBarWithToolbar.l0();
            navBarWithToolbar.j0(false);
        } else {
            if (!aVar.equals(a.b.f102588a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.H0(false);
            navBarWithToolbar.I0(t3.PROFILE, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (kek.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, null, 4), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.M.getValue()).f52707c), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.L.getValue()).f53218h), new iek.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
