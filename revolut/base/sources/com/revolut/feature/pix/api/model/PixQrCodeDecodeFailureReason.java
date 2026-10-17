package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeDecodeFailureReason;", "Landroid/os/Parcelable;", "", "MALFORMED", "NO_LONGER_PAYABLE", "PAYMENT_ALREADY_COMPLETED", "CREDITOR_NOT_FOUND", "INTERNAL_ERROR", "UNSUPPORTED_IMPLEMENTATION", "UNSUPPORTED_FUNCTIONALITY", "REMOVED_BY_CREDITOR", "REMOVED_BY_CREDITOR_AGENT", "PAYER_RATE_LIMITED", "CREDITOR_AGENT_NOT_REACHABLE", "FRAUD_RISK", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeDecodeFailureReason implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PixQrCodeDecodeFailureReason[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PixQrCodeDecodeFailureReason> CREATOR;
    public static final PixQrCodeDecodeFailureReason CREDITOR_AGENT_NOT_REACHABLE;
    public static final PixQrCodeDecodeFailureReason CREDITOR_NOT_FOUND;
    public static final PixQrCodeDecodeFailureReason FRAUD_RISK;
    public static final PixQrCodeDecodeFailureReason INTERNAL_ERROR;
    public static final PixQrCodeDecodeFailureReason MALFORMED;
    public static final PixQrCodeDecodeFailureReason NO_LONGER_PAYABLE;
    public static final PixQrCodeDecodeFailureReason PAYER_RATE_LIMITED;
    public static final PixQrCodeDecodeFailureReason PAYMENT_ALREADY_COMPLETED;
    public static final PixQrCodeDecodeFailureReason REMOVED_BY_CREDITOR;
    public static final PixQrCodeDecodeFailureReason REMOVED_BY_CREDITOR_AGENT;
    public static final PixQrCodeDecodeFailureReason UNSUPPORTED_FUNCTIONALITY;
    public static final PixQrCodeDecodeFailureReason UNSUPPORTED_IMPLEMENTATION;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PixQrCodeDecodeFailureReason.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeDecodeFailureReason[i];
        }
    }

    static {
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason = new PixQrCodeDecodeFailureReason("MALFORMED", 0);
        MALFORMED = pixQrCodeDecodeFailureReason;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason2 = new PixQrCodeDecodeFailureReason("NO_LONGER_PAYABLE", 1);
        NO_LONGER_PAYABLE = pixQrCodeDecodeFailureReason2;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason3 = new PixQrCodeDecodeFailureReason("PAYMENT_ALREADY_COMPLETED", 2);
        PAYMENT_ALREADY_COMPLETED = pixQrCodeDecodeFailureReason3;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason4 = new PixQrCodeDecodeFailureReason("CREDITOR_NOT_FOUND", 3);
        CREDITOR_NOT_FOUND = pixQrCodeDecodeFailureReason4;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason5 = new PixQrCodeDecodeFailureReason("INTERNAL_ERROR", 4);
        INTERNAL_ERROR = pixQrCodeDecodeFailureReason5;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason6 = new PixQrCodeDecodeFailureReason("UNSUPPORTED_IMPLEMENTATION", 5);
        UNSUPPORTED_IMPLEMENTATION = pixQrCodeDecodeFailureReason6;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason7 = new PixQrCodeDecodeFailureReason("UNSUPPORTED_FUNCTIONALITY", 6);
        UNSUPPORTED_FUNCTIONALITY = pixQrCodeDecodeFailureReason7;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason8 = new PixQrCodeDecodeFailureReason("REMOVED_BY_CREDITOR", 7);
        REMOVED_BY_CREDITOR = pixQrCodeDecodeFailureReason8;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason9 = new PixQrCodeDecodeFailureReason("REMOVED_BY_CREDITOR_AGENT", 8);
        REMOVED_BY_CREDITOR_AGENT = pixQrCodeDecodeFailureReason9;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason10 = new PixQrCodeDecodeFailureReason("PAYER_RATE_LIMITED", 9);
        PAYER_RATE_LIMITED = pixQrCodeDecodeFailureReason10;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason11 = new PixQrCodeDecodeFailureReason("CREDITOR_AGENT_NOT_REACHABLE", 10);
        CREDITOR_AGENT_NOT_REACHABLE = pixQrCodeDecodeFailureReason11;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason12 = new PixQrCodeDecodeFailureReason("FRAUD_RISK", 11);
        FRAUD_RISK = pixQrCodeDecodeFailureReason12;
        PixQrCodeDecodeFailureReason[] pixQrCodeDecodeFailureReasonArr = {pixQrCodeDecodeFailureReason, pixQrCodeDecodeFailureReason2, pixQrCodeDecodeFailureReason3, pixQrCodeDecodeFailureReason4, pixQrCodeDecodeFailureReason5, pixQrCodeDecodeFailureReason6, pixQrCodeDecodeFailureReason7, pixQrCodeDecodeFailureReason8, pixQrCodeDecodeFailureReason9, pixQrCodeDecodeFailureReason10, pixQrCodeDecodeFailureReason11, pixQrCodeDecodeFailureReason12};
        $VALUES = pixQrCodeDecodeFailureReasonArr;
        $ENTRIES = s.n(pixQrCodeDecodeFailureReasonArr);
        CREATOR = new a();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static PixQrCodeDecodeFailureReason valueOf(String str) {
        return (PixQrCodeDecodeFailureReason) Enum.valueOf(PixQrCodeDecodeFailureReason.class, str);
    }

    public static PixQrCodeDecodeFailureReason[] values() {
        return (PixQrCodeDecodeFailureReason[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
