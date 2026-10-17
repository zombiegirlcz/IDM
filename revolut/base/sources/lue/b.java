package lue;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import uue.a;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static aue.a a(uue.a dto) {
        aue.c cVarValueOf;
        Intrinsics.checkNotNullParameter(dto, "dto");
        try {
            cVarValueOf = aue.c.valueOf(dto.getType());
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            cVarValueOf = null;
        }
        if (cVarValueOf == null) {
            return null;
        }
        switch (a.f200231a[cVarValueOf.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a.C1564a upperBoundLimit = dto.getUpperBoundLimit();
                if (upperBoundLimit != null) {
                    return new aue.a(cVarValueOf, mo3.a.o(upperBoundLimit.getTotalLimit()), mo3.a.o(upperBoundLimit.getUsedLimit()), mo3.a.o(upperBoundLimit.getRemainingLimit()), mo3.a.o(upperBoundLimit.getRemainingLimitInTopUpCurrency()));
                }
                IllegalStateException illegalStateException = new IllegalStateException("Limit of type " + cVarValueOf + " is expected to contain upperBoundLimitDto");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                return null;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
