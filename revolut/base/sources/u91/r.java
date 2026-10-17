package u91;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r {
    private r() {
    }

    public static s a(String str) {
        String upperCase;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        s sVar = s.DAILY;
        if (Intrinsics.f(upperCase, sVar.getId())) {
            return sVar;
        }
        s sVar2 = s.WEEKLY;
        if (Intrinsics.f(upperCase, sVar2.getId())) {
            return sVar2;
        }
        s sVar3 = s.MONTHLY;
        if (Intrinsics.f(upperCase, sVar3.getId())) {
            return sVar3;
        }
        s sVar4 = s.QUARTERLY;
        if (Intrinsics.f(upperCase, sVar4.getId())) {
            return sVar4;
        }
        s sVar5 = s.YEARLY;
        if (Intrinsics.f(upperCase, sVar5.getId())) {
            return sVar5;
        }
        return null;
    }
}
