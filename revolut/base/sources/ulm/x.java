package ulm;

import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ylm.u f281162a;

    public x() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        xlm.d taskRunner = xlm.d.f307058l;
        ylm.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        ylm.e connectionListener = ylm.g.f314763a;
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        ylm.u delegate = new ylm.u(taskRunner);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f281162a = delegate;
    }

    public final void a() {
        Socket socket;
        ylm.u uVar = this.f281162a;
        Iterator it8 = uVar.d.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        while (it8.hasNext()) {
            ylm.s sVar = (ylm.s) it8.next();
            Intrinsics.h(sVar);
            synchronized (sVar) {
                if (sVar.f314802q.isEmpty()) {
                    it8.remove();
                    sVar.k = true;
                    socket = sVar.e;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                vlm.j.e(socket);
                ylm.g.a(sVar);
            }
        }
        if (uVar.d.isEmpty()) {
            uVar.f314805b.a();
        }
    }
}
