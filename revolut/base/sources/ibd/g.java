package ibd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    private g() {
    }

    public static h a(String str) {
        h hVar;
        h[] hVarArrValues = h.values();
        int length = hVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                hVar = null;
                break;
            }
            hVar = hVarArrValues[i];
            if (Intrinsics.f(hVar.a(), str)) {
                break;
            }
            i++;
        }
        return hVar == null ? h.UNKNOWN : hVar;
    }
}
