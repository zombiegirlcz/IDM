package b9;

import android.graphics.Path;

/* JADX INFO: loaded from: classes16.dex */
public final class q2 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f13451a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13453c;

    public q2(v0 v0Var) {
        if (v0Var == null) {
            return;
        }
        v0Var.k(this);
    }

    @Override // b9.w0
    public final void a(float f, float f4, float f5, float f6) {
        this.f13451a.quadTo(f, f4, f5, f6);
        this.f13452b = f5;
        this.f13453c = f6;
    }

    @Override // b9.w0
    public final void b(float f, float f4, float f5, boolean z, boolean z3, float f6, float f32) {
        w2.b(this.f13452b, this.f13453c, f, f4, f5, z, z3, f6, f32, this);
        this.f13452b = f6;
        this.f13453c = f32;
    }

    @Override // b9.w0
    public final void close() {
        this.f13451a.close();
    }

    @Override // b9.w0
    public final void cubicTo(float f, float f4, float f5, float f6, float f32, float f35) {
        this.f13451a.cubicTo(f, f4, f5, f6, f32, f35);
        this.f13452b = f32;
        this.f13453c = f35;
    }

    @Override // b9.w0
    public final void lineTo(float f, float f4) {
        this.f13451a.lineTo(f, f4);
        this.f13452b = f;
        this.f13453c = f4;
    }

    @Override // b9.w0
    public final void moveTo(float f, float f4) {
        this.f13451a.moveTo(f, f4);
        this.f13452b = f;
        this.f13453c = f4;
    }
}
