package com.revolut.feature_move_money.impl.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyFlowContract$MoveMoneyProcessState f97378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f97379x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyFlowContract$MoveMoneyProcessState, String str, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f97378w = moveMoneyFlowContract$MoveMoneyProcessState;
        this.f97379x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f97378w, this.f97379x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.revolut.feature_move_money.impl.flow.e.J2(r4, r5, r5, r12, r11) == r0) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            r2 = 2
            r3 = 1
            com.revolut.feature_move_money.impl.flow.e r4 = r11.v
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r5 = r11.f97378w
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            yhm.o.b(r12)
            goto Lbc
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            yhm.o.b(r12)
            goto L30
        L21:
            yhm.o.b(r12)
            com.revolut.feature_move_money.impl.flow.delegate.a r12 = r4.f97394s
            r11.u = r3
            java.lang.Object r12 = r12.e(r5, r11)
            if (r12 != r0) goto L30
            goto La4
        L30:
            z7i.l r12 = (z7i.l) r12
            boolean r1 = r12 instanceof z7i.h
            if (r1 == 0) goto L4c
            r1 = r5
            yki.i r5 = r4.A
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$Reason r6 = new com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$Reason
            z7i.h r12 = (z7i.h) r12
            com.revolut.shared.feature.move_money.api.model.MoveMoneyReasonConfig r12 = r12.f320017a
            r6.<init>(r1, r12)
            r9 = 0
            r10 = 12
            r7 = 1
            r8 = 0
            oki.h.t2(r4, r5, r6, r7, r8, r9, r10)
            goto Lbc
        L4c:
            r1 = r5
            boolean r3 = r12 instanceof z7i.j
            if (r3 == 0) goto L65
            z7i.j r12 = (z7i.j) r12
            yki.i r5 = r4.A
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$ScaPrompt r6 = new com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$ScaPrompt
            java.lang.String r12 = r12.f320019a
            r6.<init>(r12, r1)
            r9 = 0
            r10 = 12
            r7 = 1
            r8 = 0
            oki.h.t2(r4, r5, r6, r7, r8, r9, r10)
            goto Lbc
        L65:
            boolean r3 = r12 instanceof z7i.g
            java.lang.String r5 = r11.f97379x
            if (r3 == 0) goto L7c
            yki.i r0 = r4.A
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$ExchangeGlobalAccessModal r2 = new com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$ExchangeGlobalAccessModal
            z7i.g r12 = (z7i.g) r12
            bla.c r12 = r12.f320016a
            r2.<init>(r12, r1, r5)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r12 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.w2(r0, r2, r12)
            goto Lbc
        L7c:
            boolean r3 = r12 instanceof z7i.i
            if (r3 == 0) goto L94
            z7i.i r12 = (z7i.i) r12
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r12 = r12.f320018a
            yki.i r5 = r4.A
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$Review r6 = new com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$Review
            r6.<init>(r1, r12)
            r9 = 0
            r10 = 12
            r7 = 1
            r8 = 0
            oki.h.t2(r4, r5, r6, r7, r8, r9, r10)
            goto Lbc
        L94:
            boolean r3 = r12 instanceof z7i.k
            if (r3 == 0) goto La5
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r12 = r1.f97347a
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r12 = r12.f97402b
            r11.u = r2
            java.lang.Object r12 = com.revolut.feature_move_money.impl.flow.e.J2(r4, r5, r1, r12, r11)
            if (r12 != r0) goto Lbc
        La4:
            return r0
        La5:
            boolean r0 = r12 instanceof com.revolut.feature_move_money.impl.flow.delegate.ValidationResult$ConfirmationModalRequired
            if (r0 == 0) goto Lbf
            yki.i r0 = r4.A
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$ConfirmationModal r2 = new com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$ConfirmationModal
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$ConfirmationModal$ConfirmationModalState r3 = new com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$ConfirmationModal$ConfirmationModalState
            com.revolut.feature_move_money.impl.flow.delegate.ValidationResult$ConfirmationModalRequired r12 = (com.revolut.feature_move_money.impl.flow.delegate.ValidationResult$ConfirmationModalRequired) r12
            r3.<init>(r12, r1, r5)
            r2.<init>(r3)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r12 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r0, r2, r12)
        Lbc:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        Lbf:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.flow.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
