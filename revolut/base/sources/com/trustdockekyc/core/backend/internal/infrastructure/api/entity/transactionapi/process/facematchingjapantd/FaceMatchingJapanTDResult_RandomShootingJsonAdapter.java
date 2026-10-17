package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import com.squareup.moshi.JsonDataException;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.FaceMatchingJapanTDResult;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult_RandomShootingJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult$RandomShooting;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "", "floatAdapter", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceMatchingJapanTDResult_RandomShootingJsonAdapter extends l {

    @NotNull
    private final l floatAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public FaceMatchingJapanTDResult_RandomShootingJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"action", "similarity"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "action");
        this.floatAdapter = n.a(moshi, Float.TYPE, "similarity");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        Float f = null;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.stringAdapter.a(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("action", "action", reader);
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
        if (str == null) {
            JsonDataException jsonDataExceptionE = l1m.b.e("action", "action", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        if (f != null) {
            return new FaceMatchingJapanTDResult.RandomShooting(str, f.floatValue());
        }
        JsonDataException jsonDataExceptionE2 = l1m.b.e("similarity", "similarity", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
        throw jsonDataExceptionE2;
    }

    public final void c(t writer, Object obj2) {
        FaceMatchingJapanTDResult.RandomShooting randomShooting = (FaceMatchingJapanTDResult.RandomShooting) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (randomShooting == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("action");
        this.stringAdapter.c(writer, randomShooting.f107410a);
        writer.h("similarity");
        this.floatAdapter.c(writer, Float.valueOf(randomShooting.f107411b));
        writer.g();
    }

    public final String toString() {
        return l9.l.a(62, "GeneratedJsonAdapter(FaceMatchingJapanTDResult.RandomShooting)");
    }
}
