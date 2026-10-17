package b9;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class o2 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13429c;
    public p2 d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13431h;

    public o2(w2 w2Var, v0 v0Var) {
        ArrayList arrayList = new ArrayList();
        this.f13427a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.f13430g = -1;
        if (v0Var == null) {
            return;
        }
        v0Var.k(this);
        if (this.f13431h) {
            this.d.b((p2) arrayList.get(this.f13430g));
            arrayList.set(this.f13430g, this.d);
            this.f13431h = false;
        }
        p2 p2Var = this.d;
        if (p2Var != null) {
            arrayList.add(p2Var);
        }
    }

    @Override // b9.w0
    public final void a(float f, float f4, float f5, float f6) {
        this.d.a(f, f4);
        this.f13427a.add(this.d);
        this.d = new p2(f5, f6, f5 - f, f6 - f4);
        this.f13431h = false;
    }

    @Override // b9.w0
    public final void b(float f, float f4, float f5, boolean z, boolean z3, float f6, float f32) {
        this.e = true;
        this.f = false;
        p2 p2Var = this.d;
        w2.b(p2Var.f13441a, p2Var.f13442b, f, f4, f5, z, z3, f6, f32, this);
        this.f = true;
        this.f13431h = false;
    }

    @Override // b9.w0
    public final void close() {
        this.f13427a.add(this.d);
        lineTo(this.f13428b, this.f13429c);
        this.f13431h = true;
    }

    @Override // b9.w0
    public final void cubicTo(float f, float f4, float f5, float f6, float f32, float f35) {
        if (this.f || this.e) {
            this.d.a(f, f4);
            this.f13427a.add(this.d);
            this.e = false;
        }
        this.d = new p2(f32, f35, f32 - f5, f35 - f6);
        this.f13431h = false;
    }

    @Override // b9.w0
    public final void lineTo(float f, float f4) {
        this.d.a(f, f4);
        this.f13427a.add(this.d);
        p2 p2Var = this.d;
        this.d = new p2(f, f4, f - p2Var.f13441a, f4 - p2Var.f13442b);
        this.f13431h = false;
    }

    @Override // b9.w0
    public final void moveTo(float f, float f4) {
        boolean z = this.f13431h;
        ArrayList arrayList = this.f13427a;
        if (z) {
            this.d.b((p2) arrayList.get(this.f13430g));
            arrayList.set(this.f13430g, this.d);
            this.f13431h = false;
        }
        p2 p2Var = this.d;
        if (p2Var != null) {
            arrayList.add(p2Var);
        }
        this.f13428b = f;
        this.f13429c = f4;
        this.d = new p2(f, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.f13430g = arrayList.size();
    }
}
