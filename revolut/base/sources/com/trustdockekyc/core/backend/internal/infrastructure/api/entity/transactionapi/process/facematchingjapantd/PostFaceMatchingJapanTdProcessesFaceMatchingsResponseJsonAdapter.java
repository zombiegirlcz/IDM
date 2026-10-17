package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import com.squareup.moshi.JsonDataException;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesFaceMatchingsResponse;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsResponseJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsResponse;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsResponse$Result;", "resultAdapter", "Lk1m/l;", "", "floatAdapter", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PostFaceMatchingJapanTdProcessesFaceMatchingsResponseJsonAdapter extends l {

    @NotNull
    private final l floatAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l resultAdapter;

    public PostFaceMatchingJapanTdProcessesFaceMatchingsResponseJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"result", "similarity"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.resultAdapter = n.a(moshi, PostFaceMatchingJapanTdProcessesFaceMatchingsResponse.Result.class, "result");
        this.floatAdapter = n.a(moshi, Float.TYPE, "similarity");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        PostFaceMatchingJapanTdProcessesFaceMatchingsResponse.Result result = null;
        Float f = null;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                result = (PostFaceMatchingJapanTdProcessesFaceMatchingsResponse.Result) this.resultAdapter.a(reader);
                if (result == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("result", "result", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1 && (f = (Float) this.floatAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ2 = l1m.b.j("similarity", "similarity", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                throw jsonDataExceptionJ2;
            }
        }
        reader.h();
        if (result == null) {
            JsonDataException jsonDataExceptionE = l1m.b.e("result", "result", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        if (f != null) {
            return new PostFaceMatchingJapanTdProcessesFaceMatchingsResponse(result, f.floatValue());
        }
        JsonDataException jsonDataExceptionE2 = l1m.b.e("similarity", "similarity", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
        throw jsonDataExceptionE2;
    }

    public final void c(t writer, Object obj2) {
        PostFaceMatchingJapanTdProcessesFaceMatchingsResponse postFaceMatchingJapanTdProcessesFaceMatchingsResponse = (PostFaceMatchingJapanTdProcessesFaceMatchingsResponse) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (postFaceMatchingJapanTdProcessesFaceMatchingsResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("result");
        this.resultAdapter.c(writer, postFaceMatchingJapanTdProcessesFaceMatchingsResponse.f107415a);
        writer.h("similarity");
        this.floatAdapter.c(writer, Float.valueOf(postFaceMatchingJapanTdProcessesFaceMatchingsResponse.f107416b));
        writer.g();
    }

    public final String toString() {
        return l9.l.a(75, "GeneratedJsonAdapter(PostFaceMatchingJapanTdProcessesFaceMatchingsResponse)");
    }
}
