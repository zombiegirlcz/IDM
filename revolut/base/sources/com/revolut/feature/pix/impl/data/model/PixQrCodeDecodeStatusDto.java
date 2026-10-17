package com.revolut.feature.pix.impl.data.model;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/data/model/PixQrCodeDecodeStatusDto;", "Landroid/os/Parcelable;", "", "CREATED", "COMPLETED", "FAILED", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeDecodeStatusDto implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PixQrCodeDecodeStatusDto[] $VALUES;
    public static final PixQrCodeDecodeStatusDto COMPLETED;
    public static final PixQrCodeDecodeStatusDto CREATED;

    @NotNull
    public static final Parcelable.Creator<PixQrCodeDecodeStatusDto> CREATOR;
    public static final PixQrCodeDecodeStatusDto FAILED;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PixQrCodeDecodeStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeDecodeStatusDto[i];
        }
    }

    static {
        PixQrCodeDecodeStatusDto pixQrCodeDecodeStatusDto = new PixQrCodeDecodeStatusDto("CREATED", 0);
        CREATED = pixQrCodeDecodeStatusDto;
        PixQrCodeDecodeStatusDto pixQrCodeDecodeStatusDto2 = new PixQrCodeDecodeStatusDto("COMPLETED", 1);
        COMPLETED = pixQrCodeDecodeStatusDto2;
        PixQrCodeDecodeStatusDto pixQrCodeDecodeStatusDto3 = new PixQrCodeDecodeStatusDto("FAILED", 2);
        FAILED = pixQrCodeDecodeStatusDto3;
        PixQrCodeDecodeStatusDto[] pixQrCodeDecodeStatusDtoArr = {pixQrCodeDecodeStatusDto, pixQrCodeDecodeStatusDto2, pixQrCodeDecodeStatusDto3};
        $VALUES = pixQrCodeDecodeStatusDtoArr;
        $ENTRIES = s.n(pixQrCodeDecodeStatusDtoArr);
        CREATOR = new a();
    }

    public static PixQrCodeDecodeStatusDto valueOf(String str) {
        return (PixQrCodeDecodeStatusDto) Enum.valueOf(PixQrCodeDecodeStatusDto.class, str);
    }

    public static PixQrCodeDecodeStatusDto[] values() {
        return (PixQrCodeDecodeStatusDto[]) $VALUES.clone();
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
