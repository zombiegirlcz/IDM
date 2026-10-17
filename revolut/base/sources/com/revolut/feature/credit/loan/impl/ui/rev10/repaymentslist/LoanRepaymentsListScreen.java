package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.R$id;
import com.revolut.feature.credit.loan.impl.R$layout;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mc9.n;
import mx0.jc;
import mzb.e;
import n08.b;
import n85.c;
import n85.d;
import n85.g;
import n85.h;
import te0.w;
import u45.f0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentslist/LoanRepaymentsListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ln85/h;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentslist/LoanRepaymentsListScreenContract$InputData;", "Laii/q;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanRepaymentsListScreen extends BaseRecyclerViewScreen<h, LoanRepaymentsListScreenContract$InputData, q> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f70576e0 = {o0.f186429a.j(new h0(LoanRepaymentsListScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/loan/impl/databinding/ScreenRepaymentsListBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f70577a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f70578b0;
    public final ao.h c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f70579d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanRepaymentsListScreen(LoanRepaymentsListScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_repayments_list;
        this.V = R$id.repaymentsListScreen_recyclerView;
        this.W = true;
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: n85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentsListScreen f213204b;

            {
                this.f213204b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanRepaymentsListScreen loanRepaymentsListScreen = this.f213204b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentsListScreen.f70576e0;
                        return (g) ((f0) loanRepaymentsListScreen.Y.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentsListScreen.f70576e0;
                        return v.k((RowDelegate) loanRepaymentsListScreen.f70577a0.getValue(), (FullScreenStateDelegate) loanRepaymentsListScreen.f70578b0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate());
                    default:
                        KProperty[] kPropertyArr3 = LoanRepaymentsListScreen.f70576e0;
                        return (t60.b) ((f0) loanRepaymentsListScreen.Y.getValue()).f277116c.get();
                }
            }
        });
        this.Y = w.y0(new e(this, inputData, 14));
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: n85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentsListScreen f213204b;

            {
                this.f213204b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanRepaymentsListScreen loanRepaymentsListScreen = this.f213204b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentsListScreen.f70576e0;
                        return (g) ((f0) loanRepaymentsListScreen.Y.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentsListScreen.f70576e0;
                        return v.k((RowDelegate) loanRepaymentsListScreen.f70577a0.getValue(), (FullScreenStateDelegate) loanRepaymentsListScreen.f70578b0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate());
                    default:
                        KProperty[] kPropertyArr3 = LoanRepaymentsListScreen.f70576e0;
                        return (t60.b) ((f0) loanRepaymentsListScreen.Y.getValue()).f277116c.get();
                }
            }
        });
        this.f70577a0 = w.y0(new b(29));
        this.f70578b0 = w.y0(new n85.b(0));
        this.c0 = s.t(this, c.f);
        final int i3 = 2;
        this.f70579d0 = w.y0(new Function0(this) { // from class: n85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentsListScreen f213204b;

            {
                this.f213204b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanRepaymentsListScreen loanRepaymentsListScreen = this.f213204b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentsListScreen.f70576e0;
                        return (g) ((f0) loanRepaymentsListScreen.Y.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentsListScreen.f70576e0;
                        return v.k((RowDelegate) loanRepaymentsListScreen.f70577a0.getValue(), (FullScreenStateDelegate) loanRepaymentsListScreen.f70578b0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate());
                    default:
                        KProperty[] kPropertyArr3 = LoanRepaymentsListScreen.f70576e0;
                        return (t60.b) ((f0) loanRepaymentsListScreen.Y.getValue()).f277116c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f0) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, rd0.e.b(h3().f259773c.f59410q), null, new mta.c(this, continuation, 20), 3);
        a.g2(this, rd0.e.b(h3().f259772b.f58882b), null, new d(this, continuation, 0), 3);
        a.g2(this, rd0.e.b(((t60.g) ((t60.b) this.f70579d0.getValue())).R()), null, new n(2, (g) this.X.getValue(), g.class, "onListVisibilityUpdated", "onListVisibilityUpdated(Lcom/revolut/controller_extensions/recyclerscroll/ListVisibilityState;)V", 4, 22), 3);
        a.g2(this, vkm.q.J(rd0.e.b(((RowDelegate) this.f70577a0.getValue()).f53218h), rd0.e.b(((FullScreenStateDelegate) this.f70578b0.getValue()).f52371h.f121375b)), null, new d(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f259773c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_loan_repayments_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        h3().e.post(new kt0.d(this, 27));
        h3().f259772b.setTabsGravity(jc.RIGHT);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF86733d0() {
        return (List) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        Tabs repaymentsListScreenMonthTabs = h3().f259772b;
        Intrinsics.checkNotNullExpressionValue(repaymentsListScreenMonthTabs, "repaymentsListScreenMonthTabs");
        Tabs.setItems$default(repaymentsListScreenMonthTabs, uiState.f213212b, null, 2, null);
        String str = uiState.f213213c;
        if (str != null) {
            Tabs repaymentsListScreenMonthTabs2 = h3().f259772b;
            Intrinsics.checkNotNullExpressionValue(repaymentsListScreenMonthTabs2, "repaymentsListScreenMonthTabs");
            Tabs.u(repaymentsListScreenMonthTabs2, str, false, false, false, 14);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final s45.a h3() {
        ViewBinding value = this.c0.getValue(this, f70576e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (s45.a) value;
    }

    public final void i3() {
        h3().e.a(h3().f259773c.getExpandRatio() == BitmapDescriptorFactory.HUE_RED && h3().f259772b.getVisibility() == 0);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
