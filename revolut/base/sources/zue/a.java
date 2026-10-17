package zue;

import com.revolut.feature.topup_screen.impl.data.network.service.BrazilInboundStoredMethodDetailsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import ue0.c;
import y5b.b0;
import y69.e;
import zo2.h;
import zrd.q;
import zt4.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazilInboundStoredMethodDetailsService f325440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f325441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f325442c;
    public final x4l.c d;

    public a(BrazilInboundStoredMethodDetailsService service, j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f325440a = service;
        this.f325441b = memoryCache;
        this.f325442c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 14), new q(this, 7), new h(this, 15), new l(this, continuation, 3), new e(this, continuation, 9));
    }
}
