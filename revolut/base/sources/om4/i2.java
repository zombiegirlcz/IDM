package om4;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class i2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x2 f226602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w4l.k f226603x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(x2 x2Var, w4l.k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226602w = x2Var;
        this.f226603x = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i2 i2Var = new i2(this.f226602w, this.f226603x, continuation, 0);
                i2Var.v = obj2;
                return i2Var;
            case 1:
                i2 i2Var2 = new i2(this.f226602w, this.f226603x, continuation, 1);
                i2Var2.v = obj2;
                return i2Var2;
            default:
                i2 i2Var3 = new i2(this.f226602w, this.f226603x, continuation, 2);
                i2Var3.v = obj2;
                return i2Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i2) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i2) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i2) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowB;
        int i = this.u;
        w4l.k kVar = this.f226603x;
        x2 x2Var = this.f226602w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                if (list.isEmpty()) {
                    return new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
                }
                List list3 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (true) {
                    int i2 = 1;
                    if (!it8.hasNext()) {
                        Flow[] flowArr = (Flow[]) arrayList.toArray(new Flow[0]);
                        return nim.a.v(zh9.u0.l((Flow[]) Arrays.copyOf(flowArr, flowArr.length)), new f2(x2Var, list2, i2));
                    }
                    yw4.p pVar = (yw4.p) it8.next();
                    int i3 = h2.f226594a[pVar.f317331l.ordinal()];
                    if (i3 == 1) {
                        flowB = x2.b(x2Var, pVar, kVar);
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowB = x2.a(x2Var, pVar, kVar);
                    }
                    arrayList.add(flowB);
                }
                break;
            case 1:
                xi0.b bVar = (xi0.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(x2Var.d.e(kVar), new i5f.g(29, bVar));
            default:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return x2Var.A(str, kVar);
        }
    }
}
