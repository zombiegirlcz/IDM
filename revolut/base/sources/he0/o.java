package he0;

import com.google.gson.JsonParseException;
import java.io.IOException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import kg.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o extends l0 {
    @Override // kg.l0
    public final Object c(qg.a input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        String strY = input.y();
        Intrinsics.h(strY);
        if (strY.length() == 0) {
            throw new JsonParseException("Empty date string");
        }
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(strY);
        Intrinsics.checkNotNullExpressionValue(zonedDateTime, "let(...)");
        return zonedDateTime;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.time.ZonedDateTime] */
    @Override // kg.l0
    public final void d(qg.c out, Object obj2) throws IOException {
        ?? WithZoneSameInstant;
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj2;
        Intrinsics.checkNotNullParameter(out, "out");
        out.s((zonedDateTime == null || (WithZoneSameInstant = zonedDateTime.withZoneSameInstant((ZoneId) ZoneOffset.UTC)) == 0) ? null : WithZoneSameInstant.toString());
    }
}
