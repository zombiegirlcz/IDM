package ktk;

import gim.i;
import jtk.g;
import jtk.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f189564w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f189564w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f189564w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f189564w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f189564w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((kp3.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e eVar = this.f189564w;
        switch (i) {
            case 0:
                jtk.b bVar = eVar.d;
                h hVar = (h) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (hVar instanceof jtk.f) {
                    bVar.c3(((jtk.f) hVar).f178531a);
                } else {
                    if (!(hVar instanceof g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.d3((g) hVar);
                }
                return Unit.f186387a;
            case 1:
                kp3.a aVar2 = (kp3.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                eVar.d.b3(aVar2);
                return Unit.f186387a;
            default:
                kp3.a aVar4 = (kp3.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                eVar.d.Z2(aVar4.f188164a.b());
                return Unit.f186387a;
        }
    }
}
