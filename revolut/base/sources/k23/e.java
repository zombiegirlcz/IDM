package k23;

import do3.n;
import gim.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ e7l.f f180314w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        n nVar = (n) obj2;
        e7l.f fVar = (e7l.f) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(3, 0, continuation);
                eVar.v = nVar;
                eVar.f180314w = fVar;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(3, 1, continuation);
                eVar2.v = nVar;
                eVar2.f180314w = fVar;
                return eVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = true;
        boolean z3 = false;
        switch (this.u) {
            case 0:
                n nVar = this.v;
                e7l.f fVar = this.f180314w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = fVar.I0;
                if (list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it8 = list2.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                if (w.S(nVar, (wi0.b) it8.next())) {
                                    z = false;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                n nVar2 = this.v;
                e7l.f fVar2 = this.f180314w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list3 = fVar2.K0;
                if (list3 != null) {
                    List list4 = list3;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        z = false;
                        z3 = z;
                    } else {
                        Iterator it9 = list4.iterator();
                        while (it9.hasNext()) {
                            if (w.S(nVar2, (wi0.b) it9.next())) {
                                z3 = z;
                            }
                        }
                        z = false;
                        z3 = z;
                    }
                }
                return Boolean.valueOf(z3);
        }
    }
}
