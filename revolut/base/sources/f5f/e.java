package f5f;

import ael.y;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.retail.trading.core.domain.PocketInfo;
import efl.f;
import efl.g;
import efl.h;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t1h.j;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.d f132311a;

    public e(ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f132311a = portfolioInteractor;
    }

    @Override // t1h.j
    public final Object a(TransferSubjectId transferSubjectId, dj0.d dVar, PocketInfo pocketInfo, UUID uuid, h hVar, vah.d dVar2) throws Throwable {
        if (!(transferSubjectId instanceof TransferSubjectId.CashHolding)) {
            throw new IllegalArgumentException("To withdraw from stocks account the transferSubjectId needs to contain a cash holding");
        }
        boolean z = pocketInfo instanceof PocketInfo.InvestPocket;
        ybl.d dVar3 = this.f132311a;
        if (z) {
            TransferSubjectId.CashHolding cashHolding = (TransferSubjectId.CashHolding) transferSubjectId;
            PocketInfo.InvestPocket investPocket = (PocketInfo.InvestPocket) pocketInfo;
            Object objK = ((y) dVar3).k(new f(cashHolding.f95654a, cashHolding.f95655b), new g(dVar, investPocket.e, investPocket.f104464a), uuid, dVar2);
            return objK == fim.a.COROUTINE_SUSPENDED ? objK : Unit.f186387a;
        }
        TransferSubjectId.CashHolding cashHolding2 = (TransferSubjectId.CashHolding) transferSubjectId;
        String str = cashHolding2.f95654a;
        String str2 = cashHolding2.f95655b;
        String f104477a = pocketInfo != null ? pocketInfo.getF104477a() : null;
        ybl.c cVar = ybl.d.Companion;
        Object objA = nim.a.a(ue0.e.r(((y) dVar3).l(str2, str, f104477a, dVar, uuid, efl.j.SELL), h0.f322473a), dVar2);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
