package k25;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f180340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, Continuation continuation) {
        super(2, continuation);
        this.f180340w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f180340w, continuation);
                nVar.v = obj2;
                return nVar;
            default:
                n nVar2 = new n(continuation, this.f180340w);
                nVar2.v = obj2;
                return nVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x15.k kVar = x15.k.f302279a;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVar = u.Companion;
                return list.isEmpty() ? nim.a.v(this.f180340w.s(), new k1g.n(13)) : zi0.c.i(new x15.n(list, kVar));
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar = (yhm.r) pair.f186385a;
                Pair pair2 = (Pair) pair.f186386b;
                Object obj3 = rVar.f314201a;
                Object obj4 = rVar.f314202b;
                Object obj5 = rVar.f314203c;
                Object obj6 = pair2.f186385a;
                cl4.a aVar3 = (cl4.a) obj4;
                Set set = (Set) obj3;
                cl4.e eVar = new cl4.e(((Boolean) obj5).booleanValue(), ((Boolean) obj6).booleanValue(), ((Boolean) pair2.f186386b).booleanValue());
                b bVar2 = u.Companion;
                if (set.isEmpty()) {
                    return kVar;
                }
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it8 = set2.iterator();
                    while (it8.hasNext()) {
                        if (((yw4.i) it8.next()).f317318a) {
                            return kVar;
                        }
                    }
                }
                return new x15.j(aVar3, eVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Continuation continuation, u uVar) {
        super(2, continuation);
        this.f180340w = uVar;
    }
}
