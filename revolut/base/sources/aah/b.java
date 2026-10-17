package aah;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o97.r;
import o97.y;
import z0h.o1;
import z0h.r1;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static Object a(o1 o1Var, r1 parcelWrapper) {
        Intrinsics.checkNotNullParameter(parcelWrapper, "parcelWrapper");
        int i = a.f2822a[parcelWrapper.ordinal()];
        if (i == 1) {
            return o1Var;
        }
        if (i == 2) {
            return new y(r.WEALTH_DISCLAIMER, o1Var, null, 60);
        }
        throw new NoWhenBranchMatchedException();
    }
}
