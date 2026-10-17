package og2;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f225004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f225004w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f225004w, continuation, 0);
            default:
                return new j(this.f225004w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    m mVar = this.f225004w;
                    ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = (ApmPaymentAuthorisationSummary) ((d) ((j2) mVar.f225006p.f22677a).getValue()).f224998a.getContent();
                    if (apmPaymentAuthorisationSummary == null) {
                        return null;
                    }
                    nk9.l lVar = new nk9.l(mVar, apmPaymentAuthorisationSummary, null, 24);
                    this.v = 1;
                    if (q.t(mVar, lVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                m mVar2 = this.f225004w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary2 = (ApmPaymentAuthorisationSummary) ((d) ((j2) mVar2.f225006p.f22677a).getValue()).f224998a.getContent();
                    if (apmPaymentAuthorisationSummary2 != null) {
                        kgm.i iVar = mVar2.o;
                        String str = apmPaymentAuthorisationSummary2.f61992a;
                        j02.o oVar = j02.o.USER_DOES_NOT_RECOGNISE_PAYMENT;
                        this.v = 1;
                        if (iVar.s(str, oVar, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                mVar2.C2(f.f225000a);
                return Unit.f186387a;
        }
    }
}
