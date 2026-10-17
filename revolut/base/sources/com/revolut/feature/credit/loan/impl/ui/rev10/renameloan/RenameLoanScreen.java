package com.revolut.feature.credit.loan.impl.ui.rev10.renameloan;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.renameloan.RenameLoanScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ot1.p;
import p0l.a;
import p75.b;
import p75.c;
import p75.d;
import p75.f;
import rd0.e;
import te0.w;
import tx0.j0;
import u45.s0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/renameloan/RenameLoanScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lp75/f;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/renameloan/RenameLoanScreenContract$InputData;", "Laii/q;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RenameLoanScreen extends BaseRecyclerViewScreen<f, RenameLoanScreenContract$InputData, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f70484b0 = {o0.f186429a.j(new h0(RenameLoanScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object U;
    public final h V;
    public final boolean W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f70485a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenameLoanScreen(RenameLoanScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new a(22));
        this.V = s.t(this, b.f);
        this.W = true;
        this.X = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: p75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RenameLoanScreen f233549b;

            {
                this.f233549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RenameLoanScreen renameLoanScreen = this.f233549b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RenameLoanScreen.f70484b0;
                        return (h) ((s0) renameLoanScreen.f70485a0.getValue()).f277217c.get();
                    default:
                        KProperty[] kPropertyArr2 = RenameLoanScreen.f70484b0;
                        return u.c((InputTextDelegate) renameLoanScreen.U.getValue());
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: p75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RenameLoanScreen f233549b;

            {
                this.f233549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RenameLoanScreen renameLoanScreen = this.f233549b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RenameLoanScreen.f70484b0;
                        return (h) ((s0) renameLoanScreen.f70485a0.getValue()).f277217c.get();
                    default:
                        KProperty[] kPropertyArr2 = RenameLoanScreen.f70484b0;
                        return u.c((InputTextDelegate) renameLoanScreen.U.getValue());
                }
            }
        });
        this.f70485a0 = w.y0(new p(this, inputData, 19));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        f uiState = (f) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f233553b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (s0) this.f70485a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (p75.h) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) this.U.getValue()).e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174564b.o), null, new c(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.loan_rename_loan_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.loan_rename_loan_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        g3().f174564b.setText(new TextLocalisedClause(R$string.loan_rename_loan_action, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        f uiState = (f) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f233553b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.Z.getValue();
    }

    public final jii.u g3() {
        ViewBinding value = this.V.getValue(this, f70484b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
