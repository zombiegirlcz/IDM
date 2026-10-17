package rgf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements qfe.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qfe.a f254177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qfe.m f254178b;

    public w(qfe.a accountsTransactionsFilterProvider, qfe.m spaceContentModelsProvider) {
        Intrinsics.checkNotNullParameter(accountsTransactionsFilterProvider, "accountsTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(spaceContentModelsProvider, "spaceContentModelsProvider");
        this.f254177a = accountsTransactionsFilterProvider;
        this.f254178b = spaceContentModelsProvider;
    }

    @Override // qfe.m
    public final Flow a(sfe.a loadingMode, qfe.l filterType) {
        Intrinsics.checkNotNullParameter(loadingMode, "loadingMode");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        return new qna.n(this.f254178b.a(loadingMode, qfe.j.f245295a), this, 14);
    }
}
