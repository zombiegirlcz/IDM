package com.revolut.feature_move_money.impl.flow;

import g8i.t;
import g8i.u;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f97376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyFlowContract$MoveMoneyProcessState f97377x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, u uVar, MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyFlowContract$MoveMoneyProcessState, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f97376w = uVar;
        this.f97377x = moveMoneyFlowContract$MoveMoneyProcessState;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f97376w, this.f97377x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            u uVar = this.f97376w;
            ((t) uVar).getClass();
            e eVar = this.v;
            wc2.b bVar = new wc2.b(eVar, uVar, this.f97377x, (Continuation) null, 15);
            this.u = 1;
            if (u0.b0(eVar.X(), "MOVE_MONEY_REVIEW_SCREEN_CTA_TAG", bVar, this) == aVar) {
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
