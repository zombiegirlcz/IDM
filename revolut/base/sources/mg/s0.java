package mg;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() != qg.b.NULL) {
            return new StringBuilder(aVar.y());
        }
        aVar.w();
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        StringBuilder sb6 = (StringBuilder) obj2;
        cVar.s(sb6 == null ? null : sb6.toString());
    }
}
