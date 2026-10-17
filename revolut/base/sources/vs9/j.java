package vs9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pfm.r;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f291755w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f291755w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f291755w, continuation, 0);
            default:
                return new j(this.f291755w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                l lVar = this.f291755w;
                if (i == 0) {
                    o.b(obj2);
                    r rVarA = ((mr9.a) lVar.f291757p).a(((d) lVar.t2()).f291748a.f79285a);
                    this.v = 1;
                    if (nim.a.a(rVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                lVar.v2(e.f291749a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                l lVar2 = this.f291755w;
                if (i2 == 0) {
                    o.b(obj2);
                    r rVarE = ((mr9.a) lVar2.f291757p).e(((d) lVar2.t2()).f291748a.f79285a);
                    this.v = 1;
                    if (nim.a.a(rVarE, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                lVar2.v2(f.f291750a);
                return Unit.f186387a;
        }
    }
}
