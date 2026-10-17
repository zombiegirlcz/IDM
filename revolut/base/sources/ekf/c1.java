package ekf;

import klf.m1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c1 extends yji.n implements elf.s0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f127055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k61.a f127056n;
    public final tqi.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f01.a f127057p;

    public c1(klf.h0 commonDataSource, m1 juniorDataSource, k61.a transferInteractor, tqi.d shareExternalDestinationFactory, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f127054l = commonDataSource;
        this.f127055m = juniorDataSource;
        this.f127056n = transferInteractor;
        this.o = shareExternalDestinationFactory;
        this.f127057p = uiKitResources;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.c1.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r4, java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof ekf.a1
            if (r4 == 0) goto L13
            r4 = r6
            ekf.a1 r4 = (ekf.a1) r4
            int r0 = r4.f127044w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f127044w = r0
            goto L1a
        L13:
            ekf.a1 r4 = new ekf.a1
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f127044w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "SHARE_PAYMENT_LINK_LIST_ID"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 != 0) goto L3f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3f:
            r4.f127044w = r2
            java.lang.Object r4 = r3.Z2(r4)
            if (r4 != r0) goto L48
            return r0
        L48:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.c1.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
