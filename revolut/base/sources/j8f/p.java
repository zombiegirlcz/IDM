package j8f;

import b8f.z;
import i6f.j0;
import i6f.l0;
import i6f.m0;
import i6f.n0;
import i6f.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f172208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f172208w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f172208w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f172208w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            case 2:
                p pVar3 = new p(this.f172208w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
            case 3:
                p pVar4 = new p(this.f172208w, continuation, 3);
                pVar4.v = obj2;
                return pVar4;
            case 4:
                p pVar5 = new p(this.f172208w, continuation, 4);
                pVar5.v = obj2;
                return pVar5;
            case 5:
                p pVar6 = new p(this.f172208w, continuation, 5);
                pVar6.v = obj2;
                return pVar6;
            default:
                p pVar7 = new p(this.f172208w, continuation, 6);
                pVar7.v = obj2;
                return pVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((l8f.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((o6f.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((p) create((t6f.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((p) create((j6f.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((p) create((b7f.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((p) create((d1h.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((r6f.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q qVar = this.f172208w;
        switch (i) {
            case 0:
                l8f.b bVar = (l8f.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f172214w, new j87.m(bVar, 1));
                break;
            case 1:
                o6f.a aVar2 = (o6f.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f172214w, new n0(aVar2));
                break;
            case 2:
                t6f.h hVar = (t6f.h) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f172214w, new l0(hVar, 1));
                break;
            case 3:
                j6f.a aVar5 = (j6f.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f172214w, new o0(aVar5, 1));
                break;
            case 4:
                b7f.c cVar = (b7f.c) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f172214w, new j0(cVar, 1));
                break;
            case 5:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f172214w, new z(gVar, 9));
                break;
            default:
                r6f.e eVar = (r6f.e) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f172214w, new m0(eVar, 1));
                break;
        }
        return Unit.f186387a;
    }
}
