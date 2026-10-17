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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseExternalCharacterJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseExternalCharacter;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "intAdapter", "Lk1m/l;", "", "stringAdapter", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTDriversLicenseExternalCharacterJsonAdapter extends l {

    @NotNull
    private final l intAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public ICChipReaderJapanCTDriversLicenseExternalCharacterJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"index", "image"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.intAdapter = n.a(moshi, Integer.TYPE, "index");
        this.stringAdapter = n.a(moshi, String.class, "image");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        Integer num = null;
        String str = null;
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
            } else if (iP == 1 && (str = (String) this.stringAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ2 = b.j("image", "image", reader);
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
        if (str != null) {
            return new ICChipReaderJapanCTDriversLicenseExternalCharacter(iIntValue, str);
        }
        JsonDataException jsonDataExceptionE2 = b.e("image", "image", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
        throw jsonDataExceptionE2;
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTDriversLicenseExternalCharacter iCChipReaderJapanCTDriversLicenseExternalCharacter = (ICChipReaderJapanCTDriversLicenseExternalCharacter) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTDriversLicenseExternalCharacter == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("index");
        this.intAdapter.c(writer, Integer.valueOf(iCChipReaderJapanCTDriversLicenseExternalCharacter.f107463a));
        writer.h("image");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseExternalCharacter.f107464b);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(72, "GeneratedJsonAdapter(ICChipReaderJapanCTDriversLicenseExternalCharacter)");
    }
}
