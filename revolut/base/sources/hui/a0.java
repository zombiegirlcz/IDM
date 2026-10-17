package hui;

import a83.p0;
import com.revolut.data.model.Data;
import hea.e0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c f155671w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i, com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f155671w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(0, this.f155671w, continuation);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(1, this.f155671w, continuation);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0(2, this.f155671w, continuation);
                a0Var3.v = obj2;
                return a0Var3;
            case 3:
                a0 a0Var4 = new a0(3, this.f155671w, continuation);
                a0Var4.v = obj2;
                return a0Var4;
            case 4:
                a0 a0Var5 = new a0(4, this.f155671w, continuation);
                a0Var5.v = obj2;
                return a0Var5;
            default:
                a0 a0Var6 = new a0(5, this.f155671w, continuation);
                a0Var6.v = obj2;
                return a0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 27;
        com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar = this.f155671w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.B, new fvk.q(list, i2));
                break;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.B, new p0((Data) pair.f186385a, (Data) pair.f186386b, 22));
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.B, new e0(data, 27));
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.B, new e0(data2, 28));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.B, new e0(data3, 29));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.B, new c0(data4, 0));
                break;
        }
        return Unit.f186387a;
    }
}
