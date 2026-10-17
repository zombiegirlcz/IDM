package r24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import nfj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f251048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f251049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f251050c;
    public final x4l.c d;

    public d(CreditPluginsService service, p creditApplicationDtoMapper, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f251048a = service;
        this.f251049b = creditApplicationDtoMapper;
        this.f251050c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new pti.d(this, continuation, 12), new qtb.c(this, 24), new qm2.c(this, 21), new mqc.p(2, 28, continuation), new i(3, 14, continuation));
    }
}
