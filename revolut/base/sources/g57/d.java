package g57;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.FreelancerVatReminderSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.FreelancerVatReminderSettingsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerVatReminderSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FreelancerVatReminderSettingsScreen freelancerVatReminderSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerVatReminderSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        String listId = model.f53228a;
        com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a) lVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f74445r;
        y yVar = aVar2.f74444q;
        Intrinsics.checkNotNullParameter(listId, "listId");
        boolean zF = Intrinsics.f(listId, "LIST_ID_ASSESSMENT_PERIOD");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (zF) {
            Set set = ((f) zi0.c.I(((h) ((j2) yVar.f22677a).getValue()).f140673a)).f140669b.f137603a;
            g gVar = ((h) ((j2) yVar.f22677a).getValue()).f140674b;
            oki.h.v2(aVar3, new FreelancerVatReminderSettingsScreenContract$ModalStep.AssessmentPeriod(set, gVar != null ? gVar.f140671b : null), bottom_dialog);
        } else if (Intrinsics.f(listId, "LIST_ID_ACCOUNT_PERIOD")) {
            g gVar2 = ((h) ((j2) yVar.f22677a).getValue()).f140674b;
            oki.h.v2(aVar3, new FreelancerVatReminderSettingsScreenContract$ModalStep.AccountingPeriod(gVar2 != null ? gVar2.f140672c : null), bottom_dialog);
        }
        return Unit.f186387a;
    }
}
