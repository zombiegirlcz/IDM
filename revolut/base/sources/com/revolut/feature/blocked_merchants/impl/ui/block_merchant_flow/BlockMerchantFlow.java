package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow;

import com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantFlowInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tr2.i;
import yff.b;
import yq0.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/BlockMerchantFlowContract$Step;", "Lcom/revolut/feature/blocked_merchants/api/navigation/BlockMerchantFlowInput;", "Llr2/a;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockMerchantFlow extends BaseFlow<BlockMerchantFlowContract$Step, BlockMerchantFlowInput, lr2.a> {
    public final int P;
    public final int Q;
    public final Object R;
    public final boolean S;
    public final Object T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockMerchantFlow(BlockMerchantFlowInput inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        boolean z = inputData instanceof BlockMerchantFlowInput.BlockMerchant;
        this.P = (z && ((BlockMerchantFlowInput.BlockMerchant) inputData).f64214b) ? R$layout.screen_transparent : com.revolut.kompot.R$layout.base_flow_container;
        this.Q = (z && ((BlockMerchantFlowInput.BlockMerchant) inputData).f64214b) ? R$id.screen_transparent_container : com.revolut.kompot.R$id.container;
        this.R = w.y0(new e(this, 3));
        this.S = true;
        this.T = w.y0(new b(this, inputData, 18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (i) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (i) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (yr2.a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        BlockMerchantFlowContract$Step step = (BlockMerchantFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.S);
    }
}
