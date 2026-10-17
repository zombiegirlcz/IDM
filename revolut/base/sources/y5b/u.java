package y5b;

import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPlanAdditionalValueService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wf0.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlanAdditionalValueService f311064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4l.c f311065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f311066c;

    public u(CobrandedCardsPlanAdditionalValueService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f311064a = service;
        Continuation continuation = null;
        int i = 2;
        int i2 = 3;
        this.f311065b = new x4l.c(new wqj.g(this, continuation, 28), new y4b.b(20), new y13.a(25), new r0(i, 10, continuation), new uyd.e0(i2, 26, continuation));
        this.f311066c = new x4l.c(new wtc.b0(this, continuation, 10), new y4b.b(21), new y13.a(26), new r0(i, 9, continuation), new uyd.e0(i2, 25, continuation));
    }
}
