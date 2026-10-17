package o47;

import a15.l;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import nkm.t;
import nkm.y;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f222165a;

    public b(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f222165a = dateProvider;
    }

    public final LocalDate a() {
        return ((f) this.f222165a).e();
    }

    public final List b(LocalDate minDate, LocalDate maxDate) {
        Intrinsics.checkNotNullParameter(minDate, "minDate");
        Intrinsics.checkNotNullParameter(maxDate, "maxDate");
        return minDate.isAfter(maxDate) ? f0.f322471a : y.J(y.x(y.I(t.g(minDate.withDayOfMonth(1), new o2g.f(19)), new l(21, maxDate)), new mek.l(this, minDate, maxDate)));
    }
}
