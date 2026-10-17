package com.revolut.feature.alipay_plus.mpm.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "message", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()Ljava/lang/String;", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMError extends Exception {

    @NotNull
    private final String code;

    @NotNull
    public static final String USER_CANCEL = "USER_CANCEL";

    @NotNull
    public static final String INVALID_NETWORK = "INVALID_NETWORK";

    @NotNull
    public static final String SYSTEM_ERROR = "SYSTEM_ERROR";

    @NotNull
    public static final String PARAM_ILLEGAL = "PARAM_ILLEGAL";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError$Companion;", "", "<init>", "()V", "PARAM_ILLEGAL", "", "SYSTEM_ERROR", "USER_CANCEL", "INVALID_NETWORK", "invalidInput", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;", "message", "system", "cause", "", "userCancel", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ APMPMError system$default(Companion companion, String str, Throwable th10, int i, Object obj2) {
            if ((i & 2) != 0) {
                th10 = null;
            }
            return companion.system(str, th10);
        }

        public static /* synthetic */ APMPMError userCancel$default(Companion companion, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = "User cancelled";
            }
            return companion.userCancel(str);
        }

        @NotNull
        public final APMPMError invalidInput(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new APMPMError("PARAM_ILLEGAL", message, null, 4, null);
        }

        @NotNull
        public final APMPMError system(@NotNull String message, Throwable cause) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new APMPMError("SYSTEM_ERROR", message, cause);
        }

        @NotNull
        public final APMPMError userCancel(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new APMPMError("USER_CANCEL", message, null, 4, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APMPMError(@NotNull String code, @NotNull String message, Throwable th10) {
        super(message, th10);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = code;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public /* synthetic */ APMPMError(String str, String str2, Throwable th10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : th10);
    }
}
