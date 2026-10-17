package com.onfido.android.sdk.workflow.internal.workflow.tasks.documentupload;

import cim.b;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.document.GenericDocument;
import com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.CountryCodeExtensionsKt;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0011H\u0016R\"\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/workflow/internal/workflow/tasks/documentupload/WorkflowSupportedDocumentsRepository;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;", "Lcom/onfido/android/sdk/workflow/internal/workflow/tasks/documentupload/WorkflowSupportedDocumentsStore;", "()V", "supportedDocumentsMap", "", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "findAllSupportedCountries", "findGenericDocuments", "Lcom/onfido/android/sdk/capture/document/GenericDocument;", "countryCode", "findSupportedDocumentTypes", "storeWorkflowSupportedDocuments", "", "documentsSelection", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WorkflowSupportedDocumentsRepository implements SupportedDocumentsRepository, WorkflowSupportedDocumentsStore {

    @NotNull
    private final Map<CountryCode, List<DocumentType>> supportedDocumentsMap = new LinkedHashMap();

    @Override // com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository
    @NotNull
    public List<CountryCode> findAllSupportedCountries() {
        List<CountryCode> listP0;
        synchronized (this) {
            listP0 = d0.P0(this.supportedDocumentsMap.keySet(), new Comparator() { // from class: com.onfido.android.sdk.workflow.internal.workflow.tasks.documentupload.WorkflowSupportedDocumentsRepository$findAllSupportedCountries$lambda$0$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    return b.b(CountryCodeExtensionsKt.getDisplayName((CountryCode) t2), CountryCodeExtensionsKt.getDisplayName((CountryCode) t3));
                }
            });
        }
        return listP0;
    }

    @Override // com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository
    @NotNull
    public List<GenericDocument> findGenericDocuments(@NotNull CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return f0.f322471a;
    }

    @Override // com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository
    @NotNull
    public List<DocumentType> findSupportedDocumentTypes(@NotNull CountryCode countryCode) {
        List<DocumentType> list;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        synchronized (this) {
            list = this.supportedDocumentsMap.get(countryCode);
            if (list == null) {
                list = f0.f322471a;
            }
        }
        return list;
    }

    @Override // com.onfido.android.sdk.workflow.internal.workflow.tasks.documentupload.WorkflowSupportedDocumentsStore
    public void storeWorkflowSupportedDocuments(@NotNull Map<CountryCode, ? extends List<? extends DocumentType>> documentsSelection) {
        Intrinsics.checkNotNullParameter(documentsSelection, "documentsSelection");
        synchronized (this) {
            this.supportedDocumentsMap.clear();
            this.supportedDocumentsMap.putAll(documentsSelection);
            Unit unit = Unit.f186387a;
        }
    }
}
