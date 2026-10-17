package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class k5 extends l5 {
    @Override // tfm.l5
    public final void a() {
        this.f270615a.onComplete();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.f270615a.onNext(andSet);
        }
    }
}
