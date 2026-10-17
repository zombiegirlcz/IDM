package nl;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.workflow.internal.workflow.tasks.documentupload.WorkflowSupportedDocumentsStore;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Navigator f216951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f216952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f216953c;
    public final WorkflowSupportedDocumentsStore d;
    public final NfcInteractor e;
    public final OnfidoRemoteConfig f;

    public u(Navigator navigator, x0 permissionsFlowHelper, p captureDocumentHelper, WorkflowSupportedDocumentsStore workflowSupportedDocumentsStore, NfcInteractor nfcInteractor, OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionsFlowHelper, "permissionsFlowHelper");
        Intrinsics.checkNotNullParameter(captureDocumentHelper, "captureDocumentHelper");
        Intrinsics.checkNotNullParameter(workflowSupportedDocumentsStore, "workflowSupportedDocumentsStore");
        Intrinsics.checkNotNullParameter(nfcInteractor, "nfcInteractor");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        this.f216951a = navigator;
        this.f216952b = permissionsFlowHelper;
        this.f216953c = captureDocumentHelper;
        this.d = workflowSupportedDocumentsStore;
        this.e = nfcInteractor;
        this.f = onfidoRemoteConfig;
    }

    public static Pair a(sl.n documentTask) {
        DocumentType documentType;
        List list;
        Intrinsics.checkNotNullParameter(documentTask, "documentTask");
        CountryCode countryCode = documentTask.e;
        if (countryCode == null || (documentType = documentTask.f) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = documentTask.d;
        if (linkedHashMap.isEmpty() || (list = (List) linkedHashMap.get(countryCode)) == null || !list.contains(documentType)) {
            return null;
        }
        return new Pair(countryCode, documentType);
    }
}
