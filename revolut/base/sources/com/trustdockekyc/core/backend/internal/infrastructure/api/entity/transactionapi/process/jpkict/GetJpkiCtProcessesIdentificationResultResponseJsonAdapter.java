package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import com.squareup.moshi.JsonDataException;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.GetJpkiCtProcessesIdentificationResultResponse;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesIdentificationResultResponseJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesIdentificationResultResponse;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesIdentificationResultResponse$JPKICTIdentificationResultStatus;", "jPKICTIdentificationResultStatusAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;", "nullableJPKICTIdentificationResultAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetJpkiCtProcessesIdentificationResultResponseJsonAdapter extends l {
    private volatile Constructor<GetJpkiCtProcessesIdentificationResultResponse> constructorRef;

    @NotNull
    private final l jPKICTIdentificationResultStatusAdapter;

    @NotNull
    private final l nullableJPKICTIdentificationResultAdapter;

    @NotNull
    private final o options;

    public GetJpkiCtProcessesIdentificationResultResponseJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"status", "result"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.jPKICTIdentificationResultStatusAdapter = n.a(moshi, GetJpkiCtProcessesIdentificationResultResponse.JPKICTIdentificationResultStatus.class, "status");
        this.nullableJPKICTIdentificationResultAdapter = n.a(moshi, JPKICTIdentificationResult.class, "result");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        GetJpkiCtProcessesIdentificationResultResponse.JPKICTIdentificationResultStatus jPKICTIdentificationResultStatus = null;
        JPKICTIdentificationResult jPKICTIdentificationResult = null;
        int i = -1;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                jPKICTIdentificationResultStatus = (GetJpkiCtProcessesIdentificationResultResponse.JPKICTIdentificationResultStatus) this.jPKICTIdentificationResultStatusAdapter.a(reader);
                if (jPKICTIdentificationResultStatus == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("status", "status", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                jPKICTIdentificationResult = (JPKICTIdentificationResult) this.nullableJPKICTIdentificationResultAdapter.a(reader);
                i = -3;
            }
        }
        reader.h();
        if (i == -3) {
            if (jPKICTIdentificationResultStatus != null) {
                return new GetJpkiCtProcessesIdentificationResultResponse(jPKICTIdentificationResultStatus, jPKICTIdentificationResult);
            }
            JsonDataException jsonDataExceptionE = l1m.b.e("status", "status", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        Constructor<GetJpkiCtProcessesIdentificationResultResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = GetJpkiCtProcessesIdentificationResultResponse.class.getDeclaredConstructor(GetJpkiCtProcessesIdentificationResultResponse.JPKICTIdentificationResultStatus.class, JPKICTIdentificationResult.class, Integer.TYPE, l1m.b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (jPKICTIdentificationResultStatus != null) {
            GetJpkiCtProcessesIdentificationResultResponse getJpkiCtProcessesIdentificationResultResponseNewInstance = declaredConstructor.newInstance(jPKICTIdentificationResultStatus, jPKICTIdentificationResult, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(getJpkiCtProcessesIdentificationResultResponseNewInstance, "newInstance(...)");
            return getJpkiCtProcessesIdentificationResultResponseNewInstance;
        }
        JsonDataException jsonDataExceptionE2 = l1m.b.e("status", "status", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
        throw jsonDataExceptionE2;
    }

    public final void c(t writer, Object obj2) {
        GetJpkiCtProcessesIdentificationResultResponse getJpkiCtProcessesIdentificationResultResponse = (GetJpkiCtProcessesIdentificationResultResponse) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (getJpkiCtProcessesIdentificationResultResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("status");
        this.jPKICTIdentificationResultStatusAdapter.c(writer, getJpkiCtProcessesIdentificationResultResponse.f107506a);
        writer.h("result");
        this.nullableJPKICTIdentificationResultAdapter.c(writer, getJpkiCtProcessesIdentificationResultResponse.f107507b);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(68, "GeneratedJsonAdapter(GetJpkiCtProcessesIdentificationResultResponse)");
    }
}
