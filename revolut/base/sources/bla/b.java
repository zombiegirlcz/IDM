package bla;

import ahd.y;
import dfj.f;
import exe.j;
import fla.g;
import jla.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    static j b(b bVar, String code) {
        h hVar = (h) bVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        g gVar = hVar.f175663a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(code, "code");
        return new j(new f(q.q(new y(gVar.e.b(Unit.f186387a, w4l.j.f294644c), gVar, code, 28)), 27), 28);
    }

    static jla.c c(b bVar, String code) {
        h hVar = (h) bVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        g gVar = hVar.f175663a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        jla.f fVar = (jla.f) gVar.f135927c.get("PRODUCT_CATALOGUE_CACHE_KEY");
        if (fVar != null) {
            return gVar.c(fVar, code, null);
        }
        return null;
    }
}
