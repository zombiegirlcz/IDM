package a5k;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0 f1486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4k.k f1487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f1488n;
    public final hlg.a o;

    public t(f0 transferResultExtension, w4k.k transactionResultExtension, u transferExtension, hlg.a sendChecksExtension) {
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        Intrinsics.checkNotNullParameter(transactionResultExtension, "transactionResultExtension");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(sendChecksExtension, "sendChecksExtension");
        this.f1486l = transferResultExtension;
        this.f1487m = transactionResultExtension;
        this.f1488n = transferExtension;
        this.o = sendChecksExtension;
    }

    public static final void Z2(t tVar, CancellableContinuation cancellableContinuation, i iVar) {
        tVar.getClass();
        if (cancellableContinuation.d()) {
            m.Companion companion = yhm.m.INSTANCE;
            cancellableContinuation.resumeWith(iVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r15, r4k.m r16, f5j.a r17, com.revolut.core.model.account.AccountId r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.t.b3(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, r4k.m, f5j.a, com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r18, r4k.m r19, f5j.a r20, com.revolut.core.model.account.AccountId r21, boolean r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.t.c3(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, r4k.m, f5j.a, com.revolut.core.model.account.AccountId, boolean, gim.c):java.lang.Object");
    }
}
