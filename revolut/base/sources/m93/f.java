package m93;

import com.revolut.core.ui_kit.models.Clause;
import h93.f0;
import ia3.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface f {

    @NotNull
    public static final e Companion = e.f203622a;

    static /* synthetic */ Clause a(f fVar, f0 f0Var, String str, int i) {
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str = null;
        }
        return ((r) fVar).r(f0Var, false, z, str, null);
    }

    static /* synthetic */ Clause b(f fVar, f0 f0Var, String str, Boolean bool, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        return ((r) fVar).n(f0Var, str, bool, true);
    }
}
