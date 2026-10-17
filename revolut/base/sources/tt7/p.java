package tt7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.insurance_credit.impl.ui.screen.details.b f274256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xs7.b f274257x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature.insurance_credit.impl.ui.screen.details.b bVar, xs7.b bVar2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f274256w = bVar;
        this.f274257x = bVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f274256w, this.f274257x, continuation, 0);
            default:
                return new p(this.f274256w, this.f274257x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p) create(continuation)).invokeSuspend(Unit.f186387a);
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
                x xVar = this.f274256w.f75839r;
                String str = ((xs7.a) this.f274257x).f308428a;
                lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, str, aVar2, null, this, 4);
                return objX1 == aVar ? aVar : objX1;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.insurance_credit.impl.ui.screen.details.b bVar = this.f274256w;
                p pVar = new p(bVar, this.f274257x, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "load credit insurance details deeplink", pVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
