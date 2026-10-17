package com.onfido.android.sdk.capture.ui.options.stepbuilder.document;

import com.onfido.android.sdk.capture.DocumentFormat;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.errors.InvalidDocumentFormatAndCountryCombinationException;
import com.onfido.android.sdk.capture.ui.country_selection.CountryAlternatives;
import com.onfido.android.sdk.capture.ui.options.CaptureScreenStep;
import com.onfido.android.sdk.capture.ui.options.FlowStep;
import com.onfido.android.sdk.capture.ui.options.stepbuilder.DocumentCaptureWithCountryCodeScreenStepBuilder;
import com.onfido.android.sdk.capture.ui.options.stepbuilder.DocumentFormatSelection;
import com.onfido.android.sdk.capture.utils.CountryCode;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/options/stepbuilder/document/DrivingLicenceCaptureStepBuilder;", "Lcom/onfido/android/sdk/capture/ui/options/stepbuilder/DocumentCaptureWithCountryCodeScreenStepBuilder;", "Lcom/onfido/android/sdk/capture/ui/options/stepbuilder/DocumentFormatSelection;", "()V", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentFormat", "Lcom/onfido/android/sdk/capture/DocumentFormat;", "build", "Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "throwIllegalStateException", "", "validateFoldedDocumentTypeCountryConfiguration", "", "withCountry", "withDocumentFormat", "Companion", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DrivingLicenceCaptureStepBuilder extends DocumentCaptureWithCountryCodeScreenStepBuilder<DrivingLicenceCaptureStepBuilder> implements DocumentFormatSelection<DrivingLicenceCaptureStepBuilder> {
    private CountryCode countryCode;
    private DocumentFormat documentFormat;

    @NotNull
    private static final DocumentType CURRENT_DOCUMENT_TYPE = DocumentType.DRIVING_LICENCE;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.options.stepbuilder.document.DrivingLicenceCaptureStepBuilder$throwIllegalStateException$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements Function0<String> {
        public AnonymousClass1(Object obj2) {
            super(0, 0, Class.class, obj2, "getName", "getName()Ljava/lang/String;");
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((Class) this.receiver).getName();
        }
    }

    private final Void throwIllegalStateException() {
        throw new IllegalStateException("Step couldn't build due to unknown state for " + new AnonymousClass1(DrivingLicenceCaptureStepBuilder.class) + ". countryCode:" + this.countryCode + " documentFormat:" + this.documentFormat);
    }

    private final void validateFoldedDocumentTypeCountryConfiguration() {
        if (DocumentFormat.FOLDED == this.documentFormat) {
            CountryCode[] elements = {CountryCode.DE, CountryCode.FR};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (!d0.T(d.y0(elements), this.countryCode)) {
                throw new InvalidDocumentFormatAndCountryCombinationException();
            }
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.options.stepbuilder.BaseDocumentCaptureScreenStepBuilder
    @NotNull
    public FlowStep build() {
        validateFoldedDocumentTypeCountryConfiguration();
        CountryCode countryCode = this.countryCode;
        if (countryCode == null && this.documentFormat == null) {
            return new CaptureScreenStep(CURRENT_DOCUMENT_TYPE, CountryAlternatives.NO_COUNTRY);
        }
        if (countryCode == null && this.documentFormat != null) {
            DocumentType documentType = CURRENT_DOCUMENT_TYPE;
            CountryAlternatives countryAlternatives = CountryAlternatives.NO_COUNTRY;
            DocumentFormat documentFormat = this.documentFormat;
            Intrinsics.h(documentFormat);
            return new CaptureScreenStep(documentType, countryAlternatives, documentFormat);
        }
        if (countryCode != null && this.documentFormat == null) {
            DocumentType documentType2 = CURRENT_DOCUMENT_TYPE;
            CountryCode countryCode2 = this.countryCode;
            Intrinsics.h(countryCode2);
            return new CaptureScreenStep(documentType2, countryCode2);
        }
        if (countryCode == null || this.documentFormat == null) {
            throwIllegalStateException();
            throw new KotlinNothingValueException();
        }
        DocumentType documentType3 = CURRENT_DOCUMENT_TYPE;
        CountryCode countryCode3 = this.countryCode;
        Intrinsics.h(countryCode3);
        DocumentFormat documentFormat2 = this.documentFormat;
        Intrinsics.h(documentFormat2);
        return new CaptureScreenStep(documentType3, countryCode3, documentFormat2);
    }

    @Override // com.onfido.android.sdk.capture.ui.options.stepbuilder.DocumentCaptureWithCountryCodeScreenStepBuilder
    @NotNull
    public DrivingLicenceCaptureStepBuilder withCountry(@NotNull CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.countryCode = countryCode;
        return this;
    }

    @Override // com.onfido.android.sdk.capture.ui.options.stepbuilder.DocumentFormatSelection
    @NotNull
    public DrivingLicenceCaptureStepBuilder withDocumentFormat(@NotNull DocumentFormat documentFormat) {
        Intrinsics.checkNotNullParameter(documentFormat, "documentFormat");
        this.documentFormat = documentFormat;
        return this;
    }
}
