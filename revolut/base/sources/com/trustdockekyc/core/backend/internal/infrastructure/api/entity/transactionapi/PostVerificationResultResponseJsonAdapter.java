package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

import com.squareup.moshi.JsonDataException;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostVerificationResultResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.ProcessResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
import ngm.n;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponseJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultStatus;", "verificationResultStatusAdapter", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult;", "listOfProcessResultAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultReason;", "nullableVerificationResultReasonAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PostVerificationResultResponseJsonAdapter extends l {
    private volatile Constructor<PostVerificationResultResponse> constructorRef;

    @NotNull
    private final l listOfProcessResultAdapter;

    @NotNull
    private final l nullableVerificationResultReasonAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    @NotNull
    private final l verificationResultStatusAdapter;

    public PostVerificationResultResponseJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"id", "status", "process_results", "reason"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "id");
        this.verificationResultStatusAdapter = n.a(moshi, PostVerificationResultResponse.VerificationResultStatus.class, "status");
        l lVarB = moshi.b(l0.d(new Type[]{ProcessResult.class}), h0.f322473a, "processResults");
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        this.listOfProcessResultAdapter = lVarB;
        this.nullableVerificationResultReasonAdapter = n.a(moshi, PostVerificationResultResponse.VerificationResultReason.class, "reason");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        PostVerificationResultResponse.VerificationResultStatus verificationResultStatus = null;
        List list = null;
        PostVerificationResultResponse.VerificationResultReason verificationResultReason = null;
        int i = -1;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.stringAdapter.a(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("id", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                verificationResultStatus = (PostVerificationResultResponse.VerificationResultStatus) this.verificationResultStatusAdapter.a(reader);
                if (verificationResultStatus == null) {
                    JsonDataException jsonDataExceptionJ2 = l1m.b.j("status", "status", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
            } else if (iP == 2) {
                list = (List) this.listOfProcessResultAdapter.a(reader);
                if (list == null) {
                    JsonDataException jsonDataExceptionJ3 = l1m.b.j("processResults", "process_results", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                    throw jsonDataExceptionJ3;
                }
            } else if (iP == 3) {
                verificationResultReason = (PostVerificationResultResponse.VerificationResultReason) this.nullableVerificationResultReasonAdapter.a(reader);
                i = -9;
            }
        }
        reader.h();
        if (i == -9) {
            if (str == null) {
                JsonDataException jsonDataExceptionE = l1m.b.e("id", "id", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                throw jsonDataExceptionE;
            }
            if (verificationResultStatus == null) {
                JsonDataException jsonDataExceptionE2 = l1m.b.e("status", "status", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
                throw jsonDataExceptionE2;
            }
            if (list != null) {
                return new PostVerificationResultResponse(str, verificationResultStatus, list, verificationResultReason);
            }
            JsonDataException jsonDataExceptionE3 = l1m.b.e("processResults", "process_results", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
            throw jsonDataExceptionE3;
        }
        Constructor<PostVerificationResultResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = PostVerificationResultResponse.class.getDeclaredConstructor(String.class, PostVerificationResultResponse.VerificationResultStatus.class, List.class, PostVerificationResultResponse.VerificationResultReason.class, Integer.TYPE, l1m.b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        Constructor<PostVerificationResultResponse> constructor = declaredConstructor;
        if (str == null) {
            JsonDataException jsonDataExceptionE4 = l1m.b.e("id", "id", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
            throw jsonDataExceptionE4;
        }
        if (verificationResultStatus == null) {
            JsonDataException jsonDataExceptionE5 = l1m.b.e("status", "status", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE5, "missingProperty(...)");
            throw jsonDataExceptionE5;
        }
        if (list != null) {
            PostVerificationResultResponse postVerificationResultResponseNewInstance = constructor.newInstance(str, verificationResultStatus, list, verificationResultReason, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(postVerificationResultResponseNewInstance, "newInstance(...)");
            return postVerificationResultResponseNewInstance;
        }
        JsonDataException jsonDataExceptionE6 = l1m.b.e("processResults", "process_results", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE6, "missingProperty(...)");
        throw jsonDataExceptionE6;
    }

    public final void c(t writer, Object obj2) {
        PostVerificationResultResponse postVerificationResultResponse = (PostVerificationResultResponse) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (postVerificationResultResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("id");
        this.stringAdapter.c(writer, postVerificationResultResponse.f107395a);
        writer.h("status");
        this.verificationResultStatusAdapter.c(writer, postVerificationResultResponse.f107396b);
        writer.h("process_results");
        this.listOfProcessResultAdapter.c(writer, postVerificationResultResponse.f107397c);
        writer.h("reason");
        this.nullableVerificationResultReasonAdapter.c(writer, postVerificationResultResponse.d);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(52, "GeneratedJsonAdapter(PostVerificationResultResponse)");
    }
}
