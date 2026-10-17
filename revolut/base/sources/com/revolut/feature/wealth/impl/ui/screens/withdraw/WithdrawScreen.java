package com.revolut.feature.wealth.impl.ui.screens.withdraw;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.impl.R$id;
import com.revolut.feature.wealth.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import t70.x;
import te0.w;
import tx0.e0;
import v0c.b;
import vch.c;
import vch.d;
import vch.f;
import vch.g;
import vch.i;
import vch.s;
import vch.v;
import vch.y;
import vch.z;
import z9h.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/withdraw/WithdrawScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lvch/z;", "Lcom/revolut/feature/wealth/impl/ui/screens/withdraw/WithdrawScreenContract$Input;", "Lvch/s;", "Companion", "a", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WithdrawScreen extends BaseRecyclerViewScreen<z, WithdrawScreenContract$Input, s> {
    public final Object U;
    public final int V;
    public final int W;
    public final h X;
    public final Object Y;
    public final FullScreenStateDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TextDelegate f95648a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f95649b0;
    public final CellDetailsDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final RowDelegate f95650d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final SelectableDelegate f95651e0;
    public final CellDetailsActionDelegate f0;
    public final CellDetailsNoteDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f95647h0 = {o0.f186429a.j(new h0(WithdrawScreen.class, "binding", "getBinding()Lcom/revolut/feature/wealth/impl/databinding/ScreenWealthWithdrawBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawScreen(WithdrawScreenContract$Input inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new b(this, inputData, 26));
        this.V = R$layout.screen_wealth_withdraw;
        this.W = R$id.wealthWithdrawScreen_recyclerView;
        this.X = vc.s.t(this, vch.b.f);
        this.Y = w.y0(new vch.a(this, 0));
        this.Z = new FullScreenStateDelegate();
        this.f95648a0 = new TextDelegate();
        this.f95649b0 = new LargeActionButtonDelegate();
        this.c0 = new CellDetailsDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f95650d0 = rowDelegate;
        this.f95651e0 = new SelectableDelegate(rowDelegate);
        this.f0 = new CellDetailsActionDelegate();
        this.g0 = new CellDetailsNoteDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (l) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f243082c.f59211b), null, new f(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f243082c.d), null, new f(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((j60.a) ((l) this.U.getValue()).f320464g.get()).C()), null, new vch.e(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f95648a0.d), null, new vch.e(this, continuation, 2), 3);
        ?? r06 = this.Y;
        com.revolut.kompot.navigable.a.g2(this, e.b(((CenteredAmountDelegate) r06.getValue()).d.f121375b), null, new vch.e(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((CenteredAmountDelegate) r06.getValue()).e.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f243081b.f), null, new f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f95649b0.d.f121375b), null, new vch.h(2, 4, v.class, T2(), "onDialogActionButtonClick", "onDialogActionButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f52371h.f121375b), null, new i(2, 4, v.class, T2(), "onFullScreenStateMainActionClick", "onFullScreenStateMainActionClick(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.d), null, new c(2, 0, v.class, T2(), "onCellDetailsTitleClick", "onCellDetailsTitleClick(Lcom/revolut/core/ui_kit/delegates/CellDetailsDelegate$Model;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((CenteredAmountDelegate) r06.getValue()).f.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((CenteredAmountDelegate) r06.getValue()).f51967l.f121375b), null, new vch.e(this, continuation, 0), 3);
        view.postDelayed(new x(this, 19), 400L);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        BasicNavBar basicNavBar = h3().f243082c;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        basicNavBar.setTitleClickable(true);
        ((j60.a) ((l) this.U.getValue()).f320464g.get()).d(zhm.v.k(this.f95649b0, this.c0, this.f95650d0, this.f95651e0, this.f0, this.g0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return zhm.v.k((CenteredAmountDelegate) this.Y.getValue(), this.Z, this.f95648a0);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(z uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f243081b.setModel(new aw0.e(false, null, null, new n6(uiState.f287753b, LargeActionButton.ButtonStyle.f58725a, null, null, uiState.f287754c, null, null, 988), null, null, 55));
        BasicNavBar basicNavBar = h3().f243082c;
        y yVar = uiState.d;
        if (yVar instanceof vch.w) {
            vch.w wVar = (vch.w) yVar;
            basicNavBar.setTitle(wVar.f287739a);
            basicNavBar.setSubtitle(wVar.f287740b);
            basicNavBar.o();
            return;
        }
        if (!yVar.equals(vch.x.f287741a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = BasicNavBar.H;
        basicNavBar.u(e0.TITLE_AND_SUBTITLE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final q8h.d h3() {
        ViewBinding value = this.X.getValue(this, f95647h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q8h.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final v T2() {
        return (v) ((l) this.U.getValue()).z.get();
    }
}
