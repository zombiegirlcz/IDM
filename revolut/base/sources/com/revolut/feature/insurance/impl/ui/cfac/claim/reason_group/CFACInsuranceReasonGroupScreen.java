package com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cbh.g;
import cf6.a;
import chc.c0;
import cjj.j;
import ck7.c;
import ck7.d;
import ck7.h;
import ck7.i;
import ck7.k;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ik7.f;
import java.math.BigDecimal;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nk7.u;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/reason_group/CFACInsuranceReasonGroupScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lck7/i;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/reason_group/CFACInsuranceReasonGroupScreenContract$InputData;", "Lck7/h;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceReasonGroupScreen extends BaseRecyclerViewScreen<i, CFACInsuranceReasonGroupScreenContract$InputData, h> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CFACInsuranceReasonGroupScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final ao.h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75092a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f75093b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACInsuranceReasonGroupScreen(CFACInsuranceReasonGroupScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, c.f);
        this.X = w.y0(new a(this, inputData, 8));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: ck7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceReasonGroupScreen f24785b;

            {
                this.f24785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACInsuranceReasonGroupScreen cFACInsuranceReasonGroupScreen = this.f24785b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceReasonGroupScreen.c0;
                        return (k) ((u) cFACInsuranceReasonGroupScreen.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceReasonGroupScreen.c0;
                        return v.k((CellDetailsChevronDelegate) cFACInsuranceReasonGroupScreen.Z.getValue(), (ActionWidgetDelegate) cFACInsuranceReasonGroupScreen.f75092a0.getValue(), new CellDetailsDelegate(), new RowDelegate(null, null, 7));
                }
            }
        });
        this.Z = w.y0(new c0(16));
        this.f75092a0 = w.y0(new c0(17));
        final int i2 = 1;
        this.f75093b0 = w.y0(new Function0(this) { // from class: ck7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceReasonGroupScreen f24785b;

            {
                this.f24785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACInsuranceReasonGroupScreen cFACInsuranceReasonGroupScreen = this.f24785b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceReasonGroupScreen.c0;
                        return (k) ((u) cFACInsuranceReasonGroupScreen.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceReasonGroupScreen.c0;
                        return v.k((CellDetailsChevronDelegate) cFACInsuranceReasonGroupScreen.Z.getValue(), (ActionWidgetDelegate) cFACInsuranceReasonGroupScreen.f75092a0.getValue(), new CellDetailsDelegate(), new RowDelegate(null, null, 7));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (u) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (k) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174539b.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174539b.o.f57403b), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((CellDetailsChevronDelegate) this.Z.getValue()).f51821c, new j(5))), null, new g(this, null, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ActionWidgetDelegate) this.f75092a0.getValue()).f51589c.f121375b), null, new d(this, null, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cfac_claim_cancellation_reason_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_claim_cancellation_reason_title, null, null, 14), null);
        CFACInsuranceReasonGroupScreenContract$InputData cFACInsuranceReasonGroupScreenContract$InputData = (CFACInsuranceReasonGroupScreenContract$InputData) this.G;
        CFACReimbursementType cFACReimbursementType = cFACInsuranceReasonGroupScreenContract$InputData.f75095b;
        CFACProductDetails cFACProductDetails = cFACInsuranceReasonGroupScreenContract$InputData.d;
        int i = ck7.b.f24786a[cFACReimbursementType.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.cfac_claim_cancellation_reason_subtitle, zhm.u.c(new PercentageClause(new BigDecimal(cFACProductDetails.e.f75007a), (PercentageClause.Format) null, (Style) null, 6)), null, 12);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.cfac_claim_cancellation_reason_any_subtitle, zhm.u.c(new PercentageClause(new BigDecimal(cFACProductDetails.f.f75007a), (PercentageClause.Format) null, (Style) null, 6)), null, 12);
        }
        navBarWithToolbar.setDescriptionText(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(f.b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f75093b0.getValue();
    }

    public final m g3() {
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
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
