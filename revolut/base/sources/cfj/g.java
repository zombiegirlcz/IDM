package cfj;

import dfj.k0;
import dfj.s3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s3 f23723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f23724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f23725c;
    public final cej.b d;
    public final dm0.d e;
    public final kdh.b f;

    public g(s3 esimSubscriptionsInteractor, k0 esimInstallationStateInteractor, d esimSubscriptionsItemsBuilder, cej.b mobilePlansFeatureAvailabilityInteractor, dm0.d deviceIdProvider, kdh.b deviceManagementInteractor) {
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsItemsBuilder, "esimSubscriptionsItemsBuilder");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        this.f23723a = esimSubscriptionsInteractor;
        this.f23724b = esimInstallationStateInteractor;
        this.f23725c = esimSubscriptionsItemsBuilder;
        this.d = mobilePlansFeatureAvailabilityInteractor;
        this.e = deviceIdProvider;
        this.f = deviceManagementInteractor;
    }
}
