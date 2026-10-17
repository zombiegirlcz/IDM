package n08;

import kotlin.jvm.internal.Intrinsics;
import zw7.r0;
import zw7.s0;
import zw7.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 {
    public static d0 a(zw7.d0 pet) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        s0 s0Var = pet.o;
        if (!(s0Var instanceof s0.a) && ((r0) s0Var).f325845l != t0.CANCELLED) {
            return d0.DEFAULT;
        }
        return d0.INCOMPLETE;
    }
}
