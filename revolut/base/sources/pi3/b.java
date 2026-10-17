package pi3;

import kotlin.NoWhenBranchMatchedException;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private b() {
    }

    public static Period a(hha.i iVar) {
        int i = iVar == null ? -1 : a.f236386a[iVar.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return Period.parse("P1Y");
        }
        if (i == 2) {
            return Period.parse("P1M");
        }
        throw new NoWhenBranchMatchedException();
    }
}
