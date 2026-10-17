package t7i;

import ael.y;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.d f268726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj0.a f268727b;

    public i(ybl.d portfolioInteractor, wj0.a idempotencyKeyHolder, n7i.p pocketIdProvider) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(pocketIdProvider, "pocketIdProvider");
        this.f268726a = portfolioInteractor;
        this.f268727b = idempotencyKeyHolder;
    }

    public static AccountSource.InvestCashHolding a(j8l.h hVar) {
        if (hVar instanceof AccountWrapper) {
            AccountSource accountSource = ((AccountWrapper) hVar).d;
            if (!(accountSource instanceof AccountSource.InvestCashHolding)) {
                accountSource = null;
            }
            return (AccountSource.InvestCashHolding) accountSource;
        }
        throw new IllegalArgumentException(("Unexpected MoveMoney account: " + a6i.a.e(hVar) + ". Retail supports " + AccountWrapper.class + ". Check app dependency configuration.").toString());
    }

    public static Map e(AccountSource.InvestCashHolding investCashHolding, boolean z) {
        String str;
        String str2;
        if (investCashHolding == null) {
            return r0.g();
        }
        kel.b bVar = investCashHolding.f97199b;
        if (z) {
            str = bVar.f183148a.f183146b;
            str2 = "destination_portfolio_id";
        } else {
            str = bVar.f183148a.f183146b;
            str2 = "source_portfolio_id";
        }
        return a0.d.x(str2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (nim.a.a(r1, r2) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
    
        if (d(r4, r1, r11, r2) == r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r22, j8l.h r24, j8l.h r25, j8l.d r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7i.i.b(long, j8l.h, j8l.h, j8l.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (d(r10, r2, r14, r0) == r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017a, code lost:
    
        if (r10 == r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017c, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r10, j8l.h r12, j8l.h r13, j8l.d r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7i.i.c(long, j8l.h, j8l.h, j8l.d, gim.c):java.lang.Object");
    }

    public final Object d(kel.b bVar, kel.b bVar2, dj0.d dVar, gim.c cVar) throws Throwable {
        kel.a aVar = bVar.f183148a;
        efl.f fVar = new efl.f(aVar.f183146b, aVar.f183145a);
        kel.a aVar2 = bVar2.f183148a;
        efl.g gVar = new efl.g(dVar, aVar2.f183146b, aVar2.f183145a);
        UUID uuidFromString = UUID.fromString(this.f268727b.b("MOVE_MONEY_IDEMPOTENCY_TAG"));
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        Object objK = ((y) this.f268726a).k(fVar, gVar, uuidFromString, cVar);
        return objK == fim.a.COROUTINE_SUSPENDED ? objK : Unit.f186387a;
    }
}
