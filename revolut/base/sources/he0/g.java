package he0;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.time.LocalTime;
import kg.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l0 {
    @Override // kg.l0
    public final Object c(qg.a jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        if (jsonReader.A() == qg.b.NULL) {
            jsonReader.w();
            return null;
        }
        try {
            return LocalTime.parse(jsonReader.y());
        } catch (Throwable th10) {
            throw new JsonSyntaxException(th10);
        }
    }

    @Override // kg.l0
    public final void d(qg.c jsonWriter, Object obj2) throws IOException {
        LocalTime localTime = (LocalTime) obj2;
        Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
        jsonWriter.s(localTime != null ? localTime.toString() : null);
    }
}
