package com.revolut.feature.wealth.gia.margin_trading.impl.pushes;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vzg.a;
import ybl.d;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/wealth/gia/margin_trading/impl/pushes/WealthGiaMarginCallRefreshWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lvzg/a;", "wealthMarginInteractor", "Lybl/k;", "tradingAccountsInteractor", "Lybl/d;", "portfolioInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lvzg/a;Lybl/k;Lybl/d;)V", "Companion", "f9h/a", "a", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthGiaMarginCallRefreshWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f95454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f95455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95456c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WealthGiaMarginCallRefreshWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull a wealthMarginInteractor, @NotNull k tradingAccountsInteractor, @NotNull d portfolioInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(wealthMarginInteractor, "wealthMarginInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f95454a = wealthMarginInteractor;
        this.f95455b = tradingAccountsInteractor;
        this.f95456c = portfolioInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (((ael.y) r7.f95456c).g(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof l6h.c
            if (r0 == 0) goto L13
            r0 = r8
            l6h.c r0 = (l6h.c) r0
            int r1 = r0.f192409w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192409w = r1
            goto L18
        L13:
            l6h.c r0 = new l6h.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192409w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L77
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            yhm.o.b(r8)
            goto L51
        L36:
            yhm.o.b(r8)
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r8 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            r2 = 6
            ybl.k r5 = r7.f95455b
            r6 = 0
            akg.n r8 = ybl.k.h(r5, r8, r6, r2)
            r2 = 3
            jhi.b r8 = mo3.a.g(r8, r6, r6, r2)
            r0.f192409w = r4
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L51
            goto L76
        L51:
            od0.i r8 = (od0.i) r8
            java.lang.Object r8 = r8.f224257a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r8 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r8
            if (r8 == 0) goto L7a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r8 = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(r8)
            java.util.UUID r8 = r8.f105210a
            if (r8 == 0) goto L7a
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.f192409w = r3
            ybl.d r2 = r7.f95456c
            ael.y r2 = (ael.y) r2
            java.lang.Object r8 = r2.g(r8, r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L7a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.gia.margin_trading.impl.pushes.WealthGiaMarginCallRefreshWorker.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        if (r4.a(r0) != r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.gia.margin_trading.impl.pushes.WealthGiaMarginCallRefreshWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
