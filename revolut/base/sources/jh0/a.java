package jh0;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static b a(int i) {
        b bVar;
        b[] bVarArrValues = b.values();
        int length = bVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i2];
            if (bVar.code == i) {
                break;
            }
            i2++;
        }
        if (bVar == null) {
            String simpleName = a.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.b(c.WARNING, simpleName, a0.d.n("Can't find a status for the code: ", i), null, null, 16);
        }
        return bVar == null ? b.UNKNOWN : bVar;
    }
}
