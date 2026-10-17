package he0;

import com.google.gson.JsonParseException;
import java.io.IOException;
import java.time.Period;
import kg.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends l0 {
    @Override // kg.l0
    public final Object c(qg.a input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        String strY = input.y();
        Intrinsics.h(strY);
        if (strY.length() == 0) {
            throw new JsonParseException("Empty period string");
        }
        Period period = Period.parse(strY);
        Intrinsics.checkNotNullExpressionValue(period, "let(...)");
        return period;
    }

    @Override // kg.l0
    public final void d(qg.c out, Object obj2) throws IOException {
        Period period = (Period) obj2;
        Intrinsics.checkNotNullParameter(out, "out");
        out.s(period != null ? period.toString() : null);
    }
}
