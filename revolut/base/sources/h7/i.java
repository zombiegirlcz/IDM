package h7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ j u;
    public final /* synthetic */ d7.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f149787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f149788x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, d7.j jVar2, float f, boolean z, Continuation continuation) {
        super(1, continuation);
        this.u = jVar;
        this.v = jVar2;
        this.f149787w = f;
        this.f149788x = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.u, this.v, this.f149787w, this.f149788x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d7.j jVar = this.v;
        j jVar2 = this.u;
        jVar2.i.setValue(jVar);
        jVar2.i(this.f149787w);
        jVar2.h(1);
        jVar2.f149792a.setValue(Boolean.FALSE);
        if (this.f149788x) {
            jVar2.f149798l.setValue(Long.MIN_VALUE);
        }
        return Unit.f186387a;
    }
}
