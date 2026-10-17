package ep7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreen;
import ip0.y;
import kl7.n0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EligibilityScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EligibilityScreen eligibilityScreen, Continuation continuation) {
        super(2, continuation);
        this.v = eligibilityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Z.getValue();
        Object obj3 = yVar.f167227c;
        Object obj4 = yVar.f167226b.f58324n;
        k kVar = (k) hVar;
        kVar.getClass();
        if ((obj3 instanceof n0) && (obj4 instanceof Boolean)) {
            kVar.x2(new j(obj3, obj4));
        }
        return Unit.f186387a;
    }
}
