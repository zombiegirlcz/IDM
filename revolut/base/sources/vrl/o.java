package vrl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final prl.j f291665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f291666b;

    public o(prl.j monthlyInvestmentsRepository, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(monthlyInvestmentsRepository, "monthlyInvestmentsRepository");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f291665a = monthlyInvestmentsRepository;
        this.f291666b = ratesInteractor;
    }
}
