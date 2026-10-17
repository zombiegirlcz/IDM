package fwj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wl0.c f138657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pre.c f138658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yme.a f138659c;
    public final p d;
    public final mli.e e;

    public b(wl0.c biometricHelper, pre.c termsInteractor, yme.a taxResidencyInteractor, p userOnboardingInteractor, mli.e userCleanerInteractor) {
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(userCleanerInteractor, "userCleanerInteractor");
        this.f138657a = biometricHelper;
        this.f138658b = termsInteractor;
        this.f138659c = taxResidencyInteractor;
        this.d = userOnboardingInteractor;
        this.e = userCleanerInteractor;
    }

    public final pfm.a a() {
        pfm.h hVar = new pfm.h(new a08.d(this, 22), 2);
        p pVar = this.d;
        pVar.getClass();
        pfm.h hVar2 = new pfm.h(new f(pVar, 3), 2);
        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
        pfm.a aVarE = hVar.e(hVar2).e((efm.b) this.e.f206964a.d.getValue());
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
