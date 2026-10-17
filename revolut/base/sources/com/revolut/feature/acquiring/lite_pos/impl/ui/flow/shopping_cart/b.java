package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart;

import c69.v;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.ShoppingCartFlowContract$Step;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.EditCatalogueProductEntryScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.EditCatalogueProductEntryScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.LitePosShoppingCartScreen;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends g implements ce1.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ShoppingCartFlowContract$Step.ShoppingCart f60766t = ShoppingCartFlowContract$Step.ShoppingCart.f60763a;
    public final EmptyFlowState u = EmptyFlowState.f98428a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ShoppingCartFlowContract$Step step = (ShoppingCartFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ShoppingCartFlowContract$Step.ShoppingCart) {
            LitePosShoppingCartScreen litePosShoppingCartScreen = new LitePosShoppingCartScreen();
            v block = new v(this, 29);
            Intrinsics.checkNotNullParameter(block, "block");
            litePosShoppingCartScreen.H = block;
            return litePosShoppingCartScreen;
        }
        if (step instanceof ShoppingCartFlowContract$Step.EditCustomProduct) {
            return new EditCustomProductScreen(new EditCustomProductScreenContract$InputData(((ShoppingCartFlowContract$Step.EditCustomProduct) step).f60762a));
        }
        if (step instanceof ShoppingCartFlowContract$Step.EditCatalogProductEntry) {
            return new EditCatalogueProductEntryScreen(new EditCatalogueProductEntryScreenContract$InputData(((ShoppingCartFlowContract$Step.EditCatalogProductEntry) step).f60761a));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f60766t;
    }
}
