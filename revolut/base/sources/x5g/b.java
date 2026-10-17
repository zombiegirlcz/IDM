package x5g;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.flights.models.domain.search.LocationPoint;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4g.b f302977a;

    public b(p4g.b dateFormatter) {
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        this.f302977a = dateFormatter;
    }

    public static Clause a(LocationPoint locationPoint) {
        if (locationPoint == null) {
            return null;
        }
        String str = locationPoint.f93594c;
        return (str == null || str.length() == 0) ? new TextClause(locationPoint.f93592a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new CompositeClause(v.k(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(p.a.p(" (", locationPoint.f93592a, ")"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
    }
}
