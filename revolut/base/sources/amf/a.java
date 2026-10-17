package amf;

import ael.l0;
import klf.h0;
import klf.m1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f6365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f6366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elf.e f6367c;
    public final o7.b d;

    public a(h0 commonDataSource, m1 juniorDataSource, elf.e analyticsClickHandler, o7.b adjustForAnalyticsMenuAvailabilityChecker) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(analyticsClickHandler, "analyticsClickHandler");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuAvailabilityChecker, "adjustForAnalyticsMenuAvailabilityChecker");
        this.f6365a = commonDataSource;
        this.f6366b = juniorDataSource;
        this.f6367c = analyticsClickHandler;
        this.d = adjustForAnalyticsMenuAvailabilityChecker;
    }

    public final cmf.k a() {
        return new cmf.k(new t38.e(this.f6365a.d(), 24, this.f6366b.a(), new l0(3, this, a.class, "buildMenuItems", "buildMenuItems(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 1)), u.c(this.f6367c), "AdjustForAnalytics");
    }
}
