package ky7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zw7.d0;
import zw7.r0;
import zw7.s0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private b() {
    }

    public static d a(d0 pet) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        if (!pet.f325771m.isEmpty()) {
            return d.ACTION_NEEDED;
        }
        switch (a.f190634a[pet.f325772n.ordinal()]) {
            case 1:
                return d.IN_PROGRESS;
            case 2:
                return d.INITIALIZING;
            case 3:
                return d.ACTIVE;
            case 4:
                return d.CANCELLED;
            case 5:
                return d.INACTIVE;
            case 6:
                return d.CANCELLED;
            case 7:
                s0 s0Var = pet.o;
                if (!(s0Var instanceof r0)) {
                    if (s0Var.equals(s0.a.f325852a)) {
                        return d.IN_PROGRESS;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                int i = a.f190635b[((r0) s0Var).f325845l.ordinal()];
                if (i == 1) {
                    return d.ACTIVE;
                }
                if (i == 2) {
                    return d.CANCELLED;
                }
                if (i == 3) {
                    return d.INACTIVE;
                }
                if (i == 4) {
                    return d.CANCELLED;
                }
                throw new NoWhenBranchMatchedException();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
