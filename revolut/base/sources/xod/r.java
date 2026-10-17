package xod;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cmd.a f307822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lnd.o f307823b;

    public r(cmd.a groupDetailsMapper, lnd.o analyticsCategoryColorMapper) {
        Intrinsics.checkNotNullParameter(groupDetailsMapper, "groupDetailsMapper");
        Intrinsics.checkNotNullParameter(analyticsCategoryColorMapper, "analyticsCategoryColorMapper");
        this.f307822a = groupDetailsMapper;
        this.f307823b = analyticsCategoryColorMapper;
    }

    public final q a(zod.c0 c0Var) {
        Clause textLocalisedClause;
        if (c0Var instanceof zod.a0) {
            zod.a0 a0Var = (zod.a0) c0Var;
            textLocalisedClause = cmd.a.a(this.f307822a, a0Var.f323974a, zhm.v.l(a0Var.f323975b), null, null, 16).f314699b;
        } else {
            if (!(c0Var instanceof zod.b0)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_spendings_category_others, null, null, 14);
        }
        return new q(textLocalisedClause, new MoneyClause(otd.f.a(c0Var.f().a()), new MoneyClause.Format.Shorts(false, 63), null, null, 12));
    }
}
