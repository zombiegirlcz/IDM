package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends yji.n implements elf.s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fof.d f237145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vbj.c f237146n;
    public final hlf.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sj5.a f237147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fbj.a f237148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f237149r;

    public w0(klf.h0 commonDataSource, fof.d cryptoTfrMeshVerificationBannerProvider, vbj.c cryptoDepositStorageInteractor, hlf.c cryptoDepositCancelTfrClickHandler, sj5.a depositTransactionStateChecker, fbj.a cryptoDepositsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cryptoTfrMeshVerificationBannerProvider, "cryptoTfrMeshVerificationBannerProvider");
        Intrinsics.checkNotNullParameter(cryptoDepositStorageInteractor, "cryptoDepositStorageInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositCancelTfrClickHandler, "cryptoDepositCancelTfrClickHandler");
        Intrinsics.checkNotNullParameter(depositTransactionStateChecker, "depositTransactionStateChecker");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        this.f237144l = commonDataSource;
        this.f237145m = cryptoTfrMeshVerificationBannerProvider;
        this.f237146n = cryptoDepositStorageInteractor;
        this.o = cryptoDepositCancelTfrClickHandler;
        this.f237147p = depositTransactionStateChecker;
        this.f237148q = cryptoDepositsInteractor;
        this.f237149r = new vii.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof pkf.u0
            if (r0 == 0) goto L13
            r0 = r7
            pkf.u0 r0 = (pkf.u0) r0
            int r1 = r0.f237133w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f237133w = r1
            goto L1a
        L13:
            pkf.u0 r0 = new pkf.u0
            gim.c r7 = (gim.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f237133w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L5c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            java.lang.String r7 = "ID_PROVIDE_INFORMATION_CRYPTO_TFR_ACTION"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L5f
            boolean r6 = r5 instanceof fof.e
            if (r6 == 0) goto L5f
            fof.e r5 = (fof.e) r5
            r0.f237133w = r3
            tji.f r6 = r4.q2()
            pkf.v0 r7 = new pkf.v0
            r2 = 0
            r7.<init>(r4, r5, r2)
            java.lang.String r5 = "CryptoTfrProvideInformation_LoadingTag"
            java.lang.Object r5 = zh9.u0.b0(r6, r5, r7, r0)
            if (r5 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L59:
            if (r5 != r1) goto L5c
            return r1
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.w0.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
