package pnh;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.background.VideoBackgroundView;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.ChallengeEditFrequencyDatePickerScreen;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.shared.savings.api.error.SavingsServerErrorContract$DepositLimitsReachedException;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import ip0.pb0;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237765a;

    public /* synthetic */ a0(int i) {
        this.f237765a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (this.f237765a) {
            case 0:
                return ((j) obj2).f237785c;
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new q(iii.c.c(5), o.f237794a);
            case 2:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List listK = zhm.v.k(new pb0("loadingItemId1"), new pb0("loadingItemId2"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 3:
                jv0.m it10 = (jv0.m) obj2;
                int i = VideoBackgroundView.f51501c;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10 instanceof jv0.p);
            case 4:
                jv0.m it11 = (jv0.m) obj2;
                int i2 = VideoBackgroundView.f51501c;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Unit.f186387a;
            case 5:
                jv0.m it12 = (jv0.m) obj2;
                int i3 = VideoBackgroundView.f51501c;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12 instanceof jv0.q);
            case 6:
                jv0.m it13 = (jv0.m) obj2;
                int i5 = VideoBackgroundView.f51501c;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Unit.f186387a;
            case 7:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(!it14.isEmpty());
            case 8:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                pd5.d dVar = (pd5.d) data.getContent();
                return Boolean.valueOf(dVar != null ? dVar.f235095a : false);
            case 9:
                zm3.a it15 = (zm3.a) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new Data(new ResolvedRecipient.PeerToPeer(it15), null, false, 6, null);
            case 10:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(null, error, false, 5, null);
            case 11:
                f5j.a beneficiary = (f5j.a) obj2;
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                return new ResolvedRecipient.Beneficiary(beneficiary);
            case 12:
                CardOwner cardOwner = (CardOwner) obj2;
                Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
                return new ResolvedRecipient.Card(cardOwner);
            case 13:
                k71.q it16 = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return zi0.c.P(it16, false, null, 3);
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                k71.q qVar = (k71.q) pair.f186386b;
                a3 a3Var = (a3) zhm.d0.d0(list);
                if (a3Var != null) {
                    return new po9.v(a3Var, qVar);
                }
                return null;
            case 15:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return zhm.f0.f322471a;
            case 16:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new poe.i((List) getDefaultLoadingItems.invoke(), false);
            case 17:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "action");
                throw null;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.additional_cards_details_sections_cardholders_title, null, null, 14);
                aim.e eVarB = zhm.u.b();
                pb0 pb0Var = new pb0("id_additional_cards_loading_0");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0Var);
                return new pp4.o(textLocalisedClause, zhm.u.a(eVarB), pp4.q.a());
            case 19:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                List listC = zhm.u.c(new ip0.c0("RATE_LOADING_ID", new u.a(3, true), 0, 0, 60));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return new pp6.c(listC, new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 20:
                ListSubheaderDelegate.Model it19 = (ListSubheaderDelegate.Model) obj2;
                int i6 = ChallengeEditFrequencyDatePickerScreen.W;
                Intrinsics.checkNotNullParameter(it19, "it");
                return pp8.f.f238297a;
            case 21:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                Iterator it20 = tradingAccounts.f105278a.iterator();
                while (true) {
                    if (it20.hasNext()) {
                        Object next = it20.next();
                        if (((TradingAccount) next) instanceof TradingAccount.Robo.Regular) {
                            obj3 = next;
                        }
                    }
                }
                if (obj3 != null) {
                    return (TradingAccount) obj3;
                }
                throw new IllegalStateException("ROBO trading account not created");
            case 22:
                TradingAccount roboTradingAccount = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(roboTradingAccount, "roboTradingAccount");
                Iterator it21 = roboTradingAccount.c0().iterator();
                while (true) {
                    if (it21.hasNext()) {
                        Object next2 = it21.next();
                        if (com.revolut.shared.feature.wealth.models.trading_accounts.e.a((TradingProduct) next2)) {
                            obj3 = next2;
                        }
                    }
                }
                if (obj3 != null) {
                    return (TradingProduct) obj3;
                }
                throw new IllegalStateException("ROBO trading product not available in Robo Regular account");
            case 23:
                uj3.a it22 = (uj3.a) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(uj3.b.q(it22));
            case 24:
                yh5.a it23 = (yh5.a) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return Boolean.valueOf(yh5.b.x(it23));
            case 25:
                Object[] booleans = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(booleans, "booleans");
                int length = booleans.length;
                int i21 = 0;
                while (true) {
                    if (i21 < length) {
                        Object obj4 = booleans[i21];
                        Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        if (((Boolean) obj4).booleanValue()) {
                            i21++;
                        } else {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                Function0 it24 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                pq7.l.Companion.getClass();
                List listK2 = zhm.v.k(new pb0(pq7.g.a(0)), new pb0(pq7.g.a(1)), new pb0(pq7.g.a(2)), new pb0(pq7.g.a(3)));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return listK2;
            case 27:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 28:
                od0.i optionalProduct = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalProduct, "optionalProduct");
                SavingsProductData savingsProductData = (SavingsProductData) optionalProduct.g();
                return (savingsProductData == null || ocd.a.e(savingsProductData)) ? zbb.c.f320866b : zbb.b.f320865b;
            default:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                IllegalStateException illegalStateException = new IllegalStateException() { // from class: com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$FailToAddMoneyException

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f83147a = "Could not add money";

                    public final boolean equals(Object obj5) {
                        if (this == obj5) {
                            return true;
                        }
                        return (obj5 instanceof SavingsErrorHandlingApi$FailToAddMoneyException) && Intrinsics.f(this.f83147a, ((SavingsErrorHandlingApi$FailToAddMoneyException) obj5).f83147a);
                    }

                    @Override // java.lang.Throwable
                    public final String getMessage() {
                        return this.f83147a;
                    }

                    public final int hashCode() {
                        String str = this.f83147a;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }
                };
                if (!(throwable instanceof SavingsServerErrorContract$DepositLimitsReachedException) && !(throwable instanceof ServerErrorException)) {
                    throwable = illegalStateException;
                }
                pfm.n nVarN = efm.b.n(throwable);
                Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
                return nVarN;
        }
    }

    public /* synthetic */ a0(Object obj2, int i) {
        this.f237765a = i;
    }
}
