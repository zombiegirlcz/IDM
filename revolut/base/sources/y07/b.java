package y07;

import com.revolut.feature.freelancer.impl.ui.profile.vat.FreelancerVatScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerVatScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(FreelancerVatScreen freelancerVatScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerVatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerVatScreen freelancerVatScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((l) freelancerVatScreen.T2()).u2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar = (l) freelancerVatScreen.T2();
                if (Intrinsics.f(((g) lVar.t2()).f310157b, ((g) lVar.t2()).f310156a)) {
                    lVar.u2();
                } else {
                    lVar.n2(new xb4.e(lVar, null, 19), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
