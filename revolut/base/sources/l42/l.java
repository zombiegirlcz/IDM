package l42;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b f192046w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f192046w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f192046w, continuation, 0);
            default:
                return new l(this.f192046w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar = this.f192046w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b.I2(bVar, null, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    wz1.f fVar = bVar.f62414q;
                    String str = bVar.o.f62277a;
                    this.v = 1;
                    fVar.getClass();
                    wz1.e eVar = new wz1.e(fVar, str, null, 1);
                    p0 p0Var = p0.f264001a;
                    if (e0.J(elm.f.f127540b, eVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar.B2();
                return Unit.f186387a;
        }
    }
}
