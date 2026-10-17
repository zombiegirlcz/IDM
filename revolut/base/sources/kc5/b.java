package kc5;

import com.revolut.feature.crypto.account.impl.service.CryptoAccountService;
import k3c.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f182664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f182665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoAccountService f182666c;
    public final x4l.c d;

    public b(c storage, j memoryCache, CryptoAccountService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f182664a = storage;
        this.f182665b = memoryCache;
        this.f182666c = service;
        Continuation continuation = null;
        this.d = new x4l.c(new k(this, continuation, 2), new k5e.k(this, 23), new k3k.k(this, 18), new k22.c(this, continuation, 17), new hwi.b(this, continuation, 21));
    }
}
