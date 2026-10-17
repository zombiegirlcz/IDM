package n87;

import cli.y;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import om4.d0;
import skm.e0;
import skm.p0;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f213262w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213262w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f213262w, continuation, 0);
            case 1:
                return new o(this.f213262w, continuation, 1);
            default:
                return new o(this.f213262w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        List list;
        int i = this.u;
        q qVar = this.f213262w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                mtd.e eVar = new mtd.e(qVar, null, 6);
                this.v = 1;
                Object objB = pu7.a.B(qVar.k, "global-markets-collections-dismiss-reorder-tip", eVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                y yVar = qVar.f213267s;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    Data data = ((k) ((j2) yVar.f22677a).getValue()).f213255b;
                    if (data == null || (list = (List) data.getContent()) == null) {
                        return Unit.f186387a;
                    }
                    ou5.b bVar = qVar.o;
                    h87.f fVar = ((k) ((j2) yVar.f22677a).getValue()).f213254a;
                    this.v = 1;
                    d0 d0Var = (d0) bVar.d;
                    String strA = fVar.a();
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((vel.f) it8.next()).a());
                    }
                    sma.f fVar2 = new sma.f(d0Var, strA, arrayList, (Continuation) null, 11);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, fVar2, this);
                    Object obj4 = fim.a.COROUTINE_SUSPENDED;
                    if (objJ != obj4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    ou5.b bVar2 = qVar.o;
                    h87.f fVar3 = ((k) ((j2) qVar.f213267s.f22677a).getValue()).f213254a;
                    this.v = 1;
                    if (bVar2.D(fVar3, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
