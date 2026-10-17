package adh;

import com.revolut.core.ui_kit.models.Clause;
import ip0.i10;
import ip0.k10;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // adh.n
    public final k10 a(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        k10 k10Var = new k10("Empty.Row", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D097", null, null, null, 30), new i10(title));
        yp0.b.l(k10Var, 0, 0, 0, 0, null, false, 63);
        return k10Var;
    }
}
