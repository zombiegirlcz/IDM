package hi2;

import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f152464w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f152464w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f152464w, continuation, 0);
            default:
                return new m(this.f152464w, continuation, 1);
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
                n nVar = this.f152464w;
                gi2.i iVar = new gi2.i(nVar, nVar.I2(), null, 29);
                this.v = 1;
                Object objT = q.t(nVar, iVar, this);
                return objT == aVar ? aVar : objT;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                n nVar2 = this.f152464w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    m mVar = new m(nVar2, null, 0);
                    this.v = 1;
                    obj2 = u0.b0(nVar2.X(), "WERO_QR_AMOUNT_CTA_BUTTON_TAG", mVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nVar2.C2(new h((jh2.a) obj2));
                return Unit.f186387a;
        }
    }
}
