package md5;

import kotlin.jvm.internal.Intrinsics;
import ld5.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements hd5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh5.a f204480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f204481b;

    public a(xh5.a cryptoFeatureEnabledInteractor, b cryptoCardsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(cryptoCardsAvailabilityInteractor, "cryptoCardsAvailabilityInteractor");
        this.f204480a = cryptoFeatureEnabledInteractor;
        this.f204481b = cryptoCardsAvailabilityInteractor;
    }
}
