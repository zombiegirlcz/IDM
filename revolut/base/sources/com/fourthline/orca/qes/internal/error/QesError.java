package com.fourthline.orca.qes.internal.error;

import com.fourthline.orca.internal.kh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\t\n\u000b\f\r\u000e\u000f\u0010\u0011B)\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError;", "Lcom/fourthline/orca/internal/kh0;", "", "message", "", "cause", "alias", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "Canceled", "KycRequired", "Rejected", "InvalidSignature", "TooManyAuthorizationAttempts", "TooManyResendOtpAttempts", "OperationNotAllowed", "QtspInvalidSession", "Unexpected", "Lcom/fourthline/orca/qes/internal/error/QesError$Canceled;", "Lcom/fourthline/orca/qes/internal/error/QesError$InvalidSignature;", "Lcom/fourthline/orca/qes/internal/error/QesError$KycRequired;", "Lcom/fourthline/orca/qes/internal/error/QesError$OperationNotAllowed;", "Lcom/fourthline/orca/qes/internal/error/QesError$QtspInvalidSession;", "Lcom/fourthline/orca/qes/internal/error/QesError$Rejected;", "Lcom/fourthline/orca/qes/internal/error/QesError$TooManyAuthorizationAttempts;", "Lcom/fourthline/orca/qes/internal/error/QesError$TooManyResendOtpAttempts;", "Lcom/fourthline/orca/qes/internal/error/QesError$Unexpected;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class QesError extends kh0 {
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$Canceled;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Canceled extends QesError {

        @NotNull
        public static final Canceled INSTANCE = new Canceled();
        public static final int $stable = 8;

        private Canceled() {
            super(null, null, "canceled", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Canceled);
        }

        public int hashCode() {
            return 930833104;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Canceled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$InvalidSignature;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvalidSignature extends QesError {

        @NotNull
        public static final InvalidSignature INSTANCE = new InvalidSignature();
        public static final int $stable = 8;

        private InvalidSignature() {
            super(null, null, "invalid_signature", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof InvalidSignature);
        }

        public int hashCode() {
            return -1851538504;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "InvalidSignature";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$KycRequired;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class KycRequired extends QesError {

        @NotNull
        public static final KycRequired INSTANCE = new KycRequired();
        public static final int $stable = 8;

        private KycRequired() {
            super(null, null, "kyc_required", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof KycRequired);
        }

        public int hashCode() {
            return -769585699;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "KycRequired";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$OperationNotAllowed;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "statusCode", "", "<init>", "(I)V", "getStatusCode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OperationNotAllowed extends QesError {
        public static final int $stable = 8;
        private final int statusCode;

        public OperationNotAllowed(int i) {
            super(null, null, "error", 3, null);
            this.statusCode = i;
        }

        public static /* synthetic */ OperationNotAllowed copy$default(OperationNotAllowed operationNotAllowed, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = operationNotAllowed.statusCode;
            }
            return operationNotAllowed.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        @NotNull
        public final OperationNotAllowed copy(int statusCode) {
            return new OperationNotAllowed(statusCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OperationNotAllowed) && this.statusCode == ((OperationNotAllowed) other).statusCode;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.statusCode);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "OperationNotAllowed(statusCode=" + this.statusCode + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$QtspInvalidSession;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "reason", "", "statusCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getReason", "()Ljava/lang/String;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/fourthline/orca/qes/internal/error/QesError$QtspInvalidSession;", "equals", "", "other", "", "hashCode", "toString", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QtspInvalidSession extends QesError {
        public static final int $stable = 8;
        private final String reason;
        private final Integer statusCode;

        /* JADX WARN: Multi-variable type inference failed */
        public QtspInvalidSession() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ QtspInvalidSession copy$default(QtspInvalidSession qtspInvalidSession, String str, Integer num, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = qtspInvalidSession.reason;
            }
            if ((i & 2) != 0) {
                num = qtspInvalidSession.statusCode;
            }
            return qtspInvalidSession.copy(str, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        @NotNull
        public final QtspInvalidSession copy(String reason, Integer statusCode) {
            return new QtspInvalidSession(reason, statusCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QtspInvalidSession)) {
                return false;
            }
            QtspInvalidSession qtspInvalidSession = (QtspInvalidSession) other;
            return Intrinsics.f(this.reason, qtspInvalidSession.reason) && Intrinsics.f(this.statusCode, qtspInvalidSession.statusCode);
        }

        public final String getReason() {
            return this.reason;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            String str = this.reason;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.statusCode;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "QtspInvalidSession(reason=" + this.reason + ", statusCode=" + this.statusCode + ")";
        }

        public QtspInvalidSession(String str, Integer num) {
            super(str, null, "qtsp_invalid_session", 2, null);
            this.reason = str;
            this.statusCode = num;
        }

        public /* synthetic */ QtspInvalidSession(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$Rejected;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rejected extends QesError {

        @NotNull
        public static final Rejected INSTANCE = new Rejected();
        public static final int $stable = 8;

        private Rejected() {
            super(null, null, "rejected", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Rejected);
        }

        public int hashCode() {
            return 445510325;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Rejected";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$TooManyAuthorizationAttempts;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TooManyAuthorizationAttempts extends QesError {

        @NotNull
        public static final TooManyAuthorizationAttempts INSTANCE = new TooManyAuthorizationAttempts();
        public static final int $stable = 8;

        private TooManyAuthorizationAttempts() {
            super(null, null, "too_many_authorization_attempts", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TooManyAuthorizationAttempts);
        }

        public int hashCode() {
            return 843591555;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "TooManyAuthorizationAttempts";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$TooManyResendOtpAttempts;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TooManyResendOtpAttempts extends QesError {

        @NotNull
        public static final TooManyResendOtpAttempts INSTANCE = new TooManyResendOtpAttempts();
        public static final int $stable = 8;

        private TooManyResendOtpAttempts() {
            super(null, null, "too_many_resend_otp_attempts", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TooManyResendOtpAttempts);
        }

        public int hashCode() {
            return -147007750;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "TooManyResendOtpAttempts";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$Unexpected;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unexpected extends QesError {
        private final Throwable cause;

        @NotNull
        private final String message;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesError$Unexpected$Companion;", "", "<init>", "()V", "create", "Lcom/fourthline/orca/qes/internal/error/QesError$Unexpected;", "description", "", "cause", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Unexpected create$default(Companion companion, String str, Throwable th10, int i, Object obj2) {
                if ((i & 2) != 0) {
                    th10 = null;
                }
                return companion.create(str, th10);
            }

            @NotNull
            public final Unexpected create(@NotNull String description, Throwable cause) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new Unexpected(description, cause, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Unexpected(String str, Throwable th10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th10);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        private Unexpected(String str, Throwable th10) {
            super(str, th10, "unexpected", null);
            this.message = str;
            this.cause = th10;
        }

        public /* synthetic */ Unexpected(String str, Throwable th10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th10);
        }
    }

    public /* synthetic */ QesError(String str, Throwable th10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10, str2);
    }

    private QesError(String str, Throwable th10, String str2) {
        super(str, th10, str2);
    }

    public /* synthetic */ QesError(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, str2, null);
    }
}
