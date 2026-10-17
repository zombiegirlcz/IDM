package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f116700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c1 f116701x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(c1 c1Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f116701x = c1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u0 u0Var = new u0(this.f116701x, continuation, 0);
                u0Var.f116700w = str;
                return u0Var.invokeSuspend(Unit.f186387a);
            case 1:
                u0 u0Var2 = new u0(this.f116701x, continuation, 1);
                u0Var2.f116700w = str;
                return u0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                u0 u0Var3 = new u0(this.f116701x, continuation, 2);
                u0Var3.f116700w = str;
                return u0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                u0 u0Var4 = new u0(this.f116701x, continuation, 3);
                u0Var4.f116700w = str;
                return u0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                u0 u0Var5 = new u0(this.f116701x, continuation, 4);
                u0Var5.f116700w = str;
                return u0Var5.invokeSuspend(Unit.f186387a);
            default:
                u0 u0Var6 = new u0(this.f116701x, continuation, 5);
                u0Var6.f116700w = str;
                return u0Var6.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objActiveCashback;
        Object creditAgreementsList;
        Object objCashbackPockets;
        Object forbearanceAgreements;
        Object creditManagementInfo;
        yw4.q qVar;
        ll4.a aVar;
        ll4.b bVar;
        Object rates;
        int i = this.u;
        final int i2 = 0;
        ll4.u uVar = null;
        final c1 c1Var = this.f116701x;
        final int i3 = 1;
        switch (i) {
            case 0:
                String str = this.f116700w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService = c1Var.f116610a;
                    this.f116700w = null;
                    this.v = 1;
                    objActiveCashback = creditCardService.activeCashback(str, this);
                    if (objActiveCashback == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objActiveCashback = obj2;
                }
                return jn4.a.a((in4.a) objActiveCashback);
            case 1:
                final String str2 = this.f116700w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService2 = c1Var.f116610a;
                    this.f116700w = str2;
                    this.v = 1;
                    creditAgreementsList = creditCardService2.getCreditAgreementsList(str2, this);
                    if (creditAgreementsList == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    creditAgreementsList = obj2;
                }
                return tx4.a.a((rx4.b) creditAgreementsList, new Function2() { // from class: dp4.w0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        String fileType;
                        StringBuilder sbT;
                        String str3;
                        rx4.a aVar4 = (rx4.a) obj3;
                        switch (i2) {
                            case 0:
                                String baseUrl = c1Var.d.getBaseUrl();
                                String id10 = aVar4.getId();
                                fileType = aVar4.getFileType();
                                sbT = p.a.t(baseUrl, "/credit-application/credit-facility-v2/", str2, "/agreement/", id10);
                                str3 = "/";
                                break;
                            default:
                                String baseUrl2 = c1Var.d.getBaseUrl();
                                String id11 = aVar4.getId();
                                fileType = aVar4.getFileType();
                                sbT = p.a.t(baseUrl2, "/credit-application/forbearance-loan-facility/", str2, "/agreement/", id11);
                                str3 = "/";
                                break;
                        }
                        return v0.a.i(sbT, str3, fileType);
                    }
                });
            case 2:
                String str3 = this.f116700w;
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService3 = c1Var.f116610a;
                    this.f116700w = null;
                    this.v = 1;
                    objCashbackPockets = creditCardService3.cashbackPockets(str3, this);
                    if (objCashbackPockets != arrayList) {
                    }
                    return arrayList;
                }
                if (i21 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objCashbackPockets = obj2;
                Iterable<in4.b> iterable = (Iterable) objCashbackPockets;
                arrayList = new ArrayList(zhm.w.t(iterable, 10));
                for (in4.b bVar2 : iterable) {
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    arrayList.add(new il4.h(bVar2.getCashbackPocketId()));
                }
                return arrayList;
            case 3:
                final String str4 = this.f116700w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService4 = c1Var.f116610a;
                    this.f116700w = str4;
                    this.v = 1;
                    forbearanceAgreements = creditCardService4.getForbearanceAgreements(str4, this);
                    if (forbearanceAgreements == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    forbearanceAgreements = obj2;
                }
                return tx4.a.a((rx4.b) forbearanceAgreements, new Function2() { // from class: dp4.w0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        String fileType;
                        StringBuilder sbT;
                        String str32;
                        rx4.a aVar42 = (rx4.a) obj3;
                        switch (i3) {
                            case 0:
                                String baseUrl = c1Var.d.getBaseUrl();
                                String id10 = aVar42.getId();
                                fileType = aVar42.getFileType();
                                sbT = p.a.t(baseUrl, "/credit-application/credit-facility-v2/", str4, "/agreement/", id10);
                                str32 = "/";
                                break;
                            default:
                                String baseUrl2 = c1Var.d.getBaseUrl();
                                String id11 = aVar42.getId();
                                fileType = aVar42.getFileType();
                                sbT = p.a.t(baseUrl2, "/credit-application/forbearance-loan-facility/", str4, "/agreement/", id11);
                                str32 = "/";
                                break;
                        }
                        return v0.a.i(sbT, str32, fileType);
                    }
                });
            case 4:
                String str5 = this.f116700w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService5 = c1Var.f116610a;
                    this.f116700w = null;
                    this.v = 1;
                    creditManagementInfo = creditCardService5.getCreditManagementInfo(str5, this);
                    if (creditManagementInfo == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    creditManagementInfo = obj2;
                }
                rn4.c cVar = (rn4.c) creditManagementInfo;
                Object obj3 = pn4.a.f237663a;
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                xi0.a aVar6 = xi0.b.Companion;
                String currency = cVar.getCurrency();
                aVar6.getClass();
                xi0.b currency2 = xi0.a.a(currency);
                String facilityId = cVar.getFacilityId();
                String state = cVar.getState();
                yw4.q[] qVarArrValues = yw4.q.values();
                int length = qVarArrValues.length;
                while (true) {
                    if (i2 < length) {
                        yw4.q qVar2 = qVarArrValues[i2];
                        if (kotlin.text.a0.z(qVar2.name(), state, true)) {
                            qVar = qVar2;
                        } else {
                            i2++;
                        }
                    } else {
                        qVar = null;
                    }
                }
                if (qVar != null) {
                    String pocketId = cVar.getPocketId();
                    String walletId = cVar.getWalletId();
                    String cardId = cVar.getCardId();
                    long currentDate = cVar.getCurrentDate();
                    long statementDate = cVar.getStatementDate();
                    long remainingBalance = cVar.getRemainingBalance();
                    Long previousStatementDate = cVar.getPreviousStatementDate();
                    long minimumRepayment = cVar.getMinimumRepayment();
                    long repaymentDueDate = cVar.getRepaymentDueDate();
                    double purchasesInterestRate = cVar.getPurchasesInterestRate();
                    long statementBalance = cVar.getStatementBalance();
                    Long paymentOverdueAmount = cVar.getPaymentOverdueAmount();
                    Long paymentOverdueDate = cVar.getPaymentOverdueDate();
                    Double apr = cVar.getApr();
                    rn4.d promotionalPeriod = cVar.getPromotionalPeriod();
                    ll4.a0 a0Var = promotionalPeriod != null ? new ll4.a0(promotionalPeriod.getInterestRate(), promotionalPeriod.getStartDate(), promotionalPeriod.getEndDate(), promotionalPeriod.getTermsUrl()) : null;
                    rn4.a administrationFeeInfo = cVar.getAdministrationFeeInfo();
                    if (administrationFeeInfo != null) {
                        Intrinsics.checkNotNullParameter(administrationFeeInfo, "<this>");
                        aVar = new ll4.a(administrationFeeInfo.getAdministrationFeeMinorAmount(), administrationFeeInfo.getPurchaseCountThreshold(), administrationFeeInfo.getPurchaseMinorAmountThreshold());
                    } else {
                        aVar = null;
                    }
                    long firstDate = cVar.getFirstDate();
                    rn4.b cashbackBalance = cVar.getCashbackBalance();
                    if (cashbackBalance != null) {
                        Intrinsics.checkNotNullParameter(cashbackBalance, "<this>");
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        bVar = new ll4.b(cashbackBalance.getCurrentRate(), new dj0.d(cashbackBalance.getEarnedBalance(), currency2), new dj0.d(cashbackBalance.getCollectionDueAmount(), currency2), cashbackBalance.getCollectionDate());
                    } else {
                        bVar = null;
                    }
                    uVar = new ll4.u(facilityId, qVar, pocketId, walletId, cardId, currentDate, statementDate, remainingBalance, previousStatementDate, minimumRepayment, repaymentDueDate, purchasesInterestRate, currency2, statementBalance, paymentOverdueAmount, paymentOverdueDate, apr, a0Var, aVar, firstDate, bVar, new dj0.d(cVar.getOngoingStatementBalance(), currency2), pd.b.j(cVar.getHideMinimumRepayment()));
                }
                if (uVar != null) {
                    return uVar;
                }
                throw new IllegalArgumentException("Required value was null.");
            default:
                String str6 = this.f116700w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService6 = c1Var.f116610a;
                    this.f116700w = null;
                    this.v = 1;
                    rates = creditCardService6.getRates(str6, this);
                    if (rates == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    rates = obj2;
                }
                return pn4.a.a((on4.c) rates);
        }
    }
}
