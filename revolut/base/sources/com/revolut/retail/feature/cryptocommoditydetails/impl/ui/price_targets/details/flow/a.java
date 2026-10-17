package com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow;

import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow.PriceTargetsDetailsFlowContract$Step;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreenContract$InputData;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.PriceTargetsFaqLeafScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.PriceTargetsFaqLeafScreenContract$InputData;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.root.PriceTargetsFaqRootScreen;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ldj.d;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends g implements kdj.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PriceTargetsDetailsFlowContract$InputData f100154t;
    public final PriceTargetsDetailsFlowContract$Step.Details u;
    public final PriceTargetsDetailsFlowContract$State v;

    public a(PriceTargetsDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f100154t = inputData;
        this.u = PriceTargetsDetailsFlowContract$Step.Details.f100151a;
        this.v = PriceTargetsDetailsFlowContract$State.f100150a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PriceTargetsDetailsFlowContract$Step step = (PriceTargetsDetailsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, PriceTargetsDetailsFlowContract$Step.Details.f100151a)) {
            PriceTargetsDetailsFlowContract$InputData priceTargetsDetailsFlowContract$InputData = this.f100154t;
            PriceTargetsDetailsScreen priceTargetsDetailsScreen = new PriceTargetsDetailsScreen(new PriceTargetsDetailsScreenContract$InputData(priceTargetsDetailsFlowContract$InputData.f100147a, priceTargetsDetailsFlowContract$InputData.f100148b, priceTargetsDetailsFlowContract$InputData.f100149c));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: kdj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow.a f182903b;

                {
                    this.f182903b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            d outputData = (d) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (!Intrinsics.f(outputData, d.f194149a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f182903b.E2(PriceTargetsDetailsFlowContract$Step.FaqRoot.f100153a, true, null, false);
                            return Unit.f186387a;
                        default:
                            pdj.d outputData2 = (pdj.d) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            this.f182903b.E2(new PriceTargetsDetailsFlowContract$Step.FaqLeaf(outputData2.f235263a), true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            priceTargetsDetailsScreen.H = function1;
            return priceTargetsDetailsScreen;
        }
        if (!Intrinsics.f(step, PriceTargetsDetailsFlowContract$Step.FaqRoot.f100153a)) {
            if (step instanceof PriceTargetsDetailsFlowContract$Step.FaqLeaf) {
                return new PriceTargetsFaqLeafScreen(new PriceTargetsFaqLeafScreenContract$InputData(((PriceTargetsDetailsFlowContract$Step.FaqLeaf) step).f100152a));
            }
            throw new NoWhenBranchMatchedException();
        }
        PriceTargetsFaqRootScreen priceTargetsFaqRootScreen = new PriceTargetsFaqRootScreen();
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: kdj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow.a f182903b;

            {
                this.f182903b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        d outputData = (d) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        if (!Intrinsics.f(outputData, d.f194149a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f182903b.E2(PriceTargetsDetailsFlowContract$Step.FaqRoot.f100153a, true, null, false);
                        return Unit.f186387a;
                    default:
                        pdj.d outputData2 = (pdj.d) obj2;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        this.f182903b.E2(new PriceTargetsDetailsFlowContract$Step.FaqLeaf(outputData2.f235263a), true, null, false);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        priceTargetsFaqRootScreen.H = function12;
        return priceTargetsFaqRootScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
