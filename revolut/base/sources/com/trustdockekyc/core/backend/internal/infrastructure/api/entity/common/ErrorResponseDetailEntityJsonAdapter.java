package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.common;

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
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/common/ErrorResponseDetailEntityJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/common/ErrorResponseDetailEntity;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/common/ErrorResponseParameterEntity;", "listOfErrorResponseParameterEntityAdapter", "Lk1m/l;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ErrorResponseDetailEntityJsonAdapter extends l {

    @NotNull
    private final l listOfErrorResponseParameterEntityAdapter;

    @NotNull
    private final o options;

    public ErrorResponseDetailEntityJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"error_parameters"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        l lVarB = moshi.b(l0.d(new Type[]{ErrorResponseParameterEntity.class}), h0.f322473a, "errorParameters");
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        this.listOfErrorResponseParameterEntityAdapter = lVarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        List list = null;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0 && (list = (List) this.listOfErrorResponseParameterEntityAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ = b.j("errorParameters", "error_parameters", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                throw jsonDataExceptionJ;
            }
        }
        reader.h();
        if (list != null) {
            return new ErrorResponseDetailEntity(list);
        }
        JsonDataException jsonDataExceptionE = b.e("errorParameters", "error_parameters", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
        throw jsonDataExceptionE;
    }

    public final void c(t writer, Object obj2) {
        ErrorResponseDetailEntity errorResponseDetailEntity = (ErrorResponseDetailEntity) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (errorResponseDetailEntity == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("error_parameters");
        this.listOfErrorResponseParameterEntityAdapter.c(writer, errorResponseDetailEntity.f107379a);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(47, "GeneratedJsonAdapter(ErrorResponseDetailEntity)");
    }
}
