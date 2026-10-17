package ylm;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends xlm.a {
    public final /* synthetic */ z e;
    public final /* synthetic */ grj.o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, z zVar, grj.o oVar) {
        super(str, true);
        this.e = zVar;
        this.f = oVar;
    }

    @Override // xlm.a
    public final long a() throws InterruptedException {
        y yVar;
        z zVar = this.e;
        try {
            yVar = zVar.f();
        } catch (Throwable th10) {
            yVar = new y(zVar, null, th10, 2);
        }
        grj.o oVar = this.f;
        if (!((CopyOnWriteArrayList) oVar.e).contains(zVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) oVar.f).put(yVar);
        return -1L;
    }
}
