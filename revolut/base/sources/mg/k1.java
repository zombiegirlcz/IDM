package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class k1 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        try {
            return Integer.valueOf(aVar.s());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        if (((Number) obj2) == null) {
            cVar.m();
        } else {
            cVar.u(r4.intValue());
        }
    }
}
