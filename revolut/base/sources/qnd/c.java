package qnd;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MaxVariableReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.RewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import com.revolut.retail.feature.api.AnalyticsAccount;
import djb.j;
import do3.n;
import hzi.f;
import ip0.qj;
import ip0.tj;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import od0.h;
import od0.i;
import pcd.e0;
import pcd.g0;
import pcd.s;
import pwa.o;
import qoa.e;
import qoc.a0;
import qoc.c0;
import qoc.s0;
import qp7.p;
import rp0.z;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247938a;

    public /* synthetic */ c(int i) {
        this.f247938a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f247938a) {
            case 0:
                AnalyticsAccount getIndividualSelection = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(getIndividualSelection, "$this$getIndividualSelection");
                return Boolean.valueOf(getIndividualSelection instanceof AnalyticsAccount.Pro.CurrencyPocket);
            case 1:
                AnalyticsAccount getIndividualSelection2 = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(getIndividualSelection2, "$this$getIndividualSelection");
                return Boolean.valueOf(getIndividualSelection2 instanceof AnalyticsAccount.Savings.PersonalIndividual);
            case 2:
                AnalyticsAccount getIndividualSelection3 = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(getIndividualSelection3, "$this$getIndividualSelection");
                return Boolean.valueOf(getIndividualSelection3 instanceof AnalyticsAccount.Savings.JointIndividual);
            case 3:
                ReferralCampaignV4 it8 = (ReferralCampaignV4) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                RewardInfo rewardInfo = it8.u;
                o oVar = it8.v;
                if (rewardInfo == null) {
                    return null;
                }
                MaxVariableReward maxVariableReward = rewardInfo.e;
                if (maxVariableReward != null) {
                    return new TextLocalisedClause(R$string.profile_action_invite_subtitle_upto, u.c(e.d(maxVariableReward.f81745a, oVar)), null, 12);
                }
                ReferralReward referralReward = rewardInfo.f81775c;
                dj0.d dVar = referralReward != null ? referralReward.f81769a : null;
                if (dVar == null) {
                    return null;
                }
                List list = it8.z;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (Intrinsics.f(((Upsell) obj3).f.f115083b, dVar.f115083b)) {
                        arrayList.add(obj3);
                    }
                }
                dj0.d.Companion.getClass();
                dj0.d dVarO = dj0.d.e;
                int i = 0;
                for (Object obj4 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i == 0 ? ((Upsell) obj4).f : pyd.c.O(dVarO, ((Upsell) obj4).f);
                    i = i2;
                }
                return new TextLocalisedClause(R$string.profile_action_invite_subtitle, u.c(e.d(pyd.c.O(dVar, dVarO), oVar)), null, 12);
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((qj) pair.f186385a).f165994l instanceof qoc.v);
            case 6:
                ty0.a it9 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj5 = it9.d;
                if (obj5 instanceof a0) {
                    return (a0) obj5;
                }
                return null;
            case 7:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return Boolean.valueOf(((cy0.a) pair2.f186386b).f110015b && (((InputSliderDelegate.Model) pair2.f186385a).f52567m instanceof c0));
            case 8:
                InputSliderDelegate.Model it10 = (InputSliderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj6 = it10.f52567m;
                if (obj6 instanceof c0) {
                    return (c0) obj6;
                }
                return null;
            case 9:
                SmallActionButtonDelegate.Model it11 = (SmallActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj7 = it11.f53342j;
                if (obj7 instanceof qoc.u) {
                    return (qoc.u) obj7;
                }
                return null;
            case 10:
                LargeActionButtonDelegate.Model it12 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj8 = it12.i;
                if (obj8 instanceof a0) {
                    return (a0) obj8;
                }
                return null;
            case 11:
                z it13 = (z) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj9 = it13.f256228b;
                if (obj9 instanceof a0) {
                    return (a0) obj9;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return yp0.b.g(u.c(new tj("strategies_template_overview_projection_chart")), s0.c(), null, 0, 0, 126);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 14:
                String it14 = (String) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return "'" + it14 + "'";
            case 15:
                return (CryptoAddress) ((Data) obj2).getContent();
            case 16:
                Data it15 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15.getContent() != null);
            case 17:
                return (n) ((Data) obj2).getContent();
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                i.Companion.getClass();
                return i.f224256b;
            case 20:
                i it16 = (i) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return zi0.c.P(it16, false, null, 3);
            case 21:
                z data = (z) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(Intrinsics.f(data.f256227a, "LIMIT_DIALOG_LEARN_MORE"));
            case 22:
                z data2 = (z) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return Boolean.valueOf(Intrinsics.f(data2.f256227a, "PRICE_LEARN_MORE_ID"));
            case 23:
                Clause it17 = (Clause) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                i.Companion.getClass();
                return zi0.c.P(h.a(it17), false, null, 3);
            case 24:
                Data it18 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj10 = (List) it18.getContent();
                if (obj10 == null) {
                    obj10 = f0.f322471a;
                }
                return Data.copy$default(it18, obj10, null, false, 6, null);
            case 25:
                Data it19 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19.getContent() != null);
            case 26:
                return qp6.b.a((qp6.b) obj2, null, 5);
            case 27:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new p((List) getDefaultLoadingItems.invoke(), false);
            case 28:
                s it20 = (s) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                g0 g0Var = it20.f234885h;
                boolean z = false;
                if (g0Var instanceof e0) {
                    String str = ((e0) g0Var).d.f234844g;
                    if (str != null && str.length() != 0) {
                        z = true;
                    }
                } else if (!(g0Var instanceof pcd.f0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            default:
                djb.a methods = (djb.a) obj2;
                Intrinsics.checkNotNullParameter(methods, "methods");
                j recurringTransfers = methods.f115272a;
                Intrinsics.checkNotNullParameter(recurringTransfers, "recurringTransfers");
                djb.s spareChanges = djb.s.f115286a;
                Intrinsics.checkNotNullParameter(spareChanges, "spareChanges");
                f incomeSorterEntryPointData = f.f157194a;
                Intrinsics.checkNotNullParameter(incomeSorterEntryPointData, "incomeSorterEntryPointData");
                djb.f proTax = djb.f.f115278a;
                Intrinsics.checkNotNullParameter(proTax, "proTax");
                return new djb.a(recurringTransfers, spareChanges, incomeSorterEntryPointData, proTax);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f247938a = i;
    }
}
