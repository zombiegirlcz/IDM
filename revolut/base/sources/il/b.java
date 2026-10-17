package il;

import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository;
import com.onfido.android.sdk.workflow.internal.workflow.tasks.documentupload.WorkflowSupportedDocumentsStore;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SdkComponent f162005b;

    public /* synthetic */ b(SdkComponent sdkComponent, int i) {
        this.f162004a = i;
        this.f162005b = sdkComponent;
    }

    @Override // com.onfido.javax.inject.Provider
    public final Object get() {
        switch (this.f162004a) {
            case 0:
                FlowTracker flowTracker = this.f162005b.flowTracker();
                n14.e.f(flowTracker);
                return flowTracker;
            case 1:
                OnfidoSupportedDocumentsRepository onfidoSupportedDocumentsRepository = this.f162005b.onfidoSupportedDocumentsRepository();
                n14.e.f(onfidoSupportedDocumentsRepository);
                return onfidoSupportedDocumentsRepository;
            default:
                WorkflowSupportedDocumentsStore workflowSupportedDocumentsStore = this.f162005b.workflowSupportedDocumentsStore();
                n14.e.f(workflowSupportedDocumentsStore);
                return workflowSupportedDocumentsStore;
        }
    }
}
