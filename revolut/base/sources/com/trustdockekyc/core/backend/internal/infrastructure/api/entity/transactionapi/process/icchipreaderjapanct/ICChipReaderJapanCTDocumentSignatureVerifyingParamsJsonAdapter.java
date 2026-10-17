package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import k1m.e0;
import k1m.l;
import k1m.o;
import k1m.q;
import k1m.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1m.b;
import ngm.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSignatureVerifyingParamsJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSignatureVerifyingParams;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTDocumentSignatureVerifyingParamsJsonAdapter extends l {
    private volatile Constructor<ICChipReaderJapanCTDocumentSignatureVerifyingParams> constructorRef;

    @NotNull
    private final l nullableStringAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public ICChipReaderJapanCTDocumentSignatureVerifyingParamsJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"signature", "verifying_params", "hash"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "signature");
        this.nullableStringAdapter = n.a(moshi, String.class, "hash");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.stringAdapter.a(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionJ = b.j("signature", "signature", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                str2 = (String) this.stringAdapter.a(reader);
                if (str2 == null) {
                    JsonDataException jsonDataExceptionJ2 = b.j("verifyingParams", "verifying_params", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
            } else if (iP == 2) {
                str3 = (String) this.nullableStringAdapter.a(reader);
                i = -5;
            }
        }
        reader.h();
        if (i == -5) {
            if (str == null) {
                JsonDataException jsonDataExceptionE = b.e("signature", "signature", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                throw jsonDataExceptionE;
            }
            if (str2 != null) {
                return new ICChipReaderJapanCTDocumentSignatureVerifyingParams(str, str2, str3);
            }
            JsonDataException jsonDataExceptionE2 = b.e("verifyingParams", "verifying_params", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
            throw jsonDataExceptionE2;
        }
        Constructor<ICChipReaderJapanCTDocumentSignatureVerifyingParams> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ICChipReaderJapanCTDocumentSignatureVerifyingParams.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (str == null) {
            JsonDataException jsonDataExceptionE3 = b.e("signature", "signature", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
            throw jsonDataExceptionE3;
        }
        if (str2 != null) {
            ICChipReaderJapanCTDocumentSignatureVerifyingParams iCChipReaderJapanCTDocumentSignatureVerifyingParamsNewInstance = declaredConstructor.newInstance(str, str2, str3, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(iCChipReaderJapanCTDocumentSignatureVerifyingParamsNewInstance, "newInstance(...)");
            return iCChipReaderJapanCTDocumentSignatureVerifyingParamsNewInstance;
        }
        JsonDataException jsonDataExceptionE4 = b.e("verifyingParams", "verifying_params", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
        throw jsonDataExceptionE4;
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTDocumentSignatureVerifyingParams iCChipReaderJapanCTDocumentSignatureVerifyingParams = (ICChipReaderJapanCTDocumentSignatureVerifyingParams) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTDocumentSignatureVerifyingParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("signature");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentSignatureVerifyingParams.f107449a);
        writer.h("verifying_params");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentSignatureVerifyingParams.f107450b);
        writer.h("hash");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTDocumentSignatureVerifyingParams.f107451c);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(73, "GeneratedJsonAdapter(ICChipReaderJapanCTDocumentSignatureVerifyingParams)");
    }
}
