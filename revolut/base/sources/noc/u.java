package noc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmc.h f217997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final emc.e f217998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tul.b f217999c;

    public u(emc.e templatesInteractor, qmc.h roboPortfolioInfoProvider, tul.b portfolioMetricsInteractor) {
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(portfolioMetricsInteractor, "portfolioMetricsInteractor");
        this.f217997a = roboPortfolioInfoProvider;
        this.f217998b = templatesInteractor;
        this.f217999c = portfolioMetricsInteractor;
    }
}
