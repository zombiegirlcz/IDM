package qfm;

import sgm.k6;

/* JADX INFO: loaded from: classes4.dex */
public final class t2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245549a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f245550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f245551c;

    public t2(tji.d dVar, long j2) {
        this.f245551c = dVar;
        this.f245550b = j2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Number, qfm.s2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, sgm.k6] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f245549a) {
            case 0:
                ((Number) this.f245551c).b(this.f245550b);
                break;
            case 1:
                this.f245551c.b(this.f245550b);
                break;
            default:
                tji.d.a((tji.d) this.f245551c, this.f245550b);
                break;
        }
    }

    public t2(long j2, k6 k6Var) {
        this.f245550b = j2;
        this.f245551c = k6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t2(long j2, s2 s2Var) {
        this.f245550b = j2;
        this.f245551c = (Number) s2Var;
    }
}
