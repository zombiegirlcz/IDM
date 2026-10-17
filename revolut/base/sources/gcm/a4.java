package gcm;

import com.google.common.base.Preconditions;
import com.revolut.tracking.v3.RawEvent;
import io.grpc.StatusRuntimeException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class a4 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f142560a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hcm.b0 f142562c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hcm.c0 f142563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e6 f142564h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f142565j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f142566l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f142561b = -1;
    public ecm.o d = ecm.o.f124848b;
    public final y3 e = new y3(this, 0);
    public final ByteBuffer f = ByteBuffer.allocate(5);
    public int k = -1;

    public a4(c cVar, hcm.c0 c0Var, e6 e6Var) {
        this.f142560a = (z3) Preconditions.checkNotNull(cVar, "sink");
        this.f142563g = (hcm.c0) Preconditions.checkNotNull(c0Var, "bufferAllocator");
        this.f142564h = (e6) Preconditions.checkNotNull(e6Var, "statsTraceCtx");
    }

    public static int h(kcm.a aVar, OutputStream outputStream) throws IOException {
        RawEvent rawEvent = aVar.f182749a;
        if (rawEvent != null) {
            int serializedSize = rawEvent.getSerializedSize();
            aVar.f182749a.writeTo(outputStream);
            aVar.f182749a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = aVar.f182751c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        com.google.protobuf.d0 d0Var = kcm.c.f182755a;
        Preconditions.checkNotNull(byteArrayInputStream, "inputStream cannot be null!");
        Preconditions.checkNotNull(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j2;
                aVar.f182751c = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j2 += (long) i;
        }
    }

    @Override // gcm.j1
    public final void a(int i) {
        Preconditions.checkState(this.f142561b == -1, "max size already set");
        this.f142561b = i;
    }

    @Override // gcm.j1
    public final j1 b(ecm.o oVar) {
        this.d = (ecm.o) Preconditions.checkNotNull(oVar, "Can't pass an empty compressor");
        return this;
    }

    @Override // gcm.j1
    public final void c(kcm.a aVar) {
        if (this.i) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f142565j++;
        int i = this.k + 1;
        this.k = i;
        this.f142566l = 0L;
        e6 e6Var = this.f142564h;
        ecm.e0[] e0VarArr = e6Var.f142632a;
        ecm.e0[] e0VarArr2 = e6Var.f142632a;
        int i2 = 0;
        for (ecm.e0 e0Var : e0VarArr) {
            e0Var.j(i);
        }
        boolean z = this.d != ecm.o.f124848b;
        try {
            int iAvailable = aVar.available();
            int i3 = (iAvailable == 0 || !z) ? i(aVar, iAvailable) : f(aVar);
            if (iAvailable != -1 && i3 != iAvailable) {
                throw new StatusRuntimeException(ecm.g2.f124806l.g(a0.d.g(i3, iAvailable, "Message length inaccurate ", " != ")));
            }
            long j2 = i3;
            for (ecm.e0 e0Var2 : e0VarArr2) {
                e0Var2.l(j2);
            }
            long j3 = this.f142566l;
            for (ecm.e0 e0Var3 : e0VarArr2) {
                e0Var3.m(j3);
            }
            int i5 = this.k;
            long j5 = this.f142566l;
            ecm.e0[] e0VarArr3 = e6Var.f142632a;
            int length = e0VarArr3.length;
            while (i2 < length) {
                long j16 = j2;
                e0VarArr3[i2].k(i5, j5, j16);
                i2++;
                j2 = j16;
            }
        } catch (StatusRuntimeException e) {
            throw e;
        } catch (IOException e2) {
            throw new StatusRuntimeException(ecm.g2.f124806l.g("Failed to frame message").f(e2));
        } catch (RuntimeException e4) {
            throw new StatusRuntimeException(ecm.g2.f124806l.g("Failed to frame message").f(e4));
        }
    }

    @Override // gcm.j1
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        hcm.b0 b0Var = this.f142562c;
        if (b0Var != null && b0Var.f151252c == 0) {
            this.f142562c = null;
        }
        d(true, true);
    }

    public final void d(boolean z, boolean z3) {
        hcm.b0 b0Var = this.f142562c;
        this.f142562c = null;
        ((c) this.f142560a).s(b0Var, z, z3, this.f142565j);
        this.f142565j = 0;
    }

    public final void e(x3 x3Var, boolean z) {
        int iD = x3.d(x3Var);
        int i = this.f142561b;
        if (i >= 0 && iD > i) {
            ecm.g2 g2Var = ecm.g2.f124805j;
            Locale locale = Locale.US;
            throw new StatusRuntimeException(g2Var.g("message too large " + iD + " > " + i));
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iD);
        this.f142563g.getClass();
        hcm.b0 b0VarA = hcm.c0.a(5);
        b0VarA.a(byteBuffer.array(), 0, byteBuffer.position());
        if (iD == 0) {
            this.f142562c = b0VarA;
            return;
        }
        int i2 = this.f142565j - 1;
        c cVar = (c) this.f142560a;
        cVar.s(b0VarA, false, false, i2);
        this.f142565j = 1;
        ArrayList arrayList = x3Var.f142957a;
        for (int i3 = 0; i3 < arrayList.size() - 1; i3++) {
            cVar.s((hcm.b0) arrayList.get(i3), false, false, 0);
        }
        this.f142562c = (hcm.b0) p.a.i(1, arrayList);
        this.f142566l = iD;
    }

    public final int f(kcm.a aVar) throws IOException {
        OutputStream gZIPOutputStream;
        x3 x3Var = new x3(this);
        switch (this.d.f124849a) {
            case 0:
                gZIPOutputStream = x3Var;
                break;
            default:
                gZIPOutputStream = new GZIPOutputStream(x3Var);
                break;
        }
        try {
            int iH = h(aVar, gZIPOutputStream);
            gZIPOutputStream.close();
            int i = this.f142561b;
            if (i < 0 || iH <= i) {
                e(x3Var, true);
                return iH;
            }
            ecm.g2 g2Var = ecm.g2.f124805j;
            Locale locale = Locale.US;
            throw new StatusRuntimeException(g2Var.g("message too large " + iH + " > " + i));
        } catch (Throwable th10) {
            gZIPOutputStream.close();
            throw th10;
        }
    }

    @Override // gcm.j1
    public final void flush() {
        hcm.b0 b0Var = this.f142562c;
        if (b0Var == null || b0Var.f151252c <= 0) {
            return;
        }
        d(false, true);
    }

    public final void g(int i, int i2, byte[] bArr) {
        while (i2 > 0) {
            hcm.b0 b0Var = this.f142562c;
            if (b0Var != null && b0Var.f151251b == 0) {
                d(false, false);
            }
            if (this.f142562c == null) {
                this.f142563g.getClass();
                this.f142562c = hcm.c0.a(i2);
            }
            int iMin = Math.min(i2, this.f142562c.f151251b);
            this.f142562c.a(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    public final int i(kcm.a aVar, int i) throws IOException {
        if (i == -1) {
            x3 x3Var = new x3(this);
            int iH = h(aVar, x3Var);
            e(x3Var, false);
            return iH;
        }
        this.f142566l = i;
        int i2 = this.f142561b;
        if (i2 >= 0 && i > i2) {
            ecm.g2 g2Var = ecm.g2.f124805j;
            Locale locale = Locale.US;
            throw new StatusRuntimeException(g2Var.g("message too large " + i + " > " + i2));
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i);
        if (this.f142562c == null) {
            int iPosition = byteBuffer.position() + i;
            this.f142563g.getClass();
            this.f142562c = hcm.c0.a(iPosition);
        }
        g(0, byteBuffer.position(), byteBuffer.array());
        return h(aVar, this.e);
    }

    @Override // gcm.j1
    public final boolean isClosed() {
        return this.i;
    }
}
