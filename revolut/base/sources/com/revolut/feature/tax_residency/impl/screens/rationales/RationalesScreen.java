package com.revolut.feature.tax_residency.impl.screens.rationales;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.screens.rationales.RationalesScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pe2.c;
import pni.a;
import poe.b;
import poe.g;
import poe.i;
import poe.j;
import rd0.e;
import te0.w;
import vc.s;
import vkm.d;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/screens/rationales/RationalesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpoe/i;", "Lcom/revolut/feature/tax_residency/impl/screens/rationales/RationalesScreenContract$InputData;", "Lpoe/g;", "Lno/m;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RationalesScreen extends BaseRecyclerViewScreen<i, RationalesScreenContract$InputData, g> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(RationalesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InputChecklistDelegate f90102a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final h f90103b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RationalesScreen(RationalesScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = w.y0(new c(this, inputData, 20));
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: poe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RationalesScreen f237963b;

            {
                this.f237963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RationalesScreen rationalesScreen = this.f237963b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RationalesScreen.c0;
                        return (h) ((ine.h) rationalesScreen.V.getValue()).f162857c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RationalesScreen.c0;
                        qji.c cVarZ2 = rationalesScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                    default:
                        KProperty[] kPropertyArr3 = RationalesScreen.c0;
                        return v.k((FullScreenStateDelegate) rationalesScreen.Z.getValue(), new PlaceholderRowDelegate(), new RowLoadingDelegate(), rationalesScreen.f90102a0);
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: poe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RationalesScreen f237963b;

            {
                this.f237963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RationalesScreen rationalesScreen = this.f237963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RationalesScreen.c0;
                        return (h) ((ine.h) rationalesScreen.V.getValue()).f162857c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RationalesScreen.c0;
                        qji.c cVarZ2 = rationalesScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                    default:
                        KProperty[] kPropertyArr3 = RationalesScreen.c0;
                        return v.k((FullScreenStateDelegate) rationalesScreen.Z.getValue(), new PlaceholderRowDelegate(), new RowLoadingDelegate(), rationalesScreen.f90102a0);
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: poe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RationalesScreen f237963b;

            {
                this.f237963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RationalesScreen rationalesScreen = this.f237963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RationalesScreen.c0;
                        return (h) ((ine.h) rationalesScreen.V.getValue()).f162857c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RationalesScreen.c0;
                        qji.c cVarZ2 = rationalesScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                    default:
                        KProperty[] kPropertyArr3 = RationalesScreen.c0;
                        return v.k((FullScreenStateDelegate) rationalesScreen.Z.getValue(), new PlaceholderRowDelegate(), new RowLoadingDelegate(), rationalesScreen.f90102a0);
                }
            }
        });
        this.Z = w.y0(new a(2));
        this.f90102a0 = new InputChecklistDelegate();
        this.f90103b0 = s.t(this, b.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        i uiState = (i) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f237968b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return (AnalyticsProduct) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (ine.h) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (poe.h) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174565c.f59410q), null, new poe.c(this, continuation, 0), 3);
        d dVarB = e.b(this.f90102a0.f52518c);
        ?? r06 = this.W;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new poe.d(2, 4, poe.h.class, (poe.h) r06.getValue(), "onInputChecklistClick", "onInputChecklistClick(Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174564b.o), null, new poe.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.Z.getValue()).f52371h.f121375b), null, new poe.e(2, 4, poe.h.class, (poe.h) r06.getValue(), "onFullScreenMainActionClick", "onFullScreenMainActionClick(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        j jVar = (j) ((poe.h) this.W.getValue());
        int i = R$string.tax_residency_reasonableness_title_tin_missing;
        RationalesScreenContract$InputData rationalesScreenContract$InputData = jVar.f237970q;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause(rationalesScreenContract$InputData.f90105b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.tax_residency_reasonableness_description_tin_missing, v.k(new TextClause(rationalesScreenContract$InputData.f90105b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CountryClause(rationalesScreenContract$InputData.f90104a, null)), null, 12);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(textLocalisedClause2);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = g3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.tax_residency_common_action_continue, null, null, 14));
        largeActionButton.setLoadingButtonTag("PRIMARY_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        i uiState = (i) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f237968b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF86255b0() {
        return (List) this.Y.getValue();
    }

    public final jii.u g3() {
        ViewBinding value = this.f90103b0.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }
}
