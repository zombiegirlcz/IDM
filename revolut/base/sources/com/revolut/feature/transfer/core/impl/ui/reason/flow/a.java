package com.revolut.feature.transfer.core.impl.ui.reason.flow;

import com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser.ReasonForTransferChooserScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser.ReasonForTransferChooserScreenContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reason.flow.ReasonForTransferFlowContract$Step;
import com.revolut.feature.transfer.core.impl.ui.reason.goods.ReasonForTransferGoodsScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.goods.ReasonForTransferGoodsScreenContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reason.summary.ReasonForTransferSummaryScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.summary.ReasonForTransferSummaryScreenContract$InputData;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import gqf.d;
import gqf.e;
import gqf.f;
import java.util.ArrayList;
import kog.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import krf.c;
import nqf.i;
import nqf.j;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements kqf.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ReasonForTransferInputData f92201t;
    public final ReasonForTransferFlowContract$Step.Summary u;
    public final ReasonForTransferFlowContract$State v;

    public a(ReasonForTransferInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92201t = inputData;
        this.u = new ReasonForTransferFlowContract$Step.Summary(null);
        this.v = ReasonForTransferFlowContract$State.f92197a;
    }

    public final void O2(c cVar) {
        E2(new ReasonForTransferFlowContract$Step.Summary(cVar), false, TransitionAnimation.FADE.f98392a, false);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ReasonForTransferFlowContract$Step step = (ReasonForTransferFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof ReasonForTransferFlowContract$Step.Summary;
        ReasonForTransferInputData reasonForTransferInputData = this.f92201t;
        if (z) {
            ReasonForTransferSummaryScreen reasonForTransferSummaryScreen = new ReasonForTransferSummaryScreen(new ReasonForTransferSummaryScreenContract$InputData(reasonForTransferInputData.f92122a, reasonForTransferInputData.f92123b, ((ReasonForTransferFlowContract$Step.Summary) step).f92200a, reasonForTransferInputData.f92124c));
            k kVar = new k(this, 11);
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            reasonForTransferSummaryScreen.H = kVar;
            return reasonForTransferSummaryScreen;
        }
        if (!(step instanceof ReasonForTransferFlowContract$Step.Chooser)) {
            if (!(step instanceof ReasonForTransferFlowContract$Step.Goods)) {
                throw new NoWhenBranchMatchedException();
            }
            final c cVar = ((ReasonForTransferFlowContract$Step.Goods) step).f92199a;
            ReasonForTransferGoodsScreen reasonForTransferGoodsScreen = new ReasonForTransferGoodsScreen(new ReasonForTransferGoodsScreenContract$InputData(cVar));
            final int i = 1;
            Function1 function1 = new Function1(this) { // from class: kqf.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.transfer.core.impl.ui.reason.flow.a f188403b;

                {
                    this.f188403b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            f output = (f) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z3 = output instanceof d;
                            com.revolut.feature.transfer.core.impl.ui.reason.flow.a aVar = this.f188403b;
                            if (z3) {
                                aVar.O2(cVar);
                            } else {
                                if (!(output instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c cVar2 = ((e) output).f145716a;
                                if ((cVar2 instanceof krf.e) && Intrinsics.f(((krf.e) cVar2).f188861a, "overseas_goods")) {
                                    aVar.E2(new ReasonForTransferFlowContract$Step.Goods(cVar2), false, TransitionAnimation.FADE.f98392a, false);
                                } else {
                                    aVar.O2(cVar2);
                                }
                            }
                            return Unit.f186387a;
                        default:
                            nqf.k output2 = (nqf.k) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z4 = output2 instanceof i;
                            com.revolut.feature.transfer.core.impl.ui.reason.flow.a aVar2 = this.f188403b;
                            if (z4) {
                                c cVar3 = cVar;
                                krf.e eVar = cVar3 instanceof krf.e ? (krf.e) cVar3 : null;
                                if ((eVar != null ? eVar.f188863c : null) != null) {
                                    aVar2.O2(cVar3);
                                } else {
                                    aVar2.E2(new ReasonForTransferFlowContract$Step.Chooser(null), false, TransitionAnimation.FADE.f98392a, false);
                                }
                            } else {
                                if (!(output2 instanceof j)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.O2(((j) output2).f218443a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            reasonForTransferGoodsScreen.H = function1;
            return reasonForTransferGoodsScreen;
        }
        final c cVar2 = ((ReasonForTransferFlowContract$Step.Chooser) step).f92198a;
        ArrayList<c> arrayList = reasonForTransferInputData.f92123b.f188864a;
        ArrayList arrayList2 = new ArrayList();
        for (c cVar3 : arrayList) {
            krf.e eVar = cVar3 instanceof krf.e ? (krf.e) cVar3 : null;
            if (eVar != null) {
                arrayList2.add(eVar);
            }
        }
        krf.f fVar = reasonForTransferInputData.f92123b;
        ReasonForTransferChooserScreen reasonForTransferChooserScreen = new ReasonForTransferChooserScreen(new ReasonForTransferChooserScreenContract$InputData(arrayList2, fVar.f188865b, fVar.f188866c, cVar2));
        final int i2 = 0;
        Function1 function12 = new Function1(this) { // from class: kqf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.transfer.core.impl.ui.reason.flow.a f188403b;

            {
                this.f188403b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        f output = (f) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z3 = output instanceof d;
                        com.revolut.feature.transfer.core.impl.ui.reason.flow.a aVar = this.f188403b;
                        if (z3) {
                            aVar.O2(cVar2);
                        } else {
                            if (!(output instanceof e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c cVar22 = ((e) output).f145716a;
                            if ((cVar22 instanceof krf.e) && Intrinsics.f(((krf.e) cVar22).f188861a, "overseas_goods")) {
                                aVar.E2(new ReasonForTransferFlowContract$Step.Goods(cVar22), false, TransitionAnimation.FADE.f98392a, false);
                            } else {
                                aVar.O2(cVar22);
                            }
                        }
                        return Unit.f186387a;
                    default:
                        nqf.k output2 = (nqf.k) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        boolean z4 = output2 instanceof i;
                        com.revolut.feature.transfer.core.impl.ui.reason.flow.a aVar2 = this.f188403b;
                        if (z4) {
                            c cVar32 = cVar2;
                            krf.e eVar2 = cVar32 instanceof krf.e ? (krf.e) cVar32 : null;
                            if ((eVar2 != null ? eVar2.f188863c : null) != null) {
                                aVar2.O2(cVar32);
                            } else {
                                aVar2.E2(new ReasonForTransferFlowContract$Step.Chooser(null), false, TransitionAnimation.FADE.f98392a, false);
                            }
                        } else {
                            if (!(output2 instanceof j)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.O2(((j) output2).f218443a);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        reasonForTransferChooserScreen.H = function12;
        return reasonForTransferChooserScreen;
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
