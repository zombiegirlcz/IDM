package nf;

/* JADX INFO: loaded from: classes17.dex */
public final class r extends nim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static r f214784a;

    public static synchronized r H() {
        try {
            if (f214784a == null) {
                f214784a = new r();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f214784a;
    }

    @Override // nim.a
    public final String n() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // nim.a
    public final String s() {
        return "sessions_memory_capture_frequency_fg_ms";
    }
}
