package ylh;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final TextClause a(a aVar, TimeClause.Format.Year format) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return new TextClause("%1$s – %2$s", (Style) null, (Integer) null, false, (o9) null, zhm.v.k(new TimeClause(oc.c.N(aVar.f314705a), format, null, null, 12), new TimeClause(oc.c.N(aVar.f314706b), format, null, null, 12)), 94);
    }
}
