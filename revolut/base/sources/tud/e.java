package tud;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.api.model.StakingInterestRate;
import com.revolut.feature.staking.api.model.StakingTierRate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttd.a f274595a;

    public e(ttd.a stakingInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        this.f274595a = stakingInterestRateFormatter;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f274591a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            StakingTierRate stakingTierRate = (StakingTierRate) obj2;
            dj0.d dVar = stakingTierRate.f88090a;
            dj0.d dVar2 = stakingTierRate.f88091b;
            StakingInterestRate stakingInterestRate = stakingTierRate.f88092c;
            if (dVar2 != null) {
                int i3 = R$string.staking_tier_rates_dialog_v2_tier_below;
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                textLocalisedClause = new TextLocalisedClause(i3, u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
            } else {
                int i5 = R$string.staking_tier_rates_dialog_v2_tier_above;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                textLocalisedClause = new TextLocalisedClause(i5, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
            }
            arrayList.add(new CellDetailsDelegate.Model(a0.d.n("TIER_RATE_LIST_ID_", i), textLocalisedClause, ((wud.b) this.f274595a).c(stakingInterestRate, true, null), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), arrayList, new lw0.a(new TextLocalisedClause(R$string.staking_tier_rates_dialog_v2_title, null, null, 14), new TextLocalisedClause(R$string.staking_earn_rate_dialog_subtitle, null, null, 14), null, null, false, 28));
    }
}
