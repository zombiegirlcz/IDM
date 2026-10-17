package e60;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.time.b;
import skm.h2;

/* JADX INFO: loaded from: classes19.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f122872w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f122872w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f122872w, continuation, 0);
            default:
                return new x(this.f122872w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((x) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        y yVar = this.f122872w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                yVar.getClass();
                b.Companion companion = kotlin.time.b.INSTANCE;
                Object objE = h2.e(kotlin.time.c.g(30, pkm.e.SECONDS), new w(yVar, continuation, i2), this);
                return objE == aVar ? aVar : objE;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                yVar.getClass();
                b.Companion companion2 = kotlin.time.b.INSTANCE;
                Object objE2 = h2.e(kotlin.time.c.g(30, pkm.e.SECONDS), new w(yVar, continuation, i2), this);
                return objE2 == aVar2 ? aVar2 : objE2;
        }
    }
}
