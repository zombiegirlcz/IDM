package jlm;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f175876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f175877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f175878c;

    public e(c source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f175876a = source;
        this.f175878c = new a();
    }

    @Override // jlm.k
    public final boolean J() {
        if (this.f175877b) {
            throw new IllegalStateException("Source is closed.");
        }
        a aVar = this.f175878c;
        return aVar.J() && this.f175876a.j2(aVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1;
    }

    @Override // jlm.k
    public final boolean a(long j2) {
        a aVar;
        if (this.f175877b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount: ").toString());
        }
        do {
            aVar = this.f175878c;
            if (aVar.f175871c >= j2) {
                return true;
            }
        } while (this.f175876a.j2(aVar, FileAppender.DEFAULT_BUFFER_SIZE) != -1);
        return false;
    }

    @Override // jlm.k
    public final void b(long j2) throws EOFException {
        if (!a(j2)) {
            throw new EOFException(p.a.n(j2, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws EOFException {
        if (this.f175877b) {
            return;
        }
        this.f175877b = true;
        this.f175876a.e = true;
        a aVar = this.f175878c;
        aVar.skip(aVar.f175871c);
    }

    @Override // jlm.k
    public final a getBuffer() {
        return this.f175878c;
    }

    @Override // jlm.d
    public final long j2(a sink, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f175877b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount: ").toString());
        }
        a aVar = this.f175878c;
        if (aVar.f175871c == 0 && this.f175876a.j2(aVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
            return -1L;
        }
        return aVar.j2(sink, Math.min(j2, aVar.f175871c));
    }

    @Override // jlm.k
    public final e peek() {
        if (this.f175877b) {
            throw new IllegalStateException("Source is closed.");
        }
        c cVar = new c(this);
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new e(cVar);
    }

    @Override // jlm.k
    public final byte readByte() throws EOFException {
        b(1L);
        return this.f175878c.readByte();
    }

    public final String toString() {
        return "buffered(" + this.f175876a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
