package mqc;

import com.revolut.feature.salary_switch.impl.network.CardTokenService;
import com.revolut.feature.salary_switch.impl.network.PayrollService;
import k7c.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ml3.y;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardTokenService f207961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayrollService f207962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f207963c;
    public final ue0.c d;
    public final x4l.c e;

    public k(CardTokenService cardTokenService, PayrollService payrollService, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(cardTokenService, "cardTokenService");
        Intrinsics.checkNotNullParameter(payrollService, "payrollService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f207961a = cardTokenService;
        this.f207962b = payrollService;
        this.f207963c = memoryCache;
        this.d = storage;
        Continuation continuation = null;
        this.e = new x4l.c(new x(this, continuation, 27), new y(this, 26), new mnl.g(this, 10), new mkk.q(this, continuation, 11), new lp6.g(this, continuation, 9));
    }
}
