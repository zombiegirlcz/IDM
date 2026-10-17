package xp7;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.occupation.OccupationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import xng.l;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ OccupationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OccupationScreen occupationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = occupationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.u.Z.getValue();
        iVar.getClass();
        qn7.a.a(iVar, new l(iVar, 8));
        return Unit.f186387a;
    }
}
