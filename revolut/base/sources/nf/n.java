package nf;

/* JADX INFO: loaded from: classes17.dex */
public final class n extends nim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static n f214780a;

    public static synchronized n H() {
        try {
            if (f214780a == null) {
                f214780a = new n();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f214780a;
    }

    @Override // nim.a
    public final String n() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // nim.a
    public final String s() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }
}
