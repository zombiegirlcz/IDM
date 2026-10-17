package u9a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o9a.a0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pix.impl.flow.automatico.screens.details.a f278438w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f278438w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(0, this.f278438w, continuation);
            case 1:
                return new q(1, this.f278438w, continuation);
            default:
                return new q(2, this.f278438w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar = this.f278438w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ryc.a aVar3 = aVar.f80616q;
                    String str = aVar.o.f80611a;
                    this.v = 1;
                    n8a.s sVar = (n8a.s) aVar3.f258289a;
                    sVar.getClass();
                    n8a.q qVar = new n8a.q(sVar, str, null, 1);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, qVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar.H2(aVar.f80620w, new a0((g8a.k) obj2, 2));
                return Unit.f186387a;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ryc.a aVar5 = aVar.f80616q;
                    String str2 = aVar.o.f80611a;
                    this.v = 1;
                    n8a.s sVar2 = (n8a.s) aVar5.f258289a;
                    sVar2.getClass();
                    n8a.q qVar2 = new n8a.q(sVar2, str2, null, 2);
                    p0 p0Var2 = p0.f264001a;
                    if (e0.J(elm.f.f127540b, qVar2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar.B2();
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    su4.n nVar = new su4.n(aVar, continuation, 23);
                    this.v = 1;
                    if (aVar.p2(this, nVar) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
