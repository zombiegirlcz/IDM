package r8j;

import efm.r;
import io3.i;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import r4k.x;
import w4l.h;

/* JADX INFO: loaded from: classes11.dex */
public interface d {
    static r a(d dVar, xi0.b currency) {
        g gVar = (g) dVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(kli.a.h(osg.b.g(gVar.f252466a, loadingStrategy, null, null, i.INTERNAL, null, null, null, LDSFile.EF_DG4_TAG), hng.g.b(((ang.b) gVar.f252467b).f7765a)), new x(gVar, currency, 7));
    }
}
