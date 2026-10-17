package b47;

import ald.m;
import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubReminderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TaxHubReminderScreen taxHubReminderScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubReminderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVar;
        od0.i iVar;
        FreelancerTaxProfile freelancerTaxProfile;
        od0.i iVar2;
        FreelancerTaxProfile freelancerTaxProfile2;
        Boolean bool;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.V.getValue();
        String listId = model.f52613a;
        y yVar = hVar.f12199s;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_TAX_REMINDER_CONTINUE")) {
            f fVar2 = (f) ((e) ((j2) yVar.f22677a).getValue()).f12188a.getContent();
            if (fVar2 != null && (iVar2 = fVar2.f12191a) != null && (freelancerTaxProfile2 = (FreelancerTaxProfile) iVar2.f224257a) != null && (bool = ((e) ((j2) yVar.f22677a).getValue()).f12189b) != null) {
                hVar.l2(new m(hVar, freelancerTaxProfile2, bool.booleanValue(), (Continuation) null, 2), new yi5.b(26));
            }
        } else if (Intrinsics.f(listId, "LIST_ID_TAX_REMINDER_SETTINGS") && (fVar = (f) ((e) ((j2) yVar.f22677a).getValue()).f12188a.getContent()) != null && (iVar = fVar.f12191a) != null && (freelancerTaxProfile = (FreelancerTaxProfile) iVar.f224257a) != null) {
            hVar.C2(new hr6.f(freelancerTaxProfile.f73475b, freelancerTaxProfile.f73474a));
        }
        return Unit.f186387a;
    }
}
