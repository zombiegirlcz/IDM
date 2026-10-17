package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import com.squareup.moshi.JsonDataException;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.JPKICTIdentificationResult;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult$Result;", "resultAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultBasicPersonalInformation;", "nullableJPKICTIdentificationResultBasicPersonalInformationAdapter", "", "nullableStringAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKIIdentificationResultReasonResponse;", "nullableJPKIIdentificationResultReasonResponseAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultTrail;", "nullableJPKICTIdentificationResultTrailAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JPKICTIdentificationResultJsonAdapter extends l {
    private volatile Constructor<JPKICTIdentificationResult> constructorRef;

    @NotNull
    private final l nullableJPKICTIdentificationResultBasicPersonalInformationAdapter;

    @NotNull
    private final l nullableJPKICTIdentificationResultTrailAdapter;

    @NotNull
    private final l nullableJPKIIdentificationResultReasonResponseAdapter;

    @NotNull
    private final l nullableStringAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l resultAdapter;

    public JPKICTIdentificationResultJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"result", "basic_personal_information", "uid", "reason", "trail"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.resultAdapter = n.a(moshi, JPKICTIdentificationResult.Result.class, "result");
        this.nullableJPKICTIdentificationResultBasicPersonalInformationAdapter = n.a(moshi, JPKICTIdentificationResultBasicPersonalInformation.class, "basicPersonalInformation");
        this.nullableStringAdapter = n.a(moshi, String.class, "uid");
        this.nullableJPKIIdentificationResultReasonResponseAdapter = n.a(moshi, JPKIIdentificationResultReasonResponse.class, "reason");
        this.nullableJPKICTIdentificationResultTrailAdapter = n.a(moshi, JPKICTIdentificationResultTrail.class, "trail");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        JPKICTIdentificationResult.Result result = null;
        JPKICTIdentificationResultBasicPersonalInformation jPKICTIdentificationResultBasicPersonalInformation = null;
        String str = null;
        JPKIIdentificationResultReasonResponse jPKIIdentificationResultReasonResponse = null;
        JPKICTIdentificationResultTrail jPKICTIdentificationResultTrail = null;
        int i = -1;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                result = (JPKICTIdentificationResult.Result) this.resultAdapter.a(reader);
                if (result == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("result", "result", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                jPKICTIdentificationResultBasicPersonalInformation = (JPKICTIdentificationResultBasicPersonalInformation) this.nullableJPKICTIdentificationResultBasicPersonalInformationAdapter.a(reader);
                i &= -3;
            } else if (iP == 2) {
                str = (String) this.nullableStringAdapter.a(reader);
                i &= -5;
            } else if (iP == 3) {
                jPKIIdentificationResultReasonResponse = (JPKIIdentificationResultReasonResponse) this.nullableJPKIIdentificationResultReasonResponseAdapter.a(reader);
                i &= -9;
            } else if (iP == 4) {
                jPKICTIdentificationResultTrail = (JPKICTIdentificationResultTrail) this.nullableJPKICTIdentificationResultTrailAdapter.a(reader);
                i &= -17;
            }
        }
        reader.h();
        if (i == -31) {
            JPKICTIdentificationResultTrail jPKICTIdentificationResultTrail2 = jPKICTIdentificationResultTrail;
            JPKIIdentificationResultReasonResponse jPKIIdentificationResultReasonResponse2 = jPKIIdentificationResultReasonResponse;
            String str2 = str;
            JPKICTIdentificationResultBasicPersonalInformation jPKICTIdentificationResultBasicPersonalInformation2 = jPKICTIdentificationResultBasicPersonalInformation;
            JPKICTIdentificationResult.Result result2 = result;
            if (result2 != null) {
                return new JPKICTIdentificationResult(result2, jPKICTIdentificationResultBasicPersonalInformation2, str2, jPKIIdentificationResultReasonResponse2, jPKICTIdentificationResultTrail2);
            }
            JsonDataException jsonDataExceptionE = l1m.b.e("result", "result", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        JPKICTIdentificationResultTrail jPKICTIdentificationResultTrail3 = jPKICTIdentificationResultTrail;
        JPKIIdentificationResultReasonResponse jPKIIdentificationResultReasonResponse3 = jPKIIdentificationResultReasonResponse;
        String str3 = str;
        JPKICTIdentificationResultBasicPersonalInformation jPKICTIdentificationResultBasicPersonalInformation3 = jPKICTIdentificationResultBasicPersonalInformation;
        JPKICTIdentificationResult.Result result3 = result;
        Constructor<JPKICTIdentificationResult> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = JPKICTIdentificationResult.class.getDeclaredConstructor(JPKICTIdentificationResult.Result.class, JPKICTIdentificationResultBasicPersonalInformation.class, String.class, JPKIIdentificationResultReasonResponse.class, JPKICTIdentificationResultTrail.class, Integer.TYPE, l1m.b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (result3 != null) {
            JPKICTIdentificationResult jPKICTIdentificationResultNewInstance = declaredConstructor.newInstance(result3, jPKICTIdentificationResultBasicPersonalInformation3, str3, jPKIIdentificationResultReasonResponse3, jPKICTIdentificationResultTrail3, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(jPKICTIdentificationResultNewInstance, "newInstance(...)");
            return jPKICTIdentificationResultNewInstance;
        }
        JsonDataException jsonDataExceptionE2 = l1m.b.e("result", "result", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
        throw jsonDataExceptionE2;
    }

    public final void c(t writer, Object obj2) {
        JPKICTIdentificationResult jPKICTIdentificationResult = (JPKICTIdentificationResult) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (jPKICTIdentificationResult == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("result");
        this.resultAdapter.c(writer, jPKICTIdentificationResult.f107514a);
        writer.h("basic_personal_information");
        this.nullableJPKICTIdentificationResultBasicPersonalInformationAdapter.c(writer, jPKICTIdentificationResult.f107515b);
        writer.h("uid");
        this.nullableStringAdapter.c(writer, jPKICTIdentificationResult.f107516c);
        writer.h("reason");
        this.nullableJPKIIdentificationResultReasonResponseAdapter.c(writer, jPKICTIdentificationResult.d);
        writer.h("trail");
        this.nullableJPKICTIdentificationResultTrailAdapter.c(writer, jPKICTIdentificationResult.e);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(48, "GeneratedJsonAdapter(JPKICTIdentificationResult)");
    }
}
