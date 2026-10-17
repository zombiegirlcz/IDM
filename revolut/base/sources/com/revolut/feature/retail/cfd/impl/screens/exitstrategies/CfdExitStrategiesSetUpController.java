package com.revolut.feature.retail.cfd.impl.screens.exitstrategies;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.impl.screens.exitstrategies.CfdExitStrategiesSetUpController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import java.util.List;
import jii.b0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m2b.i;
import o3b.c0;
import o3b.d0;
import o3b.f;
import o3b.g;
import o3b.j;
import o3b.k;
import o3b.l;
import o3b.m;
import o3b.n;
import o3b.y;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/exitstrategies/CfdExitStrategiesSetUpController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo3b/c0;", "Ldli/a;", "Lo3b/d0;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdExitStrategiesSetUpController extends ViewController<c0> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CfdExitStrategiesSetUpController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithavatarNextbuttonBinding;", 0))};
    public final y K;
    public final h L;
    public final InputTextDelegate M;
    public final RowDelegate N;
    public final AmountInputActionsDelegate O;
    public final RowDelegate P;
    public final LargeActionButtonDelegate Q;
    public final int R;
    public final Object S;
    public final Object T;
    public final Object U;

    public CfdExitStrategiesSetUpController(y inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, f.f);
        this.M = new InputTextDelegate(null);
        this.N = new RowDelegate(null, null, 7);
        this.O = new AmountInputActionsDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = new LargeActionButtonDelegate();
        this.R = R$layout.screen_recycler_navbarwithavatar_nextbutton;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: o3b.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdExitStrategiesSetUpController f221724b;

            {
                this.f221724b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController = this.f221724b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdExitStrategiesSetUpController.V;
                        CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController2 = this.f221724b;
                        return dli.f.a(cfdExitStrategiesSetUpController2, cfdExitStrategiesSetUpController2.R2(), zhm.v.k(cfdExitStrategiesSetUpController2.M, cfdExitStrategiesSetUpController2.N, cfdExitStrategiesSetUpController2.O, new TextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdExitStrategiesSetUpController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cfdExitStrategiesSetUpController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        y yVar = cfdExitStrategiesSetUpController.K;
                        yVar.getClass();
                        return new m2b.i(vVar, cfdExitStrategiesSetUpController, yVar);
                    default:
                        KProperty[] kPropertyArr3 = CfdExitStrategiesSetUpController.V;
                        return (o) ((m2b.i) cfdExitStrategiesSetUpController.T.getValue()).k.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: o3b.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdExitStrategiesSetUpController f221724b;

            {
                this.f221724b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController = this.f221724b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdExitStrategiesSetUpController.V;
                        CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController2 = this.f221724b;
                        return dli.f.a(cfdExitStrategiesSetUpController2, cfdExitStrategiesSetUpController2.R2(), zhm.v.k(cfdExitStrategiesSetUpController2.M, cfdExitStrategiesSetUpController2.N, cfdExitStrategiesSetUpController2.O, new TextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdExitStrategiesSetUpController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cfdExitStrategiesSetUpController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        y yVar = cfdExitStrategiesSetUpController.K;
                        yVar.getClass();
                        return new m2b.i(vVar, cfdExitStrategiesSetUpController, yVar);
                    default:
                        KProperty[] kPropertyArr3 = CfdExitStrategiesSetUpController.V;
                        return (o) ((m2b.i) cfdExitStrategiesSetUpController.T.getValue()).k.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: o3b.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdExitStrategiesSetUpController f221724b;

            {
                this.f221724b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController = this.f221724b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdExitStrategiesSetUpController.V;
                        CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController2 = this.f221724b;
                        return dli.f.a(cfdExitStrategiesSetUpController2, cfdExitStrategiesSetUpController2.R2(), zhm.v.k(cfdExitStrategiesSetUpController2.M, cfdExitStrategiesSetUpController2.N, cfdExitStrategiesSetUpController2.O, new TextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdExitStrategiesSetUpController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cfdExitStrategiesSetUpController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        y yVar = cfdExitStrategiesSetUpController.K;
                        yVar.getClass();
                        return new m2b.i(vVar, cfdExitStrategiesSetUpController, yVar);
                    default:
                        KProperty[] kPropertyArr3 = CfdExitStrategiesSetUpController.V;
                        return (o) ((m2b.i) cfdExitStrategiesSetUpController.T.getValue()).k.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d0 uiState = (d0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithAvatar navBarWithAvatar = d3().f174500c;
        navBarWithAvatar.setToolbarTitle(uiState.f221720a);
        navBarWithAvatar.setToolbarDescription(uiState.f221721b);
        d3().f174499b.setText(uiState.f221722c);
        d3().f174499b.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((i) this.T.getValue()).d.get()).d(v.k(this.P, this.Q));
        NavBarWithAvatar navBarWithAvatar = d3().f174500c;
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithAvatar.setAvatarImage(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174499b.setLoadingButtonTag("cfd-exit-strategies-set-up-done-button-loading-tag");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174500c.f59338a), new o3b.i(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174500c.f59339b), new o3b.i(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174499b.o), new o3b.i(this, continuation, 2), 3);
        InputTextDelegate inputTextDelegate = this.M;
        ViewController.P2(this, wp5.y.x(inputTextDelegate.f52575g.f121375b, inputTextDelegate.i.f121375b, "mergeWith(...)"), new j(this, null), 3);
        AmountInputActionsDelegate amountInputActionsDelegate = this.O;
        ViewController.P2(this, rd0.e.b(amountInputActionsDelegate.e.f121375b), new k(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(amountInputActionsDelegate.f), new k(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(amountInputActionsDelegate.f51639g), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(amountInputActionsDelegate.f51640h), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53225r), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new o3b.h(this, null), 3);
    }

    public final b0 d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final o3b.o R2() {
        return (o3b.o) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
