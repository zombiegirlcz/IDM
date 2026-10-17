package vn8;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import ve7.i;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f290775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f290776b;

    public f(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f290775a = languageProvider;
        this.f290776b = j.b(new i(this));
    }

    public static Clause b(Long l2, String str) {
        if (l2 == null || str == null) {
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        long jLongValue = l2.longValue();
        xi0.b.Companion.getClass();
        return new MoneyClause(new dj0.d(jLongValue, xi0.a.a(str)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    public final String a(double d) {
        long j2 = (long) d;
        double d5 = j2;
        qd0.b bVar = this.f290775a;
        if (d == d5) {
            return m72.b.t(new Object[]{Long.valueOf(j2)}, 1, ((s80.b) bVar).a(), "%d", "format(...)");
        }
        return m72.b.t(new Object[]{Double.valueOf(d)}, 1, ((s80.b) bVar).a(), "%s", "format(...)");
    }

    public final HashMap c() {
        return (HashMap) this.f290776b.getValue();
    }
}
