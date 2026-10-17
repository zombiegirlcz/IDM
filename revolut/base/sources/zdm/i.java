package zdm;

import aem.u;
import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import io.ktor.utils.io.t;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.j;
import okhttp3.RequestBody;
import ulm.b1;

/* JADX INFO: loaded from: classes23.dex */
public final class i extends RequestBody {
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Function0 f321617j;

    public i(Function0 block, Long l2) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.i = l2;
        this.f321617j = block;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        Long l2 = this.i;
        if (l2 != null) {
            return l2.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // okhttp3.RequestBody
    public final void writeTo(j sink) throws IOException {
        ?? r62;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            t tVar = (t) this.f321617j.invoke();
            Intrinsics.checkNotNullParameter(tVar, "<this>");
            mmm.e eVarR = u1.r(new u(tVar, 1));
            Long th10 = null;
            try {
                Long lValueOf = Long.valueOf(sink.R8(eVarR));
                try {
                    eVarR.close();
                } catch (Throwable th11) {
                    th10 = th11;
                }
                Long l2 = th10;
                th10 = lValueOf;
                r62 = l2;
            } catch (Throwable th12) {
                try {
                    eVarR.close();
                    r62 = th12;
                } catch (Throwable th13) {
                    yhm.f.a(th12, th13);
                    r62 = th12;
                }
            }
            if (r62 != 0) {
                throw r62;
            }
            th10.getClass();
        } catch (IOException e) {
            throw e;
        } catch (Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new StreamAdapterIOException(cause);
        }
    }
}
