package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import k1m.e0;
import k1m.l;
import k1m.l0;
import k1m.o;
import k1m.q;
import k1m.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1m.b;
import ngm.n;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicense;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "nullableStringAdapter", "", "listOfStringAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseVehicleCategory;", "listOfICChipReaderJapanCTDriversLicenseVehicleCategoryAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseExternalCharacter;", "listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters;", "listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter", "", "booleanAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseChangedEntries;", "nullableICChipReaderJapanCTDriversLicenseChangedEntriesAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTDocumentDriversLicenseJsonAdapter extends l {

    @NotNull
    private final l booleanAdapter;
    private volatile Constructor<ICChipReaderJapanCTDocumentDriversLicense> constructorRef;

    @NotNull
    private final l listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter;

    @NotNull
    private final l listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter;

    @NotNull
    private final l listOfICChipReaderJapanCTDriversLicenseVehicleCategoryAdapter;

    @NotNull
    private final l listOfStringAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTDriversLicenseChangedEntriesAdapter;

    @NotNull
    private final l nullableStringAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public ICChipReaderJapanCTDocumentDriversLicenseJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"common_name", "kana", "alias_name", "call_name", "date_of_birth", "address", "issue_date", "expire_date", "license_number", "reference_number", "color_class", "conditions", "issuing_authority", "categories", "previous_name", "external_characters_in_common_name", "external_characters_in_previous_name", "external_characters_in_alias_name", "external_characters_in_address", "external_characters_in_conditions", "has_changed_entries", "changed_entries"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "commonName");
        this.nullableStringAdapter = n.a(moshi, String.class, "aliasName");
        ParameterizedType parameterizedTypeD = l0.d(new Type[]{String.class});
        h0 h0Var = h0.f322473a;
        l lVarB = moshi.b(parameterizedTypeD, h0Var, "conditions");
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        this.listOfStringAdapter = lVarB;
        l lVarB2 = moshi.b(l0.d(new Type[]{ICChipReaderJapanCTDriversLicenseVehicleCategory.class}), h0Var, "categories");
        Intrinsics.checkNotNullExpressionValue(lVarB2, "adapter(...)");
        this.listOfICChipReaderJapanCTDriversLicenseVehicleCategoryAdapter = lVarB2;
        l lVarB3 = moshi.b(l0.d(new Type[]{ICChipReaderJapanCTDriversLicenseExternalCharacter.class}), h0Var, "externalCharactersInCommonName");
        Intrinsics.checkNotNullExpressionValue(lVarB3, "adapter(...)");
        this.listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter = lVarB3;
        l lVarB4 = moshi.b(l0.d(new Type[]{ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters.class}), h0Var, "externalCharactersInConditions");
        Intrinsics.checkNotNullExpressionValue(lVarB4, "adapter(...)");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter = lVarB4;
        this.booleanAdapter = n.a(moshi, Boolean.TYPE, "hasChangedEntries");
        this.nullableICChipReaderJapanCTDriversLicenseChangedEntriesAdapter = n.a(moshi, ICChipReaderJapanCTDriversLicenseChangedEntries.class, "changedEntries");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list6 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        Boolean bool = null;
        ICChipReaderJapanCTDriversLicenseChangedEntries iCChipReaderJapanCTDriversLicenseChangedEntries = null;
        int i = -1;
        List list7 = null;
        while (true) {
            String str15 = str2;
            String str16 = str3;
            String str17 = str4;
            String str18 = str5;
            String str19 = str6;
            String str20 = str7;
            List list8 = list7;
            List list9 = list4;
            List list10 = list5;
            List list11 = list6;
            List list12 = list2;
            List list13 = list3;
            List list14 = list;
            if (!reader.i()) {
                reader.h();
                if (i == -3139597) {
                    if (str9 == null) {
                        JsonDataException jsonDataExceptionE = b.e("commonName", "common_name", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                        throw jsonDataExceptionE;
                    }
                    if (str10 == null) {
                        JsonDataException jsonDataExceptionE2 = b.e("kana", "kana", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
                        throw jsonDataExceptionE2;
                    }
                    if (str14 == null) {
                        JsonDataException jsonDataExceptionE3 = b.e("dateOfBirth", "date_of_birth", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
                        throw jsonDataExceptionE3;
                    }
                    if (str15 == null) {
                        JsonDataException jsonDataExceptionE4 = b.e("address", "address", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
                        throw jsonDataExceptionE4;
                    }
                    if (str16 == null) {
                        JsonDataException jsonDataExceptionE5 = b.e("issueDate", "issue_date", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE5, "missingProperty(...)");
                        throw jsonDataExceptionE5;
                    }
                    if (str17 == null) {
                        JsonDataException jsonDataExceptionE6 = b.e("expireDate", "expire_date", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE6, "missingProperty(...)");
                        throw jsonDataExceptionE6;
                    }
                    if (str18 == null) {
                        JsonDataException jsonDataExceptionE7 = b.e("licenseNumber", "license_number", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE7, "missingProperty(...)");
                        throw jsonDataExceptionE7;
                    }
                    if (str19 == null) {
                        JsonDataException jsonDataExceptionE8 = b.e("referenceNumber", "reference_number", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE8, "missingProperty(...)");
                        throw jsonDataExceptionE8;
                    }
                    if (str20 == null) {
                        JsonDataException jsonDataExceptionE9 = b.e("colorClass", "color_class", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE9, "missingProperty(...)");
                        throw jsonDataExceptionE9;
                    }
                    Intrinsics.i(list14, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    if (str8 == null) {
                        JsonDataException jsonDataExceptionE10 = b.e("issuingAuthority", "issuing_authority", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE10, "missingProperty(...)");
                        throw jsonDataExceptionE10;
                    }
                    Intrinsics.i(list13, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDriversLicenseVehicleCategory>");
                    Intrinsics.i(list12, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDriversLicenseExternalCharacter>");
                    Intrinsics.i(list11, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDriversLicenseExternalCharacter>");
                    Intrinsics.i(list10, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDriversLicenseExternalCharacter>");
                    Intrinsics.i(list9, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDriversLicenseExternalCharacter>");
                    Intrinsics.i(list8, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters>");
                    if (bool == null) {
                        JsonDataException jsonDataExceptionE11 = b.e("hasChangedEntries", "has_changed_entries", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE11, "missingProperty(...)");
                        throw jsonDataExceptionE11;
                    }
                    return new ICChipReaderJapanCTDocumentDriversLicense(str9, str10, str11, str12, str14, str15, str16, str17, str18, str19, str20, list14, str8, list13, str13, list12, list11, list10, list9, list8, bool.booleanValue(), iCChipReaderJapanCTDriversLicenseChangedEntries);
                }
                String str21 = str11;
                String str22 = str12;
                String str23 = str9;
                int i2 = i;
                String str24 = str14;
                String str25 = str10;
                String str26 = str8;
                Constructor<ICChipReaderJapanCTDocumentDriversLicense> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    str = "issueDate";
                    declaredConstructor = ICChipReaderJapanCTDocumentDriversLicense.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, String.class, List.class, String.class, List.class, List.class, List.class, List.class, List.class, Boolean.TYPE, ICChipReaderJapanCTDriversLicenseChangedEntries.class, Integer.TYPE, b.c);
                    this.constructorRef = declaredConstructor;
                    Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
                } else {
                    str = "issueDate";
                }
                if (str23 == null) {
                    JsonDataException jsonDataExceptionE12 = b.e("commonName", "common_name", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE12, "missingProperty(...)");
                    throw jsonDataExceptionE12;
                }
                if (str25 == null) {
                    JsonDataException jsonDataExceptionE13 = b.e("kana", "kana", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE13, "missingProperty(...)");
                    throw jsonDataExceptionE13;
                }
                if (str24 == null) {
                    JsonDataException jsonDataExceptionE14 = b.e("dateOfBirth", "date_of_birth", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE14, "missingProperty(...)");
                    throw jsonDataExceptionE14;
                }
                if (str15 == null) {
                    JsonDataException jsonDataExceptionE15 = b.e("address", "address", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE15, "missingProperty(...)");
                    throw jsonDataExceptionE15;
                }
                if (str16 == null) {
                    JsonDataException jsonDataExceptionE16 = b.e(str, "issue_date", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE16, "missingProperty(...)");
                    throw jsonDataExceptionE16;
                }
                if (str17 == null) {
                    JsonDataException jsonDataExceptionE17 = b.e("expireDate", "expire_date", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE17, "missingProperty(...)");
                    throw jsonDataExceptionE17;
                }
                if (str18 == null) {
                    JsonDataException jsonDataExceptionE18 = b.e("licenseNumber", "license_number", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE18, "missingProperty(...)");
                    throw jsonDataExceptionE18;
                }
                if (str19 == null) {
                    JsonDataException jsonDataExceptionE19 = b.e("referenceNumber", "reference_number", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE19, "missingProperty(...)");
                    throw jsonDataExceptionE19;
                }
                if (str20 == null) {
                    JsonDataException jsonDataExceptionE20 = b.e("colorClass", "color_class", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE20, "missingProperty(...)");
                    throw jsonDataExceptionE20;
                }
                if (str26 == null) {
                    JsonDataException jsonDataExceptionE21 = b.e("issuingAuthority", "issuing_authority", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE21, "missingProperty(...)");
                    throw jsonDataExceptionE21;
                }
                if (bool == null) {
                    JsonDataException jsonDataExceptionE22 = b.e("hasChangedEntries", "has_changed_entries", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE22, "missingProperty(...)");
                    throw jsonDataExceptionE22;
                }
                ICChipReaderJapanCTDocumentDriversLicense iCChipReaderJapanCTDocumentDriversLicenseNewInstance = declaredConstructor.newInstance(str23, str25, str21, str22, str24, str15, str16, str17, str18, str19, str20, list14, str26, list13, str13, list12, list11, list10, list9, list8, bool, iCChipReaderJapanCTDriversLicenseChangedEntries, Integer.valueOf(i2), null);
                Intrinsics.checkNotNullExpressionValue(iCChipReaderJapanCTDocumentDriversLicenseNewInstance, "newInstance(...)");
                return iCChipReaderJapanCTDocumentDriversLicenseNewInstance;
            }
            switch (reader.p(this.options)) {
                case -1:
                    reader.q();
                    reader.r();
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                case 0:
                    str9 = (String) this.stringAdapter.a(reader);
                    if (str9 == null) {
                        JsonDataException jsonDataExceptionJ = b.j("commonName", "common_name", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                        throw jsonDataExceptionJ;
                    }
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                case 1:
                    str10 = (String) this.stringAdapter.a(reader);
                    if (str10 == null) {
                        JsonDataException jsonDataExceptionJ2 = b.j("kana", "kana", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                        throw jsonDataExceptionJ2;
                    }
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                case 2:
                    str11 = (String) this.nullableStringAdapter.a(reader);
                    i &= -5;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                case 3:
                    str12 = (String) this.nullableStringAdapter.a(reader);
                    i &= -9;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                case 4:
                    str14 = (String) this.stringAdapter.a(reader);
                    if (str14 == null) {
                        JsonDataException jsonDataExceptionJ3 = b.j("dateOfBirth", "date_of_birth", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                        throw jsonDataExceptionJ3;
                    }
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                case 5:
                    str2 = (String) this.stringAdapter.a(reader);
                    if (str2 == null) {
                        JsonDataException jsonDataExceptionJ4 = b.j("address", "address", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                        throw jsonDataExceptionJ4;
                    }
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                case 6:
                    str3 = (String) this.stringAdapter.a(reader);
                    if (str3 == null) {
                        JsonDataException jsonDataExceptionJ5 = b.j("issueDate", "issue_date", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ5, "unexpectedNull(...)");
                        throw jsonDataExceptionJ5;
                    }
                    str2 = str15;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                    break;
                case 7:
                    str4 = (String) this.stringAdapter.a(reader);
                    if (str4 == null) {
                        JsonDataException jsonDataExceptionJ6 = b.j("expireDate", "expire_date", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ6, "unexpectedNull(...)");
                        throw jsonDataExceptionJ6;
                    }
                    str2 = str15;
                    str3 = str16;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                    break;
                case 8:
                    String str27 = (String) this.stringAdapter.a(reader);
                    if (str27 == null) {
                        JsonDataException jsonDataExceptionJ7 = b.j("licenseNumber", "license_number", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ7, "unexpectedNull(...)");
                        throw jsonDataExceptionJ7;
                    }
                    str5 = str27;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                    break;
                case 9:
                    str6 = (String) this.stringAdapter.a(reader);
                    if (str6 == null) {
                        JsonDataException jsonDataExceptionJ8 = b.j("referenceNumber", "reference_number", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ8, "unexpectedNull(...)");
                        throw jsonDataExceptionJ8;
                    }
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                    break;
                case 10:
                    str7 = (String) this.stringAdapter.a(reader);
                    if (str7 == null) {
                        JsonDataException jsonDataExceptionJ9 = b.j("colorClass", "color_class", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ9, "unexpectedNull(...)");
                        throw jsonDataExceptionJ9;
                    }
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                    break;
                case 11:
                    list = (List) this.listOfStringAdapter.a(reader);
                    if (list == null) {
                        JsonDataException jsonDataExceptionJ10 = b.j("conditions", "conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ10, "unexpectedNull(...)");
                        throw jsonDataExceptionJ10;
                    }
                    i &= -2049;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    break;
                    break;
                case 12:
                    str8 = (String) this.stringAdapter.a(reader);
                    if (str8 == null) {
                        JsonDataException jsonDataExceptionJ11 = b.j("issuingAuthority", "issuing_authority", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ11, "unexpectedNull(...)");
                        throw jsonDataExceptionJ11;
                    }
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                case 13:
                    list3 = (List) this.listOfICChipReaderJapanCTDriversLicenseVehicleCategoryAdapter.a(reader);
                    if (list3 == null) {
                        JsonDataException jsonDataExceptionJ12 = b.j("categories", "categories", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ12, "unexpectedNull(...)");
                        throw jsonDataExceptionJ12;
                    }
                    i &= -8193;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list = list14;
                    break;
                    break;
                case 14:
                    str13 = (String) this.nullableStringAdapter.a(reader);
                    i &= -16385;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                case 15:
                    list2 = (List) this.listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter.a(reader);
                    if (list2 == null) {
                        JsonDataException jsonDataExceptionJ13 = b.j("externalCharactersInCommonName", "external_characters_in_common_name", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ13, "unexpectedNull(...)");
                        throw jsonDataExceptionJ13;
                    }
                    i &= -32769;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list3 = list13;
                    list = list14;
                    break;
                    break;
                case 16:
                    list6 = (List) this.listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter.a(reader);
                    if (list6 == null) {
                        JsonDataException jsonDataExceptionJ14 = b.j("externalCharactersInPreviousName", "external_characters_in_previous_name", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ14, "unexpectedNull(...)");
                        throw jsonDataExceptionJ14;
                    }
                    i &= -65537;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                    break;
                case 17:
                    list5 = (List) this.listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter.a(reader);
                    if (list5 == null) {
                        JsonDataException jsonDataExceptionJ15 = b.j("externalCharactersInAliasName", "external_characters_in_alias_name", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ15, "unexpectedNull(...)");
                        throw jsonDataExceptionJ15;
                    }
                    i &= -131073;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                    break;
                case 18:
                    list4 = (List) this.listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter.a(reader);
                    if (list4 == null) {
                        JsonDataException jsonDataExceptionJ16 = b.j("externalCharactersInAddress", "external_characters_in_address", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ16, "unexpectedNull(...)");
                        throw jsonDataExceptionJ16;
                    }
                    i &= -262145;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                    break;
                case 19:
                    list7 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.a(reader);
                    if (list7 == null) {
                        JsonDataException jsonDataExceptionJ17 = b.j("externalCharactersInConditions", "external_characters_in_conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ17, "unexpectedNull(...)");
                        throw jsonDataExceptionJ17;
                    }
                    i &= -524289;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                    break;
                case 20:
                    bool = (Boolean) this.booleanAdapter.a(reader);
                    if (bool == null) {
                        JsonDataException jsonDataExceptionJ18 = b.j("hasChangedEntries", "has_changed_entries", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ18, "unexpectedNull(...)");
                        throw jsonDataExceptionJ18;
                    }
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                case 21:
                    iCChipReaderJapanCTDriversLicenseChangedEntries = (ICChipReaderJapanCTDriversLicenseChangedEntries) this.nullableICChipReaderJapanCTDriversLicenseChangedEntriesAdapter.a(reader);
                    i &= -2097153;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
                default:
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    list7 = list8;
                    list4 = list9;
                    list5 = list10;
                    list6 = list11;
                    list2 = list12;
                    list3 = list13;
                    list = list14;
                    break;
            }
        }
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTDocumentDriversLicense iCChipReaderJapanCTDocumentDriversLicense = (ICChipReaderJapanCTDocumentDriversLicense) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTDocumentDriversLicense == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("common_name");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107422a);
        writer.h("kana");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107423b);
        writer.h("alias_name");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107424c);
        writer.h("call_name");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.d);
        writer.h("date_of_birth");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.e);
        writer.h("address");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f);
        writer.h("issue_date");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107425g);
        writer.h("expire_date");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107426h);
        writer.h("license_number");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.i);
        writer.h("reference_number");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107427j);
        writer.h("color_class");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.k);
        writer.h("conditions");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107428l);
        writer.h("issuing_authority");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107429m);
        writer.h("categories");
        this.listOfICChipReaderJapanCTDriversLicenseVehicleCategoryAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107430n);
        writer.h("previous_name");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.o);
        writer.h("external_characters_in_common_name");
        this.listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107431p);
        writer.h("external_characters_in_previous_name");
        this.listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107432q);
        writer.h("external_characters_in_alias_name");
        this.listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107433r);
        writer.h("external_characters_in_address");
        this.listOfICChipReaderJapanCTDriversLicenseExternalCharacterAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107434s);
        writer.h("external_characters_in_conditions");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.f107435t);
        writer.h("has_changed_entries");
        this.booleanAdapter.c(writer, Boolean.valueOf(iCChipReaderJapanCTDocumentDriversLicense.u));
        writer.h("changed_entries");
        this.nullableICChipReaderJapanCTDriversLicenseChangedEntriesAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicense.v);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(63, "GeneratedJsonAdapter(ICChipReaderJapanCTDocumentDriversLicense)");
    }
}
