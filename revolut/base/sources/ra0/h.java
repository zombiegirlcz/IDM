package ra0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p90.a f252772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f252773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f252774c;

    public h(p90.a repository, a mapper, b sessionRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.f252772a = repository;
        this.f252773b = mapper;
        this.f252774c = sessionRepository;
    }

    @Override // ra0.b
    public final BackendFlow a(UUID sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return this.f252774c.a(sessionId);
    }

    @Override // ra0.b
    public final void b(UUID sessionId, BackendFlow flow) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f252774c.b(sessionId, flow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r10, java.util.Map r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra0.h.c(java.lang.String, java.util.Map, gim.c):java.lang.Object");
    }
}
