package sg;

import cam.f;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f262567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f262568c;
    public final xg.a d;

    public b() {
        super(11);
        this.f262567b = 100;
        this.f262568c = new LinkedHashSet();
        this.d = new xg.a(new vg.a(0.0d, 1.0d, 0.0d, 1.0d), 0);
    }

    public final boolean F(ai0.d dVar) {
        boolean zAdd;
        a aVar = new a(dVar);
        synchronized (this.d) {
            try {
                zAdd = this.f262568c.add(aVar);
                if (zAdd) {
                    xg.a aVar2 = this.d;
                    aVar2.getClass();
                    wg.a aVar3 = aVar.f262565b;
                    if (aVar2.f305455a.a(aVar3.f297214a, aVar3.f297215b)) {
                        aVar2.a(aVar3.f297214a, aVar3.f297215b, aVar);
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zAdd;
    }
}
