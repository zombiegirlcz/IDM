package mmm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207255a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f207256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f207257c;

    public e(InputStream input, v0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f207256b = input;
        this.f207257c = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f207255a;
        Object obj2 = this.f207256b;
        switch (i) {
            case 0:
                nmm.k kVar = (nmm.k) obj2;
                e eVar = (e) this.f207257c;
                kVar.j();
                try {
                    eVar.close();
                    Unit unit = Unit.f186387a;
                    if (kVar.k()) {
                        throw kVar.m(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!kVar.k()) {
                        throw e;
                    }
                    throw kVar.m(e);
                } finally {
                    kVar.k();
                }
            default:
                ((InputStream) obj2).close();
                return;
        }
    }

    @Override // mmm.s0
    public final long read(h sink, long j2) {
        switch (this.f207255a) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                nmm.k kVar = (nmm.k) this.f207256b;
                e eVar = (e) this.f207257c;
                kVar.j();
                try {
                    long j3 = eVar.read(sink, j2);
                    if (kVar.k()) {
                        throw kVar.m(null);
                    }
                    return j3;
                } catch (IOException e) {
                    if (kVar.k()) {
                        throw kVar.m(e);
                    }
                    throw e;
                } finally {
                    kVar.k();
                }
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                if (j2 == 0) {
                    return 0L;
                }
                if (j2 < 0) {
                    throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
                }
                try {
                    ((v0) this.f207257c).f();
                    n0 n0VarU = sink.u(1);
                    int i = ((InputStream) this.f207256b).read(n0VarU.f207291a, n0VarU.f207293c, (int) Math.min(j2, 8192 - n0VarU.f207293c));
                    if (i == -1) {
                        if (n0VarU.f207292b == n0VarU.f207293c) {
                            sink.f207265a = n0VarU.a();
                            o0.a(n0VarU);
                        }
                        return -1L;
                    }
                    n0VarU.f207293c += i;
                    long j5 = i;
                    sink.f207266b += j5;
                    return j5;
                } catch (AssertionError e2) {
                    if (nmm.n.a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // mmm.s0
    public final v0 timeout() {
        switch (this.f207255a) {
            case 0:
                return (nmm.k) this.f207256b;
            default:
                return (v0) this.f207257c;
        }
    }

    public final String toString() {
        switch (this.f207255a) {
            case 0:
                return "AsyncTimeout.source(" + ((e) this.f207257c) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            default:
                return "source(" + ((InputStream) this.f207256b) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public e(nmm.k kVar, e eVar) {
        this.f207256b = kVar;
        this.f207257c = eVar;
    }
}
