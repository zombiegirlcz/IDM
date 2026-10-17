package p7;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f233473b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f233474c = new f(1);
    public static final f d = new f(2);
    public static final f e = new f(3);
    public static final f f = new f(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233475a;

    public /* synthetic */ f(int i) {
        this.f233475a = i;
    }

    @Override // p7.g0
    public final Object a(q7.d dVar, float f4) {
        switch (this.f233475a) {
            case 0:
                boolean z = dVar.n() == q7.c.BEGIN_ARRAY;
                if (z) {
                    dVar.d();
                }
                double dK = dVar.k();
                double dK2 = dVar.k();
                double dK3 = dVar.k();
                double dK4 = dVar.n() == q7.c.NUMBER ? dVar.k() : 1.0d;
                if (z) {
                    dVar.g();
                }
                if (dK <= 1.0d && dK2 <= 1.0d && dK3 <= 1.0d) {
                    dK *= 255.0d;
                    dK2 *= 255.0d;
                    dK3 *= 255.0d;
                    if (dK4 <= 1.0d) {
                        dK4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dK4, (int) dK, (int) dK2, (int) dK3));
            case 1:
                return Float.valueOf(o.d(dVar) * f4);
            case 2:
                return Integer.valueOf(Math.round(o.d(dVar) * f4));
            case 3:
                return o.b(dVar, f4);
            default:
                boolean z3 = dVar.n() == q7.c.BEGIN_ARRAY;
                if (z3) {
                    dVar.d();
                }
                float fK = (float) dVar.k();
                float fK2 = (float) dVar.k();
                while (dVar.i()) {
                    dVar.r();
                }
                if (z3) {
                    dVar.g();
                }
                return new s7.d((fK / 100.0f) * f4, (fK2 / 100.0f) * f4);
        }
    }
}
