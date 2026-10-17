package yg5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f313538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f313539x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f313538w = uVar;
        this.f313539x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f313538w, this.f313539x, continuation, 0);
            default:
                return new t(this.f313538w, this.f313539x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
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
                x xVar = this.f313538w.u;
                lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                Boolean bool = Boolean.FALSE;
                this.v = 1;
                Object objL1 = xVar.L1(this.f313539x, aVar2, bool, this);
                return objL1 == aVar ? aVar : objL1;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    f80.b bVar = (f80.b) this.f313538w.v;
                    String str = this.f313539x;
                    if (bVar.e(str)) {
                        ack.n nVar = new ack.n(17);
                        u uVar = this.f313538w;
                        t tVar = new t(uVar, str, null, 0);
                        this.v = 1;
                        if (n14.k.Q(uVar, null, null, nVar, tVar, this, 3) == aVar3) {
                            return aVar3;
                        }
                    }
                    return Unit.f186387a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                return Unit.f186387a;
        }
    }
}
