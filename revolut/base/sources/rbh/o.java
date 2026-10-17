package rbh;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f253087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f253088c;

    public /* synthetic */ o(String str, r rVar, int i) {
        this.f253086a = i;
        this.f253087b = str;
        this.f253088c = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        Object next;
        String str2;
        Object next2;
        String str3;
        Object next3;
        String str4;
        Object next4;
        switch (this.f253086a) {
            case 0:
                od0.i optionalJointAccount = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalJointAccount, "optionalJointAccount");
                AccountId.Joint jointC = l38.a.c((n38.a) optionalJointAccount.c());
                r rVar = this.f253088c;
                return nim.a.v(rd0.e.b(osg.b.s(rVar.f253093b, this.f253087b, jointC, 4)), new r4k.x(rVar, jointC, 16));
            case 1:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                List list = (List) rVar2.f314201a;
                CreditCardPaymentDetails creditCardPaymentDetails = (CreditCardPaymentDetails) rVar2.f314202b;
                Pair pair = (Pair) rVar2.f314203c;
                Iterator it8 = list.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    str = this.f253087b;
                    if (zHasNext) {
                        next = it8.next();
                        if (Intrinsics.f(((CreditCard) next).f69793b, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                CreditCard creditCard = (CreditCard) next;
                if (creditCard == null) {
                    throw new NoSuchElementException(j6.a.q("No credit card found by id ", str));
                }
                String str5 = ((fo3.c) pair.f186385a).f136805h;
                r rVar3 = this.f253088c;
                return nim.a.v(rVar3.d(str5), new qz9.o(creditCard, 13, creditCardPaymentDetails, rVar3));
            case 2:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Pair pair3 = (Pair) pair2.f186385a;
                Iterator it9 = ((List) pair2.f186386b).iterator();
                while (true) {
                    boolean zHasNext2 = it9.hasNext();
                    str2 = this.f253087b;
                    if (zHasNext2) {
                        next2 = it9.next();
                        if (Intrinsics.f(((io3.d) next2).f163145a, str2)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                io3.d dVar = (io3.d) next2;
                if (dVar == null) {
                    throw new NoSuchElementException(j6.a.q("No pro account found by id ", str2));
                }
                return nim.a.v(this.f253088c.d(((fo3.c) pair3.f186385a).f136805h), new afa.s(dVar, 18));
            case 3:
                List vaults = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults, "vaults");
                Iterator it10 = vaults.iterator();
                while (true) {
                    boolean zHasNext3 = it10.hasNext();
                    str3 = this.f253087b;
                    if (zHasNext3) {
                        next3 = it10.next();
                        if (Intrinsics.f(((pcd.s) next3).f(), str3)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                pcd.s sVar = (pcd.s) next3;
                if (sVar == null) {
                    throw new NoSuchElementException(p.a.p("No vault found by id ", str3, " in Add Money"));
                }
                return nim.a.v(this.f253088c.d(sVar.f), new r4k.x(sVar, str3, 17));
            case 4:
                ejb.b savingAccountsInfo = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(savingAccountsInfo, "savingAccountsInfo");
                Iterator it11 = savingAccountsInfo.f126837b.iterator();
                while (true) {
                    boolean zHasNext4 = it11.hasNext();
                    str4 = this.f253087b;
                    if (zHasNext4) {
                        next4 = it11.next();
                        if (Intrinsics.f(((SavingsAccountDetails) next4).f86460a.f(), str4)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) next4;
                if (savingsAccountDetails == null) {
                    throw new NoSuchElementException(p.a.p("No saving account found by id ", str4, " in Add Money"));
                }
                return nim.a.v(this.f253088c.d(savingsAccountDetails.f86460a.f), new r4k.x(savingsAccountDetails, str4, 18));
            default:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair4.f186385a;
                Pair pair5 = (Pair) ((od0.i) pair4.f186386b).f224257a;
                if (pair5 == null) {
                    throw new NoSuchElementException(j6.a.q("No cash holding and trading account found by id ", this.f253087b));
                }
                kel.b bVar = (kel.b) pair5.f186385a;
                TradingAccount tradingAccount = (TradingAccount) pair5.f186386b;
                String f105264c = tradingAccount.getF105264c();
                r rVar4 = this.f253088c;
                return nim.a.v(rVar4.d(f105264c), new q2k.b(bVar, tradingAccount, rVar4, tradingLegalEntityInformation, 14));
        }
    }

    public /* synthetic */ o(r rVar, String str) {
        this.f253086a = 0;
        this.f253088c = rVar;
        this.f253087b = str;
    }
}
