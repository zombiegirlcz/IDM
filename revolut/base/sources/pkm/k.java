package pkm;

import kotlin.Metadata;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lpkm/k;", "", "kotlin/time/f", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f237220a = new k();

    public final TimeMark a() {
        j.f237218a.getClass();
        return new kotlin.time.f(j.a());
    }

    public final String toString() {
        j.f237218a.getClass();
        return "TimeSource(System.nanoTime())";
    }
}
