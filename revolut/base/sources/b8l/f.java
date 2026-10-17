package b8l;

import b4b.z;
import b73.h;
import com.revolut.shared.feature.market_data.impl.data.service.OrderQuoteService;
import do3.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qe0.o;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuoteService f13297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f13298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f13299c;
    public final qe0.f d;
    public final o e;

    public f(OrderQuoteService service, lfm.c appCompositeDisposable, CoroutineScope appCoroutineScope, a8l.b marketDataQuoteEndpointProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(appCompositeDisposable, "appCompositeDisposable");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(marketDataQuoteEndpointProvider, "marketDataQuoteEndpointProvider");
        this.f13297a = service;
        this.f13298b = appCoroutineScope;
        this.f13299c = new w4l.f(new b7d.c(this, 2), null, null, null, null, null, null, appCompositeDisposable, 126);
        this.d = new qe0.f(new z(this, 27), new b0c.a(4), new h(27), new h(28));
        Continuation continuation = null;
        this.e = q.f(new x4l.c(new b6a.d(this, continuation, 3), new h(29), new b6d.a(19), new akl.o(2, 14, continuation), new a19.e(3, 16, continuation)), appCoroutineScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8l.f.a(com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8l.f.b(com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams, gim.c):java.lang.Object");
    }
}
