package com.revolut.feature.freelancer.impl.ui.profile.account_closure;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c07.c;
import c07.d;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.freelancer.impl.ui.profile.account_closure.FreelancerAccountClosureScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.w;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import ufg.k0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/account_closure/FreelancerAccountClosureScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lc07/d;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerAccountClosureScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(FreelancerAccountClosureScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_twin_vertical_buttons;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, w.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return w.a(p0);
        }
    }

    public FreelancerAccountClosureScreen() {
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: c07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAccountClosureScreen f20185b;

            {
                this.f20185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerAccountClosureScreen freelancerAccountClosureScreen = this.f20185b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAccountClosureScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerAccountClosureScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        us6.d dVar = new us6.d();
                        dVar.f282481a = e4m.b.b(e4m.c.a(freelancerAccountClosureScreen));
                        dVar.f282482b = e4m.b.b(new k0(qVar, dVar, 2, 19));
                        dVar.f282483c = e4m.b.b(new k0(qVar, dVar, 1, 19));
                        dVar.d = e4m.b.b(new k0(qVar, dVar, 0, 19));
                        dVar.e = e4m.b.b(new k0(qVar, dVar, 4, 19));
                        dVar.f = e4m.b.b(new k0(qVar, dVar, 3, 19));
                        dVar.f282484g = e4m.b.b(new k0(qVar, dVar, 5, 19));
                        return dVar;
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAccountClosureScreen.P;
                        return (e) ((us6.d) freelancerAccountClosureScreen.M.getValue()).f282484g.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAccountClosureScreen.P;
                        FreelancerAccountClosureScreen freelancerAccountClosureScreen2 = this.f20185b;
                        return dli.f.a(freelancerAccountClosureScreen2, (e) freelancerAccountClosureScreen2.N.getValue(), u.c(new PromptMarketingContentDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: c07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAccountClosureScreen f20185b;

            {
                this.f20185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerAccountClosureScreen freelancerAccountClosureScreen = this.f20185b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAccountClosureScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerAccountClosureScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        us6.d dVar = new us6.d();
                        dVar.f282481a = e4m.b.b(e4m.c.a(freelancerAccountClosureScreen));
                        dVar.f282482b = e4m.b.b(new k0(qVar, dVar, 2, 19));
                        dVar.f282483c = e4m.b.b(new k0(qVar, dVar, 1, 19));
                        dVar.d = e4m.b.b(new k0(qVar, dVar, 0, 19));
                        dVar.e = e4m.b.b(new k0(qVar, dVar, 4, 19));
                        dVar.f = e4m.b.b(new k0(qVar, dVar, 3, 19));
                        dVar.f282484g = e4m.b.b(new k0(qVar, dVar, 5, 19));
                        return dVar;
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAccountClosureScreen.P;
                        return (e) ((us6.d) freelancerAccountClosureScreen.M.getValue()).f282484g.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAccountClosureScreen.P;
                        FreelancerAccountClosureScreen freelancerAccountClosureScreen2 = this.f20185b;
                        return dli.f.a(freelancerAccountClosureScreen2, (e) freelancerAccountClosureScreen2.N.getValue(), u.c(new PromptMarketingContentDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: c07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAccountClosureScreen f20185b;

            {
                this.f20185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerAccountClosureScreen freelancerAccountClosureScreen = this.f20185b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAccountClosureScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerAccountClosureScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        us6.d dVar = new us6.d();
                        dVar.f282481a = e4m.b.b(e4m.c.a(freelancerAccountClosureScreen));
                        dVar.f282482b = e4m.b.b(new k0(qVar, dVar, 2, 19));
                        dVar.f282483c = e4m.b.b(new k0(qVar, dVar, 1, 19));
                        dVar.d = e4m.b.b(new k0(qVar, dVar, 0, 19));
                        dVar.e = e4m.b.b(new k0(qVar, dVar, 4, 19));
                        dVar.f = e4m.b.b(new k0(qVar, dVar, 3, 19));
                        dVar.f282484g = e4m.b.b(new k0(qVar, dVar, 5, 19));
                        return dVar;
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAccountClosureScreen.P;
                        return (e) ((us6.d) freelancerAccountClosureScreen.M.getValue()).f282484g.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAccountClosureScreen.P;
                        FreelancerAccountClosureScreen freelancerAccountClosureScreen2 = this.f20185b;
                        return dli.f.a(freelancerAccountClosureScreen2, (e) freelancerAccountClosureScreen2.N.getValue(), u.c(new PromptMarketingContentDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonText(uiState.f20189b.f20186a);
        twinVerticalButton.setMainButtonStyle(uiState.f20189b.f20187b);
        c cVar = uiState.f20190c;
        twinVerticalButton.setSecondaryButtonText(cVar.f20186a);
        twinVerticalButton.setSecondaryButtonStyle(cVar.f20187b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (us6.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (c07.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174570b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174570b.f59410q), new c07.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o0()), new c07.b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().d.p0()), new c07.b(this, null, 2), 3);
    }

    public final w d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
