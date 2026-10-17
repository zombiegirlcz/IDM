package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.select;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.impl.R$id;
import com.revolut.feature.cryptocommodity_invest.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import fx5.a;
import fx5.b;
import fx5.c;
import fx5.d;
import fx5.f;
import fx5.g;
import fx5.h;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mw5.k;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/screen/select/CryptoCommodityBuyCollectionSelectCryptoScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lfx5/h;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/screen/select/CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData;", "Lfx5/f;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoCommodityBuyCollectionSelectCryptoScreen extends BaseRecyclerViewScreen<h, CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData, f> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f71548b0 = {o0.f186429a.j(new h0(CryptoCommodityBuyCollectionSelectCryptoScreen.class, "binding", "getBinding()Lcom/revolut/feature/cryptocommodity_invest/impl/databinding/ScreenCryptoCommodityBuyCollectionSelectBinding;", 0))};
    public final int U;
    public final int V;
    public final ao.h W;
    public final Object X;
    public final Object Y;
    public final SelectableDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f71549a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCommodityBuyCollectionSelectCryptoScreen(CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_crypto_commodity_buy_collection_select;
        this.V = R$id.selectScreen_recyclerView;
        this.W = s.t(this, b.f);
        this.X = w.y0(new a(this, inputData, 0));
        this.Y = w.y0(new fp3.a(this, 10));
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        SelectableDelegate selectableDelegate = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.Z = selectableDelegate;
        this.f71549a0 = v.k(new RowDelegate(null, null, 7), new TextDelegate(), selectableDelegate, largeActionButtonDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (k) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.r()), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f178938b.o0()), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f178939c.f59410q), null, new d(this, null, 1), 3);
        h3().f178938b.setSecondaryButtonVisible(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f178939c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cryptocommodity_invest_collections_currencies_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cryptocommodity_invest_collections_currencies_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.cryptocommodity_invest_collections_currencies_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = h3().f178938b;
        twinVerticalButton.setGradientBackgroundEnabled(true);
        Context context = twinVerticalButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        twinVerticalButton.setGradientTint(kli.a.s(R$attr.uikit_colorElevatedGroupedBackground, context));
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF71549a0() {
        return this.f71549a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        if (uiState.f138740a) {
            h3().f178938b.setMainButtonEnabled(true);
            TwinVerticalButton selectScreenButton = h3().f178938b;
            Intrinsics.checkNotNullExpressionValue(selectScreenButton, "selectScreenButton");
            TwinVerticalButton.setDescription$default(selectScreenButton, null, null, null, 6, null);
            h3().f178938b.setSecondaryButtonVisible(false);
        } else {
            h3().f178938b.setMainButtonEnabled(false);
            TwinVerticalButton selectScreenButton2 = h3().f178938b;
            Intrinsics.checkNotNullExpressionValue(selectScreenButton2, "selectScreenButton");
            TwinVerticalButton.setDescription$default(selectScreenButton2, new TextLocalisedClause(R$string.cryptocommodity_invest_collections_currencies_minimum_crypto_footer, null, null, 14), null, null, 6, null);
            h3().f178938b.setSecondaryButtonVisible(false);
        }
        RecyclerView recyclerViewH = h();
        TwinVerticalButton selectScreenButton3 = h3().f178938b;
        Intrinsics.checkNotNullExpressionValue(selectScreenButton3, "selectScreenButton");
        selectScreenButton3.measure(0, 0);
        knm.b.v(selectScreenButton3.getMeasuredHeight(), recyclerViewH);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final jw5.e h3() {
        ViewBinding value = this.W.getValue(this, f71548b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jw5.e) value;
    }
}
