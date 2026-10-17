package com.onfido.android.sdk.capture.document.supported.data.remote.datasource;

import cie.b;
import com.onfido.android.sdk.capture.document.supported.data.SupportedDocumentMapper;
import com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocument;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.api.client.data.SupportedDocuments;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ngm.e;
import org.jetbrains.annotations.NotNull;
import tgm.g;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0092\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/AllDocumentsRemoteDataSourceImpl;", "Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/AllDocumentsDataSource;", "apiService", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "documentMapper", "Lcom/onfido/android/sdk/capture/document/supported/data/SupportedDocumentMapper;", "(Lcom/onfido/android/sdk/capture/network/OnfidoApiService;Lcom/onfido/android/sdk/capture/document/supported/data/SupportedDocumentMapper;)V", "supportedDocuments", "", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;", "allSupportedDocuments", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class AllDocumentsRemoteDataSourceImpl implements AllDocumentsDataSource {

    @NotNull
    private final OnfidoApiService apiService;

    @NotNull
    private final SupportedDocumentMapper documentMapper;

    @NotNull
    private List<SupportedDocument> supportedDocuments;

    public AllDocumentsRemoteDataSourceImpl(@NotNull OnfidoApiService apiService, @NotNull SupportedDocumentMapper documentMapper) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(documentMapper, "documentMapper");
        this.apiService = apiService;
        this.documentMapper = documentMapper;
        this.supportedDocuments = f0.f322471a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportedDocuments allSupportedDocuments$lambda$0(Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return new SupportedDocuments(f0.f322471a, r0.g());
    }

    @Override // com.onfido.android.sdk.capture.document.supported.data.remote.datasource.AllDocumentsDataSource
    @NotNull
    public List<SupportedDocument> allSupportedDocuments() throws Exception {
        SupportedDocuments supportedDocuments;
        if (this.supportedDocuments.isEmpty()) {
            try {
                Single<SupportedDocuments> supportedDocuments$onfido_capture_sdk_core_release = this.apiService.getSupportedDocuments$onfido_capture_sdk_core_release();
                b bVar = new b(18);
                supportedDocuments$onfido_capture_sdk_core_release.getClass();
                g gVar = new g(supportedDocuments$onfido_capture_sdk_core_release, bVar, 2);
                e eVar = new e(1);
                gVar.c(eVar);
                Object objA = eVar.a();
                Intrinsics.h(objA);
                supportedDocuments = (SupportedDocuments) objA;
            } catch (Exception e) {
                if (!(e.getCause() instanceof InterruptedException)) {
                    throw e;
                }
                supportedDocuments = new SupportedDocuments(f0.f322471a, r0.g());
            }
            this.supportedDocuments = this.documentMapper.mapSupportedDocuments(supportedDocuments);
        }
        return this.supportedDocuments;
    }
}
