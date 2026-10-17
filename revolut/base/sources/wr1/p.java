package wr1;

import as1.z;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f299501w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f299501w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f299501w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f299501w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            default:
                p pVar3 = new p(this.f299501w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((ApmQuote) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((ur1.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u uVar = this.f299501w;
        switch (i) {
            case 0:
                dj0.d dVar = (dj0.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.f299511t, new vtf.b(3, dVar));
                break;
            case 1:
                ApmQuote apmQuote = (ApmQuote) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.f299511t, new as1.t(apmQuote, 3));
                break;
            default:
                ur1.a aVar3 = (ur1.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.f299511t, new z(aVar3, 1));
                break;
        }
        return Unit.f186387a;
    }
}
