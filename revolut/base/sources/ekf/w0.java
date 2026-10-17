package ekf;

import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TransactionContext f127136b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f127137a;

    static {
        TransactionContext.TransactionData[] elements = {TransactionContext.TransactionData.TRANSFER_USERS, TransactionContext.TransactionData.HIDDEN};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f127136b = new TransactionContext(null, new TransactionContext.DataSet.Included(kotlin.collections.d.y0(elements)), 1);
    }

    public w0(com.revolut.domain.interactors.transactions.a transactionsInteractor, ife.d suspiciousRecipientWarningDestinationProvider, d1 filterBuilder) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(suspiciousRecipientWarningDestinationProvider, "suspiciousRecipientWarningDestinationProvider");
        Intrinsics.checkNotNullParameter(filterBuilder, "filterBuilder");
        this.f127137a = transactionsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tof.a3 r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.w0.a(tof.a3, gim.c):java.lang.Object");
    }
}
