package rs2;

import com.revolut.business.feature.referrals.model.ReferralWithIncentiveCampaign$CampaignType;
import hx7.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.v;
import ru.y;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            case 2:
                return new g(this.v, continuation, 2);
            case 3:
                return new g(this.v, continuation, 3);
            case 4:
                return new g(this.v, continuation, 4);
            default:
                return new g(this.v, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ru.j jVar;
        int i = this.u;
        n nVar = this.v;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                tu.d dVar = (tu.d) nVar.f256955b.T2("ACTIVE_CAMPAIGN_STATE_KEY", tu.d.class);
                if (dVar != null) {
                    return q.g0(dVar);
                }
                return null;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = nVar.f256955b;
                n.Companion.getClass();
                List list = (List) cVar.T2("BUSINESS_ACCOUNT_KEY", n.f256953m);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(i26.l.A((tu.h) it8.next()));
                    }
                }
                return arrayList;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                tu.g gVar = (tu.g) nVar.f256955b.T2("REFERRAL_WITH_INCENTIVE_CAMPAIGN_KEY", tu.g.class);
                if (gVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                ReferralWithIncentiveCampaign$CampaignType referralWithIncentiveCampaign$CampaignType = Intrinsics.f(gVar.getType(), "WITH_REWARD") ? ReferralWithIncentiveCampaign$CampaignType.WithReward.f50670b : ReferralWithIncentiveCampaign$CampaignType.Default.f50669b;
                String referralCode = gVar.getReferralCode();
                String campaignCode = gVar.getCampaignCode();
                String referralUrl = gVar.getReferralUrl();
                String termsAndConditionsLink = gVar.getTermsAndConditionsLink();
                List steps = gVar.getSteps();
                ArrayList arrayList4 = new ArrayList();
                Iterator it9 = steps.iterator();
                while (it9.hasNext()) {
                    v vVarA = ss2.a.a((tu.e) it9.next());
                    if (vVarA != null) {
                        arrayList4.add(vVarA);
                    }
                }
                tu.c reward = gVar.getReward();
                if (reward != null) {
                    dj0.d dVarO = mo3.a.o(reward.getRewardAmount());
                    int maxRewards = reward.getMaxRewards();
                    tu.h targetAccount = reward.getTargetAccount();
                    jVar = new ru.j(dVarO, maxRewards, targetAccount != null ? i26.l.A(targetAccount) : null, null, null);
                } else {
                    jVar = null;
                }
                return new y(referralWithIncentiveCampaign$CampaignType, referralCode, campaignCode, referralUrl, termsAndConditionsLink, arrayList4, jVar, gVar.getDeadlineDate(), gVar.getDaysToDeadline(), null, null);
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                tu.d dVar2 = (tu.d) nVar.f256955b.T2("INACTIVE_CAMPAIGN_STATE_KEY", tu.d.class);
                if (dVar2 != null) {
                    return q.g0(dVar2);
                }
                return null;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar2 = nVar.f256955b;
                n.Companion.getClass();
                List list3 = (List) cVar2.T2("PERSONAL_ACCOUNT_KEY", n.f256953m);
                if (list3 != null) {
                    List list4 = list3;
                    arrayList3 = new ArrayList(w.t(list4, 10));
                    Iterator it10 = list4.iterator();
                    while (it10.hasNext()) {
                        arrayList3.add(i26.l.A((tu.h) it10.next()));
                    }
                }
                return arrayList3;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar3 = nVar.f256955b;
                n.Companion.getClass();
                List list5 = (List) cVar3.T2("RECENT_ACCOUNTS_KEY", n.f256953m);
                if (list5 != null) {
                    List list6 = list5;
                    arrayList2 = new ArrayList(w.t(list6, 10));
                    Iterator it11 = list6.iterator();
                    while (it11.hasNext()) {
                        arrayList2.add(i26.l.A((tu.h) it11.next()));
                    }
                }
                return arrayList2;
        }
    }
}
