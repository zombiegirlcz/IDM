package fa0;

import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements na0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f133033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f133034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BackendFlowInput f133035c;
    public BackendFlow d;
    public BackendFlowApiEndpoints e;

    public g(k kVar) {
        this.f133033a = kVar;
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        this.f133034b = viewController;
        return this;
    }

    @Override // xki.b
    public final xki.c build() {
        vc.s.h(this.f133034b, ViewController.class);
        vc.s.h(this.f133035c, BackendFlowInput.class);
        vc.s.h(this.d, BackendFlow.class);
        vc.s.h(this.e, BackendFlowApiEndpoints.class);
        return new h(this.f133033a, new na0.h(), this.f133034b, this.f133035c, this.d, this.e);
    }

    @Override // na0.c
    public final na0.c h(BackendFlowApiEndpoints backendFlowApiEndpoints) {
        backendFlowApiEndpoints.getClass();
        this.e = backendFlowApiEndpoints;
        return this;
    }

    @Override // na0.c
    public final na0.c k(BackendFlowInput backendFlowInput) {
        backendFlowInput.getClass();
        this.f133035c = backendFlowInput;
        return this;
    }

    @Override // na0.c
    public final na0.c m(BackendFlow backendFlow) {
        this.d = backendFlow;
        return this;
    }
}
