package jlm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f175872a;

    public b(InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f175872a = input;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f175872a.close();
    }

    @Override // jlm.d
    public final long j2(a sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.n(j2, "byteCount (", ") < 0").toString());
        }
        boolean z = false;
        try {
            i iVarJ = sink.j(1);
            byte[] data = iVarJ.f175881a;
            long j3 = this.f175872a.read(data, iVarJ.f175883c, (int) Math.min(j2, data.length - r5));
            int i = j3 == -1 ? 0 : (int) j3;
            if (i == 1) {
                Intrinsics.checkNotNullParameter(data, "data");
                iVarJ.f175883c += i;
                sink.f175871c += (long) i;
                return j3;
            }
            if (i < 0 || i > iVarJ.a()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + iVarJ.a()).toString());
            }
            if (i == 0) {
                if (l.d(iVarJ)) {
                    sink.g();
                }
                return j3;
            }
            Intrinsics.checkNotNullParameter(data, "data");
            iVarJ.f175883c += i;
            sink.f175871c += (long) i;
            return j3;
        } catch (AssertionError e) {
            Intrinsics.checkNotNullParameter(e, "<this>");
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? d0.J(message, "getsockname failed", false) : false) {
                    z = true;
                }
            }
            if (z) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final String toString() {
        return "RawSource(" + this.f175872a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
