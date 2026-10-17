package kd1;

import aii.u;
import com.revolut.feature.acquiring.lite_pos.api.navigation.CatalogueManagementFlowDestination;
import com.revolut.feature.acquiring.lite_pos.api.navigation.LitePosFlowDestination;
import com.revolut.feature.acquiring.lite_pos.api.navigation.ManageTaxRatesFlowDestination;
import com.revolut.feature.acquiring.lite_pos.api.navigation.ShareReceiptDestination;
import com.revolut.feature.acquiring.lite_pos.impl.navigation.CatalogueDetailsDestination;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates.ManageTaxRatesFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlowContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlowContract$Step;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt.ReceiptScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt.ReceiptScreenContract$InputData;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ShareReceiptDestination) {
            return new ReceiptScreen(new ReceiptScreenContract$InputData(((ShareReceiptDestination) destination).getF60705a()));
        }
        if (destination instanceof LitePosFlowDestination) {
            LitePosFlowDestination litePosFlowDestination = (LitePosFlowDestination) destination;
            if (litePosFlowDestination.equals(LitePosFlowDestination.LitePos.f60699b) || litePosFlowDestination.equals(LitePosFlowDestination.LitePosBridge.f60700b)) {
                return new LitePosRootFlow(new LitePosRootFlowContract$InputData(LitePosRootFlowContract$Step.LitePos.f60757a));
            }
            if (litePosFlowDestination.equals(LitePosFlowDestination.CatalogueSinglePick.f60698b)) {
                return new LitePosRootFlow(new LitePosRootFlowContract$InputData(LitePosRootFlowContract$Step.CatalogueSinglePick.f60756a));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.f(destination, CatalogueManagementFlowDestination.f60697b)) {
            return new LitePosRootFlow(new LitePosRootFlowContract$InputData(LitePosRootFlowContract$Step.CatalogueManagement.f60753a));
        }
        if (destination instanceof CatalogueDetailsDestination.AddProductDestination) {
            return new LitePosRootFlow(new LitePosRootFlowContract$InputData(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((CatalogueDetailsDestination.AddProductDestination) destination).getF60706b(), 1)));
        }
        if (destination instanceof CatalogueDetailsDestination.CreateCategoryDestination) {
            return new LitePosRootFlow(new LitePosRootFlowContract$InputData(new LitePosRootFlowContract$Step.CatalogueCategoryDetails(0)));
        }
        if (destination instanceof CatalogueDetailsDestination.EditCategoryDestination) {
            return new LitePosRootFlow(new LitePosRootFlowContract$InputData(new LitePosRootFlowContract$Step.CatalogueCategoryDetails(((CatalogueDetailsDestination.EditCategoryDestination) destination).getF60708b())));
        }
        if (destination instanceof CatalogueDetailsDestination.EditProductDestination) {
            return new LitePosRootFlow(new LitePosRootFlowContract$InputData(new LitePosRootFlowContract$Step.CatalogueProductDetails(((CatalogueDetailsDestination.EditProductDestination) destination).getF60709b(), null, 2)));
        }
        if (destination instanceof ManageTaxRatesFlowDestination) {
            return new ManageTaxRatesFlow();
        }
        return null;
    }
}
