package pb0;

import com.revolut.feature.backend_flow.domain.models.BackendEntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EntitiesSummaryItem f234589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BackendEntitiesSummaryItem f234590c;

    public /* synthetic */ e(EntitiesSummaryItem entitiesSummaryItem, BackendEntitiesSummaryItem backendEntitiesSummaryItem, int i) {
        this.f234588a = i;
        this.f234589b = entitiesSummaryItem;
        this.f234590c = backendEntitiesSummaryItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        v9l.a transaction = (v9l.a) obj2;
        switch (this.f234588a) {
            case 0:
                break;
            default:
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                break;
        }
        return EntitiesSummaryItem.d(this.f234589b, null, this.f234590c, transaction, 27);
    }
}
