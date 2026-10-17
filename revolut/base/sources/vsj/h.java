package vsj;

import androidx.room.util.DBUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q qVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                psj.a aVar2 = qVar.f291837a;
                List list = (List) DBUtil.performBlocking(aVar2.f239489a, true, false, new pp5.d(aVar2, 23));
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(i2b.a.y((rsj.a) it8.next()));
                }
                return arrayList;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVar = q.Companion;
                return qVar.g();
        }
    }
}
