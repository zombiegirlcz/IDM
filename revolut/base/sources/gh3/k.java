package gh3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f143844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f143845x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f143844w = lVar;
        this.f143845x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f143844w, this.f143845x, continuation, 0);
            default:
                return new k(this.f143844w, this.f143845x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                x xVar = this.f143844w.f143848r;
                lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                Boolean bool = Boolean.FALSE;
                this.v = 1;
                Object objL1 = xVar.L1(this.f143845x, aVar2, bool, this);
                return objL1 == aVar ? aVar : objL1;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    f80.b bVar = (f80.b) this.f143844w.f143849s;
                    String str = this.f143845x;
                    if (bVar.e(str)) {
                        ack.n nVar = new ack.n(17);
                        l lVar = this.f143844w;
                        k kVar = new k(lVar, str, null, 0);
                        this.v = 1;
                        if (n14.k.Q(lVar, null, null, nVar, kVar, this, 3) == aVar3) {
                            return aVar3;
                        }
                    }
                    return Unit.f186387a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return Unit.f186387a;
        }
    }
}
