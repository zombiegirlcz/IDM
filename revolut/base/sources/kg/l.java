package kg;

import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class l extends l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() != qg.b.NULL) {
            return Long.valueOf(aVar.t());
        }
        aVar.w();
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        Number number = (Number) obj2;
        if (number == null) {
            cVar.m();
        } else {
            cVar.s(number.toString());
        }
    }
}
