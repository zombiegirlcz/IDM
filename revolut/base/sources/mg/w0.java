package mg;

import com.google.gson.JsonIOException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        try {
            String strY = aVar.y();
            if (strY.equals("null")) {
                return null;
            }
            return new URI(strY);
        } catch (URISyntaxException e) {
            throw new JsonIOException(e);
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        URI uri2 = (URI) obj2;
        cVar.s(uri2 == null ? null : uri2.toASCIIString());
    }
}
