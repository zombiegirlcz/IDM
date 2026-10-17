package y3f;

import com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter;
import dfl.r0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import n3f.c0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f310723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v f310724x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f310724x = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f310724x, continuation, 0);
                tVar.f310723w = obj2;
                return tVar;
            default:
                t tVar2 = new t(this.f310724x, continuation, 1);
                tVar2.f310723w = obj2;
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((z2f.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((z2f.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                z2f.c cVar = (z2f.c) this.f310723w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    if (cVar == null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j3f.f fVar = this.f310724x.e;
                    String str = cVar.f319063a;
                    this.f310723w = null;
                    this.v = 1;
                    obj2 = fVar.e(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                c0 c0Var = (c0) obj2;
                if (c0Var != null) {
                    return u3f.d.h(c0Var);
                }
                return null;
            default:
                z2f.g gVar = (z2f.g) this.f310723w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    j3f.f fVar2 = this.f310724x.e;
                    TradingTransactionsFilter.TradingTransactionsFilterImpl tradingTransactionsFilterImplA = com.revolut.shared.feature.wealth.models.transaction.a.a(gVar.a());
                    Instant instantB = gVar.b();
                    Long l2 = instantB != null ? new Long(instantB.toEpochMilli()) : null;
                    Instant instantD = gVar.d();
                    Long l3 = instantD != null ? new Long(instantD.toEpochMilli()) : null;
                    int iC = gVar.c();
                    this.f310723w = null;
                    this.v = 1;
                    fVar2.getClass();
                    obj2 = fVar2.f(j3f.f.c(tradingTransactionsFilterImplA, l2, l3, iC), this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Iterable iterable = (Iterable) obj2;
                ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(u3f.d.h((c0) it8.next()));
                }
                List list = (List) ue0.e.M(arrayList);
                if (list != null) {
                    return new r0(list, list.size(), null, null);
                }
                return null;
        }
    }
}
