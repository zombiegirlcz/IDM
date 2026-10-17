package hcm;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import ecm.g1;
import ecm.g2;
import ecm.j1;
import ecm.k1;
import ecm.m1;
import ecm.o0;
import ecm.p0;
import gcm.e6;
import gcm.h6;
import gcm.p1;
import gcm.p2;
import gcm.t1;
import gcm.u4;
import gcm.v4;
import gcm.w3;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends t1 implements d0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final f F;
    public final g0 G;
    public final t H;
    public boolean I;
    public final dfm.c J;
    public e0 K;
    public int L;
    public final /* synthetic */ p M;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f151297w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f151298x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f151299y;
    public final mmm.h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, int i, e6 e6Var, Object obj2, f fVar, g0 g0Var, t tVar, int i2, ecm.d dVar) {
        super(i, e6Var, pVar.f142592c, dVar);
        this.M = pVar;
        this.f142880t = Charsets.UTF_8;
        this.z = new mmm.h();
        this.A = false;
        this.B = false;
        this.C = false;
        this.I = true;
        this.L = -1;
        this.f151298x = Preconditions.checkNotNull(obj2, "lock");
        this.F = fVar;
        this.G = g0Var;
        this.H = tVar;
        this.D = i2;
        this.E = i2;
        this.f151297w = i2;
        dfm.b.f114548a.getClass();
        this.J = dfm.a.f114546a;
    }

    public static void j(o oVar, m1 m1Var, String str) throws Throwable {
        p pVar = oVar.M;
        String str2 = pVar.f151303m;
        String str3 = pVar.k;
        boolean z = pVar.f151306q;
        t tVar = oVar.H;
        boolean z3 = tVar.B == null;
        icm.c cVar = g.f151270a;
        Preconditions.checkNotNull(m1Var, "headers");
        Preconditions.checkNotNull(str, "defaultPath");
        Preconditions.checkNotNull(str2, "authority");
        m1Var.a(p1.i);
        m1Var.a(p1.f142813j);
        g1 g1Var = p1.k;
        m1Var.a(g1Var);
        ArrayList arrayList = new ArrayList(m1Var.f124844b + 7);
        if (z3) {
            arrayList.add(g.f151271b);
        } else {
            arrayList.add(g.f151270a);
        }
        if (z) {
            arrayList.add(g.d);
        } else {
            arrayList.add(g.f151272c);
        }
        arrayList.add(new icm.c(icm.c.f160310h, str2));
        arrayList.add(new icm.c(icm.c.f, str));
        arrayList.add(new icm.c(g1Var.f124818a, str3));
        arrayList.add(g.e);
        arrayList.add(g.f);
        Logger logger = h6.f142676a;
        Charset charset = o0.f124850a;
        int i = m1Var.f124844b * 2;
        byte[][] bArr = new byte[i][];
        Object[] objArr = m1Var.f124843a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i);
        } else {
            for (int i2 = 0; i2 < m1Var.f124844b; i2++) {
                int i3 = i2 * 2;
                Object[] objArr2 = m1Var.f124843a;
                bArr[i3] = (byte[]) objArr2[i3];
                int i5 = i3 + 1;
                Object obj2 = objArr2[i5];
                if (!(obj2 instanceof byte[])) {
                    ((j1) obj2).getClass();
                    throw null;
                }
                bArr[i5] = (byte[]) obj2;
            }
        }
        int i6 = 0;
        for (int i21 = 0; i21 < i; i21 += 2) {
            byte[] bArr2 = bArr[i21];
            byte[] bArr3 = bArr[i21 + 1];
            if (h6.a(bArr2, h6.f142677b)) {
                bArr[i6] = bArr2;
                bArr[i6 + 1] = o0.f124851b.encode(bArr3).getBytes(Charsets.US_ASCII);
            } else {
                for (byte b4 : bArr3) {
                    if (b4 < 32 || b4 > 126) {
                        String str4 = new String(bArr2, Charsets.US_ASCII);
                        Logger logger2 = h6.f142676a;
                        StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Metadata key=", str4, ", value=");
                        sbX.append(Arrays.toString(bArr3));
                        sbX.append(" contains invalid ASCII characters");
                        logger2.warning(sbX.toString());
                        break;
                    }
                }
                bArr[i6] = bArr2;
                bArr[i6 + 1] = bArr3;
            }
            i6 += 2;
        }
        if (i6 != i) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i6);
        }
        for (int i22 = 0; i22 < bArr.length; i22 += 2) {
            byte[] bArr4 = bArr[i22];
            mmm.m.Companion.getClass();
            mmm.m mVarE = mmm.l.e(bArr4);
            byte[] bArr5 = mVarE.f207285a;
            if (bArr5.length != 0 && bArr5[0] != 58) {
                arrayList.add(new icm.c(mVarE, mmm.l.e(bArr[i22 + 1])));
            }
        }
        oVar.f151299y = arrayList;
        g2 g2Var = tVar.v;
        if (g2Var != null) {
            pVar.f151304n.f(g2Var, gcm.b0.MISCARRIED, true, new m1());
            return;
        }
        if (tVar.f151318n.size() < tVar.C) {
            tVar.t(pVar);
            return;
        }
        tVar.D.add(pVar);
        if (!tVar.z) {
            tVar.z = true;
            p2 p2Var = tVar.F;
            if (p2Var != null) {
                p2Var.b();
            }
        }
        if (pVar.e) {
            tVar.M.n(pVar, true);
        }
    }

    public static void k(o oVar, mmm.h hVar, boolean z, boolean z3) {
        if (oVar.C) {
            return;
        }
        if (!oVar.I) {
            Preconditions.checkState(oVar.L != -1, "streamId should be set");
            oVar.G.a(z, oVar.K, hVar, z3);
        } else {
            oVar.z.write(hVar, (int) hVar.f207266b);
            oVar.A |= z;
            oVar.B |= z3;
        }
    }

    @Override // gcm.b
    public final void a(int i) {
        int i2 = this.E - i;
        this.E = i2;
        float f = i2;
        int i3 = this.f151297w;
        if (f <= i3 * 0.5f) {
            int i5 = i3 - i2;
            this.D += i5;
            this.E = i2 + i5;
            this.F.q6(this.L, i5);
        }
    }

    @Override // gcm.b
    public final void c(boolean z) throws Throwable {
        if (this.o) {
            this.H.h(this.L, null, gcm.b0.PROCESSED, false, null, null);
        } else {
            this.H.h(this.L, null, gcm.b0.PROCESSED, false, icm.a.CANCEL, null);
        }
        Preconditions.checkState(this.f142581p, "status should have been reported on deframer closed");
        this.f142579m = true;
        if (this.f142582q && z) {
            g(g2.f124806l.g("Encountered end-of-stream mid-frame"), true, new m1());
        }
        gcm.a aVar = this.f142580n;
        if (aVar != null) {
            aVar.run();
            this.f142580n = null;
        }
    }

    public final void l(g2 g2Var, boolean z, m1 m1Var) throws Throwable {
        if (this.C) {
            return;
        }
        this.C = true;
        if (!this.I) {
            this.H.h(this.L, g2Var, gcm.b0.PROCESSED, z, icm.a.CANCEL, m1Var);
            return;
        }
        t tVar = this.H;
        LinkedList linkedList = tVar.D;
        p pVar = this.M;
        linkedList.remove(pVar);
        tVar.m(pVar);
        this.f151299y = null;
        this.z.f();
        this.I = false;
        if (m1Var == null) {
            m1Var = new m1();
        }
        g(g2Var, true, m1Var);
    }

    public final void m(Throwable th10) {
        l(g2.d(th10), true, new m1());
    }

    public final void n(int i, mmm.h hVar, boolean z) throws Throwable {
        Throwable th10;
        long j2 = hVar.f207266b;
        int i2 = this.D - (((int) j2) + i);
        this.D = i2;
        this.E -= i;
        if (i2 < 0) {
            this.F.T9(this.L, icm.a.FLOW_CONTROL_ERROR);
            this.H.h(this.L, g2.f124806l.g("Received data size exceeded our receiving window size"), gcm.b0.PROCESSED, false, null, null);
            return;
        }
        y yVar = new y(hVar);
        g2 g2Var = this.f142878r;
        boolean z3 = false;
        if (g2Var != null) {
            Charset charset = this.f142880t;
            u4 u4Var = v4.f142912a;
            Preconditions.checkNotNull(charset, "charset");
            Preconditions.checkNotNull(yVar, "buffer");
            int i3 = (int) hVar.f207266b;
            byte[] bArr = new byte[i3];
            yVar.k(bArr, 0, i3);
            this.f142878r = g2Var.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            yVar.close();
            if (this.f142878r.f124810b.length() > 1000 || z) {
                l(this.f142878r, false, this.f142879s);
                return;
            }
            return;
        }
        if (!this.u) {
            l(g2.f124806l.g("headers not received before payload"), false, new m1());
            return;
        }
        int i5 = (int) j2;
        Preconditions.checkNotNull(yVar, "frame");
        boolean z4 = true;
        try {
            if (this.f142581p) {
                gcm.c.i.log(Level.INFO, "Received data on closed stream");
                yVar.close();
            } else {
                try {
                    w3 w3Var = this.f142572a;
                    w3Var.getClass();
                    Preconditions.checkNotNull(yVar, "data");
                    try {
                        if (w3Var.isClosed() || w3Var.f142926q) {
                            yVar.close();
                        } else {
                            w3Var.f142922l.o(yVar);
                            try {
                                w3Var.d();
                            } catch (Throwable th11) {
                                th = th11;
                                z4 = false;
                                if (z4) {
                                    yVar.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                    }
                } catch (Throwable th13) {
                    try {
                        m(th13);
                    } catch (Throwable th14) {
                        th10 = th14;
                        if (!z3) {
                            throw th10;
                        }
                        yVar.close();
                        throw th10;
                    }
                }
            }
            if (z) {
                if (i5 > 0) {
                    this.f142878r = g2.f124806l.g("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f142878r = g2.f124806l.g("Received unexpected EOS on empty DATA frame from server");
                }
                m1 m1Var = new m1();
                this.f142879s = m1Var;
                g(this.f142878r, false, m1Var);
            }
        } catch (Throwable th15) {
            th10 = th15;
            z3 = true;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void o(ArrayList arrayList, boolean z) throws Throwable {
        g2 g2VarA;
        k1 k1Var = t1.v;
        if (z) {
            byte[][] bArrA = h0.a(arrayList);
            int length = bArrA.length / 2;
            m1 m1Var = new m1();
            m1Var.f124844b = length;
            m1Var.f124843a = bArrA;
            Preconditions.checkNotNull(m1Var, "trailers");
            if (this.f142878r == null && !this.u) {
                g2 g2VarI = t1.i(m1Var);
                this.f142878r = g2VarI;
                if (g2VarI != null) {
                    this.f142879s = m1Var;
                }
            }
            g2 g2Var = this.f142878r;
            if (g2Var != null) {
                g2 g2VarA2 = g2Var.a("trailers: " + m1Var);
                this.f142878r = g2VarA2;
                l(g2VarA2, false, this.f142879s);
                return;
            }
            k1 k1Var2 = p0.f124855b;
            g2 g2Var2 = (g2) m1Var.c(k1Var2);
            if (g2Var2 != null) {
                g2VarA = g2Var2.g((String) m1Var.c(p0.f124854a));
            } else if (this.u) {
                g2VarA = g2.f124803g.g("missing GRPC status in response");
            } else {
                Integer num = (Integer) m1Var.c(k1Var);
                g2VarA = (num != null ? p1.g(num.intValue()) : g2.f124806l.g("missing HTTP status code")).a("missing GRPC status, inferred error from HTTP status code");
            }
            m1Var.a(k1Var);
            m1Var.a(k1Var2);
            m1Var.a(p0.f124854a);
            Preconditions.checkNotNull(g2VarA, "status");
            Preconditions.checkNotNull(m1Var, "trailers");
            if (this.f142581p) {
                gcm.c.i.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{g2VarA, m1Var});
                return;
            }
            for (ecm.e0 e0Var : this.i.f142632a) {
                ((ecm.n) e0Var).t(m1Var);
            }
            g(g2VarA, false, m1Var);
            return;
        }
        byte[][] bArrA2 = h0.a(arrayList);
        int length2 = bArrA2.length / 2;
        m1 m1Var2 = new m1();
        m1Var2.f124844b = length2;
        m1Var2.f124843a = bArrA2;
        Preconditions.checkNotNull(m1Var2, "headers");
        g2 g2Var3 = this.f142878r;
        if (g2Var3 != null) {
            this.f142878r = g2Var3.a("headers: " + m1Var2);
            return;
        }
        try {
            if (this.u) {
                g2 g2VarG = g2.f124806l.g("Received headers twice");
                this.f142878r = g2VarG;
                this.f142878r = g2VarG.a("headers: " + m1Var2);
                this.f142879s = m1Var2;
                this.f142880t = t1.h(m1Var2);
                return;
            }
            Integer num2 = (Integer) m1Var2.c(k1Var);
            if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                g2 g2Var4 = this.f142878r;
                if (g2Var4 != null) {
                    this.f142878r = g2Var4.a("headers: " + m1Var2);
                    this.f142879s = m1Var2;
                    this.f142880t = t1.h(m1Var2);
                    return;
                }
                return;
            }
            this.u = true;
            g2 g2VarI2 = t1.i(m1Var2);
            this.f142878r = g2VarI2;
            if (g2VarI2 != null) {
                this.f142878r = g2VarI2.a("headers: " + m1Var2);
                this.f142879s = m1Var2;
                this.f142880t = t1.h(m1Var2);
                return;
            }
            m1Var2.a(k1Var);
            m1Var2.a(p0.f124855b);
            m1Var2.a(p0.f124854a);
            d(m1Var2);
            g2 g2Var5 = this.f142878r;
            if (g2Var5 != null) {
                this.f142878r = g2Var5.a("headers: " + m1Var2);
                this.f142879s = m1Var2;
                this.f142880t = t1.h(m1Var2);
            }
        } catch (Throwable th10) {
            g2 g2Var6 = this.f142878r;
            if (g2Var6 != null) {
                this.f142878r = g2Var6.a("headers: " + m1Var2);
                this.f142879s = m1Var2;
                this.f142880t = t1.h(m1Var2);
            }
            throw th10;
        }
    }
}
