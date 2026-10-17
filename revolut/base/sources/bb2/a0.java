package bb2;

import b4b.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payid.impl.screen.settings.a f14133w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.feature.apm.payid.impl.screen.settings.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f14133w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.f14133w, continuation, 0);
            default:
                return new a0(this.f14133w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.apm.payid.impl.screen.settings.a aVar = this.f14133w;
                cli.y yVar = aVar.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    aVar.f62734p.a("IDEMPOTENCY_TAG_CHECK_ALIAS_AVAILABILITY");
                    aVar.H2(yVar, new b96.a(21));
                    vw1.b bVar = aVar.o;
                    this.v = 1;
                    obj2 = ((uy1.j) bVar).g(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar.H2(yVar, new d0(zi0.c.P(obj2, false, null, 3), 18));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.payid.impl.screen.settings.a aVar4 = this.f14133w;
                    aVar4.H2(aVar4.v, new b96.a(22));
                    vw1.b bVar2 = aVar4.o;
                    this.v = 1;
                    if (((uy1.j) bVar2).j(true, this) == aVar3) {
                        return aVar3;
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
