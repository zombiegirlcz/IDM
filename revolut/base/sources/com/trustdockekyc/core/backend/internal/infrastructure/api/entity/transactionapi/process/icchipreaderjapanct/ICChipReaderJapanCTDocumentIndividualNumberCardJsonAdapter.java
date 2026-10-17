package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import com.squareup.moshi.JsonDataException;
import k1m.e0;
import k1m.l;
import k1m.o;
import k1m.q;
import k1m.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1m.b;
import ngm.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentIndividualNumberCardJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentIndividualNumberCard;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "nullableStringAdapter", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTDocumentIndividualNumberCardJsonAdapter extends l {

    @NotNull
    private final l nullableStringAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public ICChipReaderJapanCTDocumentIndividualNumberCardJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"all_name", "last_name", "first_name", "previous_last_name", "alias_name", "gender", "date_of_birth", "address", "expire_date", "name_image", "address_image"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "allName");
        this.nullableStringAdapter = n.a(moshi, String.class, "lastName");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (true) {
            String str12 = str;
            String str13 = str2;
            String str14 = str3;
            String str15 = str4;
            String str16 = str5;
            String str17 = str6;
            String str18 = str7;
            String str19 = str8;
            String str20 = str9;
            if (!reader.i()) {
                String str21 = str10;
                reader.h();
                if (str12 == null) {
                    JsonDataException jsonDataExceptionE = b.e("allName", "all_name", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                    throw jsonDataExceptionE;
                }
                if (str17 == null) {
                    JsonDataException jsonDataExceptionE2 = b.e("gender", "gender", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
                    throw jsonDataExceptionE2;
                }
                if (str18 == null) {
                    JsonDataException jsonDataExceptionE3 = b.e("dateOfBirth", "date_of_birth", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
                    throw jsonDataExceptionE3;
                }
                if (str19 == null) {
                    JsonDataException jsonDataExceptionE4 = b.e("address", "address", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
                    throw jsonDataExceptionE4;
                }
                if (str20 == null) {
                    JsonDataException jsonDataExceptionE5 = b.e("expireDate", "expire_date", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE5, "missingProperty(...)");
                    throw jsonDataExceptionE5;
                }
                if (str21 == null) {
                    JsonDataException jsonDataExceptionE6 = b.e("nameImage", "name_image", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE6, "missingProperty(...)");
                    throw jsonDataExceptionE6;
                }
                if (str11 != null) {
                    return new ICChipReaderJapanCTDocumentIndividualNumberCard(str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str11);
                }
                JsonDataException jsonDataExceptionE7 = b.e("addressImage", "address_image", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE7, "missingProperty(...)");
                throw jsonDataExceptionE7;
            }
            String str22 = str10;
            switch (reader.p(this.options)) {
                case -1:
                    reader.q();
                    reader.r();
                    str10 = str22;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str9 = str20;
                    break;
                case 0:
                    str = (String) this.stringAdapter.a(reader);
                    if (str == null) {
                        JsonDataException jsonDataExceptionJ = b.j("allName", "all_name", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                        throw jsonDataExceptionJ;
                    }
                    str10 = str22;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str9 = str20;
                    break;
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.a(reader);
                    str10 = str22;
                    str = str12;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str9 = str20;
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.a(reader);
                    str10 = str22;
                    str = str12;
                    str2 = str13;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str9 = str20;
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.a(reader);
                    str10 = str22;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str9 = str20;
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.a(reader);
                    str10 = str22;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str9 = str20;
                    break;
                case 5:
                    str6 = (String) this.stringAdapter.a(reader);
                    if (str6 == null) {
                        JsonDataException jsonDataExceptionJ2 = b.j("gender", "gender", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                        throw jsonDataExceptionJ2;
                    }
                    str10 = str22;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    str7 = str18;
                    str8 = str19;
                    str9 = str20;
                    break;
                    break;
                case 6:
                    str7 = (String) this.stringAdapter.a(reader);
                    if (str7 == null) {
                        JsonDataException jsonDataExceptionJ3 = b.j("dateOfBirth", "date_of_birth", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                        throw jsonDataExceptionJ3;
                    }
                    str10 = str22;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str8 = str19;
                    str9 = str20;
                    break;
                    break;
                case 7:
                    str8 = (String) this.stringAdapter.a(reader);
                    if (str8 == null) {
                        JsonDataException jsonDataExceptionJ4 = b.j("address", "address", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                        throw jsonDataExceptionJ4;
                    }
                    str10 = str22;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str9 = str20;
                    break;
                    break;
                case 8:
                    str9 = (String) this.stringAdapter.a(reader);
                    if (str9 == null) {
                        JsonDataException jsonDataExceptionJ5 = b.j("expireDate", "expire_date", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ5, "unexpectedNull(...)");
                        throw jsonDataExceptionJ5;
                    }
                    str10 = str22;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    break;
                    break;
                case 9:
                    String str23 = (String) this.stringAdapter.a(reader);
                    if (str23 == null) {
                        JsonDataException jsonDataExceptionJ6 = b.j("nameImage", "name_image", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ6, "unexpectedNull(...)");
                        throw jsonDataExceptionJ6;
                    }
                    str10 = str23;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str9 = str20;
                    break;
                    break;
                case 10:
                    str11 = (String) this.stringAdapter.a(reader);
                    if (str11 == null) {
                        JsonDataException jsonDataExceptionJ7 = b.j("addressImage", "address_image", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ7, "unexpectedNull(...)");
                        throw jsonDataExceptionJ7;
                    }
                    str10 = str22;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str9 = str20;
                    break;
                default:
                    str10 = str22;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str9 = str20;
                    break;
            }
        }
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTDocumentIndividualNumberCard iCChipReaderJapanCTDocumentIndividualNumberCard = (ICChipReaderJapanCTDocumentIndividualNumberCard) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTDocumentIndividualNumberCard == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("all_name");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.f107440a);
        writer.h("last_name");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.f107441b);
        writer.h("first_name");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.f107442c);
        writer.h("previous_last_name");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.d);
        writer.h("alias_name");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.e);
        writer.h("gender");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.f);
        writer.h("date_of_birth");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.f107443g);
        writer.h("address");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.f107444h);
        writer.h("expire_date");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.i);
        writer.h("name_image");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.f107445j);
        writer.h("address_image");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentIndividualNumberCard.k);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(69, "GeneratedJsonAdapter(ICChipReaderJapanCTDocumentIndividualNumberCard)");
    }
}
