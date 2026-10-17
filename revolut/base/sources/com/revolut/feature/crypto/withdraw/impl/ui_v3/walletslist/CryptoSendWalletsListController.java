package com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import efm.r;
import java.util.concurrent.TimeUnit;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lo5.c0;
import sgm.j1;
import te0.w;
import vc.s;
import xki.e;
import z3f.b;
import znd.u0;
import zo5.j;
import zq5.o;
import zq5.p;
import zq5.t;
import zq5.v;
import zq5.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llo5/c0;", "Ldli/a;", "Lzq5/x;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSendWalletsListController extends ViewController<c0> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CryptoSendWalletsListController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CryptoSendWalletsListControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final j1 U;

    public CryptoSendWalletsListController(CryptoSendWalletsListControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, o.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: zq5.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendWalletsListController f324394b;

            {
                this.f324394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoSendWalletsListController cryptoSendWalletsListController = this.f324394b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendWalletsListController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendWalletsListController.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData = cryptoSendWalletsListController.K;
                        cryptoSendWalletsListControllerContract$InputData.getClass();
                        return new zo5.j(dVar, cryptoSendWalletsListControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendWalletsListController.V;
                        return (v) ((zo5.j) cryptoSendWalletsListController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoSendWalletsListController.V;
                        int i3 = R$id.recyclerView;
                        CryptoSendWalletsListController cryptoSendWalletsListController2 = this.f324394b;
                        return dli.f.a(cryptoSendWalletsListController2, cryptoSendWalletsListController2.d(), zhm.v.k((RowDelegate) cryptoSendWalletsListController2.Q.getValue(), (FullScreenStateDelegate) cryptoSendWalletsListController2.R.getValue(), (ListSubheaderDelegate) cryptoSendWalletsListController2.S.getValue(), new RowLoadingDelegate(), (SwipeToActionDelegate) cryptoSendWalletsListController2.T.getValue()), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CryptoSendWalletsListController.V;
                        return new SwipeToActionDelegate((RowDelegate) cryptoSendWalletsListController.Q.getValue(), false);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: zq5.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendWalletsListController f324394b;

            {
                this.f324394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoSendWalletsListController cryptoSendWalletsListController = this.f324394b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendWalletsListController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendWalletsListController.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData = cryptoSendWalletsListController.K;
                        cryptoSendWalletsListControllerContract$InputData.getClass();
                        return new zo5.j(dVar, cryptoSendWalletsListControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendWalletsListController.V;
                        return (v) ((zo5.j) cryptoSendWalletsListController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoSendWalletsListController.V;
                        int i3 = R$id.recyclerView;
                        CryptoSendWalletsListController cryptoSendWalletsListController2 = this.f324394b;
                        return dli.f.a(cryptoSendWalletsListController2, cryptoSendWalletsListController2.d(), zhm.v.k((RowDelegate) cryptoSendWalletsListController2.Q.getValue(), (FullScreenStateDelegate) cryptoSendWalletsListController2.R.getValue(), (ListSubheaderDelegate) cryptoSendWalletsListController2.S.getValue(), new RowLoadingDelegate(), (SwipeToActionDelegate) cryptoSendWalletsListController2.T.getValue()), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CryptoSendWalletsListController.V;
                        return new SwipeToActionDelegate((RowDelegate) cryptoSendWalletsListController.Q.getValue(), false);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: zq5.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendWalletsListController f324394b;

            {
                this.f324394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoSendWalletsListController cryptoSendWalletsListController = this.f324394b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendWalletsListController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendWalletsListController.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData = cryptoSendWalletsListController.K;
                        cryptoSendWalletsListControllerContract$InputData.getClass();
                        return new zo5.j(dVar, cryptoSendWalletsListControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendWalletsListController.V;
                        return (v) ((zo5.j) cryptoSendWalletsListController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoSendWalletsListController.V;
                        int i32 = R$id.recyclerView;
                        CryptoSendWalletsListController cryptoSendWalletsListController2 = this.f324394b;
                        return dli.f.a(cryptoSendWalletsListController2, cryptoSendWalletsListController2.d(), zhm.v.k((RowDelegate) cryptoSendWalletsListController2.Q.getValue(), (FullScreenStateDelegate) cryptoSendWalletsListController2.R.getValue(), (ListSubheaderDelegate) cryptoSendWalletsListController2.S.getValue(), new RowLoadingDelegate(), (SwipeToActionDelegate) cryptoSendWalletsListController2.T.getValue()), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CryptoSendWalletsListController.V;
                        return new SwipeToActionDelegate((RowDelegate) cryptoSendWalletsListController.Q.getValue(), false);
                }
            }
        });
        this.Q = w.y0(new zj9.a(23));
        this.R = w.y0(new zj9.a(24));
        this.S = w.y0(new zj9.a(25));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: zq5.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendWalletsListController f324394b;

            {
                this.f324394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CryptoSendWalletsListController cryptoSendWalletsListController = this.f324394b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendWalletsListController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendWalletsListController.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData = cryptoSendWalletsListController.K;
                        cryptoSendWalletsListControllerContract$InputData.getClass();
                        return new zo5.j(dVar, cryptoSendWalletsListControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendWalletsListController.V;
                        return (v) ((zo5.j) cryptoSendWalletsListController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoSendWalletsListController.V;
                        int i32 = R$id.recyclerView;
                        CryptoSendWalletsListController cryptoSendWalletsListController2 = this.f324394b;
                        return dli.f.a(cryptoSendWalletsListController2, cryptoSendWalletsListController2.d(), zhm.v.k((RowDelegate) cryptoSendWalletsListController2.Q.getValue(), (FullScreenStateDelegate) cryptoSendWalletsListController2.R.getValue(), (ListSubheaderDelegate) cryptoSendWalletsListController2.S.getValue(), new RowLoadingDelegate(), (SwipeToActionDelegate) cryptoSendWalletsListController2.T.getValue()), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CryptoSendWalletsListController.V;
                        return new SwipeToActionDelegate((RowDelegate) cryptoSendWalletsListController.Q.getValue(), false);
                }
            }
        });
        this.U = new j1(this, 13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        x uiState = (x) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        String str = uiState.f324403b;
        zq5.w wVar = uiState.f324404c;
        if (str != null) {
            navBarWithToolbar.setSearchInput(str);
            navBarWithToolbar.K0(j4.FROM_CLICKED_BUTTON);
            a aVar = (a) d();
            aVar.H2(aVar.B, new u0(19));
        }
        navBarWithToolbar.setTitle(wVar.f324399a, null);
        navBarWithToolbar.setMenuItems(wVar.f324400b);
        navBarWithToolbar.setSearchButtonActive(wVar.e);
        navBarWithToolbar.setSearchFieldActionButtons(wVar.f324401c);
        navBarWithToolbar.setHint(wVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setTag("CryptoSendWalletsListController_NavBar");
        d3().f174540c.setTag("CryptoSendWalletsListController_RecyclerView");
    }

    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new b(this, null, 23), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new p(this, null, 0), 3);
        r rVarDebounce = d3().f174539b.f59409p.f57337m.debounce(400L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        ViewController.P2(this, rd0.e.b(rVarDebounce), new p(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.w0()), new p(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), new zq5.q(this, null), 3);
        ?? r62 = this.R;
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) r62.getValue()).f52371h.f121375b), new zq5.r(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) r62.getValue()).d), new p(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.S.getValue()).d), new zq5.s(this, null), 3);
        ViewController.P2(this, rd0.e.b(((SwipeToActionDelegate) this.T.getValue()).f), new t(this, null), 3);
        d3().f174538a.post(this.U);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final v d() {
        return (v) this.O.getValue();
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
