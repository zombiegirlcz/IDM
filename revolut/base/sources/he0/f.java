package he0;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.time.LocalDate;
import kg.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends l0 {
    @Override // kg.l0
    public final Object c(qg.a jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        if (jsonReader.A() == qg.b.NULL) {
            jsonReader.w();
            return null;
        }
        try {
            return LocalDate.parse(jsonReader.y());
        } catch (Throwable th10) {
            throw new JsonSyntaxException(th10);
        }
    }

    @Override // kg.l0
    public final void d(qg.c jsonWriter, Object obj2) throws IOException {
        LocalDate localDate = (LocalDate) obj2;
        Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
        jsonWriter.s(localDate != null ? localDate.toString() : null);
    }
}
