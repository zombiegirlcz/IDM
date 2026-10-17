package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import com.squareup.moshi.JsonDataException;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "intAdapter", "Lk1m/l;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawExternalCharacter;", "listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersJsonAdapter extends l {

    @NotNull
    private final l intAdapter;

    @NotNull
    private final l listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter;

    @NotNull
    private final o options;

    public ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharactersJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"index", "external_characters"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.intAdapter = n.a(moshi, Integer.TYPE, "index");
        l lVarB = moshi.b(l0.d(new Type[]{ICChipReaderJapanCTDriversLicenseRawExternalCharacter.class}), h0.f322473a, "externalCharacters");
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter = lVarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        Integer num = null;
        List list = null;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                num = (Integer) this.intAdapter.a(reader);
                if (num == null) {
                    JsonDataException jsonDataExceptionJ = b.j("index", "index", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1 && (list = (List) this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ2 = b.j("externalCharacters", "external_characters", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                throw jsonDataExceptionJ2;
            }
        }
        reader.h();
        if (num == null) {
            JsonDataException jsonDataExceptionE = b.e("index", "index", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        int iIntValue = num.intValue();
        if (list != null) {
            return new ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters(iIntValue, list);
        }
        JsonDataException jsonDataExceptionE2 = b.e("externalCharacters", "external_characters", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
        throw jsonDataExceptionE2;
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters iCChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters = (ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("index");
        this.intAdapter.c(writer, Integer.valueOf(iCChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters.f107438a));
        writer.h("external_characters");
        this.listOfICChipReaderJapanCTDriversLicenseRawExternalCharacterAdapter.c(writer, iCChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters.f107439b);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(95, "GeneratedJsonAdapter(ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters)");
    }
}
