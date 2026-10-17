package oc0;

import com.revolut.core.backend_flow.repository.service.BackendFlowTransactionsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlowTransactionsService f224046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc0.f f224047b;

    public n(BackendFlowTransactionsService service, gc0.f mapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f224046a = service;
        this.f224047b = mapper;
    }
}
