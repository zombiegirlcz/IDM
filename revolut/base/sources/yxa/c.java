package yxa;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MaxVariableReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.RewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import dj0.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pwa.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private c() {
    }

    public static Clause a(ReferralCampaignV4 campaign, a stringResources, Function1 revPointsFormatter, Function0 noRewardFallback) {
        d dVar;
        ReferralReward referralReward;
        d dVar2;
        Pair pair;
        MaxVariableReward maxVariableReward;
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(revPointsFormatter, "revPointsFormatter");
        Intrinsics.checkNotNullParameter(noRewardFallback, "noRewardFallback");
        RewardInfo rewardInfo = campaign.u;
        List list = campaign.z;
        o oVar = campaign.v;
        if (rewardInfo == null || (maxVariableReward = rewardInfo.e) == null || (dVar = maxVariableReward.f81745a) == null || dVar.f115082a <= 0) {
            dVar = null;
        }
        if (dVar != null) {
            return new TextLocalisedClause(stringResources.f317602a, u.c(b(dVar, oVar, revPointsFormatter)), null, 12);
        }
        if (rewardInfo != null && (referralReward = rewardInfo.f81775c) != null && (dVar2 = referralReward.f81769a) != null) {
            if (dVar2.f115082a <= 0) {
                dVar2 = null;
            }
            if (dVar2 != null) {
                if (list.isEmpty()) {
                    pair = oVar == o.REVPOINTS ? new Pair(Integer.valueOf(stringResources.f317604c), dVar2) : new Pair(Integer.valueOf(stringResources.d), dVar2);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (Intrinsics.f(((Upsell) obj2).f.f115083b, dVar2.f115083b)) {
                            arrayList.add(obj2);
                        }
                    }
                    d.Companion.getClass();
                    d dVarO = d.e;
                    int i = 0;
                    for (Object obj3 : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            v.s();
                            throw null;
                        }
                        dVarO = i == 0 ? ((Upsell) obj3).f : pyd.c.O(dVarO, ((Upsell) obj3).f);
                        i = i2;
                    }
                    pair = new Pair(Integer.valueOf(stringResources.f317603b), pyd.c.O(dVar2, dVarO));
                }
                return new TextLocalisedClause(((Number) pair.f186385a).intValue(), u.c(b((d) pair.f186386b, oVar, revPointsFormatter)), null, 12);
            }
        }
        return (Clause) noRewardFallback.invoke();
    }

    public static Clause b(d dVar, o oVar, Function1 function1) {
        return (oVar == null ? -1 : b.f317605a[oVar.ordinal()]) == 1 ? (Clause) function1.invoke(dVar) : new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 59), null, o9.NON_SENSITIVE, 4);
    }
}
