package jz6;

import com.revolut.feature.freelancer.impl.ui.onboarding.business_description.FreelancerBusinessDescriptionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerBusinessDescriptionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FreelancerBusinessDescriptionScreen freelancerBusinessDescriptionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerBusinessDescriptionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerBusinessDescriptionScreen freelancerBusinessDescriptionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) freelancerBusinessDescriptionScreen.e3()).C2(f.f179591a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) freelancerBusinessDescriptionScreen.e3();
                oVar.getClass();
                oVar.l2(new ji1.m(oVar, null, 21), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
