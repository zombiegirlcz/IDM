package com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ik7.f;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nk7.o;
import rd0.e;
import te0.w;
import tx0.j0;
import u9a.b;
import uj7.a;
import uj7.c;
import uj7.d;
import uj7.h;
import uj7.i;
import uj7.j;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/exact_reason/CFACInsuranceExactReasonScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Luj7/i;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/exact_reason/CFACInsuranceExactReasonScreenContract$InputData;", "Luj7/h;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceExactReasonScreen extends BaseRecyclerViewScreen<i, CFACInsuranceExactReasonScreenContract$InputData, h> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CFACInsuranceExactReasonScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final ao.h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75069a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f75070b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACInsuranceExactReasonScreen(CFACInsuranceExactReasonScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, c.f);
        this.X = w.y0(new a(this, inputData, 0));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: uj7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceExactReasonScreen f280522b;

            {
                this.f280522b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACInsuranceExactReasonScreen cFACInsuranceExactReasonScreen = this.f280522b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceExactReasonScreen.c0;
                        return (j) ((o) cFACInsuranceExactReasonScreen.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceExactReasonScreen.c0;
                        return v.k((CellDetailsChevronDelegate) cFACInsuranceExactReasonScreen.Z.getValue(), (ActionWidgetDelegate) cFACInsuranceExactReasonScreen.f75069a0.getValue(), new CellDetailsDelegate(), new RowDelegate(null, null, 7));
                }
            }
        });
        this.Z = w.y0(new b(26));
        this.f75069a0 = w.y0(new b(27));
        final int i2 = 1;
        this.f75070b0 = w.y0(new Function0(this) { // from class: uj7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceExactReasonScreen f280522b;

            {
                this.f280522b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACInsuranceExactReasonScreen cFACInsuranceExactReasonScreen = this.f280522b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceExactReasonScreen.c0;
                        return (j) ((o) cFACInsuranceExactReasonScreen.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceExactReasonScreen.c0;
                        return v.k((CellDetailsChevronDelegate) cFACInsuranceExactReasonScreen.Z.getValue(), (ActionWidgetDelegate) cFACInsuranceExactReasonScreen.f75069a0.getValue(), new CellDetailsDelegate(), new RowDelegate(null, null, 7));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (o) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174539b.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174539b.o.f57403b), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((CellDetailsChevronDelegate) this.Z.getValue()).f51821c, new uj6.v(1))), null, new uf0.d(this, null, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ActionWidgetDelegate) this.f75069a0.getValue()).f51589c.f121375b), null, new d(this, null, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        CFACInsuranceExactReasonScreenContract$InputData cFACInsuranceExactReasonScreenContract$InputData = (CFACInsuranceExactReasonScreenContract$InputData) this.G;
        navBarWithToolbar.setToolbarTitle(new TextClause(cFACInsuranceExactReasonScreenContract$InputData.f75071a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setTitle(new TextClause(cFACInsuranceExactReasonScreenContract$InputData.f75071a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(f.b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f75070b0.getValue();
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
