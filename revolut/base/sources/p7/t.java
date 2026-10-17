package p7;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpi.g f233502a = cpi.g.G("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cpi.g f233503b = cpi.g.G("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cpi.g f233504c = cpi.g.G("list");
    public static final cpi.g d = cpi.g.G("cm", "tm", "dr");

    public static d7.j a(q7.e eVar) throws EOFException, q7.b {
        ArrayList arrayList;
        float f;
        float f4;
        float f5;
        HashMap map;
        float f6;
        HashMap map2;
        ArrayList arrayList2;
        float f32;
        float f35;
        float fC = r7.l.c();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList3 = new ArrayList();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        d7.j jVar = new d7.j();
        eVar.f();
        float fK = BitmapDescriptorFactory.HUE_RED;
        int iK = 0;
        int iK2 = 0;
        float fK2 = BitmapDescriptorFactory.HUE_RED;
        float fK3 = BitmapDescriptorFactory.HUE_RED;
        while (eVar.i()) {
            float f36 = fC;
            switch (eVar.p(f233502a)) {
                case 0:
                    arrayList = arrayList4;
                    f = fK;
                    f4 = fK3;
                    iK = (int) eVar.k();
                    fC = f36;
                    fK = f;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
                case 1:
                    arrayList = arrayList4;
                    f = fK;
                    f4 = fK3;
                    iK2 = (int) eVar.k();
                    fC = f36;
                    fK = f;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
                case 2:
                    arrayList = arrayList4;
                    f = fK;
                    f4 = fK3;
                    fK2 = (float) eVar.k();
                    fC = f36;
                    fK = f;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
                case 3:
                    map5 = map5;
                    arrayList4 = arrayList4;
                    fK3 = ((float) eVar.k()) - 0.01f;
                    fC = f36;
                    break;
                case 4:
                    arrayList = arrayList4;
                    f4 = fK3;
                    fK = (float) eVar.k();
                    fC = f36;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
                case 5:
                    arrayList = arrayList4;
                    f = fK;
                    f5 = fK2;
                    f4 = fK3;
                    map = map5;
                    String[] strArrSplit = eVar.m().split("\\.");
                    int i = Integer.parseInt(strArrSplit[0]);
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    int i3 = Integer.parseInt(strArrSplit[2]);
                    if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                        jVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    map5 = map;
                    fC = f36;
                    fK2 = f5;
                    fK = f;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
                case 6:
                    arrayList = arrayList4;
                    f = fK;
                    f5 = fK2;
                    float f37 = fK3;
                    map = map5;
                    eVar.d();
                    int i5 = 0;
                    while (eVar.i()) {
                        n7.h hVarA = s.a(eVar, jVar);
                        if (hVarA.e == n7.f.IMAGE) {
                            i5++;
                        }
                        arrayList3.add(hVarA);
                        float f41 = f37;
                        longSparseArray.put(hVarA.d, hVarA);
                        if (i5 > 4) {
                            r7.c.b("You have " + i5 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        f37 = f41;
                    }
                    f4 = f37;
                    eVar.g();
                    map5 = map;
                    fC = f36;
                    fK2 = f5;
                    fK = f;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
                case 7:
                    f = fK;
                    f5 = fK2;
                    f6 = fK3;
                    eVar.d();
                    while (eVar.i()) {
                        ArrayList arrayList5 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray();
                        eVar.f();
                        int iL = 0;
                        int iL2 = 0;
                        String strM = null;
                        String strM2 = null;
                        String strM3 = null;
                        while (eVar.i()) {
                            int iP = eVar.p(f233503b);
                            if (iP != 0) {
                                if (iP == 1) {
                                    eVar.d();
                                    while (eVar.i()) {
                                        n7.h hVarA2 = s.a(eVar, jVar);
                                        longSparseArray2.put(hVarA2.d, hVarA2);
                                        arrayList5.add(hVarA2);
                                        map5 = map5;
                                        arrayList4 = arrayList4;
                                    }
                                    map2 = map5;
                                    arrayList2 = arrayList4;
                                    eVar.g();
                                } else if (iP == 2) {
                                    iL = eVar.l();
                                } else if (iP == 3) {
                                    iL2 = eVar.l();
                                } else if (iP == 4) {
                                    strM2 = eVar.m();
                                } else if (iP != 5) {
                                    eVar.q();
                                    eVar.r();
                                    map2 = map5;
                                    arrayList2 = arrayList4;
                                } else {
                                    strM3 = eVar.m();
                                }
                                map5 = map2;
                                arrayList4 = arrayList2;
                            } else {
                                strM = eVar.m();
                            }
                        }
                        HashMap map6 = map5;
                        ArrayList arrayList6 = arrayList4;
                        eVar.h();
                        if (strM2 != null) {
                            d7.c0 c0Var = new d7.c0(strM, iL, iL2, strM2, strM3);
                            map4.put(c0Var.e(), c0Var);
                        } else {
                            map3.put(strM, arrayList5);
                        }
                        map5 = map6;
                        arrayList4 = arrayList6;
                    }
                    map = map5;
                    arrayList = arrayList4;
                    eVar.g();
                    f4 = f6;
                    map5 = map;
                    fC = f36;
                    fK2 = f5;
                    fK = f;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
                case 8:
                    f = fK;
                    f5 = fK2;
                    f6 = fK3;
                    eVar.f();
                    while (eVar.i()) {
                        if (eVar.p(f233504c) != 0) {
                            eVar.q();
                            eVar.r();
                        } else {
                            eVar.d();
                            while (eVar.i()) {
                                k7.d dVarA = k.a(eVar);
                                map5.put(dVarA.b(), dVarA);
                            }
                            eVar.g();
                        }
                    }
                    eVar.h();
                    map = map5;
                    arrayList = arrayList4;
                    f4 = f6;
                    map5 = map;
                    fC = f36;
                    fK2 = f5;
                    fK = f;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
                case 9:
                    f = fK;
                    f5 = fK2;
                    f6 = fK3;
                    eVar.d();
                    while (eVar.i()) {
                        k7.e eVarA = j.a(eVar, jVar);
                        sparseArrayCompat.put(eVarA.hashCode(), eVarA);
                    }
                    eVar.g();
                    map = map5;
                    arrayList = arrayList4;
                    f4 = f6;
                    map5 = map;
                    fC = f36;
                    fK2 = f5;
                    fK = f;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
                case 10:
                    eVar.d();
                    while (eVar.i()) {
                        eVar.f();
                        String strM4 = null;
                        float fK4 = BitmapDescriptorFactory.HUE_RED;
                        float fK5 = BitmapDescriptorFactory.HUE_RED;
                        while (eVar.i()) {
                            int iP2 = eVar.p(d);
                            if (iP2 != 0) {
                                f32 = fK;
                                if (iP2 == 1) {
                                    f35 = fK2;
                                    fK3 = fK3;
                                    fK4 = (float) eVar.k();
                                } else if (iP2 != 2) {
                                    eVar.q();
                                    eVar.r();
                                } else {
                                    f35 = fK2;
                                    fK3 = fK3;
                                    fK5 = (float) eVar.k();
                                }
                                fK = f32;
                                fK2 = f35;
                            } else {
                                f32 = fK;
                                strM4 = eVar.m();
                            }
                            fK = f32;
                        }
                        eVar.h();
                        arrayList4.add(new k7.i(strM4, fK4, fK5));
                        fK3 = fK3;
                        fK2 = fK2;
                        fK = fK;
                    }
                    f = fK;
                    f5 = fK2;
                    f6 = fK3;
                    eVar.g();
                    map = map5;
                    arrayList = arrayList4;
                    f4 = f6;
                    map5 = map;
                    fC = f36;
                    fK2 = f5;
                    fK = f;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
                default:
                    eVar.q();
                    eVar.r();
                    arrayList = arrayList4;
                    f = fK;
                    f5 = fK2;
                    f4 = fK3;
                    map = map5;
                    map5 = map;
                    fC = f36;
                    fK2 = f5;
                    fK = f;
                    fK3 = f4;
                    arrayList4 = arrayList;
                    break;
            }
        }
        float f42 = fC;
        ArrayList arrayList7 = arrayList4;
        float f57 = fK3;
        HashMap map7 = map5;
        Rect rect = new Rect(0, 0, (int) (iK * f42), (int) (iK2 * f42));
        float fC2 = r7.l.c();
        jVar.k = rect;
        jVar.f111683l = fK2;
        jVar.f111684m = f57;
        jVar.f111685n = fK;
        jVar.f111682j = arrayList3;
        jVar.i = longSparseArray;
        jVar.f111679c = map3;
        jVar.d = map4;
        jVar.e = fC2;
        jVar.f111681h = sparseArrayCompat;
        jVar.f = map7;
        jVar.f111680g = arrayList7;
        jVar.f111686p = iK;
        jVar.f111687q = iK2;
        return jVar;
    }
}
