package zkf;

import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import elf.s0;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f322969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mof.c f322970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f322971n;

    public n(h0 commonDataSource, mof.c refundMapper, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(refundMapper, "refundMapper");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f322969l = commonDataSource;
        this.f322970m = refundMapper;
        this.f322971n = transactionsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable Z2(zkf.n r27, tof.t3 r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zkf.n.Z2(zkf.n, tof.t3, gim.c):java.io.Serializable");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (a0.H(str, "TransactionListItem_", false) && (obj2 instanceof a3)) {
            A2(new TransactionDetailsDestination(ofm.q.P((a3) obj2), (rhf.d) null, 6));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
