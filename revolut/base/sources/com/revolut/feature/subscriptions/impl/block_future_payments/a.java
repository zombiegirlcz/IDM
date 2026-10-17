package com.revolut.feature.subscriptions.impl.block_future_payments;

import c9e.c;
import com.revolut.feature.blocked_merchants.api.navigation.BlockedMerchantsListFlowDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.subscriptions.impl.block_card_subscription.BlockCardSubscriptionFlow;
import com.revolut.feature.subscriptions.impl.block_card_subscription.BlockCardSubscriptionFlowContract$InputData;
import com.revolut.feature.subscriptions.impl.block_future_payments.BlockFuturePaymentsFlowContract$InputData;
import com.revolut.feature.subscriptions.impl.block_future_payments.BlockFuturePaymentsFlowContract$Step;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreen;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import t9e.h;
import t9e.i;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements r9e.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BlockFuturePaymentsFlowContract$InputData f89177t;
    public final c u;
    public final BlockFuturePaymentsFlowContract$Step.BlockFuturePayments v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BlockFuturePaymentsFlowContract$State f89178w;

    public a(BlockFuturePaymentsFlowContract$InputData inputData, c subscriptionNavigationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        this.f89177t = inputData;
        this.u = subscriptionNavigationProvider;
        this.v = new BlockFuturePaymentsFlowContract$Step.BlockFuturePayments(inputData.f89171a, inputData.f89172b);
        this.f89178w = new BlockFuturePaymentsFlowContract$State(0);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        BlockFuturePaymentsFlowContract$Step step = (BlockFuturePaymentsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BlockFuturePaymentsFlowContract$Step.BlockFuturePayments) {
            BlockFuturePaymentsFlowContract$Step.BlockFuturePayments blockFuturePayments = (BlockFuturePaymentsFlowContract$Step.BlockFuturePayments) step;
            BlockFuturePaymentsScreen blockFuturePaymentsScreen = new BlockFuturePaymentsScreen(new BlockFuturePaymentsScreenContract$InputData(blockFuturePayments.f89174a, blockFuturePayments.f89175b));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: r9e.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.subscriptions.impl.block_future_payments.a f252596b;

                {
                    this.f252596b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            com.revolut.feature.subscriptions.impl.block_future_payments.a aVar = this.f252596b;
                            BlockFuturePaymentsFlowContract$InputData blockFuturePaymentsFlowContract$InputData = aVar.f89177t;
                            h output = (h) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof i) {
                                p pVar = ((i) output).f268988a;
                                if (blockFuturePaymentsFlowContract$InputData.f89172b) {
                                    aVar.l2(new r83.g(aVar, pVar, null, 5), new yi5.b(26));
                                } else {
                                    aVar.I2();
                                }
                            } else {
                                if (!(output instanceof h.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (blockFuturePaymentsFlowContract$InputData.f89172b) {
                                    aVar.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new BlockedMerchantsListFlowDestination(0), false, (Integer) null, 0, 61)))));
                                } else {
                                    aVar.I2();
                                }
                            }
                            return Unit.f186387a;
                        default:
                            j9e.c output2 = (j9e.c) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof j9e.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            p pVar2 = ((j9e.b) output2).f172319a;
                            com.revolut.feature.subscriptions.impl.block_future_payments.a aVar2 = this.f252596b;
                            if (aVar2.f89177t.f89172b) {
                                aVar2.l2(new r83.g(aVar2, pVar2, null, 5), new yi5.b(26));
                            } else {
                                aVar2.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            blockFuturePaymentsScreen.H = function1;
            return blockFuturePaymentsScreen;
        }
        if (!(step instanceof BlockFuturePaymentsFlowContract$Step.BlockSubscription)) {
            throw new NoWhenBranchMatchedException();
        }
        BlockCardSubscriptionFlow blockCardSubscriptionFlow = new BlockCardSubscriptionFlow(new BlockCardSubscriptionFlowContract$InputData(((BlockFuturePaymentsFlowContract$Step.BlockSubscription) step).f89176a));
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: r9e.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.subscriptions.impl.block_future_payments.a f252596b;

            {
                this.f252596b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        com.revolut.feature.subscriptions.impl.block_future_payments.a aVar = this.f252596b;
                        BlockFuturePaymentsFlowContract$InputData blockFuturePaymentsFlowContract$InputData = aVar.f89177t;
                        h output = (h) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (output instanceof i) {
                            p pVar = ((i) output).f268988a;
                            if (blockFuturePaymentsFlowContract$InputData.f89172b) {
                                aVar.l2(new r83.g(aVar, pVar, null, 5), new yi5.b(26));
                            } else {
                                aVar.I2();
                            }
                        } else {
                            if (!(output instanceof h.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (blockFuturePaymentsFlowContract$InputData.f89172b) {
                                aVar.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new BlockedMerchantsListFlowDestination(0), false, (Integer) null, 0, 61)))));
                            } else {
                                aVar.I2();
                            }
                        }
                        return Unit.f186387a;
                    default:
                        j9e.c output2 = (j9e.c) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (!(output2 instanceof j9e.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        p pVar2 = ((j9e.b) output2).f172319a;
                        com.revolut.feature.subscriptions.impl.block_future_payments.a aVar2 = this.f252596b;
                        if (aVar2.f89177t.f89172b) {
                            aVar2.l2(new r83.g(aVar2, pVar2, null, 5), new yi5.b(26));
                        } else {
                            aVar2.I2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        blockCardSubscriptionFlow.J = function12;
        return blockCardSubscriptionFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f89178w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
