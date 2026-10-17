package nyb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.r0;
import m1c.u0;
import m1c.v0;
import vkm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v0 f220834w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, v0 v0Var, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
        this.f220834w = v0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, this.f220834w, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((r0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r0 r0Var = (r0) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        int i = r.f220833a[r0Var.f201447a.ordinal()];
        if (i == 1) {
            return new go.g(zi0.c.P(u0.a.f201459a, false, null, 3), 2);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        v vVar = this.v;
        nxb.e eVar = (nxb.e) vVar.f220838b;
        eVar.getClass();
        v0 type = this.f220834w;
        Intrinsics.checkNotNullParameter(type, "type");
        return vkm.q.Q(new v1(new mtj.i(eVar, type, null)), new k25.o(null, vVar, type, 24));
    }
}
