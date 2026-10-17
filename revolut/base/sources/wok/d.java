package wok;

import aw0.n6;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$Button$Action;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ProductIntro;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.WaitlistInvitationScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.WaitlistInvitationScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WaitlistInvitationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WaitlistInvitationScreen waitlistInvitationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = waitlistInvitationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n6 n6Var = (n6) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = n6Var.k;
        boolean zF = Intrinsics.f(obj3, PricingPlanWaitlistLayout$Button$Action.AcceptInvite.f103666a);
        WaitlistInvitationScreen waitlistInvitationScreen = this.v;
        if (zF) {
            com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a aVar2 = (com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) waitlistInvitationScreen.d();
            aVar2.getClass();
            aVar2.l2(new w76.a(aVar2, null, 25), new yi5.b(26));
        } else if (obj3 instanceof PricingPlanWaitlistLayout$Button$Action.ShowBottomSheet) {
            h hVarD = waitlistInvitationScreen.d();
            PricingPlanWaitlistLayout$BottomSheet data = ((PricingPlanWaitlistLayout$Button$Action.ShowBottomSheet) obj3).f103668a;
            com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a aVar3 = (com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) hVarD;
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(data, "data");
            oki.h.v2(aVar3.u, new WaitlistInvitationScreenContract$ModalStep.BottomSheet(data), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (obj3 instanceof PricingPlanWaitlistLayout$Button$Action.ShowBenefits) {
            h hVarD2 = waitlistInvitationScreen.d();
            PricingPlanWaitlistLayout$ProductIntro productIntro = ((PricingPlanWaitlistLayout$Button$Action.ShowBenefits) obj3).f103667a;
            com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a aVar4 = (com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) hVarD2;
            aVar4.getClass();
            Intrinsics.checkNotNullParameter(productIntro, "productIntro");
            oki.h.v2(aVar4.u, new WaitlistInvitationScreenContract$ModalStep.Benefits(productIntro), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
        } else if (Intrinsics.f(obj3, PricingPlanWaitlistLayout$Button$Action.Unknown.f103669a) || obj3 == null) {
            hx7.e.h(new IllegalStateException(a0.d.m(obj3, "Unsupported action: ")));
        }
        return Unit.f186387a;
    }
}
