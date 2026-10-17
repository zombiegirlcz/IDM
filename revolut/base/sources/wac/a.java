package wac;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qac.b f295859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final toa.a f295860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f295861c;

    public a(qac.b flightBookingRepository, toa.a notificationSettingsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(flightBookingRepository, "flightBookingRepository");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f295859a = flightBookingRepository;
        this.f295860b = notificationSettingsInteractor;
        this.f295861c = featureToggleInteractor;
    }
}
