package waj;

import com.revolut.retail.feature.crypto.prelaunch.impl.data.network.CryptoPreLaunchService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import pti.s;
import ue0.c;
import w3c.n;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoPreLaunchService f295944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f295945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f295946c;
    public final x4l.c d;

    public a(CryptoPreLaunchService service, j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f295944a = service;
        this.f295945b = memoryCache;
        this.f295946c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new s(this, continuation, 28), new n(this, 19), new vvc.s(this, 25), new w65.c(this, continuation, 12), new wa7.j(this, continuation, 1));
    }
}
