package dm;

import android.graphics.Canvas;
import android.graphics.Paint;
import em.b;
import em.c;
import em.d;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f115804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f115805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f115806c;
    public b d;
    public c e;
    public b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f115807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f115808h;
    public c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f115809j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f115810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f115811m;

    public final void a(Canvas canvas, boolean z) {
        Paint paint;
        if (this.f115805b != null) {
            b bVar = this.f115804a;
            int i = this.k;
            int i2 = this.f115810l;
            int i3 = this.f115811m;
            cm.a aVar = (cm.a) bVar.f127556b;
            float f = aVar.f25087a;
            int i5 = aVar.f25090g;
            float f4 = aVar.f25091h;
            int i6 = aVar.f25092j;
            int i21 = aVar.i;
            int i22 = aVar.f25098r;
            zl.a aVarA = aVar.a();
            if ((aVarA == zl.a.SCALE && !z) || (aVarA == zl.a.SCALE_DOWN && z)) {
                f *= f4;
            }
            if (i != i22) {
                i6 = i21;
            }
            if (aVarA != zl.a.FILL || i == i22) {
                paint = (Paint) bVar.f127555a;
            } else {
                paint = (Paint) bVar.f127557c;
                paint.setStrokeWidth(i5);
            }
            paint.setColor(i6);
            canvas.drawCircle(i2, i3, f, paint);
        }
    }
}
