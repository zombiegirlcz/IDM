package ekf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sgm.e3;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f127117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f127118x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(v vVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f127117w = vVar;
        this.f127118x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f127117w, this.f127118x, continuation, 0);
            default:
                return new r(this.f127117w, this.f127118x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarB = this.f127117w.o.b(this.f127118x);
                    this.v = 1;
                    if (nim.a.a(bVarB, this) == aVar) {
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
                    e3 e3Var = this.f127117w.o;
                    e3Var.getClass();
                    String requestId = this.f127118x;
                    Intrinsics.checkNotNullParameter(requestId, "requestId");
                    zr8.h hVar = (zr8.h) ((zr8.b) e3Var.f262806b);
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(requestId, "requestId");
                    pfm.a aVarE = hVar.f324669g.j(requestId).e(hVar.a(requestId));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar2) {
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
