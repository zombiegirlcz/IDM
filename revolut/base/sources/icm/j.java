package icm;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import mmm.k0;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f160334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mmm.h f160335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f160336c;
    public int d;
    public boolean e;

    public j(k0 k0Var) {
        this.f160334a = k0Var;
        mmm.h hVar = new mmm.h();
        this.f160335b = hVar;
        this.f160336c = new e(hVar);
        this.d = 16384;
    }

    @Override // icm.b
    public final synchronized void D9(boolean z, int i, mmm.h hVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        d(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.f160334a.write(hVar, i2);
        }
    }

    @Override // icm.b
    public final int H7() {
        return this.d;
    }

    @Override // icm.b
    public final synchronized void J7(a aVar, byte[] bArr) {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            if (aVar.httpCode == -1) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            d(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f160334a.writeInt(0);
            this.f160334a.writeInt(aVar.httpCode);
            if (bArr.length > 0) {
                this.f160334a.write(bArr);
            }
            this.f160334a.flush();
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // icm.b
    public final synchronized void O8(int i, int i2, boolean z) {
        if (this.e) {
            throw new IOException("closed");
        }
        d(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f160334a.writeInt(i);
        this.f160334a.writeInt(i2);
        this.f160334a.flush();
    }

    @Override // icm.b
    public final synchronized void T9(int i, a aVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (aVar.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        d(i, 4, (byte) 3, (byte) 0);
        this.f160334a.writeInt(aVar.httpCode);
        this.f160334a.flush();
    }

    @Override // icm.b
    public final synchronized void V7(m mVar) {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            int i = 0;
            d(0, Integer.bitCount(mVar.f160342a) * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (mVar.c(i)) {
                    this.f160334a.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f160334a.writeInt(((int[]) mVar.f160343b)[i]);
                }
                i++;
            }
            this.f160334a.flush();
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // icm.b
    public final synchronized void a2(int i, List list, boolean z) {
        if (this.e) {
            throw new IOException("closed");
        }
        f(i, list, z);
    }

    @Override // icm.b
    public final synchronized void c8(m mVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = this.d;
        if ((mVar.f160342a & 32) != 0) {
            i = ((int[]) mVar.f160343b)[5];
        }
        this.d = i;
        d(0, 0, (byte) 4, (byte) 1);
        this.f160334a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.f160334a.close();
    }

    public final void d(int i, int i2, byte b4, byte b5) {
        Logger logger = k.f160337a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(h.a(false, i, i2, b4, b5));
        }
        int i3 = this.d;
        if (i2 > i3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a0.d.g(i3, i2, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(a0.d.n("reserved bit set: ", i));
        }
        k0 k0Var = this.f160334a;
        k0Var.writeByte((i2 >>> 16) & 255);
        k0Var.writeByte((i2 >>> 8) & 255);
        k0Var.writeByte(i2 & 255);
        k0Var.writeByte(b4 & UnsignedBytes.MAX_VALUE);
        k0Var.writeByte(b5 & UnsignedBytes.MAX_VALUE);
        k0Var.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r18, java.util.List r19, boolean r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: icm.j.f(int, java.util.List, boolean):void");
    }

    @Override // icm.b
    public final synchronized void flush() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.f160334a.flush();
    }

    @Override // icm.b
    public final synchronized void q6(int i, long j2) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2);
        }
        d(i, 4, (byte) 8, (byte) 0);
        this.f160334a.writeInt((int) j2);
        this.f160334a.flush();
    }

    @Override // icm.b
    public final synchronized void w1() {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            Logger logger = k.f160337a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(">> CONNECTION " + k.f160338b.e());
            }
            this.f160334a.write(k.f160338b.u());
            this.f160334a.flush();
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
