package nf;

/* JADX INFO: loaded from: classes17.dex */
public final class j extends nim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static j f214776a;

    public static synchronized j H() {
        try {
            if (f214776a == null) {
                f214776a = new j();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f214776a;
    }

    @Override // nim.a
    public final String n() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }
}
