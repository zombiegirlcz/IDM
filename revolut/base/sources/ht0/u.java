package ht0;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zhm.l0;

/* JADX INFO: loaded from: classes19.dex */
public final class u implements v {
    @Override // ht0.v
    public final List a(List list) {
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("points", list);
        if (list.size() > 1) {
            if (list.size() == 2) {
                arrayListY.add(new PointF(((PointF) list.get(0)).x, ((PointF) list.get(0)).y));
                arrayListY.add(new PointF(((PointF) list.get(1)).x, ((PointF) list.get(1)).y));
                return arrayListY;
            }
            arrayListY.add(new PointF(((PointF) list.get(0)).x, ((PointF) list.get(0)).y));
            Iterator<Integer> it8 = kotlin.ranges.f.o(1, list.size()).iterator();
            while (it8.hasNext()) {
                PointF pointF = (PointF) list.get(((l0) it8).nextInt());
                arrayListY.add(new PointF(pointF.x, pointF.y));
            }
        }
        return arrayListY;
    }
}
