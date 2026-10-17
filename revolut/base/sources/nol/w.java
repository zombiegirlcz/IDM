package nol;

import akl.e1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f218103w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.sso.impl.ui.phone.change_flow.b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f218103w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.v, this.f218103w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        e1 e1Var = (e1) this.v.f106658t;
        e1Var.getClass();
        jhi.b bVarG = mo3.a.g(nim.a.v(e1Var.f6010m.b(Unit.f186387a, w4l.h.f294642c), new nj8.b(this.f218103w, 13)), null, null, 3);
        this.u = 1;
        Object objZ = vkm.q.z(bVarG, this);
        return objZ == aVar ? aVar : objZ;
    }
}
