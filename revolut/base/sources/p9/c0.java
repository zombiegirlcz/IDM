package p9;

import com.fasterxml.jackson.databind.JavaType;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes16.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9.t f234194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jji.e f234195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JavaType f234196c;
    public final a d;
    public final l0 e;
    public final k9.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f234197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f234198h;
    public LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinkedList f234199j;
    public LinkedList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinkedList f234200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinkedList f234201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinkedList f234202n;
    public LinkedList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinkedList f234203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinkedHashMap f234204q;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(k9.t r12, com.fasterxml.jackson.databind.JavaType r13, p9.a r14, jji.e r15) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.c0.<init>(k9.t, com.fasterxml.jackson.databind.JavaType, p9.a, jji.e):void");
    }

    public final void a(LinkedHashMap linkedHashMap, j jVar) {
        g0 g0VarD;
        d9.j jVarD;
        k9.p pVar = this.f;
        pVar.getClass();
        k9.r rVarO = pVar.o(jVar);
        boolean z = (rVarO == null || rVarO.isEmpty()) ? false : true;
        k9.t tVar = this.f234194a;
        if (!z) {
            if ("".isEmpty() || (jVarD = pVar.d(tVar, jVar.d)) == null || jVarD == d9.j.DISABLED) {
                return;
            } else {
                rVarO = k9.r.a("");
            }
        }
        String strB = b("");
        if (z && strB.isEmpty()) {
            String str = rVarO.f182194a;
            g0VarD = (g0) linkedHashMap.get(str);
            if (g0VarD == null) {
                g0VarD = new g0(tVar, this.f, true, rVarO, rVarO);
                linkedHashMap.put(str, g0VarD);
            }
        } else {
            g0VarD = d(linkedHashMap, strB);
        }
        g0 g0Var = g0VarD;
        g0Var.f234218h = new e0(jVar, g0Var.f234218h, rVarO, z, true, false);
        this.f234199j.add(g0Var);
    }

    public final String b(String str) {
        return str;
    }

    public final void c(d9.b bVar, f fVar) {
        if (bVar == null) {
            return;
        }
        Object obj2 = bVar.f112301a;
        if (this.f234204q == null) {
            this.f234204q = new LinkedHashMap();
        }
        f fVar2 = (f) this.f234204q.put(obj2, fVar);
        if (fVar2 == null || fVar2.getClass() != fVar.getClass()) {
            return;
        }
        throw new IllegalArgumentException("Duplicate injectable value with id '" + obj2 + "' (of type " + obj2.getClass().getName() + ")");
    }

    public final g0 d(LinkedHashMap linkedHashMap, String str) {
        g0 g0Var = (g0) linkedHashMap.get(str);
        if (g0Var != null) {
            return g0Var;
        }
        k9.r rVarA = k9.r.a(str);
        g0 g0Var2 = new g0(this.f234194a, this.f, true, rVarA, rVarA);
        linkedHashMap.put(str, g0Var2);
        return g0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0458 A[PHI: r12
      0x0458: PHI (r12v13 d9.g0) = (r12v12 d9.g0), (r12v14 d9.g0) binds: [B:269:0x049b, B:245:0x0456] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 2207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.c0.e():void");
    }

    public final void f(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.d + ": " + str);
    }
}
