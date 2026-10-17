package xmd;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f307195w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307195w = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r0 r0Var = new r0(this.f307195w, continuation, 0);
                r0Var.v = obj2;
                return r0Var;
            default:
                r0 r0Var2 = new r0(this.f307195w, continuation, 1);
                r0Var2.v = obj2;
                return r0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r0) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        s0 s0Var = this.f307195w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0Var.H2(s0Var.f307199s, new xl9.m(data, 3));
                return Unit.f186387a;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0Var.getClass();
                return Boolean.valueOf(!((((o) data2.getContent()) != null ? r5.f307186b : null) instanceof m));
        }
    }
}
