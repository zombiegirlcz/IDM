package wzi;

import akg.n;
import etj.o;
import hzi.b;
import hzi.c;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    static /* synthetic */ n a(a aVar, String str, c cVar, b bVar, int i) {
        if ((i & 2) != 0) {
            cVar = null;
        }
        if ((i & 4) != 0) {
            bVar = null;
        }
        return ((o) aVar).m(str, cVar, bVar);
    }
}
