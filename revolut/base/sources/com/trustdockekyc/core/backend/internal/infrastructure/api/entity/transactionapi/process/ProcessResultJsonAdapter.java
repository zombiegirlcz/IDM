package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process;

import com.squareup.moshi.JsonDataException;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.ProcessResult;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.FaceMatchingJapanTDResult;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTSubmittedDocument;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResultJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessType;", "processTypeAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessResultStatus;", "processResultStatusAdapter", "", "stringAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;", "nullableJPKICTIdentificationResultAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmittedDocument;", "nullableICChipReaderJapanCTSubmittedDocumentAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult;", "nullableFaceMatchingJapanTDResultAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProcessResultJsonAdapter extends l {
    private volatile Constructor<ProcessResult> constructorRef;

    @NotNull
    private final l nullableFaceMatchingJapanTDResultAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTSubmittedDocumentAdapter;

    @NotNull
    private final l nullableJPKICTIdentificationResultAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l processResultStatusAdapter;

    @NotNull
    private final l processTypeAdapter;

    @NotNull
    private final l stringAdapter;

    public ProcessResultJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"type", "status", "completed_at", "jpki_ct", "ic_chip_reader_japan_ct", "face_matching_japan_td"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.processTypeAdapter = n.a(moshi, ProcessResult.ProcessType.class, "type");
        this.processResultStatusAdapter = n.a(moshi, ProcessResult.ProcessResultStatus.class, "status");
        this.stringAdapter = n.a(moshi, String.class, "completedAt");
        this.nullableJPKICTIdentificationResultAdapter = n.a(moshi, JPKICTIdentificationResult.class, "jpkiCt");
        this.nullableICChipReaderJapanCTSubmittedDocumentAdapter = n.a(moshi, ICChipReaderJapanCTSubmittedDocument.class, "icChipReaderJapanCt");
        this.nullableFaceMatchingJapanTDResultAdapter = n.a(moshi, FaceMatchingJapanTDResult.class, "faceMatchingJapanTd");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        int i = -1;
        ProcessResult.ProcessType processType = null;
        ProcessResult.ProcessResultStatus processResultStatus = null;
        String str = null;
        JPKICTIdentificationResult jPKICTIdentificationResult = null;
        ICChipReaderJapanCTSubmittedDocument iCChipReaderJapanCTSubmittedDocument = null;
        FaceMatchingJapanTDResult faceMatchingJapanTDResult = null;
        while (reader.i()) {
            switch (reader.p(this.options)) {
                case -1:
                    reader.q();
                    reader.r();
                    break;
                case 0:
                    processType = (ProcessResult.ProcessType) this.processTypeAdapter.a(reader);
                    if (processType == null) {
                        JsonDataException jsonDataExceptionJ = l1m.b.j("type", "type", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                        throw jsonDataExceptionJ;
                    }
                    break;
                    break;
                case 1:
                    processResultStatus = (ProcessResult.ProcessResultStatus) this.processResultStatusAdapter.a(reader);
                    if (processResultStatus == null) {
                        JsonDataException jsonDataExceptionJ2 = l1m.b.j("status", "status", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                        throw jsonDataExceptionJ2;
                    }
                    break;
                    break;
                case 2:
                    str = (String) this.stringAdapter.a(reader);
                    if (str == null) {
                        JsonDataException jsonDataExceptionJ3 = l1m.b.j("completedAt", "completed_at", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                        throw jsonDataExceptionJ3;
                    }
                    break;
                    break;
                case 3:
                    jPKICTIdentificationResult = (JPKICTIdentificationResult) this.nullableJPKICTIdentificationResultAdapter.a(reader);
                    i &= -9;
                    break;
                case 4:
                    iCChipReaderJapanCTSubmittedDocument = (ICChipReaderJapanCTSubmittedDocument) this.nullableICChipReaderJapanCTSubmittedDocumentAdapter.a(reader);
                    i &= -17;
                    break;
                case 5:
                    faceMatchingJapanTDResult = (FaceMatchingJapanTDResult) this.nullableFaceMatchingJapanTDResultAdapter.a(reader);
                    i &= -33;
                    break;
            }
        }
        reader.h();
        if (i == -57) {
            FaceMatchingJapanTDResult faceMatchingJapanTDResult2 = faceMatchingJapanTDResult;
            ICChipReaderJapanCTSubmittedDocument iCChipReaderJapanCTSubmittedDocument2 = iCChipReaderJapanCTSubmittedDocument;
            JPKICTIdentificationResult jPKICTIdentificationResult2 = jPKICTIdentificationResult;
            String str2 = str;
            ProcessResult.ProcessResultStatus processResultStatus2 = processResultStatus;
            ProcessResult.ProcessType processType2 = processType;
            if (processType2 == null) {
                JsonDataException jsonDataExceptionE = l1m.b.e("type", "type", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                throw jsonDataExceptionE;
            }
            if (processResultStatus2 == null) {
                JsonDataException jsonDataExceptionE2 = l1m.b.e("status", "status", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
                throw jsonDataExceptionE2;
            }
            if (str2 != null) {
                return new ProcessResult(processType2, processResultStatus2, str2, jPKICTIdentificationResult2, iCChipReaderJapanCTSubmittedDocument2, faceMatchingJapanTDResult2);
            }
            JsonDataException jsonDataExceptionE3 = l1m.b.e("completedAt", "completed_at", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
            throw jsonDataExceptionE3;
        }
        FaceMatchingJapanTDResult faceMatchingJapanTDResult3 = faceMatchingJapanTDResult;
        ICChipReaderJapanCTSubmittedDocument iCChipReaderJapanCTSubmittedDocument3 = iCChipReaderJapanCTSubmittedDocument;
        JPKICTIdentificationResult jPKICTIdentificationResult3 = jPKICTIdentificationResult;
        String str3 = str;
        ProcessResult.ProcessResultStatus processResultStatus3 = processResultStatus;
        ProcessResult.ProcessType processType3 = processType;
        Constructor<ProcessResult> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ProcessResult.class.getDeclaredConstructor(ProcessResult.ProcessType.class, ProcessResult.ProcessResultStatus.class, String.class, JPKICTIdentificationResult.class, ICChipReaderJapanCTSubmittedDocument.class, FaceMatchingJapanTDResult.class, Integer.TYPE, l1m.b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        Constructor<ProcessResult> constructor = declaredConstructor;
        if (processType3 == null) {
            JsonDataException jsonDataExceptionE4 = l1m.b.e("type", "type", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
            throw jsonDataExceptionE4;
        }
        if (processResultStatus3 == null) {
            JsonDataException jsonDataExceptionE5 = l1m.b.e("status", "status", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE5, "missingProperty(...)");
            throw jsonDataExceptionE5;
        }
        if (str3 != null) {
            ProcessResult processResultNewInstance = constructor.newInstance(processType3, processResultStatus3, str3, jPKICTIdentificationResult3, iCChipReaderJapanCTSubmittedDocument3, faceMatchingJapanTDResult3, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(processResultNewInstance, "newInstance(...)");
            return processResultNewInstance;
        }
        JsonDataException jsonDataExceptionE6 = l1m.b.e("completedAt", "completed_at", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE6, "missingProperty(...)");
        throw jsonDataExceptionE6;
    }

    public final void c(t writer, Object obj2) {
        ProcessResult processResult = (ProcessResult) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (processResult == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("type");
        this.processTypeAdapter.c(writer, processResult.f107402a);
        writer.h("status");
        this.processResultStatusAdapter.c(writer, processResult.f107403b);
        writer.h("completed_at");
        this.stringAdapter.c(writer, processResult.f107404c);
        writer.h("jpki_ct");
        this.nullableJPKICTIdentificationResultAdapter.c(writer, processResult.d);
        writer.h("ic_chip_reader_japan_ct");
        this.nullableICChipReaderJapanCTSubmittedDocumentAdapter.c(writer, processResult.e);
        writer.h("face_matching_japan_td");
        this.nullableFaceMatchingJapanTDResultAdapter.c(writer, processResult.f);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(35, "GeneratedJsonAdapter(ProcessResult)");
    }
}
