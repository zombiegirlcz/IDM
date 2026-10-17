package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t extends kg.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205122a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f205123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kg.l0 f205124c;
    public final Object d;

    public t(kg.o oVar, kg.l0 l0Var, Type type) {
        this.f205123b = oVar;
        this.f205124c = l0Var;
        this.d = type;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        switch (this.f205122a) {
            case 0:
                qg.b bVarA = aVar.A();
                if (bVarA == qg.b.NULL) {
                    aVar.w();
                    return null;
                }
                Map map = (Map) ((com.google.gson.internal.r) this.d).construct();
                if (bVarA == qg.b.BEGIN_ARRAY) {
                    aVar.d();
                    while (aVar.n()) {
                        aVar.d();
                        Object objC = ((t) this.f205123b).f205124c.c(aVar);
                        if (map.put(objC, ((t) this.f205124c).f205124c.c(aVar)) != null) {
                            throw new JsonSyntaxException(a0.d.m(objC, "duplicate key: "));
                        }
                        aVar.i();
                    }
                    aVar.i();
                } else {
                    aVar.f();
                    while (aVar.n()) {
                        af.f.f3814b.getClass();
                        if (aVar instanceof q) {
                            q qVar = (q) aVar;
                            qVar.L(qg.b.NAME);
                            Map.Entry entry = (Map.Entry) ((Iterator) qVar.P()).next();
                            qVar.R(entry.getValue());
                            qVar.R(new kg.x((String) entry.getKey()));
                        } else {
                            int iH = aVar.f245603h;
                            if (iH == 0) {
                                iH = aVar.h();
                            }
                            if (iH == 13) {
                                aVar.f245603h = 9;
                            } else if (iH == 12) {
                                aVar.f245603h = 8;
                            } else {
                                if (iH != 14) {
                                    throw aVar.K("a name");
                                }
                                aVar.f245603h = 10;
                            }
                        }
                        Object objC2 = ((t) this.f205123b).f205124c.c(aVar);
                        if (map.put(objC2, ((t) this.f205124c).f205124c.c(aVar)) != null) {
                            throw new JsonSyntaxException(a0.d.m(objC2, "duplicate key: "));
                        }
                    }
                    aVar.j();
                }
                return map;
            default:
                return this.f205124c.c(aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    @Override // kg.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(qg.c r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f205122a
            switch(r0) {
                case 0: goto L49;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L18
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L13
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L18
        L13:
            java.lang.Class r1 = r6.getClass()
            goto L19
        L18:
            r1 = r0
        L19:
            kg.l0 r2 = r4.f205124c
            if (r1 == r0) goto L45
            java.lang.Object r0 = r4.f205123b
            kg.o r0 = (kg.o) r0
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            kg.l0 r0 = r0.g(r1)
            boolean r1 = r0 instanceof mg.a0
            if (r1 != 0) goto L2e
            goto L44
        L2e:
            r1 = r2
        L2f:
            boolean r3 = r1 instanceof mg.g0
            if (r3 == 0) goto L3f
            r3 = r1
            mg.g0 r3 = (mg.g0) r3
            kg.l0 r3 = r3.e()
            if (r3 != r1) goto L3d
            goto L3f
        L3d:
            r1 = r3
            goto L2f
        L3f:
            boolean r1 = r1 instanceof mg.a0
            if (r1 != 0) goto L44
            goto L45
        L44:
            r2 = r0
        L45:
            r2.d(r5, r6)
            return
        L49:
            java.util.Map r6 = (java.util.Map) r6
            kg.l0 r0 = r4.f205124c
            mg.t r0 = (mg.t) r0
            if (r6 != 0) goto L55
            r5.m()
            goto L82
        L55:
            r5.g()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.k(r2)
            java.lang.Object r1 = r1.getValue()
            r0.d(r5, r1)
            goto L60
        L7f:
            r5.j()
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.t.d(qg.c, java.lang.Object):void");
    }

    public t(d dVar, t tVar, t tVar2, com.google.gson.internal.r rVar) {
        this.f205123b = tVar;
        this.f205124c = tVar2;
        this.d = rVar;
    }
}
