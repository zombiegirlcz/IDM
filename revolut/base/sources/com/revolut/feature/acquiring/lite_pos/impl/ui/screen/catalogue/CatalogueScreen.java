package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import g85.f;
import ge1.e;
import jd1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ofm.q;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/catalogue/CatalogueScreen;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/catalogue/CatalogueEmbeddedScreen;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CatalogueScreen extends CatalogueEmbeddedScreen {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CatalogueScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenCatalogueNavBarBinding;", 0))};
    public final int T;
    public final h U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueScreen(CatalogueScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.T = R$layout.screen_catalogue_nav_bar;
        this.U = s.t(this, e.f);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.U.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((c) value).f172913b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.product_catalogue_common_title_items, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
    }

    @Override // com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueEmbeddedScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        ViewBinding value = this.U.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((c) value).f172913b.f59410q), new f(this, null, 8), 3);
    }

    @Override // com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueEmbeddedScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.T;
    }
}
