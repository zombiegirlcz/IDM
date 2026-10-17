package nf;

/* JADX INFO: loaded from: classes17.dex */
public final class q extends nim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static q f214783a;

    public static synchronized q H() {
        try {
            if (f214783a == null) {
                f214783a = new q();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f214783a;
    }

    @Override // nim.a
    public final String n() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // nim.a
    public final String s() {
        return "sessions_memory_capture_frequency_bg_ms";
    }
}
