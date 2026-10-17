package iri;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f168051b;

    public /* synthetic */ c(Throwable th10, int i) {
        this.f168050a = i;
        this.f168051b = th10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f168050a) {
            case 0:
                throw this.f168051b;
            default:
                throw this.f168051b;
        }
    }
}
