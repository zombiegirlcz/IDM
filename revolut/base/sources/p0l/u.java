package p0l;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f231569w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Continuation continuation) {
        super(2, continuation);
        this.f231569w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.f231569w, continuation);
        uVar.v = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((p0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        p0.a aVar = (p0.a) this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            v vVar = this.f231569w;
            t tVar = new t(aVar, vVar, null);
            this.v = null;
            this.u = 1;
            if (pu7.a.B(vVar.k, "promptPrimaryActionClick", tVar, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
