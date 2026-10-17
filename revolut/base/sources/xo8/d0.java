package xo8;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f307695w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(h0 h0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307695w = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f307695w, continuation, 0);
                d0Var.v = obj2;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0(this.f307695w, continuation, 1);
                d0Var2.v = obj2;
                return d0Var2;
            case 2:
                d0 d0Var3 = new d0(this.f307695w, continuation, 2);
                d0Var3.v = obj2;
                return d0Var3;
            case 3:
                d0 d0Var4 = new d0(this.f307695w, continuation, 3);
                d0Var4.v = obj2;
                return d0Var4;
            case 4:
                d0 d0Var5 = new d0(this.f307695w, continuation, 4);
                d0Var5.v = obj2;
                return d0Var5;
            case 5:
                d0 d0Var6 = new d0(this.f307695w, continuation, 5);
                d0Var6.v = obj2;
                return d0Var6;
            default:
                d0 d0Var7 = new d0(this.f307695w, continuation, 6);
                d0Var7.v = obj2;
                return d0Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h0 h0Var = this.f307695w;
        switch (i) {
            case 0:
                h hVar = (h) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new xng.l(hVar, 4));
                break;
            case 1:
                xc8.g gVar = (xc8.g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new xng.l(gVar, 5));
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new xl9.m(data, 7));
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new xl9.m(data2, 8));
                break;
            case 4:
                Pair pair = (Pair) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new xf0.j((Data) pair.f186385a, (ProductAccountId) pair.f186386b, 25));
                break;
            case 5:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new xl9.m(data3, 9));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new xl9.m(data4, 10));
                break;
        }
        return Unit.f186387a;
    }
}
