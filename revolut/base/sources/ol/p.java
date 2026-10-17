package ol;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sl.f f226279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f226280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f226281c;
    public final OnfidoAnalytics d;

    public p(sl.f submitTaskCompletionUseCase, String customerUserHash, f biometricTokenRepository, OnfidoAnalytics analytics) {
        Intrinsics.checkNotNullParameter(submitTaskCompletionUseCase, "submitTaskCompletionUseCase");
        Intrinsics.checkNotNullParameter(customerUserHash, "customerUserHash");
        Intrinsics.checkNotNullParameter(biometricTokenRepository, "biometricTokenRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f226279a = submitTaskCompletionUseCase;
        this.f226280b = customerUserHash;
        this.f226281c = biometricTokenRepository;
        this.d = analytics;
    }
}
