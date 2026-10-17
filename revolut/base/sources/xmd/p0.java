package xmd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 {

    @NotNull
    private static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eqj.f f307188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jzi.a f307189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wmd.c f307190c;
    public final wmd.f d;
    public final uc.d e;
    public final l80.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kzi.a f307191g;

    public p0(eqj.f analyticsCycleInteractor, jzi.a budgetInteractor, wmd.c budgetAccountContextProvider, wmd.f spentProvider, uc.d upcomingPaymentsProvider, l80.e dateProvider, kzi.a periodIntervalMapper) {
        Intrinsics.checkNotNullParameter(analyticsCycleInteractor, "analyticsCycleInteractor");
        Intrinsics.checkNotNullParameter(budgetInteractor, "budgetInteractor");
        Intrinsics.checkNotNullParameter(budgetAccountContextProvider, "budgetAccountContextProvider");
        Intrinsics.checkNotNullParameter(spentProvider, "spentProvider");
        Intrinsics.checkNotNullParameter(upcomingPaymentsProvider, "upcomingPaymentsProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(periodIntervalMapper, "periodIntervalMapper");
        this.f307188a = analyticsCycleInteractor;
        this.f307189b = budgetInteractor;
        this.f307190c = budgetAccountContextProvider;
        this.d = spentProvider;
        this.e = upcomingPaymentsProvider;
        this.f = dateProvider;
        this.f307191g = periodIntervalMapper;
    }

    public static long a(long j2, xi0.b bVar) {
        long jK = cp5.d.k(bVar);
        long j3 = j2 % jK;
        return j3 == 0 ? j2 : (j2 + jK) - j3;
    }
}
