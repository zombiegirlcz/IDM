package ht0;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements v {
    @Override // ht0.v
    public final List a(List list) {
        List list2 = list;
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("points", list2);
        PointF result = new PointF();
        int i = 1;
        if (list2.size() <= 1) {
            r6.b.D("provide 2 or more points");
        }
        if (list2.size() < 4) {
            return list2;
        }
        int i2 = 0;
        PointF pointF = (PointF) list2.get(0);
        arrayListY.add(new PointF(pointF.x, pointF.y));
        int size = list2.size() - 2;
        int i3 = 1;
        while (i3 < size) {
            int i5 = i2;
            while (i5 < 21) {
                float f = i5 / 20;
                PointF p0 = (PointF) list2.get(i3 - 1);
                PointF p17 = (PointF) list2.get(i3);
                PointF p2 = (PointF) list2.get(i3 + 1);
                PointF p3 = (PointF) list2.get(i3 + 2);
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                Intrinsics.checkNotNullParameter(p2, "p2");
                Intrinsics.checkNotNullParameter(p3, "p3");
                Intrinsics.checkNotNullParameter(result, "result");
                float fA = rzl.b.a(p0, p17, BitmapDescriptorFactory.HUE_RED);
                float fA2 = rzl.b.a(p17, p2, fA);
                float fA3 = rzl.b.a(p2, p3, fA2);
                float f4 = (f * fA2) + ((i - f) * fA);
                float f5 = fA - BitmapDescriptorFactory.HUE_RED;
                float f6 = (fA - f4) / f5;
                float f32 = p0.x * f6;
                float f35 = f4 - BitmapDescriptorFactory.HUE_RED;
                float f36 = f35 / f5;
                float f37 = p17.x;
                float f41 = (f36 * f37) + f32;
                float f42 = f6 * p0.y;
                float f57 = p17.y;
                float f69 = (f36 * f57) + f42;
                float f75 = fA2 - f4;
                float f77 = fA2 - fA;
                float f81 = f75 / f77;
                float f82 = f4 - fA;
                float f93 = f82 / f77;
                float f94 = p2.x;
                float f99 = (f93 * f94) + (f37 * f81);
                float f100 = p2.y;
                float f101 = (f93 * f100) + (f57 * f81);
                float f102 = fA3 - f4;
                float f103 = fA3 - fA2;
                float f104 = f102 / f103;
                float f105 = (f4 - fA2) / f103;
                float f106 = (p3.x * f105) + (f94 * f104);
                float f107 = (f105 * p3.y) + (f104 * f100);
                float f108 = fA2 - BitmapDescriptorFactory.HUE_RED;
                float f109 = f75 / f108;
                float f110 = f35 / f108;
                float f111 = fA3 - fA;
                float f112 = f102 / f111;
                float f113 = f82 / f111;
                result.set((((f106 * f113) + (f99 * f112)) * f93) + (((f110 * f99) + (f41 * f109)) * f81), (f93 * ((f113 * f107) + (f112 * f101))) + (f81 * ((f110 * f101) + (f109 * f69))));
                arrayListY.add(new PointF(result.x, result.y));
                i5++;
                list2 = list;
                i = 1;
            }
            i3++;
            list2 = list;
            i2 = 0;
            i = 1;
        }
        PointF pointF2 = (PointF) zhm.d0.m0(list);
        arrayListY.add(new PointF(pointF2.x, pointF2.y));
        return arrayListY;
    }
}
