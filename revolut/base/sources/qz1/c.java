package qz1;

import ang.f;
import com.revolut.feature.apm.core.impl.money_requests.data.network.ApmMoneyRequestsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmMoneyRequestsService f250339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f250340b;

    public c(ApmMoneyRequestsService service, f userInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f250339a = service;
        this.f250340b = userInteractor;
    }
}
