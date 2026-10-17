package com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import re3.d;
import rgf.b;
import rj7.c;
import rj7.f;
import rj7.k;
import rj7.l;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/coverage_info/CFACInsuranceCoverageInfoScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lrj7/l;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/coverage_info/CFACInsuranceCoverageInfoScreenContract$InputData;", "Laii/q;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceCoverageInfoScreen extends BaseRecyclerViewScreen<l, CFACInsuranceCoverageInfoScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CFACInsuranceCoverageInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75064a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f75065b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACInsuranceCoverageInfoScreen(CFACInsuranceCoverageInfoScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = true;
        this.W = s.t(this, c.f);
        this.X = w.y0(new b(this, inputData, 4));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: rj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceCoverageInfoScreen f254615b;

            {
                this.f254615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACInsuranceCoverageInfoScreen cFACInsuranceCoverageInfoScreen = this.f254615b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceCoverageInfoScreen.c0;
                        return (k) ((nk7.l) cFACInsuranceCoverageInfoScreen.X.getValue()).f216695c.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceCoverageInfoScreen.c0;
                        return v.k((RowDelegate) cFACInsuranceCoverageInfoScreen.Z.getValue(), (CellDetailsActionDelegate) cFACInsuranceCoverageInfoScreen.f75064a0.getValue(), new CellDetailsDelegate(), new ListSubheaderDelegate(), new ToDoItemDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate());
                }
            }
        });
        this.Z = w.y0(new d(9));
        this.f75064a0 = w.y0(new d(10));
        final int i2 = 1;
        this.f75065b0 = w.y0(new Function0(this) { // from class: rj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceCoverageInfoScreen f254615b;

            {
                this.f254615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACInsuranceCoverageInfoScreen cFACInsuranceCoverageInfoScreen = this.f254615b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceCoverageInfoScreen.c0;
                        return (k) ((nk7.l) cFACInsuranceCoverageInfoScreen.X.getValue()).f216695c.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceCoverageInfoScreen.c0;
                        return v.k((RowDelegate) cFACInsuranceCoverageInfoScreen.Z.getValue(), (CellDetailsActionDelegate) cFACInsuranceCoverageInfoScreen.f75064a0.getValue(), new CellDetailsDelegate(), new ListSubheaderDelegate(), new ToDoItemDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (nk7.l) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (k) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(g3().f174565c.f59410q), null, new rj7.d(this, null, 0), 3);
        a.g2(this, e.b(g3().f174565c.s0()), null, new rj7.e(this, null), 3);
        a.g2(this, e.b(g3().f174565c.o.f57403b), null, new rj7.d(this, null, 1), 3);
        a.g2(this, e.b(g3().f174564b.o), null, new rj7.d(this, null, 2), 3);
        a.g2(this, e.b(w.a0(((CellDetailsActionDelegate) this.f75064a0.getValue()).d, new rg3.d(29))), null, new f(this, null, 0), 3);
        a.g2(this, e.b(w.a0(((RowDelegate) this.Z.getValue()).f53218h, new rj7.b(0))), null, new f(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cfac_claim_your_coverage_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_claim_your_coverage_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setActions(u.c(new ActionsView.Item("ID_ALL_DOCUMENTS_ACTION", null, false, null, null, new TextLocalisedClause(R$string.cfac_policy_details_action_all_documents, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670)));
        navBarWithToolbar.setMenuItems(ik7.f.b());
        g3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF106400d0() {
        return (List) this.f75065b0.getValue();
    }

    public final jii.u g3() {
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
