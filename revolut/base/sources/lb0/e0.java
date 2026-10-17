package lb0;

import com.revolut.core.backend_flow.api.NewBackendFlowApi$Toggles;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.StringValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 implements wl2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlow f193534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p90.a f193535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackendFlowApiEndpoints f193536c;
    public final gte.a d;

    public e0(BackendFlow backendFlow, p90.a formRepository, BackendFlowApiEndpoints backendFlowApiEndpoints, gte.a togglesInteractor) {
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        Intrinsics.checkNotNullParameter(formRepository, "formRepository");
        Intrinsics.checkNotNullParameter(backendFlowApiEndpoints, "backendFlowApiEndpoints");
        Intrinsics.checkNotNullParameter(togglesInteractor, "togglesInteractor");
        this.f193534a = backendFlow;
        this.f193535b = formRepository;
        this.f193536c = backendFlowApiEndpoints;
        this.d = togglesInteractor;
    }

    @Override // wl2.a
    public final Object a(String str, String str2, StringValue stringValue, Continuation continuation) {
        boolean zC = ((jte.d) this.d).c(NewBackendFlowApi$Toggles.EndpointsConfig.f51216c);
        p90.a aVar = this.f193535b;
        if (zC) {
            return ((ul2.h) aVar).c(this.f193536c.f63223a, str, str2, stringValue, (gim.c) continuation);
        }
        return ((ul2.h) aVar).d(this.f193534a.f63264b, str, str2, stringValue, (gim.c) continuation);
    }
}
