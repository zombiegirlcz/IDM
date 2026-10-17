package pth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a f239725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f239726x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f239725w = aVar;
        this.f239726x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f239725w, this.f239726x, continuation, 0);
            default:
                return new y(this.f239725w, this.f239726x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jvh.a aVar2 = this.f239725w.o;
                    this.v = 1;
                    if (aVar2.g(this.f239726x, null, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar4 = this.f239725w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    y yVar = new y(aVar4, this.f239726x, null, 0);
                    this.v = 1;
                    if (aVar4.p2(this, yVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar4.W2();
                return Unit.f186387a;
        }
    }
}
