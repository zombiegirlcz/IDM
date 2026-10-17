package pb0;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oc0.m;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234598a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f234599b;

    public i(m ticketsRepository) {
        Intrinsics.checkNotNullParameter(ticketsRepository, "ticketsRepository");
        this.f234599b = ticketsRepository;
    }

    @Override // pb0.a
    public final Flow a(BackendItem backendItem) {
        switch (this.f234598a) {
            case 0:
                TransactionCellItem item = (TransactionCellItem) backendItem;
                Intrinsics.checkNotNullParameter(item, "item");
                return nim.a.v(t9l.g.c((t9l.g) this.f234599b, item.f63702b), new h(item, 0));
            default:
                WidgetProgressionItem item2 = (WidgetProgressionItem) backendItem;
                Intrinsics.checkNotNullParameter(item2, "item");
                return nim.a.v(m.a((m) this.f234599b, item2.f63721b), new j(item2, 0));
        }
    }

    public i(t9l.g transactionInteractor) {
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        this.f234599b = transactionInteractor;
    }
}
