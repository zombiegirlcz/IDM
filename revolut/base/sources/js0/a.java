package js0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f178087a;

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f178087a) {
            return;
        }
        a();
    }
}
