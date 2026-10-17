package com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.CFACClaimExpenseDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nk7.d;
import te0.w;
import vc.s;
import xda.z;
import xfj.a;
import xjl.g;
import xk7.b;
import xk7.c;
import xk7.e;
import xk7.f;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/expense_details/CFACClaimExpenseDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lxk7/f;", "Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/expense_details/CFACClaimExpenseDetailsScreenContract$InputData;", "", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACClaimExpenseDetailsScreen extends BaseRecyclerViewScreen<f, CFACClaimExpenseDetailsScreenContract$InputData, Object> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75139b0 = {o0.f186429a.j(new h0(CFACClaimExpenseDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object U;
    public final Object V;
    public final int W;
    public final h X;
    public final Object Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75140a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACClaimExpenseDetailsScreen(CFACClaimExpenseDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new a(this, inputData, 1));
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: xk7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACClaimExpenseDetailsScreen f306614b;

            {
                this.f306614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACClaimExpenseDetailsScreen cFACClaimExpenseDetailsScreen = this.f306614b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACClaimExpenseDetailsScreen.f75139b0;
                        return (e) ((nk7.d) cFACClaimExpenseDetailsScreen.U.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACClaimExpenseDetailsScreen.f75139b0;
                        return v.k((RowDelegate) cFACClaimExpenseDetailsScreen.Y.getValue(), new CellDetailsDelegate(), new ListSubheaderDelegate());
                }
            }
        });
        this.W = R$layout.screen_recycler_navbar;
        this.X = s.t(this, b.f);
        this.Y = w.y0(new z(29));
        this.Z = true;
        final int i2 = 1;
        this.f75140a0 = w.y0(new Function0(this) { // from class: xk7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACClaimExpenseDetailsScreen f306614b;

            {
                this.f306614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACClaimExpenseDetailsScreen cFACClaimExpenseDetailsScreen = this.f306614b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACClaimExpenseDetailsScreen.f75139b0;
                        return (e) ((nk7.d) cFACClaimExpenseDetailsScreen.U.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACClaimExpenseDetailsScreen.f75139b0;
                        return v.k((RowDelegate) cFACClaimExpenseDetailsScreen.Y.getValue(), new CellDetailsDelegate(), new ListSubheaderDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174539b.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174539b.o.f57403b), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.Y.getValue()).f53218h, new xif.c(13))), null, new g(this, (Continuation) null, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cfac_claim_expense_add_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_claim_expense_add_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(ik7.f.b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF76094a0() {
        return (List) this.f75140a0.getValue();
    }

    public final m g3() {
        ViewBinding value = this.X.getValue(this, f75139b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Z);
    }
}
