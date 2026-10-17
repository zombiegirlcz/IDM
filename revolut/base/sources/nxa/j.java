package nxa;

import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PersonalizedTrackingController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(PersonalizedTrackingController personalizedTrackingController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = personalizedTrackingController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g0 g0Var;
        int i = this.u;
        PersonalizedTrackingController personalizedTrackingController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.referrals.impl.personalized_tracking.a) personalizedTrackingController.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.referrals.impl.personalized_tracking.a aVar3 = (com.revolut.feature.referrals.impl.personalized_tracking.a) personalizedTrackingController.R2();
                t0 t0Var = (t0) ((l) ((j2) aVar3.f81799x.f22677a).getValue()).f220502b.getContent();
                Continuation continuation = null;
                if (t0Var == null || (g0Var = t0Var.f) == null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "PersonalizedTrackingControllerModel", "No deeplink opened", null, h0Var);
                    Unit unit = Unit.f186387a;
                } else {
                    aVar3.n2(new n8a.r(aVar3, t0Var, g0Var, continuation, 29), new nrd.g(aVar3, 25));
                }
                break;
        }
        return Unit.f186387a;
    }
}
