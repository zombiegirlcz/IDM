package com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginRecyclerViewScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import dw3.y;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import y4f.c;
import y54.a;
import y54.d;
import y54.g;
import y54.j;
import y54.k;
import y54.l;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/screen/city/BirthCityScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Ly54/k;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/screen/city/BirthCityScreenContract$InputData;", "Ly54/g;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BirthCityScreen extends PluginRecyclerViewScreen<k, BirthCityScreenContract$InputData, g> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f67177b0 = {o0.f186429a.j(new h0(BirthCityScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f67178a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthCityScreen(BirthCityScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.V = s.t(this, a.f);
        this.W = R$layout.screen_recycler_navbar_nextbutton;
        this.X = w.y0(new y1a.a(this, inputData, 6));
        this.Y = w.y0(new xge.h(this, 25));
        Lazy lazyY0 = w.y0(new c(5));
        this.Z = lazyY0;
        this.f67178a0 = u.c((InputTextDelegate) lazyY0.getValue());
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((l) T2()).v2(g.a.f310984a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (y) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59410q), null, new y54.b(this, null, 0), 3);
        ?? r56 = this.Z;
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) r56.getValue()).f52575g.f121375b), null, new y54.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) r56.getValue()).f52577j.f121375b), null, new y54.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174564b.o), null, new y54.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.birth_place_country_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        h3().f174564b.setText(new TextLocalisedClause(R$string.birth_place_city_button, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF67178a0() {
        return this.f67178a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(k uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f310989c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        h3().f174564b.setEnabled(uiState.f310988b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    public final jii.u h3() {
        ViewBinding value = this.V.getValue(this, f67177b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final j T2() {
        return (j) this.Y.getValue();
    }
}
