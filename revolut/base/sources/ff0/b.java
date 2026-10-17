package ff0;

import com.revolut.core.date.time.exception.KronosSyncException;
import fe9.f;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nkm.t;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final void a(String host, Throwable throwable) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        for (Throwable th10 : t.g(throwable, new f(6))) {
            if ((th10 instanceof UnknownHostException) || (th10 instanceof SocketTimeoutException)) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "KronosSyncListener", j6.a.q("Synchronization failed, network is offline. host=", host), null, null, 16);
                return;
            }
        }
        KronosSyncException kronosSyncException = new KronosSyncException(host, throwable);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "KronosSyncListener", null, kronosSyncException, h0Var);
    }
}
