package com.revolut.feature_move_money.impl.automation.screen;

import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyAutomationScreenContract$ModalStep f97335w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, MoveMoneyAutomationScreenContract$ModalStep moveMoneyAutomationScreenContract$ModalStep, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f97335w = moveMoneyAutomationScreenContract$ModalStep;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f97335w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            MoveMoneyAutomationScreenContract$CreationState moveMoneyAutomationScreenContract$CreationState = ((MoveMoneyAutomationScreenContract$ModalStep.WealthProtectionConfirmation) this.f97335w).f97331a;
            WalletAutomation walletAutomation = moveMoneyAutomationScreenContract$CreationState.f97325a;
            AccountWrapper sourceAccount = moveMoneyAutomationScreenContract$CreationState.f97326b;
            AccountWrapper targetAccount = moveMoneyAutomationScreenContract$CreationState.f97327c;
            Intrinsics.checkNotNullParameter(walletAutomation, "walletAutomation");
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
            MoveMoneyAutomationScreenContract$CreationState moveMoneyAutomationScreenContract$CreationState2 = new MoveMoneyAutomationScreenContract$CreationState(walletAutomation, sourceAccount, targetAccount, true);
            this.u = 1;
            if (c.I2(this.v, moveMoneyAutomationScreenContract$CreationState2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
