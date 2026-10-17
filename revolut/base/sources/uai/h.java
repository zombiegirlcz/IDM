package uai;

import aii.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l2c.l;
import su4.n;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f278670w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278670w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f278670w, continuation, 0);
            default:
                h hVar = new h(this.f278670w, continuation, 1);
                hVar.v = ((Number) obj2).intValue();
                return hVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create(Integer.valueOf(((Number) obj2).intValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r cVar;
        int i = this.u;
        i iVar = this.f278670w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    n nVar = new n(iVar, null, 24);
                    this.v = 1;
                    obj2 = iVar.p2(this, nVar);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                zlg.f fVar = (zlg.f) obj2;
                if (fVar instanceof zlg.e) {
                    cVar = new c(((zlg.e) fVar).f323254a);
                } else {
                    if (!Intrinsics.f(fVar, zlg.d.f323253a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = b.f278664a;
                }
                iVar.C2(cVar);
                return Unit.f186387a;
            default:
                int i3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f278674s, new l(i3, 23));
                return Unit.f186387a;
        }
    }
}
