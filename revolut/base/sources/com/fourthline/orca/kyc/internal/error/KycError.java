package com.fourthline.orca.kyc.internal.error;

import com.fourthline.orca.internal.kh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\t\n\u000b\f\r\u000e\u000f\u0010B)\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/fourthline/orca/kyc/internal/error/KycError;", "Lcom/fourthline/orca/internal/kh0;", "", "message", "", "cause", "alias", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "Canceled", "PersonNotAdult", "NationalityNotSupported", "IssuingCountryNotSupported", "DocumentExpired", "DocumentTypeNotSupported", "DocumentTypeInvalid", "Unexpected", "Lcom/fourthline/orca/kyc/internal/error/KycError$Canceled;", "Lcom/fourthline/orca/kyc/internal/error/KycError$DocumentExpired;", "Lcom/fourthline/orca/kyc/internal/error/KycError$DocumentTypeInvalid;", "Lcom/fourthline/orca/kyc/internal/error/KycError$DocumentTypeNotSupported;", "Lcom/fourthline/orca/kyc/internal/error/KycError$IssuingCountryNotSupported;", "Lcom/fourthline/orca/kyc/internal/error/KycError$NationalityNotSupported;", "Lcom/fourthline/orca/kyc/internal/error/KycError$PersonNotAdult;", "Lcom/fourthline/orca/kyc/internal/error/KycError$Unexpected;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KycError extends kh0 {
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/kyc/internal/error/KycError$Canceled;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Canceled extends KycError {

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
            return -760854768;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Canceled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/kyc/internal/error/KycError$DocumentExpired;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentExpired extends KycError {

        @NotNull
        public static final DocumentExpired INSTANCE = new DocumentExpired();
        public static final int $stable = 8;

        private DocumentExpired() {
            super(null, null, "document_expired", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DocumentExpired);
        }

        public int hashCode() {
            return -1178279117;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "DocumentExpired";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/kyc/internal/error/KycError$DocumentTypeInvalid;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentTypeInvalid extends KycError {

        @NotNull
        public static final DocumentTypeInvalid INSTANCE = new DocumentTypeInvalid();
        public static final int $stable = 8;

        private DocumentTypeInvalid() {
            super(null, null, "document_type_invalid", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DocumentTypeInvalid);
        }

        public int hashCode() {
            return 1597819499;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "DocumentTypeInvalid";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/kyc/internal/error/KycError$DocumentTypeNotSupported;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentTypeNotSupported extends KycError {

        @NotNull
        public static final DocumentTypeNotSupported INSTANCE = new DocumentTypeNotSupported();
        public static final int $stable = 8;

        private DocumentTypeNotSupported() {
            super(null, null, "document_type_not_supported", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DocumentTypeNotSupported);
        }

        public int hashCode() {
            return 450238247;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "DocumentTypeNotSupported";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/kyc/internal/error/KycError$IssuingCountryNotSupported;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IssuingCountryNotSupported extends KycError {

        @NotNull
        public static final IssuingCountryNotSupported INSTANCE = new IssuingCountryNotSupported();
        public static final int $stable = 8;

        private IssuingCountryNotSupported() {
            super(null, null, "issuing_country_not_supported", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof IssuingCountryNotSupported);
        }

        public int hashCode() {
            return -419140270;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "IssuingCountryNotSupported";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/kyc/internal/error/KycError$NationalityNotSupported;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NationalityNotSupported extends KycError {

        @NotNull
        public static final NationalityNotSupported INSTANCE = new NationalityNotSupported();
        public static final int $stable = 8;

        private NationalityNotSupported() {
            super(null, null, "nationality_not_supported", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NationalityNotSupported);
        }

        public int hashCode() {
            return -1648935008;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "NationalityNotSupported";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/kyc/internal/error/KycError$PersonNotAdult;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonNotAdult extends KycError {

        @NotNull
        public static final PersonNotAdult INSTANCE = new PersonNotAdult();
        public static final int $stable = 8;

        private PersonNotAdult() {
            super(null, null, "person_not_adult", 3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PersonNotAdult);
        }

        public int hashCode() {
            return -199230893;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "PersonNotAdult";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/fourthline/orca/kyc/internal/error/KycError$Unexpected;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unexpected extends KycError {
        private final Throwable cause;

        @NotNull
        private final String message;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/fourthline/orca/kyc/internal/error/KycError$Unexpected$Companion;", "", "<init>", "()V", "create", "Lcom/fourthline/orca/kyc/internal/error/KycError$Unexpected;", "description", "", "cause", "", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public /* synthetic */ KycError(String str, Throwable th10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10, str2);
    }

    private KycError(String str, Throwable th10, String str2) {
        super(str, th10, str2);
    }

    public /* synthetic */ KycError(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, str2, null);
    }
}
