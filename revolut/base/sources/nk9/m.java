package nk9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f216767w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f216767w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f216767w, continuation, 0);
            default:
                return new m(this.f216767w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objY2 = o.y2(this.f216767w, this);
                return objY2 == aVar ? aVar : objY2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                o oVar = this.f216767w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    m mVar = new m(oVar, null, 0);
                    this.v = 1;
                    obj2 = oVar.p2(this, mVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                zh9.a aVar3 = (zh9.a) obj2;
                if (aVar3 == null) {
                    return Unit.f186387a;
                }
                oVar.f216769q.x(oVar.f216770r.c("PAY_LATER_REPAYMENTS_LIST_BOTTOM_DIALOG_DELEGATES_KEY", aVar3));
                return Unit.f186387a;
        }
    }
}
