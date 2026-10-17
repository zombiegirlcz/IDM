package lik;

import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zfk.c;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hha.d f195542w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function1 function1, hha.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = function1;
        this.f195542w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f195542w, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((c.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c.b bVar = (c.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = bVar instanceof zfk.i;
        Function1 function1 = this.v;
        if (z) {
            function1.invoke(new vfk.a(this.f195542w));
        } else {
            if (!(bVar instanceof zfk.g)) {
                throw new NoWhenBranchMatchedException();
            }
            zfk.g gVar = (zfk.g) bVar;
            function1.invoke(new vfk.b(gVar.f322021a, gVar.f322022b));
        }
        return Unit.f186387a;
    }
}
