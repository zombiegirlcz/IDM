package m1a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import zhm.a0;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f201311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f201312x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list, i iVar, Continuation continuation) {
        super(2, continuation);
        this.f201311w = list;
        this.f201312x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.f201311w, this.f201312x, continuation);
        hVar.v = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            List list = this.f201311w;
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                a0.x(((v61.g) it8.next()).d, arrayList);
            }
            List listU = d0.U(arrayList);
            ArrayList arrayList2 = new ArrayList(w.t(listU, 10));
            Iterator it9 = listU.iterator();
            while (it9.hasNext()) {
                arrayList2.add(e0.g(coroutineScope, null, null, new g((v61.f) it9.next(), this.f201312x, null), 3));
            }
            this.v = null;
            this.u = 1;
            obj2 = e0.h(arrayList2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return r0.t((Iterable) obj2);
    }
}
