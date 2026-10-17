package xp8;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import u80.o;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChallengeEditRewardScreenContract$InputData f307916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f307917b;

    public n(ChallengeEditRewardScreenContract$InputData inputData, o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f307916a = inputData;
        this.f307917b = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i2 = m.f307915a[this.f307916a.f77382a.ordinal()];
        if (i2 == 1) {
            i = R$string.junior_challenges_edit_action_create;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.junior_challenges_edit_action_update;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        dj0.d dVar = domainState.f307903a;
        dj0.d dVar2 = domainState.f307903a;
        return new j(textLocalisedClause, u.c(new CenteredAmountDelegate.Model("LIST_ID_CENTERED_AMOUNT", null, new bw0.h(this.f307917b.e(dVar), o.b(new u80.g(dVar2, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), (TextClause) null, true, (List) null, Boolean.TRUE, domainState.f307904b, false, false, false, false, (bw0.e) null, (Clause) null, false, 32660), null, null, null, null, true, false, dVar2.f115083b, null, 1402)), dVar.f115082a > 0);
    }
}
