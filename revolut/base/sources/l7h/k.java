package l7h;

import com.revolut.feature.wealth.impl.data.network.recurring_orders.PortfolioRecurringOrdersService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioRecurringOrdersService f192652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f192653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7h.a f192654c;

    public k(PortfolioRecurringOrdersService portfolioRecurringOrdersService, ne0.j memoryCache, i7h.a portfolioRecurringOrderDao) {
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersService, "portfolioRecurringOrdersService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(portfolioRecurringOrderDao, "portfolioRecurringOrderDao");
        this.f192652a = portfolioRecurringOrdersService;
        this.f192653b = memoryCache;
        this.f192654c = portfolioRecurringOrderDao;
    }
}
