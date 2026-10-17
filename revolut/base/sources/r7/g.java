package r7;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import m7.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f251946a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f4, float f5) {
        return Math.max(f4, Math.min(f5, f));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f, float f4) {
        int i = (int) f;
        int i2 = (int) f4;
        int i3 = i / i2;
        int i5 = i % i2;
        if (!((i ^ i2) >= 0) && i5 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(q qVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = qVar.f203256b;
        ArrayList arrayList = qVar.f203255a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f4 = pointF.y;
        PointF pointF2 = f251946a;
        pointF2.set(f, f4);
        int i = 0;
        while (i < arrayList.size()) {
            k7.a aVar = (k7.a) arrayList.get(i);
            PointF pointF3 = aVar.f181749a;
            PointF pointF4 = aVar.f181750b;
            PointF pointF5 = aVar.f181751c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (qVar.f203257c) {
            path3.close();
        }
    }

    public static float f(float f, float f4, float f5) {
        return j6.a.a(f4, f, f5, f);
    }

    public static void g(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2, f7.l lVar) {
        if (fVar.a(i, lVar.getName())) {
            String name = lVar.getName();
            k7.f fVar3 = new k7.f(fVar2);
            fVar3.f181767a.add(name);
            k7.f fVar4 = new k7.f(fVar3);
            fVar4.f181768b = lVar;
            arrayList.add(fVar4);
        }
    }
}
