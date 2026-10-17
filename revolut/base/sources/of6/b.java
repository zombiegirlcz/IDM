package of6;

import com.revolut.feature.external_accounts.impl.data.open_banking_brazil.inbound.BrazilInboundOpenBankingService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mqc.p;
import ne0.j;
import nfj.i;
import o29.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazilInboundOpenBankingService f224739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f224740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f224741c;

    public b(BrazilInboundOpenBankingService service, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f224739a = service;
        this.f224740b = memoryCache;
        Continuation continuation = null;
        this.f224741c = new x4l.c(new l(this, continuation, 9), new o9h.b(this, 18), new oa4.c(this, 16), new p(2, 15, continuation), new i(3, 7, continuation));
    }
}
