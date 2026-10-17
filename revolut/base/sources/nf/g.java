package nf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends nim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static g f214772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f214773b;

    static {
        f fVar = new f();
        fVar.put(461L, "FIREPERF_AUTOPUSH");
        fVar.put(462L, "FIREPERF");
        fVar.put(675L, "FIREPERF_INTERNAL_LOW");
        fVar.put(676L, "FIREPERF_INTERNAL_HIGH");
        f214773b = Collections.unmodifiableMap(fVar);
    }

    @Override // nim.a
    public final String n() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
