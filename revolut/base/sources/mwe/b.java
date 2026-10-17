package mwe;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.j;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f209432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f209433b;

    public b(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f209432a = countryInteractor;
        this.f209433b = j.b(new mw1.a(1));
    }

    public static TextLocalisedClause a(t61.j jVar) {
        String strB;
        m5l.b bVar = jVar.f268161g;
        if (bVar == null || (strB = bVar.b()) == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        return new TextLocalisedClause(j6.a.q("card.brand.", p.a.r(locale, "ROOT", strB, locale, "toLowerCase(...)")), (List) null, (Clause) new TextClause(a0.o(strB), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22);
    }

    public final Clause b() {
        return (Clause) this.f209433b.getValue();
    }
}
