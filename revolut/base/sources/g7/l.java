package g7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public final class l extends s7.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f141039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s7.a f141040r;

    public l(d7.j jVar, s7.a aVar) {
        super(jVar, (PointF) aVar.f260482b, (PointF) aVar.f260483c, aVar.d, aVar.e, aVar.f, aVar.f260484g, aVar.f260485h);
        this.f141040r = aVar;
        d();
    }

    public final void d() {
        Object obj2;
        Object obj3 = this.f260483c;
        Object obj4 = this.f260482b;
        boolean z = (obj3 == null || obj4 == null || !((PointF) obj4).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        if (obj4 == null || (obj2 = this.f260483c) == null || z) {
            return;
        }
        PointF pointF = (PointF) obj4;
        PointF pointF2 = (PointF) obj2;
        s7.a aVar = this.f141040r;
        PointF pointF3 = aVar.o;
        PointF pointF4 = aVar.f260490p;
        Matrix matrix = r7.l.f251966a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == BitmapDescriptorFactory.HUE_RED && pointF4.length() == BitmapDescriptorFactory.HUE_RED)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f4 = pointF.y + pointF3.y;
            float f5 = pointF2.x;
            float f6 = f5 + pointF4.x;
            float f32 = pointF2.y;
            path.cubicTo(f, f4, f6, f32 + pointF4.y, f5, f32);
        }
        this.f141039q = path;
    }
}
