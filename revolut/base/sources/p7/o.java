package p7;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpi.g f233493a = cpi.g.G("x", "y");

    public static int a(q7.d dVar) {
        dVar.d();
        int iK = (int) (dVar.k() * 255.0d);
        int iK2 = (int) (dVar.k() * 255.0d);
        int iK3 = (int) (dVar.k() * 255.0d);
        while (dVar.i()) {
            dVar.r();
        }
        dVar.g();
        return Color.argb(255, iK, iK2, iK3);
    }

    public static PointF b(q7.d dVar, float f) {
        int i = n.f233492a[dVar.n().ordinal()];
        if (i == 1) {
            float fK = (float) dVar.k();
            float fK2 = (float) dVar.k();
            while (dVar.i()) {
                dVar.r();
            }
            return new PointF(fK * f, fK2 * f);
        }
        if (i == 2) {
            dVar.d();
            float fK3 = (float) dVar.k();
            float fK4 = (float) dVar.k();
            while (dVar.n() != q7.c.END_ARRAY) {
                dVar.r();
            }
            dVar.g();
            return new PointF(fK3 * f, fK4 * f);
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + dVar.n());
        }
        dVar.f();
        float fD = BitmapDescriptorFactory.HUE_RED;
        float fD2 = 0.0f;
        while (dVar.i()) {
            int iP = dVar.p(f233493a);
            if (iP == 0) {
                fD = d(dVar);
            } else if (iP != 1) {
                dVar.q();
                dVar.r();
            } else {
                fD2 = d(dVar);
            }
        }
        dVar.h();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(q7.d dVar, float f) {
        ArrayList arrayList = new ArrayList();
        dVar.d();
        while (dVar.n() == q7.c.BEGIN_ARRAY) {
            dVar.d();
            arrayList.add(b(dVar, f));
            dVar.g();
        }
        dVar.g();
        return arrayList;
    }

    public static float d(q7.d dVar) {
        q7.c cVarN = dVar.n();
        int i = n.f233492a[cVarN.ordinal()];
        if (i == 1) {
            return (float) dVar.k();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + cVarN);
        }
        dVar.d();
        float fK = (float) dVar.k();
        while (dVar.i()) {
            dVar.r();
        }
        dVar.g();
        return fK;
    }
}
