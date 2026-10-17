package u4h;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import hx7.e;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f277344a = j.b(new ty.a(24));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f277345b = j.b(new ty.a(25));

    public final String a(yel.a rating) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        String str = (String) ((Map) this.f277344a.getValue()).get(rating);
        return str == null ? "" : str;
    }

    public final Clause b(yel.a rating) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        Integer num = (Integer) ((Map) this.f277345b.getValue()).get(rating);
        if (num != null) {
            return new TextLocalisedClause(num.intValue(), null, null, 14);
        }
        e.n(new IllegalStateException("No mapping for rating = " + rating));
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
