package vz1;

import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsService;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public ApmPaymentAuthorisationSummary v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f293358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f293359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f293360y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f293359x = gVar;
        this.f293360y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f293359x, this.f293360y, continuation, 0);
            case 1:
                return new e(this.f293359x, this.f293360y, continuation, 1);
            default:
                return new e(this.f293359x, this.f293360y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f293358w;
                String str = this.f293360y;
                g gVar = this.f293359x;
                if (i == 0) {
                    o.b(obj2);
                    ApmPaymentAuthorisationsService apmPaymentAuthorisationsService = gVar.f293363a;
                    this.f293358w = 1;
                    obj2 = apmPaymentAuthorisationsService.deactivatePaymentAuthorisation(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = this.v;
                        o.b(obj2);
                        return apmPaymentAuthorisationSummary;
                    }
                    o.b(obj2);
                }
                ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummaryA = l02.c.a((k02.e) obj2);
                x4l.c cVar = gVar.d;
                this.v = apmPaymentAuthorisationSummaryA;
                this.f293358w = 2;
                return cVar.f(str, apmPaymentAuthorisationSummaryA, this) == aVar ? aVar : apmPaymentAuthorisationSummaryA;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f293358w;
                String str2 = this.f293360y;
                g gVar2 = this.f293359x;
                if (i2 == 0) {
                    o.b(obj2);
                    ApmPaymentAuthorisationsService apmPaymentAuthorisationsService2 = gVar2.f293363a;
                    this.f293358w = 1;
                    obj2 = apmPaymentAuthorisationsService2.pausePaymentAuthorisation(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary2 = this.v;
                        o.b(obj2);
                        return apmPaymentAuthorisationSummary2;
                    }
                    o.b(obj2);
                }
                ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummaryA2 = l02.c.a((k02.e) obj2);
                x4l.c cVar2 = gVar2.d;
                this.v = apmPaymentAuthorisationSummaryA2;
                this.f293358w = 2;
                return cVar2.f(str2, apmPaymentAuthorisationSummaryA2, this) == aVar2 ? aVar2 : apmPaymentAuthorisationSummaryA2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f293358w;
                String str3 = this.f293360y;
                g gVar3 = this.f293359x;
                if (i3 == 0) {
                    o.b(obj2);
                    ApmPaymentAuthorisationsService apmPaymentAuthorisationsService3 = gVar3.f293363a;
                    this.f293358w = 1;
                    obj2 = apmPaymentAuthorisationsService3.unpausePaymentAuthorisation(str3, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary3 = this.v;
                        o.b(obj2);
                        return apmPaymentAuthorisationSummary3;
                    }
                    o.b(obj2);
                }
                ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummaryA3 = l02.c.a((k02.e) obj2);
                x4l.c cVar3 = gVar3.d;
                this.v = apmPaymentAuthorisationSummaryA3;
                this.f293358w = 2;
                return cVar3.f(str3, apmPaymentAuthorisationSummaryA3, this) == aVar3 ? aVar3 : apmPaymentAuthorisationSummaryA3;
        }
    }
}
