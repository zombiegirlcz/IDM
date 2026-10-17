package zp0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private e() {
    }

    public static String a(u80.d decimalFormat, boolean z) {
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        if (!z) {
            m70.a.c(t0.f186434a);
            return "";
        }
        if (decimalFormat.b() != 1) {
            return decimalFormat.c();
        }
        String positiveSuffix = decimalFormat.f278029a.getPositiveSuffix();
        Intrinsics.checkNotNullExpressionValue(positiveSuffix, "getPositiveSuffix(...)");
        return positiveSuffix;
    }

    public static List b(u80.d decimalFormat) {
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        char cD = decimalFormat.d();
        return zhm.v.k(new jm.b(false, String.valueOf(cD), cD), new jm.b(false, "123456789", '*'));
    }
}
