package n8i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.R$string;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f213408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f213409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f213410c;

    public c(MoveMoneyInputData moveMoneyInputData, e0 topupItemsMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(moveMoneyInputData, "moveMoneyInputData");
        Intrinsics.checkNotNullParameter(topupItemsMapper, "topupItemsMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f213408a = moveMoneyInputData;
        this.f213409b = topupItemsMapper;
        this.f213410c = dateProvider;
    }

    public final Clause a(q domainState) {
        MoveMoneyInputData.ExtraConfiguration.CustomCtaTitle customCtaTitle;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        k kVar = (k) domainState.f213461a.getContent();
        s6i.e eVar = kVar != null ? kVar.f213439a : null;
        if (eVar != null && v13.d.r(eVar)) {
            return new TextLocalisedClause(R$string.move_money_amount_screen_action_review, null, null, 14);
        }
        Iterator it8 = this.f213408a.f104835c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                customCtaTitle = null;
                break;
            }
            MoveMoneyInputData.ExtraConfiguration extraConfiguration = (MoveMoneyInputData.ExtraConfiguration) it8.next();
            customCtaTitle = extraConfiguration instanceof MoveMoneyInputData.ExtraConfiguration.CustomCtaTitle ? (MoveMoneyInputData.ExtraConfiguration.CustomCtaTitle) extraConfiguration : null;
            if (customCtaTitle != null) {
                break;
            }
        }
        Clause clause = customCtaTitle != null ? customCtaTitle.f104836a : null;
        if (clause != null) {
            return clause;
        }
        TransferScheduleData transferScheduleData = kVar != null ? kVar.f213440b : null;
        if (transferScheduleData != null && n1l.b.d(transferScheduleData, ((l80.f) this.f213410c).f())) {
            return new TextLocalisedClause(R$string.move_money_action_schedule, null, null, 14);
        }
        Clause clauseB = this.f213409b.b(domainState.f213462b);
        return clauseB != null ? clauseB : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_topup_action_pay, null, null, 14);
    }
}
