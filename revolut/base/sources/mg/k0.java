package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        try {
            return Long.valueOf(aVar.t());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        Number number = (Number) obj2;
        if (number == null) {
            cVar.m();
        } else {
            cVar.u(number.longValue());
        }
    }
}
