package com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c43.k;
import cli.o;
import cli.q;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_payment_method.impl.R$string;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreen;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import h43.b;
import h43.c;
import h43.f;
import h43.g;
import h43.i;
import h43.j;
import h43.l;
import h43.p;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/flows/link_card/screens/chooser/ChooserScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/card_payment_method/impl/flows/link_card/screens/chooser/ChooserScreenContract$OutputData;", "Ldli/a;", "Lh43/p;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChooserScreen extends ViewController<ChooserScreenContract$OutputData> implements a {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(ChooserScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ChooserScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final RowDelegate Q;
    public final PermissionDelegate R;
    public final ListSubheaderDelegate S;
    public final SelectableDelegate T;
    public final FullScreenStateDelegate U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public ChooserScreen(ChooserScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: h43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooserScreen f149287b;

            {
                this.f149287b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChooserScreen chooserScreen = this.f149287b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChooserScreen.Z;
                        return (o) ((c43.k) chooserScreen.P.getValue()).f21041h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ChooserScreen.Z;
                        return (j60.a) ((c43.k) chooserScreen.P.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ChooserScreen.Z;
                        qji.b bVarU2 = chooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.di.ChooserScreenInjector");
                        c43.l lVar = (c43.l) bVarU2;
                        c43.h hVar = lVar.f21043b;
                        c43.l lVar2 = lVar.f21044c;
                        ChooserScreenContract$InputData chooserScreenContract$InputData = chooserScreen.K;
                        chooserScreenContract$InputData.getClass();
                        return new c43.k(hVar, lVar2, chooserScreen, chooserScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ChooserScreen.Z;
                        ChooserScreen chooserScreen2 = this.f149287b;
                        return dli.f.a(chooserScreen2, chooserScreen2.d(), v.k(chooserScreen2.Q, chooserScreen2.T, new RowLoadingDelegate(), new ErrorWidgetDelegate(), chooserScreen2.S, chooserScreen2.U, new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: h43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooserScreen f149287b;

            {
                this.f149287b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChooserScreen chooserScreen = this.f149287b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChooserScreen.Z;
                        return (o) ((c43.k) chooserScreen.P.getValue()).f21041h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ChooserScreen.Z;
                        return (j60.a) ((c43.k) chooserScreen.P.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ChooserScreen.Z;
                        qji.b bVarU2 = chooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.di.ChooserScreenInjector");
                        c43.l lVar = (c43.l) bVarU2;
                        c43.h hVar = lVar.f21043b;
                        c43.l lVar2 = lVar.f21044c;
                        ChooserScreenContract$InputData chooserScreenContract$InputData = chooserScreen.K;
                        chooserScreenContract$InputData.getClass();
                        return new c43.k(hVar, lVar2, chooserScreen, chooserScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ChooserScreen.Z;
                        ChooserScreen chooserScreen2 = this.f149287b;
                        return dli.f.a(chooserScreen2, chooserScreen2.d(), v.k(chooserScreen2.Q, chooserScreen2.T, new RowLoadingDelegate(), new ErrorWidgetDelegate(), chooserScreen2.S, chooserScreen2.U, new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: h43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooserScreen f149287b;

            {
                this.f149287b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChooserScreen chooserScreen = this.f149287b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChooserScreen.Z;
                        return (o) ((c43.k) chooserScreen.P.getValue()).f21041h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ChooserScreen.Z;
                        return (j60.a) ((c43.k) chooserScreen.P.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ChooserScreen.Z;
                        qji.b bVarU2 = chooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.di.ChooserScreenInjector");
                        c43.l lVar = (c43.l) bVarU2;
                        c43.h hVar = lVar.f21043b;
                        c43.l lVar2 = lVar.f21044c;
                        ChooserScreenContract$InputData chooserScreenContract$InputData = chooserScreen.K;
                        chooserScreenContract$InputData.getClass();
                        return new c43.k(hVar, lVar2, chooserScreen, chooserScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ChooserScreen.Z;
                        ChooserScreen chooserScreen2 = this.f149287b;
                        return dli.f.a(chooserScreen2, chooserScreen2.d(), v.k(chooserScreen2.Q, chooserScreen2.T, new RowLoadingDelegate(), new ErrorWidgetDelegate(), chooserScreen2.S, chooserScreen2.U, new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new PermissionDelegate();
        this.S = new ListSubheaderDelegate();
        this.T = new SelectableDelegate(rowDelegate);
        this.U = new FullScreenStateDelegate();
        this.V = w.y0(new gx2.a(29));
        this.W = w.y0(new b(0));
        this.X = w.y0(new b(1));
        final int i5 = 3;
        this.Y = w.y0(new Function0(this) { // from class: h43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooserScreen f149287b;

            {
                this.f149287b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ChooserScreen chooserScreen = this.f149287b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChooserScreen.Z;
                        return (o) ((c43.k) chooserScreen.P.getValue()).f21041h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ChooserScreen.Z;
                        return (j60.a) ((c43.k) chooserScreen.P.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ChooserScreen.Z;
                        qji.b bVarU2 = chooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.di.ChooserScreenInjector");
                        c43.l lVar = (c43.l) bVarU2;
                        c43.h hVar = lVar.f21043b;
                        c43.l lVar2 = lVar.f21044c;
                        ChooserScreenContract$InputData chooserScreenContract$InputData = chooserScreen.K;
                        chooserScreenContract$InputData.getClass();
                        return new c43.k(hVar, lVar2, chooserScreen, chooserScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ChooserScreen.Z;
                        ChooserScreen chooserScreen2 = this.f149287b;
                        return dli.f.a(chooserScreen2, chooserScreen2.d(), v.k(chooserScreen2.Q, chooserScreen2.T, new RowLoadingDelegate(), new ErrorWidgetDelegate(), chooserScreen2.S, chooserScreen2.U, new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f149298b);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f149299c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_link_card_choose_card_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        AccountId accountId = this.K.f65270b;
        if (accountId instanceof AccountId.Joint) {
            i = R$string.card_link_card_choose_card_joint_subtitle;
        } else {
            if (!(accountId instanceof AccountId.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.card_link_card_choose_card_subtitle;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(textLocalisedClause2);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.card_link_card_choose_card_action, null, null, 14));
        largeActionButton.setLoadingButtonTag("GO_TO_BUTTON_TAG");
        ((j60.a) this.O.getValue()).d(v.k((LargeActionButtonDelegate) this.V.getValue(), this.S, this.R, (TextDelegate) this.W.getValue(), this.Q, (NotificationCentreItemDelegate) this.X.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.T.r()), new g(this, null), 3);
        FullScreenStateDelegate fullScreenStateDelegate = this.U;
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.i.f121375b), new h43.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.f52372j.f121375b), new j(this, null), 3);
        RowDelegate rowDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new h43.k(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53226s), new h43.e(this, continuation, 2), 3);
        ViewController.P2(this, new h23.b(rd0.e.b(((NotificationCentreItemDelegate) this.X.getValue()).f52865c), 7), new l(this, null), 3);
        int i = 0;
        ViewController.P2(this, rd0.e.b(this.R.d.f121375b), new h43.e(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new f(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(((j60.a) this.O.getValue()).C()), new h43.e(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final h43.o d() {
        return (h43.o) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }
}
