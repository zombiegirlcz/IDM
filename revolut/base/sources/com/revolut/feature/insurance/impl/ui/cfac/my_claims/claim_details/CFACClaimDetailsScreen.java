package com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nk7.c;
import rd0.e;
import re3.d;
import rk7.b;
import rk7.f;
import rk7.g;
import rk7.h;
import rk7.i;
import rk7.j;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/claim_details/CFACClaimDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lrk7/j;", "Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/claim_details/CFACClaimDetailsScreenContract$InputData;", "Lrk7/h;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACClaimDetailsScreen extends BaseRecyclerViewScreen<j, CFACClaimDetailsScreenContract$InputData, h> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75126e0 = {o0.f186429a.j(new h0(CFACClaimDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final ao.h V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75127a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f75128b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f75129d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACClaimDetailsScreen(CFACClaimDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = s.t(this, b.f);
        this.W = true;
        this.X = w.y0(new rgf.b(this, inputData, 5));
        this.Y = w.y0(new d(17));
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: rk7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACClaimDetailsScreen f254751b;

            {
                this.f254751b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACClaimDetailsScreen cFACClaimDetailsScreen = this.f254751b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACClaimDetailsScreen.f75126e0;
                        return (i) ((nk7.c) cFACClaimDetailsScreen.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACClaimDetailsScreen.f75126e0;
                        return v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), (ProgressStepVerticalDelegate) cFACClaimDetailsScreen.f75127a0.getValue(), new ProgressStepVerticalLoadingDelegate(), (PlainTextWarningDelegate) cFACClaimDetailsScreen.c0.getValue(), new PlainTextLoadingDelegate(), (RowDelegate) cFACClaimDetailsScreen.Y.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) cFACClaimDetailsScreen.f75128b0.getValue(), new ListSubheaderLoadingDelegate());
                }
            }
        });
        this.f75127a0 = w.y0(new d(18));
        this.f75128b0 = w.y0(new d(19));
        this.c0 = w.y0(new d(20));
        final int i2 = 1;
        this.f75129d0 = w.y0(new Function0(this) { // from class: rk7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACClaimDetailsScreen f254751b;

            {
                this.f254751b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACClaimDetailsScreen cFACClaimDetailsScreen = this.f254751b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACClaimDetailsScreen.f75126e0;
                        return (i) ((nk7.c) cFACClaimDetailsScreen.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACClaimDetailsScreen.f75126e0;
                        return v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), (ProgressStepVerticalDelegate) cFACClaimDetailsScreen.f75127a0.getValue(), new ProgressStepVerticalLoadingDelegate(), (PlainTextWarningDelegate) cFACClaimDetailsScreen.c0.getValue(), new PlainTextLoadingDelegate(), (RowDelegate) cFACClaimDetailsScreen.Y.getValue(), new RowLoadingDelegate(), (ListSubheaderDelegate) cFACClaimDetailsScreen.f75128b0.getValue(), new ListSubheaderLoadingDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (c) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(h3().f174564b.o), null, new rk7.c(this, null, 0), 3);
        a.g2(this, e.b(h3().f174565c.f59410q), null, new rk7.c(this, null, 1), 3);
        a.g2(this, e.b(w.a0(((ListSubheaderDelegate) this.f75128b0.getValue()).f52707c, new rj7.b(7))), null, new rk7.d(this, null, 0), 3);
        a.g2(this, e.b(w.a0(((RowDelegate) this.Y.getValue()).f53218h, new rj7.b(8))), null, new rk7.d(this, null, 1), 3);
        a.g2(this, e.b(((ProgressStepVerticalDelegate) this.f75127a0.getValue()).f53000c), null, new rk7.c(this, null, 2), 3);
        a.g2(this, e.b(((PlainTextWarningDelegate) this.c0.getValue()).d.f121375b), null, new rk7.c(this, null, 3), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        h3().f174564b.setText(new TextLocalisedClause(R$string.cfac_my_claims_claim_details_button_get_help, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF76094a0() {
        return (List) this.f75129d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g gVar = uiState.f254762b;
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        if (gVar instanceof g.a) {
            navBarWithToolbar.setLoadingVisible(true);
            return;
        }
        if (!(gVar instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        f fVar = (f) gVar;
        Clause clause = fVar.f254756a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setDescriptionText(fVar.f254757b);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setEndIconImage(fVar.d);
        navBarWithToolbar.setEndIconBadgeImage(fVar.f254758c);
        navBarWithToolbar.setLoadingVisible(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final u h3() {
        ViewBinding value = this.V.getValue(this, f75126e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
