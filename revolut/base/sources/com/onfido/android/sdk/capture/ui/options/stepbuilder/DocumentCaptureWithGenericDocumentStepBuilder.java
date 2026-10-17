package com.onfido.android.sdk.capture.ui.options.stepbuilder;

import com.onfido.android.sdk.capture.document.DocumentPages;
import com.onfido.android.sdk.capture.ui.options.stepbuilder.BaseDocumentCaptureScreenStepBuilder;
import com.onfido.android.sdk.capture.utils.CountryCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/options/stepbuilder/DocumentCaptureWithGenericDocumentStepBuilder;", "T", "Lcom/onfido/android/sdk/capture/ui/options/stepbuilder/BaseDocumentCaptureScreenStepBuilder;", "()V", "withCountry", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;)Lcom/onfido/android/sdk/capture/ui/options/stepbuilder/BaseDocumentCaptureScreenStepBuilder;", "withDocumentPages", "pages", "Lcom/onfido/android/sdk/capture/document/DocumentPages;", "(Lcom/onfido/android/sdk/capture/document/DocumentPages;)Lcom/onfido/android/sdk/capture/ui/options/stepbuilder/BaseDocumentCaptureScreenStepBuilder;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DocumentCaptureWithGenericDocumentStepBuilder<T extends BaseDocumentCaptureScreenStepBuilder> extends BaseDocumentCaptureScreenStepBuilder {
    @NotNull
    public abstract T withCountry(@NotNull CountryCode countryCode);

    @NotNull
    public abstract T withDocumentPages(@NotNull DocumentPages pages);
}
