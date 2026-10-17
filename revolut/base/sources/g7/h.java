package g7;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n7.b f141033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n7.b f141034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f141035c;
    public final i d;
    public final i e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f141036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Matrix f141037h;

    public h(n7.b bVar, n7.b bVar2, com.google.firebase.messaging.u uVar) {
        this.f141034b = bVar;
        this.f141033a = bVar2;
        e eVarA = ((l7.a) uVar.f49545a).a();
        this.f141035c = (f) eVarA;
        eVarA.a(this);
        bVar2.b(eVarA);
        i iVarA = ((l7.b) uVar.f49546b).a();
        this.d = iVarA;
        iVarA.a(this);
        bVar2.b(iVarA);
        i iVarA2 = ((l7.b) uVar.f49547c).a();
        this.e = iVarA2;
        iVarA2.a(this);
        bVar2.b(iVarA2);
        i iVarA3 = ((l7.b) uVar.d).a();
        this.f = iVarA3;
        iVarA3.a(this);
        bVar2.b(iVarA3);
        i iVarA4 = ((l7.b) uVar.e).a();
        this.f141036g = iVarA4;
        iVarA4.a(this);
        bVar2.b(iVarA4);
    }

    public final r7.a a(Matrix matrix, int i) {
        float fM = this.e.m() * 0.017453292f;
        float fFloatValue = ((Float) this.f.f()).floatValue();
        double d = fM;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.f141036g.f()).floatValue();
        int iIntValue = ((Integer) this.f141035c.f()).intValue();
        r7.a aVar = new r7.a(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((((Float) this.d.f()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        aVar.d(matrix);
        if (this.f141037h == null) {
            this.f141037h = new Matrix();
        }
        this.f141033a.f212944w.e().invert(this.f141037h);
        aVar.d(this.f141037h);
        return aVar;
    }

    public final void b(s7.c cVar) {
        i iVar = this.d;
        if (cVar == null) {
            iVar.k(null);
        } else {
            iVar.k(new g(cVar));
        }
    }

    @Override // g7.a
    public final void d() {
        this.f141034b.d();
    }
}
