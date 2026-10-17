package sgm;

/* JADX INFO: loaded from: classes14.dex */
public final class f5 extends g5 {
    @Override // sgm.g5
    public final void a() {
        this.f262859a.onComplete();
    }

    @Override // sgm.g5
    public final void b() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.f262859a.onNext(andSet);
        }
    }
}
