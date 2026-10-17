package p7;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.EOFException;
import java.util.ArrayList;
import le.u1;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpi.g f233499a = cpi.g.G("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cpi.g f233500b = cpi.g.G("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cpi.g f233501c = cpi.g.G("ty", "nm");

    public static n7.h a(q7.e eVar, d7.j jVar) throws EOFException, q7.b {
        Float f;
        boolean z;
        float f4;
        boolean z3;
        float f5;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Float fValueOf2 = Float.valueOf(1.0f);
        n7.g gVar = n7.g.NONE;
        m7.h hVar = m7.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        eVar.f();
        boolean z4 = false;
        n7.g gVar2 = gVar;
        m7.h hVar2 = hVar;
        float fK = 0.0f;
        float fK2 = 0.0f;
        float fK3 = 0.0f;
        float fK4 = 0.0f;
        float fK5 = 0.0f;
        String strM = null;
        l7.a aVar = null;
        cpi.g gVarA = null;
        l7.b bVarN = null;
        yf.c cVarA = null;
        com.google.firebase.messaging.u uVarA = null;
        long jL = 0;
        int iC = 0;
        int iC2 = 0;
        int color = 0;
        boolean zJ = false;
        long jL2 = -1;
        float fK6 = 1.0f;
        String strM2 = "UNSET";
        String strM3 = null;
        l7.f fVar = null;
        n7.f fVar2 = null;
        boolean z6 = false;
        while (eVar.i()) {
            switch (eVar.p(f233499a)) {
                case 0:
                    f4 = fK6;
                    strM2 = eVar.m();
                    fK6 = f4;
                    break;
                case 1:
                    f4 = fK6;
                    jL = eVar.l();
                    fK6 = f4;
                    break;
                case 2:
                    f4 = fK6;
                    strM = eVar.m();
                    fK6 = f4;
                    break;
                case 3:
                    f4 = fK6;
                    z3 = z4;
                    int iL = eVar.l();
                    fVar2 = n7.f.UNKNOWN;
                    if (iL < fVar2.ordinal()) {
                        fVar2 = n7.f.values()[iL];
                    }
                    z4 = z3;
                    fK6 = f4;
                    break;
                case 4:
                    f4 = fK6;
                    jL2 = eVar.l();
                    fK6 = f4;
                    break;
                case 5:
                    f4 = fK6;
                    iC = (int) (r7.l.c() * eVar.l());
                    fK6 = f4;
                    break;
                case 6:
                    f4 = fK6;
                    iC2 = (int) (r7.l.c() * eVar.l());
                    fK6 = f4;
                    break;
                case 7:
                    f4 = fK6;
                    color = Color.parseColor(eVar.m());
                    fK6 = f4;
                    break;
                case 8:
                    f4 = fK6;
                    fVar = c.c(eVar, jVar);
                    fK6 = f4;
                    break;
                case 9:
                    f4 = fK6;
                    z3 = z4;
                    int iL2 = eVar.l();
                    if (iL2 >= n7.g.values().length) {
                        jVar.a("Unsupported matte type: " + iL2);
                    } else {
                        gVar2 = n7.g.values()[iL2];
                        int i = r.f233498a[gVar2.ordinal()];
                        if (i == 1) {
                            jVar.a("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            jVar.a("Unsupported matte type: Luma Inverted");
                        }
                        jVar.o++;
                    }
                    z4 = z3;
                    fK6 = f4;
                    break;
                case 10:
                    f4 = fK6;
                    z3 = z4;
                    eVar.d();
                    while (eVar.i()) {
                        arrayList.add(edl.a.o(eVar, jVar));
                    }
                    jVar.o += arrayList.size();
                    eVar.g();
                    z4 = z3;
                    fK6 = f4;
                    break;
                case 11:
                    f4 = fK6;
                    z3 = z4;
                    eVar.d();
                    while (eVar.i()) {
                        m7.b bVarA = g.a(eVar, jVar);
                        if (bVarA != null) {
                            arrayList2.add(bVarA);
                        }
                    }
                    eVar.g();
                    z4 = z3;
                    fK6 = f4;
                    break;
                case 12:
                    f4 = fK6;
                    eVar.f();
                    while (eVar.i()) {
                        int iP = eVar.p(f233500b);
                        if (iP == 0) {
                            aVar = new l7.a(q.a(eVar, jVar, r7.l.c(), h.f233478a, false), 4);
                        } else if (iP != 1) {
                            eVar.q();
                            eVar.r();
                        } else {
                            eVar.d();
                            if (eVar.i()) {
                                gVarA = b.a(eVar, jVar);
                            }
                            while (eVar.i()) {
                                eVar.r();
                            }
                            eVar.g();
                        }
                    }
                    z3 = false;
                    eVar.h();
                    z4 = z3;
                    fK6 = f4;
                    break;
                case 13:
                    f5 = fK6;
                    eVar.d();
                    ArrayList arrayList3 = new ArrayList();
                    while (eVar.i()) {
                        eVar.f();
                        while (eVar.i()) {
                            int iP2 = eVar.p(f233501c);
                            if (iP2 == 0) {
                                int iL3 = eVar.l();
                                if (iL3 == 29) {
                                    cVarA = d.a(eVar, jVar);
                                } else if (iL3 == 25) {
                                    uVarA = new i().a(eVar, jVar);
                                }
                            } else if (iP2 != 1) {
                                eVar.q();
                                eVar.r();
                            } else {
                                arrayList3.add(eVar.m());
                            }
                        }
                        eVar.h();
                    }
                    eVar.g();
                    jVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fK6 = f5;
                    z4 = false;
                    break;
                case 14:
                    fK6 = (float) eVar.k();
                    z4 = false;
                    break;
                case 15:
                    fK5 = (float) eVar.k();
                    z4 = false;
                    break;
                case 16:
                    f5 = fK6;
                    fK3 = (float) (eVar.k() * ((double) r7.l.c()));
                    fK6 = f5;
                    z4 = false;
                    break;
                case 17:
                    f5 = fK6;
                    fK4 = (float) (eVar.k() * ((double) r7.l.c()));
                    fK6 = f5;
                    z4 = false;
                    break;
                case 18:
                    fK = (float) eVar.k();
                    break;
                case 19:
                    fK2 = (float) eVar.k();
                    break;
                case 20:
                    bVarN = u1.n(eVar, jVar, z4);
                    break;
                case 21:
                    strM3 = eVar.m();
                    break;
                case 22:
                    zJ = eVar.j();
                    break;
                case 23:
                    z6 = eVar.l() != 1 ? z4 : true;
                    break;
                case 24:
                    int iL4 = eVar.l();
                    if (iL4 < m7.h.values().length) {
                        hVar2 = m7.h.values()[iL4];
                    } else {
                        jVar.a("Unsupported Blend Mode: " + iL4);
                        hVar2 = m7.h.NORMAL;
                    }
                    break;
                default:
                    eVar.q();
                    eVar.r();
                    f4 = fK6;
                    z3 = z4;
                    z4 = z3;
                    fK6 = f4;
                    break;
            }
        }
        float f6 = fK6;
        eVar.h();
        ArrayList arrayList4 = new ArrayList();
        if (fK > BitmapDescriptorFactory.HUE_RED) {
            z = z6;
            f = fValueOf;
            arrayList4.add(new s7.a(jVar, fValueOf, fValueOf, (Interpolator) null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(fK)));
        } else {
            f = fValueOf;
            z = z6;
        }
        if (fK2 <= BitmapDescriptorFactory.HUE_RED) {
            fK2 = jVar.f111684m;
        }
        arrayList4.add(new s7.a(jVar, fValueOf2, fValueOf2, (Interpolator) null, fK, Float.valueOf(fK2)));
        arrayList4.add(new s7.a(jVar, f, f, (Interpolator) null, fK2, Float.valueOf(Float.MAX_VALUE)));
        if (strM2.endsWith(".ai") || "ai".equals(strM3)) {
            jVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            if (fVar == null) {
                fVar = new l7.f();
            }
            fVar.f192427m = z;
        }
        return new n7.h(arrayList2, jVar, strM2, jL, fVar2, jL2, strM, arrayList, fVar, iC, iC2, color, f6, fK5, fK3, fK4, aVar, gVarA, arrayList4, gVar2, bVarN, zJ, cVarA, uVarA, hVar2);
    }
}
