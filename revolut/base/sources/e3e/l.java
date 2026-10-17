package e3e;

import com.revolut.core.ui_kit.delegates.z8;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    @NotNull
    private static final g Companion = new g();

    public l(d3e.c outletIconMapper) {
        Intrinsics.checkNotNullParameter(outletIconMapper, "outletIconMapper");
    }

    public static z8 a(f3e.d dVar) {
        f3e.c cVar = dVar.f131964b;
        double d = cVar.f131962b;
        f3e.c cVar2 = dVar.f131963a;
        return new z8(d, cVar2.f131962b, cVar2.f131961a, cVar.f131961a);
    }

    public static void b(qv0.i iVar) {
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp16;
        yp0.b.l(iVar, i, i, i2, i2, null, false, 48);
    }
}
