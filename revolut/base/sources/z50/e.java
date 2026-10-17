package z50;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import w30.i;

/* JADX INFO: loaded from: classes19.dex */
public final class e {
    public e(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    public static w30.i a(w30.g state, w30.d dVar, Period period) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = d.f319405b[state.ordinal()];
        if (i == 1) {
            return i.f.f294089a;
        }
        if (i == 2) {
            return i.c.f294086a;
        }
        if (i != 3) {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (period != null) {
                return new w30.j(period);
            }
            switch (dVar == null ? -1 : d.f319404a[dVar.ordinal()]) {
                case -1:
                case 7:
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    return i.a.f294084a;
                case 2:
                case 3:
                    return i.d.f294087a;
                case 4:
                case 5:
                    return i.b.f294085a;
                case 6:
                    Period ZERO = Period.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    return new w30.j(ZERO);
            }
        }
        return i.e.f294088a;
    }
}
