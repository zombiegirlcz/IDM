package qkk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite.UpgradeToInviteFamilyMemberScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qkk.d;
import qkk.f;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UpgradeToInviteFamilyMemberScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UpgradeToInviteFamilyMemberScreen upgradeToInviteFamilyMemberScreen, Continuation continuation) {
        super(2, continuation);
        this.v = upgradeToInviteFamilyMemberScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.Q.getValue();
        Object obj3 = model.i;
        i iVar = (i) gVar;
        iVar.getClass();
        d dVar = obj3 instanceof d ? (d) obj3 : null;
        if (dVar != null) {
            if (dVar.equals(d.b.f247016a)) {
                iVar.C2(f.a.f247020a);
            } else {
                if (!dVar.equals(d.a.f247015a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar.B2();
            }
        }
        return Unit.f186387a;
    }
}
