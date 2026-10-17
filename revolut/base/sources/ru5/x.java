package ru5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pt5.q f257437w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, pt5.q qVar, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
        this.f257437w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.v, this.f257437w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        pt5.q qVar = this.f257437w;
        z zVar = this.v;
        r25.a aVar2 = new r25.a(qVar, zVar, null, 15);
        this.u = 1;
        Object objP2 = zVar.p2(this, aVar2);
        return objP2 == aVar ? aVar : objP2;
    }
}
