package kkk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.FamilyPlanInvitationScreen;
import kkk.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FamilyPlanInvitationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FamilyPlanInvitationScreen familyPlanInvitationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = familyPlanInvitationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        Object obj3 = model.i;
        t tVar = (t) oVarE3;
        tVar.getClass();
        h hVar = obj3 instanceof h ? (h) obj3 : null;
        if (hVar != null) {
            if (!hVar.equals(h.a.f185100a)) {
                throw new NoWhenBranchMatchedException();
            }
            hha.d dVar = (hha.d) ((i) ((j2) tVar.f185128w.f22677a).getValue()).f185101a.getContent();
            if (dVar != null) {
                tVar.C2(new l(dVar));
            }
        }
        return Unit.f186387a;
    }
}
