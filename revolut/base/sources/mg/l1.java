package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class l1 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        try {
            return new AtomicInteger(aVar.s());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        cVar.u(((AtomicInteger) obj2).get());
    }
}
