package xr3;

import com.revolut.feature.credit.application.impl.network.CreditExternalClientMonitoringService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    @NotNull
    private static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditExternalClientMonitoringService f308229a;

    public n(CreditExternalClientMonitoringService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f308229a = service;
    }
}
