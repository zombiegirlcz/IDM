package com.revolut.feature.topup_screen.impl.screens.external_card_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qve.f;
import te0.w;
import vc.s;
import woc.p;
import wrj.m;
import wyc.u;
import x0f.b;
import x0f.c;
import x0f.g;
import x0f.o;
import x0f.r;
import xki.e;
import yy0.i;
import yy0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/screens/external_card_details/ExternalCardDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lx0f/o;", "Ldli/a;", "Lx0f/r;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalCardDetailsScreen extends ViewController<o> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ExternalCardDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final PlainTextWarningDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public ExternalCardDetailsScreen(ExternalCardDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = w.y0(new u(15));
        this.N = w.y0(new u(16));
        this.O = new RowDelegate(null, null, 7);
        this.P = new PlainTextWarningDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: x0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardDetailsScreen f301578b;

            {
                this.f301578b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ExternalCardDetailsScreen.T;
                        ExternalCardDetailsScreen externalCardDetailsScreen = this.f301578b;
                        return dli.f.a(externalCardDetailsScreen, externalCardDetailsScreen.d(), zhm.v.k((ActionsDelegate) externalCardDetailsScreen.M.getValue(), (CellDetailsActionDelegate) externalCardDetailsScreen.N.getValue(), externalCardDetailsScreen.O, new ListSubheaderDelegate(), new CellDetailsDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), externalCardDetailsScreen.P), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ExternalCardDetailsScreen.T;
                        return (p) ((qve.f) this.f301578b.R.getValue()).f249590c.get();
                }
            }
        });
        this.R = w.y0(new m(this, inputData, 11));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: x0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardDetailsScreen f301578b;

            {
                this.f301578b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ExternalCardDetailsScreen.T;
                        ExternalCardDetailsScreen externalCardDetailsScreen = this.f301578b;
                        return dli.f.a(externalCardDetailsScreen, externalCardDetailsScreen.d(), zhm.v.k((ActionsDelegate) externalCardDetailsScreen.M.getValue(), (CellDetailsActionDelegate) externalCardDetailsScreen.N.getValue(), externalCardDetailsScreen.O, new ListSubheaderDelegate(), new CellDetailsDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), externalCardDetailsScreen.P), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ExternalCardDetailsScreen.T;
                        return (p) ((qve.f) this.f301578b.R.getValue()).f249590c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        x0f.q qVar2 = uiState.f301599b;
        if (qVar2 != null) {
            TextClause textClause = qVar2.f301595a;
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            i iVar = l.Companion;
            Image image = qVar2.f301597c;
            iVar.getClass();
            navBarWithToolbar.setEndImage(i.a(image));
            Image image2 = qVar2.d;
            navBarWithToolbar.setEndIconBadge(image2 != null ? new RawImageBadge(image2) : null);
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setDescriptionText(qVar2.f301596b);
            navBarWithToolbar.setDescriptionVisible(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new g(this, null, 0), 3);
        ViewController.P2(this, new wvl.b(rd0.e.b(((ActionsDelegate) this.M.getValue()).f51611c.f121375b), 9), new p(2, d(), x0f.p.class, "onActionClicked", "onActionClicked(Ljava/lang/String;)V", 4, 4), 3);
        ViewController.P2(this, new wvl.b(rd0.e.b(((CellDetailsActionDelegate) this.N.getValue()).d), 10), new p(2, d(), x0f.p.class, "onCellActionClicked", "onCellActionClicked(Ljava/lang/String;)V", 4, 5), 3);
        ViewController.P2(this, new wvl.b(rd0.e.b(this.O.f53218h), 11), new p(2, d(), x0f.p.class, "onActionClicked", "onActionClicked(Ljava/lang/String;)V", 4, 6), 3);
        PlainTextWarningDelegate plainTextWarningDelegate = this.P;
        ViewController.P2(this, rd0.e.b(plainTextWarningDelegate.s()), new wuh.q(this, (Continuation) null, 20), 3);
        ViewController.P2(this, rd0.e.b(plainTextWarningDelegate.d.f121375b), new c(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x0f.p d() {
        return (x0f.p) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
