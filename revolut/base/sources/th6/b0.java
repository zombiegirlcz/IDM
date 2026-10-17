package th6;

import com.revolut.feature.external_accounts.impl.repository.network.PseService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PseService f271265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f271266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f271267c;

    public b0(ne0.j memoryCache, PseService service, ue0.c pseStorage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(pseStorage, "pseStorage");
        this.f271265a = service;
        this.f271266b = pseStorage;
        Continuation continuation = null;
        int i = 7;
        this.f271267c = new x4l.c(new pti.s(this, continuation, 16), new bek.c(memoryCache, i), new bek.d(memoryCache, i), new t05.m(this, continuation, 25), new ska.c(this, continuation, 7));
    }
}
