package udk;

import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen.PlanRewardsRevealScreen;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen.PlanRewardsRevealScreenContract$InputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlanRewardsRevealScreen f279249b;

    public /* synthetic */ a(PlanRewardsRevealScreen planRewardsRevealScreen, int i) {
        this.f279248a = i;
        this.f279249b = planRewardsRevealScreen;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f279248a;
        PlanRewardsRevealScreen planRewardsRevealScreen = this.f279249b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = PlanRewardsRevealScreen.R;
                z zVarD = planRewardsRevealScreen.d();
                if (Intrinsics.f(((d) ((j2) zVarD.f279283x.f22677a).getValue()).f279254c, j.f279259a)) {
                    a2 a2Var = zVarD.f279281t;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    zVarD.f279281t = zVarD.l2(new y(zVarD, null, 1), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                KProperty[] kPropertyArr2 = PlanRewardsRevealScreen.R;
                return (z) ((fdk.i) planRewardsRevealScreen.Q.getValue()).f134003c.get();
            case 2:
                KProperty[] kPropertyArr3 = PlanRewardsRevealScreen.R;
                return n14.e.a(planRewardsRevealScreen, planRewardsRevealScreen.d());
            case 3:
                KProperty[] kPropertyArr4 = PlanRewardsRevealScreen.R;
                phm.a aVar = (phm.a) ue0.e.j(planRewardsRevealScreen.m2()).a().get(fdk.g.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", fdk.g.class, " is not found"));
                }
                fdk.g gVar = ((fdk.g) aVar2.b()).f133990n;
                PlanRewardsRevealScreenContract$InputData planRewardsRevealScreenContract$InputData = planRewardsRevealScreen.K;
                planRewardsRevealScreenContract$InputData.getClass();
                return new fdk.i(gVar, planRewardsRevealScreenContract$InputData);
            default:
                KProperty[] kPropertyArr5 = PlanRewardsRevealScreen.R;
                planRewardsRevealScreen.d3().d.setVisibility(4);
                return Unit.f186387a;
        }
    }
}
