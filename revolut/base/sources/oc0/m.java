package oc0;

import com.revolut.core.backend_flow.repository.service.BackendFlowTicketsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f224043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f224044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gc0.g f224045c;
    public final BackendFlowTicketsService d;
    public final x4l.c e;

    public m(ne0.j memoryCache, ue0.c storage, gc0.g mapper, BackendFlowTicketsService service) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f224043a = memoryCache;
        this.f224044b = storage;
        this.f224045c = mapper;
        this.d = service;
        int i = 8;
        Continuation continuation = null;
        this.e = new x4l.c(new o29.l(this, continuation, i), new o9h.b(this, i), new oa4.c(this, 9), new o95.c(this, continuation, 8), new l1(this, continuation, 17));
    }

    public static akg.n a(m mVar, String ticketId) {
        mVar.getClass();
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        w4l.i strategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return nim.a.v(mVar.e.b(ticketId, strategy), new nzj.n(1, mVar.f224045c, gc0.g.class, "toDomain", "toDomain(Lcom/revolut/core/backend_flow/data/network/dto/BackendFlowWidgetProgressionDto;)Lcom/revolut/feature/backend_flow/domain/models/BackendFlowWidgetProgression;", 0, 24));
    }

    public static String b(String str) {
        return j6.a.q("TICKETS_REPOSITORY_KEY_", str);
    }
}
