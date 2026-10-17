package bxb;

import a2g.p;
import a83.d0;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f19653w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f19653w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f19653w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f19653w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j(this.f19653w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            default:
                j jVar4 = new j(this.f19653w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l lVar = this.f19653w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l80.f) lVar.f19656r).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                List list2 = list;
                boolean z = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (hx7.b.p((UserVoucher) it8.next(), jCurrentTimeMillis)) {
                                z = true;
                            }
                        }
                    }
                }
                lVar.H2(lVar.f19657s, new p(z, 24));
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (!hx7.b.p((UserVoucher) obj3, jCurrentTimeMillis)) {
                        arrayList.add(obj3);
                    }
                }
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lVar.H2(lVar.f19657s, new bmj.g(data, 26));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lVar.H2(lVar.f19657s, new bmj.g(data2, 27));
                break;
            default:
                Set set = (Set) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lVar.H2(lVar.f19657s, new d0(7, set));
                break;
        }
        return Unit.f186387a;
    }
}
