package l7h;

import com.revolut.feature.wealth.impl.data.network.recurring_orders.PortfolioRecurringOrdersService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioRecurringOrdersService f192659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f192660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7h.a f192661c;

    public o(PortfolioRecurringOrdersService portfolioRecurringOrdersService, ne0.j memoryCache, i7h.a portfolioRecurringOrderDao) {
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersService, "portfolioRecurringOrdersService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(portfolioRecurringOrderDao, "portfolioRecurringOrderDao");
        this.f192659a = portfolioRecurringOrdersService;
        this.f192660b = memoryCache;
        this.f192661c = portfolioRecurringOrderDao;
    }
}
