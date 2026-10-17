package xkf;

import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterDestination;
import com.revolut.feature.transaction.troubleshooter.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class p1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q1 f306748w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(q1 q1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f306748w = q1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p1(this.f306748w, continuation, 0);
            default:
                return new p1(this.f306748w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q1 q1Var = this.f306748w;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xb4.g gVar = new xb4.g(q1Var, null, 7);
                this.v = 1;
                Object objY2 = q1Var.Y2(this, gVar);
                return objY2 == aVar ? aVar : objY2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    l1 l1Var = new l1(q1Var, continuation, i2);
                    this.v = 1;
                    obj2 = q1Var.Y2(this, l1Var);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                klf.h0 h0Var = q1Var.f306753l;
                int i6 = j1.f306718a[((rnf.d) obj2).ordinal()];
                int i21 = 2;
                if (i6 == 1) {
                    q1Var.A2(new SharedHelpDestination(new SharedHelpDestination.InputData((SharedHelpDestination.StartPoint) null, new NewTicketContext.Transaction(h0Var.f185494j), 3), 2));
                } else if (i6 == 2) {
                    q1Var.A2(new TransactionTroubleshooterDestination(new TransactionTroubleshooterDestination.TroubleshooterList(h0Var.f185494j, null, null, true, null, 112)));
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bmf.b bVar = q1Var.f306759s;
                    q1Var.f306762x.getClass();
                    q1Var.N2(bmf.a.b(bVar, new TextLocalisedClause(R$string.troubleshooter_list_help_dialog_title, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), null, 472), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new i1(q1Var, i21));
                    Unit unit = Unit.f186387a;
                }
                return Unit.f186387a;
        }
    }
}
