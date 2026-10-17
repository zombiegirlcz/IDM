package com.revolut.feature.freelancer.impl.ui.cashback.screen.upsell;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewProductSmallDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.api.ui.controller.contract.FreelancerCashbackUpsellContract$InputData;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.upsell.FreelancerCashbackUpsellScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kr6.a;
import te0.w;
import tx0.j0;
import urd.n;
import us6.c2;
import us6.d2;
import uv6.b;
import uv6.f;
import uv6.i;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/cashback/screen/upsell/FreelancerCashbackUpsellScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkr6/a;", "Ldli/a;", "Luv6/i;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerCashbackUpsellScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FreelancerCashbackUpsellScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FreelancerCashbackUpsellContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public FreelancerCashbackUpsellScreen(FreelancerCashbackUpsellContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: uv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackUpsellScreen f283324b;

            {
                this.f283324b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerCashbackUpsellScreen freelancerCashbackUpsellScreen = this.f283324b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackUpsellScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerCashbackUpsellScreen.m2()).a().get(c2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c2.class, " is not found"));
                        }
                        c2 c2Var = ((c2) aVar2.b()).f;
                        FreelancerCashbackUpsellContract$InputData freelancerCashbackUpsellContract$InputData = freelancerCashbackUpsellScreen.K;
                        freelancerCashbackUpsellContract$InputData.getClass();
                        return new d2(c2Var, freelancerCashbackUpsellContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackUpsellScreen.S;
                        return (f) ((d2) freelancerCashbackUpsellScreen.L.getValue()).f282494c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackUpsellScreen.S;
                        FreelancerCashbackUpsellScreen freelancerCashbackUpsellScreen2 = this.f283324b;
                        return dli.f.a(freelancerCashbackUpsellScreen2, (f) freelancerCashbackUpsellScreen2.M.getValue(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate(), (NewProductSmallDelegate) freelancerCashbackUpsellScreen2.P.getValue(), (RowDelegate) freelancerCashbackUpsellScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: uv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackUpsellScreen f283324b;

            {
                this.f283324b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerCashbackUpsellScreen freelancerCashbackUpsellScreen = this.f283324b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackUpsellScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerCashbackUpsellScreen.m2()).a().get(c2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c2.class, " is not found"));
                        }
                        c2 c2Var = ((c2) aVar2.b()).f;
                        FreelancerCashbackUpsellContract$InputData freelancerCashbackUpsellContract$InputData = freelancerCashbackUpsellScreen.K;
                        freelancerCashbackUpsellContract$InputData.getClass();
                        return new d2(c2Var, freelancerCashbackUpsellContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackUpsellScreen.S;
                        return (f) ((d2) freelancerCashbackUpsellScreen.L.getValue()).f282494c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackUpsellScreen.S;
                        FreelancerCashbackUpsellScreen freelancerCashbackUpsellScreen2 = this.f283324b;
                        return dli.f.a(freelancerCashbackUpsellScreen2, (f) freelancerCashbackUpsellScreen2.M.getValue(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate(), (NewProductSmallDelegate) freelancerCashbackUpsellScreen2.P.getValue(), (RowDelegate) freelancerCashbackUpsellScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, b.f);
        this.P = w.y0(new us4.b(19));
        this.Q = w.y0(new us4.b(20));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: uv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackUpsellScreen f283324b;

            {
                this.f283324b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerCashbackUpsellScreen freelancerCashbackUpsellScreen = this.f283324b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackUpsellScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerCashbackUpsellScreen.m2()).a().get(c2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c2.class, " is not found"));
                        }
                        c2 c2Var = ((c2) aVar2.b()).f;
                        FreelancerCashbackUpsellContract$InputData freelancerCashbackUpsellContract$InputData = freelancerCashbackUpsellScreen.K;
                        freelancerCashbackUpsellContract$InputData.getClass();
                        return new d2(c2Var, freelancerCashbackUpsellContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackUpsellScreen.S;
                        return (f) ((d2) freelancerCashbackUpsellScreen.L.getValue()).f282494c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackUpsellScreen.S;
                        FreelancerCashbackUpsellScreen freelancerCashbackUpsellScreen2 = this.f283324b;
                        return dli.f.a(freelancerCashbackUpsellScreen2, (f) freelancerCashbackUpsellScreen2.M.getValue(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate(), (NewProductSmallDelegate) freelancerCashbackUpsellScreen2.P.getValue(), (RowDelegate) freelancerCashbackUpsellScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f283332a.f283331a;
        navBarWithToolbar.setTitle(clause, null);
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new uea.e(this, continuation, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, new n(rd0.e.b(((NewProductSmallDelegate) this.P.getValue()).f52791c), 8), null, new uv6.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new n(rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), 9), null, new uv6.e(this, continuation, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
