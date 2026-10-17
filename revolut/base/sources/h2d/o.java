package h2d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import kotlin.jvm.internal.Intrinsics;
import x3d.d;

/* JADX INFO: loaded from: classes7.dex */
public final class o {
    public static boolean a(x3d.e extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (extras.f302727a instanceof d.a) || !extras.f302728b;
    }

    public static RowDelegate.Model.b b(x3d.e extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (!(extras.f302727a instanceof d.a) && extras.f302728b) ? RowDelegate.Model.b.a.f53266a : RowDelegate.Model.b.c.f53268a;
    }

    public static tf c(x3d.e extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        x3d.d dVar = extras.f302727a;
        x3d.c cVar = dVar instanceof x3d.c ? (x3d.c) dVar : null;
        if (cVar != null) {
            return new tf(6, cVar.f302725a, false);
        }
        return null;
    }
}
