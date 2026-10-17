package tsk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import om4.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f274163a;

    public m(k baselinePicker, nd.p chartEntriesBuilder, d0 yAxisLabelMapper) {
        Intrinsics.checkNotNullParameter(baselinePicker, "baselinePicker");
        Intrinsics.checkNotNullParameter(chartEntriesBuilder, "chartEntriesBuilder");
        Intrinsics.checkNotNullParameter(yAxisLabelMapper, "yAxisLabelMapper");
        this.f274163a = yAxisLabelMapper;
    }

    public static Clause a(ej0.b bVar) {
        if (bVar != null) {
            return new MoneyClause(mif.a.Q(bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
