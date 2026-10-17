package p7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpi.g f233497a = cpi.g.G("k");

    public static ArrayList a(q7.d dVar, d7.j jVar, float f, g0 g0Var, boolean z) {
        q7.d dVar2;
        d7.j jVar2;
        float f4;
        g0 g0Var2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (dVar.n() == q7.c.STRING) {
            jVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        dVar.f();
        while (dVar.i()) {
            if (dVar.p(f233497a) != 0) {
                dVar.r();
            } else if (dVar.n() == q7.c.BEGIN_ARRAY) {
                dVar.d();
                if (dVar.n() == q7.c.NUMBER) {
                    q7.d dVar3 = dVar;
                    d7.j jVar3 = jVar;
                    float f5 = f;
                    g0 g0Var3 = g0Var;
                    boolean z4 = z;
                    s7.a aVarB = p.b(dVar3, jVar3, f5, g0Var3, false, z4);
                    dVar2 = dVar3;
                    jVar2 = jVar3;
                    f4 = f5;
                    g0Var2 = g0Var3;
                    z3 = z4;
                    arrayList.add(aVarB);
                } else {
                    dVar2 = dVar;
                    jVar2 = jVar;
                    f4 = f;
                    g0Var2 = g0Var;
                    z3 = z;
                    while (dVar2.i()) {
                        arrayList.add(p.b(dVar2, jVar2, f4, g0Var2, true, z3));
                    }
                }
                dVar2.g();
                dVar = dVar2;
                jVar = jVar2;
                f = f4;
                g0Var = g0Var2;
                z = z3;
            } else {
                q7.d dVar4 = dVar;
                arrayList.add(p.b(dVar4, jVar, f, g0Var, false, z));
                dVar = dVar4;
            }
        }
        dVar.h();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj2;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            s7.a aVar = (s7.a) arrayList.get(i2);
            i2++;
            s7.a aVar2 = (s7.a) arrayList.get(i2);
            aVar.f260485h = Float.valueOf(aVar2.f260484g);
            if (aVar.f260483c == null && (obj2 = aVar2.f260482b) != null) {
                aVar.f260483c = obj2;
                if (aVar instanceof g7.l) {
                    ((g7.l) aVar).d();
                }
            }
        }
        s7.a aVar3 = (s7.a) arrayList.get(i);
        if ((aVar3.f260482b == null || aVar3.f260483c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
