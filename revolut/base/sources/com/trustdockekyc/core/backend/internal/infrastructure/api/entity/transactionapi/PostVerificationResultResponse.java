package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.ProcessResult;
import java.util.List;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse;", "", "", "id", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultStatus;", "status", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult;", "processResults", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultReason;", "reason", "<init>", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultStatus;Ljava/util/List;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultReason;)V", "copy", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultStatus;Ljava/util/List;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultReason;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse;", "VerificationResultReason", "VerificationResultStatus", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostVerificationResultResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VerificationResultStatus f107396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f107397c;
    public final VerificationResultReason d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultReason;", "", "<init>", "(Ljava/lang/String;I)V", "Lx2m/a;", "toModel", "()Lx2m/a;", "Companion", "com/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/b", "MYNUMBER_CARD_LOCKED", "MISMATCHED_MYNUMBER_CARD", "API_ERROR", "IN_MAINTENANCE", "NETWORK_ERROR", "NFC_NOT_AVAILABLE", "AUTHENTICATION_FAILURE", "INVALID_PARAMS", "INVALID_PROJECT_ID", "INVALID_PACKAGE_ID", "INVALID_TBS_RAW_DATA", "INVALID_TBS_DATA_TEMPLATE", "INVALID_BASE_URL", "CERTIFICATE_EXPIRED", "SIGNATURE_INVALID", "CERTIFICATE_INVALID", "CERTIFICATE_REVOKED", "CAMERA_ERROR", "CAMERA_NOT_AUTHORIZED", "DRIVERS_LICENSE_LOCKED", "NO_CERTIFICATE", "NO_VIDEO_DEVICE", "UNDER_16YEARS", "UNKNOWN_ERROR", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VerificationResultReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VerificationResultReason[] $VALUES;

        @NotNull
        public static final b Companion;

        @i(name = "mynumber_card_locked")
        public static final VerificationResultReason MYNUMBER_CARD_LOCKED = new VerificationResultReason("MYNUMBER_CARD_LOCKED", 0);

        @i(name = "mismatched_mynumber_card")
        public static final VerificationResultReason MISMATCHED_MYNUMBER_CARD = new VerificationResultReason("MISMATCHED_MYNUMBER_CARD", 1);

        @i(name = "api_error")
        public static final VerificationResultReason API_ERROR = new VerificationResultReason("API_ERROR", 2);

        @i(name = "in_maintenance")
        public static final VerificationResultReason IN_MAINTENANCE = new VerificationResultReason("IN_MAINTENANCE", 3);

        @i(name = "network_error")
        public static final VerificationResultReason NETWORK_ERROR = new VerificationResultReason("NETWORK_ERROR", 4);

        @i(name = "nfc_not_available")
        public static final VerificationResultReason NFC_NOT_AVAILABLE = new VerificationResultReason("NFC_NOT_AVAILABLE", 5);

        @i(name = "authentication_failure")
        public static final VerificationResultReason AUTHENTICATION_FAILURE = new VerificationResultReason("AUTHENTICATION_FAILURE", 6);

        @i(name = "invalid_params")
        public static final VerificationResultReason INVALID_PARAMS = new VerificationResultReason("INVALID_PARAMS", 7);

        @i(name = "invalid_project_id")
        public static final VerificationResultReason INVALID_PROJECT_ID = new VerificationResultReason("INVALID_PROJECT_ID", 8);

        @i(name = "invalid_package_id")
        public static final VerificationResultReason INVALID_PACKAGE_ID = new VerificationResultReason("INVALID_PACKAGE_ID", 9);

        @i(name = "invalid_tbs_raw_data")
        public static final VerificationResultReason INVALID_TBS_RAW_DATA = new VerificationResultReason("INVALID_TBS_RAW_DATA", 10);

        @i(name = "invalid_tbs_data_template")
        public static final VerificationResultReason INVALID_TBS_DATA_TEMPLATE = new VerificationResultReason("INVALID_TBS_DATA_TEMPLATE", 11);

        @i(name = "invalid_base_url")
        public static final VerificationResultReason INVALID_BASE_URL = new VerificationResultReason("INVALID_BASE_URL", 12);

        @i(name = "certificate_expired")
        public static final VerificationResultReason CERTIFICATE_EXPIRED = new VerificationResultReason("CERTIFICATE_EXPIRED", 13);

        @i(name = "signature_invalid")
        public static final VerificationResultReason SIGNATURE_INVALID = new VerificationResultReason("SIGNATURE_INVALID", 14);

        @i(name = "certificate_invalid")
        public static final VerificationResultReason CERTIFICATE_INVALID = new VerificationResultReason("CERTIFICATE_INVALID", 15);

        @i(name = "certificate_revoked")
        public static final VerificationResultReason CERTIFICATE_REVOKED = new VerificationResultReason("CERTIFICATE_REVOKED", 16);

        @i(name = "camera_error")
        public static final VerificationResultReason CAMERA_ERROR = new VerificationResultReason("CAMERA_ERROR", 17);

        @i(name = "camera_not_authorized")
        public static final VerificationResultReason CAMERA_NOT_AUTHORIZED = new VerificationResultReason("CAMERA_NOT_AUTHORIZED", 18);

        @i(name = "drivers_lisence_locked")
        public static final VerificationResultReason DRIVERS_LICENSE_LOCKED = new VerificationResultReason("DRIVERS_LICENSE_LOCKED", 19);

        @i(name = "no_certificate")
        public static final VerificationResultReason NO_CERTIFICATE = new VerificationResultReason("NO_CERTIFICATE", 20);

        @i(name = "no_video_device")
        public static final VerificationResultReason NO_VIDEO_DEVICE = new VerificationResultReason("NO_VIDEO_DEVICE", 21);

        @i(name = "under_16_years_of_age")
        public static final VerificationResultReason UNDER_16YEARS = new VerificationResultReason("UNDER_16YEARS", 22);

        @i(name = "unknown_error")
        public static final VerificationResultReason UNKNOWN_ERROR = new VerificationResultReason("UNKNOWN_ERROR", 23);

        private static final /* synthetic */ VerificationResultReason[] $values() {
            return new VerificationResultReason[]{MYNUMBER_CARD_LOCKED, MISMATCHED_MYNUMBER_CARD, API_ERROR, IN_MAINTENANCE, NETWORK_ERROR, NFC_NOT_AVAILABLE, AUTHENTICATION_FAILURE, INVALID_PARAMS, INVALID_PROJECT_ID, INVALID_PACKAGE_ID, INVALID_TBS_RAW_DATA, INVALID_TBS_DATA_TEMPLATE, INVALID_BASE_URL, CERTIFICATE_EXPIRED, SIGNATURE_INVALID, CERTIFICATE_INVALID, CERTIFICATE_REVOKED, CAMERA_ERROR, CAMERA_NOT_AUTHORIZED, DRIVERS_LICENSE_LOCKED, NO_CERTIFICATE, NO_VIDEO_DEVICE, UNDER_16YEARS, UNKNOWN_ERROR};
        }

        static {
            VerificationResultReason[] verificationResultReasonArr$values = $values();
            $VALUES = verificationResultReasonArr$values;
            $ENTRIES = s.n(verificationResultReasonArr$values);
            Companion = new b();
        }

        private VerificationResultReason(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static VerificationResultReason valueOf(String str) {
            return (VerificationResultReason) Enum.valueOf(VerificationResultReason.class, str);
        }

        public static VerificationResultReason[] values() {
            return (VerificationResultReason[]) $VALUES.clone();
        }

        @NotNull
        public final x2m.a toModel() {
            switch (c.f107399a[ordinal()]) {
                case 1:
                    return x2m.a.MYNUMBER_CARD_LOCKED;
                case 2:
                    return x2m.a.MISMATCHED_MYNUMBER_CARD;
                case 3:
                    return x2m.a.API_ERROR;
                case 4:
                    return x2m.a.IN_MAINTENANCE;
                case 5:
                    return x2m.a.NETWORK_ERROR;
                case 6:
                    return x2m.a.AUTHENTICATION_FAILURE;
                case 7:
                    return x2m.a.NFC_NOT_AVAILABLE;
                case 8:
                    return x2m.a.INVALID_PARAMS;
                case 9:
                    return x2m.a.INVALID_PROJECT_ID;
                case 10:
                    return x2m.a.INVALID_PACKAGE_ID;
                case 11:
                    return x2m.a.INVALID_TBS_RAW_DATA;
                case 12:
                    return x2m.a.INVALID_TBS_DATA_TEMPLATE;
                case 13:
                    return x2m.a.INVALID_BASE_URL;
                case 14:
                    return x2m.a.CERTIFICATE_EXPIRED;
                case 15:
                    return x2m.a.SIGNATURE_INVALID;
                case 16:
                    return x2m.a.CERTIFICATE_INVALID;
                case 17:
                    return x2m.a.CERTIFICATE_REVOKED;
                case 18:
                    return x2m.a.UNKNOWN_ERROR;
                case 19:
                    return x2m.a.CAMERA_ERROR;
                case 20:
                    return x2m.a.CAMERA_NOT_AUTHORIZED;
                case 21:
                    return x2m.a.DRIVERS_LICENSE_LOCKED;
                case 22:
                    return x2m.a.NO_CERTIFICATE;
                case 23:
                    return x2m.a.NO_VIDEO_DEVICE;
                case 24:
                    return x2m.a.UNDER_16YEARS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Lx2m/d;", "toModel", "()Lx2m/d;", "Companion", "com/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/e", "COMPLETED", "ABORTED", "ERROR", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VerificationResultStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VerificationResultStatus[] $VALUES;

        @NotNull
        public static final e Companion;

        @i(name = "completed")
        public static final VerificationResultStatus COMPLETED = new VerificationResultStatus("COMPLETED", 0);

        @i(name = "aborted")
        public static final VerificationResultStatus ABORTED = new VerificationResultStatus("ABORTED", 1);

        @i(name = "error")
        public static final VerificationResultStatus ERROR = new VerificationResultStatus("ERROR", 2);

        private static final /* synthetic */ VerificationResultStatus[] $values() {
            return new VerificationResultStatus[]{COMPLETED, ABORTED, ERROR};
        }

        static {
            VerificationResultStatus[] verificationResultStatusArr$values = $values();
            $VALUES = verificationResultStatusArr$values;
            $ENTRIES = s.n(verificationResultStatusArr$values);
            Companion = new e();
        }

        private VerificationResultStatus(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static VerificationResultStatus valueOf(String str) {
            return (VerificationResultStatus) Enum.valueOf(VerificationResultStatus.class, str);
        }

        public static VerificationResultStatus[] values() {
            return (VerificationResultStatus[]) $VALUES.clone();
        }

        @NotNull
        public final x2m.d toModel() {
            int i = f.f107401a[ordinal()];
            if (i == 1) {
                return x2m.d.COMPLETED;
            }
            if (i == 2) {
                return x2m.d.ABORTED;
            }
            if (i == 3) {
                return x2m.d.ERROR;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public PostVerificationResultResponse(@i(name = "id") @NotNull String id10, @i(name = "status") @NotNull VerificationResultStatus status, @i(name = "process_results") @NotNull List<ProcessResult> processResults, @i(name = "reason") VerificationResultReason verificationResultReason) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(processResults, "processResults");
        this.f107395a = id10;
        this.f107396b = status;
        this.f107397c = processResults;
        this.d = verificationResultReason;
    }

    @NotNull
    public final PostVerificationResultResponse copy(@i(name = "id") @NotNull String id10, @i(name = "status") @NotNull VerificationResultStatus status, @i(name = "process_results") @NotNull List<ProcessResult> processResults, @i(name = "reason") VerificationResultReason reason) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(processResults, "processResults");
        return new PostVerificationResultResponse(id10, status, processResults, reason);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PostVerificationResultResponse)) {
            return false;
        }
        PostVerificationResultResponse postVerificationResultResponse = (PostVerificationResultResponse) obj2;
        return Intrinsics.f(this.f107395a, postVerificationResultResponse.f107395a) && this.f107396b == postVerificationResultResponse.f107396b && Intrinsics.f(this.f107397c, postVerificationResultResponse.f107397c) && this.d == postVerificationResultResponse.d;
    }

    public final int hashCode() {
        int iA = e0.a((this.f107396b.hashCode() + (this.f107395a.hashCode() * 31)) * 31, this.f107397c);
        VerificationResultReason verificationResultReason = this.d;
        return iA + (verificationResultReason == null ? 0 : verificationResultReason.hashCode());
    }

    public final String toString() {
        return "PostVerificationResultResponse(id=" + this.f107395a + ", status=" + this.f107396b + ", processResults=" + this.f107397c + ", reason=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ PostVerificationResultResponse(String str, VerificationResultStatus verificationResultStatus, List list, VerificationResultReason verificationResultReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, verificationResultStatus, list, (i & 8) != 0 ? null : verificationResultReason);
    }
}
