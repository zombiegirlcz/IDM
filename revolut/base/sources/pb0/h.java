package pb0;

import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionCellItem f234597b;

    public /* synthetic */ h(TransactionCellItem transactionCellItem, int i) {
        this.f234596a = i;
        this.f234597b = transactionCellItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        v9l.a sharedTransaction = (v9l.a) obj2;
        switch (this.f234596a) {
            case 0:
                Intrinsics.checkNotNullParameter(sharedTransaction, "sharedTransaction");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(sharedTransaction, "it");
                TransactionCellItem transactionCellItem = this.f234597b;
                if (transactionCellItem.f63703c != null) {
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(sharedTransaction, "transaction");
                break;
        }
        return TransactionCellItem.d(this.f234597b, sharedTransaction);
    }
}
