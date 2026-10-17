package iui;

import aim.e;
import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MaxVariableReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.RewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import hvb.f;
import hvb.l;
import hvb.o;
import ip0.ek;
import ip0.gu;
import ip0.kg;
import ip0.nb0;
import ip0.pb0;
import ip0.sy;
import ip0.xk;
import ip0.z9;
import iuj.q;
import iv7.j;
import iw4.k;
import iw4.p;
import iw8.g;
import java.util.ArrayList;
import java.util.List;
import k77.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import pwa.n;
import ql4.a0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168617a;

    public /* synthetic */ a(int i) {
        this.f168617a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        MaxVariableReward maxVariableReward;
        String str;
        Data content;
        switch (this.f168617a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                nb0 nb0Var = pb0.Companion;
                return yp0.b.g(v.k(nb0.b(nb0Var, "list_id_airport_loading_1", false, 0, false, 30), nb0.b(nb0Var, "list_id_airport_loading_2", false, 0, false, 30)), d.b(), null, 0, 0, 126);
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new TextLocalisedClause(R$string.asft_home_button_buy_pass, null, null, 14);
            case 2:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return yp0.b.g(u.c(new kg("list_id_pass_loading", 14)), d.a(0), null, 0, 0, 126);
            case 3:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Float fValueOf = Float.valueOf(16.0f);
                gu guVar = new gu("CHALLENGES_LOADING_SUBHEADER_ID", 0, 0, 30);
                ArrayList arrayList = new ArrayList(6);
                for (int i = 0; i < 6; i++) {
                    z9 z9Var = new z9(a0.d.n("CHALLENGE_SLOT_", i));
                    yp0.b.l(z9Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(z9Var);
                }
                return v.k(guVar, new xk("CHALLENGES_LOADING_GRID_ID", arrayList, 2, fValueOf, fValueOf, 32));
            case 4:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return q.b.f168643a;
            case 5:
                ReferralCampaignV4 it13 = (ReferralCampaignV4) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                RewardInfo rewardInfo = it13.u;
                if (rewardInfo == null) {
                    return null;
                }
                MaxVariableReward maxVariableReward2 = rewardInfo.e;
                if (maxVariableReward2 != null) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_home_invite_subtitle_upto, u.c(new MoneyClause(maxVariableReward2.f81745a, new MoneyClause.Format.Shorts(false, 59), null, null, 12)), null, 12);
                } else {
                    ReferralReward referralReward = rewardInfo.f81775c;
                    dj0.d dVar = referralReward != null ? referralReward.f81769a : null;
                    if (dVar == null) {
                        return null;
                    }
                    List list = it13.z;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (Intrinsics.f(((Upsell) obj3).f.f115083b, dVar.f115083b)) {
                            arrayList2.add(obj3);
                        }
                    }
                    dj0.d.Companion.getClass();
                    dj0.d dVarO = dj0.d.e;
                    int i2 = 0;
                    for (Object obj4 : arrayList2) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            v.s();
                            throw null;
                        }
                        dVarO = i2 == 0 ? ((Upsell) obj4).f : pyd.c.O(dVarO, ((Upsell) obj4).f);
                        i2 = i3;
                    }
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_home_invite_subtitle, u.c(new MoneyClause(pyd.c.O(dVar, dVarO), new MoneyClause.Format.Shorts(false, 59), null, null, 12)), null, 12);
                }
                return textLocalisedClause;
            case 6:
                ReferralCampaignV4 it14 = (ReferralCampaignV4) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                RewardInfo rewardInfo2 = it14.u;
                if (rewardInfo2 == null || (maxVariableReward = rewardInfo2.e) == null || (str = maxVariableReward.f81746b) == null) {
                    return null;
                }
                n nVar = it14.f81757j;
                if (nVar == null || nVar == n.SALARY) {
                    return new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_home_invite_subtitle_salary, u.c(str), null, 12);
                }
                return null;
            case 7:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return null;
            case 8:
                i it16 = (i) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                String str2 = it16.d;
                return str2 == null ? it16.f181835b : str2;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return iii.c.c(1);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 11:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                j.a aVar = j.Companion;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 12:
                Function0 it17 = (Function0) obj2;
                j.a aVar2 = j.Companion;
                Intrinsics.checkNotNullParameter(it17, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 13:
                f it18 = (f) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return knm.b.I(it18);
            case 14:
                hvb.c it19 = (hvb.c) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return knm.b.H(it19);
            case 15:
                l it20 = (l) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f155808a;
            case 16:
                o it21 = (o) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f155810a;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List listC = u.c(nb0.b(pb0.Companion, "EXPANDABLE_LOADING_CELL_ID__ESIMS_BLOCK", false, 0, false, 30));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 18:
                od0.i optionalPaymentMethod = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalPaymentMethod, "optionalPaymentMethod");
                PaymentMethod paymentMethod = (PaymentMethod) optionalPaymentMethod.g();
                PaymentMethod.Pocket pocket = paymentMethod != null ? (PaymentMethod.Pocket) (paymentMethod instanceof PaymentMethod.Pocket ? paymentMethod : null) : null;
                if (pocket != null) {
                    return new ivf.f(pocket);
                }
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(optionalPaymentMethod.f224257a, "Unable to get default pocket. Default payment method type is: "));
            case 19:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.TRANSPORT) : b39.b.f12015a;
            case 20:
                Function0 it22 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                e eVarB = u.b();
                eVarB.add(new gu("global-news-header-list-id", 0, 0, 30));
                ArrayList arrayList3 = new ArrayList(4);
                for (int i5 = 0; i5 < 4; i5++) {
                    arrayList3.add(new sy(a0.d.n("global-news-item-loading-", i5), null, 62));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList3);
                return u.a(eVarB);
            case 21:
                Function0 it23 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                List listC2 = u.c(new ek("insights-news-empty-list-id", 0, 0, 0, 0, false, 126, false));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                return listC2;
            case 22:
                iw4.l update = (iw4.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = update.f168950a;
                try {
                    Object content2 = data.getContent();
                    content = new Data(content2 != null ? k.a((k) content2, null, null, null, 23) : null, data.getError(), data.getLoading());
                    break;
                } catch (Throwable th10) {
                    content = new Data(null, th10, data.getLoading());
                }
                Intrinsics.checkNotNullParameter(content, "content");
                return new iw4.l(content);
            case 23:
                od0.i it24 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return ((a0) it24.c()).f247088c;
            case 24:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                return new p((List) loadingItems.invoke(), new iw4.o(null, false), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_title, null, null, 14));
            case 25:
                Function0 loadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems2, "loadingItems");
                return new p((List) loadingItems2.invoke(), new iw4.o(null, false), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_screen_title, null, null, 14));
            case 26:
                g update2 = (g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return g.a(update2, 6);
            case 27:
                g update3 = (g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return g.a(update3, 5);
            case 28:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new fwc.i((List) pair.f186385a, (List) pair.f186386b);
            default:
                List walletLimits = (List) obj2;
                Intrinsics.checkNotNullParameter(walletLimits, "walletLimits");
                return new fwc.i(f0.f322471a, walletLimits);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f168617a = i;
    }
}
