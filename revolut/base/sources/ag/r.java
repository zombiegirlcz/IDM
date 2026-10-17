package ag;

/* JADX INFO: loaded from: classes17.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f4721a;

    public r(s sVar) {
        this.f4721a = sVar;
    }

    public final void a() {
        s sVar = this.f4721a;
        synchronized (sVar) {
            sVar.d = true;
        }
        this.f4721a.g();
    }
}
