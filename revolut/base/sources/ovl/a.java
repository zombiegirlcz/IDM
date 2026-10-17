package ovl;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    @NotNull
    public static final C1267a Companion = new C1267a();

    /* JADX INFO: renamed from: ovl.a$a, reason: collision with other inner class name */
    public static final class C1267a {
        private C1267a() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.time.ZonedDateTime] */
    public static CompositeClause a(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        ?? WithZoneSameInstant = zonedDateTime.withZoneSameInstant(ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(WithZoneSameInstant, "withZoneSameInstant(...)");
        long jI = pu7.a.I(WithZoneSameInstant);
        TimeClause.Format.TimeDefault timeDefault = TimeClause.Format.TimeDefault.f57977b;
        TimeClause timeClause = new TimeClause(jI, timeDefault, null, null, 12);
        ?? WithZoneSameInstant2 = zonedDateTime2.withZoneSameInstant(ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(WithZoneSameInstant2, "withZoneSameInstant(...)");
        return new CompositeClause(v.k(timeClause, new TimeClause(pu7.a.I(WithZoneSameInstant2), timeDefault, null, null, 12)), new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
