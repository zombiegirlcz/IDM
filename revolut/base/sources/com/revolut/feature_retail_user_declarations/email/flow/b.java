package com.revolut.feature_retail_user_declarations.email.flow;

import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pai.e;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EmailFlowOutputData.EmailData f97568w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, EmailFlowOutputData.EmailData emailData, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f97568w = emailData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f97568w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        pai.a aVar2 = this.v.f97571q;
        String str = this.f97568w.f97565a;
        this.u = 1;
        Object objA = ((e) aVar2).a(str, this);
        return objA == aVar ? aVar : objA;
    }
}
