package com.onfido.android.sdk.capture.document.supported.data.repository;

import com.onfido.android.sdk.capture.DocumentType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RemoteSupportedDocumentsRepository$countriesSupportedDocuments$2 extends u implements Function0<Map<String, ? extends List<? extends DocumentType>>> {
    final /* synthetic */ RemoteSupportedDocumentsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSupportedDocumentsRepository$countriesSupportedDocuments$2(RemoteSupportedDocumentsRepository remoteSupportedDocumentsRepository) {
        super(0);
        this.this$0 = remoteSupportedDocumentsRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<String, List<DocumentType>> invoke() {
        return this.this$0.supportedDocumentsLocalDataSource.getCountriesSupportedDocuments();
    }
}
