package nf;

/* JADX INFO: loaded from: classes.dex */
public final class d extends nim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f214770a;

    public static synchronized d H() {
        try {
            if (f214770a == null) {
                f214770a = new d();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f214770a;
    }

    @Override // nim.a
    public final String n() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // nim.a
    public final String s() {
        return "experiment_app_start_ttid";
    }
}
