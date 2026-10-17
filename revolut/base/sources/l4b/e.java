package l4b;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f192081a;

    public e(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f192081a = dateProvider;
    }

    public static Object a(ZonedDateTime zonedDateTime) {
        return zonedDateTime != null ? new TimeClause(zonedDateTime.toInstant().toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, zonedDateTime.getZone(), 4) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
