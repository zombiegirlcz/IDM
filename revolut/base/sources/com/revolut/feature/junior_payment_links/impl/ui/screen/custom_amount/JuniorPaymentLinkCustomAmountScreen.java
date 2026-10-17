package com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.junior_payment_links.impl.R$string;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ea4.d;
import ej8.c;
import ej8.g;
import jii.b0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import ti8.b;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_payment_links/impl/ui/screen/custom_amount/JuniorPaymentLinkCustomAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lti8/b;", "Ldli/a;", "Lej8/g;", "feature_junior_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorPaymentLinkCustomAmountScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(JuniorPaymentLinkCustomAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithavatarNextbuttonBinding;", 0))};
    public final JuniorPaymentLinkCustomAmountScreenContract$Input K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final InputTextDelegate S;
    public final Object T;

    public JuniorPaymentLinkCustomAmountScreen(JuniorPaymentLinkCustomAmountScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_recycler_navbarwithavatar_nextbutton;
        this.M = true;
        this.N = s.t(this, ej8.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ej8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentLinkCustomAmountScreen f126778b;

            {
                this.f126778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i2 = i;
                JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen = this.f126778b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPaymentLinkCustomAmountScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(juniorPaymentLinkCustomAmountScreen.m2()).a().get(wi8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (wi8.g) ((fj8.a) ((fj8.b) aVar2.b()).b().mo3808a(juniorPaymentLinkCustomAmountScreen)).m(juniorPaymentLinkCustomAmountScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", wi8.e.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPaymentLinkCustomAmountScreen.U;
                        wi8.g gVar = (wi8.g) juniorPaymentLinkCustomAmountScreen.O.getValue();
                        switch (gVar.f297856a) {
                            case 0:
                                return (h) gVar.f297860h.get();
                            default:
                                return (h) gVar.f297860h.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = JuniorPaymentLinkCustomAmountScreen.U;
                        wi8.g gVar2 = (wi8.g) juniorPaymentLinkCustomAmountScreen.O.getValue();
                        switch (gVar2.f297856a) {
                            case 0:
                                bVarN = gVar2.f297858c.f297847a.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = gVar2.f297858c.f297847a.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = JuniorPaymentLinkCustomAmountScreen.U;
                        return new CenteredAmountDelegate(new eh3.s(juniorPaymentLinkCustomAmountScreen, 8));
                    default:
                        KProperty[] kPropertyArr5 = JuniorPaymentLinkCustomAmountScreen.U;
                        JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen2 = this.f126778b;
                        return dli.f.a(juniorPaymentLinkCustomAmountScreen2, juniorPaymentLinkCustomAmountScreen2.d(), v.k((CenteredAmountDelegate) juniorPaymentLinkCustomAmountScreen2.R.getValue(), juniorPaymentLinkCustomAmountScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ej8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentLinkCustomAmountScreen f126778b;

            {
                this.f126778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i2;
                JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen = this.f126778b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPaymentLinkCustomAmountScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(juniorPaymentLinkCustomAmountScreen.m2()).a().get(wi8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (wi8.g) ((fj8.a) ((fj8.b) aVar2.b()).b().mo3808a(juniorPaymentLinkCustomAmountScreen)).m(juniorPaymentLinkCustomAmountScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", wi8.e.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPaymentLinkCustomAmountScreen.U;
                        wi8.g gVar = (wi8.g) juniorPaymentLinkCustomAmountScreen.O.getValue();
                        switch (gVar.f297856a) {
                            case 0:
                                return (h) gVar.f297860h.get();
                            default:
                                return (h) gVar.f297860h.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = JuniorPaymentLinkCustomAmountScreen.U;
                        wi8.g gVar2 = (wi8.g) juniorPaymentLinkCustomAmountScreen.O.getValue();
                        switch (gVar2.f297856a) {
                            case 0:
                                bVarN = gVar2.f297858c.f297847a.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = gVar2.f297858c.f297847a.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = JuniorPaymentLinkCustomAmountScreen.U;
                        return new CenteredAmountDelegate(new eh3.s(juniorPaymentLinkCustomAmountScreen, 8));
                    default:
                        KProperty[] kPropertyArr5 = JuniorPaymentLinkCustomAmountScreen.U;
                        JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen2 = this.f126778b;
                        return dli.f.a(juniorPaymentLinkCustomAmountScreen2, juniorPaymentLinkCustomAmountScreen2.d(), v.k((CenteredAmountDelegate) juniorPaymentLinkCustomAmountScreen2.R.getValue(), juniorPaymentLinkCustomAmountScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ej8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentLinkCustomAmountScreen f126778b;

            {
                this.f126778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i3;
                JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen = this.f126778b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPaymentLinkCustomAmountScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(juniorPaymentLinkCustomAmountScreen.m2()).a().get(wi8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (wi8.g) ((fj8.a) ((fj8.b) aVar2.b()).b().mo3808a(juniorPaymentLinkCustomAmountScreen)).m(juniorPaymentLinkCustomAmountScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", wi8.e.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPaymentLinkCustomAmountScreen.U;
                        wi8.g gVar = (wi8.g) juniorPaymentLinkCustomAmountScreen.O.getValue();
                        switch (gVar.f297856a) {
                            case 0:
                                return (h) gVar.f297860h.get();
                            default:
                                return (h) gVar.f297860h.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = JuniorPaymentLinkCustomAmountScreen.U;
                        wi8.g gVar2 = (wi8.g) juniorPaymentLinkCustomAmountScreen.O.getValue();
                        switch (gVar2.f297856a) {
                            case 0:
                                bVarN = gVar2.f297858c.f297847a.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = gVar2.f297858c.f297847a.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = JuniorPaymentLinkCustomAmountScreen.U;
                        return new CenteredAmountDelegate(new eh3.s(juniorPaymentLinkCustomAmountScreen, 8));
                    default:
                        KProperty[] kPropertyArr5 = JuniorPaymentLinkCustomAmountScreen.U;
                        JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen2 = this.f126778b;
                        return dli.f.a(juniorPaymentLinkCustomAmountScreen2, juniorPaymentLinkCustomAmountScreen2.d(), v.k((CenteredAmountDelegate) juniorPaymentLinkCustomAmountScreen2.R.getValue(), juniorPaymentLinkCustomAmountScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: ej8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentLinkCustomAmountScreen f126778b;

            {
                this.f126778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i5;
                JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen = this.f126778b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPaymentLinkCustomAmountScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(juniorPaymentLinkCustomAmountScreen.m2()).a().get(wi8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (wi8.g) ((fj8.a) ((fj8.b) aVar2.b()).b().mo3808a(juniorPaymentLinkCustomAmountScreen)).m(juniorPaymentLinkCustomAmountScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", wi8.e.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPaymentLinkCustomAmountScreen.U;
                        wi8.g gVar = (wi8.g) juniorPaymentLinkCustomAmountScreen.O.getValue();
                        switch (gVar.f297856a) {
                            case 0:
                                return (h) gVar.f297860h.get();
                            default:
                                return (h) gVar.f297860h.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = JuniorPaymentLinkCustomAmountScreen.U;
                        wi8.g gVar2 = (wi8.g) juniorPaymentLinkCustomAmountScreen.O.getValue();
                        switch (gVar2.f297856a) {
                            case 0:
                                bVarN = gVar2.f297858c.f297847a.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = gVar2.f297858c.f297847a.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = JuniorPaymentLinkCustomAmountScreen.U;
                        return new CenteredAmountDelegate(new eh3.s(juniorPaymentLinkCustomAmountScreen, 8));
                    default:
                        KProperty[] kPropertyArr5 = JuniorPaymentLinkCustomAmountScreen.U;
                        JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen2 = this.f126778b;
                        return dli.f.a(juniorPaymentLinkCustomAmountScreen2, juniorPaymentLinkCustomAmountScreen2.d(), v.k((CenteredAmountDelegate) juniorPaymentLinkCustomAmountScreen2.R.getValue(), juniorPaymentLinkCustomAmountScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = new InputTextDelegate(null);
        final int i6 = 4;
        this.T = w.y0(new Function0(this) { // from class: ej8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentLinkCustomAmountScreen f126778b;

            {
                this.f126778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i6;
                JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen = this.f126778b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPaymentLinkCustomAmountScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(juniorPaymentLinkCustomAmountScreen.m2()).a().get(wi8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (wi8.g) ((fj8.a) ((fj8.b) aVar2.b()).b().mo3808a(juniorPaymentLinkCustomAmountScreen)).m(juniorPaymentLinkCustomAmountScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", wi8.e.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPaymentLinkCustomAmountScreen.U;
                        wi8.g gVar = (wi8.g) juniorPaymentLinkCustomAmountScreen.O.getValue();
                        switch (gVar.f297856a) {
                            case 0:
                                return (h) gVar.f297860h.get();
                            default:
                                return (h) gVar.f297860h.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = JuniorPaymentLinkCustomAmountScreen.U;
                        wi8.g gVar2 = (wi8.g) juniorPaymentLinkCustomAmountScreen.O.getValue();
                        switch (gVar2.f297856a) {
                            case 0:
                                bVarN = gVar2.f297858c.f297847a.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = gVar2.f297858c.f297847a.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = JuniorPaymentLinkCustomAmountScreen.U;
                        return new CenteredAmountDelegate(new eh3.s(juniorPaymentLinkCustomAmountScreen, 8));
                    default:
                        KProperty[] kPropertyArr5 = JuniorPaymentLinkCustomAmountScreen.U;
                        JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen2 = this.f126778b;
                        return dli.f.a(juniorPaymentLinkCustomAmountScreen2, juniorPaymentLinkCustomAmountScreen2.d(), v.k((CenteredAmountDelegate) juniorPaymentLinkCustomAmountScreen2.R.getValue(), juniorPaymentLinkCustomAmountScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174499b;
        largeActionButton.setText(uiState.f126783b);
        largeActionButton.setEnabled(uiState.f126784c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wi8.g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.M);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f174500c;
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.junior_payment_links_custom_amount_screen_header_request_amount, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174500c.f59338a), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174499b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) this.R.getValue()).d.f121375b), new d(this, continuation, 20), 3);
        InputTextDelegate inputTextDelegate = this.S;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new ej8.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52577j.f121375b), new ej8.e(this, null), 3);
    }

    public final b0 d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ej8.h R2() {
        return (ej8.h) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
