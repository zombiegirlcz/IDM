package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

import com.squareup.moshi.JsonDataException;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/GetSettingResponseJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/GetSettingResponse;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "", "booleanAdapter", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetSettingResponseJsonAdapter extends l {

    @NotNull
    private final l booleanAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public GetSettingResponseJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"background_color", "text_color", "development"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "backgroundColor");
        this.booleanAdapter = n.a(moshi, Boolean.TYPE, "development");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.stringAdapter.a(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("backgroundColor", "background_color", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                str2 = (String) this.stringAdapter.a(reader);
                if (str2 == null) {
                    JsonDataException jsonDataExceptionJ2 = l1m.b.j("textColor", "text_color", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
            } else if (iP == 2 && (bool = (Boolean) this.booleanAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ3 = l1m.b.j("development", "development", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                throw jsonDataExceptionJ3;
            }
        }
        reader.h();
        if (str == null) {
            JsonDataException jsonDataExceptionE = l1m.b.e("backgroundColor", "background_color", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        if (str2 == null) {
            JsonDataException jsonDataExceptionE2 = l1m.b.e("textColor", "text_color", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
            throw jsonDataExceptionE2;
        }
        if (bool != null) {
            return new GetSettingResponse(str, str2, bool.booleanValue());
        }
        JsonDataException jsonDataExceptionE3 = l1m.b.e("development", "development", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
        throw jsonDataExceptionE3;
    }

    public final void c(t writer, Object obj2) {
        GetSettingResponse getSettingResponse = (GetSettingResponse) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (getSettingResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("background_color");
        this.stringAdapter.c(writer, getSettingResponse.f107385a);
        writer.h("text_color");
        this.stringAdapter.c(writer, getSettingResponse.f107386b);
        writer.h("development");
        this.booleanAdapter.c(writer, Boolean.valueOf(getSettingResponse.f107387c));
        writer.g();
    }

    public final String toString() {
        return l9.l.a(40, "GeneratedJsonAdapter(GetSettingResponse)");
    }
}
