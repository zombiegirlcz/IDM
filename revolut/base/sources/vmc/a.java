package vmc;

import kotlin.jvm.internal.Intrinsics;
import nmc.k;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements glc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmc.h f290554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1j.b f290555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f290556c;

    public a(qmc.h roboPortfolioInfoProvider, t1j.b portfolioRecurringOrdersInteractor, k roboTransactionMapper, yoc.e retailTransactionMapper) {
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersInteractor, "portfolioRecurringOrdersInteractor");
        Intrinsics.checkNotNullParameter(roboTransactionMapper, "roboTransactionMapper");
        Intrinsics.checkNotNullParameter(retailTransactionMapper, "retailTransactionMapper");
        this.f290554a = roboPortfolioInfoProvider;
        this.f290555b = portfolioRecurringOrdersInteractor;
        this.f290556c = roboTransactionMapper;
    }
}
