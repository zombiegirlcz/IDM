package pkm;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpkm/j;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f237218a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f237219b = System.nanoTime();

    public static long a() {
        return System.nanoTime() - f237219b;
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
