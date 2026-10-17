package mg;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class m1 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        return new AtomicBoolean(aVar.q());
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        cVar.w(((AtomicBoolean) obj2).get());
    }
}
