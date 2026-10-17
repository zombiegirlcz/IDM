package d57;

import com.revolut.core.ui_kit.models.TimeClause;
import java.time.LocalDate;
import java.time.Month;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f111393a;

    public a(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f111393a = dateProvider;
    }

    public final TimeClause a(Month month) {
        Intrinsics.checkNotNullParameter(month, "month");
        LocalDate localDateOf = LocalDate.of(((f) this.f111393a).j(), month.getValue(), 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
        return new TimeClause(oc.c.F(localDateOf), new TimeClause.Format.Month(0), null, null, 12);
    }
}
