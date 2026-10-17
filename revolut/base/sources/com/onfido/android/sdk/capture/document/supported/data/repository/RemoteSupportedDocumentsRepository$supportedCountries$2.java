package com.onfido.android.sdk.capture.document.supported.data.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RemoteSupportedDocumentsRepository$supportedCountries$2 extends u implements Function0<List<? extends String>> {
    final /* synthetic */ RemoteSupportedDocumentsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSupportedDocumentsRepository$supportedCountries$2(RemoteSupportedDocumentsRepository remoteSupportedDocumentsRepository) {
        super(0);
        this.this$0 = remoteSupportedDocumentsRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<String> invoke() {
        return this.this$0.supportedDocumentsLocalDataSource.getSupportedCountries();
    }
}
