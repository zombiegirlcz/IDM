package mg;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class g1 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        qg.b bVarA = aVar.A();
        if (bVarA != qg.b.NULL) {
            return bVarA == qg.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.y())) : Boolean.valueOf(aVar.q());
        }
        aVar.w();
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        cVar.v((Boolean) obj2);
    }
}
