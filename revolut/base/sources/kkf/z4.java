package kkf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f185050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rnf.g f185051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elf.s1 f185052c;

    public z4(klf.h0 commonDataSource, rnf.g receiptsDelegate, elf.s1 receiptsClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(receiptsDelegate, "receiptsDelegate");
        Intrinsics.checkNotNullParameter(receiptsClickHandler, "receiptsClickHandler");
        this.f185050a = commonDataSource;
        this.f185051b = receiptsDelegate;
        this.f185052c = receiptsClickHandler;
    }

    public static boolean c(tof.a3 a3Var, Function1 function1) {
        return (k71.k.m0(a3Var) || a3Var.f272624y.f273145c == io3.i.EXTERNAL || !((Boolean) function1.invoke(a3Var)).booleanValue()) ? false : true;
    }

    public final cmf.p a(Function1 additionalFilter) {
        Intrinsics.checkNotNullParameter(additionalFilter, "additionalFilter");
        return new cmf.p(vkm.q.Q(vkm.q.s(this.f185050a.d(), new js7.c(this, additionalFilter), vkm.q.f290100b), new k25.o(null, this, additionalFilter, 6)), new i0(25), zhm.u.c(this.f185052c), "Receipts");
    }
}
