package to;

import ecm.a2;
import ecm.z1;
import gcm.p1;
import gcm.s4;
import java.net.SocketAddress;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4 f272473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f272474b;

    public a() {
        this(0);
    }

    @Override // ecm.a2
    public final z1 a(SocketAddress targetServerAddress) {
        Intrinsics.checkNotNullParameter(targetServerAddress, "targetServerAddress");
        try {
            return this.f272473a.a(targetServerAddress);
        } catch (IllegalArgumentException e) {
            if (this.f272474b.compareAndSet(false, true)) {
                RuntimeException runtimeException = new RuntimeException("gRPC proxy detection failed: " + e + ". Falling back to direct connection.", e);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
            }
            return null;
        }
    }

    public a(int i) {
        s4 delegate = p1.f142815m;
        Intrinsics.checkNotNullExpressionValue(delegate, "DEFAULT_PROXY_DETECTOR");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f272473a = delegate;
        this.f272474b = new AtomicBoolean();
    }
}
