package mra;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mqa.l;

/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public static String a(String str) {
        String strSubstring = str.substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(str.length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(strSubstring, a0.C("*", 6), strSubstring2);
    }

    public static l b(fqa.a aVar) {
        int i = e.f208092a[aVar.ordinal()];
        if (i == 1) {
            return l.MANUAL;
        }
        if (i == 2) {
            return l.CAMERA;
        }
        if (i == 3) {
            return l.NFC;
        }
        throw new NoWhenBranchMatchedException();
    }
}
