package a5b;

import com.revolut.data.model.Data;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;
import y49.h;
import yhm.o;
import zhm.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f1340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1340w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f1340w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f1340w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        ArrayList arrayList;
        int i = this.u;
        g gVar = this.f1340w;
        switch (i) {
            case 0:
                Data data2 = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b2b.a aVar2 = (b2b.a) data2.getContent();
                if (aVar2 != null) {
                    f2b.b bVar = gVar.f1345p;
                    List list = aVar2.f11929a;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        a0.x(((h) it8.next()).f310853l, arrayList2);
                    }
                    ((f3b.f) bVar).c(arrayList2, f2b.a.INVEST_TAB);
                }
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                z1 z1Var = gVar.f1346q;
                try {
                    Object content = data3.getContent();
                    if (content != null) {
                        List<h> list2 = ((b2b.a) content).f11929a;
                        arrayList = new ArrayList();
                        for (h hVar : list2) {
                            String str = hVar.f310853l.size() == 1 ? hVar.f310847a.f214596b : null;
                            if (str != null) {
                                arrayList.add(str);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    data = new Data(arrayList, data3.getError(), data3.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                z1Var.k(data);
                break;
        }
        return Unit.f186387a;
    }
}
