package com.revolut.feature_crypto_picker.impl.ui.picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature_crypto_picker.api.CryptoPickerDestination;
import com.revolut.feature_crypto_picker.impl.R$string;
import com.revolut.feature_crypto_picker.impl.ui.picker.CryptoPickerController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import iw4.b;
import j0i.d;
import j0i.f;
import j0i.g;
import j0i.i;
import j0i.j;
import j0i.k;
import j0i.l;
import jii.u;
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
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_picker/impl/ui/picker/CryptoPickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg0i/a;", "Ldli/a;", "Lj0i/d;", "feature_crypto_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoPickerController extends ViewController<g0i.a> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CryptoPickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CryptoPickerDestination.CryptoPickerInputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public CryptoPickerController(CryptoPickerDestination.CryptoPickerInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, f.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j0i.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPickerController f170049b;

            {
                this.f170049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoPickerController cryptoPickerController = this.f170049b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoPickerController.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoPickerController.m2()).a().get(h0i.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h0i.a.class, " is not found"));
                        }
                        h0i.a aVar3 = ((h0i.a) aVar2.b()).d;
                        CryptoPickerDestination.CryptoPickerInputData cryptoPickerInputData = cryptoPickerController.K;
                        cryptoPickerInputData.getClass();
                        return new h0i.c(aVar3, cryptoPickerController, cryptoPickerInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoPickerController.U;
                        return (b) ((h0i.c) ((k0i.a) cryptoPickerController.N.getValue())).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoPickerController.U;
                        return new SelectableDelegate((RowDelegate) cryptoPickerController.Q.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CryptoPickerController.U;
                        CryptoPickerController cryptoPickerController2 = this.f170049b;
                        return dli.f.a(cryptoPickerController2, cryptoPickerController2.d(), v.k((ListSubheaderDelegate) cryptoPickerController2.P.getValue(), (SelectableDelegate) cryptoPickerController2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) cryptoPickerController2.S.getValue(), (RowDelegate) cryptoPickerController2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: j0i.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPickerController f170049b;

            {
                this.f170049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoPickerController cryptoPickerController = this.f170049b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoPickerController.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoPickerController.m2()).a().get(h0i.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h0i.a.class, " is not found"));
                        }
                        h0i.a aVar3 = ((h0i.a) aVar2.b()).d;
                        CryptoPickerDestination.CryptoPickerInputData cryptoPickerInputData = cryptoPickerController.K;
                        cryptoPickerInputData.getClass();
                        return new h0i.c(aVar3, cryptoPickerController, cryptoPickerInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoPickerController.U;
                        return (b) ((h0i.c) ((k0i.a) cryptoPickerController.N.getValue())).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoPickerController.U;
                        return new SelectableDelegate((RowDelegate) cryptoPickerController.Q.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CryptoPickerController.U;
                        CryptoPickerController cryptoPickerController2 = this.f170049b;
                        return dli.f.a(cryptoPickerController2, cryptoPickerController2.d(), v.k((ListSubheaderDelegate) cryptoPickerController2.P.getValue(), (SelectableDelegate) cryptoPickerController2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) cryptoPickerController2.S.getValue(), (RowDelegate) cryptoPickerController2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new b(25));
        this.Q = w.y0(new b(26));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: j0i.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPickerController f170049b;

            {
                this.f170049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoPickerController cryptoPickerController = this.f170049b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoPickerController.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoPickerController.m2()).a().get(h0i.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h0i.a.class, " is not found"));
                        }
                        h0i.a aVar3 = ((h0i.a) aVar2.b()).d;
                        CryptoPickerDestination.CryptoPickerInputData cryptoPickerInputData = cryptoPickerController.K;
                        cryptoPickerInputData.getClass();
                        return new h0i.c(aVar3, cryptoPickerController, cryptoPickerInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoPickerController.U;
                        return (b) ((h0i.c) ((k0i.a) cryptoPickerController.N.getValue())).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoPickerController.U;
                        return new SelectableDelegate((RowDelegate) cryptoPickerController.Q.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CryptoPickerController.U;
                        CryptoPickerController cryptoPickerController2 = this.f170049b;
                        return dli.f.a(cryptoPickerController2, cryptoPickerController2.d(), v.k((ListSubheaderDelegate) cryptoPickerController2.P.getValue(), (SelectableDelegate) cryptoPickerController2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) cryptoPickerController2.S.getValue(), (RowDelegate) cryptoPickerController2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new b(27));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: j0i.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPickerController f170049b;

            {
                this.f170049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CryptoPickerController cryptoPickerController = this.f170049b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoPickerController.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoPickerController.m2()).a().get(h0i.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h0i.a.class, " is not found"));
                        }
                        h0i.a aVar3 = ((h0i.a) aVar2.b()).d;
                        CryptoPickerDestination.CryptoPickerInputData cryptoPickerInputData = cryptoPickerController.K;
                        cryptoPickerInputData.getClass();
                        return new h0i.c(aVar3, cryptoPickerController, cryptoPickerInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoPickerController.U;
                        return (b) ((h0i.c) ((k0i.a) cryptoPickerController.N.getValue())).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoPickerController.U;
                        return new SelectableDelegate((RowDelegate) cryptoPickerController.Q.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CryptoPickerController.U;
                        CryptoPickerController cryptoPickerController2 = this.f170049b;
                        return dli.f.a(cryptoPickerController2, cryptoPickerController2.d(), v.k((ListSubheaderDelegate) cryptoPickerController2.P.getValue(), (SelectableDelegate) cryptoPickerController2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) cryptoPickerController2.S.getValue(), (RowDelegate) cryptoPickerController2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f170046b ? 0 : 8);
        d3().f174565c.setHeaderDisclaimerSticky(uiState.f170047c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k0i.a) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_picker_header_title, null, null, 14));
        navBarWithToolbar.setTitleVisible(false);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.f59417v0 = true;
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.crypto_picker_search_hint, null, null, 14));
        d3().f174564b.setText(new TextLocalisedClause(R$string.crypto_picker_button_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b((ihm.f) d3().f174565c.f59406n.f258290b), new j0i.h(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), new j0i.h(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59409p.f57336l), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).f52371h.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new g(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((SelectableDelegate) this.R.getValue()).r()), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.P.getValue()).f52707c), new l(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j0i.b d() {
        return (j0i.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
