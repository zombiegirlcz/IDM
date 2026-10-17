package xa1;

import efm.r;
import jfc.h;
import kotlin.jvm.internal.Intrinsics;
import mfc.c;

/* JADX INFO: loaded from: classes20.dex */
public interface a {
    static r a(a aVar, com.revolut.feature.acquiring.card_reader.order.api.model.a request, int i) {
        if ((i & 1) != 0) {
            request = new com.revolut.feature.acquiring.card_reader.order.api.model.a(0);
        }
        boolean z = (i & 2) == 0;
        c cVar = (c) aVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        h hVar = (h) cVar.f204988a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return hVar.d.f(request, z);
    }
}
