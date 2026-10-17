package com.onfido.android.sdk.capture.document.supported.data.remote.datasource;

import com.onfido.android.sdk.capture.DocumentType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J \u0010\u000b\u001a\u00020\f2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/SupportedDocumentsLocalDataSource;", "", "()V", "supportedDocuments", "", "", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "getCountriesSupportedDocuments", "getSupportedCountries", "getSupportedDocumentTypes", "setDocuments", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SupportedDocumentsLocalDataSource {

    @NotNull
    private volatile Map<String, ? extends List<? extends DocumentType>> supportedDocuments = r0.g();

    @NotNull
    public final Map<String, List<DocumentType>> getCountriesSupportedDocuments() {
        return this.supportedDocuments;
    }

    @NotNull
    public final List<String> getSupportedCountries() {
        return d0.d1(this.supportedDocuments.keySet());
    }

    @NotNull
    public final List<DocumentType> getSupportedDocumentTypes() {
        return d0.U(w.u(this.supportedDocuments.values()));
    }

    public final void setDocuments(@NotNull Map<String, ? extends List<? extends DocumentType>> supportedDocuments) {
        Intrinsics.checkNotNullParameter(supportedDocuments, "supportedDocuments");
        this.supportedDocuments = supportedDocuments;
    }
}
