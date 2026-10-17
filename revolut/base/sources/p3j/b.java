package p3j;

import b4j.c;
import b4j.e;
import b4j.g;
import b4j.i;
import b4j.k;
import b4j.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4j.b f232757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f232758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f232759c;
    public final k d;
    public final m e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f232760g;

    public b(b4j.b defaultStateGenerator, e creditCardBeneStateProvider, i lockedCountryCurrencyStateProvider, k mobileWalletStateProvider, m paymentVendorStateProvider, c beneToStateProvider, g extraDataProvider) {
        Intrinsics.checkNotNullParameter(defaultStateGenerator, "defaultStateGenerator");
        Intrinsics.checkNotNullParameter(creditCardBeneStateProvider, "creditCardBeneStateProvider");
        Intrinsics.checkNotNullParameter(lockedCountryCurrencyStateProvider, "lockedCountryCurrencyStateProvider");
        Intrinsics.checkNotNullParameter(mobileWalletStateProvider, "mobileWalletStateProvider");
        Intrinsics.checkNotNullParameter(paymentVendorStateProvider, "paymentVendorStateProvider");
        Intrinsics.checkNotNullParameter(beneToStateProvider, "beneToStateProvider");
        Intrinsics.checkNotNullParameter(extraDataProvider, "extraDataProvider");
        this.f232757a = defaultStateGenerator;
        this.f232758b = creditCardBeneStateProvider;
        this.f232759c = lockedCountryCurrencyStateProvider;
        this.d = mobileWalletStateProvider;
        this.e = paymentVendorStateProvider;
        this.f = beneToStateProvider;
        this.f232760g = extraDataProvider;
    }
}
