package com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.b0;
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
import zb6.b;
import zb6.d;
import zb6.f;
import zb6.g;
import zb6.l;
import zb6.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzb6/m;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OneTimeDonationScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(OneTimeDonationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithavatarNextbuttonBinding;", 0))};
    public final OneTimeDonationScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final RowDelegate R;
    public final FullScreenStateDelegate S;
    public final CenteredAmountDelegate T;
    public final Object U;

    public OneTimeDonationScreen(OneTimeDonationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbarwithavatar_nextbutton;
        this.M = true;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: zb6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OneTimeDonationScreen f320803b;

            {
                this.f320803b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OneTimeDonationScreen oneTimeDonationScreen = this.f320803b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OneTimeDonationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(oneTimeDonationScreen.m2()).a().get(pa6.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pa6.m.class, " is not found"));
                        }
                        pa6.m mVar = ((pa6.m) aVar2.b()).G;
                        OneTimeDonationScreenContract$InputData oneTimeDonationScreenContract$InputData = oneTimeDonationScreen.K;
                        oneTimeDonationScreenContract$InputData.getClass();
                        return new pa6.o(mVar, oneTimeDonationScreen, oneTimeDonationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OneTimeDonationScreen.V;
                        return (l) ((pa6.o) oneTimeDonationScreen.O.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = OneTimeDonationScreen.V;
                        qd0.b bVarN = ((pa6.o) oneTimeDonationScreen.O.getValue()).f234409b.i.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = OneTimeDonationScreen.V;
                        OneTimeDonationScreen oneTimeDonationScreen2 = this.f320803b;
                        return dli.f.a(oneTimeDonationScreen2, oneTimeDonationScreen2.d(), zhm.v.k(oneTimeDonationScreen2.R, new RowLoadingDelegate(), oneTimeDonationScreen2.S, oneTimeDonationScreen2.T), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: zb6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OneTimeDonationScreen f320803b;

            {
                this.f320803b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OneTimeDonationScreen oneTimeDonationScreen = this.f320803b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OneTimeDonationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(oneTimeDonationScreen.m2()).a().get(pa6.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pa6.m.class, " is not found"));
                        }
                        pa6.m mVar = ((pa6.m) aVar2.b()).G;
                        OneTimeDonationScreenContract$InputData oneTimeDonationScreenContract$InputData = oneTimeDonationScreen.K;
                        oneTimeDonationScreenContract$InputData.getClass();
                        return new pa6.o(mVar, oneTimeDonationScreen, oneTimeDonationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OneTimeDonationScreen.V;
                        return (l) ((pa6.o) oneTimeDonationScreen.O.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = OneTimeDonationScreen.V;
                        qd0.b bVarN = ((pa6.o) oneTimeDonationScreen.O.getValue()).f234409b.i.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = OneTimeDonationScreen.V;
                        OneTimeDonationScreen oneTimeDonationScreen2 = this.f320803b;
                        return dli.f.a(oneTimeDonationScreen2, oneTimeDonationScreen2.d(), zhm.v.k(oneTimeDonationScreen2.R, new RowLoadingDelegate(), oneTimeDonationScreen2.S, oneTimeDonationScreen2.T), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: zb6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OneTimeDonationScreen f320803b;

            {
                this.f320803b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OneTimeDonationScreen oneTimeDonationScreen = this.f320803b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OneTimeDonationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(oneTimeDonationScreen.m2()).a().get(pa6.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pa6.m.class, " is not found"));
                        }
                        pa6.m mVar = ((pa6.m) aVar2.b()).G;
                        OneTimeDonationScreenContract$InputData oneTimeDonationScreenContract$InputData = oneTimeDonationScreen.K;
                        oneTimeDonationScreenContract$InputData.getClass();
                        return new pa6.o(mVar, oneTimeDonationScreen, oneTimeDonationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OneTimeDonationScreen.V;
                        return (l) ((pa6.o) oneTimeDonationScreen.O.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = OneTimeDonationScreen.V;
                        qd0.b bVarN = ((pa6.o) oneTimeDonationScreen.O.getValue()).f234409b.i.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = OneTimeDonationScreen.V;
                        OneTimeDonationScreen oneTimeDonationScreen2 = this.f320803b;
                        return dli.f.a(oneTimeDonationScreen2, oneTimeDonationScreen2.d(), zhm.v.k(oneTimeDonationScreen2.R, new RowLoadingDelegate(), oneTimeDonationScreen2.S, oneTimeDonationScreen2.T), 0, null, null, null, 60);
                }
            }
        });
        this.R = new RowDelegate(null, null, 7);
        this.S = new FullScreenStateDelegate();
        this.T = new CenteredAmountDelegate(new yz4.b(this, 27));
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: zb6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OneTimeDonationScreen f320803b;

            {
                this.f320803b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                OneTimeDonationScreen oneTimeDonationScreen = this.f320803b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OneTimeDonationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(oneTimeDonationScreen.m2()).a().get(pa6.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pa6.m.class, " is not found"));
                        }
                        pa6.m mVar = ((pa6.m) aVar2.b()).G;
                        OneTimeDonationScreenContract$InputData oneTimeDonationScreenContract$InputData = oneTimeDonationScreen.K;
                        oneTimeDonationScreenContract$InputData.getClass();
                        return new pa6.o(mVar, oneTimeDonationScreen, oneTimeDonationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OneTimeDonationScreen.V;
                        return (l) ((pa6.o) oneTimeDonationScreen.O.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = OneTimeDonationScreen.V;
                        qd0.b bVarN = ((pa6.o) oneTimeDonationScreen.O.getValue()).f234409b.i.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = OneTimeDonationScreen.V;
                        OneTimeDonationScreen oneTimeDonationScreen2 = this.f320803b;
                        return dli.f.a(oneTimeDonationScreen2, oneTimeDonationScreen2.d(), zhm.v.k(oneTimeDonationScreen2.R, new RowLoadingDelegate(), oneTimeDonationScreen2.S, oneTimeDonationScreen2.T), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174499b.setEnabled(uiState.f320812a);
        d3().f174500c.setAvatarImage(uiState.f320813b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pa6.o) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f174500c;
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.donations_funding_options_single_donation, null, null, 14));
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174499b.setText(new TextLocalisedClause(R$string.donations_common_action_donate, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174500c.f59338a), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174499b.o), new d(this, continuation, 1), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.T;
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.e.f121375b), new zb6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new g(this, null), 3);
    }

    public final b0 d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
