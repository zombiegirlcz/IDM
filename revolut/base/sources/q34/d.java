package q34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.application.plugins.impl.network.TicketorService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import nfj.i;
import pyb.g;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements yv3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f241796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f241797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TicketorService f241798c;
    public final m31.c d;
    public final x4l.c e;
    public final x4l.c f;

    public d(p creditApplicationDtoMapper, CreditPluginsService api2, TicketorService ticketorService, m31.c multipartHelper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(ticketorService, "ticketorService");
        Intrinsics.checkNotNullParameter(multipartHelper, "multipartHelper");
        this.f241796a = creditApplicationDtoMapper;
        this.f241797b = api2;
        this.f241798c = ticketorService;
        this.d = multipartHelper;
        Continuation continuation = null;
        int i = 3;
        this.e = new x4l.c(new b(this, continuation, 0), new q2a.a(24), new g(29), new mqc.p(2, 23, null), new i(i, 11, continuation));
        this.f = new x4l.c(new b(this, continuation, 1), new q2a.a(25), new a(0), new mqc.p(2, 24, null), new i(i, 12, continuation));
    }
}
