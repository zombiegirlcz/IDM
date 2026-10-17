package pmk;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import hha.w0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements jki.p {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f237642c = zhm.v.k(hha.k.SALARY_ACTIVE, hha.k.PARTNER_SALARY_ACTIVE, hha.k.PARTNER_SALARY_GRACE, hha.k.SALARY_HUB_ACTIVE, hha.k.SALARY_HUB_GRACE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jgk.u f237643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f237644b;

    public x(jgk.u planSubscriptionStateProvider, zjk.c chargeClauseMapper, c billingInfoMapper) {
        Intrinsics.checkNotNullParameter(planSubscriptionStateProvider, "planSubscriptionStateProvider");
        Intrinsics.checkNotNullParameter(chargeClauseMapper, "chargeClauseMapper");
        Intrinsics.checkNotNullParameter(billingInfoMapper, "billingInfoMapper");
        this.f237643a = planSubscriptionStateProvider;
        this.f237644b = billingInfoMapper;
    }

    public static Clause b(w0 w0Var, boolean z) {
        Clause clauseE = dok.g.e(w0Var, null);
        if (clauseE == null) {
            clauseE = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return z ? new TextLocalisedClause(R$string.plan_duo_short_name, zhm.u.c(clauseE), null, 12) : clauseE;
    }

    public static TextLocalisedClause c(Period period) {
        if (Intrinsics.f(period, jli.e.f175845h)) {
            return new TextLocalisedClause(R$string.plan_hub_screen_subtitle_monthly, null, null, 14);
        }
        if (Intrinsics.f(period, jli.e.f175842b)) {
            return new TextLocalisedClause(R$string.plan_hub_screen_subtitle_annual, null, null, 14);
        }
        return null;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        k domainState = (k) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) domainState.f237618c.getContent();
        Object obj2 = null;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (f237642c.contains(((hha.j) next).f152316a)) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (hha.j) obj2;
        }
        return (q) iii.c.f(t1.x(domainState.f237616a, domainState.d, domainState.f237617b, domainState.e, domainState.f, domainState.f237619g), new pmj.b(this), new pj9.m(this, 20), new ox2.d(this, obj2, 17));
    }
}
