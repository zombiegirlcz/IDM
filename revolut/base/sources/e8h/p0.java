package e8h;

import com.revolut.feature.wealth.impl.data.network.disclaimers.WealthDisclaimersService;
import dp4.z0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.d f123722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthDisclaimersService f123723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f123724c;
    public final x4l.c d;

    public p0(ne0.d memoryCache, WealthDisclaimersService service, xe0.e storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f123722a = memoryCache;
        this.f123723b = service;
        this.f123724c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new e6d.f(this, continuation, 2), new e87.e(this, 7), new e54.r(this, 14), new dze.n(this, continuation, 22), new z0(this, continuation, 5));
    }
}
