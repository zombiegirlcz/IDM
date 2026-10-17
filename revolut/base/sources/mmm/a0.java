package mmm;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes13.dex */
public final class a0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f207245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f207246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f207247c;
    public boolean d;

    public a0(l0 source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f207245a = source;
        this.f207246b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.f207246b.end();
        this.d = true;
        this.f207245a.close();
    }

    public final long d(h sink, long j2) throws IOException {
        Inflater inflater = this.f207246b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (j2 != 0) {
            try {
                n0 n0VarU = sink.u(1);
                int iMin = (int) Math.min(j2, 8192 - n0VarU.f207293c);
                boolean zNeedsInput = inflater.needsInput();
                l0 l0Var = this.f207245a;
                if (zNeedsInput && !l0Var.J()) {
                    n0 n0Var = l0Var.f207283b.f207265a;
                    Intrinsics.h(n0Var);
                    int i = n0Var.f207293c;
                    int i2 = n0Var.f207292b;
                    int i3 = i - i2;
                    this.f207247c = i3;
                    inflater.setInput(n0Var.f207291a, i2, i3);
                }
                int iInflate = inflater.inflate(n0VarU.f207291a, n0VarU.f207293c, iMin);
                int i5 = this.f207247c;
                if (i5 != 0) {
                    int remaining = i5 - inflater.getRemaining();
                    this.f207247c -= remaining;
                    l0Var.skip(remaining);
                }
                if (iInflate > 0) {
                    n0VarU.f207293c += iInflate;
                    long j3 = iInflate;
                    sink.f207266b += j3;
                    return j3;
                }
                if (n0VarU.f207292b == n0VarU.f207293c) {
                    sink.f207265a = n0VarU.a();
                    o0.a(n0VarU);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // mmm.s0
    public final long read(h sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jD = d(sink, j2);
            if (jD > 0) {
                return jD;
            }
            Inflater inflater = this.f207246b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f207245a.J());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f207245a.f207282a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(s0 source, Inflater inflater) {
        this(u1.c(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
