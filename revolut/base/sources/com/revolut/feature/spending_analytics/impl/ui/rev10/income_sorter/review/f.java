package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ReviewMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncomeSorterReviewContract$ReviewMode.Create f87862w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, IncomeSorterReviewContract$ReviewMode.Create create, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f87862w = create;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f87862w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        IncomeSorterReviewContract$ReviewMode.Create create = this.f87862w;
        i iVar = this.v;
        e eVar = new e(iVar, create, null);
        this.u = 1;
        Object objP2 = iVar.p2(this, eVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
