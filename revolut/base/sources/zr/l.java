package zr;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nq.n;
import nq.o;
import nq.p;
import nq.r;
import nq.s;
import nq.t;

/* JADX INFO: loaded from: classes17.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f324518a;

    public l(ne0.j filesCache) {
        Intrinsics.checkNotNullParameter(filesCache, "filesCache");
        this.f324518a = filesCache;
    }

    public final t a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (t) this.f324518a.get(key);
    }

    public final void b(String key, t media) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(media, "media");
        this.f324518a.f(key, media);
    }

    public final void c(List keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator it8 = keys.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            ne0.j jVar = this.f324518a;
            t tVar = (t) jVar.get(str);
            if (tVar != null && !(tVar instanceof n)) {
                if (tVar instanceof r) {
                    ((r) tVar).f218328b.close();
                } else if (!(tVar instanceof nq.j) && !(tVar instanceof o) && !(tVar instanceof nq.h) && !(tVar instanceof nq.l) && !(tVar instanceof nq.k) && !(tVar instanceof nq.g) && !(tVar instanceof p) && !(tVar instanceof s)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            jVar.remove(str);
        }
    }
}
