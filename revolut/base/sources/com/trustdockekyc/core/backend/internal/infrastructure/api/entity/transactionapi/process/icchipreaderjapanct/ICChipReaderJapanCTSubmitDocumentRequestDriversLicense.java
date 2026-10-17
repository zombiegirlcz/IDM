package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.util.List;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import mif.e0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0094\u0001\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestDriversLicense;", "", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawExternalCharacter;", "externalCharactersInCommonName", "externalCharactersInPreviousName", "externalCharactersInAliasName", "externalCharactersInAddress", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters;", "externalCharactersInConditions", "", "licenseEntriesRawData", "photoRawData", "registeredDomicileRawData", "", "hasChangedEntries", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawChangedEntries;", "changedEntries", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawChangedEntries;)V", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawChangedEntries;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestDriversLicense;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTSubmitDocumentRequestDriversLicense {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f107482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f107483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f107484c;
    public final List d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f107485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f107486h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ICChipReaderJapanCTDriversLicenseRawChangedEntries f107487j;

    public ICChipReaderJapanCTSubmitDocumentRequestDriversLicense(@i(name = "external_characters_in_common_name") @NotNull List<ICChipReaderJapanCTDriversLicenseRawExternalCharacter> externalCharactersInCommonName, @i(name = "external_characters_in_previous_name") @NotNull List<ICChipReaderJapanCTDriversLicenseRawExternalCharacter> externalCharactersInPreviousName, @i(name = "external_characters_in_alias_name") @NotNull List<ICChipReaderJapanCTDriversLicenseRawExternalCharacter> externalCharactersInAliasName, @i(name = "external_characters_in_address") @NotNull List<ICChipReaderJapanCTDriversLicenseRawExternalCharacter> externalCharactersInAddress, @i(name = "external_characters_in_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInConditions, @i(name = "license_entries_raw_data") @NotNull String licenseEntriesRawData, @i(name = "photo_raw_data") @NotNull String photoRawData, @i(name = "registered_domicile_raw_data") @NotNull String registeredDomicileRawData, @i(name = "has_changed_entries") boolean z, @i(name = "changed_entries") ICChipReaderJapanCTDriversLicenseRawChangedEntries iCChipReaderJapanCTDriversLicenseRawChangedEntries) {
        Intrinsics.checkNotNullParameter(externalCharactersInCommonName, "externalCharactersInCommonName");
        Intrinsics.checkNotNullParameter(externalCharactersInPreviousName, "externalCharactersInPreviousName");
        Intrinsics.checkNotNullParameter(externalCharactersInAliasName, "externalCharactersInAliasName");
        Intrinsics.checkNotNullParameter(externalCharactersInAddress, "externalCharactersInAddress");
        Intrinsics.checkNotNullParameter(externalCharactersInConditions, "externalCharactersInConditions");
        Intrinsics.checkNotNullParameter(licenseEntriesRawData, "licenseEntriesRawData");
        Intrinsics.checkNotNullParameter(photoRawData, "photoRawData");
        Intrinsics.checkNotNullParameter(registeredDomicileRawData, "registeredDomicileRawData");
        this.f107482a = externalCharactersInCommonName;
        this.f107483b = externalCharactersInPreviousName;
        this.f107484c = externalCharactersInAliasName;
        this.d = externalCharactersInAddress;
        this.e = externalCharactersInConditions;
        this.f = licenseEntriesRawData;
        this.f107485g = photoRawData;
        this.f107486h = registeredDomicileRawData;
        this.i = z;
        this.f107487j = iCChipReaderJapanCTDriversLicenseRawChangedEntries;
    }

    @NotNull
    public final ICChipReaderJapanCTSubmitDocumentRequestDriversLicense copy(@i(name = "external_characters_in_common_name") @NotNull List<ICChipReaderJapanCTDriversLicenseRawExternalCharacter> externalCharactersInCommonName, @i(name = "external_characters_in_previous_name") @NotNull List<ICChipReaderJapanCTDriversLicenseRawExternalCharacter> externalCharactersInPreviousName, @i(name = "external_characters_in_alias_name") @NotNull List<ICChipReaderJapanCTDriversLicenseRawExternalCharacter> externalCharactersInAliasName, @i(name = "external_characters_in_address") @NotNull List<ICChipReaderJapanCTDriversLicenseRawExternalCharacter> externalCharactersInAddress, @i(name = "external_characters_in_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInConditions, @i(name = "license_entries_raw_data") @NotNull String licenseEntriesRawData, @i(name = "photo_raw_data") @NotNull String photoRawData, @i(name = "registered_domicile_raw_data") @NotNull String registeredDomicileRawData, @i(name = "has_changed_entries") boolean hasChangedEntries, @i(name = "changed_entries") ICChipReaderJapanCTDriversLicenseRawChangedEntries changedEntries) {
        Intrinsics.checkNotNullParameter(externalCharactersInCommonName, "externalCharactersInCommonName");
        Intrinsics.checkNotNullParameter(externalCharactersInPreviousName, "externalCharactersInPreviousName");
        Intrinsics.checkNotNullParameter(externalCharactersInAliasName, "externalCharactersInAliasName");
        Intrinsics.checkNotNullParameter(externalCharactersInAddress, "externalCharactersInAddress");
        Intrinsics.checkNotNullParameter(externalCharactersInConditions, "externalCharactersInConditions");
        Intrinsics.checkNotNullParameter(licenseEntriesRawData, "licenseEntriesRawData");
        Intrinsics.checkNotNullParameter(photoRawData, "photoRawData");
        Intrinsics.checkNotNullParameter(registeredDomicileRawData, "registeredDomicileRawData");
        return new ICChipReaderJapanCTSubmitDocumentRequestDriversLicense(externalCharactersInCommonName, externalCharactersInPreviousName, externalCharactersInAliasName, externalCharactersInAddress, externalCharactersInConditions, licenseEntriesRawData, photoRawData, registeredDomicileRawData, hasChangedEntries, changedEntries);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTSubmitDocumentRequestDriversLicense)) {
            return false;
        }
        ICChipReaderJapanCTSubmitDocumentRequestDriversLicense iCChipReaderJapanCTSubmitDocumentRequestDriversLicense = (ICChipReaderJapanCTSubmitDocumentRequestDriversLicense) obj2;
        return Intrinsics.f(this.f107482a, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107482a) && Intrinsics.f(this.f107483b, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107483b) && Intrinsics.f(this.f107484c, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107484c) && Intrinsics.f(this.d, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.d) && Intrinsics.f(this.e, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.e) && Intrinsics.f(this.f, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f) && Intrinsics.f(this.f107485g, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107485g) && Intrinsics.f(this.f107486h, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107486h) && this.i == iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.i && Intrinsics.f(this.f107487j, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107487j);
    }

    public final int hashCode() {
        int iC = a.c(w0.a(this.f107486h, w0.a(this.f107485g, w0.a(this.f, e0.a(e0.a(e0.a(e0.a(this.f107482a.hashCode() * 31, this.f107483b), this.f107484c), this.d), this.e)))), 31, this.i);
        ICChipReaderJapanCTDriversLicenseRawChangedEntries iCChipReaderJapanCTDriversLicenseRawChangedEntries = this.f107487j;
        return iC + (iCChipReaderJapanCTDriversLicenseRawChangedEntries == null ? 0 : iCChipReaderJapanCTDriversLicenseRawChangedEntries.hashCode());
    }

    public final String toString() {
        return "ICChipReaderJapanCTSubmitDocumentRequestDriversLicense(externalCharactersInCommonName=" + this.f107482a + ", externalCharactersInPreviousName=" + this.f107483b + ", externalCharactersInAliasName=" + this.f107484c + ", externalCharactersInAddress=" + this.d + ", externalCharactersInConditions=" + this.e + ", licenseEntriesRawData=" + this.f + ", photoRawData=" + this.f107485g + ", registeredDomicileRawData=" + this.f107486h + ", hasChangedEntries=" + this.i + ", changedEntries=" + this.f107487j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ICChipReaderJapanCTSubmitDocumentRequestDriversLicense(List list, List list2, List list3, List list4, List list5, String str, String str2, String str3, boolean z, ICChipReaderJapanCTDriversLicenseRawChangedEntries iCChipReaderJapanCTDriversLicenseRawChangedEntries, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f0.f322471a : list, (i & 2) != 0 ? f0.f322471a : list2, (i & 4) != 0 ? f0.f322471a : list3, (i & 8) != 0 ? f0.f322471a : list4, (i & 16) != 0 ? f0.f322471a : list5, str, str2, str3, z, (i & 512) != 0 ? null : iCChipReaderJapanCTDriversLicenseRawChangedEntries);
    }
}
