package d29;

import j29.c;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.a0;
import rd0.d;
import y19.i;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final y19.a a(c cVar) {
        return new y19.a(mo3.a.o(cVar.d), cVar.f170740a, cVar.f170741b, cVar.f170742c, cVar.e);
    }

    public static final y19.a b(m29.a aVar) {
        return new y19.a(hx7.a.v(aVar.getMoneySaved()), aVar.getTitle(), aVar.getSubtitle(), aVar.getIcon(), aVar.getProduct());
    }

    public static final i c(String str) {
        i iVar;
        i[] iVarArrValues = i.values();
        int length = iVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                iVar = null;
                break;
            }
            iVar = iVarArrValues[i];
            if (a0.z(iVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (iVar != null) {
            return iVar;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown savings type: ", str));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return i.UNKNOWN;
    }

    public static final m29.a d(y19.a aVar) {
        return new m29.a(aVar.f310328a, aVar.f310329b, aVar.f310330c, aVar.e, hx7.a.A(aVar.d));
    }
}
