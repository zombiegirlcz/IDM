package com.revolut.feature.credit.card.impl.ui.instalment.details.flow;

import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$Step;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import ql4.v;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ v u;
    public final /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f69360w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar, List list, b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = vVar;
        this.v = list;
        this.f69360w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, this.f69360w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        CreditCardInstalmentDetailsFlowContract$Step.Repay repay = new CreditCardInstalmentDetailsFlowContract$Step.Repay(this.u, this.v);
        b bVar = this.f69360w;
        h.t2(bVar, bVar.f69362q, repay, true, null, false, 12);
        return Unit.f186387a;
    }
}
