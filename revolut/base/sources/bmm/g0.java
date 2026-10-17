package bmm;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class g0 implements Closeable {

    @NotNull
    public static final f0 Companion = new f0();
    public static final Logger f = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.j f16921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mmm.h f16922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16923c;
    public boolean d;
    public final g e;

    public g0(mmm.j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f16921a = sink;
        mmm.h hVar = new mmm.h();
        this.f16922b = hVar;
        this.f16923c = 16384;
        this.e = new g(hVar);
    }

    public final void D9(boolean z, int i, mmm.h hVar, int i2) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            f(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                mmm.j jVar = this.f16921a;
                Intrinsics.h(hVar);
                jVar.write(hVar, i2);
            }
            Unit unit = Unit.f186387a;
        }
    }

    public final void O8(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            f(0, 8, 6, z ? 1 : 0);
            this.f16921a.writeInt(i);
            this.f16921a.writeInt(i2);
            this.f16921a.flush();
            Unit unit = Unit.f186387a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.d = true;
            this.f16921a.close();
            Unit unit = Unit.f186387a;
        }
    }

    public final void d(m0 peerSettings) {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                int i = this.f16923c;
                int i2 = peerSettings.f16948a;
                if ((i2 & 32) != 0) {
                    i = peerSettings.f16949b[5];
                }
                this.f16923c = i;
                if (((i2 & 2) != 0 ? peerSettings.f16949b[1] : -1) != -1) {
                    g gVar = this.e;
                    int i3 = (i2 & 2) != 0 ? peerSettings.f16949b[1] : -1;
                    gVar.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i5 = gVar.d;
                    if (i5 != iMin) {
                        if (iMin < i5) {
                            gVar.f16917b = Math.min(gVar.f16917b, iMin);
                        }
                        gVar.f16918c = true;
                        gVar.d = iMin;
                        int i6 = gVar.f16920h;
                        if (iMin < i6) {
                            if (iMin == 0) {
                                e[] eVarArr = gVar.e;
                                zhm.p.p(eVarArr, 0, eVarArr.length, null);
                                gVar.f = gVar.e.length - 1;
                                gVar.f16919g = 0;
                                gVar.f16920h = 0;
                            } else {
                                gVar.a(i6 - iMin);
                            }
                        }
                    }
                }
                f(0, 0, 4, 1);
                this.f16921a.flush();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void f(int i, int i2, int i3, int i5) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f;
            if (logger.isLoggable(level)) {
                logger.fine(i.b(i, i2, i3, i5, false));
            }
        }
        if (i2 > this.f16923c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f16923c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(a0.d.n("reserved bit set: ", i).toString());
        }
        mmm.j jVar = this.f16921a;
        vlm.h.C(i2, jVar);
        jVar.writeByte(i3 & 255);
        jVar.writeByte(i5 & 255);
        jVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final void flush() {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.f16921a.flush();
            Unit unit = Unit.f186387a;
        }
    }

    public final void g(int i, b errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (errorCode.a() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            f(0, debugData.length + 8, 7, 0);
            this.f16921a.writeInt(i);
            this.f16921a.writeInt(errorCode.a());
            if (debugData.length != 0) {
                this.f16921a.write(debugData);
            }
            this.f16921a.flush();
            Unit unit = Unit.f186387a;
        }
    }

    public final void h(ArrayList headerBlock, int i, boolean z) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.e.d(headerBlock);
            long j2 = this.f16922b.f207266b;
            long jMin = Math.min(this.f16923c, j2);
            int i2 = j2 == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            f(i, (int) jMin, 1, i2);
            this.f16921a.write(this.f16922b, jMin);
            if (j2 > jMin) {
                long j3 = j2 - jMin;
                while (j3 > 0) {
                    long jMin2 = Math.min(this.f16923c, j3);
                    j3 -= jMin2;
                    f(i, (int) jMin2, 9, j3 == 0 ? 4 : 0);
                    this.f16921a.write(this.f16922b, jMin2);
                }
            }
            Unit unit = Unit.f186387a;
        }
    }

    public final void i(int i, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (errorCode.a() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            f(i, 4, 3, 0);
            this.f16921a.writeInt(errorCode.a());
            this.f16921a.flush();
            Unit unit = Unit.f186387a;
        }
    }

    public final void q6(int i, long j2) {
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                if (j2 == 0 || j2 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
                }
                Logger logger = f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(i.c(i, 4, j2, false));
                }
                f(i, 4, 8, 0);
                this.f16921a.writeInt((int) j2);
                this.f16921a.flush();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
