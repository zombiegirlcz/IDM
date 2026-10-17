package e54;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import dx4.t;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx4.t f122767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f122768b;

    public z(dx4.t amountType, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f122767a = amountType;
        this.f122768b = amountFormatter;
    }

    public final long a(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        dx4.t tVar = this.f122767a;
        if ((tVar instanceof t.a) || (tVar instanceof t.b)) {
            Long lN = kotlin.text.z.n(value.toString());
            if (lN != null) {
                return lN.longValue();
            }
            return 0L;
        }
        if (!(tVar instanceof dx4.s)) {
            throw new NoWhenBranchMatchedException();
        }
        return this.f122768b.b(value.toString(), ((dx4.s) tVar).f120758a.f306286a);
    }

    public final Clause b(long j2) {
        dx4.t tVar = this.f122767a;
        if ((tVar instanceof t.a) || (tVar instanceof t.b)) {
            return new TextClause(String.valueOf(j2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (tVar instanceof dx4.s) {
            return new MoneyClause(new dj0.d(j2, ((dx4.s) tVar).f120758a), new MoneyClause.Format.Editable(), null, o9.NON_SENSITIVE, 4);
        }
        throw new NoWhenBranchMatchedException();
    }
}
