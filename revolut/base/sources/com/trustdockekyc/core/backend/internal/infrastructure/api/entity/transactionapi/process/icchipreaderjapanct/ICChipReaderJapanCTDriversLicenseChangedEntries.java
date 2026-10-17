package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import mif.e0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014Jð\u0001\u0010\u0015\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseChangedEntries;", "", "", "", "issuingAuthorities", "commonNames", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters;", "externalCharactersInCommonNames", "kanas", "previousNames", "externalCharactersInPreviousNames", "addresses", "externalCharactersInAddresses", "conditions", "externalCharactersInConditions", "cancelConditions", "externalCharactersInCancelConditions", "remarks", "spares", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseChangedEntries;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDriversLicenseChangedEntries {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f107454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f107455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f107456c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f107457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f107458h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f107459j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f107460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f107461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f107462n;

    public ICChipReaderJapanCTDriversLicenseChangedEntries(@i(name = "issuing_authorities") @NotNull List<String> issuingAuthorities, @i(name = "common_names") @NotNull List<String> commonNames, @i(name = "external_characters_in_common_names") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInCommonNames, @i(name = "kanas") @NotNull List<String> kanas, @i(name = "previous_names") @NotNull List<String> previousNames, @i(name = "external_characters_in_previous_names") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInPreviousNames, @i(name = "addresses") @NotNull List<String> addresses, @i(name = "external_characters_in_addresses") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInAddresses, @i(name = "conditions") @NotNull List<String> conditions, @i(name = "external_characters_in_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInConditions, @i(name = "cancel_conditions") @NotNull List<String> cancelConditions, @i(name = "external_characters_in_cancel_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInCancelConditions, @i(name = "remarks") @NotNull List<String> remarks, @i(name = "spares") @NotNull List<String> spares) {
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
        this.f107454a = issuingAuthorities;
        this.f107455b = commonNames;
        this.f107456c = externalCharactersInCommonNames;
        this.d = kanas;
        this.e = previousNames;
        this.f = externalCharactersInPreviousNames;
        this.f107457g = addresses;
        this.f107458h = externalCharactersInAddresses;
        this.i = conditions;
        this.f107459j = externalCharactersInConditions;
        this.k = cancelConditions;
        this.f107460l = externalCharactersInCancelConditions;
        this.f107461m = remarks;
        this.f107462n = spares;
    }

    @NotNull
    public final ICChipReaderJapanCTDriversLicenseChangedEntries copy(@i(name = "issuing_authorities") @NotNull List<String> issuingAuthorities, @i(name = "common_names") @NotNull List<String> commonNames, @i(name = "external_characters_in_common_names") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInCommonNames, @i(name = "kanas") @NotNull List<String> kanas, @i(name = "previous_names") @NotNull List<String> previousNames, @i(name = "external_characters_in_previous_names") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInPreviousNames, @i(name = "addresses") @NotNull List<String> addresses, @i(name = "external_characters_in_addresses") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInAddresses, @i(name = "conditions") @NotNull List<String> conditions, @i(name = "external_characters_in_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInConditions, @i(name = "cancel_conditions") @NotNull List<String> cancelConditions, @i(name = "external_characters_in_cancel_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInCancelConditions, @i(name = "remarks") @NotNull List<String> remarks, @i(name = "spares") @NotNull List<String> spares) {
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
        return new ICChipReaderJapanCTDriversLicenseChangedEntries(issuingAuthorities, commonNames, externalCharactersInCommonNames, kanas, previousNames, externalCharactersInPreviousNames, addresses, externalCharactersInAddresses, conditions, externalCharactersInConditions, cancelConditions, externalCharactersInCancelConditions, remarks, spares);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDriversLicenseChangedEntries)) {
            return false;
        }
        ICChipReaderJapanCTDriversLicenseChangedEntries iCChipReaderJapanCTDriversLicenseChangedEntries = (ICChipReaderJapanCTDriversLicenseChangedEntries) obj2;
        return Intrinsics.f(this.f107454a, iCChipReaderJapanCTDriversLicenseChangedEntries.f107454a) && Intrinsics.f(this.f107455b, iCChipReaderJapanCTDriversLicenseChangedEntries.f107455b) && Intrinsics.f(this.f107456c, iCChipReaderJapanCTDriversLicenseChangedEntries.f107456c) && Intrinsics.f(this.d, iCChipReaderJapanCTDriversLicenseChangedEntries.d) && Intrinsics.f(this.e, iCChipReaderJapanCTDriversLicenseChangedEntries.e) && Intrinsics.f(this.f, iCChipReaderJapanCTDriversLicenseChangedEntries.f) && Intrinsics.f(this.f107457g, iCChipReaderJapanCTDriversLicenseChangedEntries.f107457g) && Intrinsics.f(this.f107458h, iCChipReaderJapanCTDriversLicenseChangedEntries.f107458h) && Intrinsics.f(this.i, iCChipReaderJapanCTDriversLicenseChangedEntries.i) && Intrinsics.f(this.f107459j, iCChipReaderJapanCTDriversLicenseChangedEntries.f107459j) && Intrinsics.f(this.k, iCChipReaderJapanCTDriversLicenseChangedEntries.k) && Intrinsics.f(this.f107460l, iCChipReaderJapanCTDriversLicenseChangedEntries.f107460l) && Intrinsics.f(this.f107461m, iCChipReaderJapanCTDriversLicenseChangedEntries.f107461m) && Intrinsics.f(this.f107462n, iCChipReaderJapanCTDriversLicenseChangedEntries.f107462n);
    }

    public final int hashCode() {
        return this.f107462n.hashCode() + e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(this.f107454a.hashCode() * 31, this.f107455b), this.f107456c), this.d), this.e), this.f), this.f107457g), this.f107458h), this.i), this.f107459j), this.k), this.f107460l), this.f107461m);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTDriversLicenseChangedEntries(issuingAuthorities=");
        sb6.append(this.f107454a);
        sb6.append(", commonNames=");
        sb6.append(this.f107455b);
        sb6.append(", externalCharactersInCommonNames=");
        sb6.append(this.f107456c);
        sb6.append(", kanas=");
        sb6.append(this.d);
        sb6.append(", previousNames=");
        sb6.append(this.e);
        sb6.append(", externalCharactersInPreviousNames=");
        sb6.append(this.f);
        sb6.append(", addresses=");
        sb6.append(this.f107457g);
        sb6.append(", externalCharactersInAddresses=");
        sb6.append(this.f107458h);
        sb6.append(", conditions=");
        sb6.append(this.i);
        sb6.append(", externalCharactersInConditions=");
        sb6.append(this.f107459j);
        sb6.append(", cancelConditions=");
        sb6.append(this.k);
        sb6.append(", externalCharactersInCancelConditions=");
        sb6.append(this.f107460l);
        sb6.append(", remarks=");
        sb6.append(this.f107461m);
        sb6.append(", spares=");
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f107462n, sb6);
    }

    public ICChipReaderJapanCTDriversLicenseChangedEntries(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? f0.f322471a : list3, list4, list5, (i & 32) != 0 ? f0.f322471a : list6, list7, (i & 128) != 0 ? f0.f322471a : list8, list9, (i & 512) != 0 ? f0.f322471a : list10, list11, (i & 2048) != 0 ? f0.f322471a : list12, list13, list14);
    }
}
