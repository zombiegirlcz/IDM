package com.revolut.feature.credit.card.impl.ui.instalment.create;

import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import vr4.t;
import vr4.u;
import vr4.v;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep flowStepI2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            vr4.o oVar = new vr4.o(bVar, null, 5);
            this.u = 1;
            obj2 = bVar.p2(this, oVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Pair pair = (Pair) obj2;
        v vVar = (v) pair.f186385a;
        od0.i iVar = (od0.i) pair.f186386b;
        if (iVar.d()) {
            h.w2(bVar.f69348x, new InstalmentFlowContract$Step.IneligibilityExplainer((InstalmentFlowContract$IneligibilityDialogType) iVar.c()), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            if (vVar instanceof t) {
                t tVar = (t) vVar;
                flowStepI2 = new InstalmentFlowContract$Step.Intro(tVar.f291502a, tVar.f291503b);
            } else {
                if (!(vVar instanceof u)) {
                    throw new NoWhenBranchMatchedException();
                }
                flowStepI2 = b.I2(bVar.o);
            }
            h.t2(bVar, bVar.f69348x, flowStepI2, false, null, false, 12);
        }
        return Unit.f186387a;
    }
}
