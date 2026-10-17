package o80;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {
    public static boolean a(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        String strB = c.b(new File(filePath));
        qd0.b.Companion.getClass();
        String lowerCase = strB.toLowerCase(qd0.a.f244820c);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return Intrinsics.f(lowerCase, "jpeg") || Intrinsics.f(lowerCase, "jpg") || Intrinsics.f(lowerCase, "bmp") || Intrinsics.f(lowerCase, "png") || Intrinsics.f(lowerCase, "heic");
    }
}
