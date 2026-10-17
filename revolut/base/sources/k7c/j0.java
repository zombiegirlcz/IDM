package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayService f181969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f181970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qe0.o f181971c;

    public j0(RevolutPayService revolutPayService, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(revolutPayService, "revolutPayService");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f181969a = revolutPayService;
        this.f181970b = coroutineScope;
        Continuation continuation = null;
        this.f181971c = do3.q.f(new x4l.c(new x(this, continuation, 4), new d(6), new k1f.n(25), new iz1.g(2, 14, continuation), new k3c.l(3, 7, continuation)), coroutineScope);
    }
}
