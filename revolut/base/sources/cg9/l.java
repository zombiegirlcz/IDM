package cg9;

import com.revolut.feature.apm.bills.core.api.model.Bill;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f23879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Bill f23880x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Bill bill, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f23879w = nVar;
        this.f23880x = bill;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f23879w, this.f23880x, continuation, 0);
            default:
                return new l(this.f23879w, this.f23880x, continuation, 1);
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        Bill bill = this.f23880x;
        n nVar = this.f23879w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wo1.b bVar = nVar.o;
                String str = bill.e;
                this.v = 1;
                rp1.b bVar2 = new rp1.b(((vp1.c) bVar).f291042a, str, null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, bVar2, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                l lVar = new l(nVar, bill, continuation, i2);
                this.v = 1;
                Object objP2 = nVar.p2(this, lVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
