package he0;

import java.io.IOException;
import java.time.Instant;
import kg.l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l0 {
    @Override // kg.l0
    public final Object c(qg.a jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        qg.b bVarA = jsonReader.A();
        if (bVarA == qg.b.NULL) {
            jsonReader.w();
            return null;
        }
        if (bVarA != qg.b.STRING) {
            return Instant.ofEpochMilli(jsonReader.t());
        }
        String strY = jsonReader.y();
        Intrinsics.h(strY);
        Long lN = z.n(strY);
        return lN != null ? Instant.ofEpochMilli(lN.longValue()) : Instant.parse(strY);
    }

    @Override // kg.l0
    public final void d(qg.c out, Object obj2) throws IOException {
        Instant instant = (Instant) obj2;
        Intrinsics.checkNotNullParameter(out, "out");
        if (instant == null) {
            out.m();
        } else {
            out.u(instant.toEpochMilli());
        }
    }
}
