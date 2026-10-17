package ma;

import cli.y;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.a0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f203858w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203858w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f203858w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            default:
                s sVar2 = new s(this.f203858w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((s) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            default:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u uVar = this.f203858w;
        switch (i) {
            case 0:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.f203862r, new ab4.q(th10, 26));
                return Boolean.TRUE;
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = uVar.f203862r;
                fa.j jVar = (fa.j) data.getContent();
                Iterable iterable = jVar != null ? jVar.f133014c : null;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    a0.x(((fa.k) it8.next()).f133016b, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    fa.g gVar = ((fa.h) it9.next()).f133009c;
                    fa.f fVar = gVar instanceof fa.f ? (fa.f) gVar : null;
                    String str = fVar != null ? fVar.f133006a : null;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Set setI1 = d0.i1(arrayList2);
                if (setI1.isEmpty()) {
                    uVar.H2(yVar, new m9l.d(2));
                } else {
                    uVar.n2(new r(uVar, setI1, null), new whi.b(6));
                }
                uVar.H2(yVar, new m58.l(data, 24));
                return Unit.f186387a;
        }
    }
}
