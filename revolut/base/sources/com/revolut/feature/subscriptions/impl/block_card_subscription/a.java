package com.revolut.feature.subscriptions.impl.block_card_subscription;

import com.revolut.feature.subscriptions.impl.block_card_subscription.BlockCardSubscriptionFlowContract$Step;
import com.revolut.feature.subscriptions.impl.block_card_subscription.accept_conditions.AcceptConditionsScreen;
import com.revolut.feature.subscriptions.impl.block_card_subscription.screen.BlockSubscriptionScreen;
import com.revolut.feature.subscriptions.impl.block_card_subscription.screen.BlockSubscriptionScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen.WhatWillHappenScreen;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import j4h.m;
import k9e.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements j9e.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BlockCardSubscriptionFlowContract$Step.BlockSubscription f89165t;
    public final EmptyFlowState u;

    public a(BlockCardSubscriptionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f89165t = new BlockCardSubscriptionFlowContract$Step.BlockSubscription(new BlockSubscriptionScreenContract$InputData(inputData.f89161a));
        this.u = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        BlockCardSubscriptionFlowContract$Step step = (BlockCardSubscriptionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BlockCardSubscriptionFlowContract$Step.WhatWillHappen) {
            WhatWillHappenScreen whatWillHappenScreen = new WhatWillHappenScreen(((BlockCardSubscriptionFlowContract$Step.WhatWillHappen) step).f89164a);
            m mVar = new m(this, whatWillHappenScreen, 19);
            Intrinsics.checkNotNullParameter(mVar, "<set-?>");
            whatWillHappenScreen.H = mVar;
            return whatWillHappenScreen;
        }
        if (step instanceof BlockCardSubscriptionFlowContract$Step.AcceptConditions) {
            AcceptConditionsScreen acceptConditionsScreen = new AcceptConditionsScreen(((BlockCardSubscriptionFlowContract$Step.AcceptConditions) step).f89162a);
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: j9e.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.subscriptions.impl.block_card_subscription.a f172321b;

                {
                    this.f172321b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i2 = i;
                    com.revolut.feature.subscriptions.impl.block_card_subscription.a aVar = this.f172321b;
                    switch (i2) {
                        case 0:
                            e output = (e) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (!(output instanceof k9e.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.G2(new b(((k9e.d) output).f182321a));
                            Unit unit = Unit.f186387a;
                            aVar.I2();
                            return Unit.f186387a;
                        default:
                            n9e.e output2 = (n9e.e) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof n9e.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.G2(new b(((n9e.d) output2).f213636a));
                            Unit unit2 = Unit.f186387a;
                            aVar.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            acceptConditionsScreen.H = function1;
            return acceptConditionsScreen;
        }
        if (!(step instanceof BlockCardSubscriptionFlowContract$Step.BlockSubscription)) {
            throw new NoWhenBranchMatchedException();
        }
        BlockSubscriptionScreen blockSubscriptionScreen = new BlockSubscriptionScreen(((BlockCardSubscriptionFlowContract$Step.BlockSubscription) step).f89163a);
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: j9e.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.subscriptions.impl.block_card_subscription.a f172321b;

            {
                this.f172321b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                com.revolut.feature.subscriptions.impl.block_card_subscription.a aVar = this.f172321b;
                switch (i22) {
                    case 0:
                        e output = (e) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (!(output instanceof k9e.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.G2(new b(((k9e.d) output).f182321a));
                        Unit unit = Unit.f186387a;
                        aVar.I2();
                        return Unit.f186387a;
                    default:
                        n9e.e output2 = (n9e.e) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (!(output2 instanceof n9e.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.G2(new b(((n9e.d) output2).f213636a));
                        Unit unit2 = Unit.f186387a;
                        aVar.I2();
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        blockSubscriptionScreen.H = function12;
        return blockSubscriptionScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f89165t;
    }
}
