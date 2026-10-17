package sg;

import cam.f;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f262571b;

    public final void F() {
        c cVar = this.f262571b;
        b bVar = cVar.f262569b;
        synchronized (bVar.d) {
            bVar.f262568c.clear();
            xg.a aVar = bVar.d;
            aVar.d = null;
            LinkedHashSet linkedHashSet = aVar.f305457c;
            if (linkedHashSet != null) {
                linkedHashSet.clear();
            }
        }
        cVar.f262570c.evictAll();
    }
}
