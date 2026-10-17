package com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import e58.d;
import efm.r;
import egb.m0;
import ej6.x;
import ek7.b;
import ek7.c;
import ek7.f;
import ek7.g;
import ek7.j;
import ek7.l;
import ek7.m;
import java.util.List;
import jii.u;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nk7.v;
import rd0.e;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/review_claim/CFACInsuranceReviewClaimScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lek7/m;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/review_claim/CFACInsuranceReviewClaimScreenContract$InputData;", "Lek7/j;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceReviewClaimScreen extends BaseRecyclerViewScreen<m, CFACInsuranceReviewClaimScreenContract$InputData, j> {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75097h0 = {o0.f186429a.j(new h0(CFACInsuranceReviewClaimScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75098a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f75099b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f75100d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f75101e0;
    public final Object f0;
    public final Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACInsuranceReviewClaimScreen(CFACInsuranceReviewClaimScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = true;
        this.W = s.t(this, b.f);
        this.X = w.y0(new d(this, inputData, 23));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: ek7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceReviewClaimScreen f126960b;

            {
                this.f126960b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACInsuranceReviewClaimScreen cFACInsuranceReviewClaimScreen = this.f126960b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceReviewClaimScreen.f75097h0;
                        return (l) ((v) cFACInsuranceReviewClaimScreen.X.getValue()).f216735h.get();
                    default:
                        return zhm.v.k((CellDetailsDelegate) cFACInsuranceReviewClaimScreen.Z.getValue(), new CellDetailsNoteDelegate(), new CellDetailsLoadingDelegate(), (InputTextDelegate) cFACInsuranceReviewClaimScreen.f75100d0.getValue(), (ListSubheaderDelegate) cFACInsuranceReviewClaimScreen.f75099b0.getValue(), (RowDelegate) cFACInsuranceReviewClaimScreen.c0.getValue(), (LargeActionButtonDelegate) cFACInsuranceReviewClaimScreen.f75101e0.getValue(), (PlainTextWarningDelegate) cFACInsuranceReviewClaimScreen.f0.getValue());
                }
            }
        });
        this.Z = w.y0(new m0(15));
        this.f75098a0 = w.y0(new m0(16));
        this.f75099b0 = w.y0(new m0(17));
        this.c0 = w.y0(new m0(18));
        this.f75100d0 = w.y0(new m0(19));
        this.f75101e0 = w.y0(new m0(20));
        this.f0 = w.y0(new m0(21));
        final int i2 = 1;
        this.g0 = w.y0(new Function0(this) { // from class: ek7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceReviewClaimScreen f126960b;

            {
                this.f126960b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACInsuranceReviewClaimScreen cFACInsuranceReviewClaimScreen = this.f126960b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceReviewClaimScreen.f75097h0;
                        return (l) ((v) cFACInsuranceReviewClaimScreen.X.getValue()).f216735h.get();
                    default:
                        return zhm.v.k((CellDetailsDelegate) cFACInsuranceReviewClaimScreen.Z.getValue(), new CellDetailsNoteDelegate(), new CellDetailsLoadingDelegate(), (InputTextDelegate) cFACInsuranceReviewClaimScreen.f75100d0.getValue(), (ListSubheaderDelegate) cFACInsuranceReviewClaimScreen.f75099b0.getValue(), (RowDelegate) cFACInsuranceReviewClaimScreen.c0.getValue(), (LargeActionButtonDelegate) cFACInsuranceReviewClaimScreen.f75101e0.getValue(), (PlainTextWarningDelegate) cFACInsuranceReviewClaimScreen.f0.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        m uiState = (m) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f126971b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (v) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, e.b(g3().f174565c.f59410q), null, new c(this, continuation, 1), 3);
        a.g2(this, e.b(g3().f174565c.o.f57403b), null, new c(this, continuation, 2), 3);
        a.g2(this, e.b(g3().f174564b.o), null, new c(this, continuation, 3), 3);
        ?? r72 = this.f75098a0;
        a.g2(this, e.b(((InputChecklistDelegate) r72.getValue()).f52518c), null, new ek7.e(this, null), 3);
        a.g2(this, e.b(((InputTextDelegate) this.f75100d0.getValue()).e.f121375b), null, new f(this, null), 3);
        ?? r06 = this.c0;
        a.g2(this, e.b(w.a0(((RowDelegate) r06.getValue()).f53218h, new x(18))), null, new g(this, null), 3);
        a.g2(this, e.b(((ListSubheaderDelegate) this.f75099b0.getValue()).f52707c), null, new ek7.h(this, null), 3);
        a.g2(this, e.b(((InputChecklistDelegate) r72.getValue()).p()), null, new c(this, continuation, 4), 3);
        r rVarFilter = ((PlainTextWarningDelegate) this.f0.getValue()).d.f121375b.filter(new ej9.s(new x(19), 4));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        a.g2(this, e.b(rVarFilter), null, new c(this, continuation, 0), 3);
        a.g2(this, e.b(w.a0(((RowDelegate) r06.getValue()).f53218h, new x(20))), null, new ea4.d(this, continuation, 23), 3);
        a.g2(this, e.b(((LargeActionButtonDelegate) this.f75101e0.getValue()).d.f121375b), null, new ek7.d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cfac_claim_review_claim_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_claim_review_claim_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(ik7.f.b());
        g3().f174564b.setText(new TextLocalisedClause(R$string.cfac_claim_review_claim_details_action_continue_to_submitting, null, null, 14));
        ((j60.a) ((v) this.X.getValue()).e.get()).d(zhm.v.k((InputChecklistDelegate) this.f75098a0.getValue(), (LargeActionButtonDelegate) this.f75101e0.getValue()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        m uiState = (m) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f126971b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getJ0() {
        return (List) this.g0.getValue();
    }

    public final u g3() {
        ViewBinding value = this.W.getValue(this, f75097h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final l T2() {
        return (l) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
