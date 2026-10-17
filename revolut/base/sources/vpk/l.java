package vpk;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ g f291240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b80.c f291241x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f291242y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(b80.c cVar, p pVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f291241x = cVar;
        this.f291242y = pVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        g gVar = (g) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l lVar = new l(this.f291241x, this.f291242y, continuation, 0);
                lVar.f291240w = gVar;
                return lVar.invokeSuspend(Unit.f186387a);
            case 1:
                l lVar2 = new l(this.f291241x, this.f291242y, continuation, 1);
                lVar2.f291240w = gVar;
                return lVar2.invokeSuspend(Unit.f186387a);
            default:
                l lVar3 = new l(this.f291241x, this.f291242y, continuation, 2);
                lVar3.f291240w = gVar;
                return lVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object objA;
        int i = this.u;
        p pVar = this.f291242y;
        b80.c cVar = this.f291241x;
        Long lValueOf = null;
        switch (i) {
            case 0:
                g gVar = this.f291240w;
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
                k kVar = new k(gVar, pVar, null, 1);
                this.f291240w = null;
                this.v = 1;
                Object objM0 = te0.w.m0(cVar, kVar, this);
                return objM0 == aVar ? aVar : objM0;
            case 1:
                qe0.s sVar = pVar.f291251g;
                g gVar2 = this.f291240w;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                } catch (Throwable th10) {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    m.Companion companion2 = yhm.m.INSTANCE;
                    n nVar = new n(gVar2, pVar, null, 0);
                    this.f291240w = gVar2;
                    this.v = 1;
                    obj2 = te0.w.m0(cVar, nVar, this);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                objA = (qta.d) obj2;
                m.Companion companion3 = yhm.m.INSTANCE;
                obj3 = objA;
                if (!(obj3 instanceof yhm.n)) {
                    qta.d dVar = (qta.d) obj3;
                    if (pVar.b()) {
                        String strF = p.f(gVar2);
                        List list = dVar.e;
                        List list2 = dVar.e;
                        if (list.size() >= 2) {
                            int size = list2.size();
                            lValueOf = Long.valueOf(((Number) ((Pair) list2.get(size - 1)).f186385a).longValue() - ((Number) ((Pair) list2.get(size - 2)).f186385a).longValue());
                        }
                        sVar.g(strF, lValueOf);
                    }
                }
                Throwable thA = yhm.m.a(obj3);
                if (thA != null && !(thA instanceof CancellationException) && pVar.b()) {
                    sVar.e(p.f(gVar2));
                }
                yhm.o.b(obj3);
                return obj3;
            default:
                g gVar3 = this.f291240w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar2 = new n(gVar3, pVar, null, 1);
                this.f291240w = null;
                this.v = 1;
                Object objM02 = te0.w.m0(cVar, nVar2, this);
                return objM02 == aVar2 ? aVar2 : objM02;
        }
    }
}
