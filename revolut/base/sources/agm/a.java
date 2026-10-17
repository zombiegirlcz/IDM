package agm;

import efm.r;
import java.util.concurrent.TimeUnit;
import kfm.g;
import tfm.c4;
import tfm.f4;
import tfm.n4;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends r {
    public abstract void d(g gVar);

    public final n4 e() {
        return new n4(this instanceof c4 ? new f4(((c4) this).f270387g) : this, 0L, TimeUnit.NANOSECONDS, null);
    }
}
