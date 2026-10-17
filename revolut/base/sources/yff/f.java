package yff;

import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.transaction.troubleshooter.api.deps.TransactionTroubleshooterApi$Toggles$TransactionTroubleshooterImprovementDefinition;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreen;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yff.m;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TroubleshooterListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TroubleshooterListScreen troubleshooterListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = troubleshooterListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarH3 = this.v.T2();
        Object obj3 = model.u;
        u uVar = (u) jVarH3;
        mde.e eVar = uVar.u;
        TroubleshooterListScreenContract$InputData troubleshooterListScreenContract$InputData = uVar.f313358p;
        Continuation continuation = null;
        if (obj3 instanceof Troubleshooter) {
            Troubleshooter troubleshooter = (Troubleshooter) obj3;
            String str = troubleshooter.f91845j;
            if (str != null) {
                uVar.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) uVar.f313362t).f(str), 0, null, 494));
            } else {
                uVar.v2(new i(troubleshooter, null, true, troubleshooterListScreenContract$InputData.f91894c));
            }
        } else if (obj3 instanceof m.b) {
            int i = 3;
            if (troubleshooterListScreenContract$InputData.d) {
                int i2 = 2;
                if (((jte.d) uVar.f313363w.f280439a).c(TransactionTroubleshooterApi$Toggles$TransactionTroubleshooterImprovementDefinition.f91839c)) {
                    uVar.l2(new p(uVar, continuation, i2), new yi5.b(26));
                } else {
                    uVar.C1(new SharedHelpDestination(new SharedHelpDestination.InputData((SharedHelpDestination.StartPoint) null, new NewTicketContext.Transaction(troubleshooterListScreenContract$InputData.f91892a), 3), 2));
                }
            } else {
                j60.a.v(uVar.f313361s, false, null, 3);
                uVar.l2(new p(uVar, continuation, i), new yi5.b(26));
                Unit unit = Unit.f186387a;
            }
        } else if (obj3 != null && eVar.a(obj3)) {
            uVar.C1(eVar.i(obj3));
        }
        return Unit.f186387a;
    }
}
