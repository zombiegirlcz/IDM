package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import com.squareup.moshi.JsonDataException;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawChangedEntriesJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawChangedEntries;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "", "listOfStringAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters;", "listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTDriversLicenseRawChangedEntriesJsonAdapter extends l {

    @NotNull
    private final l listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter;

    @NotNull
    private final l listOfStringAdapter;

    @NotNull
    private final o options;

    public ICChipReaderJapanCTDriversLicenseRawChangedEntriesJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"issuing_authorities", "common_names", "external_characters_in_common_names", "kanas", "previous_names", "external_characters_in_previous_names", "addresses", "external_characters_in_addresses", "conditions", "external_characters_in_conditions", "cancel_conditions", "external_characters_in_cancel_conditions", "remarks", "spares"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        ParameterizedType parameterizedTypeD = l0.d(new Type[]{String.class});
        h0 h0Var = h0.f322473a;
        l lVarB = moshi.b(parameterizedTypeD, h0Var, "issuingAuthorities");
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        this.listOfStringAdapter = lVarB;
        l lVarB2 = moshi.b(l0.d(new Type[]{ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters.class}), h0Var, "externalCharactersInCommonNames");
        Intrinsics.checkNotNullExpressionValue(lVarB2, "adapter(...)");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter = lVarB2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
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
            List list17 = list3;
            List list18 = list4;
            List list19 = list5;
            List list20 = list6;
            List list21 = list7;
            List list22 = list8;
            List list23 = list9;
            List list24 = list10;
            List list25 = list11;
            List list26 = list12;
            if (!reader.i()) {
                reader.h();
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
                if (list17 == null) {
                    JsonDataException jsonDataExceptionE3 = b.e("externalCharactersInCommonNames", "external_characters_in_common_names", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
                    throw jsonDataExceptionE3;
                }
                if (list18 == null) {
                    JsonDataException jsonDataExceptionE4 = b.e("kanas", "kanas", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
                    throw jsonDataExceptionE4;
                }
                if (list19 == null) {
                    JsonDataException jsonDataExceptionE5 = b.e("previousNames", "previous_names", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE5, "missingProperty(...)");
                    throw jsonDataExceptionE5;
                }
                if (list20 == null) {
                    JsonDataException jsonDataExceptionE6 = b.e("externalCharactersInPreviousNames", "external_characters_in_previous_names", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE6, "missingProperty(...)");
                    throw jsonDataExceptionE6;
                }
                if (list21 == null) {
                    JsonDataException jsonDataExceptionE7 = b.e("addresses", "addresses", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE7, "missingProperty(...)");
                    throw jsonDataExceptionE7;
                }
                if (list22 == null) {
                    JsonDataException jsonDataExceptionE8 = b.e("externalCharactersInAddresses", "external_characters_in_addresses", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE8, "missingProperty(...)");
                    throw jsonDataExceptionE8;
                }
                if (list23 == null) {
                    JsonDataException jsonDataExceptionE9 = b.e("conditions", "conditions", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE9, "missingProperty(...)");
                    throw jsonDataExceptionE9;
                }
                if (list24 == null) {
                    JsonDataException jsonDataExceptionE10 = b.e("externalCharactersInConditions", "external_characters_in_conditions", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE10, "missingProperty(...)");
                    throw jsonDataExceptionE10;
                }
                if (list25 == null) {
                    JsonDataException jsonDataExceptionE11 = b.e("cancelConditions", "cancel_conditions", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE11, "missingProperty(...)");
                    throw jsonDataExceptionE11;
                }
                if (list26 == null) {
                    JsonDataException jsonDataExceptionE12 = b.e("externalCharactersInCancelConditions", "external_characters_in_cancel_conditions", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE12, "missingProperty(...)");
                    throw jsonDataExceptionE12;
                }
                if (list13 == null) {
                    JsonDataException jsonDataExceptionE13 = b.e("remarks", "remarks", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE13, "missingProperty(...)");
                    throw jsonDataExceptionE13;
                }
                if (list14 != null) {
                    return new ICChipReaderJapanCTDriversLicenseRawChangedEntries(list15, list16, list17, list18, list19, list20, list21, list22, list23, list24, list25, list26, list13, list14);
                }
                JsonDataException jsonDataExceptionE14 = b.e("spares", "spares", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE14, "missingProperty(...)");
                throw jsonDataExceptionE14;
            }
            switch (reader.p(this.options)) {
                case -1:
                    reader.q();
                    reader.r();
                    list = list15;
                    list2 = list16;
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
                    break;
                case 0:
                    list = (List) this.listOfStringAdapter.a(reader);
                    if (list == null) {
                        JsonDataException jsonDataExceptionJ = b.j("issuingAuthorities", "issuing_authorities", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                        throw jsonDataExceptionJ;
                    }
                    list2 = list16;
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
                    break;
                case 1:
                    list2 = (List) this.listOfStringAdapter.a(reader);
                    if (list2 == null) {
                        JsonDataException jsonDataExceptionJ2 = b.j("commonNames", "common_names", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                        throw jsonDataExceptionJ2;
                    }
                    list = list15;
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
                    break;
                    break;
                case 2:
                    List list27 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.a(reader);
                    if (list27 == null) {
                        JsonDataException jsonDataExceptionJ3 = b.j("externalCharactersInCommonNames", "external_characters_in_common_names", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                        throw jsonDataExceptionJ3;
                    }
                    list3 = list27;
                    list = list15;
                    list2 = list16;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
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
                    list3 = list17;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
                    break;
                    break;
                case 4:
                    list5 = (List) this.listOfStringAdapter.a(reader);
                    if (list5 == null) {
                        JsonDataException jsonDataExceptionJ5 = b.j("previousNames", "previous_names", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ5, "unexpectedNull(...)");
                        throw jsonDataExceptionJ5;
                    }
                    list = list15;
                    list2 = list16;
                    list3 = list17;
                    list4 = list18;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
                    break;
                    break;
                case 5:
                    list6 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.a(reader);
                    if (list6 == null) {
                        JsonDataException jsonDataExceptionJ6 = b.j("externalCharactersInPreviousNames", "external_characters_in_previous_names", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ6, "unexpectedNull(...)");
                        throw jsonDataExceptionJ6;
                    }
                    list = list15;
                    list2 = list16;
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
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
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
                    break;
                    break;
                case 7:
                    list8 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.a(reader);
                    if (list8 == null) {
                        JsonDataException jsonDataExceptionJ8 = b.j("externalCharactersInAddresses", "external_characters_in_addresses", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ8, "unexpectedNull(...)");
                        throw jsonDataExceptionJ8;
                    }
                    list = list15;
                    list2 = list16;
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
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
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
                    break;
                    break;
                case 9:
                    list10 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.a(reader);
                    if (list10 == null) {
                        JsonDataException jsonDataExceptionJ10 = b.j("externalCharactersInConditions", "external_characters_in_conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ10, "unexpectedNull(...)");
                        throw jsonDataExceptionJ10;
                    }
                    list = list15;
                    list2 = list16;
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list11 = list25;
                    list12 = list26;
                    break;
                    break;
                case 10:
                    list11 = (List) this.listOfStringAdapter.a(reader);
                    if (list11 == null) {
                        JsonDataException jsonDataExceptionJ11 = b.j("cancelConditions", "cancel_conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ11, "unexpectedNull(...)");
                        throw jsonDataExceptionJ11;
                    }
                    list = list15;
                    list2 = list16;
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list12 = list26;
                    break;
                    break;
                case 11:
                    List list28 = (List) this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.a(reader);
                    if (list28 == null) {
                        JsonDataException jsonDataExceptionJ12 = b.j("externalCharactersInCancelConditions", "external_characters_in_cancel_conditions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ12, "unexpectedNull(...)");
                        throw jsonDataExceptionJ12;
                    }
                    list12 = list28;
                    list = list15;
                    list2 = list16;
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
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
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
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
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
                    break;
                default:
                    list = list15;
                    list2 = list16;
                    list3 = list17;
                    list4 = list18;
                    list5 = list19;
                    list6 = list20;
                    list7 = list21;
                    list8 = list22;
                    list9 = list23;
                    list10 = list24;
                    list11 = list25;
                    list12 = list26;
                    break;
            }
        }
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTDriversLicenseRawChangedEntries iCChipReaderJapanCTDriversLicenseRawChangedEntries = (ICChipReaderJapanCTDriversLicenseRawChangedEntries) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTDriversLicenseRawChangedEntries == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("issuing_authorities");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107465a);
        writer.h("common_names");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107466b);
        writer.h("external_characters_in_common_names");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107467c);
        writer.h("kanas");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.d);
        writer.h("previous_names");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.e);
        writer.h("external_characters_in_previous_names");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f);
        writer.h("addresses");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107468g);
        writer.h("external_characters_in_addresses");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107469h);
        writer.h("conditions");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.i);
        writer.h("external_characters_in_conditions");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107470j);
        writer.h("cancel_conditions");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.k);
        writer.h("external_characters_in_cancel_conditions");
        this.listOfICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107471l);
        writer.h("remarks");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107472m);
        writer.h("spares");
        this.listOfStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseRawChangedEntries.f107473n);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(72, "GeneratedJsonAdapter(ICChipReaderJapanCTDriversLicenseRawChangedEntries)");
    }
}
