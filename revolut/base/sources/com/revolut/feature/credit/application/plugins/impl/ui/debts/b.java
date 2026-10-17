package com.revolut.feature.credit.application.plugins.impl.ui.debts;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import skm.h0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f67432w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f67432w = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f67432w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h0 h0VarG = oc.c.g(cVar.f67435r.x(AccountId.Personal.f51414a), this.f67432w);
            this.u = 1;
            obj2 = h0VarG.y(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        xi0.b bVar = (xi0.b) obj2;
        yki.i iVar = cVar.u;
        Intrinsics.h(bVar);
        h.u2(cVar, iVar, new OutstandingDebtsFlowContract$Step.DebtsHub(bVar, false), null, 6);
        return Unit.f186387a;
    }
}
