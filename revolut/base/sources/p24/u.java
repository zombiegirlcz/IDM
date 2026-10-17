package p24;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f232066w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f232066w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f232066w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            default:
                u uVar2 = new u(this.f232066w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((x) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        v vVar = this.f232066w;
        switch (i) {
            case 0:
                w wVar = (w) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f24.k kVar = (f24.k) vVar.f232069c.a(wVar);
                if (kVar != null) {
                    return v04.b.q(kVar);
                }
                return null;
            default:
                x xVar = (x) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return vVar.f232069c.a(xVar);
        }
    }
}
