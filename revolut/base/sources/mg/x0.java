package mg;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
public class x0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() != qg.b.NULL) {
            return InetAddress.getByName(aVar.y());
        }
        aVar.w();
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        InetAddress inetAddress = (InetAddress) obj2;
        cVar.s(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
