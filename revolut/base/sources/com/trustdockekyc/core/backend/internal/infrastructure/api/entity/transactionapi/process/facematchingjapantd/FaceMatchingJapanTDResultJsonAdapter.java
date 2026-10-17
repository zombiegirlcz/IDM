package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import com.squareup.moshi.JsonDataException;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.FaceMatchingJapanTDResult;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResultJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult$Result;", "resultAdapter", "Lk1m/l;", "", "floatAdapter", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult$RandomShooting;", "nullableListOfRandomShootingAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceMatchingJapanTDResultJsonAdapter extends l {
    private volatile Constructor<FaceMatchingJapanTDResult> constructorRef;

    @NotNull
    private final l floatAdapter;

    @NotNull
    private final l nullableListOfRandomShootingAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l resultAdapter;

    public FaceMatchingJapanTDResultJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"result", "similarity", "random_shooting"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.resultAdapter = n.a(moshi, FaceMatchingJapanTDResult.Result.class, "result");
        this.floatAdapter = n.a(moshi, Float.TYPE, "similarity");
        l lVarB = moshi.b(l0.d(new Type[]{FaceMatchingJapanTDResult.RandomShooting.class}), h0.f322473a, "randomShooting");
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        this.nullableListOfRandomShootingAdapter = lVarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        FaceMatchingJapanTDResult.Result result = null;
        Float f = null;
        List list = null;
        int i = -1;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                result = (FaceMatchingJapanTDResult.Result) this.resultAdapter.a(reader);
                if (result == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("result", "result", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                f = (Float) this.floatAdapter.a(reader);
                if (f == null) {
                    JsonDataException jsonDataExceptionJ2 = l1m.b.j("similarity", "similarity", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
            } else if (iP == 2) {
                list = (List) this.nullableListOfRandomShootingAdapter.a(reader);
                i = -5;
            }
        }
        reader.h();
        if (i == -5) {
            if (result == null) {
                JsonDataException jsonDataExceptionE = l1m.b.e("result", "result", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                throw jsonDataExceptionE;
            }
            if (f != null) {
                return new FaceMatchingJapanTDResult(result, f.floatValue(), list);
            }
            JsonDataException jsonDataExceptionE2 = l1m.b.e("similarity", "similarity", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
            throw jsonDataExceptionE2;
        }
        Constructor<FaceMatchingJapanTDResult> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = FaceMatchingJapanTDResult.class.getDeclaredConstructor(FaceMatchingJapanTDResult.Result.class, Float.TYPE, List.class, Integer.TYPE, l1m.b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (result == null) {
            JsonDataException jsonDataExceptionE3 = l1m.b.e("result", "result", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
            throw jsonDataExceptionE3;
        }
        if (f != null) {
            FaceMatchingJapanTDResult faceMatchingJapanTDResultNewInstance = declaredConstructor.newInstance(result, f, list, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(faceMatchingJapanTDResultNewInstance, "newInstance(...)");
            return faceMatchingJapanTDResultNewInstance;
        }
        JsonDataException jsonDataExceptionE4 = l1m.b.e("similarity", "similarity", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
        throw jsonDataExceptionE4;
    }

    public final void c(t writer, Object obj2) {
        FaceMatchingJapanTDResult faceMatchingJapanTDResult = (FaceMatchingJapanTDResult) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (faceMatchingJapanTDResult == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("result");
        this.resultAdapter.c(writer, faceMatchingJapanTDResult.f107407a);
        writer.h("similarity");
        this.floatAdapter.c(writer, Float.valueOf(faceMatchingJapanTDResult.f107408b));
        writer.h("random_shooting");
        this.nullableListOfRandomShootingAdapter.c(writer, faceMatchingJapanTDResult.f107409c);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(47, "GeneratedJsonAdapter(FaceMatchingJapanTDResult)");
    }
}
