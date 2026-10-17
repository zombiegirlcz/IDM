package com.revolut.feature.transfer.core.impl.ui.reason.flow_v2;

import com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.ReasonForTransferChooserContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.ReasonForTransferChooserScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.ReasonForTransferFlowContract$Step;
import com.revolut.feature.transfer.core.impl.ui.reason.goods.ReasonForTransferGoodsScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.goods.ReasonForTransferGoodsScreenContract$InputData;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import iqf.c;
import iqf.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import krf.e;
import ll6.i;
import nqf.j;
import nqf.k;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements lqf.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ReasonForTransferInputData f92206t;
    public final b4j.g u;
    public final mqf.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ReasonForTransferFlowContract$Step.NewChooser f92207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ReasonForTransferFlowContract$State f92208x;

    public a(ReasonForTransferInputData inputData, b4j.g reasonForTransferValidationDelegate, mqf.a legalConfirmationDialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(reasonForTransferValidationDelegate, "reasonForTransferValidationDelegate");
        Intrinsics.checkNotNullParameter(legalConfirmationDialogMapper, "legalConfirmationDialogMapper");
        this.f92206t = inputData;
        this.u = reasonForTransferValidationDelegate;
        this.v = legalConfirmationDialogMapper;
        this.f92207w = ReasonForTransferFlowContract$Step.NewChooser.f92205a;
        this.f92208x = new ReasonForTransferFlowContract$State(0);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ReasonForTransferFlowContract$Step step = (ReasonForTransferFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ReasonForTransferFlowContract$Step.Goods) {
            ReasonForTransferGoodsScreen reasonForTransferGoodsScreen = new ReasonForTransferGoodsScreen(new ReasonForTransferGoodsScreenContract$InputData(((ReasonForTransferFlowContract$Step.Goods) step).f92204a));
            final int i = 1;
            Function1 function1 = new Function1(this) { // from class: lqf.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a f199312b;

                {
                    this.f199312b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            d output = (d) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof iqf.b;
                            com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a aVar = this.f199312b;
                            if (z) {
                                aVar.G2(bpf.a.f17620a);
                            } else {
                                if (!(output instanceof c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                krf.c cVar = ((c) output).f167828a;
                                if ((cVar instanceof krf.d) || ((cVar instanceof e) && Intrinsics.f(((e) cVar).f188861a, "overseas_goods"))) {
                                    aVar.E2(new ReasonForTransferFlowContract$Step.Goods(cVar), false, TransitionAnimation.FADE.f98392a, false);
                                } else {
                                    aVar.l2(new i(aVar, cVar, null, 19), new yi5.b(26));
                                }
                            }
                            return Unit.f186387a;
                        default:
                            k output2 = (k) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof nqf.i;
                            com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a aVar2 = this.f199312b;
                            if (z3) {
                                aVar2.E2(ReasonForTransferFlowContract$Step.NewChooser.f92205a, false, TransitionAnimation.FADE.f98392a, false);
                            } else {
                                if (!(output2 instanceof j)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.l2(new i(aVar2, ((j) output2).f218443a, null, 19), new yi5.b(26));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            reasonForTransferGoodsScreen.H = function1;
            return reasonForTransferGoodsScreen;
        }
        if (!Intrinsics.f(step, ReasonForTransferFlowContract$Step.NewChooser.f92205a)) {
            throw new NoWhenBranchMatchedException();
        }
        ReasonForTransferInputData reasonForTransferInputData = this.f92206t;
        ArrayList arrayList = reasonForTransferInputData.f92123b.f188864a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                ReasonForTransferChooserScreen reasonForTransferChooserScreen = new ReasonForTransferChooserScreen(new ReasonForTransferChooserContract$InputData(arrayList2, reasonForTransferInputData.f92123b.f188865b, null));
                final int i2 = 0;
                Function1 block = new Function1(this) { // from class: lqf.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a f199312b;

                    {
                        this.f199312b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                d output = (d) obj2;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z = output instanceof iqf.b;
                                com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a aVar = this.f199312b;
                                if (z) {
                                    aVar.G2(bpf.a.f17620a);
                                } else {
                                    if (!(output instanceof c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    krf.c cVar = ((c) output).f167828a;
                                    if ((cVar instanceof krf.d) || ((cVar instanceof e) && Intrinsics.f(((e) cVar).f188861a, "overseas_goods"))) {
                                        aVar.E2(new ReasonForTransferFlowContract$Step.Goods(cVar), false, TransitionAnimation.FADE.f98392a, false);
                                    } else {
                                        aVar.l2(new i(aVar, cVar, null, 19), new yi5.b(26));
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                k output2 = (k) obj2;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                boolean z3 = output2 instanceof nqf.i;
                                com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a aVar2 = this.f199312b;
                                if (z3) {
                                    aVar2.E2(ReasonForTransferFlowContract$Step.NewChooser.f92205a, false, TransitionAnimation.FADE.f98392a, false);
                                } else {
                                    if (!(output2 instanceof j)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar2.l2(new i(aVar2, ((j) output2).f218443a, null, 19), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block, "block");
                reasonForTransferChooserScreen.H = block;
                return reasonForTransferChooserScreen;
            }
            krf.c cVar = (krf.c) it8.next();
            e eVar = cVar instanceof e ? (e) cVar : null;
            if (eVar != null) {
                arrayList2.add(eVar);
            }
        }
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f92208x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f92207w;
    }
}
