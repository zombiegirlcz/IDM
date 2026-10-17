package w7b;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.cobranded_cards.impl.data.CobrandedCardsDowngradeNotEnoughFundsException;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InsufficientBalanceDialogPayload;
import com.revolut.retail.common.ui.R$string;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c f295510b;

    public /* synthetic */ p(com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar, int i) {
        this.f295509a = i;
        this.f295510b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f295509a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                Continuation continuation = null;
                CobrandedCardsDowngradeNotEnoughFundsException cobrandedCardsDowngradeNotEnoughFundsException = error instanceof CobrandedCardsDowngradeNotEnoughFundsException ? (CobrandedCardsDowngradeNotEnoughFundsException) error : null;
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar = this.f295510b;
                if (cobrandedCardsDowngradeNotEnoughFundsException == null) {
                    cVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5));
                } else {
                    dj0.d lackingMoney = cobrandedCardsDowngradeNotEnoughFundsException.f82508a;
                    cVar.f82630r.getClass();
                    Intrinsics.checkNotNullParameter(lackingMoney, "lackingMoney");
                    yji.l.a1(cVar, cVar.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_switch_not_enough_balance_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_switch_not_enough_balance_subtitle, u.c(new MoneyClause(lackingMoney, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_switch_not_enough_balance_action, null, null, 14), null, null, new CobrandedCardsValueReminderScreenContract$InsufficientBalanceDialogPayload(lackingMoney), false, null, null, null, null, null, null, 32628), false, 5)), null, null, new r(cVar, continuation, 1), 3);
                }
                break;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                y0 y0Var = new y0(null, new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar2 = this.f295510b;
                yji.l.a1(cVar2, cVar2.X1(y0Var), null, null, null, 7);
                break;
        }
        return Boolean.TRUE;
    }
}
