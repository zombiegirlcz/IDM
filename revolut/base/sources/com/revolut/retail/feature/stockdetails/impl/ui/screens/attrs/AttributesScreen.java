package com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs.AttributesScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import tjf.p0;
import tml.a;
import tuk.b;
import tuk.c;
import tuk.i;
import tuk.j;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/attrs/AttributesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ltuk/j;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/attrs/AttributesScreenContract$InputData;", "Laii/q;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AttributesScreen extends BaseRecyclerViewScreen<j, AttributesScreenContract$InputData, q> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f103883d0 = {o0.f186429a.j(new h0(AttributesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final boolean U;
    public final int V;
    public final h W;
    public final ListSubheaderDelegate X;
    public final CellDetailsDelegate Y;
    public final TextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f103884a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f103885b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributesScreen(AttributesScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_recycler_navbar;
        this.W = s.t(this, b.f);
        this.X = new ListSubheaderDelegate();
        this.Y = new CellDetailsDelegate();
        this.Z = new TextDelegate();
        final int i = 0;
        this.f103884a0 = w.y0(new Function0(this) { // from class: tuk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AttributesScreen f274621b;

            {
                this.f274621b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AttributesScreen attributesScreen = this.f274621b;
                switch (i2) {
                    case 0:
                        return v.k(attributesScreen.X, attributesScreen.Y, attributesScreen.Z, new RowLoadingDelegate(), new FullScreenStateDelegate());
                    default:
                        KProperty[] kPropertyArr = AttributesScreen.f103883d0;
                        return (i) ((prk.h) attributesScreen.f103885b0.getValue()).f.get();
                }
            }
        });
        this.f103885b0 = w.y0(new a(this, inputData, 16));
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: tuk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AttributesScreen f274621b;

            {
                this.f274621b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AttributesScreen attributesScreen = this.f274621b;
                switch (i22) {
                    case 0:
                        return v.k(attributesScreen.X, attributesScreen.Y, attributesScreen.Z, new RowLoadingDelegate(), new FullScreenStateDelegate());
                    default:
                        KProperty[] kPropertyArr = AttributesScreen.f103883d0;
                        return (i) ((prk.h) attributesScreen.f103885b0.getValue()).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (prk.h) this.f103885b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new p0(this, null, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.d), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.d), null, new tqh.j(this, null, 10), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75642b0() {
        return (List) this.f103884a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        TextLocalisedClause textLocalisedClause = uiState.f274627a;
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        h3().f174539b.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final m h3() {
        ViewBinding value = this.W.getValue(this, f103883d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
