package zzb;

import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.RevPointsPostOnboardingPersonalisationPreferencesScreen;
import ip0.ii;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsPostOnboardingPersonalisationPreferencesScreen f326650w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f326650w = revPointsPostOnboardingPersonalisationPreferencesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f326650w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f326650w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f326650w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((ii) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen = this.f326650w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE3 = revPointsPostOnboardingPersonalisationPreferencesScreen.R2();
                Intrinsics.h(itemId);
                tVarE3.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "MENU_ITEM_SKIP_ID")) {
                    tVarE3.C2(aii.q.f5292a);
                }
                break;
            case 1:
                ii iiVar = (ii) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE32 = revPointsPostOnboardingPersonalisationPreferencesScreen.R2();
                Object k = iiVar.f164695b.getE();
                if (k instanceof l) {
                    tVarE32.H2(tVarE32.f326668s, new sx4.b(k, 27));
                } else {
                    tVarE32.getClass();
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE33 = revPointsPostOnboardingPersonalisationPreferencesScreen.R2();
                Intrinsics.h(clickData);
                tVarE33.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                Continuation continuation = null;
                fub.b bVar = obj3 instanceof fub.b ? (fub.b) obj3 : null;
                if (bVar != null) {
                    tVarE33.n2(new zr5.k(tVarE33, bVar, continuation, 20), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
