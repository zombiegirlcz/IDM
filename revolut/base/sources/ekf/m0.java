package ekf;

import klf.m1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f127104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f127105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y21.c f127106c;
    public final zv9.a d;

    public m0(klf.h0 commonDataSource, m1 juniorDataSource, y21.c optOutRepository, zv9.a paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f127104a = commonDataSource;
        this.f127105b = juniorDataSource;
        this.f127106c = optOutRepository;
        this.d = paymentsProductFeatureChecker;
    }
}
