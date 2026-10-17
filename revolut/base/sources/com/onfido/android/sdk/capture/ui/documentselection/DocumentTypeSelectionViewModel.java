package com.onfido.android.sdk.capture.ui.documentselection;

import androidx.lifecycle.ViewModel;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.document.GenericDocument;
import com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository;
import com.onfido.android.sdk.capture.utils.CountryCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentTypeSelectionViewModel;", "Landroidx/lifecycle/ViewModel;", "supportedDocumentsRepository", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;", "(Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;)V", "getDocumentsForCountry", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getFullListOfDocumentsToDisplay", "Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentItem;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentTypeSelectionViewModel extends ViewModel {

    @NotNull
    private final SupportedDocumentsRepository supportedDocumentsRepository;

    public DocumentTypeSelectionViewModel(@NotNull SupportedDocumentsRepository supportedDocumentsRepository) {
        Intrinsics.checkNotNullParameter(supportedDocumentsRepository, "supportedDocumentsRepository");
        this.supportedDocumentsRepository = supportedDocumentsRepository;
    }

    @NotNull
    public final List<DocumentType> getDocumentsForCountry(@NotNull CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return this.supportedDocumentsRepository.findSupportedDocumentTypes(countryCode);
    }

    @NotNull
    public final List<DocumentItem> getFullListOfDocumentsToDisplay(@NotNull CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        List<DocumentType> documentsForCountry = getDocumentsForCountry(countryCode);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : documentsForCountry) {
            if (((DocumentType) obj2) != DocumentType.GENERIC) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new DocumentItem((DocumentType) it8.next()));
        }
        List<GenericDocument> listFindGenericDocuments = this.supportedDocumentsRepository.findGenericDocuments(countryCode);
        ArrayList arrayList3 = new ArrayList(w.t(listFindGenericDocuments, 10));
        for (GenericDocument genericDocument : listFindGenericDocuments) {
            arrayList3.add(new GenericDocumentItem(genericDocument.getDocumentTitle(), genericDocument.getDocumentSubtitle(), genericDocument.getDocumentPages()));
        }
        return d0.E0(arrayList3, arrayList2);
    }
}
