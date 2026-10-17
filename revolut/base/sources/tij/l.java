package tij;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ynj.e f271556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ynj.g f271557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f271558c;
    public final t1j.b d;

    public l(ynj.e commonUiBuilder, ynj.g dataBalanceCalculator, ynj.m installationStateResolver, gte.a featureToggleInteractor, p56.a esimMobilePlanIconMapper, t1j.b bytesAllowanceFormatter) {
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        Intrinsics.checkNotNullParameter(dataBalanceCalculator, "dataBalanceCalculator");
        Intrinsics.checkNotNullParameter(installationStateResolver, "installationStateResolver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(esimMobilePlanIconMapper, "esimMobilePlanIconMapper");
        Intrinsics.checkNotNullParameter(bytesAllowanceFormatter, "bytesAllowanceFormatter");
        this.f271556a = commonUiBuilder;
        this.f271557b = dataBalanceCalculator;
        this.f271558c = featureToggleInteractor;
        this.d = bytesAllowanceFormatter;
    }
}
