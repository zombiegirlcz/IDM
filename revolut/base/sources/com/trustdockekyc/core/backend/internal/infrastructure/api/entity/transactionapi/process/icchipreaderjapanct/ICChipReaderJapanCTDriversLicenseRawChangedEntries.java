package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import mif.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014Jð\u0001\u0010\u0015\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawChangedEntries;", "", "", "", "issuingAuthorities", "commonNames", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters;", "externalCharactersInCommonNames", "kanas", "previousNames", "externalCharactersInPreviousNames", "addresses", "externalCharactersInAddresses", "conditions", "externalCharactersInConditions", "cancelConditions", "externalCharactersInCancelConditions", "remarks", "spares", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawChangedEntries;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDriversLicenseRawChangedEntries {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f107465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f107466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f107467c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f107468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f107469h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f107470j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f107471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f107472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f107473n;

    public ICChipReaderJapanCTDriversLicenseRawChangedEntries(@i(name = "issuing_authorities") @NotNull List<String> issuingAuthorities, @i(name = "common_names") @NotNull List<String> commonNames, @i(name = "external_characters_in_common_names") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInCommonNames, @i(name = "kanas") @NotNull List<String> kanas, @i(name = "previous_names") @NotNull List<String> previousNames, @i(name = "external_characters_in_previous_names") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInPreviousNames, @i(name = "addresses") @NotNull List<String> addresses, @i(name = "external_characters_in_addresses") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInAddresses, @i(name = "conditions") @NotNull List<String> conditions, @i(name = "external_characters_in_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInConditions, @i(name = "cancel_conditions") @NotNull List<String> cancelConditions, @i(name = "external_characters_in_cancel_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInCancelConditions, @i(name = "remarks") @NotNull List<String> remarks, @i(name = "spares") @NotNull List<String> spares) {
        Intrinsics.checkNotNullParameter(issuingAuthorities, "issuingAuthorities");
        Intrinsics.checkNotNullParameter(commonNames, "commonNames");
        Intrinsics.checkNotNullParameter(externalCharactersInCommonNames, "externalCharactersInCommonNames");
        Intrinsics.checkNotNullParameter(kanas, "kanas");
        Intrinsics.checkNotNullParameter(previousNames, "previousNames");
        Intrinsics.checkNotNullParameter(externalCharactersInPreviousNames, "externalCharactersInPreviousNames");
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        Intrinsics.checkNotNullParameter(externalCharactersInAddresses, "externalCharactersInAddresses");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(externalCharactersInConditions, "externalCharactersInConditions");
        Intrinsics.checkNotNullParameter(cancelConditions, "cancelConditions");
        Intrinsics.checkNotNullParameter(externalCharactersInCancelConditions, "externalCharactersInCancelConditions");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(spares, "spares");
        this.f107465a = issuingAuthorities;
        this.f107466b = commonNames;
        this.f107467c = externalCharactersInCommonNames;
        this.d = kanas;
        this.e = previousNames;
        this.f = externalCharactersInPreviousNames;
        this.f107468g = addresses;
        this.f107469h = externalCharactersInAddresses;
        this.i = conditions;
        this.f107470j = externalCharactersInConditions;
        this.k = cancelConditions;
        this.f107471l = externalCharactersInCancelConditions;
        this.f107472m = remarks;
        this.f107473n = spares;
    }

    @NotNull
    public final ICChipReaderJapanCTDriversLicenseRawChangedEntries copy(@i(name = "issuing_authorities") @NotNull List<String> issuingAuthorities, @i(name = "common_names") @NotNull List<String> commonNames, @i(name = "external_characters_in_common_names") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInCommonNames, @i(name = "kanas") @NotNull List<String> kanas, @i(name = "previous_names") @NotNull List<String> previousNames, @i(name = "external_characters_in_previous_names") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInPreviousNames, @i(name = "addresses") @NotNull List<String> addresses, @i(name = "external_characters_in_addresses") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInAddresses, @i(name = "conditions") @NotNull List<String> conditions, @i(name = "external_characters_in_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInConditions, @i(name = "cancel_conditions") @NotNull List<String> cancelConditions, @i(name = "external_characters_in_cancel_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters> externalCharactersInCancelConditions, @i(name = "remarks") @NotNull List<String> remarks, @i(name = "spares") @NotNull List<String> spares) {
        Intrinsics.checkNotNullParameter(issuingAuthorities, "issuingAuthorities");
        Intrinsics.checkNotNullParameter(commonNames, "commonNames");
        Intrinsics.checkNotNullParameter(externalCharactersInCommonNames, "externalCharactersInCommonNames");
        Intrinsics.checkNotNullParameter(kanas, "kanas");
        Intrinsics.checkNotNullParameter(previousNames, "previousNames");
        Intrinsics.checkNotNullParameter(externalCharactersInPreviousNames, "externalCharactersInPreviousNames");
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        Intrinsics.checkNotNullParameter(externalCharactersInAddresses, "externalCharactersInAddresses");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(externalCharactersInConditions, "externalCharactersInConditions");
        Intrinsics.checkNotNullParameter(cancelConditions, "cancelConditions");
        Intrinsics.checkNotNullParameter(externalCharactersInCancelConditions, "externalCharactersInCancelConditions");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(spares, "spares");
        return new ICChipReaderJapanCTDriversLicenseRawChangedEntries(issuingAuthorities, commonNames, externalCharactersInCommonNames, kanas, previousNames, externalCharactersInPreviousNames, addresses, externalCharactersInAddresses, conditions, externalCharactersInConditions, cancelConditions, externalCharactersInCancelConditions, remarks, spares);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDriversLicenseRawChangedEntries)) {
            return false;
        }
        ICChipReaderJapanCTDriversLicenseRawChangedEntries iCChipReaderJapanCTDriversLicenseRawChangedEntries = (ICChipReaderJapanCTDriversLicenseRawChangedEntries) obj2;
        return Intrinsics.f(this.f107465a, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107465a) && Intrinsics.f(this.f107466b, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107466b) && Intrinsics.f(this.f107467c, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107467c) && Intrinsics.f(this.d, iCChipReaderJapanCTDriversLicenseRawChangedEntries.d) && Intrinsics.f(this.e, iCChipReaderJapanCTDriversLicenseRawChangedEntries.e) && Intrinsics.f(this.f, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f) && Intrinsics.f(this.f107468g, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107468g) && Intrinsics.f(this.f107469h, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107469h) && Intrinsics.f(this.i, iCChipReaderJapanCTDriversLicenseRawChangedEntries.i) && Intrinsics.f(this.f107470j, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107470j) && Intrinsics.f(this.k, iCChipReaderJapanCTDriversLicenseRawChangedEntries.k) && Intrinsics.f(this.f107471l, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107471l) && Intrinsics.f(this.f107472m, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107472m) && Intrinsics.f(this.f107473n, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107473n);
    }

    public final int hashCode() {
        return this.f107473n.hashCode() + e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(this.f107465a.hashCode() * 31, this.f107466b), this.f107467c), this.d), this.e), this.f), this.f107468g), this.f107469h), this.i), this.f107470j), this.k), this.f107471l), this.f107472m);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTDriversLicenseRawChangedEntries(issuingAuthorities=");
        sb6.append(this.f107465a);
        sb6.append(", commonNames=");
        sb6.append(this.f107466b);
        sb6.append(", externalCharactersInCommonNames=");
        sb6.append(this.f107467c);
        sb6.append(", kanas=");
        sb6.append(this.d);
        sb6.append(", previousNames=");
        sb6.append(this.e);
        sb6.append(", externalCharactersInPreviousNames=");
        sb6.append(this.f);
        sb6.append(", addresses=");
        sb6.append(this.f107468g);
        sb6.append(", externalCharactersInAddresses=");
        sb6.append(this.f107469h);
        sb6.append(", conditions=");
        sb6.append(this.i);
        sb6.append(", externalCharactersInConditions=");
        sb6.append(this.f107470j);
        sb6.append(", cancelConditions=");
        sb6.append(this.k);
        sb6.append(", externalCharactersInCancelConditions=");
        sb6.append(this.f107471l);
        sb6.append(", remarks=");
        sb6.append(this.f107472m);
        sb6.append(", spares=");
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f107473n, sb6);
    }
}
