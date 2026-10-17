package hr3;

import hr3.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {
    public static final ds3.b a(a.C0884a c0884a) {
        Intrinsics.checkNotNullParameter(c0884a, "<this>");
        String text = c0884a.getText();
        String action = c0884a.getAction();
        ds3.a aVar = null;
        if (action != null) {
            ds3.a[] aVarArrValues = ds3.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                ds3.a aVar2 = aVarArrValues[i];
                if (a0.z(aVar2.name(), action, true)) {
                    aVar = aVar2;
                    break;
                }
                i++;
            }
        }
        return new ds3.b(text, aVar);
    }
}
