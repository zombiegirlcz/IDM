package u91;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m {
    private m() {
    }

    public static n a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        String upperCase = id10.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        n nVar = n.CREATED;
        if (!Intrinsics.f(upperCase, nVar.getId())) {
            n nVar2 = n.SUBMITTED;
            if (Intrinsics.f(upperCase, nVar2.getId())) {
                return nVar2;
            }
            n nVar3 = n.SELECTED;
            if (Intrinsics.f(upperCase, nVar3.getId())) {
                return nVar3;
            }
            n nVar4 = n.INFORMATION_REQUIRED;
            if (Intrinsics.f(upperCase, nVar4.getId())) {
                return nVar4;
            }
            n nVar5 = n.PROCESSED;
            if (Intrinsics.f(upperCase, nVar5.getId())) {
                return nVar5;
            }
        }
        return nVar;
    }
}
