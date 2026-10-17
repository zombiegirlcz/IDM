package oc0;

import com.revolut.core.backend_flow.repository.service.BackendFlowEntitiesService;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gc0.a f224034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f224035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackendFlowEntitiesService f224036c;
    public final ue0.c d;
    public final x4l.c e;

    public i(gc0.a mapper, ne0.j memoryCache, BackendFlowEntitiesService service, ue0.c storage) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f224034a = mapper;
        this.f224035b = memoryCache;
        this.f224036c = service;
        this.d = storage;
        Continuation continuation = null;
        this.e = new x4l.c(new ns9.h(this, null), new o9h.b(this, 6), new oa4.c(this, 7), new o95.c(this, continuation, 6), new l1(this, continuation, 15));
    }

    public final vkm.d a(String formId, String itemId, Map queries, long j2, String str, g mode, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(formId, "formId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(queries, "queries");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.e.b(new h(formId, itemId, queries, j2, str, mode == g.PRESELECTION ? mode.name() : null), loadingStrategy);
    }
}
