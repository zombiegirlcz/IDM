package axa;

import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.CashbackInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.CashbackReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Condition;
import com.revolut.feature.referrals.common.data.api.domain.model.common.EligibilityCriteria;
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
import hx7.i;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import pwa.h;
import pwa.n;
import pwa.o;
import pwa.p;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;
import zwa.e;
import zwa.f;
import zwa.g;
import zwa.k;
import zwa.l;
import zwa.m;
import zwa.r;
import zwa.u;
import zwa.v;
import zwa.x;
import zwa.y;
import zwa.z;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10911a = r0.k(new Pair("CRYPTO_CURRENCY", pwa.a.CRYPTO_CURRENCY), new Pair("PERSONAL", pwa.a.PERSONAL));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f10912b = q0.c(new Pair("STATUS", h.STATUS));

    public static final Map a() {
        return f10912b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public static final ReferralCampaignV4 b(r rVar) {
        MultilevelDetails multilevelDetails;
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo;
        RewardInfo rewardInfo;
        Map mapT;
        Map map;
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo2;
        n nVar;
        ArrayList arrayList;
        CashbackInfo cashbackInfo;
        o oVar;
        ArrayList arrayList2;
        ?? arrayList3;
        ArrayList arrayList4;
        Upsell.Type type;
        n nVar2;
        pwa.a aVar;
        ReferralReward referralReward;
        MaxVariableReward maxVariableReward;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        String title = rVar.getTitle();
        Integer referrerTotalInvites = rVar.getReferrerTotalInvites();
        Long deadline = rVar.getDeadline();
        Instant instantOfEpochMilli = deadline != null ? Instant.ofEpochMilli(deadline.longValue()) : null;
        Integer inviteeChallengePeriod = rVar.getInviteeChallengePeriod();
        swa.b recentInvites = rVar.getRecentInvites();
        ActiveOrPastInvitesInfo activeOrPastInvitesInfoI = recentInvites != null ? i.I(recentInvites) : null;
        String description = rVar.getDescription();
        l multiLevelDetails = rVar.getMultiLevelDetails();
        if (multiLevelDetails != null) {
            m banner = multiLevelDetails.getBanner();
            MultilevelDetailsInfo multilevelDetailsInfo = new MultilevelDetailsInfo(banner.getTitle(), banner.getDescription());
            m modal = multiLevelDetails.getModal();
            multilevelDetails = new MultilevelDetails(multilevelDetailsInfo, new MultilevelDetailsInfo(modal.getTitle(), modal.getDescription()));
        } else {
            multilevelDetails = null;
        }
        boolean isDefaultCampaign = rVar.getIsDefaultCampaign();
        String imageUrl = rVar.getImageUrl();
        String inviteSuccessMessage = rVar.getInviteSuccessMessage();
        String inviteText = rVar.getInviteText();
        ActiveOrPastInvitesInfo activeOrPastInvitesInfoI2 = i.I(rVar.getActiveInvites());
        ActiveOrPastInvitesInfo activeOrPastInvitesInfoI3 = i.I(rVar.getPastInvites());
        Integer maxReferrerRewards = rVar.getMaxReferrerRewards();
        String participationId = rVar.getParticipationId();
        u rewardInfo2 = rVar.getRewardInfo();
        if (rewardInfo2 != null) {
            String description2 = rewardInfo2.getDescription();
            String detailedDescription = rewardInfo2.getDetailedDescription();
            String title2 = rewardInfo2.getTitle();
            v reward = rewardInfo2.getReward();
            if (reward != null) {
                Intrinsics.checkNotNullParameter(reward, "<this>");
                activeOrPastInvitesInfo = activeOrPastInvitesInfoI2;
                long amount = reward.getAmount();
                xi0.a aVar2 = xi0.b.Companion;
                String currency = reward.getCurrency();
                aVar2.getClass();
                d dVar = new d(amount, xi0.a.a(currency));
                String targetCurrency = reward.getTargetCurrency();
                referralReward = new ReferralReward(dVar, targetCurrency != null ? xi0.a.a(targetCurrency) : null);
            } else {
                activeOrPastInvitesInfo = activeOrPastInvitesInfoI2;
                referralReward = null;
            }
            k maxVariableReward2 = rewardInfo2.getMaxVariableReward();
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
            activeOrPastInvitesInfo = activeOrPastInvitesInfoI2;
            rewardInfo = null;
        }
        List steps = rVar.getSteps();
        ArrayList arrayList5 = new ArrayList(w.t(steps, 10));
        Iterator it8 = steps.iterator();
        while (it8.hasNext()) {
            arrayList5.add(c((zwa.w) it8.next()));
        }
        String termsUrl = rVar.getTermsUrl();
        Map additionalTerms = rVar.getAdditionalTerms();
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
                    if (a0.z(aVar4.name(), str, true)) {
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
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo3 = activeOrPastInvitesInfoI3;
        String referralCode = rVar.getReferralCode();
        String campaignCode = rVar.getCampaignCode();
        String campaignType = rVar.getCampaignType();
        if (campaignType != null) {
            n[] nVarArrValues = n.values();
            int length2 = nVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    map = mapT;
                    activeOrPastInvitesInfo2 = activeOrPastInvitesInfoI;
                    nVar2 = null;
                    break;
                }
                nVar2 = nVarArrValues[i3];
                map = mapT;
                activeOrPastInvitesInfo2 = activeOrPastInvitesInfoI;
                if (a0.z(nVar2.name(), campaignType, true)) {
                    break;
                }
                i3++;
                mapT = map;
                activeOrPastInvitesInfoI = activeOrPastInvitesInfo2;
            }
            nVar = nVar2;
        } else {
            map = mapT;
            activeOrPastInvitesInfo2 = activeOrPastInvitesInfoI;
            nVar = null;
        }
        e cashbackInfo2 = rVar.getCashbackInfo();
        if (cashbackInfo2 != null) {
            f referrerReward = cashbackInfo2.getReferrerReward();
            CashbackReward cashbackReward = new CashbackReward(referrerReward.getTitle(), referrerReward.getAmountLabel(), referrerReward.getDescription());
            f inviteeReward = cashbackInfo2.getInviteeReward();
            arrayList = arrayList5;
            cashbackInfo = new CashbackInfo(cashbackReward, new CashbackReward(inviteeReward.getTitle(), inviteeReward.getAmountLabel(), inviteeReward.getDescription()));
        } else {
            arrayList = arrayList5;
            cashbackInfo = null;
        }
        String inviteLink = rVar.getInviteLink();
        String rewardType = rVar.getRewardType();
        if (rewardType != null) {
            o[] oVarArrValues = o.values();
            int length3 = oVarArrValues.length;
            int i5 = 0;
            while (i5 < length3) {
                oVar = oVarArrValues[i5];
                o[] oVarArr = oVarArrValues;
                int i6 = length3;
                if (a0.z(oVar.name(), rewardType, true)) {
                    break;
                }
                i5++;
                oVarArrValues = oVarArr;
                length3 = i6;
            }
            oVar = null;
        } else {
            oVar = null;
        }
        List upsells = rVar.getUpsells();
        if (upsells != null) {
            List list = upsells;
            arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it11 = list.iterator();
            while (it11.hasNext()) {
                y yVar = (y) it11.next();
                String upsellType = yVar.getUpsellType();
                Iterator it12 = it11;
                Upsell.Type[] typeArrValues = Upsell.Type.values();
                int length4 = typeArrValues.length;
                int i21 = 0;
                while (true) {
                    if (i21 >= length4) {
                        type = null;
                        break;
                    }
                    type = typeArrValues[i21];
                    int i22 = i21;
                    int i32 = length4;
                    if (a0.z(type.name(), upsellType, true)) {
                        break;
                    }
                    i21 = i22 + 1;
                    length4 = i32;
                }
                if (type == null) {
                    type = Upsell.Type.DEFAULT;
                }
                Upsell.Type type2 = type;
                Integer urgencyDays = yVar.getUrgencyDays();
                List steps2 = yVar.getSteps();
                ActiveOrPastInvitesInfo activeOrPastInvitesInfo4 = activeOrPastInvitesInfo3;
                ArrayList arrayList7 = new ArrayList(w.t(steps2, 10));
                Iterator it13 = steps2.iterator();
                while (it13.hasNext()) {
                    arrayList7.add(c((zwa.w) it13.next()));
                }
                x banner2 = yVar.getBanner();
                Upsell.Banner banner3 = new Upsell.Banner(banner2.getTitle(), banner2.getDescription());
                z modal2 = yVar.getModal();
                arrayList2.add(new Upsell(type2, urgencyDays, arrayList7, banner3, new Upsell.Modal(modal2.getTitle(), modal2.getStepsTitle(), modal2.getImageUrl(), modal2.getDisclaimer()), mo3.a.o(yVar.getReward())));
                it11 = it12;
                activeOrPastInvitesInfo3 = activeOrPastInvitesInfo4;
                inviteeChallengePeriod = inviteeChallengePeriod;
            }
        } else {
            arrayList2 = null;
        }
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo5 = activeOrPastInvitesInfo3;
        Integer num = inviteeChallengePeriod;
        List list2 = arrayList2;
        if (arrayList2 == null) {
            list2 = f0.f322471a;
        }
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo6 = activeOrPastInvitesInfo;
        String disclaimer = rVar.getDisclaimer();
        List howItWorks = rVar.getHowItWorks();
        if (howItWorks != null) {
            List list3 = howItWorks;
            arrayList3 = new ArrayList(w.t(list3, 10));
            Iterator it14 = list3.iterator();
            while (it14.hasNext()) {
                arrayList3.add(new HowItWorks(((zwa.h) it14.next()).getTitle()));
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = f0.f322471a;
        }
        List conditions = rVar.getConditions();
        if (conditions != null) {
            List list4 = conditions;
            arrayList4 = new ArrayList(w.t(list4, 10));
            Iterator it15 = list4.iterator();
            list2 = list2;
            while (it15.hasNext()) {
                g gVar = (g) it15.next();
                arrayList4.add(new Condition(gVar.getTitle(), gVar.getIcon()));
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
        Boolean hasCompletedInviteRewards = rVar.getHasCompletedInviteRewards();
        return new ReferralCampaignV4(activeOrPastInvitesInfo6, activeOrPastInvitesInfo2, activeOrPastInvitesInfo5, num, referrerTotalInvites, multilevelDetails, referralCode, cashbackInfo, campaignCode, nVar, inviteLink, title, instantOfEpochMilli, isDefaultCampaign, description, imageUrl, inviteSuccessMessage, inviteText, maxReferrerRewards, participationId, rewardInfo, oVar, termsUrl, map, arrayList, list5, disclaimer, arrayList3, list6, hasCompletedInviteRewards != null ? hasCompletedInviteRewards.booleanValue() : false);
    }

    public static final Step c(zwa.w wVar) {
        p pVar;
        ArrayList arrayList;
        AdditionalInfo additionalInfo;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        String code = wVar.getCode();
        p[] pVarArrValues = p.values();
        int length = pVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                pVar = null;
                break;
            }
            pVar = pVarArrValues[i];
            if (a0.z(pVar.name(), code, true)) {
                break;
            }
            i++;
        }
        if (pVar == null) {
            pVar = p.UNKNOWN;
        }
        p pVar2 = pVar;
        String description = wVar.getDescription();
        String title = wVar.getTitle();
        List eligibilityCriteria = wVar.getEligibilityCriteria();
        if (eligibilityCriteria != null) {
            List<swa.e> list = eligibilityCriteria;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (swa.e eVar : list) {
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                arrayList2.add(new EligibilityCriteria(eVar.getIcon(), eVar.getTitle(), eVar.getDescription()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        swa.d additionalInfo2 = wVar.getAdditionalInfo();
        if (additionalInfo2 != null) {
            Intrinsics.checkNotNullParameter(additionalInfo2, "<this>");
            additionalInfo = new AdditionalInfo(additionalInfo2.getTitle(), additionalInfo2.getSubtitle());
        } else {
            additionalInfo = null;
        }
        jo3.a reward = wVar.getReward();
        return new Step(pVar2, description, title, arrayList, additionalInfo, reward != null ? mo3.a.o(reward) : null, wVar.getIcon());
    }
}
