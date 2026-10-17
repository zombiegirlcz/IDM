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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeDecodeStatus;", "Landroid/os/Parcelable;", "", "CREATED", "COMPLETED", "FAILED", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeDecodeStatus implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PixQrCodeDecodeStatus[] $VALUES;
    public static final PixQrCodeDecodeStatus COMPLETED;
    public static final PixQrCodeDecodeStatus CREATED;

    @NotNull
    public static final Parcelable.Creator<PixQrCodeDecodeStatus> CREATOR;
    public static final PixQrCodeDecodeStatus FAILED;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PixQrCodeDecodeStatus.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeDecodeStatus[i];
        }
    }

    static {
        PixQrCodeDecodeStatus pixQrCodeDecodeStatus = new PixQrCodeDecodeStatus("CREATED", 0);
        CREATED = pixQrCodeDecodeStatus;
        PixQrCodeDecodeStatus pixQrCodeDecodeStatus2 = new PixQrCodeDecodeStatus("COMPLETED", 1);
        COMPLETED = pixQrCodeDecodeStatus2;
        PixQrCodeDecodeStatus pixQrCodeDecodeStatus3 = new PixQrCodeDecodeStatus("FAILED", 2);
        FAILED = pixQrCodeDecodeStatus3;
        PixQrCodeDecodeStatus[] pixQrCodeDecodeStatusArr = {pixQrCodeDecodeStatus, pixQrCodeDecodeStatus2, pixQrCodeDecodeStatus3};
        $VALUES = pixQrCodeDecodeStatusArr;
        $ENTRIES = s.n(pixQrCodeDecodeStatusArr);
        CREATOR = new a();
    }

    public static PixQrCodeDecodeStatus valueOf(String str) {
        return (PixQrCodeDecodeStatus) Enum.valueOf(PixQrCodeDecodeStatus.class, str);
    }

    public static PixQrCodeDecodeStatus[] values() {
        return (PixQrCodeDecodeStatus[]) $VALUES.clone();
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
