package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import a3m.a;
import a3m.h;
import a3m.l;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import mif.e0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e\u0012\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e\u0012\u000e\b\u0003\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e\u0012\u000e\b\u0003\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e\u0012\u000e\b\u0003\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u009e\u0002\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u00022\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u000e\b\u0003\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u000e\b\u0003\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u000e\b\u0003\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\b\b\u0003\u0010\u001c\u001a\u00020\u001b2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicense;", "", "", "commonName", "kana", "aliasName", "callName", "dateOfBirth", "address", "issueDate", "expireDate", "licenseNumber", "referenceNumber", "colorClass", "", "conditions", "issuingAuthority", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseVehicleCategory;", "categories", "previousName", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseExternalCharacter;", "externalCharactersInCommonName", "externalCharactersInPreviousName", "externalCharactersInAliasName", "externalCharactersInAddress", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters;", "externalCharactersInConditions", "", "hasChangedEntries", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseChangedEntries;", "changedEntries", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseChangedEntries;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseChangedEntries;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicense;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDocumentDriversLicense {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107424c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f107425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f107426h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f107427j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f107428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f107429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f107430n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f107431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f107432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f107433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f107434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f107435t;
    public final boolean u;
    public final ICChipReaderJapanCTDriversLicenseChangedEntries v;

    public ICChipReaderJapanCTDocumentDriversLicense(@i(name = "common_name") @NotNull String commonName, @i(name = "kana") @NotNull String kana, @i(name = "alias_name") String str, @i(name = "call_name") String str2, @i(name = "date_of_birth") @NotNull String dateOfBirth, @i(name = "address") @NotNull String address, @i(name = "issue_date") @NotNull String issueDate, @i(name = "expire_date") @NotNull String expireDate, @i(name = "license_number") @NotNull String licenseNumber, @i(name = "reference_number") @NotNull String referenceNumber, @i(name = "color_class") @NotNull String colorClass, @i(name = "conditions") @NotNull List<String> conditions, @i(name = "issuing_authority") @NotNull String issuingAuthority, @i(name = "categories") @NotNull List<ICChipReaderJapanCTDriversLicenseVehicleCategory> categories, @i(name = "previous_name") String str3, @i(name = "external_characters_in_common_name") @NotNull List<ICChipReaderJapanCTDriversLicenseExternalCharacter> externalCharactersInCommonName, @i(name = "external_characters_in_previous_name") @NotNull List<ICChipReaderJapanCTDriversLicenseExternalCharacter> externalCharactersInPreviousName, @i(name = "external_characters_in_alias_name") @NotNull List<ICChipReaderJapanCTDriversLicenseExternalCharacter> externalCharactersInAliasName, @i(name = "external_characters_in_address") @NotNull List<ICChipReaderJapanCTDriversLicenseExternalCharacter> externalCharactersInAddress, @i(name = "external_characters_in_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInConditions, @i(name = "has_changed_entries") boolean z, @i(name = "changed_entries") ICChipReaderJapanCTDriversLicenseChangedEntries iCChipReaderJapanCTDriversLicenseChangedEntries) {
        Intrinsics.checkNotNullParameter(commonName, "commonName");
        Intrinsics.checkNotNullParameter(kana, "kana");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(licenseNumber, "licenseNumber");
        Intrinsics.checkNotNullParameter(referenceNumber, "referenceNumber");
        Intrinsics.checkNotNullParameter(colorClass, "colorClass");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(issuingAuthority, "issuingAuthority");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(externalCharactersInCommonName, "externalCharactersInCommonName");
        Intrinsics.checkNotNullParameter(externalCharactersInPreviousName, "externalCharactersInPreviousName");
        Intrinsics.checkNotNullParameter(externalCharactersInAliasName, "externalCharactersInAliasName");
        Intrinsics.checkNotNullParameter(externalCharactersInAddress, "externalCharactersInAddress");
        Intrinsics.checkNotNullParameter(externalCharactersInConditions, "externalCharactersInConditions");
        this.f107422a = commonName;
        this.f107423b = kana;
        this.f107424c = str;
        this.d = str2;
        this.e = dateOfBirth;
        this.f = address;
        this.f107425g = issueDate;
        this.f107426h = expireDate;
        this.i = licenseNumber;
        this.f107427j = referenceNumber;
        this.k = colorClass;
        this.f107428l = conditions;
        this.f107429m = issuingAuthority;
        this.f107430n = categories;
        this.o = str3;
        this.f107431p = externalCharactersInCommonName;
        this.f107432q = externalCharactersInPreviousName;
        this.f107433r = externalCharactersInAliasName;
        this.f107434s = externalCharactersInAddress;
        this.f107435t = externalCharactersInConditions;
        this.u = z;
        this.v = iCChipReaderJapanCTDriversLicenseChangedEntries;
    }

    public final a a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        h hVar;
        List<ICChipReaderJapanCTDriversLicenseVehicleCategory> list = this.f107430n;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        for (ICChipReaderJapanCTDriversLicenseVehicleCategory iCChipReaderJapanCTDriversLicenseVehicleCategory : list) {
            iCChipReaderJapanCTDriversLicenseVehicleCategory.getClass();
            arrayList3.add(new l(iCChipReaderJapanCTDriversLicenseVehicleCategory.f107477a, iCChipReaderJapanCTDriversLicenseVehicleCategory.f107478b));
        }
        List<ICChipReaderJapanCTDriversLicenseExternalCharacter> list2 = this.f107431p;
        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
        for (ICChipReaderJapanCTDriversLicenseExternalCharacter iCChipReaderJapanCTDriversLicenseExternalCharacter : list2) {
            iCChipReaderJapanCTDriversLicenseExternalCharacter.getClass();
            arrayList4.add(new a3m.i(iCChipReaderJapanCTDriversLicenseExternalCharacter.f107463a, iCChipReaderJapanCTDriversLicenseExternalCharacter.f107464b));
        }
        List<ICChipReaderJapanCTDriversLicenseExternalCharacter> list3 = this.f107432q;
        ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
        for (ICChipReaderJapanCTDriversLicenseExternalCharacter iCChipReaderJapanCTDriversLicenseExternalCharacter2 : list3) {
            iCChipReaderJapanCTDriversLicenseExternalCharacter2.getClass();
            arrayList5.add(new a3m.i(iCChipReaderJapanCTDriversLicenseExternalCharacter2.f107463a, iCChipReaderJapanCTDriversLicenseExternalCharacter2.f107464b));
        }
        List<ICChipReaderJapanCTDriversLicenseExternalCharacter> list4 = this.f107433r;
        ArrayList arrayList6 = new ArrayList(w.t(list4, 10));
        for (ICChipReaderJapanCTDriversLicenseExternalCharacter iCChipReaderJapanCTDriversLicenseExternalCharacter3 : list4) {
            iCChipReaderJapanCTDriversLicenseExternalCharacter3.getClass();
            arrayList6.add(new a3m.i(iCChipReaderJapanCTDriversLicenseExternalCharacter3.f107463a, iCChipReaderJapanCTDriversLicenseExternalCharacter3.f107464b));
        }
        List<ICChipReaderJapanCTDriversLicenseExternalCharacter> list5 = this.f107434s;
        ArrayList arrayList7 = new ArrayList(w.t(list5, 10));
        for (ICChipReaderJapanCTDriversLicenseExternalCharacter iCChipReaderJapanCTDriversLicenseExternalCharacter4 : list5) {
            iCChipReaderJapanCTDriversLicenseExternalCharacter4.getClass();
            arrayList7.add(new a3m.i(iCChipReaderJapanCTDriversLicenseExternalCharacter4.f107463a, iCChipReaderJapanCTDriversLicenseExternalCharacter4.f107464b));
        }
        List list6 = this.f107435t;
        ArrayList arrayList8 = new ArrayList(w.t(list6, 10));
        Iterator it8 = list6.iterator();
        while (it8.hasNext()) {
            arrayList8.add(((ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters) it8.next()).a());
        }
        ICChipReaderJapanCTDriversLicenseChangedEntries iCChipReaderJapanCTDriversLicenseChangedEntries = this.v;
        if (iCChipReaderJapanCTDriversLicenseChangedEntries != null) {
            List list7 = iCChipReaderJapanCTDriversLicenseChangedEntries.f107454a;
            List list8 = iCChipReaderJapanCTDriversLicenseChangedEntries.f107455b;
            List list9 = iCChipReaderJapanCTDriversLicenseChangedEntries.f107456c;
            ArrayList arrayList9 = new ArrayList(w.t(list9, 10));
            Iterator it9 = list9.iterator();
            while (it9.hasNext()) {
                arrayList9.add(((ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters) it9.next()).a());
            }
            List list10 = iCChipReaderJapanCTDriversLicenseChangedEntries.d;
            List list11 = iCChipReaderJapanCTDriversLicenseChangedEntries.e;
            List list12 = iCChipReaderJapanCTDriversLicenseChangedEntries.f;
            arrayList = arrayList4;
            ArrayList arrayList10 = new ArrayList(w.t(list12, 10));
            Iterator it10 = list12.iterator();
            while (it10.hasNext()) {
                arrayList10.add(((ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters) it10.next()).a());
            }
            List list13 = iCChipReaderJapanCTDriversLicenseChangedEntries.f107457g;
            List list14 = iCChipReaderJapanCTDriversLicenseChangedEntries.f107458h;
            arrayList2 = arrayList5;
            ArrayList arrayList11 = new ArrayList(w.t(list14, 10));
            Iterator it11 = list14.iterator();
            while (it11.hasNext()) {
                arrayList11.add(((ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters) it11.next()).a());
            }
            List list15 = iCChipReaderJapanCTDriversLicenseChangedEntries.i;
            List list16 = iCChipReaderJapanCTDriversLicenseChangedEntries.f107459j;
            ArrayList arrayList12 = new ArrayList(w.t(list16, 10));
            Iterator it12 = list16.iterator();
            while (it12.hasNext()) {
                arrayList12.add(((ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters) it12.next()).a());
            }
            List list17 = iCChipReaderJapanCTDriversLicenseChangedEntries.k;
            List list18 = iCChipReaderJapanCTDriversLicenseChangedEntries.f107460l;
            ArrayList arrayList13 = new ArrayList(w.t(list18, 10));
            Iterator it13 = list18.iterator();
            while (it13.hasNext()) {
                arrayList13.add(((ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters) it13.next()).a());
            }
            hVar = new h(list7, list8, arrayList9, list10, list11, arrayList10, list13, arrayList11, list15, arrayList12, list17, arrayList13, iCChipReaderJapanCTDriversLicenseChangedEntries.f107461m, iCChipReaderJapanCTDriversLicenseChangedEntries.f107462n);
        } else {
            arrayList = arrayList4;
            arrayList2 = arrayList5;
            hVar = null;
        }
        return new a(this.f107422a, this.f107423b, this.f107424c, this.d, this.e, this.f, this.f107425g, this.f107426h, this.i, this.f107427j, this.k, this.f107428l, this.f107429m, arrayList3, this.o, arrayList, arrayList2, arrayList6, arrayList7, arrayList8, this.u, hVar);
    }

    @NotNull
    public final ICChipReaderJapanCTDocumentDriversLicense copy(@i(name = "common_name") @NotNull String commonName, @i(name = "kana") @NotNull String kana, @i(name = "alias_name") String aliasName, @i(name = "call_name") String callName, @i(name = "date_of_birth") @NotNull String dateOfBirth, @i(name = "address") @NotNull String address, @i(name = "issue_date") @NotNull String issueDate, @i(name = "expire_date") @NotNull String expireDate, @i(name = "license_number") @NotNull String licenseNumber, @i(name = "reference_number") @NotNull String referenceNumber, @i(name = "color_class") @NotNull String colorClass, @i(name = "conditions") @NotNull List<String> conditions, @i(name = "issuing_authority") @NotNull String issuingAuthority, @i(name = "categories") @NotNull List<ICChipReaderJapanCTDriversLicenseVehicleCategory> categories, @i(name = "previous_name") String previousName, @i(name = "external_characters_in_common_name") @NotNull List<ICChipReaderJapanCTDriversLicenseExternalCharacter> externalCharactersInCommonName, @i(name = "external_characters_in_previous_name") @NotNull List<ICChipReaderJapanCTDriversLicenseExternalCharacter> externalCharactersInPreviousName, @i(name = "external_characters_in_alias_name") @NotNull List<ICChipReaderJapanCTDriversLicenseExternalCharacter> externalCharactersInAliasName, @i(name = "external_characters_in_address") @NotNull List<ICChipReaderJapanCTDriversLicenseExternalCharacter> externalCharactersInAddress, @i(name = "external_characters_in_conditions") @NotNull List<ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters> externalCharactersInConditions, @i(name = "has_changed_entries") boolean hasChangedEntries, @i(name = "changed_entries") ICChipReaderJapanCTDriversLicenseChangedEntries changedEntries) {
        Intrinsics.checkNotNullParameter(commonName, "commonName");
        Intrinsics.checkNotNullParameter(kana, "kana");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(licenseNumber, "licenseNumber");
        Intrinsics.checkNotNullParameter(referenceNumber, "referenceNumber");
        Intrinsics.checkNotNullParameter(colorClass, "colorClass");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(issuingAuthority, "issuingAuthority");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(externalCharactersInCommonName, "externalCharactersInCommonName");
        Intrinsics.checkNotNullParameter(externalCharactersInPreviousName, "externalCharactersInPreviousName");
        Intrinsics.checkNotNullParameter(externalCharactersInAliasName, "externalCharactersInAliasName");
        Intrinsics.checkNotNullParameter(externalCharactersInAddress, "externalCharactersInAddress");
        Intrinsics.checkNotNullParameter(externalCharactersInConditions, "externalCharactersInConditions");
        return new ICChipReaderJapanCTDocumentDriversLicense(commonName, kana, aliasName, callName, dateOfBirth, address, issueDate, expireDate, licenseNumber, referenceNumber, colorClass, conditions, issuingAuthority, categories, previousName, externalCharactersInCommonName, externalCharactersInPreviousName, externalCharactersInAliasName, externalCharactersInAddress, externalCharactersInConditions, hasChangedEntries, changedEntries);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDocumentDriversLicense)) {
            return false;
        }
        ICChipReaderJapanCTDocumentDriversLicense iCChipReaderJapanCTDocumentDriversLicense = (ICChipReaderJapanCTDocumentDriversLicense) obj2;
        return Intrinsics.f(this.f107422a, iCChipReaderJapanCTDocumentDriversLicense.f107422a) && Intrinsics.f(this.f107423b, iCChipReaderJapanCTDocumentDriversLicense.f107423b) && Intrinsics.f(this.f107424c, iCChipReaderJapanCTDocumentDriversLicense.f107424c) && Intrinsics.f(this.d, iCChipReaderJapanCTDocumentDriversLicense.d) && Intrinsics.f(this.e, iCChipReaderJapanCTDocumentDriversLicense.e) && Intrinsics.f(this.f, iCChipReaderJapanCTDocumentDriversLicense.f) && Intrinsics.f(this.f107425g, iCChipReaderJapanCTDocumentDriversLicense.f107425g) && Intrinsics.f(this.f107426h, iCChipReaderJapanCTDocumentDriversLicense.f107426h) && Intrinsics.f(this.i, iCChipReaderJapanCTDocumentDriversLicense.i) && Intrinsics.f(this.f107427j, iCChipReaderJapanCTDocumentDriversLicense.f107427j) && Intrinsics.f(this.k, iCChipReaderJapanCTDocumentDriversLicense.k) && Intrinsics.f(this.f107428l, iCChipReaderJapanCTDocumentDriversLicense.f107428l) && Intrinsics.f(this.f107429m, iCChipReaderJapanCTDocumentDriversLicense.f107429m) && Intrinsics.f(this.f107430n, iCChipReaderJapanCTDocumentDriversLicense.f107430n) && Intrinsics.f(this.o, iCChipReaderJapanCTDocumentDriversLicense.o) && Intrinsics.f(this.f107431p, iCChipReaderJapanCTDocumentDriversLicense.f107431p) && Intrinsics.f(this.f107432q, iCChipReaderJapanCTDocumentDriversLicense.f107432q) && Intrinsics.f(this.f107433r, iCChipReaderJapanCTDocumentDriversLicense.f107433r) && Intrinsics.f(this.f107434s, iCChipReaderJapanCTDocumentDriversLicense.f107434s) && Intrinsics.f(this.f107435t, iCChipReaderJapanCTDocumentDriversLicense.f107435t) && this.u == iCChipReaderJapanCTDocumentDriversLicense.u && Intrinsics.f(this.v, iCChipReaderJapanCTDocumentDriversLicense.v);
    }

    public final int hashCode() {
        int iA = w0.a(this.f107423b, this.f107422a.hashCode() * 31);
        String str = this.f107424c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iA2 = e0.a(w0.a(this.f107429m, e0.a(w0.a(this.k, w0.a(this.f107427j, w0.a(this.i, w0.a(this.f107426h, w0.a(this.f107425g, w0.a(this.f, w0.a(this.e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31))))))), this.f107428l)), this.f107430n);
        String str3 = this.o;
        int iC = j6.a.c(e0.a(e0.a(e0.a(e0.a(e0.a((iA2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.f107431p), this.f107432q), this.f107433r), this.f107434s), this.f107435t), 31, this.u);
        ICChipReaderJapanCTDriversLicenseChangedEntries iCChipReaderJapanCTDriversLicenseChangedEntries = this.v;
        return iC + (iCChipReaderJapanCTDriversLicenseChangedEntries != null ? iCChipReaderJapanCTDriversLicenseChangedEntries.hashCode() : 0);
    }

    public final String toString() {
        return "ICChipReaderJapanCTDocumentDriversLicense(commonName=" + this.f107422a + ", kana=" + this.f107423b + ", aliasName=" + this.f107424c + ", callName=" + this.d + ", dateOfBirth=" + this.e + ", address=" + this.f + ", issueDate=" + this.f107425g + ", expireDate=" + this.f107426h + ", licenseNumber=" + this.i + ", referenceNumber=" + this.f107427j + ", colorClass=" + this.k + ", conditions=" + this.f107428l + ", issuingAuthority=" + this.f107429m + ", categories=" + this.f107430n + ", previousName=" + this.o + ", externalCharactersInCommonName=" + this.f107431p + ", externalCharactersInPreviousName=" + this.f107432q + ", externalCharactersInAliasName=" + this.f107433r + ", externalCharactersInAddress=" + this.f107434s + ", externalCharactersInConditions=" + this.f107435t + ", hasChangedEntries=" + this.u + ", changedEntries=" + this.v + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ICChipReaderJapanCTDocumentDriversLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, List list2, String str13, List list3, List list4, List list5, List list6, List list7, boolean z, ICChipReaderJapanCTDriversLicenseChangedEntries iCChipReaderJapanCTDriversLicenseChangedEntries, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5, str6, str7, str8, str9, str10, str11, (i & 2048) != 0 ? f0.f322471a : list, str12, (i & 8192) != 0 ? f0.f322471a : list2, (i & 16384) != 0 ? null : str13, (32768 & i) != 0 ? f0.f322471a : list3, (65536 & i) != 0 ? f0.f322471a : list4, (131072 & i) != 0 ? f0.f322471a : list5, (262144 & i) != 0 ? f0.f322471a : list6, (524288 & i) != 0 ? f0.f322471a : list7, z, (i & PKIFailureInfo.badSenderNonce) != 0 ? null : iCChipReaderJapanCTDriversLicenseChangedEntries);
    }
}
