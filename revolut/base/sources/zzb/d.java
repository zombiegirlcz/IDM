package zzb;

import aw0.n6;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.RevPointsPostOnboardingPersonalisationPreferencesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RevPointsPostOnboardingPersonalisationPreferencesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = revPointsPostOnboardingPersonalisationPreferencesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                revPointsPostOnboardingPersonalisationPreferencesScreen.R2().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE3 = revPointsPostOnboardingPersonalisationPreferencesScreen.R2();
                tVarE3.getClass();
                tVarE3.l2(new zr5.k(tVarE3, null, 21), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
