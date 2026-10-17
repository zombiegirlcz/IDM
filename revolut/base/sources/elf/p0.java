package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f127394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final thf.m f127395n;

    public p0(klf.h0 commonDataSource, klf.m1 juniorDataSource, thf.m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f127393l = commonDataSource;
        this.f127394m = juniorDataSource;
        this.f127395n = transactionTextResourcesMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.p0.Z2(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return (Intrinsics.f(str, "ID_MENU_ITEM_IMPROVE_MERCHANT_INFO") || Intrinsics.f(str, "ID_NAV_BAR_ICON")) ? Z2((gim.c) continuation) : Boolean.FALSE;
    }
}
