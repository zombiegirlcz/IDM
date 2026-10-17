package ulm;

import java.io.File;
import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class p1 {
    public static k1 a(File file, b1 b1Var) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new k1(file, b1Var);
    }

    public static o1 b(String str, b1 b1Var) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pair pairB = vlm.b.b(b1Var);
        Charset charset = (Charset) pairB.f186385a;
        b1 b1Var2 = (b1) pairB.f186386b;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return c(b1Var2, bytes, 0, bytes.length);
    }

    public static o1 c(b1 b1Var, byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        vlm.h.e(bArr.length, i, i2);
        return new o1(b1Var, bArr, i2, i);
    }

    public static /* synthetic */ o1 d(p1 p1Var, byte[] bArr, b1 b1Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            b1Var = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        p1Var.getClass();
        return c(b1Var, bArr, i, length);
    }
}
