package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow;

import aii.q;
import bs2.e;
import com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantFlowInput;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.BlockMerchantFlowContract$Step;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantScreenContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantTransparentScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block_disallowed.MerchantBlockDisallowedController;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block_disallowed.MerchantBlockDisallowedControllerContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreenContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlow;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$Input;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$ScreenType;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FeatureCommand;
import dki.g;
import fs2.e;
import fs2.f;
import fs2.h;
import is2.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kr2.d;
import yj2.b;
import ypd.i;
import zr2.d;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements yr2.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BlockMerchantFlowContract$Step f64238t;
    public final EmptyFlowState u;

    public a(BlockMerchantFlowInput inputData) {
        BlockMerchantFlowContract$Step blockDisallowed;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof BlockMerchantFlowInput.BlockMerchant) {
            BlockMerchantFlowInput.BlockMerchant blockMerchant = (BlockMerchantFlowInput.BlockMerchant) inputData;
            blockDisallowed = new BlockMerchantFlowContract$Step.BlockMerchant(blockMerchant.f64213a, false, blockMerchant.f64214b);
        } else if (inputData instanceof BlockMerchantFlowInput.BlockedPaymentsList) {
            blockDisallowed = new BlockMerchantFlowContract$Step.BlockedPaymentsList(((BlockMerchantFlowInput.BlockedPaymentsList) inputData).f64215a);
        } else {
            if (!(inputData instanceof BlockMerchantFlowInput.BlockDisallowed)) {
                throw new NoWhenBranchMatchedException();
            }
            BlockMerchantFlowInput.BlockDisallowed blockDisallowed2 = (BlockMerchantFlowInput.BlockDisallowed) inputData;
            blockDisallowed = new BlockMerchantFlowContract$Step.BlockDisallowed(blockDisallowed2.f64210a, blockDisallowed2.f64211b, blockDisallowed2.f64212c);
        }
        this.f64238t = blockDisallowed;
        this.u = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        BlockMerchantFlowContract$Step step = (BlockMerchantFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BlockMerchantFlowContract$Step.BlockMerchant) {
            BlockMerchantFlowContract$Step.BlockMerchant blockMerchant = (BlockMerchantFlowContract$Step.BlockMerchant) step;
            d dVar = blockMerchant.f64226a;
            if (!blockMerchant.f64228c) {
                BlockMerchantScreen blockMerchantScreen = new BlockMerchantScreen(new BlockMerchantScreenContract$InputData(dVar, false));
                b bVar = new b(step, this, 25);
                Intrinsics.checkNotNullParameter(bVar, "<set-?>");
                blockMerchantScreen.H = bVar;
                return blockMerchantScreen;
            }
            BlockMerchantTransparentScreen blockMerchantTransparentScreen = new BlockMerchantTransparentScreen(new BlockMerchantScreenContract$InputData(dVar, true));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: yr2.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a f316111b;

                {
                    this.f316111b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            zr2.d output = (zr2.d) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof d.b;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar = this.f316111b;
                            if (!z && !(output instanceof d.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.I2();
                            return Unit.f186387a;
                        case 1:
                            h it8 = (h) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean z3 = it8 instanceof f;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar2 = this.f316111b;
                            if (z3) {
                                f fVar = (f) it8;
                                aVar2.E2(new BlockMerchantFlowContract$Step.BlockedMerchantDetails(fVar.f137557a, fVar.f137558b), true, null, false);
                            } else if (it8 instanceof fs2.d) {
                                aVar2.E2(new BlockMerchantFlowContract$Step.SelectPaymentToBlock(((fs2.d) it8).f137555a, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchant.f64263a), true, null, false);
                            } else if (it8 instanceof e) {
                                aVar2.E2(new BlockMerchantFlowContract$Step.SelectPaymentToBlock(((e) it8).f137556a, SelectPaymentToBlockScreenContract$ScreenType.BlockSubscription.f64265a), true, null, false);
                            } else {
                                if (!(it8 instanceof fs2.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((fs2.g) it8).f137559a.f249314a.f160150a, false, null, 6))));
                            }
                            return Unit.f186387a;
                        case 2:
                            Intrinsics.checkNotNullParameter((q) obj2, "it");
                            this.f316111b.I2();
                            return Unit.f186387a;
                        case 3:
                            is2.g it9 = (is2.g) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            boolean z4 = it9 instanceof is2.h;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar3 = this.f316111b;
                            if (z4) {
                                aVar3.E2(new BlockMerchantFlowContract$Step.BlockMerchant(new kr2.d(((is2.h) it9).f168085a), true, false), true, null, false);
                            } else {
                                if (!(it9 instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.K2(new dki.h((Function1) new i(12), true));
                            }
                            return Unit.f186387a;
                        default:
                            bs2.e it10 = (bs2.e) obj2;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean zF = Intrinsics.f(it10, e.a.f18028a);
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar4 = this.f316111b;
                            if (zF) {
                                aVar4.I2();
                            } else {
                                if (!(it10 instanceof bs2.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar4.C1(new ExternalDestination.Browser(((bs2.f) it10).f18029a, null));
                                aVar4.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            blockMerchantTransparentScreen.H = function1;
            return blockMerchantTransparentScreen;
        }
        if (step instanceof BlockMerchantFlowContract$Step.BlockedPaymentsList) {
            BlockedPaymentsListFlow blockedPaymentsListFlow = new BlockedPaymentsListFlow(new BlockedPaymentsListFlowContract$Input(((BlockMerchantFlowContract$Step.BlockedPaymentsList) step).f64231a));
            final int i2 = 1;
            Function1 block = new Function1(this) { // from class: yr2.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a f316111b;

                {
                    this.f316111b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            zr2.d output = (zr2.d) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof d.b;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar = this.f316111b;
                            if (!z && !(output instanceof d.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.I2();
                            return Unit.f186387a;
                        case 1:
                            h it8 = (h) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean z3 = it8 instanceof f;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar2 = this.f316111b;
                            if (z3) {
                                f fVar = (f) it8;
                                aVar2.E2(new BlockMerchantFlowContract$Step.BlockedMerchantDetails(fVar.f137557a, fVar.f137558b), true, null, false);
                            } else if (it8 instanceof fs2.d) {
                                aVar2.E2(new BlockMerchantFlowContract$Step.SelectPaymentToBlock(((fs2.d) it8).f137555a, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchant.f64263a), true, null, false);
                            } else if (it8 instanceof fs2.e) {
                                aVar2.E2(new BlockMerchantFlowContract$Step.SelectPaymentToBlock(((fs2.e) it8).f137556a, SelectPaymentToBlockScreenContract$ScreenType.BlockSubscription.f64265a), true, null, false);
                            } else {
                                if (!(it8 instanceof fs2.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((fs2.g) it8).f137559a.f249314a.f160150a, false, null, 6))));
                            }
                            return Unit.f186387a;
                        case 2:
                            Intrinsics.checkNotNullParameter((q) obj2, "it");
                            this.f316111b.I2();
                            return Unit.f186387a;
                        case 3:
                            is2.g it9 = (is2.g) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            boolean z4 = it9 instanceof is2.h;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar3 = this.f316111b;
                            if (z4) {
                                aVar3.E2(new BlockMerchantFlowContract$Step.BlockMerchant(new kr2.d(((is2.h) it9).f168085a), true, false), true, null, false);
                            } else {
                                if (!(it9 instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.K2(new dki.h((Function1) new i(12), true));
                            }
                            return Unit.f186387a;
                        default:
                            bs2.e it10 = (bs2.e) obj2;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean zF = Intrinsics.f(it10, e.a.f18028a);
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar4 = this.f316111b;
                            if (zF) {
                                aVar4.I2();
                            } else {
                                if (!(it10 instanceof bs2.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar4.C1(new ExternalDestination.Browser(((bs2.f) it10).f18029a, null));
                                aVar4.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            blockedPaymentsListFlow.H = block;
            return blockedPaymentsListFlow;
        }
        if (step instanceof BlockMerchantFlowContract$Step.BlockedMerchantDetails) {
            BlockMerchantFlowContract$Step.BlockedMerchantDetails blockedMerchantDetails = (BlockMerchantFlowContract$Step.BlockedMerchantDetails) step;
            BlockedMerchantDetailsScreen blockedMerchantDetailsScreen = new BlockedMerchantDetailsScreen(new BlockedMerchantDetailsScreenContract$InputData(blockedMerchantDetails.f64230b, blockedMerchantDetails.f64229a));
            final int i3 = 2;
            Function1 function12 = new Function1(this) { // from class: yr2.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a f316111b;

                {
                    this.f316111b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            zr2.d output = (zr2.d) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof d.b;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar = this.f316111b;
                            if (!z && !(output instanceof d.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.I2();
                            return Unit.f186387a;
                        case 1:
                            h it8 = (h) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean z3 = it8 instanceof f;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar2 = this.f316111b;
                            if (z3) {
                                f fVar = (f) it8;
                                aVar2.E2(new BlockMerchantFlowContract$Step.BlockedMerchantDetails(fVar.f137557a, fVar.f137558b), true, null, false);
                            } else if (it8 instanceof fs2.d) {
                                aVar2.E2(new BlockMerchantFlowContract$Step.SelectPaymentToBlock(((fs2.d) it8).f137555a, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchant.f64263a), true, null, false);
                            } else if (it8 instanceof fs2.e) {
                                aVar2.E2(new BlockMerchantFlowContract$Step.SelectPaymentToBlock(((fs2.e) it8).f137556a, SelectPaymentToBlockScreenContract$ScreenType.BlockSubscription.f64265a), true, null, false);
                            } else {
                                if (!(it8 instanceof fs2.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((fs2.g) it8).f137559a.f249314a.f160150a, false, null, 6))));
                            }
                            return Unit.f186387a;
                        case 2:
                            Intrinsics.checkNotNullParameter((q) obj2, "it");
                            this.f316111b.I2();
                            return Unit.f186387a;
                        case 3:
                            is2.g it9 = (is2.g) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            boolean z4 = it9 instanceof is2.h;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar3 = this.f316111b;
                            if (z4) {
                                aVar3.E2(new BlockMerchantFlowContract$Step.BlockMerchant(new kr2.d(((is2.h) it9).f168085a), true, false), true, null, false);
                            } else {
                                if (!(it9 instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.K2(new dki.h((Function1) new i(12), true));
                            }
                            return Unit.f186387a;
                        default:
                            bs2.e it10 = (bs2.e) obj2;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean zF = Intrinsics.f(it10, e.a.f18028a);
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar4 = this.f316111b;
                            if (zF) {
                                aVar4.I2();
                            } else {
                                if (!(it10 instanceof bs2.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar4.C1(new ExternalDestination.Browser(((bs2.f) it10).f18029a, null));
                                aVar4.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            blockedMerchantDetailsScreen.H = function12;
            return blockedMerchantDetailsScreen;
        }
        if (step instanceof BlockMerchantFlowContract$Step.SelectPaymentToBlock) {
            BlockMerchantFlowContract$Step.SelectPaymentToBlock selectPaymentToBlock = (BlockMerchantFlowContract$Step.SelectPaymentToBlock) step;
            SelectPaymentToBlockScreen selectPaymentToBlockScreen = new SelectPaymentToBlockScreen(new SelectPaymentToBlockScreenContract$InputData(selectPaymentToBlock.f64233b, selectPaymentToBlock.f64232a));
            final int i5 = 3;
            Function1 function13 = new Function1(this) { // from class: yr2.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a f316111b;

                {
                    this.f316111b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i5) {
                        case 0:
                            zr2.d output = (zr2.d) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof d.b;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar = this.f316111b;
                            if (!z && !(output instanceof d.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.I2();
                            return Unit.f186387a;
                        case 1:
                            h it8 = (h) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean z3 = it8 instanceof f;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar2 = this.f316111b;
                            if (z3) {
                                f fVar = (f) it8;
                                aVar2.E2(new BlockMerchantFlowContract$Step.BlockedMerchantDetails(fVar.f137557a, fVar.f137558b), true, null, false);
                            } else if (it8 instanceof fs2.d) {
                                aVar2.E2(new BlockMerchantFlowContract$Step.SelectPaymentToBlock(((fs2.d) it8).f137555a, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchant.f64263a), true, null, false);
                            } else if (it8 instanceof fs2.e) {
                                aVar2.E2(new BlockMerchantFlowContract$Step.SelectPaymentToBlock(((fs2.e) it8).f137556a, SelectPaymentToBlockScreenContract$ScreenType.BlockSubscription.f64265a), true, null, false);
                            } else {
                                if (!(it8 instanceof fs2.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((fs2.g) it8).f137559a.f249314a.f160150a, false, null, 6))));
                            }
                            return Unit.f186387a;
                        case 2:
                            Intrinsics.checkNotNullParameter((q) obj2, "it");
                            this.f316111b.I2();
                            return Unit.f186387a;
                        case 3:
                            is2.g it9 = (is2.g) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            boolean z4 = it9 instanceof is2.h;
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar3 = this.f316111b;
                            if (z4) {
                                aVar3.E2(new BlockMerchantFlowContract$Step.BlockMerchant(new kr2.d(((is2.h) it9).f168085a), true, false), true, null, false);
                            } else {
                                if (!(it9 instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.K2(new dki.h((Function1) new i(12), true));
                            }
                            return Unit.f186387a;
                        default:
                            bs2.e it10 = (bs2.e) obj2;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean zF = Intrinsics.f(it10, e.a.f18028a);
                            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar4 = this.f316111b;
                            if (zF) {
                                aVar4.I2();
                            } else {
                                if (!(it10 instanceof bs2.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar4.C1(new ExternalDestination.Browser(((bs2.f) it10).f18029a, null));
                                aVar4.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function13, "<set-?>");
            selectPaymentToBlockScreen.H = function13;
            return selectPaymentToBlockScreen;
        }
        if (!(step instanceof BlockMerchantFlowContract$Step.BlockDisallowed)) {
            throw new NoWhenBranchMatchedException();
        }
        BlockMerchantFlowContract$Step.BlockDisallowed blockDisallowed = (BlockMerchantFlowContract$Step.BlockDisallowed) step;
        MerchantBlockDisallowedController merchantBlockDisallowedController = new MerchantBlockDisallowedController(new MerchantBlockDisallowedControllerContract$InputData(blockDisallowed.f64223a, blockDisallowed.f64224b, blockDisallowed.f64225c));
        final int i6 = 4;
        Function1 block2 = new Function1(this) { // from class: yr2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a f316111b;

            {
                this.f316111b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        zr2.d output = (zr2.d) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof d.b;
                        com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar = this.f316111b;
                        if (!z && !(output instanceof d.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.I2();
                        return Unit.f186387a;
                    case 1:
                        h it8 = (h) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        boolean z3 = it8 instanceof f;
                        com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar2 = this.f316111b;
                        if (z3) {
                            f fVar = (f) it8;
                            aVar2.E2(new BlockMerchantFlowContract$Step.BlockedMerchantDetails(fVar.f137557a, fVar.f137558b), true, null, false);
                        } else if (it8 instanceof fs2.d) {
                            aVar2.E2(new BlockMerchantFlowContract$Step.SelectPaymentToBlock(((fs2.d) it8).f137555a, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchant.f64263a), true, null, false);
                        } else if (it8 instanceof fs2.e) {
                            aVar2.E2(new BlockMerchantFlowContract$Step.SelectPaymentToBlock(((fs2.e) it8).f137556a, SelectPaymentToBlockScreenContract$ScreenType.BlockSubscription.f64265a), true, null, false);
                        } else {
                            if (!(it8 instanceof fs2.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((fs2.g) it8).f137559a.f249314a.f160150a, false, null, 6))));
                        }
                        return Unit.f186387a;
                    case 2:
                        Intrinsics.checkNotNullParameter((q) obj2, "it");
                        this.f316111b.I2();
                        return Unit.f186387a;
                    case 3:
                        is2.g it9 = (is2.g) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        boolean z4 = it9 instanceof is2.h;
                        com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar3 = this.f316111b;
                        if (z4) {
                            aVar3.E2(new BlockMerchantFlowContract$Step.BlockMerchant(new kr2.d(((is2.h) it9).f168085a), true, false), true, null, false);
                        } else {
                            if (!(it9 instanceof g.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar3.K2(new dki.h((Function1) new i(12), true));
                        }
                        return Unit.f186387a;
                    default:
                        bs2.e it10 = (bs2.e) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        boolean zF = Intrinsics.f(it10, e.a.f18028a);
                        com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar4 = this.f316111b;
                        if (zF) {
                            aVar4.I2();
                        } else {
                            if (!(it10 instanceof bs2.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar4.C1(new ExternalDestination.Browser(((bs2.f) it10).f18029a, null));
                            aVar4.I2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        merchantBlockDisallowedController.H = block2;
        return merchantBlockDisallowedController;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f64238t;
    }
}
