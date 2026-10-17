package bf2;

import com.revolut.feature.apm.upi.impl.data.network.UpiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiService f14897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rj0.a f14898b;

    public c(UpiService service, rj0.a networkFeatureTogglesProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkFeatureTogglesProvider, "networkFeatureTogglesProvider");
        this.f14897a = service;
        this.f14898b = networkFeatureTogglesProvider;
    }
}
