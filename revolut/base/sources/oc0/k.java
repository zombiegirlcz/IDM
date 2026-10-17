package oc0;

import com.revolut.core.backend_flow.repository.service.BackendFlowEntitiesSummaryService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f224040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendFlowEntitiesSummaryService f224041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f224042c;
    public final x4l.c d;

    public k(ne0.j memoryCache, BackendFlowEntitiesSummaryService service, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f224040a = memoryCache;
        this.f224041b = service;
        this.f224042c = storage;
        int i = 7;
        Continuation continuation = null;
        this.d = new x4l.c(new o29.l(this, continuation, i), new o9h.b(this, i), new oa4.c(this, 8), new o95.c(this, continuation, 7), new l1(this, continuation, 16));
    }

    public static vkm.d a(k kVar, j params) {
        kVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return kVar.d.b(params, loadingStrategy);
    }
}
