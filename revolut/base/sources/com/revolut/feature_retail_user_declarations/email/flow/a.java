package com.revolut.feature_retail_user_declarations.email.flow;

import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import p40.v;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
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
        boolean zBooleanValue;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            if (!dVar.o.f97556c) {
                zBooleanValue = false;
                h.t2(dVar, dVar.u, new EmailFlowContract$Step.Email(zBooleanValue), false, null, false, 12);
                return Unit.f186387a;
            }
            v vVar = new v(dVar, null, 26);
            this.u = 1;
            obj2 = dVar.p2(this, vVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        zBooleanValue = ((Boolean) obj2).booleanValue();
        h.t2(dVar, dVar.u, new EmailFlowContract$Step.Email(zBooleanValue), false, null, false, 12);
        return Unit.f186387a;
    }
}
