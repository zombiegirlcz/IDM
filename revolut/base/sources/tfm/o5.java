package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class o5 extends p5 {
    @Override // tfm.p5
    public final void a() {
        this.f270720a.onComplete();
    }

    @Override // tfm.p5
    public final void b() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.f270720a.onNext(andSet);
        }
    }
}
