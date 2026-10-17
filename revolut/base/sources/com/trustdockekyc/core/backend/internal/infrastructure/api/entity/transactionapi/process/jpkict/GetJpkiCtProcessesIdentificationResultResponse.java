package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\nB\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesIdentificationResultResponse;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesIdentificationResultResponse$JPKICTIdentificationResultStatus;", "status", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;", "result", "<init>", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesIdentificationResultResponse$JPKICTIdentificationResultStatus;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;)V", "copy", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesIdentificationResultResponse$JPKICTIdentificationResultStatus;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesIdentificationResultResponse;", "JPKICTIdentificationResultStatus", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetJpkiCtProcessesIdentificationResultResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JPKICTIdentificationResultStatus f107506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JPKICTIdentificationResult f107507b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesIdentificationResultResponse$JPKICTIdentificationResultStatus;", "", "(Ljava/lang/String;I)V", "COMPLETED", "PENDING", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class JPKICTIdentificationResultStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ JPKICTIdentificationResultStatus[] $VALUES;

        @i(name = "completed")
        public static final JPKICTIdentificationResultStatus COMPLETED = new JPKICTIdentificationResultStatus("COMPLETED", 0);

        @i(name = "pending")
        public static final JPKICTIdentificationResultStatus PENDING = new JPKICTIdentificationResultStatus("PENDING", 1);

        private static final /* synthetic */ JPKICTIdentificationResultStatus[] $values() {
            return new JPKICTIdentificationResultStatus[]{COMPLETED, PENDING};
        }

        static {
            JPKICTIdentificationResultStatus[] jPKICTIdentificationResultStatusArr$values = $values();
            $VALUES = jPKICTIdentificationResultStatusArr$values;
            $ENTRIES = s.n(jPKICTIdentificationResultStatusArr$values);
        }

        private JPKICTIdentificationResultStatus(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static JPKICTIdentificationResultStatus valueOf(String str) {
            return (JPKICTIdentificationResultStatus) Enum.valueOf(JPKICTIdentificationResultStatus.class, str);
        }

        public static JPKICTIdentificationResultStatus[] values() {
            return (JPKICTIdentificationResultStatus[]) $VALUES.clone();
        }
    }

    public GetJpkiCtProcessesIdentificationResultResponse(@i(name = "status") @NotNull JPKICTIdentificationResultStatus status, @i(name = "result") JPKICTIdentificationResult jPKICTIdentificationResult) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f107506a = status;
        this.f107507b = jPKICTIdentificationResult;
    }

    @NotNull
    public final GetJpkiCtProcessesIdentificationResultResponse copy(@i(name = "status") @NotNull JPKICTIdentificationResultStatus status, @i(name = "result") JPKICTIdentificationResult result) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new GetJpkiCtProcessesIdentificationResultResponse(status, result);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GetJpkiCtProcessesIdentificationResultResponse)) {
            return false;
        }
        GetJpkiCtProcessesIdentificationResultResponse getJpkiCtProcessesIdentificationResultResponse = (GetJpkiCtProcessesIdentificationResultResponse) obj2;
        return this.f107506a == getJpkiCtProcessesIdentificationResultResponse.f107506a && Intrinsics.f(this.f107507b, getJpkiCtProcessesIdentificationResultResponse.f107507b);
    }

    public final int hashCode() {
        int iHashCode = this.f107506a.hashCode() * 31;
        JPKICTIdentificationResult jPKICTIdentificationResult = this.f107507b;
        return iHashCode + (jPKICTIdentificationResult == null ? 0 : jPKICTIdentificationResult.hashCode());
    }

    public final String toString() {
        return "GetJpkiCtProcessesIdentificationResultResponse(status=" + this.f107506a + ", result=" + this.f107507b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ GetJpkiCtProcessesIdentificationResultResponse(JPKICTIdentificationResultStatus jPKICTIdentificationResultStatus, JPKICTIdentificationResult jPKICTIdentificationResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jPKICTIdentificationResultStatus, (i & 2) != 0 ? null : jPKICTIdentificationResult);
    }
}
