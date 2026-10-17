package ecm;

/* JADX INFO: loaded from: classes21.dex */
public final class i2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j2 f124821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ et0.w f124822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f124823c;
    public final /* synthetic */ k2 d;

    public i2(k2 k2Var, j2 j2Var, et0.w wVar, long j2) {
        this.d = k2Var;
        this.f124821a = j2Var;
        this.f124822b = wVar;
        this.f124823c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.execute(this.f124821a);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f124822b.toString());
        sb6.append("(scheduled in SynchronizationContext with delay of ");
        return a0.d.j(this.f124823c, ")", sb6);
    }
}
