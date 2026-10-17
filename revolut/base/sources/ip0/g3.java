package ip0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g3 {
    private g3() {
    }

    public static h3 a(i3 id10, Clause clause, Map series) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(series, "series");
        return new h3(id10, clause, series);
    }
}
