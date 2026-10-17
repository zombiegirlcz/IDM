package com.onfido.android.sdk.capture.ui.options.stepbuilder.document;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.ui.country_selection.CountryAlternatives;
import com.onfido.android.sdk.capture.ui.options.CaptureScreenStep;
import com.onfido.android.sdk.capture.ui.options.FlowStep;
import com.onfido.android.sdk.capture.ui.options.stepbuilder.DocumentCaptureWithCountryCodeScreenStepBuilder;
import com.onfido.android.sdk.capture.utils.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/options/stepbuilder/document/VisaCaptureBuilder;", "Lcom/onfido/android/sdk/capture/ui/options/stepbuilder/DocumentCaptureWithCountryCodeScreenStepBuilder;", "()V", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "build", "Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "withCountry", "Companion", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VisaCaptureBuilder extends DocumentCaptureWithCountryCodeScreenStepBuilder<VisaCaptureBuilder> {
    private CountryCode countryCode;

    @NotNull
    private static final DocumentType CURRENT_DOCUMENT_TYPE = DocumentType.VISA;

    @Override // com.onfido.android.sdk.capture.ui.options.stepbuilder.BaseDocumentCaptureScreenStepBuilder
    @NotNull
    public FlowStep build() {
        CountryCode countryCode = this.countryCode;
        return countryCode != null ? new CaptureScreenStep(CURRENT_DOCUMENT_TYPE, countryCode) : new CaptureScreenStep(CURRENT_DOCUMENT_TYPE, CountryAlternatives.NO_COUNTRY);
    }

    @Override // com.onfido.android.sdk.capture.ui.options.stepbuilder.DocumentCaptureWithCountryCodeScreenStepBuilder
    @NotNull
    public VisaCaptureBuilder withCountry(@NotNull CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.countryCode = countryCode;
        return this;
    }
}
