package com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow;

import a3i.w;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import do3.n;
import do3.q;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import r85.c;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep flowStep;
        LoanSelectBackupCardFlowContract$Step.SelectNewCard selectNewCard;
        FlowStep flowStep2;
        b bVar = this.v;
        LoanSelectBackupCardFlowContract$InputData loanSelectBackupCardFlowContract$InputData = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            c cVar = new c(bVar, null, 0);
            this.u = 1;
            obj2 = bVar.p2(this, cVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withLoading(...)");
        bVar.H2(bVar.f70597s, new w(9, q.y((n) obj2)));
        LoanBackupCard loanBackupCard = loanSelectBackupCardFlowContract$InputData.f70588b;
        if (loanBackupCard instanceof LoanBackupCard.ExternalCard) {
            if (b.I2(bVar, loanBackupCard) || loanSelectBackupCardFlowContract$InputData.f70589c) {
                selectNewCard = new LoanSelectBackupCardFlowContract$Step.SelectNewCard(loanBackupCard);
                flowStep2 = selectNewCard;
            } else {
                flowStep = LoanSelectBackupCardFlowContract$Step.ToggleBackupCard.f70593a;
                flowStep2 = flowStep;
            }
        } else if (loanBackupCard instanceof LoanBackupCard.Stale) {
            selectNewCard = new LoanSelectBackupCardFlowContract$Step.SelectNewCard(loanBackupCard);
            flowStep2 = selectNewCard;
        } else {
            if (!(loanBackupCard instanceof LoanBackupCard.None)) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = LoanSelectBackupCardFlowContract$Step.Article.f70591a;
            flowStep2 = flowStep;
        }
        h.t2(bVar, bVar.f70598t, flowStep2, false, null, false, 12);
        return Unit.f186387a;
    }
}
