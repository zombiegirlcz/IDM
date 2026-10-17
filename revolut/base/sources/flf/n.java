package flf;

import elf.s0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends yji.n implements s0 {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f135968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jr1.f f135969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g1 f135970n;
    public final er1.b o;

    public n(h0 commonDataSource, jr1.f postalCheckReceiptInteractor, g1 shotDialogDisplayer, er1.b postalCheckFeatureChecker) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(postalCheckReceiptInteractor, "postalCheckReceiptInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(postalCheckFeatureChecker, "postalCheckFeatureChecker");
        this.f135968l = commonDataSource;
        this.f135969m = postalCheckReceiptInteractor;
        this.f135970n = shotDialogDisplayer;
        this.o = postalCheckFeatureChecker;
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
            boolean r4 = r6 instanceof flf.l
            if (r4 == 0) goto L13
            r4 = r6
            flf.l r4 = (flf.l) r4
            int r0 = r4.f135966w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f135966w = r0
            goto L1a
        L13:
            flf.l r4 = new flf.l
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f135966w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L60
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            er1.b r6 = r3.o
            boolean r6 = r6.a()
            if (r6 != 0) goto L3f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3f:
            java.lang.String r6 = "ID_POSTAL_CHECK_RECEIPT"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L5f
            klf.h0 r5 = r3.f135968l
            java.lang.String r5 = r5.f185494j
            r4.f135966w = r2
            flf.m r6 = new flf.m
            r1 = 0
            r6.<init>(r3, r5, r1)
            java.lang.Object r4 = r3.Y2(r4, r6)
            if (r4 != r0) goto L5a
            goto L5c
        L5a:
            kotlin.Unit r4 = kotlin.Unit.f186387a
        L5c:
            if (r4 != r0) goto L60
            return r0
        L5f:
            r2 = 0
        L60:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.n.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
