package gie;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Flow f144161w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
        this.f144161w = flow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.v, this.f144161w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            z zVar = this.v;
            if (((eie.b) zVar.f144165p).f126589b.get()) {
                return Unit.f186387a;
            }
            Continuation continuation = null;
            jhi.b bVarG = mo3.a.g(this.f144161w, null, null, 3);
            b.Companion companion = kotlin.time.b.INSTANCE;
            wkm.l lVarQ = vkm.q.Q(rd0.e.e(zi0.c.M(bVarG, null, kotlin.time.c.h(5000L, pkm.e.MILLISECONDS), null), h0.f322473a, new g23.j(3, 16, continuation)), new g6f.l(continuation, zVar, 7));
            this.u = 1;
            if (vkm.q.x(lVarQ, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
