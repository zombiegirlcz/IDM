package mmm;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class k0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f207279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f207280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f207281c;

    public k0(q0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f207279a = sink;
        this.f207280b = new h();
    }

    @Override // mmm.j
    public final j I8(m byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        this.f207280b.v(byteString);
        d();
        return this;
    }

    @Override // mmm.j
    public final j L5(int i) {
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        this.f207280b.E(i);
        d();
        return this;
    }

    @Override // mmm.j
    public final j N9(int i, int i2, byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        this.f207280b.write(source, i, i2);
        d();
        return this;
    }

    @Override // mmm.j
    public final long R8(s0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = 0;
        while (true) {
            long j3 = source.read(this.f207280b, FileAppender.DEFAULT_BUFFER_SIZE);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
            d();
        }
    }

    @Override // mmm.j
    public final OutputStream W9() {
        return new j0(this);
    }

    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q0 q0Var = this.f207279a;
        if (this.f207281c) {
            return;
        }
        try {
            h hVar = this.f207280b;
            long j2 = hVar.f207266b;
            if (j2 > 0) {
                q0Var.write(hVar, j2);
            }
            th = null;
        } catch (Throwable th10) {
            th = th10;
        }
        try {
            q0Var.close();
        } catch (Throwable th11) {
            if (th == null) {
                th = th11;
            }
        }
        this.f207281c = true;
        if (th != null) {
            throw th;
        }
    }

    public final j d() {
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f207280b;
        long jH = hVar.h();
        if (jH > 0) {
            this.f207279a.write(hVar, jH);
        }
        return this;
    }

    @Override // mmm.j, mmm.q0, java.io.Flushable
    public final void flush() {
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f207280b;
        long j2 = hVar.f207266b;
        q0 q0Var = this.f207279a;
        if (j2 > 0) {
            q0Var.write(hVar, j2);
        }
        q0Var.flush();
    }

    @Override // mmm.j
    public final h getBuffer() {
        return this.f207280b;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f207281c;
    }

    @Override // mmm.j
    public final j l3(long j2) {
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        this.f207280b.x(j2);
        d();
        return this;
    }

    @Override // mmm.j
    public final j m9(int i, int i2, String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        this.f207280b.C(i, i2, string);
        d();
        return this;
    }

    @Override // mmm.j
    public final j p0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        this.f207280b.D(string);
        d();
        return this;
    }

    @Override // mmm.q0
    public final v0 timeout() {
        return this.f207279a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f207279a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f207280b.write(source);
        d();
        return iWrite;
    }

    @Override // mmm.j
    public final j writeByte(int i) {
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        this.f207280b.w(i);
        d();
        return this;
    }

    @Override // mmm.j
    public final j writeInt(int i) {
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        this.f207280b.z(i);
        d();
        return this;
    }

    @Override // mmm.j
    public final j writeShort(int i) {
        if (this.f207281c) {
            throw new IllegalStateException("closed");
        }
        this.f207280b.A(i);
        d();
        return this;
    }

    @Override // mmm.q0
    public final void write(h source, long j2) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f207281c) {
            this.f207280b.write(source, j2);
            d();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // mmm.j
    public final j write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f207281c) {
            this.f207280b.m3801write(source);
            d();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
