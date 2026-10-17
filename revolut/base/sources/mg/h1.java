package mg;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class h1 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() != qg.b.NULL) {
            return Boolean.valueOf(aVar.y());
        }
        aVar.w();
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        Boolean bool = (Boolean) obj2;
        cVar.s(bool == null ? "null" : bool.toString());
    }
}
