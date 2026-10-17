package hve;

import com.revolut.feature.topup_screen.impl.data.repository.topup_methods.TopUpMethodsRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f155843w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155843w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f155843w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f155843w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((TopUpMethodsRequest) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        o oVar = this.f155843w;
        switch (i) {
            case 0:
                a aVar = (a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jve.a aVarB = ((kve.b) oVar.f).b(aVar.f155819a);
                if (aVarB != null) {
                    return mue.a.a(aVarB);
                }
                return null;
            default:
                TopUpMethodsRequest topUpMethodsRequest = (TopUpMethodsRequest) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kve.c cVarA = ((kve.b) oVar.f).a(topUpMethodsRequest.f90581a);
                if (cVarA != null) {
                    return oVar.d.b(cVarA);
                }
                return null;
        }
    }
}
