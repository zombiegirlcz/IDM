package mb4;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;
import yki.l;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a f204128w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f204129x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a aVar, l lVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204128w = aVar;
        this.f204129x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f204128w, this.f204129x, continuation, 0);
            default:
                return new f(this.f204128w, this.f204129x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    sb4.c cVar = this.f204128w.f67701q;
                    this.v = 1;
                    if (cVar.a(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                h.D2(this.f204129x);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a aVar3 = this.f204128w;
                f fVar = new f(aVar3, this.f204129x, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(aVar3.k, "addRevolutAccount", fVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
