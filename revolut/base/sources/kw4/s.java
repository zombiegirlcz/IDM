package kw4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.x2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f190245w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(z zVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f190245w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f190245w, continuation, 0);
            default:
                return new s(this.f190245w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    z zVar = this.f190245w;
                    al4.n nVar = zVar.u;
                    String str = zVar.I2().f190221a;
                    long j2 = zVar.I2().f190228m.f115082a;
                    String str2 = ((i) ((j2) zVar.C.f22677a).getValue()).f190229a;
                    String str3 = zVar.I2().f190222b;
                    String str4 = zVar.I2().f190228m.f115083b.f306286a;
                    this.v = 1;
                    if (((x2) nVar).P(str, j2, str2, str3, str4, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    al4.q qVar = this.f190245w.v;
                    this.v = 1;
                    if (al4.q.a(qVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
