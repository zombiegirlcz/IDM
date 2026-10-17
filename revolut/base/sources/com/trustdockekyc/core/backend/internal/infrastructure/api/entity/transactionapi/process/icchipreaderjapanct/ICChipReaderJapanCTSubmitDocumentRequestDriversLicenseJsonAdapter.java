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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestDriversLicenseJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestDriversLicense;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawExternalCharacter;", "listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters;", "listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter", "", "stringAdapter", "", "booleanAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawChangedEntries;", "nullableICChipReaderJapanCTDriversLicenseRawChangedEntriesAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTSubmitDocumentRequestDriversLicenseJsonAdapter extends l {

    @NotNull
    private final l booleanAdapter;
    private volatile Constructor<ICChipReaderJapanCTSubmitDocumentRequestDriversLicense> constructorRef;

    @NotNull
    private final l listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter;

    @NotNull
    private final l listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTDriversLicenseRawChangedEntriesAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public ICChipReaderJapanCTSubmitDocumentRequestDriversLicenseJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"external_characters_in_common_name", "external_characters_in_previous_name", "external_characters_in_alias_name", "external_characters_in_address", "external_characters_in_conditions", "license_entries_raw_data", "photo_raw_data", "registered_domicile_raw_data", "has_changed_entries", "changed_entries"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        ParameterizedType parameterizedTypeD = l0.d(new Type[]{ICChipReaderJapanCTDriversLicenseRawExternalCharacter.class});
        h0 h0Var = h0.f322473a;
        l lVarB = moshi.b(parameterizedTypeD, h0Var, "externalCharactersInCommonName");
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter = lVarB;
        l lVarB2 = moshi.b(l0.d(new Type[]{ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters.class}), h0Var, "externalCharactersInConditions");
        Intrinsics.checkNotNullExpressionValue(lVarB2, "adapter(...)");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter = lVarB2;
        this.stringAdapter = n.a(moshi, String.class, "licenseEntriesRawData");
        this.booleanAdapter = n.a(moshi, Boolean.TYPE, "hasChangedEntries");
        this.nullableICChipReaderJapanCTDriversLicenseRawChangedEntriesAdapter = n.a(moshi, ICChipReaderJapanCTDriversLicenseRawChangedEntries.class, "changedEntries");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        List list;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        int i = -1;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        ICChipReaderJapanCTDriversLicenseRawChangedEntries iCChipReaderJapanCTDriversLicenseRawChangedEntries = null;
        while (true) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            Boolean bool2 = bool;
            ICChipReaderJapanCTDriversLicenseRawChangedEntries iCChipReaderJapanCTDriversLicenseRawChangedEntries2 = iCChipReaderJapanCTDriversLicenseRawChangedEntries;
            if (!reader.i()) {
                List list7 = list6;
                reader.h();
                if (i == -544) {
                    Intrinsics.i(list2, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDriversLicenseRawExternalCharacter>");
                    Intrinsics.i(list3, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDriversLicenseRawExternalCharacter>");
                    Intrinsics.i(list4, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDriversLicenseRawExternalCharacter>");
                    Intrinsics.i(list5, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDriversLicenseRawExternalCharacter>");
                    Intrinsics.i(list7, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters>");
                    if (str4 == null) {
                        JsonDataException jsonDataExceptionE = b.e("licenseEntriesRawData", "license_entries_raw_data", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                        throw jsonDataExceptionE;
                    }
                    if (str5 == null) {
                        JsonDataException jsonDataExceptionE2 = b.e("photoRawData", "photo_raw_data", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
                        throw jsonDataExceptionE2;
                    }
                    if (str6 == null) {
                        JsonDataException jsonDataExceptionE3 = b.e("registeredDomicileRawData", "registered_domicile_raw_data", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
                        throw jsonDataExceptionE3;
                    }
                    if (bool2 == null) {
                        JsonDataException jsonDataExceptionE4 = b.e("hasChangedEntries", "has_changed_entries", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
                        throw jsonDataExceptionE4;
                    }
                    List list8 = list5;
                    List list9 = list4;
                    return new ICChipReaderJapanCTSubmitDocumentRequestDriversLicense(list2, list3, list9, list8, list7, str4, str5, str6, bool2.booleanValue(), iCChipReaderJapanCTDriversLicenseRawChangedEntries2);
                }
                int i2 = i;
                List list10 = list2;
                Constructor<ICChipReaderJapanCTSubmitDocumentRequestDriversLicense> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    list = list3;
                    declaredConstructor = ICChipReaderJapanCTSubmitDocumentRequestDriversLicense.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, List.class, String.class, String.class, String.class, Boolean.TYPE, ICChipReaderJapanCTDriversLicenseRawChangedEntries.class, Integer.TYPE, b.c);
                    this.constructorRef = declaredConstructor;
                    Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
                } else {
                    list = list3;
                }
                if (str4 == null) {
                    JsonDataException jsonDataExceptionE5 = b.e("licenseEntriesRawData", "license_entries_raw_data", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE5, "missingProperty(...)");
                    throw jsonDataExceptionE5;
                }
                if (str5 == null) {
                    JsonDataException jsonDataExceptionE6 = b.e("photoRawData", "photo_raw_data", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE6, "missingProperty(...)");
                    throw jsonDataExceptionE6;
                }
                if (str6 == null) {
                    JsonDataException jsonDataExceptionE7 = b.e("registeredDomicileRawData", "registered_domicile_raw_data", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE7, "missingProperty(...)");
                    throw jsonDataExceptionE7;
                }
                if (bool2 == null) {
                    JsonDataException jsonDataExceptionE8 = b.e("hasChangedEntries", "has_changed_entries", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE8, "missingProperty(...)");
                    throw jsonDataExceptionE8;
                }
                ICChipReaderJapanCTSubmitDocumentRequestDriversLicense iCChipReaderJapanCTSubmitDocumentRequestDriversLicenseNewInstance = declaredConstructor.newInstance(list10, list, list4, list5, list7, str4, str5, str6, bool2, iCChipReaderJapanCTDriversLicenseRawChangedEntries2, Integer.valueOf(i2), null);
                Intrinsics.checkNotNullExpressionValue(iCChipReaderJapanCTSubmitDocumentRequestDriversLicenseNewInstance, "newInstance(...)");
                return iCChipReaderJapanCTSubmitDocumentRequestDriversLicenseNewInstance;
            }
            List list11 = list6;
            switch (reader.p(this.options)) {
                case -1:
                    reader.q();
                    reader.r();
                    list6 = list11;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    bool = bool2;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
                case 0:
                    list2 = (List) this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter.a(reader);
                    if (list2 == null) {
                        JsonDataException jsonDataExceptionJ = b.j("externalCharactersInCommonName", "external_characters_in_common_name", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                        throw jsonDataExceptionJ;
                    }
                    i &= -2;
                    list6 = list11;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    bool = bool2;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
                    break;
                case 1:
                    list3 = (List) this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter.a(reader);
                    if (list3 == null) {
                        JsonDataException jsonDataExceptionJ2 = b.j("externalCharactersInPreviousName", "external_characters_in_previous_name", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                        throw jsonDataExceptionJ2;
                    }
                    i &= -3;
                    list6 = list11;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    bool = bool2;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
                    break;
                case 2:
                    list4 = (List) this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter.a(reader);
                    if (list4 == null) {
                        JsonDataException jsonDataExceptionJ3 = b.j("externalCharactersInAliasName", "external_characters_in_alias_name", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                        throw jsonDataExceptionJ3;
                    }
                    i &= -5;
                    list6 = list11;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    bool = bool2;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
                    break;
                case 3:
                    list5 = (List) this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter.a(reader);
                    if (list5 == null) {
                        JsonDataException jsonDataExceptionJ4 = b.j("externalCharactersInAddress", "external_characters_in_address", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                        throw jsonDataExceptionJ4;
                    }
                    i &= -9;
                    list6 = list11;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    bool = bool2;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
                    break;
                case 4:
                    List list12 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.a(reader);
                    if (list12 == null) {
                        JsonDataException jsonDataExceptionJ5 = b.j("externalCharactersInConditions", "external_characters_in_conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ5, "unexpectedNull(...)");
                        throw jsonDataExceptionJ5;
                    }
                    i &= -17;
                    list6 = list12;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    bool = bool2;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
                    break;
                case 5:
                    str = (String) this.stringAdapter.a(reader);
                    if (str == null) {
                        JsonDataException jsonDataExceptionJ6 = b.j("licenseEntriesRawData", "license_entries_raw_data", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ6, "unexpectedNull(...)");
                        throw jsonDataExceptionJ6;
                    }
                    list6 = list11;
                    str2 = str5;
                    str3 = str6;
                    bool = bool2;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
                    break;
                case 6:
                    str2 = (String) this.stringAdapter.a(reader);
                    if (str2 == null) {
                        JsonDataException jsonDataExceptionJ7 = b.j("photoRawData", "photo_raw_data", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ7, "unexpectedNull(...)");
                        throw jsonDataExceptionJ7;
                    }
                    list6 = list11;
                    str = str4;
                    str3 = str6;
                    bool = bool2;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
                    break;
                case 7:
                    String str7 = (String) this.stringAdapter.a(reader);
                    if (str7 == null) {
                        JsonDataException jsonDataExceptionJ8 = b.j("registeredDomicileRawData", "registered_domicile_raw_data", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ8, "unexpectedNull(...)");
                        throw jsonDataExceptionJ8;
                    }
                    str3 = str7;
                    list6 = list11;
                    str = str4;
                    str2 = str5;
                    bool = bool2;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
                    break;
                case 8:
                    Boolean bool3 = (Boolean) this.booleanAdapter.a(reader);
                    if (bool3 == null) {
                        JsonDataException jsonDataExceptionJ9 = b.j("hasChangedEntries", "has_changed_entries", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ9, "unexpectedNull(...)");
                        throw jsonDataExceptionJ9;
                    }
                    bool = bool3;
                    list6 = list11;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
                    break;
                case 9:
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = (ICChipReaderJapanCTDriversLicenseRawChangedEntries) this.nullableICChipReaderJapanCTDriversLicenseRawChangedEntriesAdapter.a(reader);
                    i &= -513;
                    list6 = list11;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    bool = bool2;
                    break;
                default:
                    list6 = list11;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    bool = bool2;
                    iCChipReaderJapanCTDriversLicenseRawChangedEntries = iCChipReaderJapanCTDriversLicenseRawChangedEntries2;
                    break;
            }
        }
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTSubmitDocumentRequestDriversLicense iCChipReaderJapanCTSubmitDocumentRequestDriversLicense = (ICChipReaderJapanCTSubmitDocumentRequestDriversLicense) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTSubmitDocumentRequestDriversLicense == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("external_characters_in_common_name");
        this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107482a);
        writer.h("external_characters_in_previous_name");
        this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107483b);
        writer.h("external_characters_in_alias_name");
        this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107484c);
        writer.h("external_characters_in_address");
        this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.d);
        writer.h("external_characters_in_conditions");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.e);
        writer.h("license_entries_raw_data");
        this.stringAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f);
        writer.h("photo_raw_data");
        this.stringAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107485g);
        writer.h("registered_domicile_raw_data");
        this.stringAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107486h);
        writer.h("has_changed_entries");
        this.booleanAdapter.c(writer, Boolean.valueOf(iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.i));
        writer.h("changed_entries");
        this.nullableICChipReaderJapanCTDriversLicenseRawChangedEntriesAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.f107487j);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(76, "GeneratedJsonAdapter(ICChipReaderJapanCTSubmitDocumentRequestDriversLicense)");
    }
}
