package p7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes16.dex */
public final class v implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f233506a = new v();

    @Override // p7.g0
    public final Object a(q7.d dVar, float f) {
        q7.c cVarN = dVar.n();
        if (cVarN != q7.c.BEGIN_ARRAY && cVarN != q7.c.BEGIN_OBJECT) {
            if (cVarN != q7.c.NUMBER) {
                throw new IllegalArgumentException("Cannot convert json to point. Next token is " + cVarN);
            }
            PointF pointF = new PointF(((float) dVar.k()) * f, ((float) dVar.k()) * f);
            while (dVar.i()) {
                dVar.r();
            }
            return pointF;
        }
        return o.b(dVar, f);
    }
}
