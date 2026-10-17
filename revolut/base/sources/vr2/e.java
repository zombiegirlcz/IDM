package vr2;

import aii.u;
import com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantDisallowedDestination;
import com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantFlowInput;
import com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantTransactionFlowDestination;
import com.revolut.feature.blocked_merchants.api.navigation.BlockedMerchantsListFlowDestination;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.BlockMerchantFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return jr2.a.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BlockMerchantTransactionFlowDestination) {
            return new BlockMerchantFlow(new BlockMerchantFlowInput.BlockMerchant(((BlockMerchantTransactionFlowDestination.InputData) ((BlockMerchantTransactionFlowDestination) destination).f98300a).getF64217a(), true));
        }
        if (destination instanceof BlockedMerchantsListFlowDestination) {
            return new BlockMerchantFlow(new BlockMerchantFlowInput.BlockedPaymentsList(((BlockedMerchantsListFlowDestination) destination).getF64218b()));
        }
        if (!(destination instanceof BlockMerchantDisallowedDestination)) {
            return null;
        }
        BlockMerchantDisallowedDestination blockMerchantDisallowedDestination = (BlockMerchantDisallowedDestination) destination;
        return new BlockMerchantFlow(new BlockMerchantFlowInput.BlockDisallowed(blockMerchantDisallowedDestination.getF64207a(), blockMerchantDisallowedDestination.getF64208b(), blockMerchantDisallowedDestination.getF64209c()));
    }
}
