package nf;

/* JADX INFO: loaded from: classes17.dex */
public final class o extends nim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static o f214781a;

    public static synchronized o H() {
        try {
            if (f214781a == null) {
                f214781a = new o();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f214781a;
    }

    @Override // nim.a
    public final String n() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // nim.a
    public final String s() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }
}
