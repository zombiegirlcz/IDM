package yff;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreenContract$InputData;
import com.revolut.retail.common.ui.R$string;
import ip0.tm0;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rp0.y;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ u u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, Continuation continuation) {
        super(1, continuation);
        this.u = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVar = this.u;
        TroubleshooterListScreenContract$InputData troubleshooterListScreenContract$InputData = uVar.f313358p;
        AnalyticsContext analyticsContextD = l7d.a.d(4, troubleshooterListScreenContract$InputData.f91892a, troubleshooterListScreenContract$InputData.f91894c);
        uVar.f313361s.x(new y(zhm.u.c(new um0("DIALOG_ID_ISSUE_ABOUT_THIS_TRANSACTION", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.common_action_no, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.common_action_yes, null, null, 14), false, null, null, 56), (Object) null, analyticsContextD, analyticsContextD, 0, 0, 0, 968)), new rp0.t(new TextLocalisedClause(com.revolut.feature.transaction.troubleshooter.impl.R$string.troubleshooter_list_help_dialog_title, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, analyticsContextD, 760));
        return Unit.f186387a;
    }
}
