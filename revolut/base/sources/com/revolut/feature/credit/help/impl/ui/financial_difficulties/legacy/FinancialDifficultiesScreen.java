package com.revolut.feature.credit.help.impl.ui.financial_difficulties.legacy;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import i15.f;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r0e.c;
import r15.a;
import r15.b;
import r15.d;
import r15.i;
import r15.j;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/help/impl/ui/financial_difficulties/legacy/FinancialDifficultiesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lr15/j;", "Lcom/revolut/feature/credit/help/impl/ui/financial_difficulties/legacy/FinancialDifficultiesScreenContract$InputData;", "Laii/q;", "feature_credit_help_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FinancialDifficultiesScreen extends BaseRecyclerViewScreen<j, FinancialDifficultiesScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(FinancialDifficultiesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final Object W;
    public final PlainTextWarningDelegate X;
    public final FullScreenStateDelegate Y;
    public final List Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f70007a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final h f70008b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialDifficultiesScreen(FinancialDifficultiesScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = w.y0(new a(this, inputData));
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.X = plainTextWarningDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Y = fullScreenStateDelegate;
        this.Z = v.k(plainTextWarningDelegate, fullScreenStateDelegate, new PlainTextLoadingDelegate());
        this.f70007a0 = w.y0(new a(this));
        this.f70008b0 = s.t(this, b.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.f70007a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new c(this, continuation, 2), 3);
        PlainTextWarningDelegate plainTextWarningDelegate = this.X;
        com.revolut.kompot.navigable.a.g2(this, e.b(plainTextWarningDelegate.d.f121375b), null, new r15.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(plainTextWarningDelegate.s()), null, new r15.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.f52371h.f121375b), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f250908b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.f70008b0.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
