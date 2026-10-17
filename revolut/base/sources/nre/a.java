package nre;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import sre.g;
import sre.h;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    static r a(a aVar, int i) {
        return ((h) aVar).e.f(new g(null, null), true);
    }

    static pfm.r b(a aVar, String termsId) {
        h hVar = (h) aVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(termsId, "termsId");
        return w.g0(hVar.f265197a.acceptTerms(termsId, new qre.a(null), null));
    }
}
