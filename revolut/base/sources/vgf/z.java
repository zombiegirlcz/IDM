package vgf;

import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.b f289148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionsScreenContract$InputData f289149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g48.r0 f289150c;

    public z(whf.b transactionsContentProvider, TransactionsScreenContract$InputData inputData, g48.r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f289148a = transactionsContentProvider;
        this.f289149b = inputData;
        this.f289150c = jointAccountsInteractor;
    }

    public static vkm.y a(vkm.d dVar) {
        return rd0.e.e(new v2e.h0(dVar, 8), zhm.h0.f322473a, new vge.f1(3, 5, null));
    }
}
