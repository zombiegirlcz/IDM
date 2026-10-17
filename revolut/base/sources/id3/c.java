package id3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bd3.a f160416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final od3.a f160417m;

    public c(bd3.a cashbackInteractor, od3.a statusViewConfigurationFactory) {
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(statusViewConfigurationFactory, "statusViewConfigurationFactory");
        this.f160416l = cashbackInteractor;
        this.f160417m = statusViewConfigurationFactory;
    }

    @Override // id3.a
    public final void Z2(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        T2(new i44.a(this, currencyCode, null, 16), new yi5.b(27));
    }
}
