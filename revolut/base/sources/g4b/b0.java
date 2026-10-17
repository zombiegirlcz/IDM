package g4b;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.positions.a f140435w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(com.revolut.feature.retail.cfd.impl.screens.positions.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140435w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f140435w, continuation, 0);
                b0Var.v = obj2;
                return b0Var;
            case 1:
                b0 b0Var2 = new b0(this.f140435w, continuation, 1);
                b0Var2.v = obj2;
                return b0Var2;
            default:
                b0 b0Var3 = new b0(this.f140435w, continuation, 2);
                b0Var3.v = obj2;
                return b0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b0) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listC;
        int i = this.u;
        com.revolut.feature.retail.cfd.impl.screens.positions.a aVar = this.f140435w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f82270t, new fv6.r(data, 26));
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f82270t, new fv6.r(data2, 27));
                return Unit.f186387a;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVar = (k) data3.getContent();
                if (kVar != null) {
                    f2b.b bVar = aVar.f82269s;
                    if (kVar instanceof j) {
                        listC = zhm.u.c(((j) kVar).f140441a.f310833b);
                    } else {
                        if (!(kVar instanceof i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listC = ((i) kVar).f140436a.f310853l;
                    }
                    ((f3b.f) bVar).c(listC, f2b.a.CFD_POSITION_DETAILS);
                }
                aVar.H2(aVar.f82270t, new fv6.r(data3, 28));
                return Unit.f186387a;
        }
    }
}
