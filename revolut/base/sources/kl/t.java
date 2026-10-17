package kl;

import android.os.Bundle;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionFragment;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostFragment;
import com.onfido.android.sdk.capture.ui.nfc.NfcHostFragment;
import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment;
import com.onfido.hosted.web.module.HostedWebModuleFragment;
import com.onfido.workflow.internal.ui.WorkflowFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class t extends kotlin.jvm.internal.u implements Function2 {
    public final /* synthetic */ WorkflowFragment f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(WorkflowFragment workflowFragment) {
        super(2);
        this.f = workflowFragment;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String requestKey = (String) obj2;
        Bundle bundle = (Bundle) obj3;
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        int iHashCode = requestKey.hashCode();
        WorkflowFragment workflowFragment = this.f;
        switch (iHashCode) {
            case -1543953662:
                if (requestKey.equals("request_key_face_liveness_intro")) {
                    workflowFragment.getWorkflowViewModel().b(ml.a0.f206514a);
                    return Unit.f186387a;
                }
                break;
            case -1275886617:
                if (requestKey.equals("request_key_face_selfie_intro")) {
                    workflowFragment.getWorkflowViewModel().b(ml.c0.f206518a);
                    return Unit.f186387a;
                }
                break;
            case -646142568:
                if (requestKey.equals("request_key_country_selection_screen")) {
                    workflowFragment.getWorkflowViewModel().b(new ml.u(CountrySelectionFragment.INSTANCE.getResult(bundle).getCountryCode()));
                    return Unit.f186387a;
                }
                break;
            case -631944929:
                if (requestKey.equals("KEY_REQUEST_SELFIE_CAPTURE")) {
                    SelfieCaptureScreen.SelfieCaptureResult selfieCaptureResultRetrieveResult = SelfieCaptureScreen.INSTANCE.retrieveResult(bundle);
                    if (selfieCaptureResultRetrieveResult instanceof SelfieCaptureScreen.SelfieCaptureResult.Back) {
                        workflowFragment.getWorkflowViewModel().b(new ml.r(workflowFragment.getNavigationManager().getCurrentScreensSnapshot()));
                    } else {
                        workflowFragment.getWorkflowViewModel().b(new ml.b0(selfieCaptureResultRetrieveResult));
                    }
                    return Unit.f186387a;
                }
                break;
            case -227487054:
                if (requestKey.equals("request_key_poa")) {
                    workflowFragment.getWorkflowViewModel().b(new ml.l0(PoaHostFragment.INSTANCE.getPoaResult(bundle)));
                    return Unit.f186387a;
                }
                break;
            case -114262742:
                if (requestKey.equals("request_key_qes_consent")) {
                    workflowFragment.getWorkflowViewModel().b(new ml.d0(HostedWebModuleFragment.INSTANCE.getResult(bundle)));
                    return Unit.f186387a;
                }
                break;
            case -100988718:
                if (requestKey.equals("request_key_nfc_flow")) {
                    workflowFragment.getWorkflowViewModel().b(new ml.f0(NfcHostFragment.INSTANCE.getNfcHostResult(bundle)));
                    return Unit.f186387a;
                }
                break;
            case 142689746:
                if (requestKey.equals("KEY_REQUEST_DOCUMENT_CAPTURE")) {
                    workflowFragment.getWorkflowViewModel().b(new ml.y(DocumentCaptureScreen.INSTANCE.toDocumentCaptureResult(bundle)));
                    return Unit.f186387a;
                }
                break;
            case 194551046:
                if (requestKey.equals("request_key_retry_workflow")) {
                    workflowFragment.getWorkflowViewModel().b(ml.m0.f206535a);
                    return Unit.f186387a;
                }
                break;
            case 306350406:
                if (requestKey.equals("request_key_motion")) {
                    workflowFragment.getWorkflowViewModel().b(new ml.e0(MotionHostFragment.INSTANCE.getAvcHostResult(bundle)));
                    return Unit.f186387a;
                }
                break;
            case 452907500:
                if (requestKey.equals("face_liveness_capture")) {
                    LivenessCaptureScreen.LivenessCaptureResult livenessCaptureResultRetrieveResult = LivenessCaptureScreen.INSTANCE.retrieveResult(bundle);
                    if (livenessCaptureResultRetrieveResult instanceof LivenessCaptureScreen.LivenessCaptureResult.Back) {
                        workflowFragment.getWorkflowViewModel().b(new ml.r(workflowFragment.getNavigationManager().getCurrentScreensSnapshot()));
                    } else {
                        workflowFragment.getWorkflowViewModel().b(new ml.z(livenessCaptureResultRetrieveResult));
                    }
                    return Unit.f186387a;
                }
                break;
            case 1122753057:
                if (requestKey.equals("request_key_liveness_confirmation")) {
                    workflowFragment.getWorkflowViewModel().b(new ml.w(LivenessConfirmationFragment.INSTANCE.getResult(bundle)));
                    return Unit.f186387a;
                }
                break;
            case 1218562296:
                if (requestKey.equals("request_key_document_selection")) {
                    DocumentSelectionHostFragment.DocumentSelectionResult result = DocumentSelectionHostFragment.INSTANCE.getResult(bundle);
                    if (result instanceof DocumentSelectionHostFragment.DocumentSelectionResult.Completed) {
                        DocumentSelectionHostFragment.DocumentSelectionResult.Completed completed = (DocumentSelectionHostFragment.DocumentSelectionResult.Completed) result;
                        workflowFragment.getWorkflowViewModel().b(new ml.v(completed.getDocumentType(), completed.getCountryCode()));
                    } else {
                        workflowFragment.getWorkflowViewModel().b(new ml.r(workflowFragment.getNavigationManager().getCurrentScreensSnapshot()));
                    }
                    return Unit.f186387a;
                }
                break;
            case 1270914846:
                if (requestKey.equals("request_key_nfc_not_supported")) {
                    workflowFragment.getWorkflowViewModel().b(ml.g0.f206525a);
                    return Unit.f186387a;
                }
                break;
            case 1978613223:
                if (requestKey.equals("address_page_intro")) {
                    workflowFragment.getWorkflowViewModel().b(ml.x.f206552a);
                    return Unit.f186387a;
                }
                break;
            case 2074172951:
                if (requestKey.equals("request_key_permissions_screen")) {
                    workflowFragment.getWorkflowViewModel().b(workflowFragment.permissionResultToUiEvent(bundle));
                    return Unit.f186387a;
                }
                break;
        }
        throw new IllegalArgumentException("Unknown request key: ".concat(requestKey));
    }
}
