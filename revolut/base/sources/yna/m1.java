package yna;

import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.api.PricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist;
import ip0.u00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class m1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ProfileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(ProfileScreen profileScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = profileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m1(this.v, continuation, 0);
            case 1:
                return new m1(this.v, continuation, 1);
            case 2:
                return new m1(this.v, continuation, 2);
            case 3:
                return new m1(this.v, continuation, 3);
            default:
                return new m1(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m1) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        ProfileScreen profileScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1 c1Var = (c1) profileScreen.T2();
                c1Var.getClass();
                c1Var.l2(new u0(c1Var, continuation, 1), new yi5.b(26));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1 c1Var2 = (c1) profileScreen.T2();
                if (((jte.d) c1Var2.f315318s).c(PricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist.f103651c)) {
                    c1Var2.l2(new u0(c1Var2, continuation, 6), new yi5.b(26));
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                profileScreen.m2().onBackPressed();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e60.s) ((c1) profileScreen.T2()).E).T(new e60.i(null, null, null, false, 0, 0, null, null, true, u00.FRONT, null, 15615));
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1 c1Var3 = (c1) profileScreen.T2();
                c1Var3.getClass();
                c1Var3.l2(new u0(c1Var3, continuation, 0), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
