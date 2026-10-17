package x8j;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f303427w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f303427w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f303427w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f303427w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f303427w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((mcj.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((t7j.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e eVar = this.f303427w;
        switch (i) {
            case 0:
                n nVar = eVar.d;
                l lVar = (l) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (lVar instanceof f) {
                    nVar.d3(((f) lVar).f303431a);
                } else if (lVar instanceof h) {
                    n nVar2 = eVar.d;
                    h hVar = (h) lVar;
                    xi0.b bVar = hVar.f303445a;
                    io3.d dVar = hVar.f303446b;
                    nVar2.f3(hVar.d, hVar.f303447c, dVar, bVar, hVar.e);
                } else if (lVar instanceof g) {
                    nVar.e3(((g) lVar).f303433a);
                } else if (lVar instanceof i) {
                    i iVar = (i) lVar;
                    nVar.g3(iVar.f303449a, iVar.f303450b);
                } else if (lVar instanceof j) {
                    j jVar = (j) lVar;
                    nVar.h3(jVar.f303452a, jVar.f303453b, jVar.f303454c);
                } else {
                    if (!(lVar instanceof k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.i3(((k) lVar).f303456a);
                }
                return Unit.f186387a;
            case 1:
                n nVar3 = eVar.d;
                mcj.c cVar = (mcj.c) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(cVar, mcj.a.f204365a)) {
                    nVar3.c3();
                } else {
                    if (!(cVar instanceof mcj.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar3.i3(((mcj.b) cVar).f204366a);
                }
                return Unit.f186387a;
            default:
                t7j.c cVar2 = (t7j.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.d.b3(cVar2.f268743a);
                return Unit.f186387a;
        }
    }
}
