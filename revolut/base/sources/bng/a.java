package bng;

import bo8.j;
import bo8.k;
import bq5.a0;
import bq5.q0;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dj0.d;
import do3.n;
import do3.q;
import do3.s;
import hx7.e;
import ip0.gu;
import ip0.n30;
import ip0.nb0;
import ip0.pb0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mif.e0;
import od0.i;
import yg0.c;
import yhm.r;
import yna.x;
import yna.y;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zlg.g;
import zlg.h;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17167a;

    public /* synthetic */ a(int i) {
        this.f17167a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int iIntValue;
        int i = this.f17167a;
        x xVar = x.f315383a;
        switch (i) {
            case 0:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return user.f116415m == s.TERMINATED ? new h(user.f116416n) : g.f323255a;
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return f0.f322471a;
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Pair pair2 = (Pair) pair.f186385a;
                return new r((Map) pair2.f186385a, (Set) pair2.f186386b, (List) pair.f186386b);
            case 3:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return f0.f322471a;
            case 4:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return f0.f322471a;
            case 5:
                yg0.b it11 = (yg0.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (it11 instanceof yg0.a) {
                    return (yg0.a) it11;
                }
                return null;
            case 6:
                yg0.b it12 = (yg0.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                if (it12 instanceof c) {
                    return (c) it12;
                }
                return null;
            case 7:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                of8.b bVar = (of8.b) pair3.f186385a;
                xc8.c cVar = (xc8.c) ((xc8.g) pair3.f186386b).f304108b.get(v6d.a.PAYMENT_LINKS);
                return (!i2b.a.h(bVar.f224753j) || cVar == null) ? k.f17320a : new j(cVar);
            case 8:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) rVar.f314201a;
                List list = (List) rVar.f314202b;
                i iVar = (i) rVar.f314203c;
                fo3.c cVar2 = (fo3.c) ((Pair) d0.K0(list)).f186385a;
                PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle = (PaymentLinkCustomAmountBundle) iVar.f224257a;
                if (paymentLinkCustomAmountBundle == null) {
                    d dVar = new d(0L, cVar2.d);
                    m70.a.c(t0.f186434a);
                    paymentLinkCustomAmountBundle = new PaymentLinkCustomAmountBundle(dVar, "");
                }
                PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle2 = paymentLinkCustomAmountBundle;
                String value = juniorBankingProfile.f77103j;
                Intrinsics.checkNotNullParameter(value, "value");
                String str = juniorBankingProfile.f77099b;
                String str2 = juniorBankingProfile.f77100c;
                String str3 = juniorBankingProfile.f77102h;
                if (str3 == null) {
                    throw new IllegalArgumentException("Unexpected null for username");
                }
                String str4 = juniorBankingProfile.o;
                if (str4 != null) {
                    return new bo8.d(value, str, str2, str3, str4, paymentLinkCustomAmountBundle2);
                }
                throw new IllegalArgumentException("Unexpected null for receiveTransferUrl");
            case 9:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarA = nb0.a(nb0Var, "SENDING_MONEY_INFO_LOADING", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                gu guVar = new gu("WAYS_TO_GET_PAID_SUBHEADER_LOADING", 0, 0, 30);
                pb0 pb0VarB = nb0.b(nb0Var, "SHARE_ACCOUNT_DETAILS_LOADING", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                pb0 pb0VarB2 = nb0.b(nb0Var, "SHARE_PAYMENT_LINK_LOADING", false, 0, false, 30);
                yp0.b.l(pb0VarB2, 0, 0, 0, 0, null, false, 63);
                return v.k(pb0VarA, guVar, pb0VarB, pb0VarB2);
            case 10:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return u.c(new n30(new ProfileCardModel.Loading(0)));
            case 11:
                Data feedsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(feedsData, "feedsData");
                Integer num = (Integer) feedsData.getContent();
                iIntValue = num != null ? num.intValue() : 0;
                return iIntValue == 0 ? xVar : new y(iIntValue);
            case 12:
                Data unreadNotificationsCountData = (Data) obj2;
                Intrinsics.checkNotNullParameter(unreadNotificationsCountData, "unreadNotificationsCountData");
                Integer num2 = (Integer) unreadNotificationsCountData.getContent();
                iIntValue = num2 != null ? num2.intValue() : 0;
                return iIntValue > 0 ? new y(iIntValue) : xVar;
            case 13:
                uib.a it15 = (uib.a) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f280366a;
            case 14:
                Throwable it16 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return null;
            case 15:
                n it17 = (n) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return q.y(it17);
            case 16:
                return Boolean.valueOf(opg.a.h((SavingsProductData) obj2));
            case 17:
                return Boolean.valueOf(opg.a.h((SavingsProductData) obj2));
            case 18:
                i it18 = (i) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                TradingAccount tradingAccount = (TradingAccount) it18.f224257a;
                if (tradingAccount instanceof TradingAccount.Robo) {
                    return (TradingAccount.Robo) tradingAccount;
                }
                if (tradingAccount == null) {
                    r6.b.D("No account found for portfolio id");
                    return null;
                }
                e.n(new IllegalStateException("No Robo account for portfolio id but " + tradingAccount.W() + " instead"));
                return null;
            case 19:
                ejb.g earnedInterestStats = (ejb.g) obj2;
                Intrinsics.checkNotNullParameter(earnedInterestStats, "earnedInterestStats");
                od0.h hVar = i.Companion;
                ynd.k kVar = new ynd.k(mif.a.Q(e0.j(earnedInterestStats.f126847a, earnedInterestStats.d)));
                hVar.getClass();
                return od0.h.a(kVar);
            case 20:
                a0 it19 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new Pair(it19.f, it19.f17675c);
            case 21:
                a0 it20 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f17677h;
            case 22:
                a0 it21 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f17675c;
            case 23:
                a0 it22 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return new vf0.h(it22.d, it22.f, it22.f17677h, Boolean.valueOf(it22.z));
            case 24:
                a0 it23 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return new r(it23.f17679l, it23.f17680m, it23.f17681n);
            case 25:
                a0 it24 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return new vf0.k(it24.f17676g, it24.e, it24.B, it24.f17677h, it24.f17682p);
            case 26:
                a0 it25 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return new q0(it25.i, it25.f17683q, it25.f17679l, it25.f17680m, it25.f17681n, it25.o);
            case 27:
                a0 it26 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return it26.A;
            case 28:
                a0 it27 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return new Pair(it27.f17675c, it27.f);
            default:
                a0 update = (a0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a0.a(update, null, null, null, null, null, null, kn5.c.f186000a, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, null, null, null, 1073741759);
        }
    }

    public /* synthetic */ a(bo8.e0 e0Var, int i) {
        this.f17167a = i;
    }
}
