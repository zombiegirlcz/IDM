package u82;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f278087w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f278087w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f278087w, continuation, 0);
            case 1:
                return new j(this.f278087w, continuation, 1);
            default:
                return new j(this.f278087w, continuation, 2);
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                m mVar = this.f278087w;
                Object objB = pu7.a.B(mVar.k, "TRANSFER_TASK_ID", new j(mVar, null, 2), this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                m mVar2 = this.f278087w;
                if (i2 == 0) {
                    o.b(obj2);
                    t82.f fVar = mVar2.o;
                    this.v = 1;
                    obj2 = fVar.a(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                mVar2.H2(mVar2.v, new u6b.k((t82.a) obj2, 6));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m mVar3 = this.f278087w;
                l lVar = new l(mVar3, null);
                this.v = 1;
                Object objB0 = u0.b0(mVar3.X(), "MULTIBANCO_WITHDRAWAL_AMOUNT_CTA_BUTTON_TAG", lVar, this);
                return objB0 == aVar3 ? aVar3 : objB0;
        }
    }
}
