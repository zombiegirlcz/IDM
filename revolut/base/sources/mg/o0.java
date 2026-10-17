package mg;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        qg.b bVarA = aVar.A();
        if (bVarA != qg.b.NULL) {
            return bVarA == qg.b.BOOLEAN ? Boolean.toString(aVar.q()) : aVar.y();
        }
        aVar.w();
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        cVar.s((String) obj2);
    }
}
