package cea;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.linked_account_details.a f23464w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f23464w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f23464w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(this.f23464w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
            case 2:
                v vVar3 = new v(this.f23464w, continuation, 2);
                vVar3.v = obj2;
                return vVar3;
            default:
                v vVar4 = new v(this.f23464w, continuation, 3);
                vVar4.v = obj2;
                return vVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((dda.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar = this.f23464w;
        switch (i) {
            case 0:
                dda.a aVar2 = (dda.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ArrayList arrayList = aVar2.f113159a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof dda.d) {
                        arrayList2.add(obj3);
                    }
                }
                for (Object obj4 : arrayList2) {
                    if (Intrinsics.f(((dda.d) obj4).f113167a, aVar.o.f80812a.f163145a)) {
                        return obj4;
                    }
                }
                return null;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.I, new cbf.i(data, 12));
                return Unit.f186387a;
            case 2:
                List list = (List) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((ho3.b) next).f154220a, aVar.o.f80812a.o)) {
                        }
                    } else {
                        next = null;
                    }
                }
                ho3.b bVar = (ho3.b) next;
                if (bVar != null) {
                    return bVar.f154221b;
                }
                return null;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.I, new cbf.i(data2, 13));
                return Unit.f186387a;
        }
    }
}
