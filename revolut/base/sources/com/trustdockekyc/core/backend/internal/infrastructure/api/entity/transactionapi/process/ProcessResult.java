package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process;

import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.FaceMatchingJapanTDResult;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTSubmittedDocument;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.JPKICTIdentificationResult;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0013BI\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJR\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessType;", "type", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessResultStatus;", "status", "", "completedAt", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;", "jpkiCt", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmittedDocument;", "icChipReaderJapanCt", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult;", "faceMatchingJapanTd", "<init>", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessType;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessResultStatus;Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmittedDocument;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult;)V", "copy", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessType;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessResultStatus;Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmittedDocument;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult;", "ProcessResultStatus", "ProcessType", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ProcessResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProcessType f107402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProcessResultStatus f107403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107404c;
    public final JPKICTIdentificationResult d;
    public final ICChipReaderJapanCTSubmittedDocument e;
    public final FaceMatchingJapanTDResult f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Ly2m/a;", "toModel", "()Ly2m/a;", "Companion", "com/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/a", "COMPLETED", "ABORTED", "ERROR", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProcessResultStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ProcessResultStatus[] $VALUES;

        @NotNull
        public static final a Companion;

        @i(name = "completed")
        public static final ProcessResultStatus COMPLETED = new ProcessResultStatus("COMPLETED", 0);

        @i(name = "aborted")
        public static final ProcessResultStatus ABORTED = new ProcessResultStatus("ABORTED", 1);

        @i(name = "error")
        public static final ProcessResultStatus ERROR = new ProcessResultStatus("ERROR", 2);

        private static final /* synthetic */ ProcessResultStatus[] $values() {
            return new ProcessResultStatus[]{COMPLETED, ABORTED, ERROR};
        }

        static {
            ProcessResultStatus[] processResultStatusArr$values = $values();
            $VALUES = processResultStatusArr$values;
            $ENTRIES = s.n(processResultStatusArr$values);
            Companion = new a();
        }

        private ProcessResultStatus(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ProcessResultStatus valueOf(String str) {
            return (ProcessResultStatus) Enum.valueOf(ProcessResultStatus.class, str);
        }

        public static ProcessResultStatus[] values() {
            return (ProcessResultStatus[]) $VALUES.clone();
        }

        @NotNull
        public final y2m.a toModel() {
            int i = b.f107405a[ordinal()];
            if (i == 1) {
                return y2m.a.COMPLETED;
            }
            if (i == 2) {
                return y2m.a.ABORTED;
            }
            if (i == 3) {
                return y2m.a.ERROR;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessType;", "", "<init>", "(Ljava/lang/String;I)V", "Ly2m/b;", "toModel", "()Ly2m/b;", "Companion", "com/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/c", "JPKI_CT", "IC_CHIP_READER_JAPAN_CT", "FACE_MATCHING_JAPAN_TD", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProcessType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ProcessType[] $VALUES;

        @NotNull
        public static final c Companion;

        @i(name = "jpki_ct")
        public static final ProcessType JPKI_CT = new ProcessType("JPKI_CT", 0);

        @i(name = "ic_chip_reader_japan_ct")
        public static final ProcessType IC_CHIP_READER_JAPAN_CT = new ProcessType("IC_CHIP_READER_JAPAN_CT", 1);

        @i(name = "face_matching_japan_td")
        public static final ProcessType FACE_MATCHING_JAPAN_TD = new ProcessType("FACE_MATCHING_JAPAN_TD", 2);

        private static final /* synthetic */ ProcessType[] $values() {
            return new ProcessType[]{JPKI_CT, IC_CHIP_READER_JAPAN_CT, FACE_MATCHING_JAPAN_TD};
        }

        static {
            ProcessType[] processTypeArr$values = $values();
            $VALUES = processTypeArr$values;
            $ENTRIES = s.n(processTypeArr$values);
            Companion = new c();
        }

        private ProcessType(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ProcessType valueOf(String str) {
            return (ProcessType) Enum.valueOf(ProcessType.class, str);
        }

        public static ProcessType[] values() {
            return (ProcessType[]) $VALUES.clone();
        }

        @NotNull
        public final y2m.b toModel() {
            int i = d.f107406a[ordinal()];
            if (i == 1) {
                return y2m.b.JPKI;
            }
            if (i == 2) {
                return y2m.b.IC_CHIP_READER_JAPAN;
            }
            if (i == 3) {
                return y2m.b.FACE_MATCHING_JAPAN;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public ProcessResult(@i(name = "type") @NotNull ProcessType type, @i(name = "status") @NotNull ProcessResultStatus status, @i(name = "completed_at") @NotNull String completedAt, @i(name = "jpki_ct") JPKICTIdentificationResult jPKICTIdentificationResult, @i(name = "ic_chip_reader_japan_ct") ICChipReaderJapanCTSubmittedDocument iCChipReaderJapanCTSubmittedDocument, @i(name = "face_matching_japan_td") FaceMatchingJapanTDResult faceMatchingJapanTDResult) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(completedAt, "completedAt");
        this.f107402a = type;
        this.f107403b = status;
        this.f107404c = completedAt;
        this.d = jPKICTIdentificationResult;
        this.e = iCChipReaderJapanCTSubmittedDocument;
        this.f = faceMatchingJapanTDResult;
    }

    @NotNull
    public final ProcessResult copy(@i(name = "type") @NotNull ProcessType type, @i(name = "status") @NotNull ProcessResultStatus status, @i(name = "completed_at") @NotNull String completedAt, @i(name = "jpki_ct") JPKICTIdentificationResult jpkiCt, @i(name = "ic_chip_reader_japan_ct") ICChipReaderJapanCTSubmittedDocument icChipReaderJapanCt, @i(name = "face_matching_japan_td") FaceMatchingJapanTDResult faceMatchingJapanTd) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(completedAt, "completedAt");
        return new ProcessResult(type, status, completedAt, jpkiCt, icChipReaderJapanCt, faceMatchingJapanTd);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProcessResult)) {
            return false;
        }
        ProcessResult processResult = (ProcessResult) obj2;
        return this.f107402a == processResult.f107402a && this.f107403b == processResult.f107403b && Intrinsics.f(this.f107404c, processResult.f107404c) && Intrinsics.f(this.d, processResult.d) && Intrinsics.f(this.e, processResult.e) && Intrinsics.f(this.f, processResult.f);
    }

    public final int hashCode() {
        int iA = w0.a(this.f107404c, (this.f107403b.hashCode() + (this.f107402a.hashCode() * 31)) * 31);
        JPKICTIdentificationResult jPKICTIdentificationResult = this.d;
        int iHashCode = (iA + (jPKICTIdentificationResult == null ? 0 : jPKICTIdentificationResult.hashCode())) * 31;
        ICChipReaderJapanCTSubmittedDocument iCChipReaderJapanCTSubmittedDocument = this.e;
        int iHashCode2 = (iHashCode + (iCChipReaderJapanCTSubmittedDocument == null ? 0 : iCChipReaderJapanCTSubmittedDocument.hashCode())) * 31;
        FaceMatchingJapanTDResult faceMatchingJapanTDResult = this.f;
        return iHashCode2 + (faceMatchingJapanTDResult != null ? faceMatchingJapanTDResult.hashCode() : 0);
    }

    public final String toString() {
        return "ProcessResult(type=" + this.f107402a + ", status=" + this.f107403b + ", completedAt=" + this.f107404c + ", jpkiCt=" + this.d + ", icChipReaderJapanCt=" + this.e + ", faceMatchingJapanTd=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ ProcessResult(ProcessType processType, ProcessResultStatus processResultStatus, String str, JPKICTIdentificationResult jPKICTIdentificationResult, ICChipReaderJapanCTSubmittedDocument iCChipReaderJapanCTSubmittedDocument, FaceMatchingJapanTDResult faceMatchingJapanTDResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(processType, processResultStatus, str, (i & 8) != 0 ? null : jPKICTIdentificationResult, (i & 16) != 0 ? null : iCChipReaderJapanCTSubmittedDocument, (i & 32) != 0 ? null : faceMatchingJapanTDResult);
    }
}
