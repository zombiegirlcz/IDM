package icm;

import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import ecm.e2;
import ecm.g2;
import ecm.m1;
import gcm.b0;
import gcm.n1;
import gcm.v1;
import hcm.e0;
import hcm.g0;
import hcm.o;
import hcm.p;
import hcm.s;
import hcm.t;
import hcm.u;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import mmm.l0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes13.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f160331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f160332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f160333c;

    public i(l0 l0Var) {
        this.f160331a = l0Var;
        g gVar = new g(l0Var);
        this.f160332b = gVar;
        this.f160333c = new d(gVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f160331a.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(s sVar) throws IOException {
        boolean z;
        a aVar;
        e0 e0Var;
        objArr = 0;
        Object[] objArr = 0;
        int i = 0;
        try {
            this.f160331a.b(9L);
            int iA = k.a(this.f160331a);
            v1 v1Var = null;
            if (iA < 0 || iA > 16384) {
                k.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
                throw null;
            }
            byte b4 = (byte) (this.f160331a.readByte() & UnsignedBytes.MAX_VALUE);
            byte b5 = (byte) (this.f160331a.readByte() & UnsignedBytes.MAX_VALUE);
            int i2 = this.f160331a.readInt() & Integer.MAX_VALUE;
            Logger logger = k.f160337a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(h.a(true, i2, iA, b4, b5));
            }
            switch (b4) {
                case 0:
                    f(sVar, iA, b5, i2);
                    return true;
                case 1:
                    h(sVar, iA, b5, i2);
                    return true;
                case 2:
                    if (iA != 5) {
                        k.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i2 == 0) {
                        k.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    l0 l0Var = this.f160331a;
                    l0Var.readInt();
                    l0Var.readByte();
                    return true;
                case 3:
                    i(sVar, iA, i2);
                    return true;
                case 4:
                    j(sVar, iA, b5, i2);
                    return true;
                case 5:
                    if (i2 == 0) {
                        k.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    }
                    short s2 = (b5 & 8) != 0 ? (short) (this.f160331a.readByte() & UnsignedBytes.MAX_VALUE) : (short) 0;
                    int i3 = this.f160331a.readInt() & Integer.MAX_VALUE;
                    ArrayList arrayListG = g(k.b(b5, iA - 4, s2), s2, b5, i2);
                    cpi.g gVar = sVar.f151307a;
                    u uVar = u.INBOUND;
                    if (gVar.x()) {
                        ((Logger) gVar.f107954b).log((Level) gVar.f107955c, uVar + " PUSH_PROMISE: streamId=" + i2 + " promisedStreamId=" + i3 + " headers=" + arrayListG);
                    }
                    synchronized (sVar.d.k) {
                        sVar.d.i.T9(i2, a.PROTOCOL_ERROR);
                        break;
                    }
                    return true;
                case 6:
                    z = true;
                    if (iA != 8) {
                        k.c("TYPE_PING length != 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i2 != 0) {
                        k.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i5 = this.f160331a.readInt();
                    int i6 = this.f160331a.readInt();
                    Object[] objArr2 = (b5 & 1) != 0 ? 1 : 0;
                    long j2 = (((long) i5) << 32) | (((long) i6) & BodyPartID.bodyIdMax);
                    sVar.f151307a.C(u.INBOUND, j2);
                    if (objArr2 == 0) {
                        synchronized (sVar.d.k) {
                            sVar.d.i.O8(i5, i6, true);
                            break;
                        }
                        return true;
                    }
                    synchronized (sVar.d.k) {
                        try {
                            v1 v1Var2 = sVar.d.f151325x;
                            if (v1Var2 == null) {
                                t.Q.warning("Received unexpected ping ack. No ping outstanding");
                            } else if (v1Var2.e() == j2) {
                                t tVar = sVar.d;
                                v1 v1Var3 = tVar.f151325x;
                                tVar.f151325x = null;
                                v1Var = v1Var3;
                            } else {
                                Logger logger2 = t.Q;
                                Level level = Level.WARNING;
                                Locale locale = Locale.US;
                                logger2.log(level, "Received unexpected ping ack. Expecting " + sVar.d.f151325x.e() + ", got " + j2);
                            }
                        } finally {
                        }
                        break;
                    }
                    if (v1Var != null) {
                        v1Var.b();
                    }
                    return z;
                case 7:
                    l0 l0Var2 = this.f160331a;
                    if (iA < 8) {
                        k.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i2 != 0) {
                        k.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i21 = l0Var2.readInt();
                    int i22 = l0Var2.readInt();
                    int i32 = iA - 8;
                    a[] aVarArrValues = a.values();
                    int length = aVarArrValues.length;
                    while (true) {
                        if (i < length) {
                            aVar = aVarArrValues[i];
                            if (aVar.httpCode != i22) {
                                i++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        k.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i22));
                        throw null;
                    }
                    mmm.m mVarC = mmm.m.d;
                    if (i32 > 0) {
                        mVarC = l0Var2.c(i32);
                    }
                    t tVar2 = sVar.d;
                    sVar.f151307a.A(u.INBOUND, i21, aVar, mVarC);
                    if (aVar == a.ENHANCE_YOUR_CALM) {
                        String strV = mVarC.v();
                        t.Q.log(Level.WARNING, sVar + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strV);
                        if ("too_many_pings".equals(strV)) {
                            tVar2.J.run();
                        }
                    }
                    g2 g2VarA = n1.a(aVar.httpCode).a("Received Goaway");
                    if (mVarC.d() > 0) {
                        g2VarA = g2VarA.a(mVarC.v());
                    }
                    Map map = t.P;
                    tVar2.r(i21, null, g2VarA);
                    return true;
                case 8:
                    if (iA != 4) {
                        k.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    long j3 = ((long) this.f160331a.readInt()) & 2147483647L;
                    if (j3 == 0) {
                        k.c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    sVar.f151307a.F(u.INBOUND, i2, j3);
                    if (j3 == 0) {
                        if (i2 == 0) {
                            t.e(sVar.d, a.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                            return true;
                        }
                        sVar.d.h(i2, g2.f124806l.g("Received 0 flow control window increment."), b0.PROCESSED, false, a.PROTOCOL_ERROR, null);
                        return true;
                    }
                    z = true;
                    synchronized (sVar.d.k) {
                        try {
                            if (i2 == 0) {
                                sVar.d.f151315j.c(null, (int) j3);
                                return true;
                            }
                            p pVar = (p) sVar.d.f151318n.get(Integer.valueOf(i2));
                            if (pVar != null) {
                                g0 g0Var = sVar.d.f151315j;
                                o oVar = pVar.f151304n;
                                synchronized (oVar.f151298x) {
                                    e0Var = oVar.K;
                                    break;
                                }
                                g0Var.c(e0Var, (int) j3);
                            } else if (!sVar.d.l(i2)) {
                                objArr = 1;
                            }
                            if (objArr != 0) {
                                t.e(sVar.d, a.PROTOCOL_ERROR, "Received window_update for unknown stream: " + i2);
                                return true;
                            }
                            return z;
                        } finally {
                        }
                    }
                default:
                    this.f160331a.skip(iA);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public final void f(s sVar, int i, byte b4, int i2) throws IOException {
        p pVar;
        boolean z = (b4 & 1) != 0;
        if ((b4 & 32) != 0) {
            k.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short s2 = (b4 & 8) != 0 ? (short) (this.f160331a.readByte() & UnsignedBytes.MAX_VALUE) : (short) 0;
        int iB = k.b(b4, i, s2);
        l0 l0Var = this.f160331a;
        sVar.f151307a.z(u.INBOUND, i2, l0Var.f207283b, iB, z);
        t tVar = sVar.d;
        synchronized (tVar.k) {
            pVar = (p) tVar.f151318n.get(Integer.valueOf(i2));
        }
        if (pVar != null) {
            long j2 = iB;
            l0Var.b(j2);
            mmm.h hVar = new mmm.h();
            hVar.write(l0Var.f207283b, j2);
            dfm.c cVar = pVar.f151304n.J;
            dfm.b.f114548a.getClass();
            synchronized (sVar.d.k) {
                pVar.f151304n.n(i - iB, hVar, z);
            }
        } else {
            if (!sVar.d.l(i2)) {
                t.e(sVar.d, a.PROTOCOL_ERROR, "Received data for unknown stream: " + i2);
                this.f160331a.skip(s2);
            }
            synchronized (sVar.d.k) {
                sVar.d.i.T9(i2, a.STREAM_CLOSED);
            }
            l0Var.skip(iB);
        }
        t tVar2 = sVar.d;
        int i3 = tVar2.f151322s + i;
        tVar2.f151322s = i3;
        if (i3 >= tVar2.f * 0.5f) {
            synchronized (tVar2.k) {
                sVar.d.i.q6(0, r11.f151322s);
            }
            sVar.d.f151322s = 0;
        }
        this.f160331a.skip(s2);
    }

    public final ArrayList g(int i, short s2, byte b4, int i2) throws IOException {
        g gVar = this.f160332b;
        gVar.e = i;
        gVar.f160326b = i;
        gVar.f = s2;
        gVar.f160327c = b4;
        gVar.d = i2;
        d dVar = this.f160333c;
        l0 l0Var = dVar.f160315b;
        ArrayList arrayList = dVar.f160314a;
        while (!l0Var.J()) {
            byte b5 = l0Var.readByte();
            int i3 = b5 & UnsignedBytes.MAX_VALUE;
            if (i3 == 128) {
                throw new IOException("index == 0");
            }
            if ((b5 & 128) == 128) {
                int iE = dVar.e(i3, CertificateBody.profileType);
                int i5 = iE - 1;
                if (i5 >= 0) {
                    c[] cVarArr = f.f160323b;
                    if (i5 <= cVarArr.length - 1) {
                        arrayList.add(cVarArr[i5]);
                    }
                }
                int length = dVar.f + 1 + (i5 - f.f160323b.length);
                if (length >= 0) {
                    c[] cVarArr2 = dVar.e;
                    if (length <= cVarArr2.length - 1) {
                        arrayList.add(cVarArr2[length]);
                    }
                }
                throw new IOException(a0.d.n("Header index too large ", iE));
            }
            if (i3 == 64) {
                mmm.m mVarD = dVar.d();
                f.a(mVarD);
                dVar.c(new c(mVarD, dVar.d()));
            } else if ((b5 & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                dVar.c(new c(dVar.b(dVar.e(i3, 63) - 1), dVar.d()));
            } else if ((b5 & 32) == 32) {
                int iE2 = dVar.e(i3, 31);
                dVar.d = iE2;
                if (iE2 < 0 || iE2 > dVar.f160316c) {
                    throw new IOException("Invalid dynamic table size update " + dVar.d);
                }
                int i6 = dVar.f160318h;
                if (iE2 < i6) {
                    if (iE2 == 0) {
                        Arrays.fill(dVar.e, (Object) null);
                        dVar.f = dVar.e.length - 1;
                        dVar.f160317g = 0;
                        dVar.f160318h = 0;
                    } else {
                        dVar.a(i6 - iE2);
                    }
                }
            } else if (i3 == 16 || i3 == 0) {
                mmm.m mVarD2 = dVar.d();
                f.a(mVarD2);
                arrayList.add(new c(mVarD2, dVar.d()));
            } else {
                arrayList.add(new c(dVar.b(dVar.e(i3, 15) - 1), dVar.d()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    public final void h(s sVar, int i, byte b4, int i2) throws IOException {
        g2 g2VarG = null;
        boolean z = false;
        if (i2 == 0) {
            k.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z3 = (b4 & 1) != 0;
        short s2 = (b4 & 8) != 0 ? (short) (this.f160331a.readByte() & UnsignedBytes.MAX_VALUE) : (short) 0;
        if ((b4 & 32) != 0) {
            l0 l0Var = this.f160331a;
            l0Var.readInt();
            l0Var.readByte();
            i -= 5;
        }
        ArrayList arrayListG = g(k.b(b4, i, s2), s2, b4, i2);
        cpi.g gVar = sVar.f151307a;
        u uVar = u.INBOUND;
        if (gVar.x()) {
            ((Logger) gVar.f107954b).log((Level) gVar.f107955c, uVar + " HEADERS: streamId=" + i2 + " headers=" + arrayListG + " endStream=" + z3);
        }
        if (sVar.d.K != Integer.MAX_VALUE) {
            long jD = 0;
            for (int i3 = 0; i3 < arrayListG.size(); i3++) {
                c cVar = (c) arrayListG.get(i3);
                jD += (long) (cVar.f160312b.d() + cVar.f160311a.d() + 32);
            }
            int iMin = (int) Math.min(jD, 2147483647L);
            int i5 = sVar.d.K;
            if (iMin > i5) {
                g2 g2Var = g2.f124805j;
                Locale locale = Locale.US;
                StringBuilder sbK = v0.a.k(i5, "Response ", z3 ? "trailer" : "header", " metadata larger than ", ": ");
                sbK.append(iMin);
                g2VarG = g2Var.g(sbK.toString());
            }
        }
        synchronized (sVar.d.k) {
            try {
                p pVar = (p) sVar.d.f151318n.get(Integer.valueOf(i2));
                if (pVar == null) {
                    if (sVar.d.l(i2)) {
                        sVar.d.i.T9(i2, a.STREAM_CLOSED);
                    } else {
                        z = true;
                    }
                } else if (g2VarG == null) {
                    dfm.c cVar2 = pVar.f151304n.J;
                    dfm.b.f114548a.getClass();
                    pVar.f151304n.o(arrayListG, z3);
                } else {
                    if (!z3) {
                        sVar.d.i.T9(i2, a.CANCEL);
                    }
                    pVar.f151304n.g(g2VarG, false, new m1());
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (z) {
            t.e(sVar.d, a.PROTOCOL_ERROR, "Received header for unknown stream: " + i2);
        }
    }

    public final void i(s sVar, int i, int i2) throws IOException {
        a aVar;
        if (i != 4) {
            k.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            k.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int i3 = this.f160331a.readInt();
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i5];
            if (aVar.httpCode == i3) {
                break;
            } else {
                i5++;
            }
        }
        if (aVar == null) {
            k.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
            throw null;
        }
        sVar.f151307a.D(u.INBOUND, i2, aVar);
        g2 g2VarA = t.v(aVar).a("Rst Stream");
        e2 e2Var = g2VarA.f124809a;
        boolean z = e2Var == e2.CANCELLED || e2Var == e2.DEADLINE_EXCEEDED;
        synchronized (sVar.d.k) {
            try {
                p pVar = (p) sVar.d.f151318n.get(Integer.valueOf(i2));
                if (pVar != null) {
                    dfm.c cVar = pVar.f151304n.J;
                    dfm.b.f114548a.getClass();
                    sVar.d.h(i2, g2VarA, aVar == a.REFUSED_STREAM ? b0.REFUSED : b0.PROCESSED, z, null, null);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        icm.k.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(hcm.s r8, int r9, byte r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: icm.i.j(hcm.s, int, byte, int):void");
    }
}
