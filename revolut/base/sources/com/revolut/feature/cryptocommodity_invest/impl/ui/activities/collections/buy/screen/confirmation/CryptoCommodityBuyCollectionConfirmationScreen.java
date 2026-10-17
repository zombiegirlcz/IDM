package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.impl.R$id;
import com.revolut.feature.cryptocommodity_invest.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import dgg.b;
import dx5.a;
import dx5.c;
import dx5.d;
import dx5.f;
import dx5.g;
import dx5.h;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mw5.i;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/screen/confirmation/CryptoCommodityBuyCollectionConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ldx5/h;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/screen/confirmation/CryptoCommodityBuyCollectionConfirmationScreenContract$InputData;", "Ldx5/f;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoCommodityBuyCollectionConfirmationScreen extends BaseRecyclerViewScreen<h, CryptoCommodityBuyCollectionConfirmationScreenContract$InputData, f> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f71545b0 = {o0.f186429a.j(new h0(CryptoCommodityBuyCollectionConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/cryptocommodity_invest/impl/databinding/ScreenCryptoCommodityBuyCollectionConfirmationBinding;", 0))};
    public final int U;
    public final int V;
    public final ao.h W;
    public final Object X;
    public final Object Y;
    public final CellDetailsActionDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f71546a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCommodityBuyCollectionConfirmationScreen(CryptoCommodityBuyCollectionConfirmationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_crypto_commodity_buy_collection_confirmation;
        this.V = R$id.confirmationScreen_recyclerView;
        this.W = s.t(this, a.f);
        this.X = w.y0(new b(this, inputData, 21));
        this.Y = w.y0(new d8e.a(this, 20));
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.Z = cellDetailsActionDelegate;
        this.f71546a0 = v.k(new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new CellDetailsDelegate(), cellDetailsActionDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (i) this.X.getValue();
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
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b((ihm.f) h3().f178936c.f59406n.f258290b), null, new dx5.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f178936c.f59410q), null, new c(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f178935b.f), null, new c(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f178935b.e), null, new dx5.b(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.d), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f178936c;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getX() {
        return this.f71546a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getY() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f178936c;
        Image image = uiState.f120878c;
        MoneyClause moneyClause = uiState.f120876a;
        if (image != null) {
            navBarWithToolbar.setEndIconImage(image);
        }
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionText(uiState.f120877b);
        Clause clause = uiState.e;
        if (clause != null) {
            navBarWithToolbar.setHeaderDisclaimerSticky(clause);
        }
        h3().f178935b.setModel(new aw0.e(false, uiState.f, null, new n6(new TextLocalisedClause(R$string.cryptocommodity_invest_collections_confirmation_screen_button_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, uiState.d, null, null, 988), null, null, 53));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final jw5.d h3() {
        ViewBinding value = this.W.getValue(this, f71545b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jw5.d) value;
    }
}
