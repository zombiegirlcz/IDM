package com.revolut.feature.donations.impl.ui.kompot.screen.collection.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import wp0.b;
import wrj.m;
import x0f.g;
import x5a.d;
import xb6.a;
import xb6.e;
import xb6.f;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/collection/details/CharitiesCollectionDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lxb6/f;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/collection/details/CharitiesCollectionDetailsScreenContract$InputData;", "Lxb6/e;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CharitiesCollectionDetailsScreen extends BaseRecyclerViewScreen<f, CharitiesCollectionDetailsScreenContract$InputData, e> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CharitiesCollectionDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f72077a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f72078b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharitiesCollectionDetailsScreen(CharitiesCollectionDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, a.f);
        this.W = w.y0(new m(this, inputData, 24));
        this.X = w.y0(new b(this, 24));
        Lazy lazyY0 = w.y0(new d(16));
        this.Y = lazyY0;
        Lazy lazyY02 = w.y0(new d(17));
        this.Z = lazyY02;
        this.f72077a0 = v.k((LargeVoucherTileDelegate) lazyY0.getValue(), new LargeVoucherLoadingDelegate(), (FullScreenStateDelegate) lazyY02.getValue());
        this.f72078b0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (pa6.h) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (xb6.h) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new g(this, null, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.Z.getValue()).f52371h.f121375b), null, new xb6.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeVoucherTileDelegate) this.Y.getValue()).d), null, new x64.b(this, null, 12), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF72077a0() {
        return this.f72077a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Clause clause = uiState.f304004b;
        Clause clause2 = uiState.f304005c;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        if (uiState.d) {
            navBarWithToolbar.I0(t3.TWO_LINES, false);
        } else {
            navBarWithToolbar.l0();
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final jii.m h3() {
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f72078b0);
    }
}
