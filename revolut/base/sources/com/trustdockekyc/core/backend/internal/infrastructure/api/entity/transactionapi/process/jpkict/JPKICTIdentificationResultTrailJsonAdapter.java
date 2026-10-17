package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import com.squareup.moshi.JsonDataException;
import java.time.LocalDateTime;
import k1m.e0;
import k1m.l;
import k1m.o;
import k1m.q;
import k1m.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultTrailJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultTrail;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "Ljava/time/LocalDateTime;", "localDateTimeAdapter", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JPKICTIdentificationResultTrailJsonAdapter extends l {

    @NotNull
    private final l localDateTimeAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public JPKICTIdentificationResultTrailJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"signature_id", "issuer_dn", "not_before", "not_after"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "signatureId");
        this.localDateTimeAdapter = n.a(moshi, LocalDateTime.class, "notBefore");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        String str2 = null;
        LocalDateTime localDateTime = null;
        LocalDateTime localDateTime2 = null;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.stringAdapter.a(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("signatureId", "signature_id", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                str2 = (String) this.stringAdapter.a(reader);
                if (str2 == null) {
                    JsonDataException jsonDataExceptionJ2 = l1m.b.j("issuerDn", "issuer_dn", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
            } else if (iP == 2) {
                localDateTime = (LocalDateTime) this.localDateTimeAdapter.a(reader);
                if (localDateTime == null) {
                    JsonDataException jsonDataExceptionJ3 = l1m.b.j("notBefore", "not_before", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                    throw jsonDataExceptionJ3;
                }
            } else if (iP == 3 && (localDateTime2 = (LocalDateTime) this.localDateTimeAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ4 = l1m.b.j("notAfter", "not_after", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                throw jsonDataExceptionJ4;
            }
        }
        reader.h();
        if (str == null) {
            JsonDataException jsonDataExceptionE = l1m.b.e("signatureId", "signature_id", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        if (str2 == null) {
            JsonDataException jsonDataExceptionE2 = l1m.b.e("issuerDn", "issuer_dn", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
            throw jsonDataExceptionE2;
        }
        if (localDateTime == null) {
            JsonDataException jsonDataExceptionE3 = l1m.b.e("notBefore", "not_before", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
            throw jsonDataExceptionE3;
        }
        if (localDateTime2 != null) {
            return new JPKICTIdentificationResultTrail(str, str2, localDateTime, localDateTime2);
        }
        JsonDataException jsonDataExceptionE4 = l1m.b.e("notAfter", "not_after", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
        throw jsonDataExceptionE4;
    }

    public final void c(t writer, Object obj2) {
        JPKICTIdentificationResultTrail jPKICTIdentificationResultTrail = (JPKICTIdentificationResultTrail) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (jPKICTIdentificationResultTrail == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("signature_id");
        this.stringAdapter.c(writer, jPKICTIdentificationResultTrail.f107520a);
        writer.h("issuer_dn");
        this.stringAdapter.c(writer, jPKICTIdentificationResultTrail.f107521b);
        writer.h("not_before");
        this.localDateTimeAdapter.c(writer, jPKICTIdentificationResultTrail.f107522c);
        writer.h("not_after");
        this.localDateTimeAdapter.c(writer, jPKICTIdentificationResultTrail.d);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(53, "GeneratedJsonAdapter(JPKICTIdentificationResultTrail)");
    }
}
