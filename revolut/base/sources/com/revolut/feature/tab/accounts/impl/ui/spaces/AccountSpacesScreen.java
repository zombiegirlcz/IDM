package com.revolut.feature.tab.accounts.impl.ui.spaces;

import aie.l;
import aie.m;
import aie.n;
import aie.p;
import aie.v;
import aii.q;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.R$string;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.impl.R$id;
import com.revolut.feature.tab.accounts.impl.R$layout;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.d0;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/spaces/AccountSpacesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Laie/g;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountSpacesScreen extends ViewController<q> implements tki.c {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(AccountSpacesScreen.class, "binding", "getBinding()Lcom/revolut/feature/tab/accounts/impl/databinding/ScreenAccountsSpacesBinding;", 0))};
    public final TabAccountsMode K;
    public final RowDelegate L;
    public final CellDetailsDelegate M;
    public final SwipeToActionDelegate N;
    public final ListSubheaderDelegate O;
    public final ao.h P;
    public final Object Q;
    public final Object R;
    public final aie.k S;
    public final int T;
    public final int U;
    public final Object V;
    public final Object W;
    public final Object X;

    public AccountSpacesScreen(TabAccountsMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.K = mode;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        this.M = new CellDetailsDelegate();
        this.N = new SwipeToActionDelegate(rowDelegate, false);
        this.O = new ListSubheaderDelegate();
        this.P = s.t(this, aie.j.f);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: aie.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountSpacesScreen f5246b;

            {
                this.f5246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountSpacesScreen accountSpacesScreen = this.f5246b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountSpacesScreen.Y;
                        return new tw0.n(new zjh.c(accountSpacesScreen, 4));
                    case 1:
                        return new ItemTouchHelper((tw0.n) accountSpacesScreen.Q.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = AccountSpacesScreen.Y;
                        return ((bie.a) accountSpacesScreen.W.getValue()).a();
                    case 3:
                        KProperty[] kPropertyArr3 = AccountSpacesScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(accountSpacesScreen.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (bie.a) ((ehe.j) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(accountSpacesScreen.K).k().mo3808a(accountSpacesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = AccountSpacesScreen.Y;
                        AccountSpacesScreen accountSpacesScreen2 = this.f5246b;
                        return tki.g.a(accountSpacesScreen2, accountSpacesScreen2.k3(), zhm.d0.E0(((bie.a) accountSpacesScreen2.W.getValue()).h().e, zhm.v.k(accountSpacesScreen2.M, accountSpacesScreen2.O, accountSpacesScreen2.N, accountSpacesScreen2.L)), R$id.screenAccountsSpaces_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: aie.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountSpacesScreen f5246b;

            {
                this.f5246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountSpacesScreen accountSpacesScreen = this.f5246b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountSpacesScreen.Y;
                        return new tw0.n(new zjh.c(accountSpacesScreen, 4));
                    case 1:
                        return new ItemTouchHelper((tw0.n) accountSpacesScreen.Q.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = AccountSpacesScreen.Y;
                        return ((bie.a) accountSpacesScreen.W.getValue()).a();
                    case 3:
                        KProperty[] kPropertyArr3 = AccountSpacesScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(accountSpacesScreen.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (bie.a) ((ehe.j) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(accountSpacesScreen.K).k().mo3808a(accountSpacesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = AccountSpacesScreen.Y;
                        AccountSpacesScreen accountSpacesScreen2 = this.f5246b;
                        return tki.g.a(accountSpacesScreen2, accountSpacesScreen2.k3(), zhm.d0.E0(((bie.a) accountSpacesScreen2.W.getValue()).h().e, zhm.v.k(accountSpacesScreen2.M, accountSpacesScreen2.O, accountSpacesScreen2.N, accountSpacesScreen2.L)), R$id.screenAccountsSpaces_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.S = new aie.k(this);
        this.T = R$style.UiKitTheme_TransparentSlider;
        this.U = R$layout.screen_accounts_spaces;
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: aie.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountSpacesScreen f5246b;

            {
                this.f5246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountSpacesScreen accountSpacesScreen = this.f5246b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountSpacesScreen.Y;
                        return new tw0.n(new zjh.c(accountSpacesScreen, 4));
                    case 1:
                        return new ItemTouchHelper((tw0.n) accountSpacesScreen.Q.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = AccountSpacesScreen.Y;
                        return ((bie.a) accountSpacesScreen.W.getValue()).a();
                    case 3:
                        KProperty[] kPropertyArr3 = AccountSpacesScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(accountSpacesScreen.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (bie.a) ((ehe.j) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(accountSpacesScreen.K).k().mo3808a(accountSpacesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = AccountSpacesScreen.Y;
                        AccountSpacesScreen accountSpacesScreen2 = this.f5246b;
                        return tki.g.a(accountSpacesScreen2, accountSpacesScreen2.k3(), zhm.d0.E0(((bie.a) accountSpacesScreen2.W.getValue()).h().e, zhm.v.k(accountSpacesScreen2.M, accountSpacesScreen2.O, accountSpacesScreen2.N, accountSpacesScreen2.L)), R$id.screenAccountsSpaces_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: aie.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountSpacesScreen f5246b;

            {
                this.f5246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AccountSpacesScreen accountSpacesScreen = this.f5246b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountSpacesScreen.Y;
                        return new tw0.n(new zjh.c(accountSpacesScreen, 4));
                    case 1:
                        return new ItemTouchHelper((tw0.n) accountSpacesScreen.Q.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = AccountSpacesScreen.Y;
                        return ((bie.a) accountSpacesScreen.W.getValue()).a();
                    case 3:
                        KProperty[] kPropertyArr3 = AccountSpacesScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(accountSpacesScreen.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (bie.a) ((ehe.j) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(accountSpacesScreen.K).k().mo3808a(accountSpacesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = AccountSpacesScreen.Y;
                        AccountSpacesScreen accountSpacesScreen2 = this.f5246b;
                        return tki.g.a(accountSpacesScreen2, accountSpacesScreen2.k3(), zhm.d0.E0(((bie.a) accountSpacesScreen2.W.getValue()).h().e, zhm.v.k(accountSpacesScreen2.M, accountSpacesScreen2.O, accountSpacesScreen2.N, accountSpacesScreen2.L)), R$id.screenAccountsSpaces_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i6 = 4;
        this.X = w.y0(new Function0(this) { // from class: aie.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountSpacesScreen f5246b;

            {
                this.f5246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                AccountSpacesScreen accountSpacesScreen = this.f5246b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountSpacesScreen.Y;
                        return new tw0.n(new zjh.c(accountSpacesScreen, 4));
                    case 1:
                        return new ItemTouchHelper((tw0.n) accountSpacesScreen.Q.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = AccountSpacesScreen.Y;
                        return ((bie.a) accountSpacesScreen.W.getValue()).a();
                    case 3:
                        KProperty[] kPropertyArr3 = AccountSpacesScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(accountSpacesScreen.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (bie.a) ((ehe.j) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(accountSpacesScreen.K).k().mo3808a(accountSpacesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = AccountSpacesScreen.Y;
                        AccountSpacesScreen accountSpacesScreen2 = this.f5246b;
                        return tki.g.a(accountSpacesScreen2, accountSpacesScreen2.k3(), zhm.d0.E0(((bie.a) accountSpacesScreen2.W.getValue()).h().e, zhm.v.k(accountSpacesScreen2.M, accountSpacesScreen2.O, accountSpacesScreen2.N, accountSpacesScreen2.L)), R$id.screenAccountsSpaces_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.T);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        aie.g uiState = (aie.g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ((tki.b) k()).f271959b.h().post(new a4.a(this, uiState, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (bie.a) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        aie.b bVarK3 = k3();
        sfe.i event = new sfe.i(i, i2, intent);
        i iVar = (i) bVarK3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        iVar.l2(new v(iVar, event, null), new yi5.b(26));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.home_account_switcher, null, null, 14));
        BasicNavBar basicNavBar = d3().f152168c;
        basicNavBar.setBackground(d0.TRANSPARENT);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton largeActionButton = d3().f152167b;
        largeActionButton.setText(new TextLocalisedClause(R$string.account_switcher_main_button_title, null, null, 14));
        largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOnAccent), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((tki.b) k()).f271959b.h().removeOnScrollListener(this.S);
        ((ItemTouchHelper) this.R.getValue()).attachToRecyclerView(null);
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((tki.b) k()).f271959b.h().addOnScrollListener(this.S);
        ((ItemTouchHelper) this.R.getValue()).attachToRecyclerView(((tki.b) k()).f271959b.h());
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f152168c.f59211b), null, new l(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f152167b.o), null, new l(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.L;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.k), null, new m(2, 4, aie.b.class, k3(), "onRowDelegateClicked", "onRowDelegateClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new n(2, 4, aie.b.class, k3(), "onRowDelegateClicked", "onRowDelegateClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f), null, new aie.o(2, 4, aie.b.class, k3(), "onCellDetailsClicked", "onCellDetailsClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53220l), null, new p(2, 4, aie.b.class, k3(), "onRowDelegateValueActionClicked", "onRowDelegateValueActionClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53227t), null, new aie.q(this, null), 3);
        SwipeToActionDelegate swipeToActionDelegate = this.N;
        ihm.f fVar = swipeToActionDelegate.f;
        r rVarHide = swipeToActionDelegate.f53503g.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        r rVarFilter = rVarHide.filter(new ai0.j(new agh.h(24), 1));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.F0(fVar, rVarFilter)), null, new aie.r(this, null), 3);
    }

    public final hge.a d3() {
        ViewBinding value = this.P.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hge.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final aie.b d() {
        return (aie.b) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final tki.a k() {
        return (tki.a) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }
}
