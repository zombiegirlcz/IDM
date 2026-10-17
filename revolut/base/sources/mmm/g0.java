package mmm;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class g0 {
    public static h0 a(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        m mVar = nmm.c.f217395a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        h hVar = new h();
        hVar.D(str);
        return nmm.c.d(hVar, z);
    }

    public static h0 b(g0 g0Var, File file) {
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(file, "<this>");
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return a(string, false);
    }

    public static /* synthetic */ h0 c(g0 g0Var, String str) {
        g0Var.getClass();
        return a(str, false);
    }
}
