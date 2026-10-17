package hu0;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f155486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f155487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f155488c = System.currentTimeMillis();
    public final float d;
    public final float e;
    public final /* synthetic */ f f;

    public e(f fVar, float f, float f4, float f5, float f6) {
        this.f = fVar;
        this.f155486a = f5;
        this.f155487b = f6;
        this.d = f;
        this.e = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f;
        float interpolation = fVar.f155489a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f155488c) * 1.0f) / fVar.f155490b));
        float f = this.d;
        float fA = j6.a.a(this.e, f, interpolation, f) / fVar.d();
        f fVar2 = (f) fVar.f155503w.f132372b;
        if (fVar2.d() < fVar2.e || fA < 1.0f) {
            fVar2.f155496m.postScale(fA, fA, this.f155486a, this.f155487b);
            fVar2.a();
        }
        if (interpolation < 1.0f) {
            fVar.f155493h.postOnAnimation(this);
        }
    }
}
