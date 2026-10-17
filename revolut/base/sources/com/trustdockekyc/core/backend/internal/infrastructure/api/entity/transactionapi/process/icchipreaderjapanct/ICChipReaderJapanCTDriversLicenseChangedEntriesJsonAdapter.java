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
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseChangedEntriesJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseChangedEntries;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "", "listOfStringAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters;", "listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTDriversLicenseChangedEntriesJsonAdapter extends l {
    private volatile Constructor<ICChipReaderJapanCTDriversLicenseChangedEntries> constructorRef;

    @NotNull
    private final l listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter;

    @NotNull
    private final l listOfStringAdapter;

    @NotNull
    private final o options;

    public ICChipReaderJapanCTDriversLicenseChangedEntriesJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"issuing_authorities", "common_names", "external_characters_in_common_names", "kanas", "previous_names", "external_characters_in_previous_names", "addresses", "external_characters_in_addresses", "conditions", "external_characters_in_conditions", "cancel_conditions", "external_characters_in_cancel_conditions", "remarks", "spares"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        ParameterizedType parameterizedTypeD = l0.d(new Type[]{String.class});
        h0 h0Var = h0.f322473a;
        l lVarB = moshi.b(parameterizedTypeD, h0Var, "issuingAuthorities");
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        this.listOfStringAdapter = lVarB;
        l lVarB2 = moshi.b(l0.d(new Type[]{ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters.class}), h0Var, "externalCharactersInCommonNames");
        Intrinsics.checkNotNullExpressionValue(lVarB2, "adapter(...)");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter = lVarB2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        int i = -1;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        List list9 = null;
        List list10 = null;
        List list11 = null;
        List list12 = null;
        List list13 = null;
        List list14 = null;
        while (true) {
            List list15 = list;
            List list16 = list2;
            List list17 = list4;
            List list18 = list5;
            List list19 = list7;
            List list20 = list9;
            List list21 = list11;
            List list22 = list12;
            List list23 = list10;
            List list24 = list8;
            List list25 = list6;
            List list26 = list3;
            if (!reader.i()) {
                reader.h();
                if (i == -2725) {
                    if (list15 == null) {
                        JsonDataException jsonDataExceptionE = b.e("issuingAuthorities", "issuing_authorities", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                        throw jsonDataExceptionE;
                    }
                    if (list16 == null) {
                        JsonDataException jsonDataExceptionE2 = b.e("commonNames", "common_names", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
                        throw jsonDataExceptionE2;
                    }
                    Intrinsics.i(list26, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters>");
                    if (list17 == null) {
                        JsonDataException jsonDataExceptionE3 = b.e("kanas", "kanas", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
                        throw jsonDataExceptionE3;
                    }
                    if (list18 == null) {
                        JsonDataException jsonDataExceptionE4 = b.e("previousNames", "previous_names", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
                        throw jsonDataExceptionE4;
                    }
                    Intrinsics.i(list25, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters>");
                    if (list19 == null) {
                        JsonDataException jsonDataExceptionE5 = b.e("addresses", "addresses", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE5, "missingProperty(...)");
                        throw jsonDataExceptionE5;
                    }
                    Intrinsics.i(list24, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters>");
                    if (list20 == null) {
                        JsonDataException jsonDataExceptionE6 = b.e("conditions", "conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE6, "missingProperty(...)");
                        throw jsonDataExceptionE6;
                    }
                    Intrinsics.i(list23, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters>");
                    if (list21 == null) {
                        JsonDataException jsonDataExceptionE7 = b.e("cancelConditions", "cancel_conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE7, "missingProperty(...)");
                        throw jsonDataExceptionE7;
                    }
                    Intrinsics.i(list22, "null cannot be cast to non-null type kotlin.collections.List<com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharacters>");
                    if (list13 == null) {
                        JsonDataException jsonDataExceptionE8 = b.e("remarks", "remarks", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE8, "missingProperty(...)");
                        throw jsonDataExceptionE8;
                    }
                    if (list14 != null) {
                        return new ICChipReaderJapanCTDriversLicenseChangedEntries(list15, list16, list26, list17, list18, list25, list19, list24, list20, list23, list21, list22, list13, list14);
                    }
                    JsonDataException jsonDataExceptionE9 = b.e("spares", "spares", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE9, "missingProperty(...)");
                    throw jsonDataExceptionE9;
                }
                int i2 = i;
                Constructor<ICChipReaderJapanCTDriversLicenseChangedEntries> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    str = "issuingAuthorities";
                    declaredConstructor = ICChipReaderJapanCTDriversLicenseChangedEntries.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, List.class, List.class, List.class, List.class, List.class, List.class, List.class, List.class, List.class, List.class, Integer.TYPE, b.c);
                    this.constructorRef = declaredConstructor;
                    Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
                } else {
                    str = "issuingAuthorities";
                }
                if (list15 == null) {
                    JsonDataException jsonDataExceptionE10 = b.e(str, "issuing_authorities", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE10, "missingProperty(...)");
                    throw jsonDataExceptionE10;
                }
                if (list16 == null) {
                    JsonDataException jsonDataExceptionE11 = b.e("commonNames", "common_names", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE11, "missingProperty(...)");
                    throw jsonDataExceptionE11;
                }
                if (list17 == null) {
                    JsonDataException jsonDataExceptionE12 = b.e("kanas", "kanas", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE12, "missingProperty(...)");
                    throw jsonDataExceptionE12;
                }
                if (list18 == null) {
                    JsonDataException jsonDataExceptionE13 = b.e("previousNames", "previous_names", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE13, "missingProperty(...)");
                    throw jsonDataExceptionE13;
                }
                if (list19 == null) {
                    JsonDataException jsonDataExceptionE14 = b.e("addresses", "addresses", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE14, "missingProperty(...)");
                    throw jsonDataExceptionE14;
                }
                if (list20 == null) {
                    JsonDataException jsonDataExceptionE15 = b.e("conditions", "conditions", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE15, "missingProperty(...)");
                    throw jsonDataExceptionE15;
                }
                if (list21 == null) {
                    JsonDataException jsonDataExceptionE16 = b.e("cancelConditions", "cancel_conditions", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE16, "missingProperty(...)");
                    throw jsonDataExceptionE16;
                }
                if (list13 == null) {
                    JsonDataException jsonDataExceptionE17 = b.e("remarks", "remarks", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE17, "missingProperty(...)");
                    throw jsonDataExceptionE17;
                }
                if (list14 != null) {
                    ICChipReaderJapanCTDriversLicenseChangedEntries iCChipReaderJapanCTDriversLicenseChangedEntriesNewInstance = declaredConstructor.newInstance(list15, list16, list26, list17, list18, list25, list19, list24, list20, list23, list21, list22, list13, list14, Integer.valueOf(i2), null);
                    Intrinsics.checkNotNullExpressionValue(iCChipReaderJapanCTDriversLicenseChangedEntriesNewInstance, "newInstance(...)");
                    return iCChipReaderJapanCTDriversLicenseChangedEntriesNewInstance;
                }
                JsonDataException jsonDataExceptionE18 = b.e("spares", "spares", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE18, "missingProperty(...)");
                throw jsonDataExceptionE18;
            }
            switch (reader.p(this.options)) {
                case -1:
                    reader.q();
                    reader.r();
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                case 0:
                    List list27 = (List) this.listOfStringAdapter.a(reader);
                    if (list27 == null) {
                        JsonDataException jsonDataExceptionJ = b.j("issuingAuthorities", "issuing_authorities", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                        throw jsonDataExceptionJ;
                    }
                    list = list27;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                    break;
                case 1:
                    List list28 = (List) this.listOfStringAdapter.a(reader);
                    if (list28 == null) {
                        JsonDataException jsonDataExceptionJ2 = b.j("commonNames", "common_names", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                        throw jsonDataExceptionJ2;
                    }
                    list2 = list28;
                    list = list15;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                    break;
                case 2:
                    list3 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.a(reader);
                    if (list3 == null) {
                        JsonDataException jsonDataExceptionJ3 = b.j("externalCharactersInCommonNames", "external_characters_in_common_names", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                        throw jsonDataExceptionJ3;
                    }
                    i &= -5;
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    break;
                    break;
                case 3:
                    list4 = (List) this.listOfStringAdapter.a(reader);
                    if (list4 == null) {
                        JsonDataException jsonDataExceptionJ4 = b.j("kanas", "kanas", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                        throw jsonDataExceptionJ4;
                    }
                    list = list15;
                    list2 = list16;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                    break;
                case 4:
                    List list29 = (List) this.listOfStringAdapter.a(reader);
                    if (list29 == null) {
                        JsonDataException jsonDataExceptionJ5 = b.j("previousNames", "previous_names", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ5, "unexpectedNull(...)");
                        throw jsonDataExceptionJ5;
                    }
                    list5 = list29;
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                    break;
                case 5:
                    list6 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.a(reader);
                    if (list6 == null) {
                        JsonDataException jsonDataExceptionJ6 = b.j("externalCharactersInPreviousNames", "external_characters_in_previous_names", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ6, "unexpectedNull(...)");
                        throw jsonDataExceptionJ6;
                    }
                    i &= -33;
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list3 = list26;
                    break;
                    break;
                case 6:
                    list7 = (List) this.listOfStringAdapter.a(reader);
                    if (list7 == null) {
                        JsonDataException jsonDataExceptionJ7 = b.j("addresses", "addresses", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ7, "unexpectedNull(...)");
                        throw jsonDataExceptionJ7;
                    }
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                    break;
                case 7:
                    list8 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.a(reader);
                    if (list8 == null) {
                        JsonDataException jsonDataExceptionJ8 = b.j("externalCharactersInAddresses", "external_characters_in_addresses", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ8, "unexpectedNull(...)");
                        throw jsonDataExceptionJ8;
                    }
                    i &= -129;
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list6 = list25;
                    list3 = list26;
                    break;
                    break;
                case 8:
                    list9 = (List) this.listOfStringAdapter.a(reader);
                    if (list9 == null) {
                        JsonDataException jsonDataExceptionJ9 = b.j("conditions", "conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ9, "unexpectedNull(...)");
                        throw jsonDataExceptionJ9;
                    }
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                    break;
                case 9:
                    list10 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.a(reader);
                    if (list10 == null) {
                        JsonDataException jsonDataExceptionJ10 = b.j("externalCharactersInConditions", "external_characters_in_conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ10, "unexpectedNull(...)");
                        throw jsonDataExceptionJ10;
                    }
                    i &= -513;
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                    break;
                case 10:
                    List list30 = (List) this.listOfStringAdapter.a(reader);
                    if (list30 == null) {
                        JsonDataException jsonDataExceptionJ11 = b.j("cancelConditions", "cancel_conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ11, "unexpectedNull(...)");
                        throw jsonDataExceptionJ11;
                    }
                    list11 = list30;
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                    break;
                case 11:
                    list12 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.a(reader);
                    if (list12 == null) {
                        JsonDataException jsonDataExceptionJ12 = b.j("externalCharactersInCancelConditions", "external_characters_in_cancel_conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ12, "unexpectedNull(...)");
                        throw jsonDataExceptionJ12;
                    }
                    i &= -2049;
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                    break;
                case 12:
                    list13 = (List) this.listOfStringAdapter.a(reader);
                    if (list13 == null) {
                        JsonDataException jsonDataExceptionJ13 = b.j("remarks", "remarks", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ13, "unexpectedNull(...)");
                        throw jsonDataExceptionJ13;
                    }
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                case 13:
                    list14 = (List) this.listOfStringAdapter.a(reader);
                    if (list14 == null) {
                        JsonDataException jsonDataExceptionJ14 = b.j("spares", "spares", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ14, "unexpectedNull(...)");
                        throw jsonDataExceptionJ14;
                    }
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
                default:
                    list = list15;
                    list2 = list16;
                    list4 = list17;
                    list5 = list18;
                    list7 = list19;
                    list9 = list20;
                    list11 = list21;
                    list12 = list22;
                    list10 = list23;
                    list8 = list24;
                    list6 = list25;
                    list3 = list26;
                    break;
            }
        }
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTDriversLicenseChangedEntries iCChipReaderJapanCTDriversLicenseChangedEntries = (ICChipReaderJapanCTDriversLicenseChangedEntries) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTDriversLicenseChangedEntries == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("issuing_authorities");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.f107454a);
        writer.h("common_names");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.f107455b);
        writer.h("external_characters_in_common_names");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.f107456c);
        writer.h("kanas");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.d);
        writer.h("previous_names");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.e);
        writer.h("external_characters_in_previous_names");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.f);
        writer.h("addresses");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.f107457g);
        writer.h("external_characters_in_addresses");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.f107458h);
        writer.h("conditions");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.i);
        writer.h("external_characters_in_conditions");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.f107459j);
        writer.h("cancel_conditions");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.k);
        writer.h("external_characters_in_cancel_conditions");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.f107460l);
        writer.h("remarks");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.f107461m);
        writer.h("spares");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseChangedEntries.f107462n);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(69, "GeneratedJsonAdapter(ICChipReaderJapanCTDriversLicenseChangedEntries)");
    }
}
