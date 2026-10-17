package lkf;

import elf.s0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends yji.n implements s0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f196391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zxd.c f196392m;

    public l0(klf.h0 commonDataSource, zxd.c statementsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        this.f196391l = commonDataSource;
        this.f196392m = statementsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r19) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lkf.l0.Z2(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_TAX_INVOICE") ? Z2((gim.c) continuation) : Boolean.FALSE;
    }
}
