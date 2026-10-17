package mmm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207252a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f207253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f207254c;

    public d(OutputStream out, v0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f207253b = out;
        this.f207254c = timeout;
    }

    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f207252a;
        Object obj2 = this.f207253b;
        switch (i) {
            case 0:
                nmm.k kVar = (nmm.k) obj2;
                d dVar = (d) this.f207254c;
                kVar.j();
                try {
                    dVar.close();
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
                ((OutputStream) obj2).close();
                return;
        }
    }

    @Override // mmm.q0, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f207252a;
        Object obj2 = this.f207253b;
        switch (i) {
            case 0:
                nmm.k kVar = (nmm.k) obj2;
                d dVar = (d) this.f207254c;
                kVar.j();
                try {
                    dVar.flush();
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
                ((OutputStream) obj2).flush();
                return;
        }
    }

    @Override // mmm.q0
    public final v0 timeout() {
        switch (this.f207252a) {
            case 0:
                return (nmm.k) this.f207253b;
            default:
                return (v0) this.f207254c;
        }
    }

    public final String toString() {
        switch (this.f207252a) {
            case 0:
                return "AsyncTimeout.sink(" + ((d) this.f207254c) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            default:
                return "sink(" + ((OutputStream) this.f207253b) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Override // mmm.q0
    public final void write(h source, long j2) throws IOException {
        long j3;
        int i = this.f207252a;
        Object obj2 = this.f207253b;
        Object obj3 = this.f207254c;
        Intrinsics.checkNotNullParameter(source, "source");
        switch (i) {
            case 0:
                b.b(source.f207266b, 0L, j2);
                for (long j5 = j2; j5 > 0; j5 -= j3) {
                    n0 n0Var = source.f207265a;
                    Intrinsics.h(n0Var);
                    j3 = 0;
                    while (true) {
                        if (j3 < 65536) {
                            j3 += (long) (n0Var.f207293c - n0Var.f207292b);
                            if (j3 >= j5) {
                                j3 = j5;
                            } else {
                                n0Var = n0Var.f;
                                Intrinsics.h(n0Var);
                            }
                        }
                    }
                    nmm.k kVar = (nmm.k) obj2;
                    d dVar = (d) obj3;
                    kVar.j();
                    try {
                        dVar.write(source, j3);
                        Unit unit = Unit.f186387a;
                        if (kVar.k()) {
                            throw kVar.m(null);
                        }
                    } catch (IOException e) {
                        if (!kVar.k()) {
                            throw e;
                        }
                        throw kVar.m(e);
                    } finally {
                        kVar.k();
                    }
                }
                return;
            default:
                b.b(source.f207266b, 0L, j2);
                long j16 = j2;
                while (j16 > 0) {
                    ((v0) obj3).f();
                    n0 n0Var2 = source.f207265a;
                    Intrinsics.h(n0Var2);
                    int iMin = (int) Math.min(j16, n0Var2.f207293c - n0Var2.f207292b);
                    ((OutputStream) obj2).write(n0Var2.f207291a, n0Var2.f207292b, iMin);
                    int i2 = n0Var2.f207292b + iMin;
                    n0Var2.f207292b = i2;
                    long j22 = iMin;
                    j16 -= j22;
                    source.f207266b -= j22;
                    if (i2 == n0Var2.f207293c) {
                        source.f207265a = n0Var2.a();
                        o0.a(n0Var2);
                    }
                }
                return;
        }
    }

    public d(nmm.k kVar, d dVar) {
        this.f207253b = kVar;
        this.f207254c = dVar;
    }
}
