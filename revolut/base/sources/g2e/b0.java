package g2e;

import d9.e1;
import f2e.s0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f139973w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(c0 c0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139973w = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f139973w, continuation, 0);
                b0Var.v = obj2;
                return b0Var;
            default:
                b0 b0Var2 = new b0(this.f139973w, continuation, 1);
                b0Var2.v = obj2;
                return b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((b0) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                return ((b0) create((v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw null;
            default:
                v vVar = (v) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0Var = (s0) this.f139973w.f139978c.T2("STORE_DEALS_LAYOUT_STORAGE_KEY_" + c0.b(vVar), s0.class);
                if (s0Var != null) {
                    return e1.T(s0Var);
                }
                return null;
        }
    }
}
