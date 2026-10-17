package uea;

import kotlin.jvm.internal.Intrinsics;
import xda.y;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private c() {
    }

    public static String a(y yVar, String prefix) {
        String str;
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        String str2 = yVar.f304377a;
        String str3 = yVar.f304378b.f306286a;
        String strName = yVar.f304379c.name();
        wi0.b bVar = yVar.f;
        if (bVar == null || (str = bVar.f297794a) == null) {
            str = "default";
        }
        String str4 = yVar.e;
        if (str4 == null) {
            str4 = "internal";
        }
        StringBuilder sbT = p.a.t(prefix, "-", str2, "-", str3);
        j6.a.D(sbT, "-", strName, "-", str);
        return v0.a.i(sbT, "-", str4);
    }

    public static String b(yda.a aVar, String prefix) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return prefix + "-" + aVar.f312666a + "-" + aVar.f312667b;
    }
}
