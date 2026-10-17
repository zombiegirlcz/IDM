package b34;

import a19.e;
import a72.k;
import auj.o;
import av8.n;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import ne0.d;
import org.jetbrains.annotations.NotNull;
import x4l.c;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f11998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f11999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f12000c;
    public final c d;

    public b(CreditPluginsService creditPluginsService, p creditApplicationDtoMapper, d memoryCache) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f11998a = creditApplicationDtoMapper;
        this.f11999b = creditPluginsService;
        this.f12000c = memoryCache;
        Continuation continuation = null;
        this.d = new c(new k(this, continuation, 20), new o(this, 29), new n(this, 12), new akl.o(2, 6, continuation), new e(3, 8, continuation));
    }
}
