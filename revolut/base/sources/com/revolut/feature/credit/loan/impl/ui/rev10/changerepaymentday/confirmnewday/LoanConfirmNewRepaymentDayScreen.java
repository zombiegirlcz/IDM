package com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import h30.l;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pt4.d;
import q65.b;
import q65.c;
import q65.f;
import q65.i;
import rd0.e;
import te0.w;
import tx0.j0;
import u45.m;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/confirmnewday/LoanConfirmNewRepaymentDayScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lq65/i;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/confirmnewday/LoanConfirmNewRepaymentDayScreenContract$InputData;", "Laii/q;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanConfirmNewRepaymentDayScreen extends BaseRecyclerViewScreen<i, LoanConfirmNewRepaymentDayScreenContract$InputData, q> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f70398d0 = {o0.f186429a.j(new h0(LoanConfirmNewRepaymentDayScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h U;
    public final boolean V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f70399a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f70400b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanConfirmNewRepaymentDayScreen(LoanConfirmNewRepaymentDayScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = true;
        this.W = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: q65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanConfirmNewRepaymentDayScreen f242492b;

            {
                this.f242492b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanConfirmNewRepaymentDayScreen loanConfirmNewRepaymentDayScreen = this.f242492b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanConfirmNewRepaymentDayScreen.f70398d0;
                        return (h) ((u45.m) loanConfirmNewRepaymentDayScreen.Y.getValue()).f277176g.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanConfirmNewRepaymentDayScreen.f70398d0;
                        return v.k(new RowDelegate(null, null, 7), (CellDetailsDelegate) loanConfirmNewRepaymentDayScreen.f70400b0.getValue(), new ListSubheaderDelegate(), new HeaderLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) loanConfirmNewRepaymentDayScreen.f70399a0.getValue(), new TextDelegate());
                }
            }
        });
        this.Y = w.y0(new d(this, inputData, 23));
        this.Z = w.y0(new q50.w(5));
        this.f70399a0 = w.y0(new q50.w(6));
        this.f70400b0 = w.y0(new q50.w(7));
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: q65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanConfirmNewRepaymentDayScreen f242492b;

            {
                this.f242492b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanConfirmNewRepaymentDayScreen loanConfirmNewRepaymentDayScreen = this.f242492b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanConfirmNewRepaymentDayScreen.f70398d0;
                        return (h) ((u45.m) loanConfirmNewRepaymentDayScreen.Y.getValue()).f277176g.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanConfirmNewRepaymentDayScreen.f70398d0;
                        return v.k(new RowDelegate(null, null, 7), (CellDetailsDelegate) loanConfirmNewRepaymentDayScreen.f70400b0.getValue(), new ListSubheaderDelegate(), new HeaderLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) loanConfirmNewRepaymentDayScreen.f70399a0.getValue(), new TextDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (m) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (q65.h) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, e.b(h3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        a.g2(this, e.b(h3().f174564b.o), null, new c(this, continuation, 1), 3);
        a.g2(this, e.b(((FullScreenStateDelegate) this.f70399a0.getValue()).f52371h.f121375b), null, new q65.d(this, null), 3);
        a.g2(this, e.b(((LargeActionButtonDelegate) this.Z.getValue()).d.f121375b), null, new q65.e(this, null), 3);
        ?? r56 = this.f70400b0;
        a.g2(this, l.y(((CellDetailsDelegate) r56.getValue()).e, ((CellDetailsDelegate) r56.getValue()).d, "merge(...)"), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174564b.setText(new TextLocalisedClause(R$string.loan_management_confirm_button_title, null, null, 14));
        h3().f174564b.setVisibility(8);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((m) this.Y.getValue()).d.get()).d(u.c((LargeActionButtonDelegate) this.Z.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF72097a0() {
        return (List) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = h3().f174564b;
        boolean z = uiState.d;
        TextLocalisedClause textLocalisedClause = uiState.f242497b;
        largeActionButton.setVisibility(z ? 0 : 8);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(uiState.f242498c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    public final jii.u h3() {
        ViewBinding value = this.U.getValue(this, f70398d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
