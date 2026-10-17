package oq1;

import com.revolut.feature.apm.bills.pagopa.impl.data.network.PagoPAService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagoPAService f227699a;

    public b(PagoPAService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f227699a = service;
    }
}
