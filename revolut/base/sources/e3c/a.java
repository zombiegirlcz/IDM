package e3c;

import jij.d;
import k3c.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;

/* JADX INFO: loaded from: classes6.dex */
public interface a {
    static d a(a aVar) {
        p pVar = (p) aVar;
        pVar.getClass();
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new d(pVar.e.b(Unit.f186387a, loadingStrategy), 23);
    }
}
