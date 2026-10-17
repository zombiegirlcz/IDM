package x8h;

import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import com.revolut.feature.wealth.impl.data.network.recurring_orders.PortfolioRecurringOrdersService;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.retail.trading.core.domain.PocketInfo;
import java.time.LocalDate;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 implements tzg.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.d f303349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1j.b f303350b;

    public i0(ybl.d portfolioInteractor, t1j.b portfolioRecurringOrdersInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersInteractor, "portfolioRecurringOrdersInteractor");
        this.f303349a = portfolioInteractor;
        this.f303350b = portfolioRecurringOrdersInteractor;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    public final Object a(TransferSubjectId transferSubjectId, DepositInfo depositInfo, UUID uuid, gim.i iVar) throws Throwable {
        Object objB;
        r10.q qVar = (r10.q) this.f303350b.f267380b;
        if (depositInfo instanceof DepositInfo.OneOffDeposit) {
            DepositInfo.OneOffDeposit oneOffDeposit = (DepositInfo.OneOffDeposit) depositInfo;
            PocketInfo pocketInfo = oneOffDeposit.f95320b;
            if (!(pocketInfo instanceof PocketInfo.InvestPocket)) {
                objB = b(transferSubjectId, depositInfo, uuid, iVar);
                if (objB != fim.a.COROUTINE_SUSPENDED) {
                    objB = Unit.f186387a;
                }
            } else if (transferSubjectId instanceof TransferSubjectId.CashHolding) {
                PocketInfo.InvestPocket investPocket = (PocketInfo.InvestPocket) pocketInfo;
                TransferSubjectId.CashHolding cashHolding = (TransferSubjectId.CashHolding) transferSubjectId;
                objB = ((ael.y) this.f303349a).k(new efl.f(investPocket.e, investPocket.f104464a), new efl.g(oneOffDeposit.f95319a, cashHolding.f95654a, cashHolding.f95655b), uuid, iVar);
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (objB != aVar) {
                    objB = Unit.f186387a;
                }
                if (objB != aVar) {
                    objB = Unit.f186387a;
                }
            } else {
                if (!(transferSubjectId instanceof TransferSubjectId.Portfolio)) {
                    throw new NoWhenBranchMatchedException();
                }
                objB = b(transferSubjectId, depositInfo, uuid, iVar);
                if (objB != fim.a.COROUTINE_SUSPENDED) {
                    objB = Unit.f186387a;
                }
            }
            return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
        }
        if (!(depositInfo instanceof DepositInfo.RecurringDeposit)) {
            throw new NoWhenBranchMatchedException();
        }
        DepositInfo.RecurringDeposit recurringDeposit = (DepositInfo.RecurringDeposit) depositInfo;
        k4l.c0 period = recurringDeposit.f95323c;
        LocalDate startDate = recurringDeposit.d;
        dj0.d amount = recurringDeposit.f95321a;
        String orderId = recurringDeposit.e;
        if (orderId != null) {
            String portfolioId = transferSubjectId.getF95657a();
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(period, "period");
            PortfolioRecurringOrdersService portfolioRecurringOrdersService = (PortfolioRecurringOrdersService) qVar.f250849b;
            Object obj2 = b8h.a.f13266a;
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(period, "period");
            String str = amount.f115083b.f306286a;
            long j2 = amount.f115082a;
            String string = startDate.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            pfm.a aVarE = portfolioRecurringOrdersService.updateRecurringOrder(orderId, new c8h.c(str, j2, u1.g(period, b8h.a.f13267b), string)).e(((w4l.f) qVar.d).g(orderId, false)).e(((w4l.f) qVar.f250850c).g(portfolioId, false));
            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
            Object objA = nim.a.a(te0.w.g0(aVarE), iVar);
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
            if (objA != aVar2) {
                objA = Unit.f186387a;
            }
            return objA == aVar2 ? objA : Unit.f186387a;
        }
        String portfolioId2 = transferSubjectId.getF95657a();
        String sourcePocketId = recurringDeposit.f95322b.getF104477a();
        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        PortfolioRecurringOrdersService portfolioRecurringOrdersService2 = (PortfolioRecurringOrdersService) qVar.f250849b;
        Object obj3 = b8h.a.f13266a;
        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        String str2 = amount.f115083b.f306286a;
        long j3 = amount.f115082a;
        String string2 = startDate.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        pfm.a aVarE2 = portfolioRecurringOrdersService2.createRecurringOrder(new c8h.a(str2, portfolioId2, string2, u1.g(period, b8h.a.f13267b), j3, sourcePocketId)).e(((w4l.f) qVar.f250850c).g(portfolioId2, false));
        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
        Object objA2 = nim.a.a(te0.w.g0(aVarE2), iVar);
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        if (objA2 != aVar3) {
            objA2 = Unit.f186387a;
        }
        return objA2 == aVar3 ? objA2 : Unit.f186387a;
    }

    public final Object b(TransferSubjectId transferSubjectId, DepositInfo depositInfo, UUID uuid, gim.i iVar) {
        String f95657a = transferSubjectId.getF95657a();
        dj0.d f95321a = depositInfo.getF95321a();
        String f104477a = depositInfo.getF95322b().getF104477a();
        TransferSubjectId.CashHolding cashHolding = transferSubjectId instanceof TransferSubjectId.CashHolding ? (TransferSubjectId.CashHolding) transferSubjectId : null;
        Object objA = nim.a.a(((ael.y) this.f303349a).j(f95657a, new efl.e(f95321a, f104477a, cashHolding != null ? cashHolding.d : null), uuid), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
