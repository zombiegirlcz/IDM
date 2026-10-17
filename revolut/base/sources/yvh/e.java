package yvh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    private e() {
    }

    public static f a(String str) {
        f fVar;
        f[] fVarArrValues = f.values();
        int length = fVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i];
            if (Intrinsics.f(fVar.a(), str)) {
                break;
            }
            i++;
        }
        return fVar == null ? f.UNKNOWN : fVar;
    }
}
