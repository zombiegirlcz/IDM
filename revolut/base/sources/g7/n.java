package g7;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n extends k {
    public final PointF i;

    public n(List list) {
        super(list);
        this.i = new PointF();
    }

    @Override // g7.e
    public final Object g(s7.a aVar, float f) {
        return h(aVar, f, f, f);
    }

    @Override // g7.e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final PointF h(s7.a aVar, float f, float f4, float f5) {
        Object obj2;
        PointF pointF;
        Object obj3 = aVar.f260482b;
        if (obj3 == null || (obj2 = aVar.f260483c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj3;
        PointF pointF3 = (PointF) obj2;
        s7.c cVar = this.e;
        if (cVar != null && (pointF = (PointF) cVar.b(aVar.f260484g, aVar.f260485h.floatValue(), pointF2, pointF3, f, e(), this.d)) != null) {
            return pointF;
        }
        float f6 = pointF2.x;
        float fA = j6.a.a(pointF3.x, f6, f4, f6);
        float f32 = pointF2.y;
        float fA2 = j6.a.a(pointF3.y, f32, f5, f32);
        PointF pointF4 = this.i;
        pointF4.set(fA, fA2);
        return pointF4;
    }
}
