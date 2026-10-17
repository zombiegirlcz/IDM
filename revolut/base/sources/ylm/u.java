package ylm;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f314804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xlm.b f314805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wlm.l f314806c;
    public final ConcurrentLinkedQueue d;

    public u(xlm.d taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        e connectionListener = g.f314763a;
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.f314804a = timeUnit.toNanos(5L);
        this.f314805b = taskRunner.d();
        this.f314806c = new wlm.l(2, v0.a.i(new StringBuilder(), vlm.j.f290513b, " ConnectionPool connection closer"), this);
        this.d = new ConcurrentLinkedQueue();
    }

    public final int a(s sVar, long j2) {
        TimeZone timeZone = vlm.j.f290512a;
        ArrayList arrayList = sVar.f314802q;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + sVar.f314794c.f281138a.f281058h + " was leaked. Did you forget to close a response body?";
                emm.h.Companion.getClass();
                emm.h.f127697a.k(((o) reference).f314777a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    sVar.f314803r = j2 - this.f314804a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
