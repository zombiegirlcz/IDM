package ek7;

import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import com.revolut.kompot.common.ExternalDestination;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CFACInsuranceReviewClaimScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CFACInsuranceReviewClaimScreen cFACInsuranceReviewClaimScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cFACInsuranceReviewClaimScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            case 3:
                return new c(this.v, continuation, 3);
            default:
                return new c(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CFACInsuranceReviewClaimScreen cFACInsuranceReviewClaimScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) cFACInsuranceReviewClaimScreen.T2();
                pVar.getClass();
                pVar.v2(new k(new CFACInsuranceClaimFlowContract$Step.SupportingDocuments(6)));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cFACInsuranceReviewClaimScreen.m2().onBackPressed();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                knm.b.j(cFACInsuranceReviewClaimScreen, ik7.f.a());
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar2 = (p) cFACInsuranceReviewClaimScreen.T2();
                j60.a aVar5 = pVar2.f126975s;
                r rVar = pVar2.f126976t;
                i iVar = (i) pVar2.t2();
                rVar.getClass();
                aVar5.x(r.a(iVar));
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar3 = (p) cFACInsuranceReviewClaimScreen.T2();
                pVar3.getClass();
                pVar3.C1(new ExternalDestination.Browser("https://www.qover.com/terms-and-policies", null));
                break;
        }
        return Unit.f186387a;
    }
}
