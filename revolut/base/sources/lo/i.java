package lo;

import android.os.Process;
import android.os.SystemClock;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class i {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f197324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f197325b;

    public i(l80.e dateProvider, l80.h systemTimeProvider, e runtimeProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        Intrinsics.checkNotNullParameter(runtimeProvider, "runtimeProvider");
        this.f197324a = dateProvider;
        this.f197325b = Process.getStartUptimeMillis();
    }

    public static Long b(String str, List list) {
        Object next;
        String strV0;
        String strZ0;
        String string;
        Long lN;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.H((String) next, str, false)) {
                break;
            }
        }
        String str2 = (String) next;
        if (str2 == null || (strV0 = d0.v0(str2, str, str2)) == null || (strZ0 = d0.z0(strV0, "kB", strV0)) == null || (string = d0.F0(strZ0).toString()) == null || (lN = z.n(string)) == null) {
            return null;
        }
        return Long.valueOf(lN.longValue() * FileSize.KB_COEFFICIENT);
    }

    public final g a() throws IOException {
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        if (jMaxMemory <= 0) {
            throw new IllegalStateException(p.a.m(jMaxMemory, "Invalid max heap size: "));
        }
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        List<String> allLines = Files.readAllLines(new File("/proc/self/status").toPath());
        Intrinsics.h(allLines);
        Long lB = b("VmRSS:", allLines);
        Long lB2 = b("VmSize:", allLines);
        for (String str : allLines) {
            if (a0.H(str, "Threads:", false)) {
                return new g(jFreeMemory, jMaxMemory, lB, lB2, Integer.valueOf(Integer.parseInt(d0.F0(d0.v0(str, "Threads:", str)).toString())), TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.f197325b), ((l80.f) this.f197324a).b());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
