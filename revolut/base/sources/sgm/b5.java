package sgm;

/* JADX INFO: loaded from: classes14.dex */
public final class b5 extends c5 {
    @Override // sgm.c5
    public final void a() {
        this.f262742a.onComplete();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.f262742a.onNext(andSet);
        }
    }
}
