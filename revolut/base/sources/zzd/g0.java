package zzd;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.documents_hub.a f326680w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.revolut.feature.statements.impl.ui.documents_hub.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f326680w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g0 g0Var = new g0(this.f326680w, continuation, 0);
                g0Var.v = obj2;
                return g0Var;
            default:
                g0 g0Var2 = new g0(this.f326680w, continuation, 1);
                g0Var2.v = obj2;
                return g0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g0) create((a0e.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.statements.impl.ui.documents_hub.a aVar = this.f326680w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new zp5.f(data, aVar, 26));
                aVar.M2();
                break;
            default:
                a0e.r rVar = (a0e.r) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new u(rVar, 1));
                break;
        }
        return Unit.f186387a;
    }
}
