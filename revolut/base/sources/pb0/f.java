package pb0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oc0.k;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlow f234591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f234592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9l.g f234593c;

    public f(BackendFlow backendFlow, k entitiesSummaryRepository, t9l.g transactionInteractor) {
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        Intrinsics.checkNotNullParameter(entitiesSummaryRepository, "entitiesSummaryRepository");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        this.f234591a = backendFlow;
        this.f234592b = entitiesSummaryRepository;
        this.f234593c = transactionInteractor;
    }

    @Override // pb0.a
    public final Flow a(BackendItem backendItem) {
        EntitiesSummaryItem item = (EntitiesSummaryItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        BackendFlow backendFlow = this.f234591a;
        return xam.a.h(new o4a.b(this, item, null, 10), k.a(this.f234592b, new oc0.j(backendFlow.f63264b, item.f63427a, backendFlow.f63267h)));
    }
}
