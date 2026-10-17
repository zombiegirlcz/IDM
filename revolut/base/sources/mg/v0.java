package mg;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class v0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        String strY = aVar.y();
        if (strY.equals("null")) {
            return null;
        }
        return new URL(strY);
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        URL url2 = (URL) obj2;
        cVar.s(url2 == null ? null : url2.toExternalForm());
    }
}
