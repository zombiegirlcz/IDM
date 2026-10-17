package sph;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public static List a(zel.f instrumentGroup) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        int i = n.f264959a[instrumentGroup.ordinal()];
        if (i == 1) {
            return v.k(z.EQUITY, z.ADR, z.WARRANT, z.SPAC);
        }
        if (i == 2) {
            return v.k(z.ETF, z.ETC, z.ETN);
        }
        if (i == 3) {
            return u.c(z.BOND);
        }
        if (i == 4) {
            return u.c(z.CFD);
        }
        throw new NoWhenBranchMatchedException();
    }
}
