package com.revolut.feature.freelancer.impl.ui.sales.qr.share;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.sales.qr.share.FreelancerQrShareScreen;
import com.revolut.feature.freelancer.impl.ui.sales.qr.share.FreelancerQrShareScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l27.b;
import l27.c;
import l27.e;
import l27.f;
import l27.i;
import te0.w;
import us6.t0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/qr/share/FreelancerQrShareScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ll27/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerQrShareScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FreelancerQrShareScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FreelancerQrShareScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public FreelancerQrShareScreen(FreelancerQrShareScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: l27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerQrShareScreen f191681b;

            {
                this.f191681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerQrShareScreen freelancerQrShareScreen = this.f191681b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerQrShareScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerQrShareScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerQrShareScreenContract$InputData freelancerQrShareScreenContract$InputData = freelancerQrShareScreen.K;
                        freelancerQrShareScreenContract$InputData.getClass();
                        return new t0(qVar, freelancerQrShareScreen, freelancerQrShareScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerQrShareScreen.R;
                        return (i) ((t0) freelancerQrShareScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerQrShareScreen.R;
                        FreelancerQrShareScreen freelancerQrShareScreen2 = this.f191681b;
                        return dli.f.a(freelancerQrShareScreen2, (i) freelancerQrShareScreen2.P.getValue(), v.k(freelancerQrShareScreen2.N, new QRCodeDelegate(), new QRCodeLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: l27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerQrShareScreen f191681b;

            {
                this.f191681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerQrShareScreen freelancerQrShareScreen = this.f191681b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerQrShareScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerQrShareScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerQrShareScreenContract$InputData freelancerQrShareScreenContract$InputData = freelancerQrShareScreen.K;
                        freelancerQrShareScreenContract$InputData.getClass();
                        return new t0(qVar, freelancerQrShareScreen, freelancerQrShareScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerQrShareScreen.R;
                        return (i) ((t0) freelancerQrShareScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerQrShareScreen.R;
                        FreelancerQrShareScreen freelancerQrShareScreen2 = this.f191681b;
                        return dli.f.a(freelancerQrShareScreen2, (i) freelancerQrShareScreen2.P.getValue(), v.k(freelancerQrShareScreen2.N, new QRCodeDelegate(), new QRCodeLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: l27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerQrShareScreen f191681b;

            {
                this.f191681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerQrShareScreen freelancerQrShareScreen = this.f191681b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerQrShareScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerQrShareScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerQrShareScreenContract$InputData freelancerQrShareScreenContract$InputData = freelancerQrShareScreen.K;
                        freelancerQrShareScreenContract$InputData.getClass();
                        return new t0(qVar, freelancerQrShareScreen, freelancerQrShareScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerQrShareScreen.R;
                        return (i) ((t0) freelancerQrShareScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerQrShareScreen.R;
                        FreelancerQrShareScreen freelancerQrShareScreen2 = this.f191681b;
                        return dli.f.a(freelancerQrShareScreen2, (i) freelancerQrShareScreen2.P.getValue(), v.k(freelancerQrShareScreen2.N, new QRCodeDelegate(), new QRCodeLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        e eVar = uiState.f191689b;
        TextLocalisedClause textLocalisedClause = eVar.f191685a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = eVar.f191686b;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setEndImage(eVar.f191687c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new ko2.b(this, null, 21), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
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
        return (dli.c) this.Q.getValue();
    }
}
