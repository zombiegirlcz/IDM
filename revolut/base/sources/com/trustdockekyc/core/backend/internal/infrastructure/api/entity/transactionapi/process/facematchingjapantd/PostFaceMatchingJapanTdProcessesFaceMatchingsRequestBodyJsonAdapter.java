package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import com.squareup.moshi.JsonDataException;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBodyJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "", "listOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBodyJsonAdapter extends l {
    private volatile Constructor<PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody> constructorRef;

    @NotNull
    private final l listOfStringAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBodyJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"face", "randomness"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "face");
        l lVarB = moshi.b(l0.d(new Type[]{String.class}), h0.f322473a, "randomness");
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        this.listOfStringAdapter = lVarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        List list = null;
        int i = -1;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.stringAdapter.a(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("face", "face", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                list = (List) this.listOfStringAdapter.a(reader);
                if (list == null) {
                    JsonDataException jsonDataExceptionJ2 = l1m.b.j("randomness", "randomness", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
                i = -3;
            } else {
                continue;
            }
        }
        reader.h();
        if (i == -3) {
            if (str != null) {
                Intrinsics.i(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                return new PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody(str, list);
            }
            JsonDataException jsonDataExceptionE = l1m.b.e("face", "face", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        Constructor<PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody.class.getDeclaredConstructor(String.class, List.class, Integer.TYPE, l1m.b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (str != null) {
            PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody postFaceMatchingJapanTdProcessesFaceMatchingsRequestBodyNewInstance = declaredConstructor.newInstance(str, list, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(postFaceMatchingJapanTdProcessesFaceMatchingsRequestBodyNewInstance, "newInstance(...)");
            return postFaceMatchingJapanTdProcessesFaceMatchingsRequestBodyNewInstance;
        }
        JsonDataException jsonDataExceptionE2 = l1m.b.e("face", "face", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
        throw jsonDataExceptionE2;
    }

    public final void c(t writer, Object obj2) {
        PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody postFaceMatchingJapanTdProcessesFaceMatchingsRequestBody = (PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (postFaceMatchingJapanTdProcessesFaceMatchingsRequestBody == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("face");
        this.stringAdapter.c(writer, postFaceMatchingJapanTdProcessesFaceMatchingsRequestBody.f107413a);
        writer.h("randomness");
        this.listOfStringAdapter.c(writer, postFaceMatchingJapanTdProcessesFaceMatchingsRequestBody.f107414b);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(78, "GeneratedJsonAdapter(PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody)");
    }
}
