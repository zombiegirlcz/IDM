package com.revolut.feature_move_money.impl.automation.screen;

import c69.v;
import c7i.p;
import c7i.q;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$ModalStep;
import gim.i;
import j1j.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g1j.b f97333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyAutomationScreenContract$ModalStep.BalancePicker f97334x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, g1j.b bVar, MoveMoneyAutomationScreenContract$ModalStep.BalancePicker balancePicker, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f97333w = bVar;
        this.f97334x = balancePicker;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f97333w, this.f97334x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            zq.a aVar2 = cVar.f97339s;
            d dVar = this.f97333w.f139686a;
            String str = dVar.f170617a;
            k1j.a aVar3 = dVar.d;
            q qVar = this.f97334x.f97329a.d;
            c7i.o oVar = cVar.K2().f22020a;
            c7i.o oVar2 = cVar.K2().f22021b;
            this.u = 1;
            obj2 = aVar2.p(str, aVar3, qVar, oVar, oVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.H2(cVar.D, new v((p) obj2, 8));
        return Unit.f186387a;
    }
}
