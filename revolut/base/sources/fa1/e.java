package fa1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {
    private e() {
    }

    public static f a(String text) {
        f fVar;
        Intrinsics.checkNotNullParameter(text, "text");
        f[] fVarArrValues = f.values();
        int length = fVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i];
            if (kotlin.text.a0.z(fVar.a(), text, true)) {
                break;
            }
            i++;
        }
        return fVar == null ? f.MANUAL : fVar;
    }
}
