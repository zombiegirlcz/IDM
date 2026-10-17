package ol;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class l {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Navigator f226273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl.f f226274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f226275c;
    public final f d;
    public final OnfidoAnalytics e;

    public l(Navigator navigator, sl.f submitTaskCompletionUseCase, String customerUserHash, f biometricTokenRepository, OnfidoAnalytics analytics) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(submitTaskCompletionUseCase, "submitTaskCompletionUseCase");
        Intrinsics.checkNotNullParameter(customerUserHash, "customerUserHash");
        Intrinsics.checkNotNullParameter(biometricTokenRepository, "biometricTokenRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f226273a = navigator;
        this.f226274b = submitTaskCompletionUseCase;
        this.f226275c = customerUserHash;
        this.d = biometricTokenRepository;
        this.e = analytics;
    }
}
