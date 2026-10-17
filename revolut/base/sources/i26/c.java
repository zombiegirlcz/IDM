package i26;

import com.revolut.feature.defi.asset_details.impl.data.api.DeFiAssetDetailsApiService;
import do3.q;
import g2e.m0;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import qe0.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e26.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f157854g = TimeUnit.SECONDS.toMillis(300);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAssetDetailsApiService f157855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f157856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f157857c;
    public final b80.c d;
    public final CoroutineScope e;
    public final o f;

    public c(DeFiAssetDetailsApiService service, ne0.j memoryCache, ue0.c storage, b80.c networkStateRepository, CoroutineScope appCoroutineScope, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f157855a = service;
        this.f157856b = memoryCache;
        this.f157857c = storage;
        this.d = networkStateRepository;
        this.e = appCoroutineScope;
        Continuation continuation = null;
        this.f = q.f(new x4l.c(new ghl.l(this, continuation, 13), new hw9.a(this, 27), new hw9.b(this, 20), new i13.d(this, (Continuation) null, 3), new m0(this, continuation, 24)), appCoroutineScope);
    }
}
