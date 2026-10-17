package net.zetetic.database.sqlcipher;

/* JADX INFO: loaded from: classes14.dex */
public final class CloseGuard {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CloseGuard f214674b = new CloseGuard();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Reporter f214675c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f214676a;

    public static final class DefaultReporter implements Reporter {
    }

    public interface Reporter {
    }

    public final void a() {
        if (this != f214674b) {
            this.f214676a = new Throwable("Explicit termination method 'close' not called");
        }
    }
}
