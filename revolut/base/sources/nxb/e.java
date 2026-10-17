package nxb;

import com.revolut.feature.rev_points.impl.data.network.RevPointsOptInPlacementsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mqc.p;
import mtj.k;
import ne0.j;
import nfj.i;
import nrd.g;
import nx2.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements b {

    @NotNull
    public static final c Companion = new c();
    public static final a f = new a(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsOptInPlacementsService f220548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f220549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f220550c;
    public final hlm.c d;
    public final x4l.c e;

    public e(RevPointsOptInPlacementsService service, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f220548a = service;
        this.f220549b = storage;
        this.f220550c = memoryCache;
        this.d = hlm.d.a();
        Continuation continuation = null;
        this.e = new x4l.c(new k(this, continuation, 21), new g(this, 26), new f(this, 1), new p(2, 12, continuation), new i(3, 2, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(m1c.v0 r16, long r17, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nxb.e.a(m1c.v0, long, gim.c):java.lang.Object");
    }
}
