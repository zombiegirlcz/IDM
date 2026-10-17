package bnj;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.time.Instant;
import java.util.List;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class s {
    public static CompositeClause a(Instant instant) {
        long epochMilli = instant.toEpochMilli();
        TimeClause.Format.INSTANCE.getClass();
        return new CompositeClause(v.k(new TimeClause(epochMilli, TimeClause.Format.f57959a, null, null, 12), new TimeClause(instant.toEpochMilli(), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
