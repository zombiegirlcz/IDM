package com.feature.user.details.impl.ui.details;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.feature.user.details.impl.ui.details.UserDetailsController;
import com.feature.user.details.impl.ui.details.UserDetailsControllerContract$InputData;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.revolut.feature_fourthline_impl.R;
import db.c;
import db.d;
import db.g;
import db.i;
import db.j;
import db.k;
import db.o;
import db.p;
import db.r;
import db.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import yp0.y;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/feature/user/details/impl/ui/details/UserDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldb/o;", "Ldli/a;", "Ldb/t;", "feature_user_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserDetailsController extends ViewController<o> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(UserDetailsController.class, "binding", "getBinding()Lcom/feature/user/details/impl/databinding/ScreenUserDetailsBinding;", 0))};
    public final UserDetailsControllerContract$InputData K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final RowDelegate Q;
    public final SelectableDelegate R;
    public final TextDelegate S;
    public final CellDetailsActionListDelegate T;
    public final Object U;

    public UserDetailsController(UserDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: db.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserDetailsController f112601b;

            {
                this.f112601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UserDetailsController userDetailsController = this.f112601b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UserDetailsController.V;
                        return (k) ((va.b) userDetailsController.O.getValue()).f287108q.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UserDetailsController.V;
                        qji.b bVarU2 = userDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.feature.user.details.impl.ui.details.di.UserDetailsScreenInjector");
                        va.c cVar = (va.c) bVarU2;
                        return new va.b(cVar.f287110b, cVar.f287111c, userDetailsController, new UserDetailsControllerContract$InputData(userDetailsController.K.f26227a));
                    default:
                        KProperty[] kPropertyArr3 = UserDetailsController.V;
                        UserDetailsController userDetailsController2 = this.f112601b;
                        return dli.f.a(userDetailsController2, userDetailsController2.R2(), zhm.v.k(userDetailsController2.P, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new LargeActionButtonLoadingDelegate(), userDetailsController2.T, userDetailsController2.R, userDetailsController2.S), R.id.userDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = R.layout.screen_user_details;
        this.N = s.t(this, c.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: db.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserDetailsController f112601b;

            {
                this.f112601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UserDetailsController userDetailsController = this.f112601b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UserDetailsController.V;
                        return (k) ((va.b) userDetailsController.O.getValue()).f287108q.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UserDetailsController.V;
                        qji.b bVarU2 = userDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.feature.user.details.impl.ui.details.di.UserDetailsScreenInjector");
                        va.c cVar = (va.c) bVarU2;
                        return new va.b(cVar.f287110b, cVar.f287111c, userDetailsController, new UserDetailsControllerContract$InputData(userDetailsController.K.f26227a));
                    default:
                        KProperty[] kPropertyArr3 = UserDetailsController.V;
                        UserDetailsController userDetailsController2 = this.f112601b;
                        return dli.f.a(userDetailsController2, userDetailsController2.R2(), zhm.v.k(userDetailsController2.P, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new LargeActionButtonLoadingDelegate(), userDetailsController2.T, userDetailsController2.R, userDetailsController2.S), R.id.userDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new SelectableDelegate(rowDelegate);
        this.S = new TextDelegate();
        this.T = new CellDetailsActionListDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: db.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserDetailsController f112601b;

            {
                this.f112601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UserDetailsController userDetailsController = this.f112601b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UserDetailsController.V;
                        return (k) ((va.b) userDetailsController.O.getValue()).f287108q.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UserDetailsController.V;
                        qji.b bVarU2 = userDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.feature.user.details.impl.ui.details.di.UserDetailsScreenInjector");
                        va.c cVar = (va.c) bVarU2;
                        return new va.b(cVar.f287110b, cVar.f287111c, userDetailsController, new UserDetailsControllerContract$InputData(userDetailsController.K.f26227a));
                    default:
                        KProperty[] kPropertyArr3 = UserDetailsController.V;
                        UserDetailsController userDetailsController2 = this.f112601b;
                        return dli.f.a(userDetailsController2, userDetailsController2.R2(), zhm.v.k(userDetailsController2.P, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new LargeActionButtonLoadingDelegate(), userDetailsController2.T, userDetailsController2.R, userDetailsController2.S), R.id.userDetails_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Integer num = uiState.f;
        p pVar = qVar instanceof p ? (p) qVar : null;
        if (pd.b.j(pVar != null ? Boolean.valueOf(pVar.f112625a) : null) && num != null) {
            RecyclerView.LayoutManager layoutManager = d3().d.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.scrollToPositionWithOffset(num.intValue(), d3().e.getHeight());
            }
        }
        DraggableTabsView draggableTabsView = d3().e;
        draggableTabsView.setVisibility(uiState.f112632c ? 0 : 8);
        draggableTabsView.setItems(uiState.d, uiState.e);
        NavBarWithToolbar navBarWithToolbar = d3().f278511c;
        db.s sVar = uiState.f112631b;
        if (sVar instanceof db.q) {
            navBarWithToolbar.l0();
            db.q qVar2 = (db.q) sVar;
            Clause clause = qVar2.f112627b;
            TextClause textClause = qVar2.f112626a;
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setToolbarTitle(textClause);
            if (clause != null) {
                navBarWithToolbar.setDescriptionVisible(true);
                navBarWithToolbar.setDescriptionText(clause);
            } else {
                navBarWithToolbar.setDescriptionVisible(false);
            }
            navBarWithToolbar.setDescriptionClickable(false);
            navBarWithToolbar.setEndIconBadge(qVar2.f112628c);
            navBarWithToolbar.setEndIconImage(qVar2.d);
        } else {
            if (!sVar.equals(r.f112629a)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.PROFILE;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        CollapsingActionButton collapsingActionButton = d3().f278510b;
        collapsingActionButton.setLargeButtonText(new TextLocalisedClause(R.string.user_details_confirm_button, null, null, 14));
        collapsingActionButton.setLargeButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        collapsingActionButton.setVisibility(uiState.f112633g);
        collapsingActionButton.setLargeButtonEnabled(uiState.f112634h);
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (va.b) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R.string.user_details_title, null, null, 14));
        NavBarWithToolbar navBarWithToolbar = d3().f278511c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R.string.user_details_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R.string.user_details_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().d.setItemAnimator(null);
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f278511c;
        int i = 0;
        navBarWithToolbar.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new db.a(navBarWithToolbar, i));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new i(this, continuation, i), 3);
        int i2 = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.r0()), null, new i(this, continuation, i2), 3);
        CollapsingActionButton collapsingActionButton = d3().f278510b;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(collapsingActionButton.d()), null, new j(this, null), 3);
        int i3 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(collapsingActionButton.c()), null, new i(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((e60.s) ((e60.a) ((va.b) this.O.getValue()).f287104l.get())).f122868g), null, new db.e(this, continuation, i2), 3);
        ScreenContentRecyclerView userDetailsRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(userDetailsRecyclerView, "userDetailsRecyclerView");
        y.b(userDetailsRecyclerView, new d34.b(this, 24));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.m()), null, new db.e(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, new d83.i(rd0.e.b(this.T.d), 4), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new db.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(this.S.d), rd0.e.b(this.Q.f53226s)), null, new db.e(this, continuation, i), 3);
    }

    public final ua.a d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ua.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
