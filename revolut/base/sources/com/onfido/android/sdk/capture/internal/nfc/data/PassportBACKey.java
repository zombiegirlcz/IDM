package com.onfido.android.sdk.capture.internal.nfc.data;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.BACKey;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\r\u0010\u0014\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;", "Ljava/io/Serializable;", "number", "", "dateOfBirth", "expireDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getBACKey", "Lorg/jmrtd/BACKey;", "getBACKey$onfido_capture_sdk_core_release", "hashCode", "", "isValid", "isValid$onfido_capture_sdk_core_release", "toString", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PassportBACKey implements Serializable {
    private static final int VALID_DATE_LENGTH = 6;

    @NotNull
    private final String dateOfBirth;

    @NotNull
    private final String expireDate;

    @NotNull
    private final String number;

    public PassportBACKey(@NotNull String number, @NotNull String dateOfBirth, @NotNull String expireDate) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        this.number = number;
        this.dateOfBirth = dateOfBirth;
        this.expireDate = expireDate;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getExpireDate() {
        return this.expireDate;
    }

    public static /* synthetic */ PassportBACKey copy$default(PassportBACKey passportBACKey, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = passportBACKey.number;
        }
        if ((i & 2) != 0) {
            str2 = passportBACKey.dateOfBirth;
        }
        if ((i & 4) != 0) {
            str3 = passportBACKey.expireDate;
        }
        return passportBACKey.copy(str, str2, str3);
    }

    @NotNull
    public final PassportBACKey copy(@NotNull String number, @NotNull String dateOfBirth, @NotNull String expireDate) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        return new PassportBACKey(number, dateOfBirth, expireDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportBACKey)) {
            return false;
        }
        PassportBACKey passportBACKey = (PassportBACKey) other;
        return Intrinsics.f(this.number, passportBACKey.number) && Intrinsics.f(this.dateOfBirth, passportBACKey.dateOfBirth) && Intrinsics.f(this.expireDate, passportBACKey.expireDate);
    }

    @NotNull
    public final BACKey getBACKey$onfido_capture_sdk_core_release() {
        return new BACKey(this.number, this.dateOfBirth, this.expireDate);
    }

    public int hashCode() {
        return this.expireDate.hashCode() + a.c(this.number.hashCode() * 31, 31, this.dateOfBirth);
    }

    public final boolean isValid$onfido_capture_sdk_core_release() {
        return !d0.W(this.number) && this.dateOfBirth.length() == 6 && this.expireDate.length() == 6;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("PassportBACKey(number=");
        sb6.append(this.number);
        sb6.append(", dateOfBirth=");
        sb6.append(this.dateOfBirth);
        sb6.append(", expireDate=");
        return j6.a.u(sb6, this.expireDate, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
