package com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mn8.k;
import te0.w;
import vc.s;
import ve7.i;
import vge.z1;
import vo8.c;
import vo8.f;
import vo8.g;
import vo8.j;
import vo8.r;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lvo8/r;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorSecurityAndPrivacyController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(JuniorSecurityAndPrivacyController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final JuniorSecurityAndPrivacyControllerContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final RowDelegate S;
    public final FullScreenStateDelegate T;
    public final TextDelegate U;
    public final Object V;

    public JuniorSecurityAndPrivacyController(JuniorSecurityAndPrivacyControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = true;
        this.N = s.t(this, c.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: vo8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSecurityAndPrivacyController f290874b;

            {
                this.f290874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController = this.f290874b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSecurityAndPrivacyController.W;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSecurityAndPrivacyController.m2()).a().get(mn8.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
                        }
                        mn8.o oVar = ((mn8.o) ((wo8.a) aVar2.b())).f207476w;
                        JuniorSecurityAndPrivacyControllerContract$InputData juniorSecurityAndPrivacyControllerContract$InputData = juniorSecurityAndPrivacyController.K;
                        juniorSecurityAndPrivacyControllerContract$InputData.getClass();
                        return new mn8.k(oVar, juniorSecurityAndPrivacyController, juniorSecurityAndPrivacyControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSecurityAndPrivacyController.W;
                        return (k) ((mn8.k) juniorSecurityAndPrivacyController.O.getValue()).f207446h.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorSecurityAndPrivacyController.W;
                        JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController2 = this.f290874b;
                        return dli.f.a(juniorSecurityAndPrivacyController2, juniorSecurityAndPrivacyController2.d(), zhm.v.k(new ListSubheaderDelegate(), juniorSecurityAndPrivacyController2.S, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), juniorSecurityAndPrivacyController2.T, new ListCellDelegate(), juniorSecurityAndPrivacyController2.U), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: vo8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSecurityAndPrivacyController f290874b;

            {
                this.f290874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController = this.f290874b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSecurityAndPrivacyController.W;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSecurityAndPrivacyController.m2()).a().get(mn8.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
                        }
                        mn8.o oVar = ((mn8.o) ((wo8.a) aVar2.b())).f207476w;
                        JuniorSecurityAndPrivacyControllerContract$InputData juniorSecurityAndPrivacyControllerContract$InputData = juniorSecurityAndPrivacyController.K;
                        juniorSecurityAndPrivacyControllerContract$InputData.getClass();
                        return new mn8.k(oVar, juniorSecurityAndPrivacyController, juniorSecurityAndPrivacyControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSecurityAndPrivacyController.W;
                        return (k) ((mn8.k) juniorSecurityAndPrivacyController.O.getValue()).f207446h.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorSecurityAndPrivacyController.W;
                        JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController2 = this.f290874b;
                        return dli.f.a(juniorSecurityAndPrivacyController2, juniorSecurityAndPrivacyController2.d(), zhm.v.k(new ListSubheaderDelegate(), juniorSecurityAndPrivacyController2.S, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), juniorSecurityAndPrivacyController2.T, new ListCellDelegate(), juniorSecurityAndPrivacyController2.U), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.Q = w.y0(new i(29));
        this.R = w.y0(new vo8.b(0));
        this.S = new RowDelegate(null, null, 7);
        this.T = new FullScreenStateDelegate();
        this.U = new TextDelegate();
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: vo8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSecurityAndPrivacyController f290874b;

            {
                this.f290874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController = this.f290874b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSecurityAndPrivacyController.W;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSecurityAndPrivacyController.m2()).a().get(mn8.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
                        }
                        mn8.o oVar = ((mn8.o) ((wo8.a) aVar2.b())).f207476w;
                        JuniorSecurityAndPrivacyControllerContract$InputData juniorSecurityAndPrivacyControllerContract$InputData = juniorSecurityAndPrivacyController.K;
                        juniorSecurityAndPrivacyControllerContract$InputData.getClass();
                        return new mn8.k(oVar, juniorSecurityAndPrivacyController, juniorSecurityAndPrivacyControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSecurityAndPrivacyController.W;
                        return (k) ((mn8.k) juniorSecurityAndPrivacyController.O.getValue()).f207446h.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorSecurityAndPrivacyController.W;
                        JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController2 = this.f290874b;
                        return dli.f.a(juniorSecurityAndPrivacyController2, juniorSecurityAndPrivacyController2.d(), zhm.v.k(new ListSubheaderDelegate(), juniorSecurityAndPrivacyController2.S, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), juniorSecurityAndPrivacyController2.T, new ListCellDelegate(), juniorSecurityAndPrivacyController2.U), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(uiState.f290910a);
        navBarWithToolbar.setTitle(uiState.f290910a, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((k) this.O.getValue()).e.get()).d(v.k((TwinHorizontalButtonDelegate) this.Q.getValue(), (LargeActionButtonDelegate) this.R.getValue()));
    }

    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new z1(this, continuation, 11), 3);
        RowDelegate rowDelegate = this.S;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new vo8.h(this, null), 3);
        ?? r112 = this.Q;
        ViewController.P2(this, new v2e.h0(rd0.e.b(((TwinHorizontalButtonDelegate) r112.getValue()).f53572c.f121375b), 11), new f(this, continuation, 1), 3);
        ViewController.P2(this, new v2e.h0(rd0.e.b(((TwinHorizontalButtonDelegate) r112.getValue()).d.f121375b), 12), new f(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), new vo8.i(2, 4, vo8.k.class, d(), "onLargeButtonClick", "onLargeButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(this.T.f52371h.f121375b), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.d), new f(this, continuation, 0), 3);
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final vo8.k d() {
        return (vo8.k) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
