package ppg;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import pcd.h;
import pcd.j;
import w4l.i;
import ypg.p;

/* JADX INFO: loaded from: classes13.dex */
public interface b {
    static r a(b bVar, int i) {
        boolean z = (i & 1) != 0;
        h filter = new h(j.d.f234867a);
        p pVar = (p) bVar;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        return pVar.l(z ? i.f294643c : w4l.h.f294642c, filter);
    }
}
