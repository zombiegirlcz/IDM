package z8;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f320030a;

    public final void a() {
        if (this.f320030a) {
            throw new IllegalStateException("Already released");
        }
    }
}
