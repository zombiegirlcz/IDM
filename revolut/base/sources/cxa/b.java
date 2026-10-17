package cxa;

import bxa.a0;
import bxa.b0;
import bxa.c;
import bxa.c0;
import bxa.d0;
import bxa.e0;
import bxa.h;
import bxa.i;
import bxa.j;
import bxa.k;
import bxa.s;
import bxa.t;
import bxa.u;
import bxa.y;
import bxa.z;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.CashbackInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.CashbackReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Condition;
import com.revolut.feature.referrals.common.data.api.domain.model.common.HowItWorks;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MaxVariableReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MultilevelDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MultilevelDetailsInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.RewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Step;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import dj0.d;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import pwa.n;
import pwa.o;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public static final ReferralCampaignV4 a(y yVar) {
        MultilevelDetails multilevelDetails;
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo;
        RewardInfo rewardInfo;
        Map mapT;
        Map map;
        CashbackInfo cashbackInfo;
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2;
        o oVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ?? arrayList3;
        ArrayList arrayList4;
        pwa.a aVar;
        ReferralReward referralReward;
        MaxVariableReward maxVariableReward;
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        String title = yVar.getTitle();
        Long deadline = yVar.getDeadline();
        Instant instantOfEpochMilli = deadline != null ? Instant.ofEpochMilli(deadline.longValue()) : null;
        Integer referrerTotalInvites = yVar.getReferrerTotalInvites();
        Integer inviteeChallengePeriod = yVar.getInviteeChallengePeriod();
        c recentInvites = yVar.getRecentInvites();
        ActiveOrPastInvitesInfo activeOrPastInvitesInfoG = recentInvites != null ? c6d.b.G(recentInvites) : null;
        String description = yVar.getDescription();
        u multiLevelDetails = yVar.getMultiLevelDetails();
        if (multiLevelDetails != null) {
            t banner = multiLevelDetails.getBanner();
            MultilevelDetailsInfo multilevelDetailsInfo = new MultilevelDetailsInfo(banner.getTitle(), banner.getDescription());
            t modal = multiLevelDetails.getModal();
            multilevelDetails = new MultilevelDetails(multilevelDetailsInfo, new MultilevelDetailsInfo(modal.getTitle(), modal.getDescription()));
        } else {
            multilevelDetails = null;
        }
        boolean isDefaultCampaign = yVar.getIsDefaultCampaign();
        String imageUrl = yVar.getImageUrl();
        String inviteSuccessMessage = yVar.getInviteSuccessMessage();
        String inviteText = yVar.getInviteText();
        ActiveOrPastInvitesInfo activeOrPastInvitesInfoG2 = c6d.b.G(yVar.getActiveInvites());
        ActiveOrPastInvitesInfo activeOrPastInvitesInfoG3 = c6d.b.G(yVar.getPastInvites());
        Integer maxReferrerRewards = yVar.getMaxReferrerRewards();
        String participationId = yVar.getParticipationId();
        z rewardInfo2 = yVar.getRewardInfo();
        if (rewardInfo2 != null) {
            String description2 = rewardInfo2.getDescription();
            String detailedDescription = rewardInfo2.getDetailedDescription();
            String title2 = rewardInfo2.getTitle();
            a0 reward = rewardInfo2.getReward();
            if (reward != null) {
                Intrinsics.checkNotNullParameter(reward, "<this>");
                activeOrPastInvitesInfo = activeOrPastInvitesInfoG2;
                long amount = reward.getAmount();
                xi0.a aVar2 = xi0.b.Companion;
                String currency = reward.getCurrency();
                aVar2.getClass();
                d dVar = new d(amount, xi0.a.a(currency));
                String targetCurrency = reward.getTargetCurrency();
                referralReward = new ReferralReward(dVar, targetCurrency != null ? xi0.a.a(targetCurrency) : null);
            } else {
                activeOrPastInvitesInfo = activeOrPastInvitesInfoG2;
                referralReward = null;
            }
            s maxVariableReward2 = rewardInfo2.getMaxVariableReward();
            if (maxVariableReward2 != null) {
                Intrinsics.checkNotNullParameter(maxVariableReward2, "<this>");
                long amount2 = maxVariableReward2.getAmount();
                xi0.a aVar3 = xi0.b.Companion;
                String currency2 = maxVariableReward2.getCurrency();
                aVar3.getClass();
                maxVariableReward = new MaxVariableReward(new d(amount2, xi0.a.a(currency2)), maxVariableReward2.getPercentage());
            } else {
                maxVariableReward = null;
            }
            rewardInfo = new RewardInfo(description2, detailedDescription, referralReward, title2, maxVariableReward);
        } else {
            activeOrPastInvitesInfo = activeOrPastInvitesInfoG2;
            rewardInfo = null;
        }
        List steps = yVar.getSteps();
        ArrayList arrayList5 = new ArrayList(w.t(steps, 10));
        Iterator it8 = steps.iterator();
        while (it8.hasNext()) {
            arrayList5.add(c8g.a.G((b0) it8.next()));
        }
        String termsUrl = yVar.getTermsUrl();
        Map additionalTerms = yVar.getAdditionalTerms();
        if (additionalTerms != null) {
            ArrayList arrayList6 = new ArrayList();
            Iterator it9 = additionalTerms.entrySet().iterator();
            while (it9.hasNext()) {
                Map.Entry entry = (Map.Entry) it9.next();
                String str = (String) entry.getKey();
                pwa.a[] aVarArrValues = pwa.a.values();
                int length = aVarArrValues.length;
                Iterator it10 = it9;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    pwa.a aVar4 = aVarArrValues[i];
                    int i2 = i;
                    if (kotlin.text.a0.z(aVar4.name(), str, true)) {
                        aVar = aVar4;
                        break;
                    }
                    i = i2 + 1;
                }
                Pair pair = aVar != null ? new Pair(aVar, entry.getValue()) : null;
                if (pair != null) {
                    arrayList6.add(pair);
                }
                it9 = it10;
            }
            mapT = r0.t(arrayList6);
        } else {
            mapT = null;
        }
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = activeOrPastInvitesInfoG3;
        String referralCode = yVar.getReferralCode();
        h cashbackInfo2 = yVar.getCashbackInfo();
        if (cashbackInfo2 != null) {
            i referrerReward = cashbackInfo2.getReferrerReward();
            map = mapT;
            CashbackReward cashbackReward = new CashbackReward(referrerReward.getTitle(), referrerReward.getAmountLabel(), referrerReward.getDescription());
            i inviteeReward = cashbackInfo2.getInviteeReward();
            cashbackInfo = new CashbackInfo(cashbackReward, new CashbackReward(inviteeReward.getTitle(), inviteeReward.getAmountLabel(), inviteeReward.getDescription()));
        } else {
            map = mapT;
            cashbackInfo = null;
        }
        String inviteLink = yVar.getInviteLink();
        String rewardType = yVar.getRewardType();
        if (rewardType != null) {
            o[] oVarArrValues = o.values();
            int length2 = oVarArrValues.length;
            int i3 = 0;
            while (i3 < length2) {
                oVar = oVarArrValues[i3];
                o[] oVarArr = oVarArrValues;
                activeOrPastInvitesInfo2 = activeOrPastInvitesInfoG;
                if (kotlin.text.a0.z(oVar.name(), rewardType, true)) {
                    break;
                }
                i3++;
                oVarArrValues = oVarArr;
                activeOrPastInvitesInfoG = activeOrPastInvitesInfo2;
            }
            activeOrPastInvitesInfo2 = activeOrPastInvitesInfoG;
            oVar = null;
        } else {
            activeOrPastInvitesInfo2 = activeOrPastInvitesInfoG;
            oVar = null;
        }
        String campaignCode = yVar.getCampaignCode();
        n campaignType = yVar.getCampaignType();
        List upsells = yVar.getUpsells();
        if (upsells != null) {
            List list = upsells;
            arrayList = arrayList5;
            arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it11 = list.iterator();
            while (it11.hasNext()) {
                e0 e0Var = (e0) it11.next();
                Upsell.Type upsellType = e0Var.getUpsellType();
                Integer urgencyDays = e0Var.getUrgencyDays();
                List steps2 = e0Var.getSteps();
                Iterator it12 = it11;
                ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = activeOrPastInvitesInfo3;
                ArrayList arrayList7 = new ArrayList(w.t(steps2, 10));
                Iterator it13 = steps2.iterator();
                while (it13.hasNext()) {
                    arrayList7.add(c8g.a.G((b0) it13.next()));
                }
                c0 banner2 = e0Var.getBanner();
                Upsell.Banner banner3 = new Upsell.Banner(banner2.getTitle(), banner2.getDescription());
                d0 modal2 = e0Var.getModal();
                arrayList2.add(new Upsell(upsellType, urgencyDays, arrayList7, banner3, new Upsell.Modal(modal2.getTitle(), modal2.getStepsTitle(), modal2.getImageUrl(), modal2.getDisclaimer()), e0Var.getReward()));
                it11 = it12;
                activeOrPastInvitesInfo3 = activeOrPastInvitesInfo4;
                inviteeChallengePeriod = inviteeChallengePeriod;
            }
        } else {
            arrayList = arrayList5;
            arrayList2 = null;
        }
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo5 = activeOrPastInvitesInfo3;
        Integer num = inviteeChallengePeriod;
        List list2 = arrayList2;
        if (arrayList2 == null) {
            list2 = f0.f322471a;
        }
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo6 = activeOrPastInvitesInfo;
        String disclaimer = yVar.getDisclaimer();
        List howItWorks = yVar.getHowItWorks();
        if (howItWorks != null) {
            List list3 = howItWorks;
            arrayList3 = new ArrayList(w.t(list3, 10));
            Iterator it14 = list3.iterator();
            while (it14.hasNext()) {
                arrayList3.add(new HowItWorks(((k) it14.next()).getTitle()));
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = f0.f322471a;
        }
        List conditions = yVar.getConditions();
        if (conditions != null) {
            List list4 = conditions;
            arrayList4 = new ArrayList(w.t(list4, 10));
            Iterator it15 = list4.iterator();
            list2 = list2;
            while (it15.hasNext()) {
                j jVar = (j) it15.next();
                arrayList4.add(new Condition(jVar.getTitle(), jVar.getIcon()));
                it15 = it15;
                list2 = list2;
            }
        } else {
            arrayList4 = null;
        }
        List list5 = list2;
        List list6 = arrayList4;
        if (arrayList4 == null) {
            list6 = f0.f322471a;
        }
        Boolean hasCompletedInviteRewards = yVar.getHasCompletedInviteRewards();
        return new ReferralCampaignV4(activeOrPastInvitesInfo6, activeOrPastInvitesInfo2, activeOrPastInvitesInfo5, num, referrerTotalInvites, multilevelDetails, referralCode, cashbackInfo, campaignCode, campaignType, inviteLink, title, instantOfEpochMilli, isDefaultCampaign, description, imageUrl, inviteSuccessMessage, inviteText, maxReferrerRewards, participationId, rewardInfo, oVar, termsUrl, map, arrayList, list5, disclaimer, arrayList3, list6, hasCompletedInviteRewards != null ? hasCompletedInviteRewards.booleanValue() : false);
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Map] */
    public static final y b(ReferralCampaignV4 referralCampaignV4) {
        u uVar;
        Long l2;
        Integer num;
        c cVar;
        Integer num2;
        String str;
        z zVar;
        Map mapT;
        String str2;
        ArrayList arrayList;
        Map map;
        h hVar;
        a0 a0Var;
        s sVar;
        Intrinsics.checkNotNullParameter(referralCampaignV4, "<this>");
        String str3 = referralCampaignV4.f81758l;
        Integer num3 = referralCampaignV4.d;
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = referralCampaignV4.f81753b;
        c cVarP = activeOrPastInvitesInfo != null ? c6d.b.P(activeOrPastInvitesInfo) : null;
        Integer num4 = referralCampaignV4.e;
        Instant instant = referralCampaignV4.f81759m;
        Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
        String str4 = referralCampaignV4.o;
        MultilevelDetails multilevelDetails = referralCampaignV4.f;
        if (multilevelDetails != null) {
            MultilevelDetailsInfo multilevelDetailsInfo = multilevelDetails.f81747a;
            t tVar = new t(multilevelDetailsInfo.f81749a, multilevelDetailsInfo.f81750b);
            MultilevelDetailsInfo multilevelDetailsInfo2 = multilevelDetails.f81748b;
            uVar = new u(tVar, new t(multilevelDetailsInfo2.f81749a, multilevelDetailsInfo2.f81750b));
        } else {
            uVar = null;
        }
        boolean z = referralCampaignV4.f81760n;
        c cVar2 = cVarP;
        Long l3 = lValueOf;
        u uVar2 = uVar;
        String str5 = referralCampaignV4.f81761p;
        String str6 = referralCampaignV4.f81762q;
        String str7 = referralCampaignV4.f81763r;
        c cVarP2 = c6d.b.P(referralCampaignV4.f81752a);
        c cVarP3 = c6d.b.P(referralCampaignV4.f81754c);
        Integer num5 = referralCampaignV4.f81764s;
        String str8 = referralCampaignV4.f81765t;
        RewardInfo rewardInfo = referralCampaignV4.u;
        if (rewardInfo != null) {
            l2 = l3;
            String str9 = rewardInfo.f81773a;
            String str10 = rewardInfo.f81774b;
            ReferralReward referralReward = rewardInfo.f81775c;
            if (referralReward != null) {
                Intrinsics.checkNotNullParameter(referralReward, "<this>");
                num = num3;
                cVar = cVar2;
                d dVar = referralReward.f81769a;
                num2 = num4;
                str = str4;
                long j2 = dVar.f115082a;
                String str11 = dVar.f115083b.f306286a;
                xi0.b bVar = referralReward.f81770b;
                a0Var = new a0(j2, str11, bVar != null ? bVar.f306286a : null);
            } else {
                num = num3;
                cVar = cVar2;
                num2 = num4;
                str = str4;
                a0Var = null;
            }
            String str12 = rewardInfo.d;
            MaxVariableReward maxVariableReward = rewardInfo.e;
            if (maxVariableReward != null) {
                Intrinsics.checkNotNullParameter(maxVariableReward, "<this>");
                d dVar2 = maxVariableReward.f81745a;
                sVar = new s(dVar2.f115082a, dVar2.f115083b.f306286a, maxVariableReward.f81746b);
            } else {
                sVar = null;
            }
            zVar = new z(str9, str10, a0Var, str12, sVar);
        } else {
            l2 = l3;
            num = num3;
            cVar = cVar2;
            num2 = num4;
            str = str4;
            zVar = null;
        }
        ArrayList arrayList2 = referralCampaignV4.f81768y;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(c8g.a.M((Step) it8.next()));
        }
        String str13 = referralCampaignV4.f81766w;
        Map map2 = referralCampaignV4.f81767x;
        if (map2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry : map2.entrySet()) {
                String strH = u1.h((Enum) entry.getKey(), axa.b.f10911a);
                Pair pair = strH != null ? new Pair(strH, entry.getValue()) : null;
                if (pair != null) {
                    arrayList4.add(pair);
                }
            }
            mapT = r0.t(arrayList4);
        } else {
            mapT = null;
        }
        String str14 = referralCampaignV4.f81755g;
        CashbackInfo cashbackInfo = referralCampaignV4.f81756h;
        if (cashbackInfo != null) {
            CashbackReward cashbackReward = cashbackInfo.f81713a;
            str2 = str13;
            arrayList = arrayList3;
            map = mapT;
            i iVar = new i(cashbackReward.f81715a, cashbackReward.f81716b, cashbackReward.f81717c);
            CashbackReward cashbackReward2 = cashbackInfo.f81714b;
            hVar = new h(iVar, new i(cashbackReward2.f81715a, cashbackReward2.f81716b, cashbackReward2.f81717c));
        } else {
            str2 = str13;
            arrayList = arrayList3;
            map = mapT;
            hVar = null;
        }
        String str15 = referralCampaignV4.k;
        o oVar = referralCampaignV4.v;
        String strName = oVar != null ? oVar.name() : null;
        String str16 = referralCampaignV4.i;
        n nVar = referralCampaignV4.f81757j;
        List list = referralCampaignV4.z;
        ArrayList arrayList5 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            Upsell upsell = (Upsell) it9.next();
            Upsell.Type type = upsell.f81780a;
            Iterator it10 = it9;
            Integer num6 = upsell.f81781b;
            ArrayList arrayList6 = upsell.f81782c;
            n nVar2 = nVar;
            String str17 = str14;
            h hVar2 = hVar;
            ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                arrayList7.add(c8g.a.M((Step) it11.next()));
            }
            Upsell.Banner banner = upsell.d;
            c0 c0Var = new c0(banner.f81783a, banner.f81784b);
            Upsell.Modal modal = upsell.e;
            arrayList5.add(new e0(type, num6, arrayList7, c0Var, new d0(modal.f81785a, modal.f81786b, modal.f81787c, modal.d), upsell.f));
            it9 = it10;
            nVar = nVar2;
            str14 = str17;
            hVar = hVar2;
        }
        n nVar3 = nVar;
        String str18 = str14;
        h hVar3 = hVar;
        String str19 = referralCampaignV4.A;
        List list2 = referralCampaignV4.B;
        ArrayList arrayList8 = new ArrayList(w.t(list2, 10));
        Iterator it12 = list2.iterator();
        while (it12.hasNext()) {
            arrayList8.add(new k(((HowItWorks) it12.next()).f81723a));
        }
        List<Condition> list3 = referralCampaignV4.C;
        ArrayList arrayList9 = new ArrayList(w.t(list3, 10));
        for (Condition condition : list3) {
            arrayList9.add(new j(condition.f81718a, condition.f81719b));
            str19 = str19;
        }
        return new y(l2, num, cVar, num2, str, uVar2, z, str5, str6, str7, str15, cVarP2, cVarP3, num5, str8, zVar, arrayList, str2, map, str3, str18, str16, nVar3, hVar3, arrayList5, strName, str19, arrayList8, arrayList9, Boolean.valueOf(referralCampaignV4.D));
    }
}
