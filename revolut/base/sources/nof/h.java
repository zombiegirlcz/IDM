package nof;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.i7;
import tof.q7;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsChevronDelegate.Model b(Clause cellTitle, Clause screenTitle, Clause screenSubtitle, i7 filter) {
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        Intrinsics.checkNotNullParameter(screenSubtitle, "screenSubtitle");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return new CellDetailsChevronDelegate.Model("ID_STATS_SEE_ALL", cellTitle, 0, false, new d(screenTitle, screenSubtitle, filter), null, null, 2028);
    }

    public abstract boolean a(a3 a3Var);

    public abstract q7 c(a3 a3Var);

    public abstract List d(g gVar, boolean z);

    public abstract Data e(a3 a3Var, int i, dj0.d dVar, dj0.d dVar2, i7 i7Var);
}
