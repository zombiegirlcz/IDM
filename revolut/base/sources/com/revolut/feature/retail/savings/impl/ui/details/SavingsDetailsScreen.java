package com.revolut.feature.retail.savings.impl.ui.details;

import aii.q;
import anb.p;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreen;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreenContract$InputData;
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
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xjl.g;
import xki.e;
import xob.b;
import xob.c;
import xob.d;
import xob.n;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/details/SavingsDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxob/q;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(SavingsDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SavingsDetailsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final TextDelegate R;
    public final LargeActionButtonDelegate S;
    public final CellDetailsDelegate T;
    public final TwinHorizontalButtonDelegate U;
    public final ListCellDelegate V;
    public final CellDetailsChevronDelegate W;
    public final Object X;
    public final Object Y;

    public SavingsDetailsScreen(SavingsDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: xob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsDetailsScreen f307762b;

            {
                this.f307762b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsDetailsScreen savingsDetailsScreen = this.f307762b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsDetailsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(savingsDetailsScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        SavingsDetailsScreenContract$InputData savingsDetailsScreenContract$InputData = savingsDetailsScreen.K;
                        savingsDetailsScreenContract$InputData.getClass();
                        return new anb.p(nVar, savingsDetailsScreen, savingsDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsDetailsScreen.Z;
                        return (n) ((anb.p) savingsDetailsScreen.L.getValue()).f6687j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsDetailsScreen.Z;
                        return (j60.a) ((anb.p) savingsDetailsScreen.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr4 = SavingsDetailsScreen.Z;
                        int i3 = R$id.recyclerView;
                        SavingsDetailsScreen savingsDetailsScreen2 = this.f307762b;
                        return dli.f.a(savingsDetailsScreen2, savingsDetailsScreen2.d(), zhm.v.k(new RowLoadingDelegate(), savingsDetailsScreen2.P, savingsDetailsScreen2.Q, new ListSubheaderDelegate(), savingsDetailsScreen2.T, savingsDetailsScreen2.R, savingsDetailsScreen2.V, savingsDetailsScreen2.S, savingsDetailsScreen2.U, savingsDetailsScreen2.W), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: xob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsDetailsScreen f307762b;

            {
                this.f307762b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsDetailsScreen savingsDetailsScreen = this.f307762b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsDetailsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(savingsDetailsScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        SavingsDetailsScreenContract$InputData savingsDetailsScreenContract$InputData = savingsDetailsScreen.K;
                        savingsDetailsScreenContract$InputData.getClass();
                        return new anb.p(nVar, savingsDetailsScreen, savingsDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsDetailsScreen.Z;
                        return (n) ((anb.p) savingsDetailsScreen.L.getValue()).f6687j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsDetailsScreen.Z;
                        return (j60.a) ((anb.p) savingsDetailsScreen.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr4 = SavingsDetailsScreen.Z;
                        int i3 = R$id.recyclerView;
                        SavingsDetailsScreen savingsDetailsScreen2 = this.f307762b;
                        return dli.f.a(savingsDetailsScreen2, savingsDetailsScreen2.d(), zhm.v.k(new RowLoadingDelegate(), savingsDetailsScreen2.P, savingsDetailsScreen2.Q, new ListSubheaderDelegate(), savingsDetailsScreen2.T, savingsDetailsScreen2.R, savingsDetailsScreen2.V, savingsDetailsScreen2.S, savingsDetailsScreen2.U, savingsDetailsScreen2.W), i3, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, b.f);
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FullScreenStateDelegate();
        this.R = new TextDelegate();
        this.S = new LargeActionButtonDelegate();
        this.T = new CellDetailsDelegate();
        this.U = new TwinHorizontalButtonDelegate();
        this.V = new ListCellDelegate();
        this.W = new CellDetailsChevronDelegate();
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: xob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsDetailsScreen f307762b;

            {
                this.f307762b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsDetailsScreen savingsDetailsScreen = this.f307762b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsDetailsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(savingsDetailsScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        SavingsDetailsScreenContract$InputData savingsDetailsScreenContract$InputData = savingsDetailsScreen.K;
                        savingsDetailsScreenContract$InputData.getClass();
                        return new anb.p(nVar, savingsDetailsScreen, savingsDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsDetailsScreen.Z;
                        return (n) ((anb.p) savingsDetailsScreen.L.getValue()).f6687j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsDetailsScreen.Z;
                        return (j60.a) ((anb.p) savingsDetailsScreen.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr4 = SavingsDetailsScreen.Z;
                        int i32 = R$id.recyclerView;
                        SavingsDetailsScreen savingsDetailsScreen2 = this.f307762b;
                        return dli.f.a(savingsDetailsScreen2, savingsDetailsScreen2.d(), zhm.v.k(new RowLoadingDelegate(), savingsDetailsScreen2.P, savingsDetailsScreen2.Q, new ListSubheaderDelegate(), savingsDetailsScreen2.T, savingsDetailsScreen2.R, savingsDetailsScreen2.V, savingsDetailsScreen2.S, savingsDetailsScreen2.U, savingsDetailsScreen2.W), i32, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.Y = w.y0(new Function0(this) { // from class: xob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsDetailsScreen f307762b;

            {
                this.f307762b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SavingsDetailsScreen savingsDetailsScreen = this.f307762b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsDetailsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(savingsDetailsScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        SavingsDetailsScreenContract$InputData savingsDetailsScreenContract$InputData = savingsDetailsScreen.K;
                        savingsDetailsScreenContract$InputData.getClass();
                        return new anb.p(nVar, savingsDetailsScreen, savingsDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsDetailsScreen.Z;
                        return (n) ((anb.p) savingsDetailsScreen.L.getValue()).f6687j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsDetailsScreen.Z;
                        return (j60.a) ((anb.p) savingsDetailsScreen.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr4 = SavingsDetailsScreen.Z;
                        int i32 = R$id.recyclerView;
                        SavingsDetailsScreen savingsDetailsScreen2 = this.f307762b;
                        return dli.f.a(savingsDetailsScreen2, savingsDetailsScreen2.d(), zhm.v.k(new RowLoadingDelegate(), savingsDetailsScreen2.P, savingsDetailsScreen2.Q, new ListSubheaderDelegate(), savingsDetailsScreen2.T, savingsDetailsScreen2.R, savingsDetailsScreen2.V, savingsDetailsScreen2.S, savingsDetailsScreen2.U, savingsDetailsScreen2.W), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        xob.q uiState = (xob.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        xob.h hVar = uiState.f307780b;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        boolean z = hVar.f307770a;
        TextLocalisedClause textLocalisedClause = hVar.f307771b;
        if (z) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            navBarWithToolbar.l0();
        }
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(hVar.f307772c);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionClickable(true);
        ((j60.a) this.X.getValue()).d(v.k(this.S, this.T, this.U, this.V));
    }

    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new xni.h(this, continuation, 3), 3);
        RowDelegate rowDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(rowDelegate.f53218h), rd0.e.b(rowDelegate.f53220l), rd0.e.b(this.T.d), rd0.e.b(this.W.f51821c)), null, new g(this, continuation, 11), 3);
        int i = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53225r), null, new c(2, 4, n.class, d(), "onSwitchClick", "onSwitchClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d), null, new woc.p(i, d(), n.class, "onClauseDataClick", "onClauseDataClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.d.f121375b), null, new d(2, 4, n.class, d(), "onLargeButtonClick", "onLargeButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        int i2 = 4;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.d), null, new woc.p(i, d(), n.class, "onClauseDataClick", "onClauseDataClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", i2, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((j60.a) this.X.getValue()).C()), null, new woc.p(i, d(), n.class, "onSubtitleClauseClick", "onSubtitleClauseClick(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$SubtitleClickData;)V", i2, 10), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }
}
