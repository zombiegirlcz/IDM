package vqg;

import ccb.j;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f291399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ppg.b f291400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f291401n;

    public i(n walletInteractor, ppg.b vaultsInteractor, d dialogConfigProvider) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(dialogConfigProvider, "dialogConfigProvider");
        this.f291399l = walletInteractor;
        this.f291400m = vaultsInteractor;
        this.f291401n = dialogConfigProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // ccb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(bcb.a r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof vqg.g
            if (r0 == 0) goto L14
            r0 = r10
            vqg.g r0 = (vqg.g) r0
            int r1 = r0.f291396w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f291396w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            vqg.g r0 = new vqg.g
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f291396w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r10)
            goto L4f
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            a3b.i r4 = new a3b.i
            r10 = 23
            r4.<init>(r8, r9, r10)
            vqg.h r5 = new vqg.h
            r10 = 2
            r1 = 0
            r5.<init>(r8, r9, r1, r10)
            r6.f291396w = r2
            r2 = 0
            r3 = 0
            r7 = 3
            r1 = r8
            java.lang.Object r10 = n14.k.W(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L4f
            return r0
        L4f:
            nii.h r10 = (nii.h) r10
            boolean r9 = r10 instanceof nii.f
            if (r9 == 0) goto L60
            yhm.m$a r9 = yhm.m.INSTANCE
            nii.f r10 = (nii.f) r10
            java.lang.Throwable r9 = r10.f216146a
            yhm.n r9 = yhm.o.a(r9)
            return r9
        L60:
            boolean r9 = r10 instanceof nii.g
            if (r9 == 0) goto L69
            yhm.m$a r9 = yhm.m.INSTANCE
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L69:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vqg.i.Z2(bcb.a, gim.c):java.lang.Object");
    }
}
