package pwa;

import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f240369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f240370b;

    static {
        Pair pair = new Pair("STANDARD", n.STANDARD);
        Pair pair2 = new Pair("RETAIL_TO_BUSINESS", n.RETAIL_TO_BUSINESS);
        n nVar = n.CRYPTO_INTERNAL;
        Pair pair3 = new Pair("CRYPTO_INTERNAL", nVar);
        Pair pair4 = new Pair("SALARY", n.SALARY);
        Pair pair5 = new Pair("JUNIOR_TO_JUNIOR", n.JUNIOR_TO_JUNIOR);
        n nVar2 = n.PRO_INTERNAL;
        f240369a = r0.k(pair, pair2, pair3, pair4, pair5, new Pair("PRO_INTERNAL", nVar2), new Pair("PAPER_TRADING", n.PAPER_TRADING));
        n[] elements = {nVar, nVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f240370b = kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Map a() {
        return f240369a;
    }

    public static final boolean b(ReferralCampaignV4 referralCampaignV4) {
        Intrinsics.checkNotNullParameter(referralCampaignV4, "<this>");
        Integer num = referralCampaignV4.e;
        if ((num != null ? num.intValue() : 0) > 0 || referralCampaignV4.f81754c.f81706b > 0 || referralCampaignV4.f81752a.f81706b > 0) {
            return true;
        }
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = referralCampaignV4.f81753b;
        return (activeOrPastInvitesInfo != null ? activeOrPastInvitesInfo.f81706b : 0) > 0;
    }

    public static final boolean c(n nVar) {
        return nVar == n.SALARY;
    }
}
