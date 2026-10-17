package ahf;

import com.revolut.data.model.Data;
import ggc.g0;
import ggc.h0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f5097w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(z zVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f5097w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f5097w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f5097w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            case 2:
                u uVar3 = new u(this.f5097w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
            default:
                u uVar4 = new u(this.f5097w, continuation, 3);
                uVar4.v = obj2;
                return uVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((u) create((k71.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((vf0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        int i2 = 0;
        z zVar = this.f5097w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) data.getContent();
                if (list != null) {
                    List<g0> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (g0 g0Var : list2) {
                            Iterator it8 = g0Var.e.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((h0) next).f143632b, g0Var.d)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            h0 h0Var = (h0) next;
                            if (h0Var != null && h0Var.f && (i2 = i2 + 1) < 0) {
                                zhm.v.r();
                                throw null;
                            }
                        }
                    }
                }
                zVar.H2(zVar.N, new a5g.i(i2, 2));
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zVar.H2(zVar.N, new af4.t(data2, 13));
                return Unit.f186387a;
            case 2:
                k71.q qVar = (k71.q) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zVar.H2(zVar.N, new v(qVar, 0));
                return Unit.f186387a;
            default:
                vf0.k kVar = (vf0.k) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zVar.H2(zVar.N, new a5b.a((Data) kVar.f288454a, (Data) kVar.f288455b, (Data) kVar.f288456c, (lgf.a) kVar.d, (Data) kVar.e, 1));
                return Unit.f186387a;
        }
    }
}
