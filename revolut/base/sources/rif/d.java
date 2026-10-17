package rif;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import hx7.q;
import io3.l;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import le.u1;
import nif.a2;
import nif.a3;
import nif.b0;
import nif.b3;
import nif.b4;
import nif.c0;
import nif.c1;
import nif.e0;
import nif.e3;
import nif.f3;
import nif.h;
import nif.h3;
import nif.i;
import nif.k1;
import nif.k3;
import nif.l0;
import nif.n1;
import nif.n2;
import nif.n3;
import nif.n4;
import nif.o;
import nif.o0;
import nif.o1;
import nif.p1;
import nif.q2;
import nif.r0;
import nif.r1;
import nif.r3;
import nif.s1;
import nif.s3;
import nif.t1;
import nif.u2;
import nif.v0;
import nif.v3;
import nif.w1;
import nif.w3;
import nif.x2;
import nif.y2;
import nif.z;
import nif.z0;
import nif.z1;
import nif.z2;
import nif.z3;
import org.joda.time.DateTime;
import tof.b1;
import tof.d1;
import tof.d5;
import tof.e1;
import tof.f1;
import tof.f5;
import tof.g0;
import tof.g1;
import tof.g5;
import tof.h0;
import tof.i0;
import tof.i2;
import tof.i5;
import tof.ic;
import tof.j0;
import tof.j1;
import tof.j2;
import tof.j5;
import tof.jc;
import tof.k;
import tof.k0;
import tof.k6;
import tof.l6;
import tof.m;
import tof.m1;
import tof.m3;
import tof.m6;
import tof.n;
import tof.n6;
import tof.o6;
import tof.p3;
import tof.q1;
import tof.q3;
import tof.r4;
import tof.s;
import tof.s0;
import tof.s4;
import tof.s5;
import tof.t5;
import tof.u;
import tof.u0;
import tof.u5;
import tof.w0;
import tof.w5;
import tof.x;
import tof.x0;
import tof.y;
import tof.y6;
import tof.z6;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f254582a;

    public d(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f254582a = featureToggleInteractor;
    }

    public static b1 B(c1 c1Var) {
        return new b1(c1Var.a());
    }

    public static m1 C(p1 p1Var) {
        Long lB = p1Var.b();
        u0 u0Var = null;
        DateTime dateTime = lB != null ? new DateTime(lB.longValue()) : null;
        String strA = p1Var.a();
        if (strA != null) {
            u0[] u0VarArrValues = u0.values();
            int length = u0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                u0 u0Var2 = u0VarArrValues[i];
                if (a0.z(u0Var2.name(), strA, true)) {
                    u0Var = u0Var2;
                    break;
                }
                i++;
            }
        }
        return new m1(dateTime, u0Var);
    }

    public static q1 D(s1 s1Var) {
        String strB = s1Var.b();
        if (strB != null) {
            return new q1(strB, s1Var.c(), s1Var.a());
        }
        return null;
    }

    public static tof.s1 E(t1 t1Var) {
        String strA = t1Var.a();
        String strB = t1Var.b();
        tof.t1 t1Var2 = null;
        if (strB != null) {
            tof.t1[] t1VarArrValues = tof.t1.values();
            int length = t1VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                tof.t1 t1Var3 = t1VarArrValues[i];
                if (a0.z(t1Var3.name(), strB, true)) {
                    t1Var2 = t1Var3;
                    break;
                }
                i++;
            }
        }
        return new tof.s1(strA, t1Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public static m3 F(z2 z2Var) {
        z3l.a aVar;
        List listA;
        ?? arrayList;
        List listA2;
        y2 y2VarB = z2Var.b();
        s0 s0Var = null;
        arrayList = 0;
        ?? arrayList2 = 0;
        if (y2VarB != null) {
            x2 x2VarA = y2VarB.a();
            if (x2VarA == null || (listA2 = x2VarA.a()) == null) {
                arrayList = f0.f322471a;
            } else {
                List<u2> list = listA2;
                arrayList = new ArrayList(w.t(list, 10));
                for (u2 u2Var : list) {
                    arrayList.add(new z3l.b(u2Var.e(), u2Var.d(), u2Var.c(), u2Var.b(), u2Var.a()));
                }
            }
            aVar = new z3l.a(arrayList, hx7.a.v(y2VarB.b()));
        } else {
            aVar = null;
        }
        v0 v0VarA = z2Var.a();
        if (v0VarA != null) {
            nif.u0 u0VarA = v0VarA.a();
            if (u0VarA != null && (listA = u0VarA.a()) != null) {
                List<r0> list2 = listA;
                arrayList2 = new ArrayList(w.t(list2, 10));
                for (r0 r0Var : list2) {
                    arrayList2.add(new tof.r0(r0Var.e(), r0Var.d(), r0Var.c(), r0Var.b(), r0Var.a()));
                }
            }
            if (arrayList2 == 0) {
                arrayList2 = f0.f322471a;
            }
            s0Var = new s0(arrayList2, hx7.a.v(v0VarA.b()));
        }
        return new m3(aVar, s0Var, 1);
    }

    public static r4 G(e3 e3Var) {
        return new r4(e3Var.b(), new s4(e3Var.a().a(), e3Var.a().b()));
    }

    public static t5 H(n1 n1Var) {
        String strA = n1Var.a();
        o1 o1VarB = n1Var.b();
        return new t5(strA, o1VarB != null ? new u5(o1VarB.b(), o1VarB.c(), o1VarB.a()) : null);
    }

    public static k6 I(s3 s3Var) {
        n6 n6Var;
        String strB = s3Var.b();
        r3 r3VarA = s3Var.a();
        l6 l6Var = new l6(r3VarA.a(), r3VarA.b());
        w3 w3VarD = s3Var.d();
        m6 m6Var = null;
        if (w3VarD != null) {
            r3 r3VarA2 = w3VarD.a();
            l6 l6Var2 = new l6(r3VarA2.a(), r3VarA2.b());
            r3 r3VarB = w3VarD.b();
            n6Var = new n6(l6Var2, new l6(r3VarB.a(), r3VarB.b()));
        } else {
            n6Var = null;
        }
        v3 v3VarC = s3Var.c();
        if (v3VarC != null) {
            long jA = v3VarC.a().a();
            xi0.a aVar = xi0.b.Companion;
            String strB2 = v3VarC.a().b();
            aVar.getClass();
            dj0.d dVar = new dj0.d(jA, xi0.a.a(strB2));
            List<z3> listB = v3VarC.b();
            ArrayList arrayList = new ArrayList(w.t(listB, 10));
            for (z3 z3Var : listB) {
                String strA = z3Var.a();
                long jA2 = z3Var.b().a();
                xi0.a aVar2 = xi0.b.Companion;
                String strB3 = z3Var.b().b();
                aVar2.getClass();
                arrayList.add(new o6(new dj0.d(jA2, xi0.a.a(strB3)), strA));
            }
            m6Var = new m6(dVar, arrayList);
        }
        return new k6(strB, l6Var, n6Var, m6Var);
    }

    public static jc J(n4 n4Var) {
        return new jc(n4Var.b(), (ic) u1.t(n4Var.a(), ic.UNKNOWN, r11.a.s()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static uof.a K(nif.c r11) {
        /*
            java.lang.Long r0 = r11.a()
            r1 = 0
            if (r0 == 0) goto L20
            long r2 = r0.longValue()
            java.lang.String r0 = r11.b()
            if (r0 == 0) goto L20
            dj0.d r4 = new dj0.d
            xi0.a r5 = xi0.b.Companion
            r5.getClass()
            xi0.b r0 = xi0.a.a(r0)
            r4.<init>(r2, r0)
            goto L21
        L20:
            r4 = r1
        L21:
            nif.d r11 = r11.d()
            if (r11 == 0) goto L99
            java.lang.String r0 = r11.c()
            if (r0 == 0) goto L46
            uof.c[] r2 = uof.c.values()
            int r3 = r2.length
            r5 = 0
        L33:
            if (r5 >= r3) goto L46
            r6 = r2[r5]
            java.lang.String r7 = r6.name()
            r8 = 1
            boolean r7 = kotlin.text.a0.z(r7, r0, r8)
            if (r7 == 0) goto L43
            goto L47
        L43:
            int r5 = r5 + 1
            goto L33
        L46:
            r6 = r1
        L47:
            nif.e r0 = r11.b()
            if (r0 == 0) goto L6d
            uof.d r2 = new uof.d
            double r7 = r0.c()
            dj0.d r3 = new dj0.d
            long r9 = r0.a()
            xi0.a r5 = xi0.b.Companion
            java.lang.String r0 = r0.b()
            r5.getClass()
            xi0.b r0 = xi0.a.a(r0)
            r3.<init>(r9, r0)
            r2.<init>(r7, r3)
            goto L6e
        L6d:
            r2 = r1
        L6e:
            nif.e r11 = r11.a()
            if (r11 == 0) goto L93
            uof.d r1 = new uof.d
            double r7 = r11.c()
            dj0.d r0 = new dj0.d
            long r9 = r11.a()
            xi0.a r3 = xi0.b.Companion
            java.lang.String r11 = r11.b()
            r3.getClass()
            xi0.b r11 = xi0.a.a(r11)
            r0.<init>(r9, r11)
            r1.<init>(r7, r0)
        L93:
            uof.b r11 = new uof.b
            r11.<init>(r6, r2, r1)
            r1 = r11
        L99:
            uof.a r11 = new uof.a
            r11.<init>(r4, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rif.d.K(nif.c):uof.a");
    }

    public static dj0.d a(f3 f3Var, long j2) {
        xi0.a aVar = xi0.b.Companion;
        String strE = f3Var.E();
        aVar.getClass();
        return new dj0.d(j2, xi0.a.a(strE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [tof.d3] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [tof.d3] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v4 */
    /* JADX WARN: Type inference failed for: r39v5 */
    /* JADX WARN: Type inference failed for: r39v6 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1 */
    /* JADX WARN: Type inference failed for: r40v10 */
    /* JADX WARN: Type inference failed for: r40v11 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r40v4 */
    /* JADX WARN: Type inference failed for: r40v5 */
    /* JADX WARN: Type inference failed for: r40v6 */
    /* JADX WARN: Type inference failed for: r40v7 */
    /* JADX WARN: Type inference failed for: r40v8 */
    /* JADX WARN: Type inference failed for: r40v9 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v10 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tof.h3 b(nif.n2 r43) {
        /*
            Method dump skipped, instruction units count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rif.d.b(nif.n2):tof.h3");
    }

    public static s c(f3 f3Var) {
        o oVarX = f3Var.x();
        if (oVarX == null) {
            return null;
        }
        String strE = oVarX.e();
        if (strE != null) {
            return new s(strE, oVarX.b(), oVarX.c(), oVarX.a(), oVarX.d());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static p3 d(n2 n2Var, CryptoAddressCounterparty cryptoAddressCounterparty) {
        xi0.b bVarA;
        wk5.a aVar;
        String strA;
        z zVarC = n2Var.c();
        yk5.e eVar = null;
        if (zVarC == null) {
            return null;
        }
        String strG = zVarC.g();
        a3 a3VarC = zVarC.c();
        Double dB = a3VarC != null ? a3VarC.b() : null;
        a3 a3VarC2 = zVarC.c();
        if (a3VarC2 == null || (strA = a3VarC2.a()) == null) {
            bVarA = null;
        } else {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(strA);
        }
        q3 q3Var = new q3(dB, bVarA);
        Boolean boolA = zVarC.a();
        String strB = zVarC.b();
        int i = 0;
        if (strB != null) {
            wk5.a[] aVarArrValues = wk5.a.values();
            int length = aVarArrValues.length;
            for (int i2 = 0; i2 < length; i2++) {
                aVar = aVarArrValues[i2];
                if (a0.z(aVar.name(), strB, true)) {
                    break;
                }
            }
            aVar = null;
        } else {
            aVar = null;
        }
        String strF = zVarC.f();
        if (strF != null) {
            yk5.e[] eVarArrValues = yk5.e.values();
            int length2 = eVarArrValues.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                yk5.e eVar2 = eVarArrValues[i];
                if (a0.z(eVar2.name(), strF, true)) {
                    eVar = eVar2;
                    break;
                }
                i++;
            }
        }
        return new p3(strG, q3Var, boolA, aVar, eVar, cryptoAddressCounterparty, zVarC.e());
    }

    public static tof.r3 e(f3 f3Var) {
        xi0.b bVarA;
        tof.f0 f0Var;
        String strD;
        String strC;
        b3 b3VarB;
        String strA;
        b3 b3VarB2;
        nif.a0 a0VarD = f3Var.D();
        g0 g0Var = null;
        String strA2 = a0VarD != null ? a0VarD.a() : null;
        nif.a0 a0VarD2 = f3Var.D();
        String strE = a0VarD2 != null ? a0VarD2.e() : null;
        nif.a0 a0VarD3 = f3Var.D();
        Double dB = (a0VarD3 == null || (b3VarB2 = a0VarD3.b()) == null) ? null : b3VarB2.b();
        nif.a0 a0VarD4 = f3Var.D();
        if (a0VarD4 == null || (b3VarB = a0VarD4.b()) == null || (strA = b3VarB.a()) == null) {
            bVarA = null;
        } else {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(strA);
        }
        tof.s3 s3Var = new tof.s3(dB, bVarA);
        nif.a0 a0VarD5 = f3Var.D();
        int i = 0;
        if (a0VarD5 == null || (strC = a0VarD5.c()) == null) {
            f0Var = null;
        } else {
            tof.f0[] f0VarArrValues = tof.f0.values();
            int length = f0VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    f0Var = null;
                    break;
                }
                f0Var = f0VarArrValues[i2];
                if (a0.z(f0Var.name(), strC, true)) {
                    break;
                }
                i2++;
            }
            if (f0Var == null) {
                f0Var = tof.f0.UNKNOWN;
            }
        }
        nif.a0 a0VarD6 = f3Var.D();
        if (a0VarD6 != null && (strD = a0VarD6.d()) != null) {
            g0[] g0VarArrValues = g0.values();
            int length2 = g0VarArrValues.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                g0 g0Var2 = g0VarArrValues[i];
                if (a0.z(g0Var2.name(), strD, true)) {
                    g0Var = g0Var2;
                    break;
                }
                i++;
            }
        }
        return new tof.r3(strA2, strE, s3Var, f0Var, g0Var);
    }

    public static i2 f(n2 n2Var) {
        o0 o0VarB;
        w1 w1VarC;
        long j2;
        j2 j2Var;
        l0 l0VarE = n2Var.e();
        if (l0VarE == null || (o0VarB = l0VarE.b()) == null || (w1VarC = o0VarB.c()) == null) {
            return null;
        }
        long jJ0 = n2Var.h().j0();
        Long lB = w1VarC.b();
        long jLongValue = jJ0 - (lB != null ? lB.longValue() : 0L);
        Long lE = w1VarC.e();
        long jLongValue2 = jLongValue - (lE != null ? lE.longValue() : 0L);
        Long lH = w1VarC.h();
        long jLongValue3 = jLongValue2 - (lH != null ? lH.longValue() : 0L);
        Long lC = w1VarC.c();
        long jLongValue4 = jLongValue3 - (lC != null ? lC.longValue() : 0L);
        z1 z1VarD = w1VarC.d();
        long jA = jLongValue4 - (z1VarD != null ? z1VarD.a() : 0L);
        z1 z1VarF = w1VarC.f();
        long jA2 = jA - (z1VarF != null ? z1VarF.a() : 0L);
        z1 z1VarG = w1VarC.g();
        long jA3 = jA2 - (z1VarG != null ? z1VarG.a() : 0L);
        Long lA = w1VarC.a();
        long jLongValue5 = jA3 - (lA != null ? lA.longValue() : 0L);
        xi0.a aVar = xi0.b.Companion;
        String strE = n2Var.h().E();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(strE);
        Long lE2 = w1VarC.e();
        dj0.d dVar = lE2 != null ? new dj0.d(lE2.longValue(), bVarA) : null;
        Long lB2 = w1VarC.b();
        dj0.d dVar2 = lB2 != null ? new dj0.d(lB2.longValue(), bVarA) : null;
        Long lH2 = w1VarC.h();
        dj0.d dVar3 = lH2 != null ? new dj0.d(lH2.longValue(), bVarA) : null;
        Long lC2 = w1VarC.c();
        dj0.d dVar4 = lC2 != null ? new dj0.d(lC2.longValue(), bVarA) : null;
        z1 z1VarD2 = w1VarC.d();
        if (z1VarD2 != null) {
            j2 = 0;
            j2Var = new j2(new dj0.d(z1VarD2.a(), bVarA), z1VarD2.b());
        } else {
            j2 = 0;
            j2Var = null;
        }
        z1 z1VarF2 = w1VarC.f();
        j2 j2Var2 = z1VarF2 != null ? new j2(new dj0.d(z1VarF2.a(), bVarA), z1VarF2.b()) : null;
        z1 z1VarG2 = w1VarC.g();
        j2 j2Var3 = z1VarG2 != null ? new j2(new dj0.d(z1VarG2.a(), bVarA), z1VarG2.b()) : null;
        Long lA2 = w1VarC.a();
        return new i2(dVar, dVar2, dVar3, dVar4, j2Var2, j2Var3, j2Var, lA2 != null ? new dj0.d(lA2.longValue(), bVarA) : null, jLongValue5 != j2 ? new dj0.d(jLongValue5, bVarA) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tof.a5 g(nif.f3 r10) {
        /*
            nif.g3 r10 = r10.Q()
            r0 = 0
            if (r10 == 0) goto L61
            java.lang.String r1 = r10.c()
            if (r1 != 0) goto Le
            goto L61
        Le:
            java.lang.String r2 = r10.d()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            tof.c5[] r5 = tof.c5.values()
            int r6 = r5.length
            r7 = r3
        L1c:
            if (r7 >= r6) goto L2e
            r8 = r5[r7]
            java.lang.String r9 = r8.name()
            boolean r9 = kotlin.text.a0.z(r9, r2, r4)
            if (r9 == 0) goto L2b
            goto L2f
        L2b:
            int r7 = r7 + 1
            goto L1c
        L2e:
            r8 = r0
        L2f:
            if (r8 == 0) goto L32
            goto L34
        L32:
            tof.c5 r8 = tof.c5.UNKNOWN
        L34:
            java.lang.String r2 = r10.a()
            if (r2 == 0) goto L55
            tof.b5[] r5 = tof.b5.values()
            int r6 = r5.length
        L3f:
            if (r3 >= r6) goto L52
            r7 = r5[r3]
            java.lang.String r9 = r7.name()
            boolean r9 = kotlin.text.a0.z(r9, r2, r4)
            if (r9 == 0) goto L4f
            r0 = r7
            goto L52
        L4f:
            int r3 = r3 + 1
            goto L3f
        L52:
            if (r0 == 0) goto L55
            goto L57
        L55:
            tof.b5 r0 = tof.b5.UNKNOWN
        L57:
            java.lang.String r10 = r10.b()
            tof.a5 r2 = new tof.a5
            r2.<init>(r1, r10, r8, r0)
            return r2
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rif.d.g(nif.f3):tof.a5");
    }

    public static x0 h(f3 f3Var) {
        z0 z0VarU = f3Var.U();
        if (z0VarU == null) {
            return null;
        }
        return new x0(z0VarU.b(), z0VarU.c(), z0VarU.e(), z0VarU.d(), z0VarU.a());
    }

    public static f5 i(f3 f3Var) {
        g5 g5Var;
        nif.b1 b1VarX = f3Var.X();
        tof.n1 n1Var = null;
        if (b1VarX == null) {
            return null;
        }
        String strA = b1VarX.a();
        String strC = b1VarX.c();
        if (strC != null) {
            g5[] g5VarArrValues = g5.values();
            int length = g5VarArrValues.length;
            for (int i = 0; i < length; i++) {
                g5Var = g5VarArrValues[i];
                if (a0.z(g5Var.name(), strC, true)) {
                    break;
                }
            }
            g5Var = null;
        } else {
            g5Var = null;
        }
        nif.q1 q1VarB = b1VarX.b();
        if (q1VarB != null) {
            String strA2 = q1VarB.a();
            tof.p1 p1Var = (tof.p1) u1.u(q1VarB.c(), r11.a.i());
            r1 r1VarB = q1VarB.b();
            n1Var = new tof.n1(strA2, p1Var, new tof.o1(r1VarB.a(), r1VarB.b()));
        }
        return new f5(strA, g5Var, n1Var);
    }

    public static e1 j(nif.e1 e1Var) {
        d1 d1Var;
        b95.a aVar;
        b95.a aVar2;
        d1 d1Var2;
        if (e1Var == null) {
            return null;
        }
        String strY = e1Var.y();
        int i = 0;
        if (strY != null) {
            d1[] d1VarArrValues = d1.values();
            int length = d1VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    d1Var2 = null;
                    break;
                }
                d1Var2 = d1VarArrValues[i2];
                if (a0.z(d1Var2.name(), strY, true)) {
                    break;
                }
                i2++;
            }
            d1Var = d1Var2;
        } else {
            d1Var = null;
        }
        String strX = e1Var.x();
        f1 f1Var = strX != null ? (f1) u1.v(strX, r11.a.j()) : null;
        String strR = e1Var.r();
        if (strR != null) {
            b95.a[] aVarArrValues = b95.a.values();
            int length2 = aVarArrValues.length;
            while (true) {
                if (i >= length2) {
                    aVar2 = null;
                    break;
                }
                aVar2 = aVarArrValues[i];
                if (a0.z(aVar2.name(), strR, true)) {
                    break;
                }
                i++;
            }
            aVar = aVar2;
        } else {
            aVar = null;
        }
        String strE = e1Var.e();
        String strF = e1Var.f();
        String str = (strF == null || d0.W(strF)) ? null : strF;
        Long lU = e1Var.u();
        Long lT = e1Var.t();
        Long lS = e1Var.s();
        Long lV = e1Var.v();
        Long lN = e1Var.n();
        Long lM = e1Var.m();
        Long l2 = e1Var.l();
        Long lO = e1Var.o();
        Long lI = e1Var.i();
        Long lH = e1Var.h();
        Long lG = e1Var.g();
        Long lJ = e1Var.j();
        Long lW = e1Var.w();
        Long lK = e1Var.k();
        Long lP = e1Var.p();
        Long lQ = e1Var.q();
        String strB = e1Var.b();
        String strA = e1Var.a();
        String strC = e1Var.c();
        q2 q2VarZ = e1Var.z();
        return new e1(d1Var, f1Var, strE, str, lU, lT, lS, lV, lI, lH, lG, lJ, lN, lM, l2, lO, lQ, lW, lK, lP, strB, strA, strC, q2VarZ != null ? new g1(q2VarZ.a(), q2VarZ.c(), q2VarZ.b(), q2VarZ.d()) : null, aVar);
    }

    public static i5 k(f3 f3Var, zm3.f fVar) {
        String strB;
        ArrayList arrayList;
        k3 k3VarZ = f3Var.Z();
        ArrayList arrayList2 = null;
        if (k3VarZ != null) {
            List listK = v.k("transaction.description.internal.transfer.from.sender", "transaction.description.internal.transfer.to.recipient", "transaction.description.internal.transfer.money.request.from.recipient.declined", "transaction.description.internal.transfer.money.request.to.sender.declined", "transaction.description.generic.name");
            if (fVar != null) {
                if (((d0.W(q.x(fVar)) || !zhm.d0.T(listK, k3VarZ.b())) ? null : fVar) != null) {
                    List listC = k3VarZ.c();
                    if (listC != null) {
                        n3 n3Var = new n3("name", q.x(fVar));
                        List list = listC;
                        arrayList = new ArrayList(w.t(list, 10));
                        for (Object obj2 : list) {
                            if (Intrinsics.f(((n3) obj2).a(), "name")) {
                                obj2 = n3Var;
                            }
                            arrayList.add(obj2);
                        }
                    } else {
                        arrayList = null;
                    }
                    k3VarZ = k3.a(k3VarZ, arrayList);
                }
            }
        } else {
            k3VarZ = null;
        }
        if (k3VarZ == null || (strB = k3VarZ.b()) == null) {
            return null;
        }
        List listC2 = k3VarZ.c();
        if (listC2 != null) {
            arrayList2 = new ArrayList();
            Iterator it8 = listC2.iterator();
            while (it8.hasNext()) {
                String strB2 = ((n3) it8.next()).b();
                if (strB2 != null) {
                    arrayList2.add(strB2);
                }
            }
        }
        return new i5(strB, arrayList2);
    }

    public static j5 l(k1 k1Var, String str) {
        j1 j1Var;
        String str2;
        s5 s5Var;
        String str3;
        String str4;
        co3.a aVar;
        String strS;
        s5 s5Var2;
        String strJ = k1Var != null ? k1Var.j() : null;
        String strP = k1Var != null ? k1Var.p() : null;
        String strD = k1Var != null ? k1Var.d() : null;
        String strQ = k1Var != null ? k1Var.q() : null;
        String strO = k1Var != null ? k1Var.o() : null;
        String strG = k1Var != null ? k1Var.g() : null;
        String strH = k1Var != null ? k1Var.h() : null;
        String strI = k1Var != null ? k1Var.i() : null;
        String strA = k1Var != null ? k1Var.a() : null;
        String strT = k1Var != null ? k1Var.t() : null;
        String strR = k1Var != null ? k1Var.r() : null;
        String strN = k1Var != null ? k1Var.n() : null;
        String strB = k1Var != null ? k1Var.b() : null;
        Boolean boolF = k1Var != null ? k1Var.f() : null;
        if (str != null) {
            j1[] j1VarArrValues = j1.values();
            int length = j1VarArrValues.length;
            int i = 0;
            while (i < length) {
                j1Var = j1VarArrValues[i];
                j1[] j1VarArr = j1VarArrValues;
                int i2 = length;
                if (a0.z(j1Var.name(), str, true)) {
                    break;
                }
                i++;
                j1VarArrValues = j1VarArr;
                length = i2;
            }
            j1Var = null;
        } else {
            j1Var = null;
        }
        String strE = k1Var != null ? k1Var.e() : null;
        if (k1Var == null || (strS = k1Var.s()) == null) {
            str2 = strE;
            s5Var = null;
        } else {
            s5[] s5VarArrValues = s5.values();
            int length2 = s5VarArrValues.length;
            str2 = strE;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    s5Var2 = null;
                    break;
                }
                s5Var2 = s5VarArrValues[i3];
                int i5 = i3;
                s5[] s5VarArr = s5VarArrValues;
                if (a0.z(s5Var2.name(), strS, true)) {
                    break;
                }
                i3 = i5 + 1;
                s5VarArrValues = s5VarArr;
            }
            s5Var = s5Var2;
        }
        if ((k1Var != null ? k1Var.l() : null) == null || k1Var.m() == null) {
            str3 = strJ;
            str4 = strP;
            aVar = null;
        } else {
            str3 = strJ;
            str4 = strP;
            aVar = new co3.a(k1Var.l().doubleValue(), k1Var.m().doubleValue());
        }
        return new j5(str3, str4, strD, strQ, strO, strG, strH, strI, strA, strT, strR, strN, strB, boolF, j1Var, str2, s5Var, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tof.p5 m(nif.m1 r30) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rif.d.m(nif.m1):tof.p5");
    }

    public static z6 n(b4 b4Var, zm3.f fVar) {
        String firstName;
        String lastName;
        do3.c cVar;
        do3.c cVar2;
        if (fVar == null || (firstName = fVar.getFirstName()) == null || d0.W(firstName)) {
            firstName = null;
        }
        if (fVar == null || (lastName = fVar.getLastName()) == null || d0.W(lastName)) {
            lastName = null;
        }
        int i = 0;
        boolean z = (firstName == null && lastName == null) ? false : true;
        String strR0 = b4Var.R0();
        String pocketId = b4Var.getPocketId();
        w5 w5Var = pocketId != null ? new w5(pocketId, o(b4Var.O0()), null) : null;
        String legalName = b4Var.getLegalName();
        if (!z) {
            firstName = b4Var.getFirstName();
        }
        String str = firstName;
        if (!z) {
            lastName = b4Var.getLastName();
        }
        String str2 = lastName;
        String phone = b4Var.getPhone();
        String strN0 = b4Var.N0();
        String code = b4Var.getCode();
        String country = b4Var.getCountry();
        do3.b.Companion.getClass();
        do3.b bVar = do3.b.FULL;
        String type = b4Var.getType();
        String strP0 = b4Var.P0();
        String strQ0 = b4Var.Q0();
        if (strQ0 != null) {
            do3.c[] cVarArrValues = do3.c.values();
            int length = cVarArrValues.length;
            while (true) {
                if (i >= length) {
                    cVar2 = null;
                    break;
                }
                do3.c cVar3 = cVarArrValues[i];
                if (a0.z(cVar3.name(), strQ0, true)) {
                    cVar2 = cVar3;
                    break;
                }
                i++;
            }
            cVar = cVar2;
        } else {
            cVar = null;
        }
        return new z6(strR0, legalName, str, str2, type, strP0, phone, strN0, code, country, w5Var, bVar, cVar);
    }

    public static l o(String str) {
        l lVar;
        if (str != null) {
            l[] lVarArrValues = l.values();
            int length = lVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    lVar = null;
                    break;
                }
                lVar = lVarArrValues[i];
                if (a0.z(lVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return l.UNKNOWN;
    }

    public static y6 p(String str) {
        y6 y6Var = (y6) r11.a.r().get(str);
        return y6Var == null ? y6.UNKNOWN : y6Var;
    }

    public static tof.a q(nif.a aVar) {
        tof.b bVar;
        tof.c cVar;
        tof.n2 n2Var;
        String strC = aVar.c();
        tof.c[] cVarArrValues = tof.c.values();
        int length = cVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            bVar = null;
            n2Var = null;
            if (i2 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i2];
            if (a0.z(cVar.name(), strC, true)) {
                break;
            }
            i2++;
        }
        if (cVar == null) {
            cVar = tof.c.UNKNOWN;
        }
        String strA = aVar.a();
        nif.b bVarB = aVar.b();
        if (bVarB != null) {
            String strA2 = bVarB.a();
            String strB = bVarB.b();
            tof.n2[] n2VarArrValues = tof.n2.values();
            int length2 = n2VarArrValues.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                tof.n2 n2Var2 = n2VarArrValues[i];
                if (a0.z(n2Var2.name(), strB, true)) {
                    n2Var = n2Var2;
                    break;
                }
                i++;
            }
            if (n2Var == null) {
                n2Var = tof.n2.UNKNOWN;
            }
            bVar = new tof.b(strA2, n2Var);
        }
        return new tof.a(cVar, strA, bVar);
    }

    public static k r(h hVar, ApmRecipient apmRecipient) {
        tof.l lVar;
        String strB;
        String strD = hVar.d();
        String strF = hVar.f();
        tof.l[] lVarArrValues = tof.l.values();
        int length = lVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                lVar = null;
                break;
            }
            lVar = lVarArrValues[i];
            if (a0.z(lVar.name(), strF, true)) {
                break;
            }
            i++;
        }
        if (lVar == null) {
            lVar = tof.l.UNKNOWN;
        }
        tof.l lVar2 = lVar;
        String strE = hVar.e();
        String strC = hVar.c();
        String strA = hVar.a();
        if (apmRecipient == null || (strB = apmRecipient.getF62135b()) == null) {
            strB = hVar.b();
        }
        return new k(lVar2, strD, strE, strC, strA, strB);
    }

    public static m s(i iVar) {
        n nVar;
        String strA = iVar.a();
        n[] nVarArrValues = n.values();
        int length = nVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                nVar = null;
                break;
            }
            nVar = nVarArrValues[i];
            if (a0.z(nVar.name(), strA, true)) {
                break;
            }
            i++;
        }
        if (nVar == null) {
            nVar = n.UNKNOWN;
        }
        return new m(nVar);
    }

    public static tof.q t(a2 a2Var) {
        return new tof.q(a2Var.a(), a2Var.c(), a2Var.f(), a2Var.b(), a2Var.e(), a2Var.d());
    }

    public static u u(nif.s sVar) {
        return new u(sVar.a());
    }

    public static x v(nif.v vVar) {
        return new x(vVar.a());
    }

    public static y w(nif.y yVar) {
        return new y(yVar.b(), yVar.a());
    }

    public static h0 x(b0 b0Var) {
        return new h0(b0Var.b(), b0Var.a());
    }

    public static tof.l0 y(nif.d0 d0Var) {
        wk5.a aVar;
        i0 i0Var;
        String str;
        wk5.a aVar2;
        if (d0Var == null) {
            return null;
        }
        String strA = d0Var.a();
        String strB = d0Var.b();
        h0 h0VarX = x(d0Var.c());
        b0 b0VarI = d0Var.i();
        h0 h0VarX2 = b0VarI != null ? x(b0VarI) : null;
        b0 b0VarK = d0Var.k();
        h0 h0VarX3 = b0VarK != null ? x(b0VarK) : null;
        b0 b0VarJ = d0Var.j();
        h0 h0VarX4 = b0VarJ != null ? x(b0VarJ) : null;
        b0 b0VarH = d0Var.h();
        h0 h0VarX5 = b0VarH != null ? x(b0VarH) : null;
        b0 b0VarF = d0Var.f();
        h0 h0VarX6 = b0VarF != null ? x(b0VarF) : null;
        String strG = d0Var.g();
        BigDecimal bigDecimalN = d0Var.n();
        c0 c0VarD = d0Var.d();
        j0 j0Var = c0VarD != null ? new j0(c0VarD.a(), c0VarD.b()) : null;
        e0 e0VarM = d0Var.m();
        k0 k0Var = e0VarM != null ? new k0(e0VarM.a(), e0VarM.b()) : null;
        nif.f0 f0VarO = d0Var.o();
        i0 i0Var2 = f0VarO != null ? new i0(f0VarO.b(), f0VarO.a()) : null;
        nif.f0 f0VarP = d0Var.p();
        if (f0VarP != null) {
            aVar = null;
            i0Var = new i0(f0VarP.b(), f0VarP.a());
        } else {
            aVar = null;
            i0Var = null;
        }
        String strE = d0Var.e();
        if (strE != null) {
            wk5.a[] aVarArrValues = wk5.a.values();
            str = strA;
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar2 = aVar;
                    break;
                }
                wk5.a aVar3 = aVarArrValues[i];
                int i2 = i;
                int i3 = length;
                if (a0.z(aVar3.name(), strE, true)) {
                    aVar2 = aVar3;
                    break;
                }
                i = i2 + 1;
                length = i3;
            }
            aVar = aVar2;
        } else {
            str = strA;
        }
        return new tof.l0(str, strB, h0VarX, h0VarX2, h0VarX3, h0VarX4, h0VarX5, h0VarX6, strG, bigDecimalN, j0Var, k0Var, i0Var2, i0Var, aVar);
    }

    public static w0 z(nif.x0 x0Var) {
        String strA = x0Var.a();
        h3 h3VarB = x0Var.b();
        return new w0(strA, h3VarB != null ? new d5(h3VarB.c(), h3VarB.b(), h3VarB.a()) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tof.z0 A(nif.a1 r6, fo3.c r7) {
        /*
            r5 = this;
            boolean r0 = r6.b()
            java.lang.String r1 = r6.c()
            java.lang.String r2 = r6.a()
            com.revolut.feature.retail.savings.api.SavingsApi$Toggles$JointAccountsSavings r3 = com.revolut.feature.retail.savings.api.SavingsApi$Toggles.JointAccountsSavings.f83075c
            gte.a r4 = r5.f254582a
            jte.d r4 = (jte.d) r4
            boolean r3 = r4.c(r3)
            if (r3 == 0) goto L2c
            java.lang.String r6 = r6.a()
            if (r7 == 0) goto L23
            java.lang.String r7 = r7.c()
            goto L24
        L23:
            r7 = 0
        L24:
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L2c
            r6 = 1
            goto L2d
        L2c:
            r6 = 0
        L2d:
            tof.z0 r7 = new tof.z0
            r7.<init>(r2, r1, r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rif.d.A(nif.a1, fo3.c):tof.z0");
    }
}
