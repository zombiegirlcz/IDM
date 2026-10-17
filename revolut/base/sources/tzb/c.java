package tzb;

import aw0.n6;
import com.revolut.feature.rev_points.impl.ui.personalisation_targeting_onboarding.RevPointsPersonalisationTargetingOnboardingScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsPersonalisationTargetingOnboardingScreen f275901w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RevPointsPersonalisationTargetingOnboardingScreen revPointsPersonalisationTargetingOnboardingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f275901w = revPointsPersonalisationTargetingOnboardingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f275901w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f275901w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f275901w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsPersonalisationTargetingOnboardingScreen revPointsPersonalisationTargetingOnboardingScreen = this.f275901w;
        switch (i) {
            case 0:
                n6 buttonModel = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) revPointsPersonalisationTargetingOnboardingScreen.Q.getValue();
                Intrinsics.h(buttonModel);
                iVar.getClass();
                Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
                iVar.l2(new h(iVar, null, 0), new yi5.b(26));
                break;
            case 1:
                n6 buttonModel2 = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) revPointsPersonalisationTargetingOnboardingScreen.Q.getValue();
                Intrinsics.h(buttonModel2);
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(buttonModel2, "buttonModel");
                iVar2.l2(new h(iVar2, null, 1), new yi5.b(26));
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar3 = (i) revPointsPersonalisationTargetingOnboardingScreen.Q.getValue();
                Intrinsics.h(clickData);
                iVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof fub.b) {
                    iVar3.l2(new tqh.j(iVar3, obj3, null, 22), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
