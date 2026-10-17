package jo;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @NotNull
    public static final a Companion = new a(0);

    public static String a() {
        od0.a aVar = od0.a.f224253a;
        int i = b.f176820b[od0.a.c().ordinal()];
        if (i == 1) {
            return "aqueduct.revolut.com";
        }
        if (i == 2) {
            return "aqueduct.revolut.codes";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = b.f176819a[od0.a.b().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return "aqueduct.revolut.codes";
        }
        if (i2 == 3 || i2 == 4) {
            return "aqueduct.revolut.com";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof c);
    }

    public final int hashCode() {
        return ((Integer.hashCode(443) + 677688165) * 31) - 861391249;
    }
}
