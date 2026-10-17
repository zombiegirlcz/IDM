package iz1;

import com.revolut.feature.apm.core.impl.data.network.transfer.ApmTransferService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferService f169840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj0.b f169841b;

    public n(ApmTransferService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f169840a = service;
        this.f169841b = new wj0.b("payments_apm_transfer");
    }
}
