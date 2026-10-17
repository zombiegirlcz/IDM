package k50;

import java.util.Comparator;
import org.joda.time.ReadableInstant;

/* JADX INFO: loaded from: classes19.dex */
public final class q1 implements Comparator {
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(java.util.List r23, java.util.Collection r24, java.util.List r25) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.q1.a(java.util.List, java.util.Collection, java.util.List):java.util.ArrayList");
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        v20.n nVar = (v20.n) obj2;
        v20.n nVar2 = (v20.n) obj3;
        if (nVar == null) {
            return 1;
        }
        if (nVar2 == null) {
            return -1;
        }
        return nVar.getTime().compareTo((ReadableInstant) nVar2.getTime());
    }
}
