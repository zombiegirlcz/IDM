package g57;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.FreelancerVatReminderSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerVatReminderSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(FreelancerVatReminderSettingsScreen freelancerVatReminderSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerVatReminderSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerVatReminderSettingsScreen freelancerVatReminderSettingsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a) freelancerVatReminderSettingsScreen.d()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a aVar3 = (com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a) freelancerVatReminderSettingsScreen.d();
                y yVar = aVar3.f74444q;
                f fVar = (f) ((h) ((j2) yVar.f22677a).getValue()).f140673a.getContent();
                Continuation continuation = null;
                od0.i iVar = fVar != null ? fVar.f140668a : null;
                if (iVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                g gVar = ((h) ((j2) yVar.f22677a).getValue()).f140674b;
                if (gVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                aVar3.l2(new g23.q(aVar3, iVar, gVar, continuation, 4), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
