package com.fourthline.vision.document.ocr;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.DocumentType;
import com.fourthline.core.internal.ExtensionsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.r;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B\u001d\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/fourthline/vision/document/ocr/OcrCountryAndTypeValidator;", "Lcom/fourthline/vision/document/ocr/OcrValidator;", "Lyhm/r;", "", "Lcom/fourthline/core/DocumentType;", "Lkotlin/Function0;", "", "Lcom/fourthline/core/CountryNetworkModel;", "supportedCountriesFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "value", "", "Lcom/fourthline/vision/document/ocr/OcrValidationError;", "validate", "(Lyhm/r;)Ljava/util/Set;", "Lkotlin/jvm/functions/Function0;", "getSupportedCountries", "()Ljava/util/List;", "supportedCountries", "getSimplified", "(Lcom/fourthline/core/DocumentType;)Lcom/fourthline/core/DocumentType;", "simplified", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OcrCountryAndTypeValidator implements OcrValidator<r> {
    public static final int $stable = 0;

    @NotNull
    private final Function0<List<CountryNetworkModel>> supportedCountriesFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public OcrCountryAndTypeValidator(@NotNull Function0<? extends List<CountryNetworkModel>> supportedCountriesFactory) {
        Intrinsics.checkNotNullParameter(supportedCountriesFactory, "supportedCountriesFactory");
        this.supportedCountriesFactory = supportedCountriesFactory;
    }

    private final DocumentType getSimplified(DocumentType documentType) {
        return documentType == DocumentType.FRENCH_ID_CARD ? DocumentType.ID_CARD : documentType;
    }

    private final List<CountryNetworkModel> getSupportedCountries() {
        return (List) this.supportedCountriesFactory.invoke();
    }

    @Override // com.fourthline.vision.document.ocr.OcrValidator
    @NotNull
    public Set<OcrValidationError> validate(@NotNull r value) {
        Object obj2;
        Object next;
        CountryNetworkModel.Document document;
        List<String> nationalities;
        List<CountryNetworkModel.Document> idDocuments;
        Object next2;
        Intrinsics.checkNotNullParameter(value, "value");
        List<CountryNetworkModel> supportedCountries = getSupportedCountries();
        if (supportedCountries == null) {
            return h0.f322473a;
        }
        String str = (String) value.f314203c;
        Iterator<T> it8 = supportedCountries.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((CountryNetworkModel) next).getIssuingCountry(), ExtensionsKt.alpha3Code((String) value.f314201a))) {
                break;
            }
        }
        CountryNetworkModel countryNetworkModel = (CountryNetworkModel) next;
        if (countryNetworkModel == null || (idDocuments = countryNetworkModel.getIdDocuments()) == null) {
            document = null;
        } else {
            Iterator<T> it9 = idDocuments.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                if (getSimplified(((CountryNetworkModel.Document) next2).getType()) == getSimplified((DocumentType) value.f314202b)) {
                    break;
                }
            }
            document = (CountryNetworkModel.Document) next2;
        }
        if (document != null && (nationalities = document.getNationalities()) != null) {
            Iterator<T> it10 = nationalities.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                Object next3 = it10.next();
                String str2 = (String) next3;
                String str3 = (String) value.f314203c;
                if (Intrinsics.f(str2, str3 != null ? ExtensionsKt.alpha3Code(str3) : null)) {
                    obj2 = next3;
                    break;
                }
            }
            obj2 = (String) obj2;
        }
        return countryNetworkModel == null ? y0.b(OcrValidationError.ISSUING_COUNTRY_NOT_SUPPORTED) : document == null ? y0.b(OcrValidationError.DOCUMENT_TYPE_NOT_SUPPORTED) : (obj2 != null || str == null) ? h0.f322473a : y0.b(OcrValidationError.NATIONALITY_NOT_SUPPORTED);
    }
}
