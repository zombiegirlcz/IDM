package mg;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() != qg.b.NULL) {
            return new com.google.gson.internal.l(aVar.y());
        }
        aVar.w();
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        cVar.r((com.google.gson.internal.l) obj2);
    }
}
