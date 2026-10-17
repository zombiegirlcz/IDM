package g04;

import g04.a;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {
    public static final iu3.b a(a.C0809a.C0810a.C0811a c0811a) {
        iu3.a aVar;
        String title = c0811a.getTitle();
        String action = c0811a.getAction();
        iu3.a[] aVarArrValues = iu3.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), action, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = iu3.a.CLOSE_APPLICATION;
        }
        return new iu3.b(title, aVar);
    }
}
