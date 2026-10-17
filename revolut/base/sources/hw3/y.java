package hw3;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y {
    public static o a(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        String strD = o80.c.d(new File(filePath));
        return strD == null ? o.UNKNOWN : kotlin.text.a0.H(strD, "image/", false) ? o.IMAGE : strD.equals("application/pdf") ? o.PDF : o.UNKNOWN;
    }
}
