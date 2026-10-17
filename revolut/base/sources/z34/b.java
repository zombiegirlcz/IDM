package z34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import ne0.d;
import wf0.r0;
import x4l.c;
import y5b.b0;
import ya6.y;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f319158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f319159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f319160c;
    public final c d;

    public b(CreditPluginsService creditPluginsService, p creditApplicationDtoMapper, d memoryCache) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f319158a = creditApplicationDtoMapper;
        this.f319159b = creditPluginsService;
        this.f319160c = memoryCache;
        int i = 9;
        this.d = new c(new b0(this, null, 10), new z2.a(this, i), new yz4.b(this, i), new r0(2, 28, null), new y(3, 3, null));
    }
}
