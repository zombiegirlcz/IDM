package com.revolut.feature.insurance.impl.ui.cfac.claim.manage_expenses;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.manage_expenses.CFACInsuranceManageExpensesScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import vc.s;
import yh6.y;
import yj7.b;
import yj7.c;
import yj7.d;
import yj7.f;
import yj7.g;
import yj7.h;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/manage_expenses/CFACInsuranceManageExpensesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyj7/h;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/manage_expenses/CFACInsuranceManageExpensesScreenContract$InputData;", "Lyj7/f;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceManageExpensesScreen extends BaseRecyclerViewScreen<h, CFACInsuranceManageExpensesScreenContract$InputData, f> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75087b0 = {o0.f186429a.j(new h0(CFACInsuranceManageExpensesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final ao.h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75088a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACInsuranceManageExpensesScreen(CFACInsuranceManageExpensesScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, b.f);
        this.X = w.y0(new yff.b(this, inputData, 3));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: yj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceManageExpensesScreen f314426b;

            {
                this.f314426b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACInsuranceManageExpensesScreen cFACInsuranceManageExpensesScreen = this.f314426b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceManageExpensesScreen.f75087b0;
                        return (g) ((nk7.s) cFACInsuranceManageExpensesScreen.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceManageExpensesScreen.f75087b0;
                        return u.c((RowDelegate) cFACInsuranceManageExpensesScreen.Z.getValue());
                }
            }
        });
        this.Z = w.y0(new y(15));
        final int i2 = 1;
        this.f75088a0 = w.y0(new Function0(this) { // from class: yj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceManageExpensesScreen f314426b;

            {
                this.f314426b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACInsuranceManageExpensesScreen cFACInsuranceManageExpensesScreen = this.f314426b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceManageExpensesScreen.f75087b0;
                        return (g) ((nk7.s) cFACInsuranceManageExpensesScreen.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceManageExpensesScreen.f75087b0;
                        return u.c((RowDelegate) cFACInsuranceManageExpensesScreen.Z.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (nk7.s) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(g3().f174539b.f59410q), null, new c(this, null, 0), 3);
        a.g2(this, e.b(g3().f174539b.o.f57403b), null, new c(this, null, 1), 3);
        a.g2(this, e.b(((RowDelegate) this.Z.getValue()).f53218h), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cfac_claim_claimed_expenses_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_claim_claimed_expenses_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(ik7.f.b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f75088a0.getValue();
    }

    public final m g3() {
        ViewBinding value = this.W.getValue(this, f75087b0[0]);
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
