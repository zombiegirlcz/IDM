package zzb;

import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.RevPointsPostOnboardingPersonalisationPreferencesScreen;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsPostOnboardingPersonalisationPreferencesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsPostOnboardingPersonalisationPreferencesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVarE3 = this.v.R2();
        Object obj3 = yVar.f167226b.f58324n;
        if (obj3 instanceof l) {
            tVarE3.H2(tVarE3.f326668s, new sx4.b(obj3, 27));
        } else {
            tVarE3.getClass();
        }
        return Unit.f186387a;
    }
}
