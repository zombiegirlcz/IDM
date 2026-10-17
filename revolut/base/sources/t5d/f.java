package t5d;

import com.revolut.core.ui_kit.delegates.wh;
import koi.j;
import qv0.p;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public static p5d.b a(j jVar) {
        if (jVar instanceof p) {
            Object f53496h = ((p) jVar).getF53496h();
            p5d.a aVar = f53496h instanceof p5d.a ? (p5d.a) f53496h : null;
            if (aVar != null) {
                return aVar.c();
            }
        } else if (jVar instanceof wh) {
            return a(((wh) jVar).f54925b);
        }
        return null;
    }
}
