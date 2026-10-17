package mg;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() != qg.b.NULL) {
            return new StringBuffer(aVar.y());
        }
        aVar.w();
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) obj2;
        cVar.s(stringBuffer == null ? null : stringBuffer.toString());
    }
}
