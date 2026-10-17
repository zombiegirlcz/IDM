package g7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class m extends k {
    public final PointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f141041j;
    public final float[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f141042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f141043m;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.f141041j = new float[2];
        this.k = new float[2];
        this.f141042l = new PathMeasure();
    }

    @Override // g7.e
    public final Object g(s7.a aVar, float f) {
        float f4;
        l lVar = (l) aVar;
        Path path = lVar.f141039q;
        s7.c cVar = this.e;
        if (cVar == null || aVar.f260485h == null) {
            f4 = f;
        } else {
            f4 = f;
            PointF pointF = (PointF) cVar.b(lVar.f260484g, lVar.f260485h.floatValue(), (PointF) lVar.f260482b, (PointF) lVar.f260483c, e(), f4, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) aVar.f260482b;
        }
        l lVar2 = this.f141043m;
        PathMeasure pathMeasure = this.f141042l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f141043m = lVar;
        }
        float length = pathMeasure.getLength();
        float f5 = f4 * length;
        float[] fArr = this.f141041j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f5, fArr, fArr2);
        float f6 = fArr[0];
        float f32 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f6, f32);
        if (f5 < BitmapDescriptorFactory.HUE_RED) {
            pointF2.offset(fArr2[0] * f5, fArr2[1] * f5);
            return pointF2;
        }
        if (f5 > length) {
            float f35 = f5 - length;
            pointF2.offset(fArr2[0] * f35, fArr2[1] * f35);
        }
        return pointF2;
    }
}
