package h6i;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f149706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p0 f149707y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(List list, p0 p0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149706x = list;
        this.f149707y = p0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o0 o0Var = new o0(this.f149706x, this.f149707y, continuation, 0);
                o0Var.f149705w = obj2;
                return o0Var;
            default:
                o0 o0Var2 = new o0(this.f149706x, this.f149707y, continuation, 1);
                o0Var2.f149705w = obj2;
                return o0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        long jLongValue;
        switch (this.u) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f149705w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                p0 p0Var = this.f149707y;
                if (i == 0) {
                    yhm.o.b(obj2);
                    List list = this.f149706x;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(skm.e0.g(coroutineScope, null, null, new n0((k1j.b) it8.next(), p0Var, null), 3));
                    }
                    this.f149705w = null;
                    this.v = 1;
                    obj2 = skm.e0.h(arrayList, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ArrayList<k1j.b> arrayList2 = new ArrayList();
                for (Object obj3 : (Iterable) obj2) {
                    if (!((k1j.b) obj3).f180284c.isEmpty()) {
                        arrayList2.add(obj3);
                    }
                }
                Long l2 = p0Var.d;
                if (l2 != null) {
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                    for (k1j.b bVar : arrayList2) {
                        List list2 = bVar.f180284c;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list2) {
                            BalanceWrapper balanceWrapper = (BalanceWrapper) obj4;
                            dj0.d f = balanceWrapper.getF();
                            if (f != null) {
                                jLongValue = f.f115082a;
                            } else {
                                Long l3 = balanceWrapper.f99405b;
                                jLongValue = l3 != null ? l3.longValue() : 0L;
                            }
                            if (jLongValue >= l2.longValue()) {
                                arrayList4.add(obj4);
                            }
                        }
                        arrayList3.add(k1j.b.a(bVar, arrayList4));
                    }
                    arrayList2 = arrayList3;
                }
                return zi0.c.P(arrayList2, false, null, 3);
            default:
                FlowCollector flowCollector = (FlowCollector) this.f149705w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    o0 o0Var = new o0(this.f149706x, this.f149707y, continuation, 0);
                    this.f149705w = flowCollector;
                    this.v = 1;
                    obj2 = skm.e0.o(o0Var, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.f149705w = null;
                this.v = 2;
                if (flowCollector.emit((Data) obj2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
