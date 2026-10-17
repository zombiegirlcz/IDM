package wz1;

import com.revolut.feature.apm.core.impl.topup_requests.network.ApmTopupRequestsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uyd.e0;
import wf0.r0;
import wtc.b0;
import wvg.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTopupRequestsService f301343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f301344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f301345c;
    public final x4l.c d;

    public f(ApmTopupRequestsService service, sf0.h serverErrorParser, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f301343a = service;
        this.f301344b = serverErrorParser;
        this.f301345c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 2), new d0(this, 24), new wtj.c(this, 22), new r0(2, 2, null), new e0(3, 19, continuation));
    }
}
